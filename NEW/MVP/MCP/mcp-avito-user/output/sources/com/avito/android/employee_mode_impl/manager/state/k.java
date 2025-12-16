package com.avito.android.employee_mode_impl.manager.state;

import androidx.compose.runtime.C22026a;
import dz.C39832c;
import jz.C42450a;
import jz.InterfaceC42452c;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: EmployeeModeStateHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/state/k;", "Lcom/avito/android/employee_mode_impl/manager/state/a;", "a", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements InterfaceC30338a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.employee_mode_impl.manager.storage.c f147505a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f147506b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f147507c = new kotlinx.coroutines.sync.d();

    /* compiled from: EmployeeModeStateHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/state/k$a;", "", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f147508a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f147509b;

        public a(@Y61.l String str, @Y61.l String str2) {
            this.f147508a = str;
            this.f147509b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f147508a, aVar.f147508a) && L.f(this.f147509b, aVar.f147509b);
        }

        public final int hashCode() {
            String str = this.f147508a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f147509b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitialData(startProfileId=");
            sb2.append(this.f147508a);
            sb2.append(", startProfileHashId=");
            return C22026a.c(sb2, this.f147509b, ')');
        }
    }

    /* compiled from: EmployeeModeStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "Ldz/c;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Z1<C39832c>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f147511m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f147511m = aVar;
        }

        @Override // Y41.a
        public final Z1<C39832c> invoke() {
            C39832c c39832c;
            k kVar = k.this;
            kVar.getClass();
            a aVar = this.f147511m;
            String str = aVar.f147508a;
            String str2 = aVar.f147509b;
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                InterfaceC42452c.b bVar = InterfaceC42452c.b.f405973a;
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                c39832c = new C39832c(new C42450a(str, str2, bVar), null, null, 0L, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
            } else {
                c39832c = new C39832c(new C42450a(str, str2, kVar.f147505a.d(new com.avito.android.employee_mode_impl.manager.storage.d(str))), null, null, 0L, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
            }
            return p2.a(c39832c);
        }
    }

    public k(@Y61.k com.avito.android.employee_mode_impl.manager.storage.c cVar, @Y61.k a aVar) {
        this.f147505a = cVar;
        this.f147506b = C42727D.c(new b(aVar));
    }

    @Override // com.avito.android.employee_mode_impl.manager.state.InterfaceC30338a
    @Y61.k
    public final C42450a a() {
        return ((C39832c) ((Z1) this.f147506b.getValue()).getValue()).f394202a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.employee_mode_impl.manager.state.l
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.employee_mode_impl.manager.state.l r0 = (com.avito.android.employee_mode_impl.manager.state.l) r0
            int r1 = r0.f147516u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147516u = r1
            goto L18
        L13:
            com.avito.android.employee_mode_impl.manager.state.l r0 = new com.avito.android.employee_mode_impl.manager.state.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f147514s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f147516u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.d r1 = r0.f147513r
            com.avito.android.employee_mode_impl.manager.state.k r0 = r0.f147512q
            kotlin.C42729a0.b(r5)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            kotlinx.coroutines.sync.d r5 = r4.f147507c
            r0.f147512q = r4
            r0.f147513r = r5
            r0.f147516u = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r4
            r1 = r5
        L49:
            r5 = 0
            kotlin.C r0 = r0.f147506b     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L5c
            kotlinx.coroutines.flow.Z1 r0 = (kotlinx.coroutines.flow.Z1) r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L5c
            dz.c r0 = (dz.C39832c) r0     // Catch: java.lang.Throwable -> L5c
            r1.d(r5)
            return r0
        L5c:
            r0 = move-exception
            r1.d(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.k.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k Y41.p r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.avito.android.employee_mode_impl.manager.state.m
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.employee_mode_impl.manager.state.m r0 = (com.avito.android.employee_mode_impl.manager.state.m) r0
            int r1 = r0.f147522v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147522v = r1
            goto L18
        L13:
            com.avito.android.employee_mode_impl.manager.state.m r0 = new com.avito.android.employee_mode_impl.manager.state.m
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f147520t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f147522v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f147517q
            kotlinx.coroutines.sync.a r8 = (kotlinx.coroutines.sync.a) r8
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L72
        L31:
            r9 = move-exception
            goto L7e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlinx.coroutines.sync.d r8 = r0.f147519s
            Y41.p r2 = r0.f147518r
            Y41.p r2 = (Y41.p) r2
            java.lang.Object r4 = r0.f147517q
            com.avito.android.employee_mode_impl.manager.state.k r4 = (com.avito.android.employee_mode_impl.manager.state.k) r4
            kotlin.C42729a0.b(r9)
            r9 = r8
            r8 = r2
            goto L60
        L4b:
            kotlin.C42729a0.b(r9)
            kotlinx.coroutines.sync.d r9 = r7.f147507c
            r0.f147517q = r7
            r0.f147518r = r8
            r0.f147519s = r9
            r0.f147522v = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r4 = r7
        L60:
            r0.f147517q = r9     // Catch: java.lang.Throwable -> L7c
            r0.f147518r = r5     // Catch: java.lang.Throwable -> L7c
            r0.f147519s = r5     // Catch: java.lang.Throwable -> L7c
            r0.f147522v = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r8 = r4.e(r8, r0)     // Catch: java.lang.Throwable -> L7c
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r6 = r9
            r9 = r8
            r8 = r6
        L72:
            dz.c r9 = (dz.C39832c) r9     // Catch: java.lang.Throwable -> L31
            r8.d(r5)
            return r9
        L78:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L7e
        L7c:
            r8 = move-exception
            goto L78
        L7e:
            r8.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.k.c(Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.employee_mode_impl.manager.state.o
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.employee_mode_impl.manager.state.o r0 = (com.avito.android.employee_mode_impl.manager.state.o) r0
            int r1 = r0.f147531t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147531t = r1
            goto L18
        L13:
            com.avito.android.employee_mode_impl.manager.state.o r0 = new com.avito.android.employee_mode_impl.manager.state.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f147529r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f147531t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.employee_mode_impl.manager.state.k r0 = r0.f147528q
            kotlin.C42729a0.b(r5)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            jz.a r5 = r4.a()
            jz.c r5 = r5.f405963a
            boolean r5 = r5 instanceof jz.InterfaceC42452c.a
            if (r5 == 0) goto L4b
            r0.f147528q = r4
            r0.f147531t = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            com.avito.android.employee_mode_impl.manager.storage.c r5 = r0.f147505a
            java.util.LinkedHashMap r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.k.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k Y41.p r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.employee_mode_impl.manager.state.p
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.employee_mode_impl.manager.state.p r0 = (com.avito.android.employee_mode_impl.manager.state.p) r0
            int r1 = r0.f147535t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147535t = r1
            goto L18
        L13:
            com.avito.android.employee_mode_impl.manager.state.p r0 = new com.avito.android.employee_mode_impl.manager.state.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f147533r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f147535t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.employee_mode_impl.manager.state.k r5 = r0.f147532q
            kotlin.C42729a0.b(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            kotlin.C r6 = r4.f147506b
            java.lang.Object r6 = r6.getValue()
            kotlinx.coroutines.flow.Z1 r6 = (kotlinx.coroutines.flow.Z1) r6
            r0.f147532q = r4
            r0.f147535t = r3
            java.lang.Object r5 = r5.invoke(r6, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            kotlin.C r6 = r5.f147506b
            java.lang.Object r6 = r6.getValue()
            kotlinx.coroutines.flow.Z1 r6 = (kotlinx.coroutines.flow.Z1) r6
            java.lang.Object r6 = r6.getValue()
            dz.c r6 = (dz.C39832c) r6
            jz.a r0 = r6.f394202a
            java.lang.String r0 = r0.f405964b
            int r0 = r0.length()
            com.avito.android.employee_mode_impl.manager.storage.c r5 = r5.f147505a
            if (r0 != 0) goto L68
            r5.c()
            goto L76
        L68:
            com.avito.android.employee_mode_impl.manager.storage.d r0 = new com.avito.android.employee_mode_impl.manager.storage.d
            jz.a r1 = r6.f394202a
            java.lang.String r2 = r1.f405964b
            r0.<init>(r2)
            jz.c r1 = r1.f405963a
            r5.a(r0, r1)
        L76:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.k.e(Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
