package upc.edu.etsetb.softarch.multigame.server;

public static GameFactory getInstance(String game)
		throws UnknownFactoryException {
		throw new UnsupportedOperationException("GameFactory::createInstance():the operation must be coded") ;
}

public abstract GameController createController() ;
public abstract Board createBoard() 
		throws BoardException ;
public abstract Piece createPiece(PieceSpec spec)
		throws PieceException ;
public abstract Player createPlayer(PlayerSpec spec)
		throws PlayerException ;
public abstract Token createToken(TokenSpec spec)
		throws TokenException ;
public abstract ThirdParty createThirdParty()
		throws ThirdPartyException ;	