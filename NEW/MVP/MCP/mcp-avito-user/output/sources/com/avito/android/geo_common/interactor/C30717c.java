package com.avito.android.geo_common.interactor;

import com.avito.android.remote.model.Direction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import pF.InterfaceC46942a;
import qF.C47287a;

/* compiled from: LocationDirectionsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.geo_common.interactor.LocationDirectionsInteractorImpl$getDirections$1", f = "LocationDirectionsInteractor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.geo_common.interactor.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30717c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159324q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30718d f159325r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f159326s;

    /* compiled from: LocationDirectionsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LqF/a;", "response", "Lkotlin/G0;", "invoke", "(LqF/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.geo_common.interactor.c$a */
    public static final class a extends N implements Y41.l<C47287a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C30718d f159327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C30718d c30718d) {
            super(1);
            this.f159327l = c30718d;
        }

        @Override // Y41.l
        public final G0 invoke(C47287a c47287a) {
            ArrayList arrayList;
            List<qF.b> listA = c47287a.a();
            if (listA != null) {
                List<qF.b> list = listA;
                arrayList = new ArrayList(C42745f0.q(list, 10));
                for (qF.b bVar : list) {
                    arrayList.add(new Direction(String.valueOf(bVar.getId()), bVar.getName()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                V2.f318762a.e("LocationDirectionsInteractor: answer is null or empty", null);
            } else {
                this.f159327l.f159331c.K5(arrayList);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LocationDirectionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "err", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.geo_common.interactor.c$b */
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f159328l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            V2.f318762a.e("LocationDirectionsInteractor got error: ".concat(str), null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30717c(C30718d c30718d, String str, Continuation<? super C30717c> continuation) {
        super(2, continuation);
        this.f159325r = c30718d;
        this.f159326s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C30717c(this.f159325r, this.f159326s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C30717c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159324q;
        C30718d c30718d = this.f159325r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC46942a interfaceC46942a = c30718d.f159329a.get();
            long j12 = Long.parseLong(this.f159326s);
            this.f159324q = 1;
            obj = interfaceC46942a.c(j12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        com.avito.android.error.z.o((TypedResult) obj, new a(c30718d), b.f159328l, null, 60);
        return G0.f406611a;
    }
}
