package com.avito.android.installmentsblock.factory;

import Y61.k;
import aO.InterfaceC19795a;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.installmentsblock.e;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InstallmentsBlockFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installmentsblock/factory/a;", "LaO/a;", "<init>", "()V", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements InterfaceC19795a {
    @Inject
    public a() {
    }

    @Override // aO.InterfaceC19795a
    @k
    public final e a(@k ViewGroup viewGroup) {
        return new e(viewGroup, null, null);
    }
}
