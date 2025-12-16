package io.ktor.serialization.kotlinx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.G;
import kotlinx.serialization.InterfaceC43382a;
import kotlinx.serialization.s;

/* compiled from: KotlinxSerializationConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/serialization/kotlinx/i;", "Lio/ktor/serialization/c;", "ktor-serialization-kotlinx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i implements io.ktor.serialization.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f400342a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f400343b;

    public i(@Y61.k s sVar) {
        this.f400342a = sVar;
        List<l> list = a.f400297a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            io.ktor.serialization.kotlinx.json.j jVarA = ((l) it.next()).a(sVar);
            if (jVarA != null) {
                arrayList.add(jVarA);
            }
        }
        this.f400343b = arrayList;
        s sVar2 = this.f400342a;
        if ((sVar2 instanceof InterfaceC43382a) || (sVar2 instanceof G)) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + this.f400342a + " is not supported.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:31:0x00b1, B:33:0x00b7, B:36:0x00c4, B:38:0x00c8, B:40:0x00d2, B:41:0x00ec), top: B:44:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:31:0x00b1, B:33:0x00b7, B:36:0x00c4, B:38:0x00c8, B:40:0x00d2, B:41:0x00ec), top: B:44:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // io.ktor.serialization.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.nio.charset.Charset r11, @Y61.k U31.b r12, @Y61.k io.ktor.utils.io.W0 r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws io.ktor.serialization.JsonConvertException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.i.a(java.nio.charset.Charset, U31.b, io.ktor.utils.io.W0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k io.ktor.http.C41524i r14, @Y61.k java.nio.charset.Charset r15, @Y61.k U31.b r16, @Y61.l java.lang.Object r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.i.b(io.ktor.http.i, java.nio.charset.Charset, U31.b, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
