package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ToStringParams.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {

    /* compiled from: ToStringParams.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f165592l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "State";
        }
    }

    /* compiled from: ToStringParams.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacState f165593l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IacState iacState) {
            super(0);
            this.f165593l = iacState;
        }

        @Override // Y41.a
        public final String invoke() {
            return "[" + this.f165593l.getIndex() + ']';
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(@Y61.k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r11) {
        /*
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.k$a r0 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.k.a.f165592l
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.k$b r1 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.k$b
            r1.<init>(r11)
            java.lang.Class r2 = r11.getClass()
            kotlin.jvm.internal.n0 r3 = kotlin.jvm.internal.m0.f406844a
            kotlin.reflect.d r2 = r3.b(r2)
            java.lang.Class<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState> r4 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.class
            kotlin.reflect.d r3 = r3.b(r4)
            java.lang.String r3 = r3.p0()
            r4 = -1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L7f
            int r7 = r3.length()
            int r7 = r7 + r4
            r8 = 46
            if (r7 < 0) goto L37
        L29:
            int r9 = r7 + (-1)
            char r10 = r3.charAt(r7)
            if (r10 != r8) goto L32
            goto L38
        L32:
            if (r9 >= 0) goto L35
            goto L37
        L35:
            r7 = r9
            goto L29
        L37:
            r7 = r4
        L38:
            java.lang.String r2 = r2.p0()
            if (r2 != 0) goto L3f
            goto L7f
        L3f:
            int r3 = r2.length()
            int r3 = r3 + (-1)
        L45:
            java.lang.String r5 = ""
            if (r4 >= r3) goto L59
            char r9 = r2.charAt(r3)
            if (r9 == r8) goto L52
            int r3 = r3 + (-1)
            goto L45
        L52:
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r6, r3)
            goto L5a
        L59:
            r2 = r5
        L5a:
            int r7 = r7 + 1
            java.lang.String r2 = kotlin.text.C43066x.x(r7, r2)
            if (r0 != 0) goto L64
            r5 = r2
            goto L7f
        L64:
            int r0 = r2.length()
            r3 = r6
        L69:
            if (r3 >= r0) goto L78
            char r7 = r2.charAt(r3)
            if (r7 == r8) goto L74
            int r3 = r3 + 1
            goto L69
        L74:
            java.lang.String r5 = r2.substring(r3)
        L78:
            java.lang.String r0 = "State"
            java.lang.String r0 = androidx.camera.camera2.internal.G.f(r0, r5)
            r5 = r0
        L7f:
            if (r5 != 0) goto L85
            java.lang.String r5 = r11.toString()
        L85:
            java.lang.String r11 = r11.toString()
            int r0 = r11.length()
        L8d:
            if (r6 >= r0) goto L9b
            char r2 = r11.charAt(r6)
            r3 = 40
            if (r2 != r3) goto L98
            goto L9c
        L98:
            int r6 = r6 + 1
            goto L8d
        L9b:
            r6 = r4
        L9c:
            if (r6 != r4) goto Lb0
            java.lang.StringBuilder r11 = androidx.appcompat.app.r.z(r5, r11)
            java.lang.Object r0 = r1.invoke()
            java.lang.String r0 = (java.lang.String) r0
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            goto Lcf
        Lb0:
            java.lang.StringBuilder r0 = androidx.compose.foundation.H.r(r5)
            java.lang.String r2 = kotlin.text.C43066x.t0(r6, r11)
            r0.append(r2)
            java.lang.Object r1 = r1.invoke()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r11 = kotlin.text.C43066x.x(r6, r11)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
        Lcf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.k.a(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState):java.lang.String");
    }
}
