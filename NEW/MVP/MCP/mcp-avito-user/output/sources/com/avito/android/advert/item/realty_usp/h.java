package com.avito.android.advert.item.realty_usp;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import y6.InterfaceC50067a;
import z6.InterfaceC50378a;

/* compiled from: RealtyUspPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/h;", "Lcom/avito/android/advert/item/realty_usp/g;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50067a f78400b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f78401c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f78402d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43238h f78403e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f78404f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f78405g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public N0 f78406h;

    /* compiled from: RealtyUspPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/h$a;", "", "<init>", "()V", "", "KEY_CHIPS_EXPANDED", "Ljava/lang/String;", "KEY_CHIPS_SHOW_LOGGED", "", "VISITED_IDS_MAX_COUNT", "I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public h(@InterfaceC50378a @Y61.l Kundle kundle, @Y61.k InterfaceC50067a interfaceC50067a, @Y61.k c cVar, @Y61.k E e12, @Y61.k R0 r02) {
        Boolean boolA;
        Boolean boolA2;
        this.f78400b = interfaceC50067a;
        this.f78401c = cVar;
        this.f78402d = e12;
        this.f78403e = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        boolean zBooleanValue = false;
        this.f78404f = (kundle == null || (boolA2 = kundle.a("KEY_CHIPS_EXPANDED")) == null) ? false : boolA2.booleanValue();
        if (kundle != null && (boolA = kundle.a("KEY_CHIPS_SHOW_LOGGED")) != null) {
            zBooleanValue = boolA.booleanValue();
        }
        this.f78405g = zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.android.advert.item.realty_usp.h r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof com.avito.android.advert.item.realty_usp.j
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.advert.item.realty_usp.j r0 = (com.avito.android.advert.item.realty_usp.j) r0
            int r1 = r0.f78413t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78413t = r1
            goto L18
        L13:
            com.avito.android.advert.item.realty_usp.j r0 = new com.avito.android.advert.item.realty_usp.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f78411r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78413t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f78410q
            kotlin.C42729a0.b(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.C42729a0.b(r6)
            r0.f78410q = r5
            r0.f78413t = r3
            com.avito.android.advert.item.realty_usp.c r4 = r4.f78401c
            java.util.Set r6 = r4.d()
            if (r6 != r1) goto L43
            goto L5b
        L43:
            java.util.Set r6 = (java.util.Set) r6
            r4 = r6
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r0 = 3
            if (r4 >= r0) goto L56
            boolean r4 = r6.contains(r5)
            if (r4 != 0) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.realty_usp.h.k(com.avito.android.advert.item.realty_usp.h, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        RealtyUspItem realtyUspItem = (RealtyUspItem) aVar;
        mVar.u3(this.f78404f ? Integer.MAX_VALUE : realtyUspItem.f78388f);
        mVar.C1(realtyUspItem.f78387e);
        mVar.HX(new i(this, mVar, realtyUspItem));
        if (!this.f78405g) {
            this.f78400b.b(realtyUspItem.f78389g);
            this.f78405g = true;
        }
        N0 n02 = this.f78406h;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f78406h = C43259k.d(this.f78403e, null, null, new k(this, realtyUspItem, mVar, null), 3);
    }

    @Override // com.avito.android.advert.item.realty_usp.g
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.h(Boolean.valueOf(this.f78404f), "KEY_CHIPS_EXPANDED");
        kundle.h(Boolean.valueOf(this.f78405g), "KEY_CHIPS_SHOW_LOGGED");
        return kundle;
    }
}
