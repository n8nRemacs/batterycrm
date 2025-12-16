package com.avito.android.timestamp_storage.data.dao;

import Y61.k;
import Y61.l;
import androidx.room.A;
import androidx.room.InterfaceC23458l0;
import androidx.room.Q0;
import androidx.room.W;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import xE0.C49826a;

/* compiled from: TimestampDao.kt */
@A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/timestamp_storage/data/dao/a;", "", "_avito_timestamp-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TimestampDao.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.timestamp_storage.data.dao.a$a, reason: collision with other inner class name */
    public static final class C9223a {

        /* compiled from: TimestampDao.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.timestamp_storage.data.dao.TimestampDao$DefaultImpls", f = "TimestampDao.kt", i = {0, 0}, l = {33, 34}, m = "addOrUpdate", n = {"$this", "entity"}, s = {"L$0", "L$1"})
        /* renamed from: com.avito.android.timestamp_storage.data.dao.a$a$a, reason: collision with other inner class name */
        public static final class C9224a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public a f301454q;

            /* renamed from: r, reason: collision with root package name */
            public C49826a f301455r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f301456s;

            /* renamed from: t, reason: collision with root package name */
            public int f301457t;

            public C9224a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f301456s = obj;
                this.f301457t |= BeduinInputModel.MIN_TEXT_VERSION;
                return C9223a.a(null, null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Y61.l
        @androidx.room.Q0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(@Y61.k com.avito.android.timestamp_storage.data.dao.a r8, @Y61.k xE0.C49826a r9, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) {
            /*
                boolean r0 = r10 instanceof com.avito.android.timestamp_storage.data.dao.a.C9223a.C9224a
                if (r0 == 0) goto L14
                r0 = r10
                com.avito.android.timestamp_storage.data.dao.a$a$a r0 = (com.avito.android.timestamp_storage.data.dao.a.C9223a.C9224a) r0
                int r1 = r0.f301457t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.f301457t = r1
            L12:
                r7 = r0
                goto L1a
            L14:
                com.avito.android.timestamp_storage.data.dao.a$a$a r0 = new com.avito.android.timestamp_storage.data.dao.a$a$a
                r0.<init>(r10)
                goto L12
            L1a:
                java.lang.Object r10 = r7.f301456s
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f301457t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3f
                if (r1 == r3) goto L36
                if (r1 != r2) goto L2e
                kotlin.C42729a0.b(r10)
                goto L72
            L2e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L36:
                xE0.a r9 = r7.f301455r
                com.avito.android.timestamp_storage.data.dao.a r8 = r7.f301454q
                kotlin.C42729a0.b(r10)
            L3d:
                r1 = r8
                goto L4f
            L3f:
                kotlin.C42729a0.b(r10)
                r7.f301454q = r8
                r7.f301455r = r9
                r7.f301457t = r3
                java.lang.Object r10 = r8.a(r9, r7)
                if (r10 != r0) goto L3d
                return r0
            L4f:
                java.lang.Number r10 = (java.lang.Number) r10
                long r3 = r10.longValue()
                r5 = 0
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 >= 0) goto L75
                java.lang.String r8 = r9.f442305a
                r10 = 0
                r7.f301454q = r10
                r7.f301455r = r10
                r7.f301457t = r2
                long r4 = r9.f442307c
                java.util.Map<java.lang.String, java.lang.Long> r6 = r9.f442308d
                java.lang.String r3 = r9.f442306b
                r2 = r8
                java.lang.Object r8 = r1.c(r2, r3, r4, r6, r7)
                if (r8 != r0) goto L72
                return r0
            L72:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L75:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.timestamp_storage.data.dao.a.C9223a.a(com.avito.android.timestamp_storage.data.dao.a, xE0.a, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @l
    @W
    Object a(@k C49826a c49826a, @k Continuation<? super Long> continuation);

    @InterfaceC23458l0
    @l
    Object b(@k String str, @k String str2, @k Set<String> set, @k Continuation<? super G0> continuation);

    @InterfaceC23458l0
    @l
    Object c(@k String str, @k String str2, long j12, @k Map<String, Long> map, @k Continuation<? super G0> continuation);

    @l
    @Q0
    Object d(@k C49826a c49826a, @k Continuation<? super G0> continuation);

    @InterfaceC23458l0
    @l
    Object e(@k String str, @k String str2, @k Continuation<? super C49826a> continuation);

    @InterfaceC23458l0
    @l
    Object f(@k String str, @k String str2, @k Continuation<? super G0> continuation);
}
