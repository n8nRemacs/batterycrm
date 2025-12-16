package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C23108t;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.C23110a;
import com.adjust.sdk.network.ErrorCodes;
import j.InterfaceC42154j;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: q, reason: collision with root package name */
    public static final String f48492q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f48493r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f48494s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f48495t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f48496u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f48497v;

    /* renamed from: j, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f48498j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.media3.common.util.J
    @j.P
    public final String f48499k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f48500l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.media3.common.util.J
    @j.P
    public final C23108t f48501m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f48502n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.media3.common.util.J
    @j.P
    public final androidx.media3.common.C f48503o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f48504p;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @androidx.media3.common.util.J
    public @interface a {
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f48492q = Integer.toString(1001, 36);
        f48493r = Integer.toString(1002, 36);
        f48494s = Integer.toString(ErrorCodes.MALFORMED_URL_EXCEPTION, 36);
        f48495t = Integer.toString(ErrorCodes.PROTOCOL_EXCEPTION, 36);
        f48496u = Integer.toString(1005, 36);
        f48497v = Integer.toString(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, 36);
    }

    public ExoPlaybackException(int i12, Exception exc, int i13) {
        this(i12, exc, i13, null, -1, null, 4, false);
    }

    @Override // androidx.media3.common.PlaybackException
    public final boolean a(@j.P PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        int i12 = androidx.media3.common.util.M.f47887a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.f48498j == exoPlaybackException.f48498j && androidx.media3.common.util.M.a(this.f48499k, exoPlaybackException.f48499k) && this.f48500l == exoPlaybackException.f48500l && androidx.media3.common.util.M.a(this.f48501m, exoPlaybackException.f48501m) && this.f48502n == exoPlaybackException.f48502n && androidx.media3.common.util.M.a(this.f48503o, exoPlaybackException.f48503o) && this.f48504p == exoPlaybackException.f48504p;
    }

    @InterfaceC42154j
    public final ExoPlaybackException b(@j.P androidx.media3.common.C c12) {
        String message = getMessage();
        int i12 = androidx.media3.common.util.M.f47887a;
        return new ExoPlaybackException(message, getCause(), this.f47432b, this.f48498j, this.f48499k, this.f48500l, this.f48501m, this.f48502n, c12, this.f47433c, this.f48504p);
    }

    @Override // androidx.media3.common.PlaybackException, androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundleK = super.k();
        bundleK.putInt(f48492q, this.f48498j);
        bundleK.putString(f48493r, this.f48499k);
        bundleK.putInt(f48494s, this.f48500l);
        C23108t c23108t = this.f48501m;
        if (c23108t != null) {
            bundleK.putBundle(f48495t, c23108t.j(false));
        }
        bundleK.putInt(f48496u, this.f48502n);
        bundleK.putBoolean(f48497v, this.f48504p);
        return bundleK;
    }

    public ExoPlaybackException(String str, @j.P Throwable th2, int i12, int i13, @j.P String str2, int i14, @j.P C23108t c23108t, int i15, @j.P androidx.media3.common.C c12, long j12, boolean z12) {
        super(str, th2, i12, j12);
        C23110a.b(!z12 || i13 == 1);
        C23110a.b(th2 != null || i13 == 3);
        this.f48498j = i13;
        this.f48499k = str2;
        this.f48500l = i14;
        this.f48501m = c23108t;
        this.f48502n = i15;
        this.f48503o = c12;
        this.f48504p = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i12, @j.P Throwable th2, int i13, @j.P String str, int i14, @j.P C23108t c23108t, int i15, boolean z12) {
        String str2;
        if (i12 == 0) {
            str2 = "Source error";
        } else if (i12 == 1) {
            str2 = str + " error, index=" + i14 + ", format=" + c23108t + ", format_supported=" + androidx.media3.common.util.M.s(i15);
        } else if (i12 != 3) {
            str2 = "Unexpected runtime error";
        } else {
            str2 = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? str2 : androidx.appcompat.app.r.q(str2, ": null"), th2, i13, i12, str, i14, c23108t, i15, null, SystemClock.elapsedRealtime(), z12);
    }
}
