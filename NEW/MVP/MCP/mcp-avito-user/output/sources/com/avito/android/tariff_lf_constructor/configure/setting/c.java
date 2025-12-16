package com.avito.android.tariff_lf_constructor.configure.setting;

import Y41.l;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorSettingFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorSettingFragment f300040l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConstructorSettingFragment constructorSettingFragment) {
        super(1);
        this.f300040l = constructorSettingFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        ConstructorSettingFragment constructorSettingFragment = this.f300040l;
        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = constructorSettingFragment.f300036z0;
        if (lVar != null) {
            lVar.y(deepLink2);
        }
        ActivityC22955m activityC22955mL1 = constructorSettingFragment.l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
        return G0.f406611a;
    }
}
