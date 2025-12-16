package com.avito.android.profile_settings_extended;

import androidx.view.N0;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsMviViewModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "Lyc0/k;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/a;", "Lyc0/m;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class L extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.arch.mvi.c<yc0.k, ExtendedProfileSettingsInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a, yc0.m>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.profile_settings_extended.mvi.z f229063l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J f229064m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(com.avito.android.profile_settings_extended.mvi.z zVar, J j12) {
        super(0);
        this.f229063l = zVar;
        this.f229064m = j12;
    }

    @Override // Y41.a
    public final com.avito.android.arch.mvi.c<yc0.k, ExtendedProfileSettingsInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a, yc0.m> invoke() {
        return this.f229063l.a(null, N0.a(this.f229064m));
    }
}
