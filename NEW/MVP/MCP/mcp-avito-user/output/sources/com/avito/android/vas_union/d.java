package com.avito.android.vas_union;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_union.VasUnionV2Fragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qM0.InterfaceC47320a;

/* compiled from: VasUnionV2Fragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VasUnionV2Fragment f323117l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(VasUnionV2Fragment vasUnionV2Fragment) {
        super(1);
        this.f323117l = vasUnionV2Fragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        VasUnionV2Fragment.a aVar = VasUnionV2Fragment.f323084D0;
        this.f323117l.q5().accept(new InterfaceC47320a.e(deepLink));
        return G0.f406611a;
    }
}
