package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.C36560x;
import com.google.android.exoplayer2.util.C36585a;
import j.InterfaceC42154j;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes6.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: d, reason: collision with root package name */
    public final int f343384d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final String f343385e;

    /* renamed from: f, reason: collision with root package name */
    public final int f343386f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final I f343387g;

    /* renamed from: h, reason: collision with root package name */
    public final int f343388h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final C36560x f343389i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f343390j;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public ExoPlaybackException(int i12, Exception exc, int i13) {
        this(i12, exc, i13, null, -1, null, 4, false);
    }

    @InterfaceC42154j
    public final ExoPlaybackException b(@j.P C36560x c36560x) {
        String message = getMessage();
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return new ExoPlaybackException(message, getCause(), this.f343668b, this.f343384d, this.f343385e, this.f343386f, this.f343387g, this.f343388h, c36560x, this.f343669c, this.f343390j);
    }

    public ExoPlaybackException(String str, @j.P Throwable th2, int i12, int i13, @j.P String str2, int i14, @j.P I i15, int i16, @j.P C36560x c36560x, long j12, boolean z12) {
        super(str, th2, i12, j12);
        C36585a.b(!z12 || i13 == 1);
        C36585a.b(th2 != null || i13 == 3);
        this.f343384d = i13;
        this.f343385e = str2;
        this.f343386f = i14;
        this.f343387g = i15;
        this.f343388h = i16;
        this.f343389i = c36560x;
        this.f343390j = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i12, @j.P Throwable th2, int i13, @j.P String str, int i14, @j.P I i15, int i16, boolean z12) {
        String str2;
        if (i12 == 0) {
            str2 = "Source error";
        } else if (i12 == 1) {
            str2 = str + " error, index=" + i14 + ", format=" + i15 + ", format_supported=" + com.google.android.exoplayer2.util.U.t(i16);
        } else if (i12 != 3) {
            str2 = "Unexpected runtime error";
        } else {
            str2 = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? str2 : androidx.appcompat.app.r.q(str2, ": null"), th2, i13, i12, str, i14, i15, i16, null, SystemClock.elapsedRealtime(), z12);
    }
}
