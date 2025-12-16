package com.avito.android.publish.details;

import com.avito.android.publish.details.K1;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PublishDetailsElementConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/q0;", "Lcom/avito/android/publish/details/p0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.q0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33782q0 implements InterfaceC33779p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f234897a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y0 f234898b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.item_wrapper.a f234899c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<K1.AbstractC33668b> f234900d = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C33772n f234901e = new C33772n(this, 2);

    @Inject
    public C33782q0(@Y61.k com.avito.android.category_parameters.a aVar, @Y61.k Y0 y02, @Y61.k com.avito.android.publish.details.item_wrapper.a aVar2) {
        this.f234897a = aVar;
        this.f234898b = y02;
        this.f234899c = aVar2;
    }

    @Override // com.avito.android.publish.details.InterfaceC33779p0
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF234900d() {
        return this.f234900d;
    }

    @Override // com.avito.android.publish.details.InterfaceC33779p0
    @Y61.k
    public final ArrayList b(@Y61.k UV0.a aVar, @Y61.k Set set, @Y61.l Theme theme) {
        AttributedText f173944d;
        List listC = com.avito.android.category_parameters.a.c(this.f234897a, aVar, this.f234898b, set, theme, 8);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (hashSet.add(((com.avito.conveyor_item.a) obj).getF262931b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) it.next();
            if ((aVar2 instanceof JO.i) && (f173944d = ((JO.i) aVar2).getF173944d()) != null) {
                f173944d.setOnDeepLinkClickListener(this.f234901e);
            }
            arrayList2.add(this.f234899c.b(aVar2));
        }
        return arrayList2;
    }
}
