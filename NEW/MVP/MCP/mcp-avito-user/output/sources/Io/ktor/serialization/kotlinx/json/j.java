package io.ktor.serialization.kotlinx.json;

import Y61.l;
import io.ktor.http.C41524i;
import io.ktor.serialization.kotlinx.n;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.r;
import kotlin.reflect.y;
import kotlin.text.C43047d;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.serialization.json.AbstractC43443a;

/* compiled from: KotlinxSerializationJsonExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/serialization/kotlinx/json/j;", "Lio/ktor/serialization/kotlinx/k;", "ktor-serialization-kotlinx-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j implements io.ktor.serialization.kotlinx.k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC43443a f400381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f400382b = new LinkedHashMap();

    public j(@Y61.k AbstractC43443a abstractC43443a) {
        this.f400381a = abstractC43443a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.serialization.kotlinx.json.j r14, kotlinx.coroutines.flow.InterfaceC43160i r15, kotlinx.serialization.KSerializer r16, java.nio.charset.Charset r17, io.ktor.utils.io.InterfaceC41649d1 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.j.c(io.ktor.serialization.kotlinx.json.j, kotlinx.coroutines.flow.i, kotlinx.serialization.KSerializer, java.nio.charset.Charset, io.ktor.utils.io.d1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.serialization.kotlinx.k
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.nio.charset.Charset r6, @Y61.k U31.b r7, @Y61.k io.ktor.utils.io.W0 r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws io.ktor.serialization.JsonConvertException {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.serialization.kotlinx.json.f
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.serialization.kotlinx.json.f r0 = (io.ktor.serialization.kotlinx.json.f) r0
            int r1 = r0.f400354s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400354s = r1
            goto L18
        L13:
            io.ktor.serialization.kotlinx.json.f r0 = new io.ktor.serialization.kotlinx.json.f
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f400352q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400354s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L62
        L29:
            r6 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.C42729a0.b(r9)
            java.nio.charset.Charset r9 = kotlin.text.C43047d.f410589b
            boolean r6 = kotlin.jvm.internal.L.f(r6, r9)
            r9 = 0
            if (r6 == 0) goto L74
            kotlin.reflect.d<?> r6 = r7.f16154a
            kotlin.jvm.internal.n0 r2 = kotlin.jvm.internal.m0.f406844a
            java.lang.Class<kotlin.sequences.m> r4 = kotlin.sequences.InterfaceC43030m.class
            kotlin.reflect.d r2 = r2.b(r4)
            boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
            if (r6 != 0) goto L50
            goto L74
        L50:
            kotlinx.serialization.json.a r6 = r5.f400381a     // Catch: java.lang.Throwable -> L29
            r0.f400354s = r3     // Catch: java.lang.Throwable -> L29
            kotlinx.coroutines.scheduling.b r2 = kotlinx.coroutines.C43262l0.f411947c     // Catch: java.lang.Throwable -> L29
            io.ktor.serialization.kotlinx.json.b r3 = new io.ktor.serialization.kotlinx.json.b     // Catch: java.lang.Throwable -> L29
            r3.<init>(r8, r7, r6, r9)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = kotlinx.coroutines.C43259k.g(r2, r3, r0)     // Catch: java.lang.Throwable -> L29
            if (r9 != r1) goto L62
            return r1
        L62:
            return r9
        L63:
            io.ktor.serialization.JsonConvertException r7 = new io.ktor.serialization.JsonConvertException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Illegal input: "
            r8.<init>(r9)
            java.lang.String r8 = androidx.camera.camera2.internal.G.i(r6, r8)
            r7.<init>(r8, r6)
            throw r7
        L74:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.j.a(java.nio.charset.Charset, U31.b, io.ktor.utils.io.W0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.serialization.kotlinx.k
    @l
    public final io.ktor.http.content.f b(@Y61.k C41524i c41524i, @Y61.k Charset charset, @Y61.k U31.b bVar, @l Object obj) {
        C41524i c41524iC = c41524i;
        if (!L.f(charset, C43047d.f410589b) || !L.f(bVar.f16154a, m0.f406844a.b(InterfaceC43160i.class))) {
            return null;
        }
        r rVar = bVar.f16156c.D().get(0).f410466b;
        h hVar = new h(this, obj, n.c(this.f400381a.f412956b, new U31.b((kotlin.reflect.d) rVar.getF406862b(), y.d(rVar), rVar)), charset, null);
        if (c41524iC.f400033d.toLowerCase(Locale.ROOT).equals("text")) {
            CharBuffer charBuffer = W31.a.f17734a;
            c41524iC = c41524i.c("charset", charset.name());
        }
        return new io.ktor.http.content.f(hVar, c41524iC, null, null, 12, null);
    }
}
