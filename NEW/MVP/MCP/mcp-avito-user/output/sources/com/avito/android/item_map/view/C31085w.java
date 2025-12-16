package com.avito.android.item_map.view;

import com.avito.android.B2;
import com.avito.android.item_map.view.ItemMapState;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemMapPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.item_map.view.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31085w extends kotlin.jvm.internal.N implements Y41.l<BottomSheet.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f173638l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V f173639m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31085w(I i12, V v12) {
        super(1);
        this.f173638l = i12;
        this.f173639m = v12;
    }

    @Override // Y41.l
    public final G0 invoke(BottomSheet.d dVar) {
        ItemMapState.BottomSheetState bottomSheetStateA;
        String str;
        SellerAddressesInfo sellerAddressesInfo;
        BottomSheet.d dVar2 = dVar;
        I i12 = this.f173638l;
        B2 b22 = i12.f173422i;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = B2.f67184X[25];
        boolean zBooleanValue = ((Boolean) b22.f67185A.a().invoke()).booleanValue();
        V v12 = this.f173639m;
        if (zBooleanValue) {
            int i13 = (int) (C35835l0.g(v12.f173567b.getContext()).y * 0.55d);
            ItemMapState itemMapState = v12.f173579n;
            AttributedText attributedText = itemMapState.f173451x;
            FloatingActionButton floatingActionButton = v12.f173550F;
            if (!(attributedText == null && itemMapState.f173452y == null) && i13 < v12.f173547C.getF177843b().getY()) {
                D6.n(floatingActionButton, 150L);
            } else {
                D6.o(floatingActionButton, 150L);
            }
        }
        ItemMapState itemMapState2 = i12.f173414a;
        ItemMapState.BottomSheetState bottomSheetState = itemMapState2.f173437j;
        List<SellerAddressesInfo.SellersAddressDetail> details = null;
        if (bottomSheetState != null) {
            bottomSheetStateA = ItemMapState.BottomSheetState.a(bottomSheetState, kotlin.jvm.internal.L.f(dVar2, BottomSheet.d.c.f177838a) ? ItemMapState.BottomSheetVisibility.Expanded.f173468b : kotlin.jvm.internal.L.f(dVar2, BottomSheet.d.C5241d.f177839a) ? ItemMapState.BottomSheetVisibility.HalfExpanded.f173469b : ItemMapState.BottomSheetVisibility.Collapsed.f173467b, null, false, 4087);
        } else {
            bottomSheetStateA = null;
        }
        i12.f173414a = ItemMapState.a(itemMapState2, null, false, bottomSheetStateA, 0.0f, null, false, false, 268435199);
        if (kotlin.jvm.internal.L.f(dVar2, BottomSheet.d.c.f177838a)) {
            ItemMapState.BottomSheetState bottomSheetState2 = i12.f173414a.f173437j;
            if (bottomSheetState2 != null && (sellerAddressesInfo = bottomSheetState2.f173457d) != null) {
                details = sellerAddressesInfo.getDetails();
            }
            if (details != null && (str = i12.f173414a.f173429b) != null) {
                i12.f173421h.a(str);
            }
        }
        Integer num = v12.f173562R;
        BottomSheet bottomSheet = v12.f173547C;
        if (num != null) {
            bottomSheet.s2(new BottomSheet.c.a(num.intValue()));
        }
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(bottomSheet.getF177843b());
        Float f12 = v12.f173563S;
        if (f12 != null) {
            bottomSheetBehaviorB.L(V.o(f12.floatValue()));
        }
        return G0.f406611a;
    }
}
