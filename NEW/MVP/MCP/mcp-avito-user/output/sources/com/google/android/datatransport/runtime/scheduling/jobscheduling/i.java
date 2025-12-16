package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import GX0.a;
import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.n;
import com.google.android.datatransport.runtime.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* compiled from: Uploader.java */
/* loaded from: classes10.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f343204a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.backends.e f343205b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.d f343206c;

    /* renamed from: d, reason: collision with root package name */
    public final m f343207d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f343208e;

    /* renamed from: f, reason: collision with root package name */
    public final GX0.a f343209f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343210g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343211h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.c f343212i;

    @Inject
    public i(Context context, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, m mVar, Executor executor, GX0.a aVar, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar2, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar3, com.google.android.datatransport.runtime.scheduling.persistence.c cVar) {
        this.f343204a = context;
        this.f343205b = eVar;
        this.f343206c = dVar;
        this.f343207d = mVar;
        this.f343208e = executor;
        this.f343209f = aVar;
        this.f343210g = aVar2;
        this.f343211h = aVar3;
        this.f343212i = cVar;
    }

    @RestrictTo
    public final void a(final r rVar, int i12) {
        BackendResponse backendResponseA;
        com.google.android.datatransport.runtime.backends.m mVar = this.f343205b.get(rVar.b());
        BackendResponse.e(0L);
        final long jMax = 0;
        while (true) {
            final int i13 = 0;
            a.InterfaceC0354a interfaceC0354a = new a.InterfaceC0354a(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f343195c;

                {
                    this.f343195c = this;
                }

                @Override // GX0.a.InterfaceC0354a
                public final Object execute() {
                    switch (i13) {
                        case 0:
                            return Boolean.valueOf(this.f343195c.f343206c.v2(rVar));
                        default:
                            return this.f343195c.f343206c.A5(rVar);
                    }
                }
            };
            GX0.a aVar = this.f343209f;
            if (!((Boolean) aVar.b(interfaceC0354a)).booleanValue()) {
                aVar.b(new h(this, jMax, rVar));
                return;
            }
            final int i14 = 1;
            final Iterable iterable = (Iterable) aVar.b(new a.InterfaceC0354a(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f343195c;

                {
                    this.f343195c = this;
                }

                @Override // GX0.a.InterfaceC0354a
                public final Object execute() {
                    switch (i14) {
                        case 0:
                            return Boolean.valueOf(this.f343195c.f343206c.v2(rVar));
                        default:
                            return this.f343195c.f343206c.A5(rVar);
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (mVar == null) {
                DX0.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", rVar);
                backendResponseA = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.k) it.next()).a());
                }
                if (rVar.c() != null) {
                    com.google.android.datatransport.runtime.scheduling.persistence.c cVar = this.f343212i;
                    Objects.requireNonNull(cVar);
                    CX0.a aVar2 = (CX0.a) aVar.b(new com.avito.android.str_seller_orders.orders_seller.d(cVar, 18));
                    j.a aVarA = com.google.android.datatransport.runtime.j.a();
                    aVarA.f(this.f343210g.O());
                    aVarA.h(this.f343211h.O());
                    aVarA.g("GDT_CLIENT_METRICS");
                    com.google.android.datatransport.c cVar2 = new com.google.android.datatransport.c("proto");
                    aVar2.getClass();
                    com.google.firebase.encoders.proto.f fVar = n.f343168a;
                    fVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        fVar.a(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVarA.e(new com.google.android.datatransport.runtime.i(cVar2, byteArrayOutputStream.toByteArray()));
                    arrayList.add(mVar.b(aVarA.b()));
                }
                g.a aVarA2 = com.google.android.datatransport.runtime.backends.g.a();
                aVarA2.b(arrayList);
                aVarA2.c(rVar.c());
                backendResponseA = mVar.a(aVarA2.a());
            }
            if (backendResponseA.c() == BackendResponse.Status.f343086c) {
                aVar.b(new a.InterfaceC0354a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                    @Override // GX0.a.InterfaceC0354a
                    public final Object execute() {
                        i iVar = this.f343197b;
                        com.google.android.datatransport.runtime.scheduling.persistence.d dVar = iVar.f343206c;
                        dVar.v5(iterable);
                        dVar.X5(iVar.f343210g.O() + jMax, rVar);
                        return null;
                    }
                });
                this.f343207d.a(rVar, i12 + 1, true);
                return;
            }
            aVar.b(new com.avito.android.gig_shift_action.ui.a(15, this, iterable));
            if (backendResponseA.c() == BackendResponse.Status.f343085b) {
                jMax = Math.max(jMax, backendResponseA.b());
                if (rVar.c() != null) {
                    aVar.b(new com.avito.android.str_seller_orders.orders_seller.d(this, 20));
                }
            } else if (backendResponseA.c() == BackendResponse.Status.f343088e) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strH = ((com.google.android.datatransport.runtime.scheduling.persistence.k) it2.next()).a().h();
                    if (map.containsKey(strH)) {
                        map.put(strH, Integer.valueOf(((Integer) map.get(strH)).intValue() + 1));
                    } else {
                        map.put(strH, 1);
                    }
                }
                aVar.b(new com.avito.android.gig_shift_action.ui.a(16, this, map));
            }
        }
    }
}
