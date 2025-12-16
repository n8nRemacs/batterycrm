package com.avito.android.lib.beduin_v2.component.map;

import Y41.p;
import android.content.Context;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.beduin.v2.avito.component.map.state.C36217a;
import com.avito.beduin.v2.avito.component.map.state.Pin;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;

/* compiled from: MapComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.component.map.MapComponent$loadPins$1", f = "MapComponent.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f175790q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.beduin_v2.component.map.a f175791r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.map.b f175792s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C36217a f175793t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f175794u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.theme.k f175795v;

    /* compiled from: MapComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/android/lib/design/map/state/MapState$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.component.map.MapComponent$loadPins$1$newMarkers$1", f = "MapComponent.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super List<? extends MapState.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f175796q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.beduin_v2.component.map.a f175797r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f175798s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.theme.k f175799t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C36217a f175800u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.lib.beduin_v2.component.map.a aVar, Context context, com.avito.beduin.v2.theme.k kVar, C36217a c36217a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f175797r = aVar;
            this.f175798s = context;
            this.f175799t = kVar;
            this.f175800u = c36217a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f175797r, this.f175798s, this.f175799t, this.f175800u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super List<? extends MapState.a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f175796q;
            if (i12 == 0) {
                C42729a0.b(obj);
                h hVar = this.f175797r.f175784p;
                ET0.a<Pin> aVar = this.f175800u.f334674b;
                this.f175796q = 1;
                obj = hVar.b(this.f175798s, this.f175799t, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.lib.beduin_v2.component.map.a aVar, com.avito.android.lib.design.map.b bVar, C36217a c36217a, Context context, com.avito.beduin.v2.theme.k kVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f175791r = aVar;
        this.f175792s = bVar;
        this.f175793t = c36217a;
        this.f175794u = context;
        this.f175795v = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f175791r, this.f175792s, this.f175793t, this.f175794u, this.f175795v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f175790q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.scheduling.b bVar = C43262l0.f411947c;
            a aVar = new a(this.f175791r, this.f175794u, this.f175795v, this.f175793t, null);
            this.f175790q = 1;
            obj = C43259k.g(bVar, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        List<MapState.a> list = (List) obj;
        com.avito.android.lib.beduin_v2.component.map.a aVar2 = this.f175791r;
        aVar2.getClass();
        com.avito.android.lib.design.map.b bVar2 = this.f175792s;
        C36217a c36217a = this.f175793t;
        com.avito.android.lib.beduin_v2.component.map.a.u(bVar2, c36217a, list);
        aVar2.f175782n = list;
        aVar2.f175781m = c36217a;
        return G0.f406611a;
    }
}
