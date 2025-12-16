package com.avito.android.mortgage_invite.contact_info;

import b20.InterfaceC25394a;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationContactInfoFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/model/ContactInfoFieldId;", "field", "", "hasFocus", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage_invite/common/domain/model/ContactInfoFieldId;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k extends N implements Y41.p<ContactInfoFieldId, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApplicationContactInfoFragment f205665l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ApplicationContactInfoFragment applicationContactInfoFragment) {
        super(2);
        this.f205665l = applicationContactInfoFragment;
    }

    @Override // Y41.p
    public final G0 invoke(ContactInfoFieldId contactInfoFieldId, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ApplicationContactInfoFragment.a aVar = ApplicationContactInfoFragment.f205577u0;
        this.f205665l.q5().accept(new InterfaceC25394a.C1986a(contactInfoFieldId, zBooleanValue));
        return G0.f406611a;
    }
}
