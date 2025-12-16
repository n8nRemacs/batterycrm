package com.avito.android.bbl.screens.configure.v2;

import Ah.InterfaceC13032a;
import Y41.p;
import com.avito.android.bbl.screens.configure.v2.BblConfigureV2Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblConfigureV2Fragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "buttonId", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements p<DeepLink, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BblConfigureV2Fragment f99296l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BblConfigureV2Fragment bblConfigureV2Fragment) {
        super(2);
        this.f99296l = bblConfigureV2Fragment;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, Integer num) {
        int iIntValue = num.intValue();
        BblConfigureV2Fragment.a aVar = BblConfigureV2Fragment.f99264C0;
        this.f99296l.w5().accept(new InterfaceC13032a.c(Integer.valueOf(iIntValue), deepLink));
        return G0.f406611a;
    }
}
