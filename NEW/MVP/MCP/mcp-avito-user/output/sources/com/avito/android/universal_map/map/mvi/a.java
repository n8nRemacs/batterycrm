package com.avito.android.universal_map.map.mvi;

import Hr.InterfaceC14024a;
import Vi.C15684a;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.map_core.beduin.BeduinResetMapAction;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.di.InterfaceC35296b;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import lj.InterfaceC43779a;
import t3.z0;

/* compiled from: UniversalMapBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.b<UniversalMapInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Long f305237a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f305238b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305239c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.universal_map.map_mvi.point_info.a f305240d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.universal_map.map_mvi.point_filters.a f305241e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f305242f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> f305243g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.o f305244h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C15684a f305245i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.i f305246j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.g f305247k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.e f305248l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.m f305249m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.a f305250n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.c f305251o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.k f305252p;

    /* compiled from: UniversalMapBootstrap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.universal_map.map.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9367a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f305253a;

        static {
            int[] iArr = new int[BeduinResetMapAction.ResetEntity.values().length];
            try {
                iArr[BeduinResetMapAction.ResetEntity.TOOLTIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinResetMapAction.ResetEntity.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinResetMapAction.ResetEntity.PINS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinResetMapAction.ResetEntity.SAVED_LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinResetMapAction.ResetEntity.FOCUS_ON_REGION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f305253a = iArr;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<UniversalMapInternalAction.BeduinFormContentChanged> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f305254b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f305255c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.universal_map.map.mvi.a$b$a, reason: collision with other inner class name */
        public static final class C9368a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f305256b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f305257c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.UniversalMapBootstrap$getBeduinFormFlow$$inlined$map$1$2", f = "UniversalMapBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.universal_map.map.mvi.a$b$a$a, reason: collision with other inner class name */
            public static final class C9369a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f305258q;

                /* renamed from: r, reason: collision with root package name */
                public int f305259r;

                public C9369a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f305258q = obj;
                    this.f305259r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9368a.this.emit(null, this);
                }
            }

            public C9368a(InterfaceC43172j interfaceC43172j, String str) {
                this.f305256b = interfaceC43172j;
                this.f305257c = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.universal_map.map.mvi.a.b.C9368a.C9369a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.universal_map.map.mvi.a$b$a$a r0 = (com.avito.android.universal_map.map.mvi.a.b.C9368a.C9369a) r0
                    int r1 = r0.f305259r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f305259r = r1
                    goto L18
                L13:
                    com.avito.android.universal_map.map.mvi.a$b$a$a r0 = new com.avito.android.universal_map.map.mvi.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f305258q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f305259r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$BeduinFormContentChanged r6 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$BeduinFormContentChanged
                    java.lang.String r2 = r4.f305257c
                    r6.<init>(r2, r5)
                    r0.f305259r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f305256b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.a.b.C9368a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, String str) {
            this.f305254b = interfaceC43160i;
            this.f305255c = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super UniversalMapInternalAction.BeduinFormContentChanged> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f305254b).collect(new C9368a(interfaceC43172j, this.f305255c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public a(@InterfaceC35296b @Y61.l Long l12, @Y61.k InterfaceC14024a interfaceC14024a, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.l com.avito.android.universal_map.map_mvi.point_info.a aVar, @Y61.l com.avito.android.universal_map.map_mvi.point_filters.a aVar2, @Y61.k R0 r02, @z0 @Y61.k u3.g<SimpleTestGroupWithNone> gVar, @Y61.k com.avito.android.map_core.beduin.action_handler.o oVar, @Y61.k C15684a c15684a, @Y61.k com.avito.android.map_core.beduin.action_handler.i iVar, @Y61.k com.avito.android.map_core.beduin.action_handler.g gVar2, @Y61.k com.avito.android.map_core.beduin.action_handler.e eVar, @Y61.k com.avito.android.map_core.beduin.action_handler.m mVar, @Y61.k com.avito.android.map_core.beduin.action_handler.a aVar3, @Y61.k com.avito.android.map_core.beduin.action_handler.c cVar, @Y61.k com.avito.android.map_core.beduin.action_handler.k kVar) {
        this.f305237a = l12;
        this.f305238b = interfaceC14024a;
        this.f305239c = interfaceC40691b;
        this.f305240d = aVar;
        this.f305241e = aVar2;
        this.f305242f = r02;
        this.f305243g = gVar;
        this.f305244h = oVar;
        this.f305245i = c15684a;
        this.f305246j = iVar;
        this.f305247k = gVar2;
        this.f305248l = eVar;
        this.f305249m = mVar;
        this.f305250n = aVar3;
        this.f305251o = cVar;
        this.f305252p = kVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<UniversalMapInternalAction> a() {
        boolean zB2 = this.f305243g.f439742a.f439749b.b();
        InterfaceC40691b interfaceC40691b = this.f305239c;
        R0 r02 = this.f305242f;
        if (!zB2) {
            return C43175k.N(c(), C43175k.I(r02.b(), C43175k.G(new c(y.a(interfaceC40691b.q()), null))));
        }
        InterfaceC43160i interfaceC43160iI = C43175k.I(r02.b(), new C43210w(UniversalMapInternalAction.RequestLocation.f305550b));
        InterfaceC43160i<UniversalMapInternalAction> interfaceC43160iC = c();
        InterfaceC43160i interfaceC43160iI2 = C43175k.I(r02.b(), C43175k.G(new c(y.a(interfaceC40691b.q()), null)));
        com.avito.android.universal_map.map_mvi.point_info.a aVar = this.f305240d;
        InterfaceC43160i interfaceC43160iW = aVar == null ? C43175k.w() : C43175k.I(r02.b(), C43175k.k(y.a(aVar.f306277a.getF103348p()), y.a(aVar.f306278b.getF103348p()), y.a(aVar.f306279c.getF103348p()), new f(this, null)));
        com.avito.android.universal_map.map_mvi.point_filters.a aVar2 = this.f305241e;
        return C43175k.N(interfaceC43160iI, interfaceC43160iC, interfaceC43160iI2, interfaceC43160iW, aVar2 == null ? C43175k.w() : C43175k.I(r02.b(), C43175k.k(y.a(aVar2.f306242a.getF103348p()), y.a(aVar2.f306243b.getF103348p()), y.a(aVar2.f306244c.getF103348p()), new e(this, null))), C43175k.I(r02.b(), new m(y.a(this.f305244h.f185662b))), C43175k.I(r02.b(), C43175k.G(new com.avito.android.universal_map.map.mvi.b(y.a(this.f305245i.f17364b), null))), new l(y.a(this.f305246j.f185656c)), C43175k.I(r02.b(), C43175k.G(new i(y.a(this.f305247k.f185653b), null))), C43175k.I(r02.b(), new h(y.a(this.f305248l.f185651b))), new j(y.a(this.f305249m.f185660b)), new d(y.a(this.f305250n.f185647b)), C43175k.I(r02.b(), C43175k.G(new g(y.a(this.f305251o.f185649b), null))), C43175k.I(r02.b(), C43175k.G(new k(y.a(this.f305252p.f185658b), null))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f305239c.onCleared();
        return G0.f406611a;
    }

    public final InterfaceC43160i<UniversalMapInternalAction> c() {
        Long l12 = this.f305237a;
        Object objB = l12 != null ? this.f305238b.b(Long.valueOf(l12.longValue())) : null;
        UniversalMapParams.BeduinForm beduinForm = objB instanceof UniversalMapParams.BeduinForm ? (UniversalMapParams.BeduinForm) objB : null;
        if (beduinForm == null) {
            return C43175k.w();
        }
        List<BeduinModel> list = beduinForm.f304748c;
        if (list == null) {
            return C43175k.w();
        }
        String str = beduinForm.f304747b;
        if (str == null) {
            str = "top";
        }
        InterfaceC43779a interfaceC43779aJ = this.f305239c.j();
        com.avito.android.beduin_shared.model.utils.j.b(interfaceC43779aJ, str, list);
        return C43175k.I(this.f305242f.b(), new b(y.a(interfaceC43779aJ.getF103348p()), str));
    }
}
