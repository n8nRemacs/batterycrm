package com.avito.android.imv_goods_poll.items.check_box;

import Y41.l;
import com.avito.android.deep_linking.links.ImvGoodsPollLinkBodyOption;
import fN.InterfaceC40319a;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "slug", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f170640l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f170641m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar) {
        super(1);
        this.f170640l = fVar;
        this.f170641m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        com.avito.android.imv_goods_poll.mvi.a aVar = this.f170640l.f170642b;
        List<ImvGoodsPollLinkBodyOption> list = this.f170641m.f170633b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (ImvGoodsPollLinkBodyOption imvGoodsPollLinkBodyOptionA : list) {
            if (L.f(imvGoodsPollLinkBodyOptionA.getSlug(), str2)) {
                imvGoodsPollLinkBodyOptionA = ImvGoodsPollLinkBodyOption.a(imvGoodsPollLinkBodyOptionA, !imvGoodsPollLinkBodyOptionA.f133363b);
            }
            arrayList.add(imvGoodsPollLinkBodyOptionA);
        }
        aVar.a(new InterfaceC40319a.b(arrayList));
        return G0.f406611a;
    }
}
