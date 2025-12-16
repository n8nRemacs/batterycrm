package com.avito.android.advert.item.icebreakers_redesign;

import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.IceBreaker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IceBreakersRedesignPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f76529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f76530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, l lVar) {
        super(0);
        this.f76529l = iVar;
        this.f76530m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ArrayList arrayList;
        i iVar = this.f76529l;
        String str = iVar.f76542j;
        Iterator<IceBreaker> it = iVar.f76543k.iterator();
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = iVar.f76540h;
            if (!zHasNext) {
                i12 = -1;
                break;
            }
            int id2 = it.next().getId();
            Integer num = (Integer) C42745f0.G(arrayList);
            if (num != null && id2 == num.intValue()) {
                break;
            }
            i12++;
        }
        Integer num2 = (Integer) C42745f0.G(arrayList);
        iVar.f76534b.D3(i12, num2 != null ? num2.intValue() : -1, str);
        String str2 = iVar.f76542j;
        this.f76530m.W();
        b.a.a(iVar.f76535c, new CreateChannelLink(iVar.f76536d, str2, null, null, true, false, null, 108, null), "send_message", null, 4);
        return G0.f406611a;
    }
}
