package com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PairElementPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/c;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/f;", "Lcom/avito/android/category_parameters/ParameterElement$x;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TV0.f<f, ParameterElement.x> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287239b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.str_calendar.seller.calandar_parameters.items.input.g f287240c;

    /* compiled from: PairElementPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/c$a;", "", "<init>", "()V", "", "NO_VALUE_STRING", "Ljava/lang/String;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super InterfaceC13931a, G0> lVar, @k com.avito.android.str_calendar.seller.calandar_parameters.items.input.g gVar) {
        this.f287239b = lVar;
        this.f287240c = gVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((f) eVar, (ParameterElement.x) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // TV0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(TV0.e r9, TV0.a r10, int r11, java.util.List r12) {
        /*
            r8 = this;
            com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f r9 = (com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f) r9
            com.avito.android.category_parameters.ParameterElement$x r10 = (com.avito.android.category_parameters.ParameterElement.x) r10
            r11 = r12
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r0 = 0
            r1 = r0
        Lf:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r11.next()
            boolean r3 = r2 instanceof com.avito.android.str_calendar.seller.calandar_parameters.C35093d
            if (r3 == 0) goto Lf
            r1 = r2
            goto Lf
        L1f:
            boolean r11 = r1 instanceof com.avito.android.str_calendar.seller.calandar_parameters.C35093d
            if (r11 != 0) goto L24
            r1 = r0
        L24:
            com.avito.android.str_calendar.seller.calandar_parameters.d r1 = (com.avito.android.str_calendar.seller.calandar_parameters.C35093d) r1
            if (r1 != 0) goto L2c
            r8.k(r9, r10)
            goto L66
        L2c:
            com.avito.android.category_parameters.ParameterElement$p r2 = r10.f117593f
            r6 = 0
            r7 = 536870909(0x1ffffffd, float:1.084202E-19)
            r3 = 0
            java.lang.String r4 = ""
            r5 = 0
            com.avito.android.category_parameters.ParameterElement$p r11 = com.avito.android.category_parameters.ParameterElement.p.f(r2, r3, r4, r5, r6, r7)
            com.avito.android.str_calendar.seller.calandar_parameters.items.input.g r1 = r8.f287240c
            r1.O(r9, r11, r12)
            com.avito.android.category_parameters.ParameterElement$C$b r10 = r10.f117594g
            java.lang.String r11 = r10.f117210f
            if (r11 == 0) goto L4f
            int r12 = r11.length()
            if (r12 != 0) goto L4c
            goto L4d
        L4c:
            r0 = r11
        L4d:
            if (r0 != 0) goto L51
        L4f:
            java.lang.String r0 = "-"
        L51:
            r9.aZ(r0)
            java.lang.String r10 = r10.f117214j
            if (r10 == 0) goto L63
            int r10 = r10.length()
            if (r10 != 0) goto L5f
            goto L63
        L5f:
            r9.AC()
            goto L66
        L63:
            r9.LT()
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.c.g2(TV0.e, TV0.a, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@Y61.k com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f r7, @Y61.k com.avito.android.category_parameters.ParameterElement.x r8) {
        /*
            r6 = this;
            com.avito.android.category_parameters.ParameterElement$p r0 = r8.f117593f
            java.lang.String r1 = r8.f117592e
            r7.ji(r1)
            r3 = 0
            r4 = 0
            r1 = 0
            java.lang.String r2 = ""
            r5 = 536870909(0x1ffffffd, float:1.084202E-19)
            com.avito.android.category_parameters.ParameterElement$p r0 = com.avito.android.category_parameters.ParameterElement.p.f(r0, r1, r2, r3, r4, r5)
            com.avito.android.str_calendar.seller.calandar_parameters.items.input.g r1 = r6.f287240c
            r1.k(r7, r0)
            com.avito.android.category_parameters.ParameterElement$C$b r8 = r8.f117594g
            java.lang.String r0 = r8.f117210f
            if (r0 == 0) goto L27
            int r1 = r0.length()
            if (r1 != 0) goto L25
            r0 = 0
        L25:
            if (r0 != 0) goto L29
        L27:
            java.lang.String r0 = "-"
        L29:
            r7.aZ(r0)
            java.lang.String r0 = r8.f117214j
            if (r0 == 0) goto L3b
            int r0 = r0.length()
            if (r0 != 0) goto L37
            goto L3b
        L37:
            r7.AC()
            goto L3e
        L3b:
            r7.LT()
        L3e:
            com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.d r0 = new com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.d
            r0.<init>(r6, r8, r7)
            r7.ds(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.c.k(com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f, com.avito.android.category_parameters.ParameterElement$x):void");
    }
}
