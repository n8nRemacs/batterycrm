package com.avito.android.publish.details.item_wrapper;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemPostProcessor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/item_wrapper/c;", "Lcom/avito/android/publish/details/item_wrapper/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f234779a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f234780b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f234781c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f234782d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f234783e;

    @Inject
    public c(@k f fVar) {
        this.f234779a = fVar;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f234780b = cVar;
        this.f234781c = new LinkedHashMap();
        this.f234782d = new io.reactivex.rxjava3.disposables.c();
        this.f234783e = cVar;
    }

    @Override // com.avito.android.publish.details.item_wrapper.e
    public final void a(@k com.avito.conveyor_item.a aVar) {
        e eVar;
        LinkedHashMap linkedHashMap = this.f234781c;
        if (linkedHashMap.get(aVar.getF229776b()) == null) {
            e<?> eVarA = this.f234779a.a(aVar);
            if (eVarA != null) {
                this.f234782d.b(eVarA.getF234783e().t0(new b(this)));
            }
            if (eVarA != null) {
                linkedHashMap.put(aVar.getF229776b(), eVarA);
            }
        }
        if (!(aVar instanceof ParameterElement.I) || (eVar = (e) linkedHashMap.get(aVar.getF229776b())) == null) {
            return;
        }
        com.avito.android.publish.details.item_wrapper.video.e eVar2 = eVar instanceof com.avito.android.publish.details.item_wrapper.video.e ? (com.avito.android.publish.details.item_wrapper.video.e) eVar : null;
        if (eVar2 != null) {
            eVar2.d((ParameterElement.I) aVar);
        }
    }

    @Override // com.avito.android.publish.details.item_wrapper.e
    @k
    public final com.avito.conveyor_item.a b(@k com.avito.conveyor_item.a aVar) {
        LinkedHashMap linkedHashMap = this.f234781c;
        if (linkedHashMap.get(aVar.getF229776b()) == null) {
            e<?> eVarA = this.f234779a.a(aVar);
            if (eVarA != null) {
                this.f234782d.b(eVarA.getF234783e().t0(new b(this)));
            }
            if (eVarA != null) {
                linkedHashMap.put(aVar.getF229776b(), eVarA);
            }
        }
        if (!(aVar instanceof ParameterElement.I)) {
            return aVar;
        }
        e eVar = (e) linkedHashMap.get(aVar.getF229776b());
        if (eVar == null) {
            return (ParameterElement.I) aVar;
        }
        com.avito.android.publish.details.item_wrapper.video.e eVar2 = eVar instanceof com.avito.android.publish.details.item_wrapper.video.e ? (com.avito.android.publish.details.item_wrapper.video.e) eVar : null;
        ParameterElement.I i12 = (ParameterElement.I) aVar;
        if (eVar2 == null) {
            return i12;
        }
        i12.f117327h = eVar2.f234797f;
        return i12;
    }

    @Override // com.avito.android.publish.details.item_wrapper.e
    @k
    /* renamed from: c, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF234783e() {
        return this.f234783e;
    }

    @Override // com.avito.android.publish.details.item_wrapper.e
    public final void clear() {
        Iterator it = this.f234781c.values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).clear();
        }
        this.f234782d.e();
    }
}
