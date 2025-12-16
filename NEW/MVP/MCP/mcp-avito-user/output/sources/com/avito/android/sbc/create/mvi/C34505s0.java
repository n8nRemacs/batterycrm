package com.avito.android.sbc.create.mvi;

import Uo0.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DiscountDispatchVasFooterActionClickedDeeplink;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.sbc.create.mvi.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34505s0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateDiscountDispatchFragment f259876b;

    public C34505s0(CreateDiscountDispatchFragment createDiscountDispatchFragment) {
        this.f259876b = createDiscountDispatchFragment;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        DeepLink deepLink = (DeepLink) q12.f406619b;
        int iIntValue = ((Number) q12.f406620c).intValue();
        CreateDiscountDispatchFragment createDiscountDispatchFragment = this.f259876b;
        com.avito.android.sbc.create.mvi.util.k kVar = createDiscountDispatchFragment.f259259w0;
        Object c15554i = null;
        if (kVar == null) {
            kVar = null;
        }
        kVar.getClass();
        if (deepLink instanceof DiscountDispatchVasFooterActionClickedDeeplink) {
            DiscountDispatchVasFooterActionClickedDeeplink discountDispatchVasFooterActionClickedDeeplink = (DiscountDispatchVasFooterActionClickedDeeplink) deepLink;
            String str = discountDispatchVasFooterActionClickedDeeplink.f133282b;
            int iHashCode = str.hashCode();
            DeepLink deepLink2 = discountDispatchVasFooterActionClickedDeeplink.f133283c;
            switch (iHashCode) {
                case -1747714994:
                    if (str.equals("do_not_apply") && deepLink2 != null) {
                        c15554i = new e.C15554i(deepLink2);
                        break;
                    }
                    break;
                case 3532159:
                    if (str.equals("skip") && deepLink2 != null) {
                        c15554i = new e.C(deepLink2);
                        break;
                    }
                    break;
                case 93029230:
                    if (str.equals("apply") && deepLink2 != null) {
                        c15554i = new e.C15547a(deepLink2, iIntValue);
                        break;
                    }
                    break;
                case 108405416:
                    if (str.equals("retry")) {
                        c15554i = e.l.f16631a;
                        break;
                    }
                    break;
                case 1347490138:
                    if (str.equals("finish_flow")) {
                        c15554i = e.j.f16629a;
                        break;
                    }
                    break;
            }
        }
        if (c15554i != null) {
            createDiscountDispatchFragment.q5().accept(c15554i);
        }
    }
}
