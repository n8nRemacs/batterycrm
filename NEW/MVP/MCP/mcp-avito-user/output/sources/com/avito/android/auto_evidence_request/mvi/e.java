package com.avito.android.auto_evidence_request.mvi;

import Ce.InterfaceC13294b;
import Ce.InterfaceC13295c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoEvidenceRequestEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_evidence_request/mvi/e;", "Lcom/avito/android/arch/mvi/t;", "LCe/c;", "LCe/b;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements t<InterfaceC13295c, InterfaceC13294b> {
    @Inject
    public e() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13294b b(InterfaceC13295c interfaceC13295c) {
        InterfaceC13295c interfaceC13295c2 = interfaceC13295c;
        if (interfaceC13295c2 instanceof InterfaceC13295c.i) {
            return new InterfaceC13294b.c(((InterfaceC13295c.i) interfaceC13295c2).f2540a);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.k) {
            return new InterfaceC13294b.e(((InterfaceC13295c.k) interfaceC13295c2).f2545a);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.j) {
            InterfaceC13295c.j jVar = (InterfaceC13295c.j) interfaceC13295c2;
            return new InterfaceC13294b.d(jVar.f2542b, jVar.f2541a, jVar.f2544d, jVar.f2543c);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.e) {
            return new InterfaceC13294b.g(((InterfaceC13295c.e) interfaceC13295c2).f2533a);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.f) {
            return new InterfaceC13294b.h(((InterfaceC13295c.f) interfaceC13295c2).f2535a);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.a) {
            return new InterfaceC13294b.a(((InterfaceC13295c.a) interfaceC13295c2).f2530a);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.b) {
            return InterfaceC13294b.C0117b.f2519a;
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.C0118c) {
            return new InterfaceC13294b.i(((InterfaceC13295c.C0118c) interfaceC13295c2).f2532a);
        }
        if (interfaceC13295c2 instanceof InterfaceC13295c.p) {
            return new InterfaceC13294b.f(((InterfaceC13295c.p) interfaceC13295c2).f2556a);
        }
        return null;
    }
}
