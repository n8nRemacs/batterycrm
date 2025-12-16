package com.avito.android.favorites.compose.only_active_switch;

import Y41.p;
import Y61.k;
import Y61.l;
import com.akita.compose.component.tooltip.t;
import com.avito.android.favorites.InterfaceC30683q0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: ShowOnlyActiveFavoritesSwitch.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorites.compose.only_active_switch.ShowOnlyActiveFavoritesSwitchKt$ShowOnlyActiveFavoritesSwitch$1$1", f = "ShowOnlyActiveFavoritesSwitch.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156855q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f156856r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC30683q0 f156857s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f156858t;

    /* compiled from: ShowOnlyActiveFavoritesSwitch.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f156859b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC30683q0 f156860c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t f156861d;

        public a(T t12, InterfaceC30683q0 interfaceC30683q0, t tVar) {
            this.f156859b = t12;
            this.f156860c = interfaceC30683q0;
            this.f156861d = tVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            if (((Boolean) obj).booleanValue()) {
                C43259k.d(this.f156859b, null, null, new com.avito.android.favorites.compose.only_active_switch.a(this.f156861d, null), 3);
                this.f156860c.j();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC30683q0 interfaceC30683q0, t tVar, Continuation continuation) {
        super(2, continuation);
        this.f156857s = interfaceC30683q0;
        this.f156858t = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f156857s, this.f156858t, continuation);
        bVar.f156856r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f156855q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f156856r;
            InterfaceC30683q0 interfaceC30683q0 = this.f156857s;
            n2<Boolean> n2VarA = interfaceC30683q0.a();
            a aVar = new a(t12, interfaceC30683q0, this.f156858t);
            this.f156855q = 1;
            if (n2VarA.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
