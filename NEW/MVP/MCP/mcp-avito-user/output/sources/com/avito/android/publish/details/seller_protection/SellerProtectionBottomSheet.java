package com.avito.android.publish.details.seller_protection;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.publish.details.seller_protection.SellerProtectionBottomSheet;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SellerProtectionBottomSheet.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/details/seller_protection/SellerProtectionBottomSheet;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SellerProtectionBottomSheet extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f234925h0 = new a(null);

    /* compiled from: SellerProtectionBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/details/seller_protection/SellerProtectionBottomSheet$a;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "RESULT_KEY", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SellerProtectionBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            final SellerProtectionBottomSheet sellerProtectionBottomSheet = (SellerProtectionBottomSheet) this.receiver;
            a aVar = SellerProtectionBottomSheet.f234925h0;
            sellerProtectionBottomSheet.getClass();
            View viewFindViewById = view2.findViewById(R.id.seller_protection_gradient);
            Button button = (Button) view2.findViewById(R.id.seller_protection_accept_btn);
            Button button2 = (Button) view2.findViewById(R.id.seller_protection_decline_btn);
            viewFindViewById.setBackground(new AvitoLinearGradientDrawable(new AvitoLinearGradientDrawable.a.C5275a(view2.getContext(), R.attr.gradientLinearMixedHorizontalBlueRed, 0, 4, null).a()));
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.publish.details.seller_protection.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SellerProtectionBottomSheet sellerProtectionBottomSheet2 = sellerProtectionBottomSheet;
                    switch (i12) {
                        case 0:
                            SellerProtectionBottomSheet.a aVar2 = SellerProtectionBottomSheet.f234925h0;
                            C22960s.a(C22777e.b(new Q("seller_protection_result_key", SellerProtectionDialogResult.f234928c)), sellerProtectionBottomSheet2, "seller_protection_request_key");
                            sellerProtectionBottomSheet2.dismiss();
                            break;
                        default:
                            SellerProtectionBottomSheet.a aVar3 = SellerProtectionBottomSheet.f234925h0;
                            C22960s.a(C22777e.b(new Q("seller_protection_result_key", SellerProtectionDialogResult.f234929d)), sellerProtectionBottomSheet2, "seller_protection_request_key");
                            sellerProtectionBottomSheet2.dismiss();
                            break;
                    }
                }
            });
            final int i13 = 1;
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.publish.details.seller_protection.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SellerProtectionBottomSheet sellerProtectionBottomSheet2 = sellerProtectionBottomSheet;
                    switch (i13) {
                        case 0:
                            SellerProtectionBottomSheet.a aVar2 = SellerProtectionBottomSheet.f234925h0;
                            C22960s.a(C22777e.b(new Q("seller_protection_result_key", SellerProtectionDialogResult.f234928c)), sellerProtectionBottomSheet2, "seller_protection_request_key");
                            sellerProtectionBottomSheet2.dismiss();
                            break;
                        default:
                            SellerProtectionBottomSheet.a aVar3 = SellerProtectionBottomSheet.f234925h0;
                            C22960s.a(C22777e.b(new Q("seller_protection_result_key", SellerProtectionDialogResult.f234929d)), sellerProtectionBottomSheet2, "seller_protection_request_key");
                            sellerProtectionBottomSheet2.dismiss();
                            break;
                    }
                }
            });
            return G0.f406611a;
        }
    }

    /* compiled from: SellerProtectionBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SellerProtectionBottomSheet.f234925h0;
            SellerProtectionBottomSheet sellerProtectionBottomSheet = SellerProtectionBottomSheet.this;
            sellerProtectionBottomSheet.getClass();
            C22960s.a(C22777e.b(new Q("seller_protection_result_key", SellerProtectionDialogResult.f234927b)), sellerProtectionBottomSheet, "seller_protection_request_key");
            return G0.f406611a;
        }
    }

    public SellerProtectionBottomSheet() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(requireContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        dVar.E(R.layout.seller_protection_bottom_sheet, true, new b(1, this, SellerProtectionBottomSheet.class, "onViewInflate", "onViewInflate(Landroid/view/View;)V", 0));
        j.b(dVar, true, 4);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.T();
        dVar.R(new c());
        return dVar;
    }
}
