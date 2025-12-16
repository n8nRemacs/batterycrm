package com.google.android.exoplayer2.decoder;

import android.text.TextUtils;
import androidx.compose.foundation.H;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.util.C36585a;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: DecoderReuseEvaluation.java */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f344237a;

    /* renamed from: b, reason: collision with root package name */
    public final I f344238b;

    /* renamed from: c, reason: collision with root package name */
    public final I f344239c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344240d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344241e;

    /* compiled from: DecoderReuseEvaluation.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: DecoderReuseEvaluation.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public h(String str, I i12, I i13, int i14, int i15) {
        C36585a.b(i14 == 0 || i15 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f344237a = str;
        i12.getClass();
        this.f344238b = i12;
        i13.getClass();
        this.f344239c = i13;
        this.f344240d = i14;
        this.f344241e = i15;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f344240d == hVar.f344240d && this.f344241e == hVar.f344241e && this.f344237a.equals(hVar.f344237a) && this.f344238b.equals(hVar.f344238b) && this.f344239c.equals(hVar.f344239c);
    }

    public final int hashCode() {
        return this.f344239c.hashCode() + ((this.f344238b.hashCode() + H.d((((527 + this.f344240d) * 31) + this.f344241e) * 31, 31, this.f344237a)) * 31);
    }
}
