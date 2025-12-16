package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class peh implements View.OnClickListener, py4 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final View b;
    public final vta c;

    public peh(View view, vta vtaVar) {
        this.b = view;
        this.c = vtaVar;
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.b.setOnClickListener(null);
            } else {
                de.a().b(new gq5(14, this));
            }
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.a.get();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.get()) {
            return;
        }
        this.c.f(qqg.a);
    }
}
