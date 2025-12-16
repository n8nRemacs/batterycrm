package com.avito.android.str_cancellation_settings.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrCancellationSettingsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsState;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<StrCancellationSettingsInternalAction, StrCancellationSettingsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f288520b;

    @Inject
    public m(@Y61.k o oVar) {
        this.f288520b = oVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final StrCancellationSettingsState a(StrCancellationSettingsInternalAction strCancellationSettingsInternalAction, StrCancellationSettingsState strCancellationSettingsState) {
        StrCancellationSettingsInternalAction strCancellationSettingsInternalAction2 = strCancellationSettingsInternalAction;
        StrCancellationSettingsState strCancellationSettingsState2 = strCancellationSettingsState;
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.Init) {
            StrCancellationSettingsInternalAction.Init init = (StrCancellationSettingsInternalAction.Init) strCancellationSettingsInternalAction2;
            return StrCancellationSettingsState.a(strCancellationSettingsState2, null, Long.valueOf(init.f288453b), init.f288454c, init.f288455d, false, null, false, null, null, false, null, init.f288456e, null, 6129);
        }
        boolean z12 = strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ApplyRequestStartLoading;
        o oVar = this.f288520b;
        if (z12) {
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, false, null, null, false, StrCancellationSettingsState.LoadingType.f288478e, null, null, 6911));
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ApplyRequestLoadingError) {
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, false, null, null, false, StrCancellationSettingsState.LoadingType.f288476c, null, null, 7167));
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ApplyRequestSuccess) {
            return StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, false, null, null, false, StrCancellationSettingsState.LoadingType.f288479f, null, null, 7167);
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ChangeDiscountEnabledValue) {
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, ((StrCancellationSettingsInternalAction.ChangeDiscountEnabledValue) strCancellationSettingsInternalAction2).f288446b, null, null, false, null, null, null, 7743));
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ChangeDiscountInputValue) {
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, false, ((StrCancellationSettingsInternalAction.ChangeDiscountInputValue) strCancellationSettingsInternalAction2).f288447b, null, false, null, null, null, 7807));
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ShowDiscountInputError) {
            String str = ((StrCancellationSettingsInternalAction.ShowDiscountInputError) strCancellationSettingsInternalAction2).f288459b;
            if (str == null) {
                str = "";
            }
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, false, null, str, false, null, null, null, 7935));
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ChangeFreeCancellationEnabledValue) {
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, ((StrCancellationSettingsInternalAction.ChangeFreeCancellationEnabledValue) strCancellationSettingsInternalAction2).f288448b, null, false, null, null, false, null, null, null, 7695));
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ChangeFreeCancellationOptionId) {
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, Integer.valueOf(((StrCancellationSettingsInternalAction.ChangeFreeCancellationOptionId) strCancellationSettingsInternalAction2).f288449b), false, null, null, false, null, null, null, 8159));
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.LoadingError) {
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, false, null, null, false, StrCancellationSettingsState.LoadingType.f288477d, null, null, 7167));
        }
        if (strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.StartLoading) {
            return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, false, null, null, false, StrCancellationSettingsState.LoadingType.f288475b, null, null, 7167));
        }
        if (!(strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ContentLoaded)) {
            return strCancellationSettingsInternalAction2 instanceof StrCancellationSettingsInternalAction.ChangeKeyboardVisibleValue ? oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, null, null, null, null, false, null, false, null, null, ((StrCancellationSettingsInternalAction.ChangeKeyboardVisibleValue) strCancellationSettingsInternalAction2).f288450b, null, null, null, 7679)) : strCancellationSettingsState2;
        }
        StrCancellationSettingsInternalAction.ContentLoaded contentLoaded = (StrCancellationSettingsInternalAction.ContentLoaded) strCancellationSettingsInternalAction2;
        Ry0.h hVar = contentLoaded.f288452b;
        Ry0.g gVar = hVar.f14781a;
        boolean z13 = gVar.f14777b;
        Integer num = z13 ? gVar.f14780e : null;
        Ry0.c cVar = hVar.f14782b;
        Boolean boolValueOf = cVar != null ? Boolean.valueOf(cVar.f14767c) : null;
        if (!z13) {
            boolValueOf = null;
        }
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        Integer num2 = cVar != null ? cVar.f14768d.f14759a : null;
        if (!zBooleanValue) {
            num2 = null;
        }
        return oVar.a(StrCancellationSettingsState.a(strCancellationSettingsState2, contentLoaded.f288452b, null, null, null, z13, num, zBooleanValue, num2 != null ? num2.toString() : null, null, false, StrCancellationSettingsState.LoadingType.f288476c, null, null, 6670));
    }
}
