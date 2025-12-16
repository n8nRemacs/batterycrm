package com.yandex.div.core.view2.divs.tabs;

import android.content.res.Resources;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import com.yandex.div.internal.widget.tabs.z;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DivTabsBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "dynamicHeight", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class e extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f368771l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DivTabs f368772m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368773n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f368774o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C38029k f368775p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C38040w f368776q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.state.f f368777r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f368778s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(z zVar, DivTabs divTabs, com.yandex.div.json.expressions.e eVar, c cVar, C38029k c38029k, C38040w c38040w, com.yandex.div.core.state.f fVar, ArrayList arrayList) {
        super(1);
        this.f368771l = zVar;
        this.f368772m = divTabs;
        this.f368773n = eVar;
        this.f368774o = cVar;
        this.f368775p = c38029k;
        this.f368776q = c38040w;
        this.f368777r = fVar;
        this.f368778s = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) throws Resources.NotFoundException {
        int iIntValue;
        m mVar;
        boolean zBooleanValue = bool.booleanValue();
        z zVar = this.f368771l;
        b divTabsAdapter = zVar.getDivTabsAdapter();
        if (divTabsAdapter == null || divTabsAdapter.f368737o != zBooleanValue) {
            b divTabsAdapter2 = zVar.getDivTabsAdapter();
            Integer numValueOf = null;
            if (divTabsAdapter2 != null && (mVar = divTabsAdapter2.f368745w) != null) {
                numValueOf = Integer.valueOf(mVar.f368814a.getCurrentItem());
            }
            if (numValueOf == null) {
                long jLongValue = this.f368772m.f372056u.a(this.f368773n).longValue();
                long j12 = jLongValue >> 31;
                if (j12 == 0 || j12 == -1) {
                    iIntValue = (int) jLongValue;
                } else {
                    int i12 = com.yandex.div.internal.n.f370123a;
                    iIntValue = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
                }
            } else {
                iIntValue = numValueOf.intValue();
            }
            c.b(this.f368774o, this.f368775p, this.f368772m, this.f368773n, zVar, this.f368776q, this.f368777r, this.f368778s, iIntValue);
        }
        return G0.f406611a;
    }
}
