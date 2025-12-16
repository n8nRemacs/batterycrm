package com.avito.android.work_profile.profile.work_profile_host.ui;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import rQ0.AbstractC47586a;
import rQ0.C47587b;

/* compiled from: WorkProfileHostRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/ui/e;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f331313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C47587b f331314e;

    public e(f fVar, C47587b c47587b) {
        this.f331313d = fVar;
        this.f331314e = c47587b;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        ((b) this.f331313d.f331315a).invoke(new AbstractC47586a.b(this.f331314e.f429810b.get(i12)));
    }
}
