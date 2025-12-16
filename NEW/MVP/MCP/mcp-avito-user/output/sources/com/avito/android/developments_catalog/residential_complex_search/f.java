package com.avito.android.developments_catalog.residential_complex_search;

import Y61.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jx.C42440b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import tx.C48734a;

/* compiled from: ResidentialComplexConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/f;", "Lcom/avito/android/developments_catalog/residential_complex_search/e;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C48734a f139185a;

    /* renamed from: b, reason: collision with root package name */
    public long f139186b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList<TV0.a> f139187c = new ArrayList<>();

    @Inject
    public f(@k C48734a c48734a) {
        this.f139185a = c48734a;
    }

    @Override // com.avito.android.developments_catalog.residential_complex_search.e
    @k
    public final UV0.c a(@k List list) {
        ArrayList<TV0.a> arrayList = this.f139187c;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42440b c42440b = (C42440b) it.next();
            long j12 = this.f139186b;
            this.f139186b = 1 + j12;
            arrayList.add(new com.avito.android.developments_catalog.residential_complex_search.adapter.title.c(j12, c42440b));
        }
        if (this.f139185a.f439669d) {
            long j13 = this.f139186b;
            this.f139186b = 1 + j13;
            arrayList.add(new com.avito.android.developments_catalog.residential_complex_search.adapter.button.c(j13));
        }
        return new UV0.c(arrayList);
    }
}
