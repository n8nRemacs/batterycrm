package com.avito.android.calltracking;

import am.InterfaceC19907a;
import com.avito.android.calltracking.remote.model.CalltrackingAllocationResponse;
import com.avito.android.calltracking.remote.model.CalltrackingResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/w;", "Lcom/avito/android/calltracking/v;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements InterfaceC29293v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19907a f113781a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f113782b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f113783c;

    /* compiled from: CalltrackingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/calltracking/remote/model/CalltrackingAllocationResponse;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f113784b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CalltrackingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/calltracking/remote/model/CalltrackingAllocationResponse;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.a(w.this.f113782b.a((Throwable) obj));
        }
    }

    /* compiled from: CalltrackingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/calltracking/remote/model/CalltrackingResponse;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f113786b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CalltrackingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/calltracking/remote/model/CalltrackingResponse;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements l41.o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.a(w.this.f113782b.a((Throwable) obj));
        }
    }

    @Inject
    public w(@Y61.k InterfaceC19907a interfaceC19907a, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f113781a = interfaceC19907a;
        this.f113782b = fVar;
        this.f113783c = interfaceC35745a5;
    }

    @Override // com.avito.android.calltracking.InterfaceC29293v
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<CalltrackingAllocationResponse>> a(@Y61.k String str) {
        return this.f113781a.a(str).x0(this.f113783c.a()).d0(a.f113784b).m0(new b()).r0(P2.c.f318721a);
    }

    @Override // com.avito.android.calltracking.InterfaceC29293v
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<CalltrackingResponse>> b(int i12, int i13, boolean z12) {
        return this.f113781a.b(i12, i13, z12).x0(this.f113783c.a()).d0(c.f113786b).m0(new d()).r0(P2.c.f318721a);
    }
}
