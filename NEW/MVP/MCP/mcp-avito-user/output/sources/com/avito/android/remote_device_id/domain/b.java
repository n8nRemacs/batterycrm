package com.avito.android.remote_device_id.domain;

import Y61.k;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote_device_id.domain.g;
import com.avito.android.util.ShouldRetryException;
import com.avito.android.util.rx3.H0;
import com.avito.android.util.rx3.g1;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;
import lm0.C43799d;
import lm0.InterfaceC43796a;
import om0.InterfaceC44824d;

/* compiled from: RemoteDeviceIdTaskInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote_device_id/domain/b;", "Lcom/avito/android/remote_device_id/domain/a;", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes11.dex */
public final class b implements com.avito.android.remote_device_id.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43796a f254414a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44824d f254415b;

    /* compiled from: Retries.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lcom/avito/android/remote/model/TypedResult;", "it", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "com/avito/android/util/E4", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        @Override // l41.o
        public final Object apply(Object obj) throws ShouldRetryException {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                throw new ShouldRetryException(typedResult);
            }
            return typedResult;
        }
    }

    /* compiled from: Retries.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u000b\u0012\u0002\b\u00030\u0004¢\u0006\u0002\b\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lio/reactivex/rxjava3/core/j;", "", "errors", "Lorg/reactivestreams/c;", "Lj41/e;", "apply", "(Lio/reactivex/rxjava3/core/j;)Lorg/reactivestreams/c;", "com/avito/android/util/H4", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.remote_device_id.domain.b$b, reason: collision with other inner class name */
    public static final class C7614b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f254416b;

        public C7614b(H h12) {
            this.f254416b = h12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return (org.reactivestreams.c) H0.b(1000L, 3, this.f254416b, com.avito.android.remote_device_id.domain.c.f254419l, com.avito.android.remote_device_id.domain.d.f254420l, 2.0d).apply((AbstractC41777j) obj);
        }
    }

    /* compiled from: Retries.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "e", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/I4", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f254417b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Throwable th2 = (Throwable) obj;
            return th2 instanceof ShouldRetryException ? I.q(((ShouldRetryException) th2).f318735b) : I.l(th2);
        }
    }

    /* compiled from: RemoteDeviceIdTaskInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llm0/d;", "it", "Lcom/avito/android/remote_device_id/domain/g;", "apply", "(Llm0/d;)Lcom/avito/android/remote_device_id/domain/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            b.this.f254415b.b(((C43799d) obj).getRemoteDeviceId());
            return g.b.f254425a;
        }
    }

    @Inject
    public b(@k InterfaceC43796a interfaceC43796a, @k InterfaceC44824d interfaceC44824d) {
        this.f254414a = interfaceC43796a;
        this.f254415b = interfaceC44824d;
    }

    @Override // com.avito.android.remote_device_id.domain.a
    @k
    public final I<g> a() {
        String strA = this.f254415b.a();
        if (strA != null && strA.length() != 0) {
            return I.q(g.b.f254425a);
        }
        return g1.a(this.f254414a.a("android").r(new a()).w(new C7614b(io.reactivex.rxjava3.schedulers.b.f404943c)).t(c.f254417b)).r(new d()).u(new C32102w0(24));
    }
}
