package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public interface qdh {
    void c(boolean z);

    default View getPreviewView() {
        return null;
    }

    default boolean k() {
        return false;
    }

    boolean n();

    void p(hdh hdhVar, m00 m00Var, long j, boolean z, boolean z2);

    void setVideoClickListener(sm6 sm6Var);

    void setVideoLongClickListener(sm6 sm6Var);

    boolean u();

    void w();
}
