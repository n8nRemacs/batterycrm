package com.avito.android.vas_union;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_union.VasUnionV2Fragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qM0.InterfaceC47320a;

/* compiled from: VasUnionV2Fragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "buttonId", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements p<DeepLink, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VasUnionV2Fragment f323205l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VasUnionV2Fragment vasUnionV2Fragment) {
        super(2);
        this.f323205l = vasUnionV2Fragment;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, Integer num) {
        int iIntValue = num.intValue();
        VasUnionV2Fragment.a aVar = VasUnionV2Fragment.f323084D0;
        this.f323205l.q5().accept(new InterfaceC47320a.c(Integer.valueOf(iIntValue), deepLink));
        return G0.f406611a;
    }
}
