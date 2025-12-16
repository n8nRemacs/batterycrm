package com.avito.android.vas_discount.v2.ui;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_discount.v2.ui.VasDiscountV2DialogFragment;
import kotlin.Metadata;
import qL0.InterfaceC47317a;
import rL0.C47561a;

/* compiled from: VasDiscountV2DialogFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VasDiscountV2DialogFragment f319847b;

    public g(VasDiscountV2DialogFragment vasDiscountV2DialogFragment) {
        this.f319847b = vasDiscountV2DialogFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        VasDiscountV2DialogFragment.a aVar = VasDiscountV2DialogFragment.f319825s0;
        ((C47561a) this.f319847b.f319831m0.getValue()).accept(new InterfaceC47317a.C12321a((DeepLink) obj));
    }
}
