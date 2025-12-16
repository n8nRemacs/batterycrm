package com.avito.android.extended_profile.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.WidgetTab;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$handleWidgetAction$2", f = "ExtendedProfileActor.kt", i = {}, l = {404}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30457g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150303q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f150304r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ oB.k f150305s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C30451a f150306t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30457g(C30451a c30451a, Continuation continuation, oB.k kVar) {
        super(2, continuation);
        this.f150305s = kVar;
        this.f150306t = c30451a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30457g c30457g = new C30457g(this.f150306t, continuation, this.f150305s);
        c30457g.f150304r = obj;
        return c30457g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30457g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150303q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f150304r;
            oB.C c12 = (oB.C) this.f150305s;
            WidgetTab widgetTab = (WidgetTab) C42745f0.K(c12.f419498c, c12.f419497b.f154936e);
            if (widgetTab != null && (str = widgetTab.f154940c) != null) {
                C30451a c30451a = this.f150306t;
                InterfaceC28373a interfaceC28373a = c30451a.f150087u;
                String strA = c30451a.f150086t.a();
                if (strA == null) {
                    strA = "";
                }
                interfaceC28373a.c(new eA.q(strA, c30451a.f150067a, str));
            }
            ExtendedProfileInternalAction.OnTabsWithWidgetsClicked onTabsWithWidgetsClicked = new ExtendedProfileInternalAction.OnTabsWithWidgetsClicked(c12.f419497b, c12.f419498c);
            this.f150303q = 1;
            if (interfaceC43172j.emit(onTabsWithWidgetsClicked, this) == coroutine_suspended) {
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
