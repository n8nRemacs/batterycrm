package com.avito.android.beduin.common.actionhandler.apply_haptic;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinApplyHapticAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: BeduinApplyHapticActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/apply_haptic/a;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC15523b<BeduinApplyHapticAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e2 f100163a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f100164b;

    @Inject
    public a() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410779d, 1);
        this.f100163a = e2VarB;
        this.f100164b = e2VarB;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100163a.K5(((BeduinApplyHapticAction) beduinAction).getAndroidType());
    }
}
