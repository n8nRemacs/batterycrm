package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: DrmUtil.java */
@J
/* loaded from: classes.dex */
public final class i {

    /* compiled from: DrmUtil.java */
    @X
    public static final class a {
        @InterfaceC42164u
        public static boolean a(@P Throwable th2) {
            return th2 instanceof DeniedByServerException;
        }

        @InterfaceC42164u
        public static boolean b(@P Throwable th2) {
            return th2 instanceof NotProvisionedException;
        }
    }

    /* compiled from: DrmUtil.java */
    @X
    public static final class b {
        @InterfaceC42164u
        public static boolean a(@P Throwable th2) {
            return th2 instanceof MediaDrm.MediaDrmStateException;
        }

        @InterfaceC42164u
        public static int b(Throwable th2) {
            return M.q(M.r(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
    }

    /* compiled from: DrmUtil.java */
    @X
    public static final class c {
        @InterfaceC42164u
        public static boolean a(@P Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    /* compiled from: DrmUtil.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }
}
