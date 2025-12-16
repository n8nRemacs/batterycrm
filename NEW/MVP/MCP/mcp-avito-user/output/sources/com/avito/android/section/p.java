package com.avito.android.section;

import Tp0.InterfaceC15390A;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SectionItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/p;", "Lcom/avito/android/section/o;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.section.title.a f264847b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f264848c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Bundle f264849d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f264850e;

    /* compiled from: SectionItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/p$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f264851a;

        public a(int i12) {
            this.f264851a = i12;
        }

        public /* synthetic */ a(String str, int i12, int i13, C42822w c42822w) {
            this((i13 & 2) != 0 ? -1 : i12);
        }
    }

    @Inject
    public p(@Y61.k com.avito.android.section.title.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @InterfaceC15390A.a @Y61.l Bundle bundle) {
        this.f264847b = aVar;
        this.f264848c = interfaceC28373a;
        this.f264849d = bundle == null ? new Bundle() : bundle;
        this.f264850e = new LinkedHashMap();
    }

    @Override // com.avito.android.section.o
    public final void M1(int i12, int i13, @Y61.k String str) {
        Bundle bundle = this.f264849d;
        bundle.putInt(str, i12);
        bundle.putInt(str + "LAST_VISIBLE_ITEM", i13);
        a aVar = (a) this.f264850e.get(str);
        if (aVar != null) {
            aVar.f264851a = Math.max(aVar.f264851a, i13);
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        s sVar = (s) eVar;
        SectionItem sectionItem = (SectionItem) aVar;
        Iterator<T> it = sectionItem.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) next;
            if ((persistableSpannedItem instanceof AdvertItem) && ((AdvertItem) persistableSpannedItem).f268374D == SerpViewType.f268584d) {
                break;
            }
        }
        if (next != null) {
            sVar.U9();
        } else {
            sVar.Wd();
        }
        UV0.c cVar = new UV0.c(sectionItem.getItems());
        sVar.getF264917c().c(cVar);
        sVar.getF264918d().c(cVar);
        sVar.getF264919e().c(cVar);
        sVar.getF264918d().s4(sVar);
        sVar.getF264919e().d(sVar);
        sVar.e8();
        this.f264847b.O5(sVar, sectionItem, i12);
        sVar.s(sectionItem.getF250146b());
        String f250146b = sectionItem.getF250146b();
        Bundle bundle = this.f264849d;
        sVar.W0(bundle.getInt(f250146b, 0));
        if (sectionItem.getF264685i() != null) {
            LinkedHashMap linkedHashMap = this.f264850e;
            if (linkedHashMap.containsKey(sectionItem.getF250146b())) {
                return;
            }
            linkedHashMap.put(sectionItem.getF250146b(), new a(bundle.getInt(sectionItem.getF250146b() + "LAST_VISIBLE_ITEM")));
        }
    }

    @Override // com.avito.android.section.o
    @Y61.k
    /* renamed from: d0, reason: from getter */
    public final Bundle getF264849d() {
        return this.f264849d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recycler.responsive.g
    public final /* bridge */ /* synthetic */ void r0(com.avito.konveyor.adapter.b bVar, int i12) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recycler.responsive.g
    public final /* bridge */ /* synthetic */ void t0(com.avito.konveyor.adapter.b bVar, int i12) {
    }

    public /* synthetic */ p(com.avito.android.section.title.a aVar, InterfaceC28373a interfaceC28373a, Bundle bundle, int i12, C42822w c42822w) {
        this(aVar, interfaceC28373a, (i12 & 4) != 0 ? null : bundle);
    }
}
