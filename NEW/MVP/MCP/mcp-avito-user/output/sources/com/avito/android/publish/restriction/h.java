package com.avito.android.publish.restriction;

import Hd0.C13980a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.analytics.events.restriction.PublishRestrictionStepFromPage;
import com.avito.android.publish.restriction.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.RestrictionConfig;
import com.avito.android.remote.model.restriction.RestrictionCustomResponse;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import l41.o;

/* compiled from: RestrictionInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/restriction/RestrictionCustomResponse;", "it", "Lcom/avito/android/publish/restriction/l;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/publish/restriction/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f239090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RestrictionConfig.Request.Params f239091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f239092d;

    public h(g gVar, RestrictionConfig.Request.Params params, String str) {
        this.f239090b = gVar;
        this.f239091c = params;
        this.f239092d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Object bVar;
        TypedResult typedResult = (TypedResult) obj;
        g gVar = this.f239090b;
        gVar.getClass();
        RestrictionConfig.Request.Params params = this.f239091c;
        RestrictionConfig.Flow flow = params.getFlow();
        String type = flow != null ? flow.getType() : null;
        PublishRestrictionStepFromPage publishRestrictionStepFromPage = L.f(type, "add") ? PublishRestrictionStepFromPage.f232233b : L.f(type, "edit") ? PublishRestrictionStepFromPage.f232234c : null;
        boolean z12 = typedResult instanceof TypedResult.Success;
        String str = this.f239092d;
        InterfaceC28373a interfaceC28373a = gVar.f239085d;
        if (z12) {
            RestrictionCustomResponse restrictionCustomResponse = (RestrictionCustomResponse) ((TypedResult.Success) typedResult).getResult();
            if (restrictionCustomResponse.getIsAllowed()) {
                return l.a.f239104a;
            }
            if (restrictionCustomResponse.getContent() != null) {
                interfaceC28373a.c(new Hd0.b(str != null ? C43066x.y0(str) : null, params.getType(), publishRestrictionStepFromPage));
            }
            bVar = new l.c(restrictionCustomResponse);
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            Integer numY0 = str != null ? C43066x.y0(str) : null;
            String message = apiExceptionA.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC28373a.c(new C13980a(numY0, message, params.getType(), publishRestrictionStepFromPage));
            bVar = new l.b(apiExceptionA);
        }
        return bVar;
    }
}
