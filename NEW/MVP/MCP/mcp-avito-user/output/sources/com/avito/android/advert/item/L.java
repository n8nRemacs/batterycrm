package com.avito.android.advert.item;

import androidx.fragment.app.FragmentManager;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_details/AdvertDetailsStyle;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_details/AdvertDetailsStyle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class L extends kotlin.jvm.internal.N implements Y41.l<AdvertDetailsStyle, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFragment f71771l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(AdvertDetailsFragment advertDetailsFragment) {
        super(1);
        this.f71771l = advertDetailsFragment;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(AdvertDetailsStyle advertDetailsStyle) {
        AdvertDetailsStyle advertDetailsStyle2 = advertDetailsStyle;
        AdvertDetailsFragment advertDetailsFragment = this.f71771l;
        if (advertDetailsStyle2 != advertDetailsFragment.f71488k5) {
            advertDetailsFragment.f71488k5 = advertDetailsStyle2;
            I1 i12 = advertDetailsFragment.f71468f5;
            if (i12 != null) {
                i12.f71750x0.A0(0);
            }
            try {
                FragmentManager parentFragmentManager = advertDetailsFragment.getParentFragmentManager();
                androidx.fragment.app.H hE2 = parentFragmentManager.e();
                hE2.i(advertDetailsFragment);
                hE2.e();
                androidx.fragment.app.H hE3 = parentFragmentManager.e();
                hE3.d(advertDetailsFragment);
                hE3.e();
            } catch (Throwable th2) {
                V2.f318762a.a("DEFAULT_TAG", "SPT-13823: AdvertDetailsFragment view recreate error", th2);
            }
        }
        return kotlin.G0.f406611a;
    }
}
