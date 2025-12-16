package com.avito.android.universal_map.map.mvi.actor;

import Zi.InterfaceC19564a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.universal_map.map.InterfaceC35318f;
import com.avito.android.universal_map.map.di.InterfaceC35295a;
import com.avito.android.universal_map.map.di.InterfaceC35306l;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import gj.InterfaceC40691b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/m;", "Lcom/avito/android/arch/mvi/a;", "LrG0/a;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/e;", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements com.avito.android.arch.mvi.a<AbstractC47541a, UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final List<BeduinAction> f305373a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f305374b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35318f f305375c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305376d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final d f305377e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.mvi.actor.a f305378f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final g f305379g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final j f305380h;

    /* compiled from: UniversalMapActor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/m$a;", "", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/universal_map/map/mvi/actor/m$a$a;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a$b;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a$c;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a$d;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a$e;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a$f;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UniversalMapActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/m$a$a;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.universal_map.map.mvi.actor.m$a$a, reason: collision with other inner class name */
        public static final class C9373a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9373a f305381a = new C9373a();
        }

        /* compiled from: UniversalMapActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/m$a$b;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f305382a = new b();
        }

        /* compiled from: UniversalMapActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/m$a$c;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f305383a = new c();
        }

        /* compiled from: UniversalMapActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/m$a$d;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f305384a = new d();
        }

        /* compiled from: UniversalMapActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/m$a$e;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f305385a = new e();
        }

        /* compiled from: UniversalMapActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/m$a$f;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final f f305386a = new f();
        }
    }

    /* compiled from: UniversalMapActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.UniversalMapActor$process$1", f = "UniversalMapActor.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305387q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305388r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305389s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m f305390t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AbstractC47541a f305391u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.universal_map.map.mvi.entity.e eVar, m mVar, AbstractC47541a abstractC47541a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f305389s = eVar;
            this.f305390t = mVar;
            this.f305391u = abstractC47541a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f305389s, this.f305390t, this.f305391u, continuation);
            bVar.f305388r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305387q;
            m mVar = this.f305390t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f305388r;
                if (this.f305389s.f305600g) {
                    mVar.f305375c.c();
                    com.avito.android.beduin_shared.model.utils.a.a(mVar.f305376d, mVar.f305373a);
                    UniversalMapInternalAction.ScreenShownFirstTime screenShownFirstTime = UniversalMapInternalAction.ScreenShownFirstTime.f305551b;
                    this.f305387q = 1;
                    if (interfaceC43172j.emit(screenShownFirstTime, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            String str = mVar.f305374b;
            if (str != null) {
                InterfaceC19564a interfaceC19564a = ((AbstractC47541a.e) this.f305391u).f429697a;
                com.avito.android.beduin_shared.model.utils.a.a(mVar.f305376d, interfaceC19564a != null ? interfaceC19564a.b(str) : null);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public m(@Y61.l @InterfaceC35306l List<? extends BeduinAction> list, @Y61.l @InterfaceC35295a String str, @Y61.k InterfaceC35318f interfaceC35318f, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k d dVar, @Y61.k com.avito.android.universal_map.map.mvi.actor.a aVar, @Y61.k g gVar, @Y61.k j jVar) {
        this.f305373a = list;
        this.f305374b = str;
        this.f305375c = interfaceC35318f;
        this.f305376d = interfaceC40691b;
        this.f305377e = dVar;
        this.f305378f = aVar;
        this.f305379g = gVar;
        this.f305380h = jVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new q(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(C43175k.B(new o(2, null), new n(c43197r1, this, aVar)), p.f305402l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UniversalMapInternalAction> b(@Y61.k AbstractC47541a abstractC47541a, @Y61.k com.avito.android.universal_map.map.mvi.entity.e eVar) {
        if (abstractC47541a instanceof AbstractC47541a.b) {
            return this.f305377e.b((AbstractC47541a.b) abstractC47541a, eVar);
        }
        if (abstractC47541a instanceof AbstractC47541a.AbstractC12359a) {
            return this.f305378f.b((AbstractC47541a.AbstractC12359a) abstractC47541a, eVar);
        }
        if (abstractC47541a instanceof AbstractC47541a.c) {
            return this.f305379g.b((AbstractC47541a.c) abstractC47541a, eVar);
        }
        if (abstractC47541a instanceof AbstractC47541a.d) {
            return this.f305380h.b((AbstractC47541a.d) abstractC47541a, eVar);
        }
        if (abstractC47541a instanceof AbstractC47541a.e) {
            return C43175k.G(new b(eVar, this, abstractC47541a, null));
        }
        if (abstractC47541a instanceof AbstractC47541a.f) {
            return C43175k.w();
        }
        throw new NoWhenBranchMatchedException();
    }
}
