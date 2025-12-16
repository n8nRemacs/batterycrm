package com.avito.android.advert.item.icebreakers_redesign;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.IceBreaker;
import com.avito.android.remote.model.IceBreakers;
import com.avito.android.util.C35755b0;
import com.avito.android.util.Kundle;
import com.avito.android.util.V2;
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
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kv.C43501a;
import l41.r;

/* compiled from: IceBreakersRedesignPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/icebreakers_redesign/i;", "Lcom/avito/android/advert/item/icebreakers_redesign/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f76534b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f76535c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f76536d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Kundle f76537e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Z0 f76538f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f76539g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f76540h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f76541i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public String f76542j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public List<IceBreaker> f76543k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f76544l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f76545m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f76546n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f76547o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public l f76548p;

    /* compiled from: IceBreakersRedesignPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f76549b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "send_message");
        }
    }

    /* compiled from: IceBreakersRedesignPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f76550l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: IceBreakersRedesignPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C43501a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43501a c43501a) {
            if (c43501a.f413261b instanceof CreateChannelLink.b.h) {
                i.this.f76544l.accept(G0.f406611a);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public i(@Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k @InterfaceC30174s String str, @Y61.l @M5.a Kundle kundle) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        String strG;
        Boolean boolA;
        ArrayList<String> stringArrayList;
        HashMap mapC;
        this.f76534b = aVar;
        this.f76535c = aVar2;
        this.f76536d = str;
        this.f76537e = kundle;
        if (kundle == null || (mapC = kundle.c("draft_message")) == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(mapC.size()));
            for (Map.Entry entry : mapC.entrySet()) {
                linkedHashMap2.put(Integer.valueOf(Integer.parseInt((String) entry.getKey())), entry.getValue());
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        }
        this.f76539g = linkedHashMap;
        Kundle kundle2 = this.f76537e;
        if (kundle2 == null || (stringArrayList = kundle2.f318647b.getStringArrayList("selected_message_ids")) == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : stringArrayList) {
                Integer numY0 = str2 != null ? C43066x.y0(str2) : null;
                if (numY0 != null) {
                    arrayList2.add(numY0);
                }
            }
            arrayList = new ArrayList(arrayList2);
        }
        this.f76540h = arrayList;
        Kundle kundle3 = this.f76537e;
        this.f76541i = (kundle3 == null || (boolA = kundle3.a("input_mode")) == null) ? false : boolA.booleanValue();
        Kundle kundle4 = this.f76537e;
        this.f76542j = (kundle4 == null || (strG = kundle4.g("current_text")) == null) ? "" : strG;
        this.f76543k = C42784z0.f406748b;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f76544l = cVar;
        this.f76545m = new io.reactivex.rxjava3.disposables.c();
        this.f76547o = new C41981q0(cVar);
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.d
    @Y61.k
    /* renamed from: D, reason: from getter */
    public final C41981q0 getF76547o() {
        return this.f76547o;
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.d
    public final void E3(@Y61.k ArrayList arrayList) {
        this.f76543k = arrayList;
        LinkedHashMap linkedHashMap = this.f76539g;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IceBreaker iceBreaker = (IceBreaker) it.next();
            linkedHashMap.put(Integer.valueOf(iceBreaker.getId()), iceBreaker.getMessageText());
        }
        IceBreaker iceBreaker2 = (IceBreaker) C42745f0.E(arrayList);
        ArrayList arrayList2 = this.f76540h;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(iceBreaker2.getId()));
        this.f76542j = iceBreaker2.getMessageText();
        l lVar = this.f76548p;
        if (lVar != null) {
            lVar.y0(iceBreaker2.getMessageText());
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                IceBreaker iceBreaker3 = (IceBreaker) it2.next();
                arrayList3.add(new IcebreakerRedesignChips(iceBreaker3.getId(), iceBreaker3.getPreviewText(), null, false, 12, null));
            }
            lVar.hv(arrayList3, C42745f0.e0(0), true);
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        List<IceBreaker> texts;
        l lVar = (l) eVar;
        IcebreakersRedesignItem icebreakersRedesignItem = (IcebreakersRedesignItem) aVar;
        this.f76548p = lVar;
        IceBreakers iceBreakers = icebreakersRedesignItem.f76518d;
        Kundle kundle = this.f76537e;
        if (kundle == null || (texts = kundle.e("current_icebreakers")) == null) {
            texts = iceBreakers.getTexts();
        }
        this.f76543k = texts;
        LinkedHashMap linkedHashMap = this.f76539g;
        if (linkedHashMap.isEmpty()) {
            for (IceBreaker iceBreaker : this.f76543k) {
                linkedHashMap.put(Integer.valueOf(iceBreaker.getId()), iceBreaker.getMessageText());
            }
        }
        ArrayList arrayList = this.f76540h;
        if (arrayList.isEmpty() && !this.f76543k.isEmpty()) {
            arrayList.add(Integer.valueOf(((IceBreaker) C42745f0.E(this.f76543k)).getId()));
        }
        lVar.setTitle(iceBreakers.getContact());
        if (this.f76541i) {
            lVar.h70();
        } else {
            this.f76542j = k();
            List<IceBreaker> list = this.f76543k;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (IceBreaker iceBreaker2 : list) {
                arrayList2.add(new IcebreakerRedesignChips(iceBreaker2.getId(), iceBreaker2.getPreviewText(), null, false, 12, null));
            }
            lVar.hv(arrayList2, arrayList, true);
        }
        lVar.y0(this.f76542j);
        if (!this.f76546n) {
            String strO = C42745f0.O(this.f76543k, ";", null, null, j.f76552l, 30);
            List<IceBreaker> list2 = this.f76543k;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((IceBreaker) it.next()).getId()));
            }
            this.f76534b.n4(i12, strO, arrayList3);
            this.f76546n = true;
        }
        lVar.Xp(new e(this, icebreakersRedesignItem, lVar));
        lVar.cd(new f(this, lVar));
        lVar.u0(new g(this, lVar));
        lVar.o0(new h(lVar));
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.d
    public final void c0() {
        this.f76538f = null;
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.d
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        ArrayList arrayList = this.f76540h;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((Number) it.next()).intValue()));
        }
        kundle.f318647b.putStringArrayList("selected_message_ids", C35755b0.a(arrayList2));
        LinkedHashMap linkedHashMap = this.f76539g;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(String.valueOf(((Number) entry.getKey()).intValue()), entry.getValue());
        }
        kundle.n("draft_message", linkedHashMap2);
        kundle.h(Boolean.valueOf(this.f76541i), "input_mode");
        kundle.m("current_text", this.f76542j);
        kundle.k("current_icebreakers", new ArrayList(this.f76543k));
        return kundle;
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.d
    public final void e0() {
        this.f76545m.e();
        this.f76548p = null;
    }

    public final String k() {
        LinkedHashMap linkedHashMap = this.f76539g;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f76540h.iterator();
        while (it.hasNext()) {
            String str = (String) linkedHashMap.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (str != null) {
                arrayList.add(str);
            }
        }
        return C42745f0.O(arrayList, " ", null, null, null, 62);
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.d
    public final void m5(@Y61.k Z0 z02) {
        this.f76538f = z02;
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.d
    public final void w(@Y61.k z<C43501a> zVar) {
        this.f76545m.b(A1.h(zVar.N(a.f76549b), b.f76550l, new c(), 2));
    }
}
