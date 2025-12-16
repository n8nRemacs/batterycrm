package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.ActivityC22955m;
import androidx.media3.exoplayer.analytics.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.internal.t;
import j.N;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: com.google.android.play:review@@2.0.1 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes6.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final i f358607a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f358608b = new Handler(Looper.getMainLooper());

    public d(i iVar) {
        this.f358607a = iVar;
    }

    @N
    public final Task a(@N ActivityC22955m activityC22955m, @N ReviewInfo reviewInfo) {
        if (reviewInfo.d()) {
            return C37030m.f(null);
        }
        Intent intent = new Intent(activityC22955m, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.c());
        intent.putExtra("window_flags", activityC22955m.getWindow().getDecorView().getWindowSystemUiVisibility());
        C37028k c37028k = new C37028k();
        intent.putExtra("result_receiver", new zzc(this.f358608b, c37028k));
        activityC22955m.startActivity(intent);
        return c37028k.f355672a;
    }

    @N
    public final Task<ReviewInfo> b() {
        i iVar = this.f358607a;
        Object[] objArr = {iVar.f358617b};
        com.google.android.play.core.review.internal.i iVar2 = i.f358615c;
        iVar2.a("requestInAppReview (%s)", objArr);
        t tVar = iVar.f358616a;
        if (tVar != null) {
            C37028k c37028k = new C37028k();
            tVar.b(new f(iVar, c37028k, c37028k), c37028k);
            return c37028k.f355672a;
        }
        Object[] objArr2 = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            com.google.android.play.core.review.internal.i.b(iVar2.f358621a, "Play Store app is either not installed or not the official version", objArr2);
        }
        Locale locale = Locale.getDefault();
        HashMap map = NY0.b.f11590a;
        return C37030m.e(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : m.l((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) NY0.b.f11591b.get(-1), ")")), null, null)));
    }
}
