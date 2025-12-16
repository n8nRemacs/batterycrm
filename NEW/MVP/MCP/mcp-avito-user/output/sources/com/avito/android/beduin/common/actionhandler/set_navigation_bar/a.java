package com.avito.android.beduin.common.actionhandler.set_navigation_bar;

import Y61.k;
import com.avito.android.beduin.common.action.BeduinSetNavigationBarAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.custom.c;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinSetNavigationBarActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/set_navigation_bar/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/beduin/common/action/BeduinSetNavigationBarAction;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements c<BeduinSetNavigationBarAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<BeduinSetNavigationBarAction> f100382a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f100383b;

    @Inject
    public a() {
        com.jakewharton.rxrelay3.c<BeduinSetNavigationBarAction> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100382a = cVar;
        this.f100383b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f100382a.accept((BeduinSetNavigationBarAction) beduinAction);
    }
}
