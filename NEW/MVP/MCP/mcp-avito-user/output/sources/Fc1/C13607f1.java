package Fc1;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import xyz.n.a.ke;

@Singleton
@kotlin.jvm.internal.s0
/* renamed from: Fc1.f1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13607f1 {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public T1 f5493a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public InterfaceC13753v4 f5494b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public Context f5495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5496d = C42727D.c(new a());

    /* renamed from: Fc1.f1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<com.android.volley.u> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.android.volley.u invoke() {
            com.android.volley.toolbox.q qVar;
            try {
                qVar = new com.android.volley.toolbox.q(new C4());
            } catch (Exception unused) {
                qVar = new com.android.volley.toolbox.q();
            }
            Context context = C13607f1.this.f5495c;
            if (context == null) {
                context = null;
            }
            return com.android.volley.toolbox.M.a(context, qVar);
        }
    }

    @Inject
    public C13607f1() {
    }

    public final com.android.volley.u a() {
        return (com.android.volley.u) this.f5496d.getValue();
    }

    @Y61.l
    public final Object b(int i12, @Y61.k ArrayList arrayList, @Y61.k C13578c c13578c) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(c13578c));
        rVar.p();
        T1 t12 = this.f5493a;
        if (t12 == null) {
            t12 = null;
        }
        D1 d1A = t12.a(ke.CHECK_ATTRIBUTES);
        LinkedHashMap linkedHashMap = d1A.f4847d;
        linkedHashMap.put("{campaignId}", String.valueOf(i12));
        InterfaceC13753v4 interfaceC13753v4 = this.f5494b;
        linkedHashMap.put("{debug}", String.valueOf((interfaceC13753v4 != null ? interfaceC13753v4 : null).c()));
        a().a(new C13787z2(arrayList, d1A.a(), rVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c13578c);
        }
        return objO;
    }

    @Y61.l
    public final Object c(@Y61.k B5 b52) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(b52));
        rVar.p();
        T1 t12 = this.f5493a;
        if (t12 == null) {
            t12 = null;
        }
        a().a(new A6(1, t12.a(ke.GET_TOGGLES).a(), rVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(b52);
        }
        return objO;
    }
}
