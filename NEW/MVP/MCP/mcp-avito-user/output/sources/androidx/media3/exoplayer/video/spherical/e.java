package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.C23110a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Projection.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b f50329a;

    /* renamed from: b, reason: collision with root package name */
    public final b f50330b;

    /* compiled from: Projection.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: Projection.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c[] f50331a;

        public b(c... cVarArr) {
            this.f50331a = cVarArr;
        }
    }

    /* compiled from: Projection.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f50332a;

        public c(int i12, float[] fArr, float[] fArr2, int i13) {
            this.f50332a = i12;
            C23110a.b(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        }
    }

    public e(b bVar, b bVar2, int i12) {
        this.f50329a = bVar;
        this.f50330b = bVar2;
    }
}
