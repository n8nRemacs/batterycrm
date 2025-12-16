package defpackage;

/* loaded from: classes.dex */
public final class m9i extends u08 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9i(q0f q0fVar, int i) {
        super(1);
        this.a = i;
        this.b = q0fVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String strA = (String) obj;
                b0f signalingLogger = this.b.getSignalingLogger();
                if (signalingLogger.c.shouldHideSensitiveInformation()) {
                    strA = qaj.a(strA);
                }
                a9h.o("May be ERROR, socket is already with ", strA, signalingLogger.b, signalingLogger.a);
                break;
            default:
                q0f q0fVar = this.b;
                q0fVar.k.sendEmptyMessageDelayed(2, q0fVar.f);
                break;
        }
        return qqg.a;
    }
}
