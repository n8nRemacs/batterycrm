package com.avito.android.lib.beduin_v2.beduin_item.stateless;

import Y41.p;
import Y61.k;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.beduin.v2.avito.component.items_controller.h;
import com.avito.beduin.v2.avito.component.items_controller.i;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.engine.E;
import com.avito.beduin.v2.engine.component.l;
import com.avito.beduin.v2.engine.core.C36264n;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinItemViewImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.beduin_item.stateless.BeduinItemViewImpl$bind$1$1", f = "BeduinItemViewImpl.kt", i = {}, l = {55, 61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f175471q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f175472r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f175473s;

    /* compiled from: BeduinItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/items_controller/i$a;", "itemsController", "Lkotlin/G0;", "emit", "(Lcom/avito/beduin/v2/avito/component/items_controller/i$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f175474b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f175475c;

        public a(j jVar, String str) {
            this.f175474b = jVar;
            this.f175475c = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            int i12 = j.f175477e;
            j jVar = this.f175474b;
            jVar.getClass();
            h.a aVar = ((com.avito.beduin.v2.avito.component.items_controller.h) ((i.a) obj).f334562a.getState()).getItems().get(this.f175475c);
            D dA2 = null;
            if (aVar != null) {
                E e12 = E.f336419a;
                l lVar = new l("beduinItem".concat(aVar.f334557a), null, "BeduinItem", new C36264n(com.avito.beduin.v2.engine.field.e.f336775a, aVar.f334559c));
                e12.getClass();
                dA2 = E.a(lVar);
            }
            if (dA2 != null) {
                jVar.f175479c.b(dA2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f175476b;

        public b(j jVar) {
            this.f175476b = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            BeduinOneTimeEvent beduinOneTimeEvent = (BeduinOneTimeEvent) obj;
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                this.f175476b.f175479c.c(((BeduinOneTimeEvent.a) beduinOneTimeEvent).f176280a);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f175472r = jVar;
        this.f175473s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new i(this.f175472r, this.f175473s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f175471q;
        j jVar = this.f175472r;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(new com.avito.android.lib.beduin_v2.beduin_item.c(jVar.f175478b), new com.avito.android.lib.beduin_v2.beduin_item.d(3, null));
            a aVar = new a(jVar, this.f175473s);
            this.f175471q = 1;
            if (lVarY.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        InterfaceC43160i<BeduinOneTimeEvent> events = jVar.f175478b.getEvents();
        b bVar = new b(jVar);
        this.f175471q = 2;
        if (events.collect(bVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
