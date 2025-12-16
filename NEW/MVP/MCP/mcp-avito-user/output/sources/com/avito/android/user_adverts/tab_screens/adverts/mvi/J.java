package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import fJ0.InterfaceC40301a;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import qI0.c;

/* compiled from: UserAdvertsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$searchAnalytics$1", f = "UserAdvertsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class J extends SuspendLambda implements Y41.p<UserAdvertsListInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f315218q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35670a f315219r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40301a.b.f f315220s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C35670a c35670a, InterfaceC40301a.b.f fVar, Continuation<? super J> continuation) {
        super(2, continuation);
        this.f315219r = c35670a;
        this.f315220s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        J j12 = new J(this.f315219r, this.f315220s, continuation);
        j12.f315218q = obj;
        return j12;
    }

    @Override // Y41.p
    public final Object invoke(UserAdvertsListInternalAction userAdvertsListInternalAction, Continuation<? super G0> continuation) {
        return ((J) create(userAdvertsListInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        UserAdvertsListInternalAction userAdvertsListInternalAction = (UserAdvertsListInternalAction) this.f315218q;
        if (userAdvertsListInternalAction instanceof UserAdvertsListInternalAction.LoadingResult) {
            UserAdvertsListInternalAction.LoadingResult loadingResult = (UserAdvertsListInternalAction.LoadingResult) userAdvertsListInternalAction;
            if (loadingResult.f315354e) {
                InterfaceC28373a interfaceC28373a = this.f315219r.f315277f;
                InterfaceC40301a.b.f fVar = this.f315220s;
                String str = fVar.f395819a;
                Integer num = loadingResult.f315351b.f395106c;
                String str2 = loadingResult.f315353d;
                UserAdvertsSearchStartFromType userAdvertsSearchStartFromType = fVar.f395820b;
                boolean z12 = fVar.f395821c;
                Map<String, Object> map = fVar.f395822d;
                int i12 = userAdvertsSearchStartFromType == null ? -1 : c.a.f429157a[userAdvertsSearchStartFromType.ordinal()];
                String str3 = "search_bar";
                if (i12 != 1 && i12 == 2) {
                    str3 = "filters";
                }
                interfaceC28373a.c(new qI0.c(str, num, str2, str3, z12, map));
            }
        }
        return G0.f406611a;
    }
}
