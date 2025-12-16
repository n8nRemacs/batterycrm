package com.avito.android.mortgage.landing.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.G;
import com.avito.android.mortgage.deeplink.domain.g;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.ValueItem;
import com.avito.android.mortgage.landing.list.items.offers.OffersItem;
import com.avito.android.mortgage.landing.list.items.offers.offer.OfferItem;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.R0;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import h31.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LandingInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/domain/b;", "Lcom/avito/android/mortgage/landing/mvi/domain/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage.landing.mvi.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<IZ.a> f200108a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f200109b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final G f200110c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.util.d f200111d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f200112e;

    /* compiled from: LandingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.domain.LandingInteractorImpl$createApplicationIfNotExists$1", f = "LandingInteractor.kt", i = {2, 2, 3, 6, 6, 7, 7, 9, 9, 12, 13, 13, 16, 16, 16}, l = {170, 180, 192, 196, 197, 200, 207, 210, 213, 220, 222, 224, 232, 235, 238, 245, 247, 248}, m = "invokeSuspend", n = {"$this$flow", "params", "$this$flow", "$this$flow", "params", "$this$flow", "request", "$this$flow", "appId", "$this$flow", "$this$flow", "request", "$this$flow", ContextActionHandler.Link.DEEPLINK, "appId"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super LandingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f200113q;

        /* renamed from: r, reason: collision with root package name */
        public String f200114r;

        /* renamed from: s, reason: collision with root package name */
        public int f200115s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f200116t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f200118v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f200119w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f200120x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Map<String, LandingItem> f200121y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f200122z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, String str3, Map<String, ? extends LandingItem> map, boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f200118v = str;
            this.f200119w = str2;
            this.f200120x = str3;
            this.f200121y = map;
            this.f200122z = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f200118v, this.f200119w, this.f200120x, this.f200121y, this.f200122z, continuation);
            aVar.f200116t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super LandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x0267  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x027d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0285  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x02c3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x030e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01d2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 860
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.landing.mvi.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LandingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.domain.LandingInteractorImpl$loadCalculationAndOffers$1", f = "LandingInteractor.kt", i = {0, 1, 2, 2, 4, 4, 5, 5}, l = {80, 83, 86, 88, 95, UpdateStatusCode.DialogButton.CONFIRM, 102, 103}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "calculationResult", "$this$flow", "calculation", "$this$flow", "calculation"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.avito.android.mortgage.landing.mvi.domain.b$b, reason: collision with other inner class name */
    public static final class C5919b extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f200123q;

        /* renamed from: r, reason: collision with root package name */
        public int f200124r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f200125s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MZ.k f200126t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f200127u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5919b(MZ.k kVar, b bVar, Continuation<? super C5919b> continuation) {
            super(2, continuation);
            this.f200126t = kVar;
            this.f200127u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C5919b c5919b = new C5919b(this.f200126t, this.f200127u, continuation);
            c5919b.f200125s = obj;
            return c5919b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C5919b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0233 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 670
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.landing.mvi.domain.b.C5919b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LandingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.domain.LandingInteractorImpl$requestApplicationId$1", f = "LandingInteractor.kt", i = {0, 1, 2, 2, 4, 4}, l = {141, 143, 147, 149, 154, 155}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "request", "$this$flow", "appId"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super LandingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f200128q;

        /* renamed from: r, reason: collision with root package name */
        public int f200129r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f200130s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f200131t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f200132u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f200133v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, b bVar, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f200131t = str;
            this.f200132u = bVar;
            this.f200133v = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f200131t, this.f200132u, this.f200133v, continuation);
            cVar.f200130s = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super LandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.landing.mvi.domain.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LandingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.domain.LandingInteractorImpl$updateApplication$1", f = "LandingInteractor.kt", i = {1, 2, 3, 3, 5}, l = {265, 269, 277, 280, 283, 287, 288, 289}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "request", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super LandingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult.Error f200134q;

        /* renamed from: r, reason: collision with root package name */
        public int f200135r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f200136s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f200138u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f200139v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f200140w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Map<String, LandingItem> f200141x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String str3, Map<String, ? extends LandingItem> map, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f200138u = str;
            this.f200139v = str2;
            this.f200140w = str3;
            this.f200141x = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = b.this.new d(this.f200138u, this.f200139v, this.f200140w, this.f200141x, continuation);
            dVar.f200136s = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super LandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.landing.mvi.domain.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k e<IZ.a> eVar, @k g gVar, @k G g12, @k com.avito.android.mortgage.util.d dVar, @k R0 r02) {
        this.f200108a = eVar;
        this.f200109b = gVar;
        this.f200110c = g12;
        this.f200111d = dVar;
        this.f200112e = r02;
    }

    public static final IZ.a f(b bVar) {
        return bVar.f200108a.get();
    }

    public static MZ.k g(String str, String str2, String str3, Map map) {
        List<OfferItem> list;
        String strS1;
        String strS12;
        String strS13;
        String strS14;
        String strS15;
        Object obj = map.get("regionId");
        ArrayList arrayList = null;
        if (!(obj instanceof ValueItem)) {
            obj = null;
        }
        ValueItem valueItem = (ValueItem) obj;
        String strS16 = valueItem != null ? valueItem.s1() : null;
        Object obj2 = map.get("purposeId");
        if (!(obj2 instanceof ValueItem)) {
            obj2 = null;
        }
        ValueItem valueItem2 = (ValueItem) obj2;
        String strS17 = valueItem2 != null ? valueItem2.s1() : null;
        Object obj3 = map.get("landCost");
        if (!(obj3 instanceof ValueItem)) {
            obj3 = null;
        }
        ValueItem valueItem3 = (ValueItem) obj3;
        Integer numY0 = (valueItem3 == null || (strS15 = valueItem3.s1()) == null) ? null : C43066x.y0(strS15);
        Object obj4 = map.get("houseCost");
        if (!(obj4 instanceof ValueItem)) {
            obj4 = null;
        }
        ValueItem valueItem4 = (ValueItem) obj4;
        Integer numY02 = (valueItem4 == null || (strS14 = valueItem4.s1()) == null) ? null : C43066x.y0(strS14);
        Object obj5 = map.get("propertyCost");
        if (!(obj5 instanceof ValueItem)) {
            obj5 = null;
        }
        ValueItem valueItem5 = (ValueItem) obj5;
        Integer numY03 = (valueItem5 == null || (strS13 = valueItem5.s1()) == null) ? null : C43066x.y0(strS13);
        Object obj6 = map.get("downPayment");
        if (!(obj6 instanceof ValueItem)) {
            obj6 = null;
        }
        ValueItem valueItem6 = (ValueItem) obj6;
        Integer numY04 = (valueItem6 == null || (strS12 = valueItem6.s1()) == null) ? null : C43066x.y0(strS12);
        Object obj7 = map.get("creditTerm");
        if (!(obj7 instanceof ValueItem)) {
            obj7 = null;
        }
        ValueItem valueItem7 = (ValueItem) obj7;
        Integer numY05 = (valueItem7 == null || (strS1 = valueItem7.s1()) == null) ? null : C43066x.y0(strS1);
        Object obj8 = map.get("mortgageProgram");
        if (!(obj8 instanceof ValueItem)) {
            obj8 = null;
        }
        ValueItem valueItem8 = (ValueItem) obj8;
        String strS18 = valueItem8 != null ? valueItem8.s1() : null;
        Object obj9 = map.get("landingBorrowerAge");
        if (!(obj9 instanceof ValueItem)) {
            obj9 = null;
        }
        ValueItem valueItem9 = (ValueItem) obj9;
        String strS19 = valueItem9 != null ? valueItem9.s1() : null;
        Object obj10 = map.get("occupation");
        if (!(obj10 instanceof ValueItem)) {
            obj10 = null;
        }
        ValueItem valueItem10 = (ValueItem) obj10;
        String strS110 = valueItem10 != null ? valueItem10.s1() : null;
        Object obj11 = map.get("totalExperience");
        if (!(obj11 instanceof ValueItem)) {
            obj11 = null;
        }
        ValueItem valueItem11 = (ValueItem) obj11;
        String strS111 = valueItem11 != null ? valueItem11.s1() : null;
        Object obj12 = map.get("currentExperience");
        if (!(obj12 instanceof ValueItem)) {
            obj12 = null;
        }
        ValueItem valueItem12 = (ValueItem) obj12;
        String strS112 = valueItem12 != null ? valueItem12.s1() : null;
        Object obj13 = map.get("businessAge");
        if (!(obj13 instanceof ValueItem)) {
            obj13 = null;
        }
        ValueItem valueItem13 = (ValueItem) obj13;
        String strS113 = valueItem13 != null ? valueItem13.s1() : null;
        Object obj14 = map.get("selfEmployedExperience");
        if (!(obj14 instanceof ValueItem)) {
            obj14 = null;
        }
        ValueItem valueItem14 = (ValueItem) obj14;
        String strS114 = valueItem14 != null ? valueItem14.s1() : null;
        Object obj15 = map.get("proofOfIncome");
        if (!(obj15 instanceof ValueItem)) {
            obj15 = null;
        }
        ValueItem valueItem15 = (ValueItem) obj15;
        String strS115 = valueItem15 != null ? valueItem15.s1() : null;
        Object obj16 = map.get("bankPayrollId");
        if (!(obj16 instanceof ValueItem)) {
            obj16 = null;
        }
        ValueItem valueItem16 = (ValueItem) obj16;
        String strS116 = valueItem16 != null ? valueItem16.s1() : null;
        Object obj17 = map.get("bankSalaryId");
        if (!(obj17 instanceof ValueItem)) {
            obj17 = null;
        }
        ValueItem valueItem17 = (ValueItem) obj17;
        String strS117 = valueItem17 != null ? valueItem17.s1() : null;
        Object obj18 = map.get("banksPreferred");
        if (!(obj18 instanceof OffersItem)) {
            obj18 = null;
        }
        OffersItem offersItem = (OffersItem) obj18;
        if (offersItem != null && (list = offersItem.f199796e) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj19 : list) {
                if (((OfferItem) obj19).f199847c) {
                    arrayList2.add(obj19);
                }
            }
            arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new MZ.d(((OfferItem) it.next()).f199846b));
            }
        }
        return new MZ.k(str, str2, str3, strS16, strS17, numY0, numY02, numY03, numY04, numY05, strS18, strS19, strS110, strS111, strS112, strS113, strS114, strS115, strS116, strS117, arrayList, null);
    }

    @Override // com.avito.android.mortgage.landing.mvi.domain.a
    @k
    public final InterfaceC43160i<LandingInternalAction> a(@k String str, @l String str2) {
        return C43175k.I(this.f200112e.a(), C43175k.G(new c(str, this, str2, null)));
    }

    @Override // com.avito.android.mortgage.landing.mvi.domain.a
    @k
    public final InterfaceC43160i<LandingInternalAction> b(@l MZ.k kVar) {
        return C43175k.I(this.f200112e.a(), C43175k.G(new C5919b(kVar, this, null)));
    }

    @Override // com.avito.android.mortgage.landing.mvi.domain.a
    @k
    public final InterfaceC43160i c(@k String str, @l String str2, @l String str3, @k Map map) {
        return C43175k.G(new d(str, str2, str3, map, null));
    }

    @Override // com.avito.android.mortgage.landing.mvi.domain.a
    @k
    public final InterfaceC43160i d(@l String str, @k Map map, boolean z12, @l String str2, @l String str3) {
        return C43175k.I(this.f200112e.a(), C43175k.G(new a(str, str2, str3, map, z12, null)));
    }

    @Override // com.avito.android.mortgage.landing.mvi.domain.a
    @k
    public final InterfaceC43160i<LandingInternalAction> e(@l String str, @l String str2, @l String str3, @k Map<String, ? extends LandingItem> map) {
        return b(g(str, str2, str3, map));
    }
}
