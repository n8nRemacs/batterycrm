package com.avito.android.publish.screen.step.wizard.mvi;

import Pe0.InterfaceC14777a;
import Pe0.InterfaceC14778b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.screen.step.wizard.mvi.entity.WizardState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WizardActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LPe0/a;", "LPe0/b;", "Lcom/avito/android/publish/screen/step/wizard/mvi/entity/WizardState;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC14777a, InterfaceC14778b, WizardState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.wizard.data.a f242525a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f242526b;

    @Inject
    public d(@Y61.k com.avito.android.publish.screen.step.wizard.data.a aVar, @Y61.k InterfaceC33535v interfaceC33535v) {
        this.f242525a = aVar;
        this.f242526b = interfaceC33535v;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.publish.screen.step.wizard.mvi.d r5, kotlinx.coroutines.flow.InterfaceC43172j r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.avito.android.publish.screen.step.wizard.mvi.a
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.publish.screen.step.wizard.mvi.a r0 = (com.avito.android.publish.screen.step.wizard.mvi.a) r0
            int r1 = r0.f242515t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f242515t = r1
            goto L1b
        L16:
            com.avito.android.publish.screen.step.wizard.mvi.a r0 = new com.avito.android.publish.screen.step.wizard.mvi.a
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r5 = r0.f242513r
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f242515t
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L38
            if (r1 != r3) goto L30
            kotlin.C42729a0.b(r5)
            goto L5e
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlinx.coroutines.flow.j r6 = r0.f242512q
            kotlin.C42729a0.b(r5)
            goto L51
        L3e:
            kotlin.C42729a0.b(r5)
            Pe0.b$h r5 = new Pe0.b$h
            r5.<init>(r2)
            r0.f242512q = r6
            r0.f242515t = r4
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r7) goto L51
            goto L60
        L51:
            Pe0.b$c r5 = Pe0.InterfaceC14778b.c.f13196a
            r0.f242512q = r2
            r0.f242515t = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r7) goto L5e
            goto L60
        L5e:
            kotlin.G0 r7 = kotlin.G0.f406611a
        L60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.wizard.mvi.d.c(com.avito.android.publish.screen.step.wizard.mvi.d, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14778b> b(InterfaceC14777a interfaceC14777a, WizardState wizardState) {
        InterfaceC14777a interfaceC14777a2 = interfaceC14777a;
        WizardState wizardState2 = wizardState;
        if (interfaceC14777a2.equals(InterfaceC14777a.C0853a.f13190a)) {
            return C43175k.G(new b(this, wizardState2, null));
        }
        if (interfaceC14777a2 instanceof InterfaceC14777a.d) {
            return C43175k.G(new c(wizardState2, this, (InterfaceC14777a.d) interfaceC14777a2, null));
        }
        if (interfaceC14777a2 instanceof InterfaceC14777a.c) {
            return new C43210w(new InterfaceC14778b.e(((InterfaceC14777a.c) interfaceC14777a2).f13192a));
        }
        if (interfaceC14777a2.equals(InterfaceC14777a.b.f13191a)) {
            return new C43210w(InterfaceC14778b.d.f13197a);
        }
        if (interfaceC14777a2.equals(InterfaceC14777a.e.f13194a)) {
            return this.f242525a.load();
        }
        throw new NoWhenBranchMatchedException();
    }
}
