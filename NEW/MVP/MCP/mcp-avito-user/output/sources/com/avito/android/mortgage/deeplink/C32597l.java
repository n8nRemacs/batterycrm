package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage.api.model.ApplicationStyle;
import com.avito.android.mortgage.api.model.ApplicationsItemModel;
import com.avito.android.mortgage.api.model.ApplicationsListModel;
import com.avito.android.mortgage.applications_list.ApplicationsListArguments;
import com.avito.android.mortgage.deeplink.C32596k;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.List;
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

/* compiled from: MortgageApplicationsListDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.deeplink.MortgageApplicationsListDeeplinkHandler$doHandle$1$1", f = "MortgageApplicationsListDeeplinkHandler.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.deeplink.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32597l extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f198873q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32596k f198874r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32597l(C32596k c32596k, Continuation<? super C32597l> continuation) {
        super(2, continuation);
        this.f198874r = c32596k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32597l(this.f198874r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C32597l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objB;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f198873q;
        C32596k c32596k = this.f198874r;
        a.g gVar = c32596k.f198866i;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(c32596k.d(), true);
            this.f198873q = 1;
            objB = c32596k.f198865h.b(this);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objB = obj;
        }
        TypedResult typedResult = (TypedResult) objB;
        if (typedResult instanceof TypedResult.Success) {
            ApplicationsListModel applicationsListModel = (ApplicationsListModel) ((TypedResult.Success) typedResult).getResult();
            List<ApplicationsItemModel> listC = applicationsListModel.c();
            if (listC != null) {
                arrayList = new ArrayList();
                for (Object obj2 : listC) {
                    ApplicationStyle.a aVar = ApplicationStyle.f198205b;
                    ApplicationStyle style = ((ApplicationsItemModel) obj2).getStyle();
                    aVar.getClass();
                    if (style == ApplicationStyle.DRAFT) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = c32596k.f198869l;
            if (arrayList == null || arrayList.isEmpty()) {
                c32596k.i(C32596k.a.b.f198872b, aVar2, new MortgageLandingLink(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777215, null));
            } else if (arrayList.size() == 1) {
                c32596k.i(C32596k.a.C5864a.f198871b, aVar2, ((ApplicationsItemModel) C42745f0.E(arrayList)).getDeeplink());
            } else {
                c32596k.f198863f.R(c32596k.f198864g.h(new ApplicationsListArguments(applicationsListModel.c())), com.avito.android.deeplink_handler.view.b.f134588l);
                c32596k.j(AbstractC14250d.c.f9171c);
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            V2.f318762a.f(apiExceptionA);
            c32596k.f198867j.z1(com.avito.android.error.z.l(apiExceptionA));
            c32596k.j(AbstractC14250d.b.f9170c);
        }
        gVar.g(c32596k.d(), false);
        return G0.f406611a;
    }
}
