package com.vk.push.core.ipc;

import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.InterfaceC43271q;

/* compiled from: IpcRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/vk/push/core/ipc/q;", "T", "V", "", "a", "b", "Lcom/vk/push/core/ipc/q$a;", "Lcom/vk/push/core/ipc/q$b;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class q<T, V> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Exception, V> f367085a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43271q<V> f367086b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f367087c;

    /* compiled from: IpcRequest.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/ipc/q$a;", "T", "V", "Lcom/vk/push/core/ipc/q;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a<T, V> extends q<T, V> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final N f367088d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f367089e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final N f367090f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final T11.f f367091g;

        /* compiled from: IpcRequest.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/vk/push/core/ipc/q$a$a", "Lcom/vk/push/core/base/a$b;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        /* renamed from: com.vk.push.core.ipc.q$a$a, reason: collision with other inner class name */
        public static final class BinderC10840a extends a.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a<T, V> f367092a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.l<q<T, V>, G0> f367093b;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ T11.a f367094p;

            /* JADX WARN: Multi-variable type inference failed */
            public BinderC10840a(a<T, V> aVar, Y41.l<? super q<T, V>, G0> lVar, T11.a aVar2) {
                this.f367092a = aVar;
                this.f367093b = lVar;
                this.f367094p = aVar2;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [Y41.p, kotlin.jvm.internal.N] */
            @Override // com.vk.push.core.base.a
            public final void e2(AidlResult<?> aidlResult) {
                Object objInvoke;
                RuntimeException runtimeExceptionC = aidlResult.c();
                a<T, V> aVar = this.f367092a;
                if (runtimeExceptionC == null) {
                    aVar.f367091g.info(aVar.f367089e + " ipc request is success");
                    objInvoke = aVar.f367090f.invoke(aidlResult, this.f367094p);
                } else {
                    aVar.f367091g.info(aVar.f367089e + " ipc request is failure");
                    objInvoke = aVar.f367085a.invoke(runtimeExceptionC);
                }
                com.vk.push.core.utils.d.a(aVar.f367086b, objInvoke);
                this.f367093b.invoke(aVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Y41.p pVar, @Y61.k String str, @Y61.k Y41.p pVar2, @Y61.k T11.f fVar, @Y61.k Y41.l lVar, @Y61.k kotlinx.coroutines.r rVar) {
            super(lVar, rVar, str, null);
            this.f367088d = (N) pVar;
            this.f367089e = str;
            this.f367090f = (N) pVar2;
            this.f367091g = fVar;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // com.vk.push.core.ipc.q
        public final void a(T t12, @Y61.k T11.a aVar, @Y61.k Y41.l<? super q<T, V>, G0> lVar) {
            this.f367091g.info(AK.c.s(new StringBuilder(), this.f367089e, " ipc request is starting"));
            this.f367088d.invoke(t12, new BinderC10840a(this, lVar, aVar));
        }

        @Override // com.vk.push.core.ipc.q
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF367087c() {
            return this.f367089e;
        }
    }

    /* compiled from: IpcRequest.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/ipc/q$b;", "T", "V", "Lcom/vk/push/core/ipc/q;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class b<T, V> extends q<T, V> {
        @Override // com.vk.push.core.ipc.q
        public final void a(T t12, @Y61.k T11.a aVar, @Y61.k Y41.l<? super q<T, V>, G0> lVar) {
            throw null;
        }

        @Override // com.vk.push.core.ipc.q
        @Y61.k
        /* renamed from: b */
        public final String getF367087c() {
            return null;
        }
    }

    public q() {
        throw null;
    }

    public q(Y41.l lVar, InterfaceC43271q interfaceC43271q, String str, C42822w c42822w) {
        this.f367085a = lVar;
        this.f367086b = interfaceC43271q;
        this.f367087c = str;
    }

    public abstract void a(T t12, @Y61.k T11.a aVar, @Y61.k Y41.l<? super q<T, V>, G0> lVar);

    @Y61.k
    /* renamed from: b, reason: from getter */
    public String getF367087c() {
        return this.f367087c;
    }
}
