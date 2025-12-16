package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22132o;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentRenderer.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/render/compose/d;", "T", "Lcom/avito/beduin/v2/render/compose/c;", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.render.compose.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36347d<T> implements InterfaceC36346c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC36250j f338069a;

    public AbstractC36347d(@Y61.k AbstractC36250j abstractC36250j) {
        this.f338069a = abstractC36250j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long c(@Y61.k java.lang.String r3, @Y61.l androidx.compose.runtime.A r4, int r5) {
        /*
            r0 = 1744501393(0x67fafa91, float:2.3704275E24)
            r4.C(r0)
            r0 = 956523617(0x39036461, float:1.2530528E-4)
            r4.C(r0)
            r0 = r5 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 4
            if (r0 <= r2) goto L1a
            boolean r0 = r4.B(r3)
            if (r0 != 0) goto L1e
        L1a:
            r5 = r5 & 6
            if (r5 != r2) goto L20
        L1e:
            r5 = 1
            goto L21
        L20:
            r5 = r1
        L21:
            java.lang.Object r0 = r4.t()
            if (r5 != 0) goto L30
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            r5.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r5) goto L39
        L30:
            com.avito.beduin.v2.theme.r$a r5 = com.avito.beduin.v2.theme.r.f338365d
            com.avito.beduin.v2.theme.r r0 = com.avito.beduin.v2.theme.y.a(r3)
            r4.H(r0)
        L39:
            com.avito.beduin.v2.theme.r r0 = (com.avito.beduin.v2.theme.r) r0
            r4.h()
            long r0 = com.avito.beduin.v2.render.compose.I.a(r0, r4, r1)
            r4.h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.render.compose.AbstractC36347d.c(java.lang.String, androidx.compose.runtime.A, int):long");
    }

    @InterfaceC22132o
    public abstract void a(@Y61.k Y41.l<? super m, n> lVar, @Y61.k InterfaceC36249i interfaceC36249i, @Y61.l androidx.compose.runtime.A a12, int i12);

    @Y61.k
    public String b() {
        return this.f338069a.f336560a;
    }
}
