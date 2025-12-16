package com.avito.android.messenger_icebreakers_dialog.mvi;

import Y61.k;
import Y61.l;
import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerBottomSheetData;
import com.avito.android.messenger_icebreakers_dialog.mvi.entity.MessengerIcebreakerInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MessengerIcebreakerBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/messenger_icebreakers_dialog/mvi/entity/MessengerIcebreakerInternalAction;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.b<MessengerIcebreakerInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final MessengerIcebreakerBottomSheetData f197665a;

    @Inject
    public a(@k MessengerIcebreakerBottomSheetData messengerIcebreakerBottomSheetData) {
        this.f197665a = messengerIcebreakerBottomSheetData;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<MessengerIcebreakerInternalAction> a() {
        return new C43210w(new MessengerIcebreakerInternalAction.IcebreakersSetting(this.f197665a.f197528i));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
