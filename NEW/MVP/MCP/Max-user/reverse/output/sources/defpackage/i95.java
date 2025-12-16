package defpackage;

import android.media.metrics.EditingSession;

/* loaded from: classes.dex */
public final class i95 implements AutoCloseable {
    public EditingSession a;
    public boolean b;

    @Override // java.lang.AutoCloseable
    public final void close() {
        EditingSession editingSession = this.a;
        if (editingSession != null) {
            editingSession.close();
            this.a = null;
        }
    }
}
