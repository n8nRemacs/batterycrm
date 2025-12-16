package com.avito.android.beduin.ui.universal.beduin;

import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinExpandPageActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/ui/universal/beduin/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/beduin/ui/universal/beduin/BeduinExpandPageAction;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.beduin_shared.model.action.custom.c<BeduinExpandPageAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Boolean> f104454a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f104455b;

    @Inject
    public a() {
        com.jakewharton.rxrelay3.c<Boolean> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f104454a = cVar;
        this.f104455b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        Boolean expanded = ((BeduinExpandPageAction) beduinAction).getExpanded();
        this.f104454a.accept(Boolean.valueOf(expanded != null ? expanded.booleanValue() : true));
    }
}
