package com.avito.android.profile_settings_extended.adapter.basic_info_v2;

import Y41.l;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yc0.InterfaceC50220d;

/* compiled from: BasicInfoV2ItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetViewId", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BasicInfoV2Item f229255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f229256m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BasicInfoV2Item basicInfoV2Item, f fVar) {
        super(1);
        this.f229255l = basicInfoV2Item;
        this.f229256m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        BasicInfoV2Item.Onboarding onboarding;
        int iIntValue = num.intValue();
        BasicInfoV2Item.ServicesProfileType servicesProfileType = this.f229255l.f229217m;
        if (servicesProfileType != null && (onboarding = servicesProfileType.f229239c) != null) {
            this.f229256m.f229259b.invoke(new InterfaceC50220d.i(iIntValue, onboarding));
        }
        return G0.f406611a;
    }
}
