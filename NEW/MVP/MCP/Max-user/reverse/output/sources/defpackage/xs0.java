package defpackage;

import one.me.sdk.bottomsheet.BottomSheetWidget;

/* loaded from: classes2.dex */
public final class xs0 implements g54 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public xs0(c54 c54Var, cm6 cm6Var) {
        this.b = c54Var.getInstanceId();
        this.c = cm6Var;
    }

    private final void c(c54 c54Var, c54 c54Var2, boolean z) {
    }

    @Override // defpackage.g54
    public final void a(c54 c54Var, c54 c54Var2, boolean z) {
        switch (this.a) {
            case 0:
                if (c54Var2 != null) {
                    ((ytd) this.b).L(this);
                    ((BottomSheetWidget) this.c).E0(true);
                    break;
                }
                break;
            default:
                if (fni.a(c54Var2 != null ? c54Var2.getInstanceId() : null, (String) this.b) && !z) {
                    ((cm6) this.c).invoke();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.g54
    public final void b(c54 c54Var, c54 c54Var2, boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (fni.a(c54Var2 != null ? c54Var2.getInstanceId() : null, (String) this.b) && !z) {
                    c54Var2.getRouter().L(this);
                    break;
                }
                break;
        }
    }

    public xs0(ytd ytdVar, BottomSheetWidget bottomSheetWidget) {
        this.b = ytdVar;
        this.c = bottomSheetWidget;
    }
}
