package com.avito.android.extended_profile.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTabType;
import com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oB.z;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$handleWidgetAction$13", f = "ExtendedProfileActor.kt", i = {0, 0}, l = {605, 608}, m = "invokeSuspend", n = {"$this$flow", NotificationOpenAtTab.TAB}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.extended_profile.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30456f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ExtendedProfileSearchTabType f150296q;

    /* renamed from: r, reason: collision with root package name */
    public int f150297r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f150298s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ oB.k f150299t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C30451a f150300u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150301v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30456f(oB.k kVar, C30451a c30451a, com.avito.android.extended_profile.mvi.entity.a aVar, Continuation<? super C30456f> continuation) {
        super(2, continuation);
        this.f150299t = kVar;
        this.f150300u = c30451a;
        this.f150301v = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30456f c30456f = new C30456f(this.f150299t, this.f150300u, this.f150301v, continuation);
        c30456f.f150298s = obj;
        return c30456f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30456f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        ExtendedProfileSearchTabType extendedProfileSearchTabType;
        com.avito.android.extended_profile.mvi.entity.a aVar;
        a.b bVar;
        List<SearchAdvertItem> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150297r;
        C30451a c30451a = this.f150300u;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f150298s;
            z.g gVar = (z.g) this.f150299t;
            extendedProfileSearchTabType = gVar.f419550b.f154618d;
            InterfaceC28373a interfaceC28373a = c30451a.f150087u;
            String strA = c30451a.f150086t.a();
            if (strA == null) {
                strA = "";
            }
            interfaceC28373a.c(new eA.p(strA, c30451a.f150067a, extendedProfileSearchTabType));
            ExtendedProfileInternalAction.OnSearchTabSelected onSearchTabSelected = new ExtendedProfileInternalAction.OnSearchTabSelected(gVar.f419550b.f154618d);
            this.f150298s = interfaceC43172j;
            this.f150296q = extendedProfileSearchTabType;
            this.f150297r = 1;
            if (interfaceC43172j.emit(onSearchTabSelected, this) == coroutine_suspended) {
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
            extendedProfileSearchTabType = this.f150296q;
            interfaceC43172j = (InterfaceC43172j) this.f150298s;
            C42729a0.b(obj);
        }
        if (extendedProfileSearchTabType == ExtendedProfileSearchTabType.f154621d && (bVar = (aVar = this.f150301v).f150248j) != null && (list = bVar.f150271a) != null && list.isEmpty()) {
            InterfaceC43160i<ExtendedProfileInternalAction> interfaceC43160iA = c30451a.f150073g.a(aVar.f150248j);
            this.f150298s = null;
            this.f150296q = null;
            this.f150297r = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
