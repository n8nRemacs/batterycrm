package com.avito.android.advert.item.icebreakers;

import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.E;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.IceBreaker;
import com.avito.android.remote.model.IceBreakers;
import com.avito.android.util.Kundle;
import com.avito.android.util.V2;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.r;
import t3.InterfaceC48483n;

/* compiled from: IceBreakersPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/icebreakers/j;", "Lcom/avito/android/advert/item/icebreakers/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f76472b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f76473c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f76474d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f76475e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> f76476f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f76477g;

    /* renamed from: h, reason: collision with root package name */
    public int f76478h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f76479i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f76480j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f76481k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f76482l;

    /* compiled from: IceBreakersPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f76483b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "send_message");
        }
    }

    /* compiled from: IceBreakersPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f76484l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: IceBreakersPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C43501a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43501a c43501a) {
            if (c43501a.f413261b instanceof CreateChannelLink.b.h) {
                j.this.f76479i.accept(G0.f406611a);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k @InterfaceC30174s String str, @Y61.l @L5.b Kundle kundle, @Y61.k E e12, @Y61.k @InterfaceC48483n u3.g<SimpleTestGroupWithNone> gVar) {
        LinkedHashMap linkedHashMap;
        Integer numB;
        HashMap mapC;
        this.f76472b = aVar;
        this.f76473c = aVar2;
        this.f76474d = str;
        this.f76475e = e12;
        this.f76476f = gVar;
        if (kundle == null || (mapC = kundle.c("draft_message")) == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(mapC.size()));
            for (Map.Entry entry : mapC.entrySet()) {
                linkedHashMap2.put(Integer.valueOf(Integer.parseInt((String) entry.getKey())), entry.getValue());
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        }
        this.f76477g = linkedHashMap;
        this.f76478h = (kundle == null || (numB = kundle.b("selected_message")) == null) ? 0 : numB.intValue();
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f76479i = cVar;
        this.f76480j = new io.reactivex.rxjava3.disposables.c();
        this.f76482l = new C41981q0(cVar);
    }

    public static final void k(j jVar, m mVar, String str) {
        mVar.W();
        b.a.a(jVar.f76473c, new CreateChannelLink(jVar.f76474d, str, null, null, true, false, null, 108, null), "send_message", null, 4);
    }

    @Override // com.avito.android.advert.item.icebreakers.d
    @Y61.k
    /* renamed from: D, reason: from getter */
    public final C41981q0 getF76482l() {
        return this.f76482l;
    }

    public final String O() {
        return (String) P0.d(this.f76477g, Integer.valueOf(this.f76478h));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        IceBreakersItem iceBreakersItem = (IceBreakersItem) aVar;
        if (iceBreakersItem.f76447f) {
            b.a.a(this.f76473c, new UxFeedbackStartCampaignLink("branding_ux_feedback_android", true, P0.c(), null), null, null, 6);
        }
        int i13 = this.f76478h;
        LinkedHashMap linkedHashMap = this.f76477g;
        IceBreakers iceBreakers = iceBreakersItem.f76445d;
        if (i13 == 0 || linkedHashMap.isEmpty()) {
            IceBreaker iceBreaker = (IceBreaker) C42745f0.G(iceBreakers.getTexts());
            if (iceBreaker == null) {
                return;
            }
            this.f76478h = iceBreaker.getId();
            for (IceBreaker iceBreaker2 : iceBreakers.getTexts()) {
                linkedHashMap.put(Integer.valueOf(iceBreaker2.getId()), iceBreaker2.getMessageText());
            }
        }
        boolean zB2 = this.f76475e.b();
        u3.g<SimpleTestGroupWithNone> gVar = this.f76476f;
        boolean zB3 = gVar.f439742a.f439749b.b();
        mVar.cp(new e(this, gVar.f439742a.f439749b.a(), zB3, zB2, mVar, mVar));
        mVar.gf(new f(zB3, this, mVar));
        mVar.u0(new g(this));
        mVar.cd(new h(this, iceBreakersItem, mVar));
        mVar.o0(new i(mVar));
        mVar.setTitle(iceBreakers.getContact());
        mVar.h(iceBreakers.getDescription());
        mVar.y0(O());
        List<IceBreaker> texts = iceBreakers.getTexts();
        ArrayList arrayList = new ArrayList(C42745f0.q(texts, 10));
        for (IceBreaker iceBreaker3 : texts) {
            arrayList.add(new com.avito.android.advert.item.icebreakers.a(iceBreaker3.getId(), iceBreaker3.getPreviewText()));
        }
        mVar.Yh(this.f76478h, arrayList);
        if (this.f76481k) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = iceBreakers.getTexts().iterator();
        while (it.hasNext()) {
            sb2.append(((IceBreaker) it.next()).getPreviewText());
            sb2.append(";");
        }
        String string = sb2.toString();
        List<IceBreaker> texts2 = iceBreakers.getTexts();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(texts2, 10));
        Iterator<T> it2 = texts2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((IceBreaker) it2.next()).getId()));
        }
        this.f76472b.n4(i12, string, arrayList2);
        this.f76481k = true;
    }

    @Override // com.avito.android.advert.item.icebreakers.d
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.i(Integer.valueOf(this.f76478h), "selected_message");
        LinkedHashMap linkedHashMap = this.f76477g;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(String.valueOf(((Number) entry.getKey()).intValue()), entry.getValue());
        }
        kundle.n("draft_message", linkedHashMap2);
        return kundle;
    }

    @Override // com.avito.android.advert.item.icebreakers.d
    public final void e0() {
        this.f76480j.e();
    }

    @Override // com.avito.android.advert.item.icebreakers.d
    public final void w(@Y61.k z<C43501a> zVar) {
        this.f76480j.b(A1.h(zVar.N(a.f76483b), b.f76484l, new c(), 2));
    }
}
