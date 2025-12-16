package com.avito.android.timestamp_storage.domain;

import Y41.p;
import com.avito.android.timestamp_storage.domain.d;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import vE0.AbstractC49202b;
import vE0.InterfaceC49203c;

/* compiled from: TimestampStorageImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/timestamp_storage/domain/j;", "Lcom/avito/android/timestamp_storage/domain/d;", "_avito_timestamp-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.timestamp_storage.data.dao.a f301503a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.timestamp_storage.domain.a f301504b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f301505c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f301506d;

    /* compiled from: TimestampStorageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.timestamp_storage.domain.TimestampStorageImpl$save$1", f = "TimestampStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ AbstractC49202b.AbstractC12751b.C12752b f301508r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC49202b.AbstractC12751b.C12752b c12752b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f301508r = c12752b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new a(this.f301508r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            j jVar = j.this;
            C43259k.d(jVar.f301506d, null, null, new k(jVar, this.f301508r, null, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: TimestampStorageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.timestamp_storage.domain.TimestampStorageImpl$save$2", f = "TimestampStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ AbstractC49202b.AbstractC12751b.a f301510r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Set<String> f301511s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC49202b.AbstractC12751b.a aVar, Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f301510r = aVar;
            this.f301511s = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new b(this.f301510r, this.f301511s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            j jVar = j.this;
            C43259k.d(jVar.f301506d, null, null, new k(jVar, this.f301510r, this.f301511s, null), 3);
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.timestamp_storage.data.dao.a aVar, @Y61.k com.avito.android.timestamp_storage.domain.a aVar2, @Y61.k m mVar, @Y61.k R0 r02) {
        this.f301503a = aVar;
        this.f301504b = aVar2;
        this.f301505c = mVar;
        this.f301506d = U.a(r02.a().plus(t1.b()));
    }

    @Override // com.avito.android.timestamp_storage.domain.d
    public final void a(@Y61.k AbstractC49202b.AbstractC12751b.C12752b c12752b) {
        C43259k.d(this.f301506d, null, null, new a(c12752b, null), 3);
    }

    @Override // com.avito.android.timestamp_storage.domain.d
    @Y61.l
    public final Object b(@Y61.k InterfaceC49203c interfaceC49203c, @Y61.k ContinuationImpl continuationImpl) {
        return d.a.a(this, interfaceC49203c, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:31:0x0095). Please report as a decompilation issue!!! */
    @Override // com.avito.android.timestamp_storage.domain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k vE0.InterfaceC49203c r21, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.timestamp_storage.domain.j.c(vE0.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.timestamp_storage.domain.d
    public final void d(@Y61.k AbstractC49202b.AbstractC12751b.C12752b c12752b) {
        C43238h c43238h = this.f301506d;
        if (c12752b != null) {
            C43259k.d(c43238h, null, null, new i(this, c12752b, null), 3);
        }
    }

    @Override // com.avito.android.timestamp_storage.domain.d
    public final void e(@Y61.k AbstractC49202b.AbstractC12751b.a aVar, @Y61.k Set<String> set) {
        C43259k.d(this.f301506d, null, null, new b(aVar, set, null), 3);
    }
}
