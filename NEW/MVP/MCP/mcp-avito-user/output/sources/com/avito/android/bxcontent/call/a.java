package com.avito.android.bxcontent.call;

import Y61.k;
import Y61.l;
import com.avito.android.B2;
import com.avito.android.deal_confirmation.d;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DialogsAfterCallHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/call/a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final B2 f109644a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f109645b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f109646c;

    /* renamed from: d, reason: collision with root package name */
    public long f109647d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f109648e;

    /* compiled from: DialogsAfterCallHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.call.a$a, reason: collision with other inner class name */
    public static final class C3271a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3271a f109649l = new C3271a();

        public C3271a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "Error on show dialogs after call", th2);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@l DialogsAfterCallState dialogsAfterCallState, @k B2 b22, @k d dVar) {
        this.f109644a = b22;
        this.f109645b = dVar;
        this.f109646c = dialogsAfterCallState != null ? dialogsAfterCallState.f109642b : null;
        this.f109647d = dialogsAfterCallState != null ? dialogsAfterCallState.f109643c : 0L;
        this.f109648e = new io.reactivex.rxjava3.disposables.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f109646c
            if (r0 != 0) goto L5
            return
        L5:
            long r1 = r6.f109647d
            io.reactivex.rxjava3.disposables.c r3 = r6.f109648e
            r3.e()
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r1 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L18
            goto L34
        L18:
            com.avito.android.B2 r1 = r6.f109644a
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.B2.f67184X
            r4 = 1
            r2 = r2[r4]
            com.avito.android.A0$a r1 = r1.f67209c
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L42
        L34:
            com.avito.android.deal_confirmation.d r1 = r6.f109645b
            java.lang.String r2 = "serp"
            r1.a(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
            goto L48
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
        L48:
            com.avito.android.bxcontent.call.a$a r1 = com.avito.android.bxcontent.call.a.C3271a.f109649l
            r2 = 0
            r4 = 2
            io.reactivex.rxjava3.internal.observers.m r0 = io.reactivex.rxjava3.kotlin.A1.g(r0, r1, r2, r4)
            r3.b(r0)
            r6.f109646c = r2
            r0 = 0
            r6.f109647d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.call.a.a():void");
    }
}
