package com.avito.android.beduin_shared.model.action.custom;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import kotlin.Metadata;

/* compiled from: AbstractScreenActionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/b;", "Lcom/avito/android/beduin_models/BeduinAction;", "Action", "LUi/b;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class b<Action extends BeduinAction> implements InterfaceC15523b<Action> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Action> f105287a = new com.jakewharton.rxrelay3.c<>();

    @Override // Ui.InterfaceC15523b
    public final void o(@k Action action) {
        this.f105287a.accept(action);
    }
}
