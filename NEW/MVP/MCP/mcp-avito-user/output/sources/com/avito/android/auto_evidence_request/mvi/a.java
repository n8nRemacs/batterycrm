package com.avito.android.auto_evidence_request.mvi;

import Ce.C13296d;
import Ce.InterfaceC13293a;
import Ce.InterfaceC13295c;
import android.net.Uri;
import com.avito.android.arch.mvi.a;
import com.avito.android.auto_evidence_request.di.o;
import com.avito.android.auto_evidence_request.s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoEvidenceRequestActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auto_evidence_request/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LCe/a;", "LCe/c;", "LCe/d;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13293a, InterfaceC13295c, C13296d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auto_evidence_request.files.f f95251a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auto_evidence_request.d f95252b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f95253c;

    @Inject
    public a(@Y61.k com.avito.android.auto_evidence_request.files.f fVar, @Y61.k com.avito.android.auto_evidence_request.d dVar, @Y61.k @o String str) {
        this.f95251a = fVar;
        this.f95252b = dVar;
        this.f95253c = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC13295c> b(InterfaceC13293a interfaceC13293a, C13296d c13296d) {
        InterfaceC13293a interfaceC13293a2 = interfaceC13293a;
        if (interfaceC13293a2 instanceof InterfaceC13293a.b) {
            return new C43210w(new InterfaceC13295c.i(((InterfaceC13293a.b) interfaceC13293a2).f2497a));
        }
        if (interfaceC13293a2 instanceof InterfaceC13293a.k) {
            return new C43210w(new InterfaceC13295c.k(Uri.parse(((InterfaceC13293a.k) interfaceC13293a2).f2517a)));
        }
        if (interfaceC13293a2 instanceof InterfaceC13293a.j) {
            InterfaceC13293a.j jVar = (InterfaceC13293a.j) interfaceC13293a2;
            return new C43210w(new InterfaceC13295c.j(jVar.f2514b, jVar.f2513a, jVar.f2516d, jVar.f2515c));
        }
        boolean z12 = interfaceC13293a2 instanceof InterfaceC13293a.f;
        com.avito.android.auto_evidence_request.files.f fVar = this.f95251a;
        if (z12) {
            fVar.b();
            return fVar.f(((InterfaceC13293a.f) interfaceC13293a2).f2507a);
        }
        if (interfaceC13293a2 instanceof InterfaceC13293a.d) {
            InterfaceC13293a.d dVar = (InterfaceC13293a.d) interfaceC13293a2;
            return fVar.d(dVar.f2502a, dVar.f2503b, dVar.f2504c);
        }
        if (interfaceC13293a2 instanceof InterfaceC13293a.e) {
            fVar.e(null);
            InterfaceC13293a.e eVar = (InterfaceC13293a.e) interfaceC13293a2;
            return new C43210w(new InterfaceC13295c.g(eVar.f2505a, eVar.f2506b));
        }
        if (interfaceC13293a2 instanceof InterfaceC13293a.C0116a) {
            InterfaceC13293a.C0116a c0116a = (InterfaceC13293a.C0116a) interfaceC13293a2;
            fVar.e(c0116a.f2495b);
            s.a aVar = c0116a.f2494a;
            return new C43210w(new InterfaceC13295c.e(aVar != null ? aVar.f95282a : null, c0116a.f2496c));
        }
        if (interfaceC13293a2 instanceof InterfaceC13293a.c) {
            InterfaceC13293a.c cVar = (InterfaceC13293a.c) interfaceC13293a2;
            fVar.e(cVar.f2500c);
            s.b bVar = cVar.f2498a;
            return fVar.c(bVar != null ? bVar.f95283a : null, cVar.f2499b, cVar.f2501d);
        }
        if (interfaceC13293a2 instanceof InterfaceC13293a.h) {
            return fVar.a(((InterfaceC13293a.h) interfaceC13293a2).f2511a);
        }
        if (interfaceC13293a2 instanceof InterfaceC13293a.i) {
            fVar.e(null);
            return new C43210w(InterfaceC13295c.b.f2531a);
        }
        if (interfaceC13293a2.equals(InterfaceC13293a.g.f2510a)) {
            return this.f95252b.a(this.f95253c);
        }
        throw new NoWhenBranchMatchedException();
    }
}
