package defpackage;

/* loaded from: classes2.dex */
public final class fdb extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gdb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdb(gdb gdbVar, int i) {
        super(12, rcb.a);
        this.c = i;
        this.d = gdbVar;
        switch (i) {
            case 1:
                super(12, ycb.a);
                break;
            case 2:
                super(12, bdb.a);
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
                    gdb gdbVar = this.d;
                    gdbVar.setLeft((ucb) obj2);
                    gdbVar.A();
                    break;
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    gdb gdbVar2 = this.d;
                    gdbVar2.setRight((adb) obj2);
                    gdbVar2.A();
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    gdb gdbVar3 = this.d;
                    gdbVar3.setStyle((bdb) obj2);
                    gdbVar3.A();
                    break;
                }
                break;
        }
    }
}
