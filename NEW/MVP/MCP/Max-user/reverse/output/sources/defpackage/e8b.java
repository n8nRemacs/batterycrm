package defpackage;

/* loaded from: classes2.dex */
public final class e8b extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ f8b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8b(f8b f8bVar, int i) {
        super(12, d8b.a);
        this.c = i;
        this.d = f8bVar;
        switch (i) {
            case 1:
                super(12, c8b.a);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    this.d.d();
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    this.d.c();
                    break;
                }
                break;
        }
    }
}
