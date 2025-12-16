package com.avito.android.auto_select.contact_me.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeBottomSheetOpenArguments;
import com.avito.android.auto_select.contact_me.mvi.entity.AutoSelectContactMeInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoSelectContactMeBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.arch.mvi.b<AutoSelectContactMeInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AutoSelectContactMeBottomSheetOpenArguments f96003a;

    @Inject
    public d(@Y61.k AutoSelectContactMeBottomSheetOpenArguments autoSelectContactMeBottomSheetOpenArguments) {
        this.f96003a = autoSelectContactMeBottomSheetOpenArguments;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AutoSelectContactMeInternalAction> a() {
        return new C43210w(new AutoSelectContactMeInternalAction.Init(this.f96003a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
