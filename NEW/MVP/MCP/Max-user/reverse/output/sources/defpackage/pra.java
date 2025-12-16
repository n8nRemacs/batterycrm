package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class pra extends wl0 {
    public Object X;
    public boolean Y;

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.d) {
            return;
        }
        int i = this.o;
        vta vtaVar = this.a;
        if (i != 0) {
            vtaVar.f(obj);
            return;
        }
        try {
            if (this.Y) {
                boolean zEquals = Objects.equals(this.X, obj);
                this.X = obj;
                if (zEquals) {
                    return;
                }
            } else {
                this.Y = true;
                this.X = obj;
            }
            vtaVar.f(obj);
        } catch (Throwable th) {
            raj.c(th);
            this.b.dispose();
            onError(th);
        }
    }

    @Override // defpackage.o1f
    public final Object poll() {
        while (true) {
            Object objPoll = this.c.poll();
            if (objPoll == null) {
                return null;
            }
            if (!this.Y) {
                this.Y = true;
                this.X = objPoll;
                return objPoll;
            }
            if (!Objects.equals(this.X, objPoll)) {
                this.X = objPoll;
                return objPoll;
            }
            this.X = objPoll;
        }
    }
}
