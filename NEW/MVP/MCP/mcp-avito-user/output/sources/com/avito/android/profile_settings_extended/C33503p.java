package com.avito.android.profile_settings_extended;

import com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import kotlin.G0;
import kotlin.Metadata;
import yc0.InterfaceC50220d;

/* compiled from: ExtendedProfileSettingsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile_settings_extended.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33503p extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSettingsFragment f230775l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BasicInfoV2Item.Onboarding f230776m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33503p(ExtendedProfileSettingsFragment extendedProfileSettingsFragment, BasicInfoV2Item.Onboarding onboarding) {
        super(0);
        this.f230775l = extendedProfileSettingsFragment;
        this.f230776m = onboarding;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ExtendedProfileSettingsFragment.a aVar = ExtendedProfileSettingsFragment.f228997J0;
        this.f230775l.D5().accept(new InterfaceC50220d.h(this.f230776m.f229227b));
        return G0.f406611a;
    }
}
