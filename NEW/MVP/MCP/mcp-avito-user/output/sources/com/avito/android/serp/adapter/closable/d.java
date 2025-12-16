package com.avito.android.serp.adapter.closable;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.i;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: ClosedItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/closable/d;", "Lcom/avito/android/serp/adapter/closable/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.closable.a f269418a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f269419b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f269420c = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: d, reason: collision with root package name */
    @l
    public Object f269421d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public UV0.a<? extends TV0.a> f269422e;

    public d(@k com.avito.android.serp.adapter.closable.a aVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f269418a = aVar;
        this.f269419b = interfaceC35745a5;
    }

    @Override // com.avito.android.serp.adapter.closable.c
    public final void a(@k e eVar) {
        this.f269421d = eVar;
        I0 i0J0 = this.f269418a.getF269417a().j0(this.f269419b.e());
        g gVar = new g() { // from class: com.avito.android.serp.adapter.closable.d.a
            /* JADX WARN: Type inference failed for: r3v4, types: [com.avito.android.serp.adapter.closable.e, java.lang.Object] */
            @Override // l41.g
            public final void accept(Object obj) {
                String str = (String) obj;
                d dVar = d.this;
                UV0.a<? extends TV0.a> aVar = dVar.f269422e;
                if (aVar != null) {
                    int i12 = 0;
                    for (Object obj2 : com.avito.konveyor.util.g.b(aVar)) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        TV0.a aVar2 = (TV0.a) obj2;
                        if (aVar2 instanceof i) {
                            i iVar = (i) aVar2;
                            if (L.f(iVar.getF260304b(), str)) {
                                iVar.setHidden(true);
                                ?? r32 = dVar.f269421d;
                                if (r32 != 0) {
                                    r32.C3(i12);
                                }
                            }
                        }
                        i12 = i13;
                    }
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f269420c.b(i0J0.v0(gVar, new g() { // from class: com.avito.android.serp.adapter.closable.d.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.serp.adapter.closable.c
    public final void c(@k UV0.a<? extends TV0.a> aVar) {
        this.f269422e = aVar;
    }

    @Override // com.avito.android.serp.adapter.closable.c
    public final void e0() {
        this.f269420c.e();
        this.f269421d = null;
    }
}
