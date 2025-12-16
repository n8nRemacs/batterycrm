package com.avito.android.edit_basic_info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.edit_basic_info.mvi.entity.EditBasicInfoInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EditBasicInfoBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.b<EditBasicInfoInternalAction> {
    @Inject
    public e() {
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<EditBasicInfoInternalAction> a() {
        return new C43210w(EditBasicInfoInternalAction.InitState.f146145b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
