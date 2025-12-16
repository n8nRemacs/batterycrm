package com.avito.android.saved_searches.presentation.main.mvi;

import Eo0.InterfaceC13515a;
import com.avito.android.account.E;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainInternalAction;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainState;
import com.facebook.imageutils.JfifUtil;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SavedSearchMainActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LEo0/a;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainState;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC13515a, SavedSearchMainInternalAction, SavedSearchMainState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f258681a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.saved_searches.presentation.core.a f258682b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I30.d f258683c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TV.c f258684d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.libs.saved_searches.domain.a f258685e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.saved_searches_core.b f258686f;

    /* compiled from: SavedSearchMainActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.saved_searches.presentation.main.mvi.SavedSearchMainActor$wrapWithAuthorization$1", f = "SavedSearchMainActor.kt", i = {}, l = {213, JfifUtil.MARKER_SOI}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SavedSearchMainInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f258687q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f258688r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<SavedSearchMainInternalAction> f258690t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends SavedSearchMainInternalAction> interfaceC43160i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f258690t = interfaceC43160i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f258690t, continuation);
            aVar.f258688r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SavedSearchMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f258687q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f258688r;
                g gVar = g.this;
                if (gVar.f258681a.b()) {
                    this.f258687q = 1;
                    if (C43175k.u(this, this.f258690t, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    gVar.f258684d.d(new TV.b(null, 1, null));
                    SavedSearchMainInternalAction.RouteBack routeBack = SavedSearchMainInternalAction.RouteBack.f258643b;
                    this.f258687q = 2;
                    if (interfaceC43172j.emit(routeBack, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k E e12, @Y61.k com.avito.android.saved_searches.presentation.core.a aVar, @Y61.k I30.d dVar, @Y61.k TV.c cVar, @Y61.k com.avito.android.libs.saved_searches.domain.a aVar2, @Y61.k com.avito.android.saved_searches_core.b bVar) {
        this.f258681a = e12;
        this.f258682b = aVar;
        this.f258683c = dVar;
        this.f258684d = cVar;
        this.f258685e = aVar2;
        this.f258686f = bVar;
    }

    public static void c(LinkedHashMap linkedHashMap, String str, List list) {
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            linkedHashMap.put(str + '[' + i12 + ']', (String) obj);
            i12 = i13;
        }
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SavedSearchMainInternalAction> b(InterfaceC13515a interfaceC13515a, SavedSearchMainState savedSearchMainState) {
        SavedSearchData.Settings settings;
        SavedSearchData.Settings.Push push;
        SavedSearchData.Settings.SettingsDetails settingsDetails;
        SavedSearchData.Settings settings2;
        SavedSearchData.Settings.Email email;
        SavedSearchData.Settings.SettingsDetails settingsDetails2;
        InterfaceC13515a interfaceC13515a2 = interfaceC13515a;
        SavedSearchMainState savedSearchMainState2 = savedSearchMainState;
        boolean z12 = interfaceC13515a2 instanceof InterfaceC13515a.C0255a;
        SavedSearchData savedSearchData = savedSearchMainState2.f258662b;
        if (z12) {
            return (savedSearchData == null || (settings2 = savedSearchData.getSettings()) == null || (email = settings2.getEmail()) == null || (settingsDetails2 = email.getSettingsDetails()) == null) ? C43175k.w() : d(new C43210w(new SavedSearchMainInternalAction.ShowEmailSettings(settingsDetails2)));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.b) {
            return new C43210w(new SavedSearchMainInternalAction.EmailSettingsResult(((InterfaceC13515a.b) interfaceC13515a2).f4242a));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.c) {
            return d(new C43210w(new SavedSearchMainInternalAction.UpdateEmailToggleValue(((InterfaceC13515a.c) interfaceC13515a2).f4243a)));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.d) {
            return C43175k.G(new e(this, null));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.e) {
            DeepLink deepLink = ((InterfaceC13515a.e) interfaceC13515a2).f4245a;
            return new C43210w(deepLink != null ? new SavedSearchMainInternalAction.HandleDeeplink(deepLink) : SavedSearchMainInternalAction.ShowEmailChooser.f258644b);
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.f) {
            return d(C43175k.G(new com.avito.android.saved_searches.presentation.main.mvi.a(this, savedSearchMainState2, null)));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.g) {
            return d(C43175k.w());
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.h) {
            return new C43210w(new SavedSearchMainInternalAction.UpdateCurrentNameValue(((InterfaceC13515a.h) interfaceC13515a2).f4248a));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.i) {
            return (savedSearchData == null || (settings = savedSearchData.getSettings()) == null || (push = settings.getPush()) == null || (settingsDetails = push.getSettingsDetails()) == null) ? C43175k.w() : d(new C43210w(new SavedSearchMainInternalAction.ShowPushSettings(settingsDetails)));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.j) {
            return new C43210w(new SavedSearchMainInternalAction.PushSettingsResult(((InterfaceC13515a.j) interfaceC13515a2).f4250a));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.k) {
            return d(new C43210w(new SavedSearchMainInternalAction.UpdatePushToggleValue(((InterfaceC13515a.k) interfaceC13515a2).f4251a)));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.l) {
            return C43175k.G(new f(this, null));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.m) {
            DeepLink deepLink2 = ((InterfaceC13515a.m) interfaceC13515a2).f4253a;
            return new C43210w(deepLink2 != null ? new SavedSearchMainInternalAction.HandleDeeplink(deepLink2) : SavedSearchMainInternalAction.ShowNotificationSettingsScreen.f258647b);
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.n) {
            return C43175k.G(new d(this, savedSearchMainState2, null));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.o) {
            return d(C43175k.G(new b(this, savedSearchMainState2, null)));
        }
        if (interfaceC13515a2 instanceof InterfaceC13515a.p) {
            return C43175k.G(new c(true, this, savedSearchMainState2, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC43160i<SavedSearchMainInternalAction> d(InterfaceC43160i<? extends SavedSearchMainInternalAction> interfaceC43160i) {
        return C43175k.G(new a(interfaceC43160i, null));
    }
}
