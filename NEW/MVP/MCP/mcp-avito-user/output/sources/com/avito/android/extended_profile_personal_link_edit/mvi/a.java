package com.avito.android.extended_profile_personal_link_edit.mvi;

import DA.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditInternalAction;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PersonalLinkEditActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LDA/a;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditState;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<DA.a, PersonalLinkEditInternalAction, PersonalLinkEditState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_personal_link_edit.i f151510a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PersonalLinkEditConfig f151511b;

    @Inject
    public a(@Y61.k com.avito.android.extended_profile_personal_link_edit.i iVar, @Y61.k PersonalLinkEditConfig personalLinkEditConfig) {
        this.f151510a = iVar;
        this.f151511b = personalLinkEditConfig;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PersonalLinkEditInternalAction> b(DA.a aVar, PersonalLinkEditState personalLinkEditState) {
        DA.a aVar2 = aVar;
        PersonalLinkEditState personalLinkEditState2 = personalLinkEditState;
        if (aVar2 instanceof a.b) {
            PersonalLinkEditConfig personalLinkEditConfig = this.f151511b;
            String str = personalLinkEditConfig.f151436e;
            return this.f151510a.a(personalLinkEditState2.f151535c, personalLinkEditConfig.f151443l, str == null || C43066x.K(str));
        }
        if (aVar2 instanceof a.C0155a) {
            return new C43210w(new PersonalLinkEditInternalAction.CloseScreen(false));
        }
        if (aVar2 instanceof a.c) {
            return new C43210w(new PersonalLinkEditInternalAction.OnTyped(((a.c) aVar2).f3076a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
