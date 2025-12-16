package com.avito.android.section;

import androidx.compose.runtime.internal.P;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.section.SectionElement;
import com.avito.android.remote.model.section.VipAdvert;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionInsideItemsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/d;", "Lcom/avito/android/section/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34904z0 f264648a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.f f264649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f264650c;

    @Inject
    public d(@Y61.k InterfaceC34904z0 interfaceC34904z0, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.f fVar, @Y61.k C c12) {
        this.f264648a = interfaceC34904z0;
        this.f264649b = fVar;
        this.f264650c = c12;
    }

    @Override // com.avito.android.section.c
    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.l SerpDisplayType serpDisplayType, boolean z12) throws Throwable {
        SerpDisplayType serpDisplayType2 = serpDisplayType == null ? SerpDisplayType.Grid : serpDisplayType;
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            Object objA = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            SectionElement sectionElement = (SectionElement) obj;
            if (sectionElement instanceof SerpAdvert) {
                arrayList.add(InterfaceC34904z0.a.a(this.f264648a, (SerpAdvert) sectionElement, false, false, serpDisplayType2, null, 0, null, null, z12, 1014));
                objA = G0.f406611a;
            } else if (sectionElement instanceof VipAdvert) {
                arrayList.add(InterfaceC34904z0.a.a(this.f264648a, ((VipAdvert) sectionElement).getItem(), true, false, serpDisplayType2, null, 0, null, null, false, 2036));
                objA = G0.f406611a;
            } else if (sectionElement instanceof ConstructorAdvertNetworkModel) {
                ConstructorAdvertItem constructorAdvertItemA = this.f264649b.a((ConstructorAdvertNetworkModel) sectionElement, serpDisplayType2, false, "", -1, "", null);
                if (constructorAdvertItemA != null) {
                    objA = com.avito.android.serp.adapter.constructor.z.a(constructorAdvertItemA, serpDisplayType2);
                    arrayList.add(objA);
                }
            } else {
                V2.f318762a.m(new IllegalArgumentException("Unknown SectionElement: " + sectionElement), !this.f264650c.l());
                objA = G0.f406611a;
            }
            arrayList2.add(objA);
            i12 = i13;
        }
        return arrayList;
    }
}
