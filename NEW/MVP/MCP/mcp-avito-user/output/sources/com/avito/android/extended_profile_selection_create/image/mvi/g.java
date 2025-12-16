package com.avito.android.extended_profile_selection_create.image.mvi;

import com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSetSelectionImageBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements com.avito.android.arch.mvi.b<ExtendedProfileSetSelectionImageInternalAction> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSetSelectionImageInternalAction> a() {
        return new C43210w(ExtendedProfileSetSelectionImageInternalAction.InitState.f151771b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
