package com.avito.android.home;

import com.google.android.play.core.appupdate.C37096c;
import com.google.android.play.core.appupdate.InterfaceC37095b;
import com.google.android.play.core.install.InstallState;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: AppUpdateListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/b;", "Lcom/google/android/play/core/install/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.home.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30758b implements com.google.android.play.core.install.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WeakReference<HomeActivity> f162239a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC37095b f162240b;

    public C30758b(@Y61.k HomeActivity homeActivity) {
        this.f162239a = new WeakReference<>(homeActivity);
        this.f162240b = C37096c.a(homeActivity.getApplicationContext());
    }

    @Override // MY0.a
    public final void a(InstallState installState) {
        InstallState installState2 = installState;
        if (installState2.c() != 11) {
            if (installState2.c() == 4) {
                this.f162240b.e(this);
            }
        } else {
            HomeActivity homeActivity = this.f162239a.get();
            if (homeActivity != null) {
                homeActivity.b2();
            }
        }
    }
}
