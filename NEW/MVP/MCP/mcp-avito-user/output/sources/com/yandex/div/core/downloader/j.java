package com.yandex.div.core.downloader;

import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38304f2;
import com.yandex.div2.C38404j6;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivTabs;
import com.yandex.div2.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DivPatchApply.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/downloader/j;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j {
    public final List<AbstractC38330g> a(AbstractC38330g abstractC38330g, com.yandex.div.json.expressions.e eVar) {
        AbstractC38330g pVar;
        H hA2;
        if (abstractC38330g.a().getF374832s() != null) {
            throw null;
        }
        if (abstractC38330g instanceof AbstractC38330g.c) {
            DivContainer divContainer = ((AbstractC38330g.c) abstractC38330g).f375015c;
            pVar = new AbstractC38330g.c(new DivContainer(divContainer.f371358a, divContainer.f371359b, divContainer.f371360c, divContainer.f371361d, divContainer.f371362e, divContainer.f371363f, divContainer.f371364g, divContainer.f371365h, divContainer.f371366i, divContainer.f371367j, divContainer.f371368k, divContainer.f371369l, divContainer.f371370m, divContainer.f371371n, divContainer.f371372o, divContainer.f371373p, divContainer.f371374q, divContainer.f371375r, divContainer.f371376s, b(divContainer.f371377t, eVar), divContainer.f371378u, divContainer.f371379v, divContainer.f371380w, divContainer.f371381x, divContainer.f371382y, divContainer.f371383z, divContainer.f371345A, divContainer.f371346B, divContainer.f371347C, divContainer.f371348D, divContainer.f371349E, divContainer.f371350F, divContainer.f371351G, divContainer.f371352H, divContainer.f371353I, divContainer.f371354J, divContainer.f371355K, divContainer.f371356L, divContainer.f371357M));
        } else if (abstractC38330g instanceof AbstractC38330g.C10942g) {
            C38304f2 c38304f2 = ((AbstractC38330g.C10942g) abstractC38330g).f375019c;
            pVar = new AbstractC38330g.C10942g(new C38304f2(c38304f2.f374814a, c38304f2.f374815b, c38304f2.f374816c, c38304f2.f374817d, c38304f2.f374818e, c38304f2.f374819f, c38304f2.f374820g, c38304f2.f374821h, c38304f2.f374822i, c38304f2.f374823j, c38304f2.f374824k, c38304f2.f374825l, c38304f2.f374826m, c38304f2.f374827n, c38304f2.f374828o, c38304f2.f374829p, c38304f2.f374830q, c38304f2.f374831r, c38304f2.f374832s, b(c38304f2.f374833t, eVar), c38304f2.f374834u, c38304f2.f374835v, c38304f2.f374836w, c38304f2.f374837x, c38304f2.f374838y, c38304f2.f374839z, c38304f2.f374805A, c38304f2.f374806B, c38304f2.f374807C, c38304f2.f374808D, c38304f2.f374809E, c38304f2.f374810F, c38304f2.f374811G, c38304f2.f374812H, c38304f2.f374813I));
        } else if (abstractC38330g instanceof AbstractC38330g.e) {
            DivGallery divGallery = ((AbstractC38330g.e) abstractC38330g).f375017c;
            pVar = new AbstractC38330g.e(new DivGallery(divGallery.f371503a, divGallery.f371504b, divGallery.f371505c, divGallery.f371506d, divGallery.f371507e, divGallery.f371508f, divGallery.f371509g, divGallery.f371510h, divGallery.f371511i, divGallery.f371512j, divGallery.f371513k, divGallery.f371514l, divGallery.f371515m, divGallery.f371516n, divGallery.f371517o, divGallery.f371518p, divGallery.f371519q, b(divGallery.f371520r, eVar), divGallery.f371521s, divGallery.f371522t, divGallery.f371523u, divGallery.f371524v, divGallery.f371525w, divGallery.f371526x, divGallery.f371527y, divGallery.f371528z, divGallery.f371494A, divGallery.f371495B, divGallery.f371496C, divGallery.f371497D, divGallery.f371498E, divGallery.f371499F, divGallery.f371500G, divGallery.f371501H, divGallery.f371502I));
        } else if (abstractC38330g instanceof AbstractC38330g.k) {
            DivPager divPager = ((AbstractC38330g.k) abstractC38330g).f375023c;
            pVar = new AbstractC38330g.k(new DivPager(divPager.f371805a, divPager.f371806b, divPager.f371807c, divPager.f371808d, divPager.f371809e, divPager.f371810f, divPager.f371811g, divPager.f371812h, divPager.f371813i, divPager.f371814j, divPager.f371815k, divPager.f371816l, divPager.f371817m, divPager.f371818n, b(divPager.f371819o, eVar), divPager.f371820p, divPager.f371821q, divPager.f371822r, divPager.f371823s, divPager.f371824t, divPager.f371825u, divPager.f371826v, divPager.f371827w, divPager.f371828x, divPager.f371829y, divPager.f371830z, divPager.f371799A, divPager.f371800B, divPager.f371801C, divPager.f371802D, divPager.f371803E, divPager.f371804F));
        } else if (abstractC38330g instanceof AbstractC38330g.o) {
            C38404j6 c38404j6 = ((AbstractC38330g.o) abstractC38330g).f375027c;
            List<C38404j6.g> list = c38404j6.f375613s;
            ArrayList arrayList = new ArrayList();
            for (C38404j6.g gVar : list) {
                AbstractC38330g abstractC38330g2 = gVar.f375631c;
                if (((abstractC38330g2 == null || (hA2 = abstractC38330g2.a()) == null) ? null : hA2.getF374832s()) != null) {
                    throw null;
                }
                AbstractC38330g abstractC38330g3 = gVar.f375631c;
                List<AbstractC38330g> listA = abstractC38330g3 == null ? null : a(abstractC38330g3, eVar);
                if (listA != null && listA.size() == 1) {
                    gVar = new C38404j6.g(gVar.f375629a, gVar.f375630b, listA.get(0), gVar.f375632d, gVar.f375633e);
                }
                arrayList.add(gVar);
            }
            pVar = new AbstractC38330g.o(new C38404j6(c38404j6.f375595a, c38404j6.f375596b, c38404j6.f375597c, c38404j6.f375598d, c38404j6.f375599e, c38404j6.f375600f, c38404j6.f375601g, c38404j6.f375602h, c38404j6.f375603i, c38404j6.f375604j, c38404j6.f375605k, c38404j6.f375606l, c38404j6.f375607m, c38404j6.f375608n, c38404j6.f375609o, c38404j6.f375610p, c38404j6.f375611q, c38404j6.f375612r, arrayList, c38404j6.f375614t, c38404j6.f375615u, c38404j6.f375616v, c38404j6.f375617w, c38404j6.f375618x, c38404j6.f375619y, c38404j6.f375620z, c38404j6.f375591A, c38404j6.f375592B, c38404j6.f375593C, c38404j6.f375594D));
        } else if (abstractC38330g instanceof AbstractC38330g.p) {
            ArrayList arrayList2 = new ArrayList();
            DivTabs divTabs = ((AbstractC38330g.p) abstractC38330g).f375028c;
            for (DivTabs.f fVar : divTabs.f372050o) {
                List<AbstractC38330g> listA2 = a(fVar.f372126a, eVar);
                if (listA2.size() == 1) {
                    arrayList2.add(new DivTabs.f(listA2.get(0), fVar.f372127b, fVar.f372128c));
                } else {
                    arrayList2.add(fVar);
                }
            }
            pVar = new AbstractC38330g.p(new DivTabs(divTabs.f372036a, divTabs.f372037b, divTabs.f372038c, divTabs.f372039d, divTabs.f372040e, divTabs.f372041f, divTabs.f372042g, divTabs.f372043h, divTabs.f372044i, divTabs.f372045j, divTabs.f372046k, divTabs.f372047l, divTabs.f372048m, divTabs.f372049n, arrayList2, divTabs.f372051p, divTabs.f372052q, divTabs.f372053r, divTabs.f372054s, divTabs.f372055t, divTabs.f372056u, divTabs.f372057v, divTabs.f372058w, divTabs.f372059x, divTabs.f372060y, divTabs.f372061z, divTabs.f372026A, divTabs.f372027B, divTabs.f372028C, divTabs.f372029D, divTabs.f372030E, divTabs.f372031F, divTabs.f372032G, divTabs.f372033H, divTabs.f372034I, divTabs.f372035J));
        } else {
            pVar = abstractC38330g;
        }
        return Collections.singletonList(pVar);
    }

    public final ArrayList b(List list, com.yandex.div.json.expressions.e eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(a((AbstractC38330g) it.next(), eVar));
        }
        return arrayList;
    }
}
