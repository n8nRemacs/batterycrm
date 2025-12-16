package com.avito.android.sbc.autodispatches.mvi;

import Po0.InterfaceC14819c;
import Po0.InterfaceC14820d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SbcAutoDispatchesReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/autodispatches/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "LPo0/c;", "LPo0/d;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements u<InterfaceC14819c, InterfaceC14820d> {
    @Inject
    public k() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Po0.InterfaceC14820d a(Po0.InterfaceC14819c r7, Po0.InterfaceC14820d r8) {
        /*
            r6 = this;
            Po0.c r7 = (Po0.InterfaceC14819c) r7
            Po0.d r8 = (Po0.InterfaceC14820d) r8
            boolean r0 = r7 instanceof Po0.InterfaceC14819c.b
            if (r0 == 0) goto Lc
            Po0.d$d r8 = Po0.InterfaceC14820d.C0867d.f13300a
            goto L93
        Lc:
            boolean r0 = r7 instanceof Po0.InterfaceC14819c.a
            if (r0 == 0) goto L14
            Po0.d$b r8 = Po0.InterfaceC14820d.b.f13296a
            goto L93
        L14:
            boolean r0 = r7 instanceof Po0.InterfaceC14819c.C0866c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            Po0.c$c r7 = (Po0.InterfaceC14819c.C0866c) r7
            java.util.List<com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut> r0 = r7.f13288a
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            Po0.e r0 = new Po0.e
            java.lang.String r3 = "Активные"
            r4 = 1
            r0.<init>(r3, r2, r4)
            r8.add(r0)
        L37:
            java.util.List<com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut> r0 = r7.f13289b
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5b
            Po0.e r0 = new Po0.e
            java.lang.String r3 = "Завершённые"
            r4 = 2
            r0.<init>(r3, r1, r4)
            r8.add(r0)
            boolean r7 = r7.f13290c
            if (r7 == 0) goto L5b
            int r7 = r8.size()
            int r7 = r7 - r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L5c
        L5b:
            r7 = 0
        L5c:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L65
            Po0.d$a r8 = Po0.InterfaceC14820d.a.f13295a
            goto L93
        L65:
            Po0.d$c r0 = new Po0.d$c
            r0.<init>(r8, r7, r1)
            r8 = r0
            goto L93
        L6c:
            boolean r0 = r7 instanceof Po0.InterfaceC14819c.e
            if (r0 == 0) goto L7b
            boolean r7 = r8 instanceof Po0.InterfaceC14820d.c
            if (r7 == 0) goto L93
            Po0.d$c r8 = (Po0.InterfaceC14820d.c) r8
            Po0.d$c r8 = Po0.InterfaceC14820d.c.a(r8, r2)
            goto L93
        L7b:
            boolean r0 = r7 instanceof Po0.InterfaceC14819c.d
            if (r0 == 0) goto L8a
            boolean r7 = r8 instanceof Po0.InterfaceC14820d.c
            if (r7 == 0) goto L93
            Po0.d$c r8 = (Po0.InterfaceC14820d.c) r8
            Po0.d$c r8 = Po0.InterfaceC14820d.c.a(r8, r1)
            goto L93
        L8a:
            boolean r0 = r7 instanceof Po0.InterfaceC14819c.f
            if (r0 == 0) goto L8f
            goto L93
        L8f:
            boolean r7 = r7 instanceof Po0.InterfaceC14819c.g
            if (r7 == 0) goto L94
        L93:
            return r8
        L94:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.autodispatches.mvi.k.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
