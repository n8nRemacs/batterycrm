package com.avito.android.soa_stat.profile_settings;

import androidx.view.x;
import kotlin.Metadata;

/* compiled from: SoaStatProfileSettingsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/e;", "Landroidx/activity/x;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SoaStatProfileSettingsActivity f284086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SoaStatProfileSettingsActivity soaStatProfileSettingsActivity) {
        super(true);
        this.f284086d = soaStatProfileSettingsActivity;
    }

    @Override // androidx.view.x
    public final void c() {
        SoaStatProfileSettingsActivity soaStatProfileSettingsActivity = this.f284086d;
        soaStatProfileSettingsActivity.setResult(-1);
        soaStatProfileSettingsActivity.finish();
    }
}
