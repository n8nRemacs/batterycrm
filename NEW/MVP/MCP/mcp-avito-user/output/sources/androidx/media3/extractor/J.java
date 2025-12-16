package androidx.media3.extractor;

import androidx.media3.common.C23108t;
import androidx.media3.common.InterfaceC23102m;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: TrackOutput.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface J {

    /* compiled from: TrackOutput.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f50380a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f50381b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50382c;

        /* renamed from: d, reason: collision with root package name */
        public final int f50383d;

        public a(int i12, int i13, int i14, byte[] bArr) {
            this.f50380a = i12;
            this.f50381b = bArr;
            this.f50382c = i13;
            this.f50383d = i14;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f50380a == aVar.f50380a && this.f50382c == aVar.f50382c && this.f50383d == aVar.f50383d && Arrays.equals(this.f50381b, aVar.f50381b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f50381b) + (this.f50380a * 31)) * 31) + this.f50382c) * 31) + this.f50383d;
        }
    }

    /* compiled from: TrackOutput.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    default int a(InterfaceC23102m interfaceC23102m, int i12, boolean z12) {
        return c(interfaceC23102m, i12, z12);
    }

    void b(C23108t c23108t);

    int c(InterfaceC23102m interfaceC23102m, int i12, boolean z12);

    void d(int i12, androidx.media3.common.util.z zVar);

    default void e(int i12, androidx.media3.common.util.z zVar) {
        d(i12, zVar);
    }

    void f(long j12, int i12, int i13, int i14, @P a aVar);
}
