package com.avito.android.user_adverts_filters.main.action;

import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import pJ0.InterfaceC46968a;

/* compiled from: UserAdvertsFiltersOpenLocalLinkActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/action/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/user_adverts_filters/main/action/BeduinUserAdvertsFiltersOpenInnerScreenAction;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.beduin_shared.model.action.custom.c<BeduinUserAdvertsFiltersOpenInnerScreenAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<InterfaceC46968a> f315993a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f315994b;

    @Inject
    public a() {
        com.jakewharton.rxrelay3.c<InterfaceC46968a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f315993a = cVar;
        this.f315994b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f315993a.accept(new InterfaceC46968a.b(new UserAdvertsFiltersBeduinScreen(((BeduinUserAdvertsFiltersOpenInnerScreenAction) beduinAction).getScreenName())));
    }
}
