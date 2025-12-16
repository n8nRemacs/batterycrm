package com.yandex.div.core.view2.divs;

import com.yandex.div.core.expression.variables.h;
import com.yandex.div2.C38267b5;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: DivSelectBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/F1;", "Lcom/yandex/div/core/expression/variables/h$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class F1 implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C38267b5 f368063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.p f368064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.errors.d f368065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368066d;

    public F1(C38267b5 c38267b5, com.yandex.div.core.view2.divs.widgets.p pVar, com.yandex.div.core.view2.errors.d dVar, com.yandex.div.json.expressions.e eVar) {
        this.f368063a = c38267b5;
        this.f368064b = pVar;
        this.f368065c = dVar;
        this.f368066d = eVar;
    }

    @Override // com.yandex.div.core.expression.variables.j.a
    public final void a(String str) {
        String strA;
        String str2 = str;
        C42770s0 c42770s0 = new C42770s0(this.f368063a.f374475v);
        com.yandex.div.json.expressions.e eVar = this.f368066d;
        C43025h.a aVar = new C43025h.a(C43033p.i(c42770s0, new E1(eVar, str2)));
        boolean zHasNext = aVar.hasNext();
        com.yandex.div.core.view2.errors.d dVar = this.f368065c;
        if (zHasNext) {
            C38267b5.i iVar = (C38267b5.i) aVar.next();
            if (aVar.hasNext()) {
                dVar.b(new Throwable("Multiple options found with value = \"" + ((Object) str2) + "\", selecting first one"));
            }
            com.yandex.div.json.expressions.b<String> bVar = iVar.f374489a;
            if (bVar == null) {
                bVar = iVar.f374490b;
            }
            strA = bVar.a(eVar);
        } else {
            dVar.b(new Throwable("No option found with value = \"" + ((Object) str2) + '\"'));
            strA = "";
        }
        this.f368064b.setText(strA);
    }

    @Override // com.yandex.div.core.expression.variables.j.a
    public final void b(@Y61.k Y41.l<? super String, kotlin.G0> lVar) {
        this.f368064b.setValueUpdater(lVar);
    }
}
