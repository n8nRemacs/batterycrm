package com.avito.android.lib.beduin_v2.component.map;

import com.avito.beduin.v2.avito.component.map.state.C;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: MapPinsLoader.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/h;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f175849a = new m();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Map<String, ? extends k> f175850b = P0.c();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f175851c = new kotlinx.coroutines.sync.d();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<C, j> f175852d = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.avito.beduin.v2.theme.k r15, android.content.Context r16, java.util.List r17, java.util.Map r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            r14 = this;
            r8 = r14
            r0 = r19
            boolean r1 = r0 instanceof com.avito.android.lib.beduin_v2.component.map.c
            if (r1 == 0) goto L17
            r1 = r0
            com.avito.android.lib.beduin_v2.component.map.c r1 = (com.avito.android.lib.beduin_v2.component.map.c) r1
            int r2 = r1.f175805u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f175805u = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            com.avito.android.lib.beduin_v2.component.map.c r1 = new com.avito.android.lib.beduin_v2.component.map.c
            r1.<init>(r14, r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.f175803s
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f175805u
            r11 = 1
            if (r1 == 0) goto L3c
            if (r1 != r11) goto L34
            java.util.Set r1 = r9.f175802r
            java.util.Set r1 = (java.util.Set) r1
            com.avito.android.lib.beduin_v2.component.map.h r2 = r9.f175801q
            kotlin.C42729a0.b(r0)
            goto L8a
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            kotlin.C42729a0.b(r0)
            r0 = r17
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C42745f0.q(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r0.next()
            com.avito.beduin.v2.avito.component.map.state.Pin r2 = (com.avito.beduin.v2.avito.component.map.state.Pin) r2
            com.avito.beduin.v2.avito.component.map.state.C r2 = r2.f334644c
            r1.add(r2)
            goto L52
        L64:
            java.util.Set r12 = kotlin.collections.C42745f0.P0(r1)
            com.avito.android.lib.beduin_v2.component.map.d r13 = new com.avito.android.lib.beduin_v2.component.map.d
            r7 = 0
            r0 = r13
            r1 = r12
            r2 = r17
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f175801q = r8
            r0 = r12
            java.util.Set r0 = (java.util.Set) r0
            r9.f175802r = r0
            r9.f175805u = r11
            java.lang.Object r0 = kotlinx.coroutines.U.c(r13, r9)
            if (r0 != r10) goto L88
            return r10
        L88:
            r2 = r8
            r1 = r12
        L8a:
            java.util.List r0 = (java.util.List) r0
            java.util.concurrent.ConcurrentHashMap<com.avito.beduin.v2.avito.component.map.state.C, com.avito.android.lib.beduin_v2.component.map.j> r2 = r2.f175852d
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L96:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            com.avito.android.lib.beduin_v2.component.map.j r3 = (com.avito.android.lib.beduin_v2.component.map.j) r3
            com.avito.beduin.v2.avito.component.map.state.C r4 = (com.avito.beduin.v2.avito.component.map.state.C) r4
            boolean r3 = r1.contains(r4)
            if (r3 != 0) goto L96
            r2.remove()
            goto L96
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.map.h.a(com.avito.beduin.v2.theme.k, android.content.Context, java.util.List, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109 A[PHI: r15
  0x0109: PHI (r15v13 java.lang.Object) = (r15v12 java.lang.Object), (r15v1 java.lang.Object) binds: [B:42:0x0106, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k android.content.Context r12, @Y61.k com.avito.beduin.v2.theme.k r13, @Y61.k java.util.List r14, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.map.h.b(android.content.Context, com.avito.beduin.v2.theme.k, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
