package com.avito.android.advert.item;

import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaCredit;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaCredit;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class C extends kotlin.jvm.internal.N implements Y41.l<BuzzoolaBanner.BuzzoolaCredit, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFragment f71600l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(AdvertDetailsFragment advertDetailsFragment) {
        super(1);
        this.f71600l = advertDetailsFragment;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(BuzzoolaBanner.BuzzoolaCredit buzzoolaCredit) {
        BuzzoolaBanner.BuzzoolaCredit buzzoolaCredit2 = buzzoolaCredit;
        com.avito.android.advert.item.creditinfo.buzzoola.k kVar = this.f71600l.f71522t3;
        if (kVar == null) {
            kVar = null;
        }
        kVar.Qd(buzzoolaCredit2);
        return kotlin.G0.f406611a;
    }
}
