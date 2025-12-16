package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.C23108t;
import androidx.media3.common.Q;
import androidx.media3.common.util.J;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: TrackSelection.java */
@J
/* loaded from: classes.dex */
public interface o {

    /* compiled from: TrackSelection.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    int b(int i12);

    C23108t d(int i12);

    int h(int i12);

    Q i();

    int length();
}
