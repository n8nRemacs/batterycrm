package com.avito.android.safedeal.universal_delivery_type;

import Un0.InterfaceC15540a;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeActivity;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/g;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UniversalDeliveryTypeActivity f256627d;

    public g(UniversalDeliveryTypeActivity universalDeliveryTypeActivity) {
        this.f256627d = universalDeliveryTypeActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        UniversalDeliveryTypeActivity.a aVar = UniversalDeliveryTypeActivity.f256401C;
        UniversalDeliveryTypeActivity universalDeliveryTypeActivity = this.f256627d;
        o oVarB2 = universalDeliveryTypeActivity.b2();
        b bVar = universalDeliveryTypeActivity.f256412u;
        if (bVar == null) {
            bVar = null;
        }
        oVarB2.accept(new InterfaceC15540a.d(i12, bVar.f256437m.get(i12)));
    }
}
