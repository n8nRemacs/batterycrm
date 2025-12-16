package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationGroupFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.location_group.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31021j extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31013b f171827l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31021j(C31013b c31013b) {
        super(0);
        this.f171827l = c31013b;
    }

    @Override // Y41.a
    public final G0 invoke() {
        PresentationType presentationType;
        String str;
        C31013b c31013b = this.f171827l;
        InterfaceC30995b interfaceC30995b = c31013b.f171791g;
        if (interfaceC30995b != null) {
            com.avito.android.inline_filters.dialog.E e12 = c31013b.f171147c;
            D d12 = e12 instanceof D ? (D) e12 : null;
            if (d12 != null) {
                c31013b.f171787J = false;
                d12.r(null, true);
                d12.v(true);
                io.reactivex.rxjava3.disposables.c cVar = c31013b.f171780C;
                cVar.e();
                ItemsSearchLink itemsSearchLink = c31013b.f171782E;
                if (itemsSearchLink == null || (presentationType = itemsSearchLink.f133413l) == null) {
                    presentationType = c31013b.f171796l;
                }
                PresentationType presentationType2 = presentationType;
                if (itemsSearchLink == null || (str = itemsSearchLink.f133404c) == null) {
                    str = c31013b.f171797m;
                }
                String str2 = str;
                SearchParams searchParams = c31013b.f171779B;
                Map map = c31013b.f171784G;
                if (map == null) {
                    map = c31013b.f171790f;
                }
                cVar.b(interfaceC30995b.a(searchParams, presentationType2, str2, c31013b.f171800p, c31013b.f171801q, map, c31013b.f171789e, itemsSearchLink).v0(new C31018g(c31013b, d12), new C31019h(c31013b), io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        return G0.f406611a;
    }
}
