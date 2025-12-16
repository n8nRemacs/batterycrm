package com.avito.android.timestamp_storage.domain;

import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import vE0.AbstractC49202b;
import vE0.InterfaceC49203c;

/* compiled from: TimestampStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/timestamp_storage/domain/d;", "", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: TimestampStorage.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(@Y61.k com.avito.android.timestamp_storage.domain.j r4, @Y61.k vE0.InterfaceC49203c r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
            /*
                boolean r0 = r6 instanceof com.avito.android.timestamp_storage.domain.e
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.timestamp_storage.domain.e r0 = (com.avito.android.timestamp_storage.domain.e) r0
                int r1 = r0.f301489r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f301489r = r1
                goto L18
            L13:
                com.avito.android.timestamp_storage.domain.e r0 = new com.avito.android.timestamp_storage.domain.e
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f301488q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f301489r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L3d
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.C42729a0.b(r6)
                r0.f301489r = r3
                java.lang.Object r6 = r4.c(r5, r0)
                if (r6 != r1) goto L3d
                return r1
            L3d:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r4 = r6.booleanValue()
                r4 = r4 ^ r3
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.timestamp_storage.domain.d.a.a(com.avito.android.timestamp_storage.domain.j, vE0.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    void a(@Y61.k AbstractC49202b.AbstractC12751b.C12752b c12752b);

    @Y61.l
    Object b(@Y61.k InterfaceC49203c interfaceC49203c, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object c(@Y61.k InterfaceC49203c interfaceC49203c, @Y61.k ContinuationImpl continuationImpl);

    void d(@Y61.k AbstractC49202b.AbstractC12751b.C12752b c12752b);

    void e(@Y61.k AbstractC49202b.AbstractC12751b.a aVar, @Y61.k Set<String> set);
}
