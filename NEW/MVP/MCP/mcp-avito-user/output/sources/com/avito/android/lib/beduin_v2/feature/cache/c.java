package com.avito.android.lib.beduin_v2.feature.cache;

import Y61.k;
import com.avito.android.I1;
import com.avito.android.offlinization.beduin.e;
import jT.InterfaceC42305a;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRequestWithPatternCache.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/cache/c;", "", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42305a f176001a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f176002b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<String> f176003c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final I1 f176004d;

    @Inject
    public c(@k InterfaceC42305a interfaceC42305a, @k e eVar, @k Set<String> set, @k I1 i12) {
        this.f176001a = interfaceC42305a;
        this.f176002b = eVar;
        this.f176003c = set;
        this.f176004d = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r9, @Y61.k ZS.b r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.avito.android.lib.beduin_v2.feature.cache.a
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.lib.beduin_v2.feature.cache.a r0 = (com.avito.android.lib.beduin_v2.feature.cache.a) r0
            int r1 = r0.f175997v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175997v = r1
            goto L18
        L13:
            com.avito.android.lib.beduin_v2.feature.cache.a r0 = new com.avito.android.lib.beduin_v2.feature.cache.a
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f175995t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f175997v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f175993r
            java.lang.String r9 = (java.lang.String) r9
            com.avito.android.lib.beduin_v2.feature.cache.c r10 = r0.f175992q
            kotlin.C42729a0.b(r11)
            goto La9
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.String r9 = r0.f175994s
            java.lang.Object r10 = r0.f175993r
            HV0.e r10 = (HV0.e) r10
            com.avito.android.lib.beduin_v2.feature.cache.c r2 = r0.f175992q
            kotlin.C42729a0.b(r11)
            r7 = r11
            r11 = r10
            r10 = r2
            r2 = r7
            goto L8f
        L4b:
            kotlin.C42729a0.b(r11)
            HV0.e r11 = new HV0.e
            r11.<init>(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "up_"
            r9.<init>(r2)
            java.lang.String r10 = r10.f20168a
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.avito.android.I1 r10 = r8.f176004d
            r10.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.I1.f67278k0
            r5 = 61
            r2 = r2[r5]
            com.avito.android.A0$a r10 = r10.f67321i0
            DE0.a r10 = r10.a()
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r0.f175992q = r8
            r0.f175993r = r11
            r0.f175994s = r9
            r0.f175997v = r4
            java.lang.Object r10 = r8.b(r11, r9, r10, r0)
            if (r10 != r1) goto L8d
            return r1
        L8d:
            r2 = r10
            r10 = r8
        L8f:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r5 = 0
            com.avito.android.offlinization.beduin.e r6 = r10.f176002b     // Catch: com.avito.android.offlinization.beduin.PatternCachingFallbackRequiredException -> L99
            java.lang.String r9 = r6.b(r2, r9, r5)     // Catch: com.avito.android.offlinization.beduin.PatternCachingFallbackRequiredException -> L99
            goto Lb1
        L99:
            r0.f175992q = r10
            r0.f175993r = r9
            r2 = 0
            r0.f175994s = r2
            r0.f175997v = r3
            java.lang.Object r11 = r10.b(r11, r9, r5, r0)
            if (r11 != r1) goto La9
            return r1
        La9:
            org.json.JSONObject r11 = (org.json.JSONObject) r11
            com.avito.android.offlinization.beduin.e r10 = r10.f176002b
            java.lang.String r9 = r10.b(r11, r9, r4)
        Lb1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.cache.c.a(java.lang.String, ZS.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(HV0.e r18, java.lang.String r19, boolean r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            boolean r3 = r2 instanceof com.avito.android.lib.beduin_v2.feature.cache.b
            if (r3 == 0) goto L1a
            r3 = r2
            com.avito.android.lib.beduin_v2.feature.cache.b r3 = (com.avito.android.lib.beduin_v2.feature.cache.b) r3
            int r4 = r3.f176000s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f176000s = r4
        L18:
            r10 = r3
            goto L20
        L1a:
            com.avito.android.lib.beduin_v2.feature.cache.b r3 = new com.avito.android.lib.beduin_v2.feature.cache.b
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r10.f175998q
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r10.f176000s
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            kotlin.C42729a0.b(r2)
            goto L7f
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.C42729a0.b(r2)
            java.util.Set<java.lang.String> r2 = r0.f176003c
            java.lang.String r2 = ZS.d.a(r2)
            java.lang.String r7 = r1.f7127c
            java.util.LinkedHashMap r1 = r1.f7128d
            java.util.Map r8 = kotlin.collections.P0.q(r1)
            r1 = 0
            if (r20 == 0) goto L70
            com.avito.android.offlinization.beduin.e r4 = r0.f176002b
            r6 = r19
            java.util.List r4 = r4.a(r6)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L5e
            r4 = r1
        L5e:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L70
            r11 = r4
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r14 = 0
            r15 = 0
            java.lang.String r12 = ";"
            r13 = 0
            r16 = 62
            java.lang.String r1 = kotlin.collections.C42745f0.O(r11, r12, r13, r14, r15, r16)
        L70:
            r9 = r1
            r10.f176000s = r5
            jT.a r4 = r0.f176001a
            java.lang.String r6 = "contract=Avito; platform=Android; version=26.0"
            r5 = r2
            java.lang.Object r2 = r4.a(r5, r6, r7, r8, r9, r10)
            if (r2 != r3) goto L7f
            return r3
        L7f:
            okhttp3.ResponseBody r2 = (okhttp3.ResponseBody) r2
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r2 = r2.string()
            r1.<init>(r2)
            java.lang.String r2 = "success"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            if (r2 != 0) goto L98
            java.lang.String r2 = "result"
            org.json.JSONObject r2 = r1.getJSONObject(r2)
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.cache.c.b(HV0.e, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
