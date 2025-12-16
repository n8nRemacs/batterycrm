package com.avito.android.extended_profile_selection_create.name.mvi;

import KA.c;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import com.avito.android.extended_profile_selection_create.name.mvi.entity.ExtendedProfileSetSelectionNameInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSetSelectionNameReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "LKA/c;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements u<ExtendedProfileSetSelectionNameInternalAction, KA.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<HA.g> f151927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSetSelectionNameConfig f151928c;

    @Inject
    public l(@Y61.k Z1<HA.g> z12, @Y61.k ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig) {
        this.f151927b = z12;
        this.f151928c = extendedProfileSetSelectionNameConfig;
    }

    @Override // com.avito.android.arch.mvi.u
    public final KA.c a(ExtendedProfileSetSelectionNameInternalAction extendedProfileSetSelectionNameInternalAction, KA.c cVar) {
        ExtendedProfileSetSelectionNameInternalAction extendedProfileSetSelectionNameInternalAction2 = extendedProfileSetSelectionNameInternalAction;
        KA.c cVar2 = cVar;
        boolean z12 = extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.InitState;
        Z1<HA.g> z13 = this.f151927b;
        if (z12) {
            HA.g value = z13.getValue();
            String str = value.f6973a;
            return KA.c.a(cVar2, str, value.f6975c, false, b(str, false), value.f6974b, value.f6976d, 4);
        }
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.IsPublicChange) {
            return KA.c.a(cVar2, null, ((ExtendedProfileSetSelectionNameInternalAction.IsPublicChange) extendedProfileSetSelectionNameInternalAction2).f151906b, false, null, null, null, 61);
        }
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.TypingText) {
            String str2 = ((ExtendedProfileSetSelectionNameInternalAction.TypingText) extendedProfileSetSelectionNameInternalAction2).f151913b;
            return KA.c.a(cVar2, str2, false, false, b(str2, false), null, null, 54);
        }
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameLoading) {
            return KA.c.a(cVar2, null, false, true, null, null, null, 59);
        }
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameError) {
            return KA.c.a(cVar2, null, false, false, null, null, null, 59);
        }
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.SetSelectionIncorrectValuesError) {
            return KA.c.a(cVar2, null, false, false, null, null, null, 59);
        }
        if (!(extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameSuccess)) {
            if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.EmptyNameError) {
                return KA.c.a(cVar2, null, false, false, b(cVar2.f9345b, true), null, null, 55);
            }
            throw new NoWhenBranchMatchedException();
        }
        HA.g value2 = z13.getValue();
        ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameSuccess setSelectionNameSuccess = (ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameSuccess) extendedProfileSetSelectionNameInternalAction2;
        boolean z14 = setSelectionNameSuccess.f151912c;
        z13.setValue(HA.g.a(value2, null, setSelectionNameSuccess.f151911b, false, Boolean.valueOf(z14), null, 53));
        return KA.c.a(cVar2, null, false, false, null, setSelectionNameSuccess.f151911b, Boolean.valueOf(z14), 11);
    }

    public final c.b b(String str, boolean z12) {
        c.b bVar;
        ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig = this.f151928c;
        if (z12) {
            return new c.b(com.avito.android.printable_text.b.c(R.string.extended_profile_set_selection_name_highlight_hint, 0, Integer.valueOf(extendedProfileSetSelectionNameConfig.f151809h)), true);
        }
        if (str.length() > 0) {
            bVar = new c.b(com.avito.android.printable_text.b.c(R.string.extended_profile_set_selection_name_highlight_hint, Integer.valueOf(str.length()), Integer.valueOf(extendedProfileSetSelectionNameConfig.f151809h)), str.length() > extendedProfileSetSelectionNameConfig.f151809h);
        } else {
            bVar = new c.b(com.avito.android.printable_text.b.c(R.string.extended_profile_set_selection_name_base_hint, Integer.valueOf(extendedProfileSetSelectionNameConfig.f151809h)), str.length() > extendedProfileSetSelectionNameConfig.f151809h);
        }
        return bVar;
    }
}
