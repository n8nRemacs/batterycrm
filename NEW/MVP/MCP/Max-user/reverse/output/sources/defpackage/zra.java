package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zra extends wl0 {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zra(vta vtaVar, Object obj, int i) {
        super(vtaVar);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        switch (this.X) {
            case 0:
                int i = this.o;
                vta vtaVar = this.a;
                if (i != 0) {
                    vtaVar.f(null);
                    break;
                } else {
                    try {
                        if (((m7c) this.Y).test(obj)) {
                            vtaVar.f(obj);
                            break;
                        }
                    } catch (Throwable th) {
                        raj.c(th);
                        this.b.dispose();
                        onError(th);
                        return;
                    }
                }
                break;
            default:
                if (!this.d) {
                    int i2 = this.o;
                    vta vtaVar2 = this.a;
                    if (i2 != 0) {
                        vtaVar2.f(null);
                        break;
                    } else {
                        try {
                            Object objApply = ((tm6) this.Y).apply(obj);
                            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                            vtaVar2.f(objApply);
                            break;
                        } catch (Throwable th2) {
                            raj.c(th2);
                            this.b.dispose();
                            onError(th2);
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.o1f
    public final Object poll() {
        Object objPoll;
        switch (this.X) {
            case 0:
                break;
            default:
                Object objPoll2 = this.c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((tm6) this.Y).apply(objPoll2);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            objPoll = this.c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((m7c) this.Y).test(objPoll));
        return objPoll;
    }
}
