package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: DecoderReuseEvaluation.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23139h {

    /* renamed from: a, reason: collision with root package name */
    public final String f49170a;

    /* renamed from: b, reason: collision with root package name */
    public final C23108t f49171b;

    /* renamed from: c, reason: collision with root package name */
    public final C23108t f49172c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49173d;

    /* renamed from: e, reason: collision with root package name */
    public final int f49174e;

    /* compiled from: DecoderReuseEvaluation.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.exoplayer.h$a */
    public @interface a {
    }

    /* compiled from: DecoderReuseEvaluation.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.exoplayer.h$b */
    public @interface b {
    }

    public C23139h(String str, C23108t c23108t, C23108t c23108t2, int i12, int i13) {
        C23110a.b(i12 == 0 || i13 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f49170a = str;
        c23108t.getClass();
        this.f49171b = c23108t;
        c23108t2.getClass();
        this.f49172c = c23108t2;
        this.f49173d = i12;
        this.f49174e = i13;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23139h.class != obj.getClass()) {
            return false;
        }
        C23139h c23139h = (C23139h) obj;
        return this.f49173d == c23139h.f49173d && this.f49174e == c23139h.f49174e && this.f49170a.equals(c23139h.f49170a) && this.f49171b.equals(c23139h.f49171b) && this.f49172c.equals(c23139h.f49172c);
    }

    public final int hashCode() {
        return this.f49172c.hashCode() + ((this.f49171b.hashCode() + androidx.compose.foundation.H.d((((527 + this.f49173d) * 31) + this.f49174e) * 31, 31, this.f49170a)) * 31);
    }
}
