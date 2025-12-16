package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36850b4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36977u f355045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f355046c;

    public RunnableC36850b4(C36967s3 c36967s3, C36977u c36977u) {
        this.f355045b = c36977u;
        this.f355046c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36967s3 c36967s3 = this.f355046c;
        C36876f2 c36876f2B = c36967s3.b();
        c36876f2B.e();
        c36876f2B.e();
        C36977u c36977uB = C36977u.b(c36876f2B.m().getString("dma_consent_settings", null));
        C36977u c36977u = this.f355045b;
        int i12 = c36977uB.f355390a;
        zzif zzifVar = zzif.f355542c;
        int i13 = c36977u.f355390a;
        if (i13 > i12) {
            S1 s1Zzj = c36967s3.zzj();
            s1Zzj.f354895l.c("Lower precedence consent source ignored, proposed source", Integer.valueOf(i13));
        } else {
            SharedPreferences.Editor editorEdit = c36876f2B.m().edit();
            editorEdit.putString("dma_consent_settings", c36977u.f355391b);
            editorEdit.apply();
            c36967s3.f355183a.n().C(false);
        }
    }
}
