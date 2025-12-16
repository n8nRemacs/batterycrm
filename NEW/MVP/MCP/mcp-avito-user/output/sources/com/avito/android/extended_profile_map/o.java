package com.avito.android.extended_profile_map;

import AA.c;
import AA.d;
import Ai.DialogInterfaceOnDismissListenerC13035a;
import Fc1.D3;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapMarker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileMapView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_map.ExtendedProfileMapViewImpl$3$1", f = "ExtendedProfileMapView.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f151310q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileMapFragment f151311r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f151312s;

    /* compiled from: ExtendedProfileMapView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_map.ExtendedProfileMapViewImpl$3$1$1", f = "ExtendedProfileMapView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f151313q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w f151314r;

        /* compiled from: ExtendedProfileMapView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_map.ExtendedProfileMapViewImpl$3$1$1$1", f = "ExtendedProfileMapView.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile_map.o$a$a, reason: collision with other inner class name */
        public static final class C4423a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f151315q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ w f151316r;

            /* compiled from: ExtendedProfileMapView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.extended_profile_map.o$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C4424a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w f151317b;

                public C4424a(w wVar) {
                    this.f151317b = wVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    d.b bVar;
                    com.avito.android.lib.design.bottom_sheet.d dVar;
                    String str;
                    AvitoMapMarker avitoMapMarkerAddMarker$default;
                    AA.d dVar2 = (AA.d) obj;
                    w wVar = this.f151317b;
                    LinkedHashMap linkedHashMap = wVar.f151335i;
                    if (linkedHashMap.isEmpty()) {
                        for (ExtendedProfileAddress extendedProfileAddress : dVar2.f184a) {
                            AvitoMap avitoMap = wVar.f151333g;
                            if (avitoMap != null && (avitoMapMarkerAddMarker$default = AvitoMap.DefaultImpls.addMarker$default(avitoMap, extendedProfileAddress.f151140c, AvitoMapMarker.Type.MARKER_PIN_DEFAULT, (AvitoMapMarker.AvitoMapAnchor) null, (Float) null, R.style.Theme_DesignSystem_Re23, 12, (Object) null)) != null) {
                                avitoMapMarkerAddMarker$default.setData(extendedProfileAddress);
                                linkedHashMap.put(extendedProfileAddress.f151139b, avitoMapMarkerAddMarker$default);
                            }
                        }
                        Set<ExtendedProfileAddress> set = dVar2.f184a;
                        int size = set.size();
                        if (size != 0) {
                            if (size != 1) {
                                AvitoMap avitoMap2 = wVar.f151333g;
                                if (avitoMap2 != null) {
                                    Set<ExtendedProfileAddress> set2 = set;
                                    ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
                                    Iterator<T> it = set2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ExtendedProfileAddress) it.next()).f151140c);
                                    }
                                    AvitoMap.DefaultImpls.moveToPointsWithPaddingCentered$default(avitoMap2, arrayList, null, false, null, dVar2.f185b, 12, null);
                                }
                            } else {
                                ExtendedProfileAddress extendedProfileAddress2 = (ExtendedProfileAddress) C42745f0.D(set);
                                AvitoMap avitoMap3 = wVar.f151333g;
                                if (avitoMap3 != null) {
                                    avitoMap3.moveTo(extendedProfileAddress2.f151140c, false, Float.valueOf(10.0f));
                                }
                            }
                        }
                    }
                    String str2 = wVar.f151336j;
                    ExtendedProfileAddress extendedProfileAddress3 = dVar2.f186c;
                    G0 g02 = null;
                    if (!L.f(str2, extendedProfileAddress3 != null ? extendedProfileAddress3.f151139b : null)) {
                        String str3 = wVar.f151336j;
                        if (str3 != null) {
                            wVar.a(str3, false);
                        }
                        ExtendedProfileAddress extendedProfileAddress4 = dVar2.f186c;
                        if (extendedProfileAddress4 != null && (str = extendedProfileAddress4.f151139b) != null) {
                            wVar.a(str, true);
                        }
                        wVar.f151336j = extendedProfileAddress4 != null ? extendedProfileAddress4.f151139b : null;
                    }
                    com.avito.android.extended_profile_map.bottom_sheet.f fVar = wVar.f151338l;
                    com.avito.android.extended_profile_map.bottom_sheet.g gVar = dVar2.f187d;
                    if (gVar != null) {
                        fVar.c(gVar);
                        g02 = G0.f406611a;
                    }
                    if (g02 == null && (dVar = fVar.f151200m) != null) {
                        dVar.dismiss();
                    }
                    com.avito.android.lib.design.bottom_sheet.d dVar3 = wVar.f151337k;
                    if ((dVar3 == null || !dVar3.isShowing()) && (bVar = dVar2.f188e) != null) {
                        com.avito.android.lib.design.bottom_sheet.d dVarA = wVar.f151332f.a(bVar.f190a, bVar.f191b, wVar.f151328b.getContext(), new v(wVar));
                        dVarA.setOnCancelListener(new D3(wVar, 5));
                        dVarA.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(wVar, 16));
                        com.avito.android.lib.util.g.a(dVarA);
                        wVar.f151337k = dVarA;
                    }
                    G0 g03 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g03;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f151317b, w.class, "render", "render(Lcom/avito/android/extended_profile_map/mvi/entity/ExtendedProfileMapState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4423a(w wVar, Continuation<? super C4423a> continuation) {
                super(2, continuation);
                this.f151316r = wVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C4423a(this.f151316r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4423a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f151315q;
                w wVar = this.f151316r;
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        AvitoMap avitoMap = wVar.f151333g;
                        if (avitoMap != null) {
                            avitoMap.onStart();
                        }
                        AvitoMap avitoMap2 = wVar.f151333g;
                        if (avitoMap2 != null) {
                            avitoMap2.addMapClickListener(new s(wVar));
                        }
                        AvitoMap avitoMap3 = wVar.f151333g;
                        if (avitoMap3 != null) {
                            avitoMap3.addMarkerClickListener(new t(wVar));
                        }
                        AvitoMap avitoMap4 = wVar.f151333g;
                        if (avitoMap4 != null) {
                            avitoMap4.addMoveStartListener(new u(wVar));
                        }
                        y yVar = wVar.f151330d;
                        C4424a c4424a = new C4424a(wVar);
                        this.f151315q = 1;
                        if (yVar.le(c4424a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                } finally {
                    wVar.f151335i.clear();
                    wVar.f151336j = null;
                    AvitoMap avitoMap5 = wVar.f151333g;
                    if (avitoMap5 != null) {
                        avitoMap5.onStop(true);
                    }
                }
            }
        }

        /* compiled from: ExtendedProfileMapView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_map.ExtendedProfileMapViewImpl$3$1$1$2", f = "ExtendedProfileMapView.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f151318q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ w f151319r;

            /* compiled from: ExtendedProfileMapView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.extended_profile_map.o$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C4425a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w f151320b;

                public C4425a(w wVar) {
                    this.f151320b = wVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    ActivityC22955m activityC22955mL1;
                    w wVar = this.f151320b;
                    wVar.getClass();
                    if ((((AA.c) obj) instanceof c.a) && (activityC22955mL1 = wVar.f151329c.l1()) != null) {
                        activityC22955mL1.finish();
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f151320b, w.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/extended_profile_map/mvi/entity/ExtendedProfileMapOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(w wVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f151319r = wVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f151319r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f151318q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    w wVar = this.f151319r;
                    y yVar = wVar.f151330d;
                    C4425a c4425a = new C4425a(wVar);
                    this.f151318q = 1;
                    if (yVar.ke(c4425a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f151314r = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f151314r, continuation);
            aVar.f151313q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f151313q;
            w wVar = this.f151314r;
            C43259k.d(t12, null, null, new C4423a(wVar, null), 3);
            C43259k.d(t12, null, null, new b(wVar, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ExtendedProfileMapFragment extendedProfileMapFragment, w wVar, Continuation continuation) {
        super(2, continuation);
        this.f151311r = extendedProfileMapFragment;
        this.f151312s = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f151311r, this.f151312s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f151310q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(this.f151312s, null);
            this.f151310q = 1;
            if (C23056p0.b(this.f151311r, state, aVar, this) == coroutine_suspended) {
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
