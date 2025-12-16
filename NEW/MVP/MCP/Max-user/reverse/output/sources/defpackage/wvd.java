package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wvd extends o0 {
    public final /* synthetic */ int a;
    public final AtomicReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wvd(x74 x74Var, AtomicReference atomicReference, int i) {
        super(x74Var, false, true);
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.o0
    public final void onCancelled(Throwable th, boolean z) {
        switch (this.a) {
            case 0:
                try {
                    if (((jk3) this.b).a(th)) {
                    }
                } catch (Throwable th2) {
                    saj.a(th, th2);
                }
                o8j.a(getContext(), th);
                break;
            case 1:
                try {
                    if (((rr8) this.b).d(th)) {
                    }
                } catch (Throwable th3) {
                    saj.a(th, th3);
                }
                o8j.a(getContext(), th);
                break;
            default:
                try {
                    if (((i2f) this.b).d(th)) {
                    }
                } catch (Throwable th4) {
                    saj.a(th, th4);
                }
                o8j.a(getContext(), th);
                break;
        }
    }

    @Override // defpackage.o0
    public final void onCompleted(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    ((jk3) this.b).b();
                    break;
                } catch (Throwable th) {
                    o8j.a(getContext(), th);
                    return;
                }
            case 1:
                rr8 rr8Var = (rr8) this.b;
                try {
                    if (obj == null) {
                        rr8Var.b();
                    } else {
                        rr8Var.a(obj);
                    }
                    break;
                } catch (Throwable th2) {
                    o8j.a(getContext(), th2);
                    return;
                }
            default:
                try {
                    ((i2f) this.b).a(obj);
                    break;
                } catch (Throwable th3) {
                    o8j.a(getContext(), th3);
                    return;
                }
        }
    }
}
