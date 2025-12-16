package io.ktor.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContentConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-serialization"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.ktor.util.InterfaceC41603j0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k java.util.ArrayList r5, @Y61.k io.ktor.utils.io.W0 r6, @Y61.k U31.b r7, @Y61.k java.nio.charset.Charset r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws io.ktor.serialization.ContentConvertException {
        /*
            boolean r0 = r9 instanceof io.ktor.serialization.e
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.serialization.e r0 = (io.ktor.serialization.e) r0
            int r1 = r0.f400294t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400294t = r1
            goto L18
        L13:
            io.ktor.serialization.e r0 = new io.ktor.serialization.e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f400293s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400294t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            U31.b r7 = r0.f400292r
            io.ktor.utils.io.W0 r6 = r0.f400291q
            kotlin.C42729a0.b(r9)
            goto L55
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.C42729a0.b(r9)
            kotlinx.coroutines.flow.o r9 = new kotlinx.coroutines.flow.o
            r9.<init>(r5)
            io.ktor.serialization.d r5 = new io.ktor.serialization.d
            r5.<init>(r9, r8, r7, r6)
            io.ktor.serialization.f r8 = new io.ktor.serialization.f
            r8.<init>(r6, r3)
            r0.f400291q = r6
            r0.f400292r = r7
            r0.f400294t = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.z(r5, r8, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            if (r9 != 0) goto L80
            boolean r5 = r6.x()
            if (r5 != 0) goto L5e
            goto L81
        L5e:
            kotlin.reflect.r r5 = r7.f16156c
            if (r5 == 0) goto L6b
            boolean r5 = r5.d()
            if (r5 != r4) goto L6b
            io.ktor.http.content.o r6 = io.ktor.http.content.o.f399976a
            goto L81
        L6b:
            io.ktor.serialization.ContentConvertException r5 = new io.ktor.serialization.ContentConvertException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "No suitable converter found for "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 2
            r5.<init>(r6, r3, r7, r3)
            throw r5
        L80:
            r6 = r9
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.g.a(java.util.ArrayList, io.ktor.utils.io.W0, U31.b, java.nio.charset.Charset, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
