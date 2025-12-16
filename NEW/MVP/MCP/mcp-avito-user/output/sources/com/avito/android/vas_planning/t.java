package com.avito.android.vas_planning;

import androidx.view.C23060r0;
import androidx.view.M0;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.d0;
import com.avito.android.analytics.e0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.C;
import com.avito.android.util.architecture_components.D;
import com.avito.android.vas_planning.model.VasButton;
import com.avito.android.vas_planning.model.VasPlannerState;
import com.avito.android.vas_planning.model.VasPlanningItem;
import com.avito.android.vas_planning.q;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning/t;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/vas_planning/q;", "d", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t extends M0 implements q {

    /* renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f322519X = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f322520E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final VasPlanningFragmentArgument f322521J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning.domain.k f322522K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322523L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final J0 f322524M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322525N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C<P2<VasPlannerState>> f322526O = new C<>();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final D<P2<DeepLink>> f322527P = new D<>();

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final D<q.a> f322528Q = new D<>();

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final D<Integer> f322529R = new D<>();

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<VasPlanningItem.VasPlanningDateTime, org.threeten.bp.g>> f322530S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<VasPlanningItem.VasPlanningDateTime, Date>> f322531T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final D<VasPlanningItem.VasPlanningDateTime> f322532U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public AtomicReference f322533V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f322534W;

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningDateTime;", "Lorg/threeten/bp/g;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Q q12 = (Q) obj;
            VasPlanningItem.VasPlanningDateTime vasPlanningDateTime = (VasPlanningItem.VasPlanningDateTime) q12.f406619b;
            org.threeten.bp.g gVar = (org.threeten.bp.g) q12.f406620c;
            int i12 = t.f322519X;
            t tVar = t.this;
            tVar.getClass();
            if (vasPlanningDateTime == null) {
                return;
            }
            tVar.me(new y(tVar, vasPlanningDateTime, gVar));
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t.this.f322528Q.postValue(null);
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052.\u0010\u0004\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningDateTime;", "Ljava/util/Date;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            VasPlanningItem.VasPlanningDateTime vasPlanningDateTime;
            Q q12 = (Q) obj;
            VasPlanningItem.VasPlanningDateTime vasPlanningDateTime2 = (VasPlanningItem.VasPlanningDateTime) q12.f406619b;
            Date date = (Date) q12.f406620c;
            int i12 = t.f322519X;
            t tVar = t.this;
            tVar.getClass();
            if (vasPlanningDateTime2 == null || date == null) {
                vasPlanningDateTime = null;
            } else {
                l0.h hVar = new l0.h();
                tVar.me(new w(tVar, vasPlanningDateTime2, date, hVar));
                vasPlanningDateTime = (VasPlanningItem.VasPlanningDateTime) hVar.f406842b;
            }
            if (vasPlanningDateTime != null) {
                tVar.f322532U.postValue(vasPlanningDateTime);
            }
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/vas_planning/t$d;", "", "<init>", "()V", "", "KEY_VAS_PLANNING_SAVE_STATE", "Ljava/lang/String;", "", "THRESHOLD_TO_DELETE", "I", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/vas_planning/model/VasPlannerState;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2<VasPlannerState> p22 = (P2) obj;
            int i12 = t.f322519X;
            t tVar = t.this;
            tVar.getClass();
            if (p22 instanceof P2.b) {
                tVar.f322520E.e(((P2.b) p22).f318720a, "key_vas_planning_view_model_saved_state");
            }
            tVar.f322526O.postValue(p22);
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            V2.f318762a.f(th2);
            t.this.f322528Q.postValue(new q.a(null, null, th2, 3, null));
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/vas_planning/model/VasPlannerState;", VoiceInfo.STATE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.l<VasPlannerState, VasPlannerState> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ VasPlanningItem.VasPlanningDateTime f322540l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(VasPlanningItem.VasPlanningDateTime vasPlanningDateTime) {
            super(1);
            this.f322540l = vasPlanningDateTime;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v11, types: [T, java.util.ArrayList, java.util.List] */
        /* JADX WARN: Type inference failed for: r8v1, types: [T, java.util.ArrayList] */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.vas_planning.model.VasPlannerState invoke(com.avito.android.vas_planning.model.VasPlannerState r22) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_planning.t.g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/vas_planning/model/VasPlannerState;", VoiceInfo.STATE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.l<VasPlannerState, VasPlannerState> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ VasPlanningItem.VasPlanningRadioItem f322541l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f322542m;

        /* compiled from: VasPlanningViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f322543a;

            static {
                int[] iArr = new int[VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType.values().length];
                try {
                    VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType = VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType.f322437b;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f322543a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem, t tVar) {
            super(1);
            this.f322541l = vasPlanningRadioItem;
            this.f322542m = tVar;
        }

        @Override // Y41.l
        public final VasPlannerState invoke(VasPlannerState vasPlannerState) {
            VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem;
            VasPlannerState vasPlannerState2 = vasPlannerState;
            ArrayList arrayList = vasPlannerState2.f322418b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((VasPlanningItem) obj).getF322442c()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                vasPlanningRadioItem = this.f322541l;
                if (!zHasNext) {
                    break;
                }
                com.avito.conveyor_item.a aVarL = (VasPlanningItem) it.next();
                if (aVarL instanceof VasPlanningItem.VasPlanningRadioItem) {
                    aVarL = L.f(aVarL, vasPlanningRadioItem) ? VasPlanningItem.VasPlanningRadioItem.L((VasPlanningItem.VasPlanningRadioItem) aVarL, true, null, 767) : VasPlanningItem.VasPlanningRadioItem.L((VasPlanningItem.VasPlanningRadioItem) aVarL, false, null, 767);
                }
                arrayList3.add(aVarL);
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            arrayList4.addAll(vasPlanningRadioItem.f322436k);
            vasPlannerState2.f322420d.getClass();
            String str = vasPlanningRadioItem.f322434i;
            DeepLink deepLink = vasPlanningRadioItem.f322433h;
            VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType vasPlanningRadioType = vasPlanningRadioItem.f322429d;
            VasButton vasButton = new VasButton(str, deepLink, vasPlanningRadioType);
            if (a.f322543a[vasPlanningRadioType.ordinal()] == 1) {
                t tVar = this.f322542m;
                InterfaceC28373a interfaceC28373a = tVar.f322525N;
                VasPlanningFragmentArgument vasPlanningFragmentArgument = tVar.f322521J;
                interfaceC28373a.c(new e0(vasPlanningFragmentArgument.f322195b, vasPlanningFragmentArgument.f322197d));
            }
            return VasPlannerState.a(vasPlannerState2, arrayList4, vasButton, 2);
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {
        public i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2<DeepLink> p22 = (P2) obj;
            boolean zEquals = p22 instanceof P2.b ? true : p22.equals(P2.c.f318721a);
            t tVar = t.this;
            if (zEquals) {
                tVar.f322527P.postValue(p22);
            } else if (p22 instanceof P2.a) {
                P2.a aVar = (P2.a) p22;
                tVar.f322528Q.postValue(new q.a(z.k(aVar.f318719a), aVar.f318719a, null, 4, null));
            }
        }
    }

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {
        public j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            V2.f318762a.f(th2);
            t.this.f322528Q.postValue(new q.a(null, null, th2, 3, null));
        }
    }

    static {
        new d(null);
    }

    public t(@Y61.k C23060r0 c23060r0, @Y61.k VasPlanningFragmentArgument vasPlanningFragmentArgument, @Y61.k com.avito.android.vas_planning.domain.k kVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k J0 j02, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f322520E = c23060r0;
        this.f322521J = vasPlanningFragmentArgument;
        this.f322522K = kVar;
        this.f322523L = interfaceC35745a5;
        this.f322524M = j02;
        this.f322525N = interfaceC28373a;
        com.jakewharton.rxrelay3.c<Q<VasPlanningItem.VasPlanningDateTime, org.threeten.bp.g>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f322530S = cVar;
        com.jakewharton.rxrelay3.c<Q<VasPlanningItem.VasPlanningDateTime, Date>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f322531T = cVar2;
        this.f322532U = new D<>();
        this.f322533V = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        io.reactivex.rxjava3.disposables.c cVar3 = new io.reactivex.rxjava3.disposables.c();
        this.f322534W = cVar3;
        le();
        cVar3.b(cVar.v0(new a(), new b(), io.reactivex.rxjava3.internal.functions.a.f401993c));
        cVar3.b(cVar2.t0(new c()));
    }

    public static final ArrayList ke(t tVar, ArrayList arrayList, VasPlanningItem vasPlanningItem, Y41.l lVar) {
        tVar.getClass();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVarL = (VasPlanningItem) it.next();
            if (aVarL instanceof VasPlanningItem.VasPlanningRadioItem) {
                VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem = (VasPlanningItem.VasPlanningRadioItem) aVarL;
                List<VasPlanningItem> list = vasPlanningRadioItem.f322436k;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                for (VasPlanningItem vasPlanningItem2 : list) {
                    if (L.f(vasPlanningItem2, vasPlanningItem)) {
                        vasPlanningItem2 = (VasPlanningItem) lVar.invoke(vasPlanningItem);
                    }
                    arrayList3.add(vasPlanningItem2);
                }
                aVarL = VasPlanningItem.VasPlanningRadioItem.L(vasPlanningRadioItem, false, arrayList3, 511);
            } else if (L.f(aVarL, vasPlanningItem)) {
                aVarL = (VasPlanningItem) lVar.invoke(vasPlanningItem);
            }
            arrayList2.add(aVarL);
        }
        return arrayList2;
    }

    @Override // com.avito.android.vas_planning.q
    /* renamed from: I5, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF322530S() {
        return this.f322530S;
    }

    @Override // com.avito.android.vas_planning.q
    /* renamed from: Wc, reason: from getter */
    public final D getF322529R() {
        return this.f322529R;
    }

    @Override // com.avito.android.vas_planning.q
    /* renamed from: Xa, reason: from getter */
    public final D getF322532U() {
        return this.f322532U;
    }

    @Override // com.avito.android.vas_planning.item.radio.a
    public final void Xb(@Y61.k VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem) {
        me(new h(vasPlanningRadioItem, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.vas_planning.q
    public final void b6() {
        org.threeten.bp.g gVar;
        P2<VasPlannerState> value = this.f322526O.getValue();
        P2.b bVar = value instanceof P2.b ? (P2.b) value : null;
        if (bVar != null) {
            ArrayList arrayListB = C42745f0.B(((VasPlannerState) bVar.f318720a).f322418b, VasPlanningItem.VasPlanningDateTime.class);
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                VasPlanningItem.VasPlanningDateTime vasPlanningDateTime = (VasPlanningItem.VasPlanningDateTime) it.next();
                org.threeten.bp.e eVar = vasPlanningDateTime.f322423d;
                org.threeten.bp.f fVarG = (eVar == null || (gVar = vasPlanningDateTime.f322424e) == null) ? null : org.threeten.bp.f.G(eVar, gVar);
                if (fVarG != null) {
                    arrayList.add(fVarG);
                }
            }
            if (arrayList.isEmpty()) {
                this.f322529R.postValue(Integer.valueOf(R.string.vas_planning_date_time_error_is_empty));
            } else {
                this.f322534W.b(this.f322522K.a(this.f322521J.f322196c, arrayList).v0(new i(), new j(), io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.vas_planning.item.date_time.a
    public final void d2() {
        me(new u(this));
    }

    @Override // com.avito.android.vas_planning.item.date_time.a
    public final void e9(@Y61.k VasPlanningItem.VasPlanningDateTime vasPlanningDateTime) {
        me(new g(vasPlanningDateTime));
    }

    @Override // com.avito.android.vas_planning.q
    public final void eb(@Y61.k DeepLink deepLink) {
        VasPlanningFragmentArgument vasPlanningFragmentArgument = this.f322521J;
        this.f322525N.c(new d0(vasPlanningFragmentArgument.f322195b, vasPlanningFragmentArgument.f322197d));
        this.f322527P.postValue(new P2.b(deepLink));
    }

    @Override // com.avito.android.vas_planning.q
    /* renamed from: f3, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF322531T() {
        return this.f322531T;
    }

    @Override // com.avito.android.vas_planning.q
    /* renamed from: g6, reason: from getter */
    public final D getF322528Q() {
        return this.f322528Q;
    }

    @Override // com.avito.android.vas_planning.q
    public final void h0() {
        le();
    }

    @Override // com.avito.android.vas_planning.q
    /* renamed from: h3, reason: from getter */
    public final C getF322526O() {
        return this.f322526O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void le() {
        ?? r02 = this.f322533V;
        io.reactivex.rxjava3.disposables.c cVar = this.f322534W;
        cVar.a(r02);
        Object objB = this.f322520E.b("key_vas_planning_view_model_saved_state");
        VasPlannerState vasPlannerState = objB instanceof VasPlannerState ? (VasPlannerState) objB : null;
        io.reactivex.rxjava3.disposables.d dVarV0 = (vasPlannerState != null ? io.reactivex.rxjava3.core.z.c0(new P2.b(vasPlannerState)) : this.f322522K.b(this.f322521J.f322196c)).j0(this.f322523L.e()).v0(new e(), new f(), io.reactivex.rxjava3.internal.functions.a.f401993c);
        this.f322533V = (AtomicReference) dVarV0;
        cVar.b(dVarV0);
    }

    public final void me(Y41.l<? super VasPlannerState, VasPlannerState> lVar) {
        C<P2<VasPlannerState>> c12 = this.f322526O;
        P2<VasPlannerState> value = c12.getValue();
        P2.b bVar = value instanceof P2.b ? (P2.b) value : null;
        if (bVar != null) {
            P2.b bVar2 = new P2.b(lVar.invoke(bVar.f318720a));
            this.f322520E.e(bVar2.f318720a, "key_vas_planning_view_model_saved_state");
            c12.postValue(bVar2);
        }
    }

    @Override // com.avito.android.vas_planning.q
    /* renamed from: o4, reason: from getter */
    public final D getF322527P() {
        return this.f322527P;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f322534W.e();
        super.onCleared();
    }
}
