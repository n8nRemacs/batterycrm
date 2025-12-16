package com.yandex.div.core.view2.divs;

import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import com.yandex.div.core.util.mask.a;
import com.yandex.div2.AbstractC38578v3;
import com.yandex.div2.C38467o1;
import com.yandex.div2.C38566u0;
import com.yandex.div2.DivInput;
import com.yandex.div2.InterfaceC38587w3;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.g1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37957g1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DivInput f368393l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h<com.yandex.div.core.util.mask.a> f368394m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368395n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ KeyListener f368396o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368397p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.yandex.div.core.util.mask.a, kotlin.G0> f368398q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Exception, Y41.a<kotlin.G0>, kotlin.G0> f368399r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.errors.d f368400s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C37957g1(DivInput divInput, l0.h<com.yandex.div.core.util.mask.a> hVar, com.yandex.div.core.view2.divs.widgets.j jVar, KeyListener keyListener, com.yandex.div.json.expressions.e eVar, Y41.l<? super com.yandex.div.core.util.mask.a, kotlin.G0> lVar, Y41.p<? super Exception, ? super Y41.a<kotlin.G0>, kotlin.G0> pVar, com.yandex.div.core.view2.errors.d dVar) {
        super(1);
        this.f368393l = divInput;
        this.f368394m = hVar;
        this.f368395n = jVar;
        this.f368396o = keyListener;
        this.f368397p = eVar;
        this.f368398q = lVar;
        this.f368399r = pVar;
        this.f368400s = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.div.core.util.mask.b] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.util.mask.c] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        Locale localeForLanguageTag;
        AbstractC38578v3 abstractC38578v3 = this.f368393l.f371735x;
        T bVar = 0;
        bVar = 0;
        bVar = 0;
        InterfaceC38587w3 interfaceC38587w3A = abstractC38578v3 == null ? null : abstractC38578v3.a();
        boolean z12 = interfaceC38587w3A instanceof C38467o1;
        Y41.p<Exception, Y41.a<kotlin.G0>, kotlin.G0> pVar = this.f368399r;
        l0.h<com.yandex.div.core.util.mask.a> hVar = this.f368394m;
        KeyListener keyListener = this.f368396o;
        com.yandex.div.core.view2.divs.widgets.j jVar = this.f368395n;
        com.yandex.div.json.expressions.e eVar = this.f368397p;
        if (z12) {
            jVar.setKeyListener(keyListener);
            C38467o1 c38467o1 = (C38467o1) interfaceC38587w3A;
            String strA = c38467o1.f375889b.a(eVar);
            List<C38467o1.c> list = c38467o1.f375890c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C38467o1.c cVar : list) {
                char cD2 = C43066x.D(cVar.f375898a.a(eVar));
                com.yandex.div.json.expressions.b<String> bVar2 = cVar.f375900c;
                arrayList.add(new a.c(cD2, bVar2 == null ? null : bVar2.a(eVar), C43066x.D(cVar.f375899b.a(eVar))));
            }
            a.b bVar3 = new a.b(strA, arrayList, c38467o1.f375888a.a(eVar).booleanValue());
            com.yandex.div.core.util.mask.a aVar = hVar.f406842b;
            if (aVar != null) {
                aVar.l(bVar3, true);
                bVar = aVar;
            }
            if (bVar == 0) {
                bVar = new com.yandex.div.core.util.mask.c(bVar3, new C37945d1(pVar));
            }
        } else if (interfaceC38587w3A instanceof C38566u0) {
            com.yandex.div.json.expressions.b<String> bVar4 = ((C38566u0) interfaceC38587w3A).f376616a;
            String strA2 = bVar4 == null ? null : bVar4.a(eVar);
            if (strA2 != null) {
                localeForLanguageTag = Locale.forLanguageTag(strA2);
                String languageTag = localeForLanguageTag.toLanguageTag();
                if (!kotlin.jvm.internal.L.f(languageTag, strA2)) {
                    this.f368400s.b(new IllegalArgumentException("Original locale tag '" + ((Object) strA2) + "' is not equals to final one '" + ((Object) languageTag) + '\''));
                }
            } else {
                localeForLanguageTag = Locale.getDefault();
            }
            jVar.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
            com.yandex.div.core.util.mask.a aVar2 = hVar.f406842b;
            com.yandex.div.core.util.mask.a aVar3 = aVar2;
            if (aVar3 != null) {
                if (aVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.util.mask.CurrencyInputMask");
                }
                com.yandex.div.core.util.mask.b bVar5 = (com.yandex.div.core.util.mask.b) aVar2;
                String strReplace = bVar5.g().replace(bVar5.n().getDecimalSeparator(), '.');
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(localeForLanguageTag);
                bVar5.m(currencyInstance);
                bVar5.f367819h = currencyInstance;
                bVar5.a(null, strReplace.replace('.', bVar5.n().getDecimalSeparator()));
                bVar = aVar3;
            }
            if (bVar == 0) {
                bVar = new com.yandex.div.core.util.mask.b(localeForLanguageTag, new C37953f1(pVar));
            }
        } else {
            jVar.setKeyListener(keyListener);
        }
        hVar.f406842b = bVar;
        ((C37969j1) this.f368398q).invoke(bVar);
        return kotlin.G0.f406611a;
    }
}
