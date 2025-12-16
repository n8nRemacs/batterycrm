package com.avito.android.home.bottom_navigation;

import com.avito.android.bottom_navigation.InterfaceC28891m;
import com.avito.android.bottom_navigation.T;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomNavigationFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/T;", "tooltipData", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bottom_navigation/T;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.home.bottom_navigation.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30763e extends N implements Y41.l<T, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BottomNavigationFragment f162349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28891m f162350m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30763e(BottomNavigationFragment bottomNavigationFragment, InterfaceC28891m interfaceC28891m) {
        super(1);
        this.f162349l = bottomNavigationFragment;
        this.f162350m = interfaceC28891m;
    }

    @Override // Y41.l
    public final G0 invoke(T t12) {
        T t13 = t12;
        if (t13 != null) {
            BottomNavigationFragment bottomNavigationFragment = this.f162349l;
            PrintableText printableText = t13.f106987b;
            String strK0 = printableText != null ? printableText.k0(bottomNavigationFragment.requireContext()) : null;
            PrintableText printableText2 = t13.f106988c;
            String strK02 = printableText2 != null ? printableText2.k0(bottomNavigationFragment.requireContext()) : null;
            Integer num = t13.f106992g;
            this.f162350m.e(t13.f106986a, strK0, strK02, t13.f106989d, t13.f106990e, num != null ? num.intValue() : -2, t13.f106993h, t13.f106994i);
        }
        return G0.f406611a;
    }
}
