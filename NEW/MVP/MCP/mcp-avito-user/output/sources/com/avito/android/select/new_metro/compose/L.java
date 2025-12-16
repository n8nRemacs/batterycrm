package com.avito.android.select.new_metro.compose;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.A0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.android.select.new_metro.item.SelectedStationInfo;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroState;
import com.avito.conveyor_item.ParcelableItem;
import iq0.InterfaceC42091a;
import iq0.InterfaceC42092b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectMetroScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroState;", VoiceInfo.STATE, "_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final float f265990a;

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.new_metro.compose.SelectMetroScreenKt$SelectMetroScreen$1", f = "SelectMetroScreen.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f265991q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f265992r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f265993s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ w0 f265994t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC42092b, G0> f265995u;

        /* compiled from: SelectMetroScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liq0/b;", "it", "Lkotlin/G0;", "emit", "(Liq0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.select.new_metro.compose.L$a$a, reason: collision with other inner class name */
        public static final class C7940a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.l<String, G0> f265996b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w0 f265997c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Y41.l<InterfaceC42092b, G0> f265998d;

            /* JADX WARN: Multi-variable type inference failed */
            public C7940a(Y41.l<? super String, G0> lVar, w0 w0Var, Y41.l<? super InterfaceC42092b, G0> lVar2) {
                this.f265996b = lVar;
                this.f265997c = w0Var;
                this.f265998d = lVar2;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC42092b interfaceC42092b = (InterfaceC42092b) obj;
                if (kotlin.jvm.internal.L.f(interfaceC42092b, InterfaceC42092b.c.f405268a)) {
                    this.f265996b.invoke("");
                } else {
                    if (kotlin.jvm.internal.L.f(interfaceC42092b, InterfaceC42092b.d.f405269a)) {
                        w0.c cVar = w0.f29712w;
                        Object objK = this.f265997c.k(0, 0, continuation);
                        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : G0.f406611a;
                    }
                    this.f265998d.invoke(interfaceC42092b);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.android.select.new_metro.mvi.t tVar, Y41.l<? super String, G0> lVar, w0 w0Var, Y41.l<? super InterfaceC42092b, G0> lVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f265992r = tVar;
            this.f265993s = lVar;
            this.f265994t = w0Var;
            this.f265995u = lVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f265992r, this.f265993s, this.f265994t, this.f265995u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f265991q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i<InterfaceC42092b> events = this.f265992r.getEvents();
                C7940a c7940a = new C7940a(this.f265993s, this.f265994t, this.f265995u);
                this.f265991q = 1;
                if (events.collect(c7940a, this) == coroutine_suspended) {
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

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f265999l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f266000m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f266001n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC42092b, G0> f266002o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.avito.android.select.new_metro.mvi.t tVar, boolean z12, Y41.l<? super Boolean, G0> lVar, Y41.l<? super InterfaceC42092b, G0> lVar2, int i12) {
            super(2);
            this.f265999l = tVar;
            this.f266000m = z12;
            this.f266001n = lVar;
            this.f266002o = lVar2;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(393);
            Y41.l<InterfaceC42092b, G0> lVar = this.f266002o;
            L.a(this.f265999l, this.f266000m, this.f266001n, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.new_metro.compose.SelectMetroScreenKt$SelectMetroScreen$3$1", f = "SelectMetroScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f266003q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f266004r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super Boolean, G0> lVar, boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f266003q = lVar;
            this.f266004r = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f266003q, this.f266004r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f266003q.invoke(Boxing.boxBoolean(this.f266004r));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Y41.p<MetroSelectedStationsItem, Boolean, G0> f266005A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MetroLineItem, G0> f266006B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MetroFilterItem, G0> f266007C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ boolean f266008D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f266009E;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f266010l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f266011m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f266012n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f266013o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f266014p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ SelectMetroState.SelectMetroStateLCE f266015q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f266016r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f266017s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ w0 f266018t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ List<ParcelableItem> f266019u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f266020v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f266021w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MetroListOutputTypeItem.OutputType, G0> f266022x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MetroStationItem, G0> f266023y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Y41.p<MetroSelectedStationsItem, String, G0> f266024z;

        /* compiled from: SelectMetroScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[SelectMetroState.SelectMetroStateLCE.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    SelectMetroState.SelectMetroStateLCE selectMetroStateLCE = SelectMetroState.SelectMetroStateLCE.f266254b;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    SelectMetroState.SelectMetroStateLCE selectMetroStateLCE2 = SelectMetroState.SelectMetroStateLCE.f266254b;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(boolean z12, int i12, Y41.a<G0> aVar, boolean z13, Y41.a<G0> aVar2, SelectMetroState.SelectMetroStateLCE selectMetroStateLCE, Y41.a<G0> aVar3, String str, w0 w0Var, List<? extends ParcelableItem> list, com.avito.android.analytics.screens.mvi.r rVar, Y41.l<? super String, G0> lVar, Y41.l<? super MetroListOutputTypeItem.OutputType, G0> lVar2, Y41.l<? super MetroStationItem, G0> lVar3, Y41.p<? super MetroSelectedStationsItem, ? super String, G0> pVar, Y41.p<? super MetroSelectedStationsItem, ? super Boolean, G0> pVar2, Y41.l<? super MetroLineItem, G0> lVar4, Y41.l<? super MetroFilterItem, G0> lVar5, boolean z14, Y41.a<G0> aVar4) {
            super(2);
            this.f266010l = z12;
            this.f266011m = i12;
            this.f266012n = aVar;
            this.f266013o = z13;
            this.f266014p = aVar2;
            this.f266015q = selectMetroStateLCE;
            this.f266016r = aVar3;
            this.f266017s = str;
            this.f266018t = w0Var;
            this.f266019u = list;
            this.f266020v = rVar;
            this.f266021w = lVar;
            this.f266022x = lVar2;
            this.f266023y = lVar3;
            this.f266024z = pVar;
            this.f266005A = pVar2;
            this.f266006B = lVar4;
            this.f266007C = lVar5;
            this.f266008D = z14;
            this.f266009E = aVar4;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            C20644z c20644z;
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar;
            Y41.p<InterfaceC22413h, Integer, G0> pVar2;
            Y41.p<InterfaceC22413h, U, G0> pVar3;
            v.a aVar;
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4;
            boolean z12;
            C20644z c20644z2;
            v.a aVar2;
            String strC;
            v.a aVar3;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar4 = androidx.compose.ui.v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar4);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar5);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar5 = InterfaceC22413h.a.f40796g;
                R3.b(pVar5, a13, interfaceC22365i0D);
                Y41.p<InterfaceC22413h, U, G0> pVar6 = InterfaceC22413h.a.f40795f;
                R3.b(pVar6, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar7 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar7);
                }
                Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar8 = InterfaceC22413h.a.f40793d;
                R3.b(pVar8, a13, vVarC);
                C20644z c20644z3 = C20644z.f28804a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(aVar4, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a);
                C20585k.f28659a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarB);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar5);
                } else {
                    a13.d();
                }
                R3.b(pVar5, a13, iA2);
                R3.b(pVar6, a13, o1Y2);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar7);
                }
                R3.b(pVar8, a13, vVarC2);
                androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                a13.C(51768192);
                if (this.f266013o) {
                    c20644z = c20644z3;
                    pVar = pVar8;
                    pVar2 = pVar7;
                    pVar3 = pVar6;
                    aVar = aVar4;
                    pVar4 = pVar5;
                } else {
                    androidx.compose.ui.v vVarA = C22501m2.a(aVar4, "nav_bar");
                    com.akita.compose.component.navbar.u f66453a = com.akita.compose.theme.re23.b.n(a13).getF66453a();
                    String strC2 = u0.i.c(a13, R.string.select_metro_fragment_title);
                    C22096n c22096nC = androidx.compose.runtime.internal.r.c(-675763664, new M(this.f266009E, this.f266008D), a13);
                    c20644z = c20644z3;
                    pVar = pVar8;
                    pVar2 = pVar7;
                    pVar3 = pVar6;
                    aVar = aVar4;
                    pVar4 = pVar5;
                    com.akita.compose.component.navbar.t.d(strC2, vVarA, f66453a, 0, this.f266014p, c22096nC, a13, 196656, 8);
                }
                a13.h();
                int iOrdinal = this.f266015q.ordinal();
                boolean z13 = this.f266010l;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        z12 = z13;
                        aVar3 = aVar;
                        a13.C(51820084);
                        L.c(this.f266017s, this.f266018t, this.f266019u, z12, this.f266020v, this.f266021w, this.f266022x, this.f266023y, this.f266024z, this.f266005A, this.f266006B, this.f266007C, a13, 512, 0);
                        a13.h();
                        G0 g02 = G0.f406611a;
                        a13 = a13;
                    } else if (iOrdinal != 2) {
                        a13.C(1607121811);
                        a13.h();
                        G0 g03 = G0.f406611a;
                        z12 = z13;
                        aVar2 = aVar;
                        c20644z2 = c20644z;
                    } else {
                        a13.C(51794505);
                        z12 = z13;
                        aVar3 = aVar;
                        com.akita.compose.component.content_placeholder.b.c(R.drawable.placeholders_img_unknown_error, u0.i.c(a13, R.string.unknown_error), "", u0.i.c(a13, R.string.try_again), this.f266016r, null, null, 0L, null, null, false, false, a13, 0, 0, 4064);
                        a13.h();
                        G0 g04 = G0.f406611a;
                    }
                    c20644z2 = c20644z;
                    aVar2 = aVar3;
                } else {
                    z12 = z13;
                    v.a aVar6 = aVar;
                    a13.C(51810146);
                    FillElement fillElement = C20588k2.f28682c;
                    InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
                    int f37888q3 = a13.getF37888Q();
                    O1 o1Y3 = a13.y();
                    androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(a13, fillElement);
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar5);
                    } else {
                        a13.d();
                    }
                    R3.b(pVar4, a13, interfaceC22365i0D2);
                    R3.b(pVar3, a13, o1Y3);
                    if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q3))) {
                        androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar2);
                    }
                    R3.b(pVar, a13, vVarC3);
                    c20644z2 = c20644z;
                    aVar2 = aVar6;
                    com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(a13).getF66694c(), c20644z2.d(aVar2, InterfaceC22215f.a.f39080f), a13, 0, 0);
                    a13.z();
                    a13.h();
                    G0 g05 = G0.f406611a;
                }
                a13.z();
                a13.C(1046104851);
                if (z12) {
                    int i12 = this.f266011m;
                    if (i12 > 0) {
                        a13.C(-1930425024);
                        strC = u0.i.a(R.plurals.select_n_stations, i12, new Object[]{Integer.valueOf(i12)}, a13);
                        a13.h();
                    } else {
                        a13.C(-1930183906);
                        strC = u0.i.c(a13, R.string.sele_t_metro_accept_res_0x7f13156d);
                        a13.h();
                    }
                    androidx.compose.ui.v vVarD = c20644z2.d(C22501m2.a(R1.i(C20588k2.d(aVar2, 1.0f), L.f265990a), "apply_button"), InterfaceC22215f.a.f39083i);
                    com.akita.compose.component.button.m.c(strC, this.f266012n, com.akita.compose.theme.re23.b.c(a13).f2(), vVarD, null, null, null, false, false, null, a13, 512, 1008);
                }
                a13.h();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Y41.p<MetroSelectedStationsItem, String, G0> f266025A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ Y41.p<MetroSelectedStationsItem, Boolean, G0> f266026B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MetroLineItem, G0> f266027C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MetroFilterItem, G0> f266028D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f266029E;

        /* renamed from: F, reason: collision with root package name */
        public final /* synthetic */ int f266030F;

        /* renamed from: G, reason: collision with root package name */
        public final /* synthetic */ int f266031G;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f266032l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f266033m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ w0 f266034n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ SelectMetroState.SelectMetroStateLCE f266035o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ List<ParcelableItem> f266036p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f266037q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f266038r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f266039s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f266040t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f266041u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f266042v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f266043w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f266044x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MetroListOutputTypeItem.OutputType, G0> f266045y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MetroStationItem, G0> f266046z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z12, String str, w0 w0Var, SelectMetroState.SelectMetroStateLCE selectMetroStateLCE, List<? extends ParcelableItem> list, boolean z13, com.avito.android.analytics.screens.mvi.r rVar, int i12, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.l<? super String, G0> lVar, Y41.a<G0> aVar4, Y41.l<? super MetroListOutputTypeItem.OutputType, G0> lVar2, Y41.l<? super MetroStationItem, G0> lVar3, Y41.p<? super MetroSelectedStationsItem, ? super String, G0> pVar, Y41.p<? super MetroSelectedStationsItem, ? super Boolean, G0> pVar2, Y41.l<? super MetroLineItem, G0> lVar4, Y41.l<? super MetroFilterItem, G0> lVar5, Y41.l<? super Boolean, G0> lVar6, int i13, int i14) {
            super(2);
            this.f266032l = z12;
            this.f266033m = str;
            this.f266034n = w0Var;
            this.f266035o = selectMetroStateLCE;
            this.f266036p = list;
            this.f266037q = z13;
            this.f266038r = rVar;
            this.f266039s = i12;
            this.f266040t = aVar;
            this.f266041u = aVar2;
            this.f266042v = aVar3;
            this.f266043w = lVar;
            this.f266044x = aVar4;
            this.f266045y = lVar2;
            this.f266046z = lVar3;
            this.f266025A = pVar;
            this.f266026B = pVar2;
            this.f266027C = lVar4;
            this.f266028D = lVar5;
            this.f266029E = lVar6;
            this.f266030F = i13;
            this.f266031G = i14;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f266030F | 1);
            int iA3 = C22066f2.a(this.f266031G);
            Y41.l<MetroFilterItem, G0> lVar = this.f266028D;
            Y41.l<Boolean, G0> lVar2 = this.f266029E;
            L.b(this.f266032l, this.f266033m, this.f266034n, this.f266035o, this.f266036p, this.f266037q, this.f266038r, this.f266039s, this.f266040t, this.f266041u, this.f266042v, this.f266043w, this.f266044x, this.f266045y, this.f266046z, this.f266025A, this.f266026B, this.f266027C, lVar, lVar2, a12, iA2, iA3);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266047l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.select.new_metro.mvi.t tVar) {
            super(0);
            this.f266047l = tVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f266047l.accept(InterfaceC42091a.b.f405256a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266048l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.avito.android.select.new_metro.mvi.t tVar) {
            super(0);
            this.f266048l = tVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f266048l.accept(InterfaceC42091a.C11537a.f405255a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266049l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.avito.android.select.new_metro.mvi.t tVar) {
            super(0);
            this.f266049l = tVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f266049l.accept(InterfaceC42091a.c.f405257a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroFilterItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroFilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<MetroFilterItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266050l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T f266051m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f266052n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ w0 f266053o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.avito.android.select.new_metro.mvi.t tVar, T t12, InterfaceC22204y1 interfaceC22204y1, w0 w0Var) {
            super(1);
            this.f266050l = tVar;
            this.f266051m = t12;
            this.f266052n = interfaceC22204y1;
            this.f266053o = w0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(MetroFilterItem metroFilterItem) {
            MetroFilterItem metroFilterItem2 = metroFilterItem;
            metroFilterItem2.f266180f = !metroFilterItem2.f266180f;
            this.f266050l.accept(new InterfaceC42091a.d(metroFilterItem2));
            float f12 = L.f265990a;
            Iterator<ParcelableItem> it = ((SelectMetroState) this.f266052n.getF42167b()).f266250d.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                ParcelableItem next = it.next();
                if ((next instanceof MetroFilterItem) && ((MetroFilterItem) next).f266179e == metroFilterItem2.f266179e) {
                    break;
                }
                i12++;
            }
            if (i12 >= 0) {
                C43259k.d(this.f266051m, null, null, new N(this.f266053o, i12, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroLineItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroLineItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<MetroLineItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266054l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.avito.android.select.new_metro.mvi.t tVar) {
            super(1);
            this.f266054l = tVar;
        }

        @Override // Y41.l
        public final G0 invoke(MetroLineItem metroLineItem) {
            MetroLineItem metroLineItem2 = metroLineItem;
            metroLineItem2.f266186g = !metroLineItem2.f266186g;
            this.f266054l.accept(new InterfaceC42091a.f(metroLineItem2));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroListOutputTypeItem$OutputType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroListOutputTypeItem$OutputType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<MetroListOutputTypeItem.OutputType, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266055l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.avito.android.select.new_metro.mvi.t tVar) {
            super(1);
            this.f266055l = tVar;
        }

        @Override // Y41.l
        public final G0 invoke(MetroListOutputTypeItem.OutputType outputType) {
            this.f266055l.accept(new InterfaceC42091a.g(new MetroListOutputTypeItem("", outputType)));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "q", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266056l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.avito.android.select.new_metro.mvi.t tVar) {
            super(1);
            this.f266056l = tVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f266056l.accept(new InterfaceC42091a.i(str));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266057l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.avito.android.select.new_metro.mvi.t tVar) {
            super(0);
            this.f266057l = tVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f266057l.accept(InterfaceC42091a.h.f405262a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroStationItem;", "stationItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroStationItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.l<MetroStationItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266058l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.avito.android.select.new_metro.mvi.t tVar) {
            super(1);
            this.f266058l = tVar;
        }

        @Override // Y41.l
        public final G0 invoke(MetroStationItem metroStationItem) {
            MetroStationItem metroStationItem2 = metroStationItem;
            metroStationItem2.f266204g = !metroStationItem2.f266204g;
            this.f266058l.accept(new InterfaceC42091a.k(metroStationItem2));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroSelectedStationsItem;", "item", "", "id", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroSelectedStationsItem;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.p<MetroSelectedStationsItem, String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266059l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.avito.android.select.new_metro.mvi.t tVar) {
            super(2);
            this.f266059l = tVar;
        }

        @Override // Y41.p
        public final G0 invoke(MetroSelectedStationsItem metroSelectedStationsItem, String str) {
            Object next;
            MetroSelectedStationsItem metroSelectedStationsItem2 = metroSelectedStationsItem;
            String str2 = str;
            LinkedHashSet linkedHashSet = metroSelectedStationsItem2.f266198g;
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((SelectedStationInfo) next).f266208b, str2)) {
                    break;
                }
            }
            SelectedStationInfo selectedStationInfo = (SelectedStationInfo) next;
            if (selectedStationInfo != null) {
                metroSelectedStationsItem2.f266197f.remove(selectedStationInfo);
                this.f266059l.accept(new InterfaceC42091a.j(MetroSelectedStationsItem.a(metroSelectedStationsItem2, C42745f0.M0(linkedHashSet))));
                G0 g02 = G0.f406611a;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroSelectedStationsItem;", "item", "", "isExpanded", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroSelectedStationsItem;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.p<MetroSelectedStationsItem, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T f266060l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.new_metro.mvi.t f266061m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ w0 f266062n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(T t12, com.avito.android.select.new_metro.mvi.t tVar, w0 w0Var) {
            super(2);
            this.f266060l = t12;
            this.f266061m = tVar;
            this.f266062n = w0Var;
        }

        @Override // Y41.p
        public final G0 invoke(MetroSelectedStationsItem metroSelectedStationsItem, Boolean bool) {
            MetroSelectedStationsItem metroSelectedStationsItem2 = metroSelectedStationsItem;
            boolean zBooleanValue = bool.booleanValue();
            metroSelectedStationsItem2.f266195d = zBooleanValue;
            if (!zBooleanValue) {
                C43259k.d(this.f266060l, null, null, new O(this.f266062n, null), 3);
            }
            this.f266061m.accept(new InterfaceC42091a.j(metroSelectedStationsItem2));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class q {
        static {
            int[] iArr = new int[MetroListOutputTypeItem.OutputType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MetroListOutputTypeItem.OutputType outputType = MetroListOutputTypeItem.OutputType.f266189b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f265990a = 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.select.new_metro.mvi.t tVar, boolean z12, @Y61.k Y41.l<? super Boolean, G0> lVar, @Y61.k Y41.l<? super InterfaceC42092b, G0> lVar2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-622379724);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT);
        }
        T t12 = (T) objT;
        w0 w0VarA = A0.a(0, 0, 3, bE2);
        InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(tVar.getState(), bE2);
        bE2.C(-1438635591);
        Object objT2 = bE2.t();
        if (objT2 == c1651a) {
            objT2 = new g(tVar);
            bE2.H(objT2);
        }
        Y41.a aVar = (Y41.a) objT2;
        Object objI = com.akita.compose.component.accordion.s.i(-1438632552, bE2, false);
        if (objI == c1651a) {
            objI = new f(tVar);
            bE2.H(objI);
        }
        Y41.a aVar2 = (Y41.a) objI;
        Object objI2 = com.akita.compose.component.accordion.s.i(-1438629531, bE2, false);
        if (objI2 == c1651a) {
            objI2 = new m(tVar);
            bE2.H(objI2);
        }
        Y41.a aVar3 = (Y41.a) objI2;
        Object objI3 = com.akita.compose.component.accordion.s.i(-1438626047, bE2, false);
        if (objI3 == c1651a) {
            objI3 = new h(tVar);
            bE2.H(objI3);
        }
        Y41.a aVar4 = (Y41.a) objI3;
        Object objI4 = com.akita.compose.component.accordion.s.i(-1438622668, bE2, false);
        if (objI4 == c1651a) {
            objI4 = new l(tVar);
            bE2.H(objI4);
        }
        Y41.l lVar3 = (Y41.l) objI4;
        Object objI5 = com.akita.compose.component.accordion.s.i(-1438618434, bE2, false);
        if (objI5 == c1651a) {
            objI5 = new k(tVar);
            bE2.H(objI5);
        }
        Y41.l lVar4 = (Y41.l) objI5;
        Object objI6 = com.akita.compose.component.accordion.s.i(-1438611998, bE2, false);
        if (objI6 == c1651a) {
            objI6 = new n(tVar);
            bE2.H(objI6);
        }
        Y41.l lVar5 = (Y41.l) objI6;
        Object objI7 = com.akita.compose.component.accordion.s.i(-1438604315, bE2, false);
        if (objI7 == c1651a) {
            objI7 = new o(tVar);
            bE2.H(objI7);
        }
        Y41.p pVar = (Y41.p) objI7;
        Object objI8 = com.akita.compose.component.accordion.s.i(-1438592521, bE2, false);
        if (objI8 == c1651a) {
            objI8 = new p(t12, tVar, w0VarA);
            bE2.H(objI8);
        }
        Y41.p pVar2 = (Y41.p) objI8;
        Object objI9 = com.akita.compose.component.accordion.s.i(-1438581433, bE2, false);
        if (objI9 == c1651a) {
            objI9 = new j(tVar);
            bE2.H(objI9);
        }
        Y41.l lVar6 = (Y41.l) objI9;
        bE2.X(false);
        List<ParcelableItem> list = ((SelectMetroState) interfaceC22204y1B.getF42167b()).f266250d;
        bE2.C(-1438574492);
        boolean zB2 = bE2.B(list);
        Object objT3 = bE2.t();
        if (zB2 || objT3 == c1651a) {
            objT3 = new i(tVar, t12, interfaceC22204y1B, w0VarA);
            bE2.H(objT3);
        }
        Y41.l lVar7 = (Y41.l) objT3;
        bE2.X(false);
        C22187u0.d(new a(tVar, lVar3, w0VarA, lVar2, null), bE2, lVar2);
        b(z12, ((SelectMetroState) interfaceC22204y1B.getF42167b()).f266253g, w0VarA, ((SelectMetroState) interfaceC22204y1B.getF42167b()).f266252f, ((SelectMetroState) interfaceC22204y1B.getF42167b()).f266250d, !((SelectMetroState) interfaceC22204y1B.getF42167b()).f266249c.f266196e.isEmpty() || ((SelectMetroState) interfaceC22204y1B.getF42167b()).f266251e, ((SelectMetroState) interfaceC22204y1B.getF42167b()).getPerfTrackerParams(), ((SelectMetroState) interfaceC22204y1B.getF42167b()).f266249c.f266196e.size(), aVar4, aVar, aVar3, lVar3, aVar2, lVar4, lVar5, pVar, pVar2, lVar6, lVar7, lVar, bE2, 906002432, 819686838);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(tVar, z12, lVar, lVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r39, java.lang.String r40, androidx.compose.foundation.lazy.w0 r41, com.avito.android.select.new_metro.mvi.entity.SelectMetroState.SelectMetroStateLCE r42, java.util.List<? extends com.avito.conveyor_item.ParcelableItem> r43, boolean r44, com.avito.android.analytics.screens.mvi.r r45, int r46, Y41.a<kotlin.G0> r47, Y41.a<kotlin.G0> r48, Y41.a<kotlin.G0> r49, Y41.l<? super java.lang.String, kotlin.G0> r50, Y41.a<kotlin.G0> r51, Y41.l<? super com.avito.android.select.new_metro.item.MetroListOutputTypeItem.OutputType, kotlin.G0> r52, Y41.l<? super com.avito.android.select.new_metro.item.MetroStationItem, kotlin.G0> r53, Y41.p<? super com.avito.android.select.new_metro.item.MetroSelectedStationsItem, ? super java.lang.String, kotlin.G0> r54, Y41.p<? super com.avito.android.select.new_metro.item.MetroSelectedStationsItem, ? super java.lang.Boolean, kotlin.G0> r55, Y41.l<? super com.avito.android.select.new_metro.item.MetroLineItem, kotlin.G0> r56, Y41.l<? super com.avito.android.select.new_metro.item.MetroFilterItem, kotlin.G0> r57, Y41.l<? super java.lang.Boolean, kotlin.G0> r58, androidx.compose.runtime.A r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.new_metro.compose.L.b(boolean, java.lang.String, androidx.compose.foundation.lazy.w0, com.avito.android.select.new_metro.mvi.entity.SelectMetroState$SelectMetroStateLCE, java.util.List, boolean, com.avito.android.analytics.screens.mvi.r, int, Y41.a, Y41.a, Y41.a, Y41.l, Y41.a, Y41.l, Y41.l, Y41.p, Y41.p, Y41.l, Y41.l, Y41.l, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r41, androidx.compose.foundation.lazy.w0 r42, java.util.List r43, boolean r44, com.avito.android.analytics.screens.mvi.r r45, Y41.l r46, Y41.l r47, Y41.l r48, Y41.p r49, Y41.p r50, Y41.l r51, Y41.l r52, androidx.compose.runtime.A r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.new_metro.compose.L.c(java.lang.String, androidx.compose.foundation.lazy.w0, java.util.List, boolean, com.avito.android.analytics.screens.mvi.r, Y41.l, Y41.l, Y41.l, Y41.p, Y41.p, Y41.l, Y41.l, androidx.compose.runtime.A, int, int):void");
    }
}
