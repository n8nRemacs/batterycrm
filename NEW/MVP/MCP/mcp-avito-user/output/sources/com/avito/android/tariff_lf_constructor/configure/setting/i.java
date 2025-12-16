package com.avito.android.tariff_lf_constructor.configure.setting;

import Y41.l;
import com.avito.android.tariff_lf_constructor.configure.setting.ConstructorSettingFragment;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorSettingFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements l<P2<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorSettingFragment f300085l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ConstructorSettingFragment constructorSettingFragment) {
        super(1);
        this.f300085l = constructorSettingFragment;
    }

    @Override // Y41.l
    public final G0 invoke(P2<?> p22) {
        P2<?> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        ConstructorSettingFragment constructorSettingFragment = this.f300085l;
        if (z12) {
            ConstructorSettingFragment.a aVar = ConstructorSettingFragment.f300022A0;
            constructorSettingFragment.q5().k(null);
        } else if (p23 instanceof P2.a) {
            ConstructorSettingFragment.a aVar2 = ConstructorSettingFragment.f300022A0;
            constructorSettingFragment.q5().a("");
        } else if (p23 instanceof P2.b) {
            ConstructorSettingFragment.a aVar3 = ConstructorSettingFragment.f300022A0;
            constructorSettingFragment.q5().j();
        }
        return G0.f406611a;
    }
}
