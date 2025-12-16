package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dz.C39832c;
import dz.InterfaceC39830a;
import dz.InterfaceC39831b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.Z1;
import xD.C49818a;

/* compiled from: EmployeeModeStateUpdater.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/state/y;", "Lcom/avito/android/employee_mode_impl/manager/state/x;", "a", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class y implements x {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f147539i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f147540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.employee_mode_impl.manager.domain.c f147541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.employee_mode_impl.manager.domain.g f147542c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f147543d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final r f147544e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final u f147545f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C49818a f147546g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.employee_mode_impl.manager.storage.c f147547h;

    /* compiled from: EmployeeModeStateUpdater.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/state/y$a;", "", "<init>", "()V", "", "INFO_CACHE_ALIVE_MS", "J", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public y(@Y61.k R0 r02, @Y61.k com.avito.android.employee_mode_impl.manager.domain.c cVar, @Y61.k com.avito.android.employee_mode_impl.manager.domain.g gVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k r rVar, @Y61.k u uVar, @Y61.k C49818a c49818a, @Y61.k com.avito.android.employee_mode_impl.manager.storage.c cVar2) {
        this.f147540a = r02;
        this.f147541b = cVar;
        this.f147542c = gVar;
        this.f147543d = interfaceC28373a;
        this.f147544e = rVar;
        this.f147545f = uVar;
        this.f147546g = c49818a;
        this.f147547h = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.employee_mode_impl.manager.state.y r4, kotlinx.coroutines.flow.Z1 r5, dz.InterfaceC39830a.e r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.avito.android.employee_mode_impl.manager.state.z
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.employee_mode_impl.manager.state.z r0 = (com.avito.android.employee_mode_impl.manager.state.z) r0
            int r1 = r0.f147553v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f147553v = r1
            goto L1b
        L16:
            com.avito.android.employee_mode_impl.manager.state.z r0 = new com.avito.android.employee_mode_impl.manager.state.z
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f147551t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f147553v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            dz.a$e r6 = r0.f147550s
            kotlinx.coroutines.flow.Z1 r5 = r0.f147549r
            com.avito.android.employee_mode_impl.manager.state.y r4 = r0.f147548q
            kotlin.C42729a0.b(r7)
            goto L53
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.C42729a0.b(r7)
            jz.d r7 = r6.f394191a
            boolean r7 = r7.f405977b
            if (r7 == 0) goto L53
            r0.f147548q = r4
            r0.f147549r = r5
            r0.f147550s = r6
            r0.f147553v = r3
            r7 = 0
            java.lang.Object r7 = r4.e(r5, r3, r7, r0)
            if (r7 != r1) goto L53
            goto L90
        L53:
            dz.b$e r7 = new dz.b$e
            jz.d r0 = r6.f394191a
            jz.b r0 = r0.f405976a
            r7.<init>(r0)
            r4.getClass()
        L5f:
            java.lang.Object r0 = r5.getValue()
            r1 = r0
            dz.c r1 = (dz.C39832c) r1
            com.avito.android.employee_mode_impl.manager.state.r r2 = r4.f147544e
            dz.c r1 = r2.a(r7, r1)
            boolean r0 = r5.N3(r0, r1)
            if (r0 == 0) goto L5f
            java.lang.Object r5 = r5.getValue()
            dz.c r5 = (dz.C39832c) r5
            jz.a r5 = r5.f394202a
            jz.c r5 = r5.f405963a
            boolean r5 = r5 instanceof jz.InterfaceC42452c.a
            jz.d r6 = r6.f394191a
            if (r5 == 0) goto L90
            bz.a r5 = new bz.a
            jz.b r7 = r6.f405976a
            com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource r6 = r6.f405978c
            r5.<init>(r7, r6)
            com.avito.android.analytics.a r4 = r4.f147543d
            r4.c(r5)
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.y.b(com.avito.android.employee_mode_impl.manager.state.y, kotlinx.coroutines.flow.Z1, dz.a$e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.employee_mode_impl.manager.state.y r18, kotlinx.coroutines.flow.Z1 r19, dz.InterfaceC39830a.c r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.y.c(com.avito.android.employee_mode_impl.manager.state.y, kotlinx.coroutines.flow.Z1, dz.a$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.employee_mode_impl.manager.state.x
    @Y61.l
    public final Object a(@Y61.k Z1 z12, @Y61.k InterfaceC39830a interfaceC39830a, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f147540a.c(), new A(z12, interfaceC39830a, this, null), suspendLambda);
    }

    public final void d(Z1<C39832c> z12, InterfaceC39831b interfaceC39831b) {
        C39832c value;
        do {
            value = z12.getValue();
        } while (!z12.N3(value, this.f147544e.a(interfaceC39831b, value)));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlinx.coroutines.flow.Z1 r19, boolean r20, boolean r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.y.e(kotlinx.coroutines.flow.Z1, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
