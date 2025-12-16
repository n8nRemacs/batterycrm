package defpackage;

/* loaded from: classes2.dex */
public final class odg extends pdg {
    public final /* synthetic */ int b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odg(long j, int i) {
        super(ndg.NO_CONNECTION_TIMEOUT);
        this.b = i;
        switch (i) {
            case 1:
                super(ndg.NO_DATA_TIMEOUT);
                this.c = j;
                break;
            case 2:
                super(ndg.SUCCESS_AUDIO);
                this.c = j;
                break;
            case 3:
                super(ndg.SUCCESS_CONNECTION);
                this.c = j;
                break;
            default:
                this.c = j;
                break;
        }
    }
}
