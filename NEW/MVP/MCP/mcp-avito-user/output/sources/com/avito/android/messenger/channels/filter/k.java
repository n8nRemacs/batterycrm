package com.avito.android.messenger.channels.filter;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.rx3.y;
import pZ.C47037b;

/* compiled from: ChannelsFilterStateHolder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/filter/k;", "Lcom/avito/android/messenger/channels/filter/j;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final JY.a f187161a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<i> f187162b = p2.a(new i(false, 0));

    /* compiled from: ChannelsFilterStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.filter.ChannelsFilterStateHolderImpl$1", f = "ChannelsFilterStateHolder.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f187163q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ pZ.d f187164r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ k f187165s;

        /* compiled from: ChannelsFilterStateHolder.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpZ/b;", "counter", "Lkotlin/G0;", "emit", "(LpZ/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.channels.filter.k$a$a, reason: collision with other inner class name */
        public static final class C5489a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f187166b;

            public C5489a(k kVar) {
                this.f187166b = kVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                int channelsCount = ((C47037b) obj).getChannelsCount();
                k kVar = this.f187166b;
                if (kVar.f187161a.j()) {
                    Z1<i> z12 = kVar.f187162b;
                    i value = z12.getValue();
                    boolean z13 = value.f187159a;
                    value.getClass();
                    z12.setValue(new i(z13, channelsCount));
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pZ.d dVar, k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f187164r = dVar;
            this.f187165s = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f187164r, this.f187165s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f187163q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iA = y.a(this.f187164r.getF197729a());
                C5489a c5489a = new C5489a(this.f187165s);
                this.f187163q = 1;
                if (((AbstractC43168f) interfaceC43160iA).collect(c5489a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ChannelsFilterStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/filter/i;", "old", "new", "", "invoke", "(Lcom/avito/android/messenger/channels/filter/i;Lcom/avito/android/messenger/channels/filter/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<i, i, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f187167l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(i iVar, i iVar2) {
            return Boolean.valueOf(iVar.f187159a == iVar2.f187159a);
        }
    }

    @Inject
    public k(@Y61.k pZ.d dVar, @Y61.k R0 r02, @Y61.k JY.a aVar) {
        this.f187161a = aVar;
        if (aVar.j()) {
            C43259k.d(U.a(r02.c()), null, null, new a(dVar, this, null), 3);
        }
    }

    @Override // com.avito.android.messenger.channels.filter.j
    @Y61.l
    public final Boolean a() {
        if (!c().f187159a) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.avito.android.messenger.channels.filter.j
    @Y61.k
    public final InterfaceC43160i<i> b() {
        return C43175k.q(b.f187167l, this.f187162b);
    }

    @Override // com.avito.android.messenger.channels.filter.j
    @Y61.k
    public final i c() {
        return this.f187162b.getValue();
    }

    @Override // com.avito.android.messenger.channels.filter.j
    public final InterfaceC43160i d() {
        return this.f187162b;
    }

    @Override // com.avito.android.messenger.channels.filter.j
    public final void e(boolean z12) {
        if (this.f187161a.j()) {
            Z1<i> z13 = this.f187162b;
            i value = z13.getValue();
            int i12 = value.f187160b;
            value.getClass();
            z13.setValue(new i(z12, i12));
        }
    }
}
