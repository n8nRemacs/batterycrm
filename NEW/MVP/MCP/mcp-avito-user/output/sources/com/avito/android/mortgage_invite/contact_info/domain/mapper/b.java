package com.avito.android.mortgage_invite.contact_info.domain.mapper;

import Y61.k;
import a20.C19669a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFormItemType;
import i20.C41213a;
import i20.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: LoadContactInfoResponseMapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/domain/mapper/b;", "Lcom/avito/android/mortgage_invite/contact_info/domain/mapper/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static Y10.b b(ContactInfoFieldId contactInfoFieldId, ContactInfoFormItemType contactInfoFormItemType, e eVar) {
        Boolean isMasked = eVar.getIsMasked();
        boolean zBooleanValue = isMasked != null ? isMasked.booleanValue() : false;
        String title = eVar.getTitle();
        String placeholder = eVar.getPlaceholder();
        boolean zContains = d.f205652a.contains(contactInfoFieldId);
        boolean zContains2 = d.f205653b.contains(contactInfoFieldId);
        boolean z12 = !d.f205654c.contains(contactInfoFieldId);
        String value = eVar.getValue();
        if (value == null) {
            value = "";
        }
        if (contactInfoFormItemType == ContactInfoFormItemType.f205538d && value.length() != 0) {
            value = C43066x.U("7", new C43059p("\\s").f(value, ""));
        }
        return new Y10.b(contactInfoFieldId, contactInfoFormItemType, zBooleanValue, title, placeholder, zContains, zContains2, z12, value, null, false, 1024, null);
    }

    @Override // com.avito.android.mortgage_invite.contact_info.domain.mapper.a
    @k
    public final C19669a a(@k i20.b bVar) {
        String screenTitle = bVar.getScreenTitle();
        String title = bVar.getTitle();
        String subtitle = bVar.getSubtitle();
        String action = bVar.getAction();
        i20.c clientBlock = bVar.getContent().getClientBlock();
        String title2 = clientBlock.getTitle();
        Y10.b bVarB = b(ContactInfoFieldId.f205525c, ContactInfoFormItemType.f205536b, clientBlock.getClientSearch());
        ContactInfoFieldId contactInfoFieldId = ContactInfoFieldId.f205526d;
        ContactInfoFormItemType contactInfoFormItemType = ContactInfoFormItemType.f205538d;
        Y10.b bVarB2 = b(contactInfoFieldId, contactInfoFormItemType, clientBlock.getPhone());
        ContactInfoFieldId contactInfoFieldId2 = ContactInfoFieldId.f205527e;
        ContactInfoFormItemType contactInfoFormItemType2 = ContactInfoFormItemType.f205537c;
        Y10.a aVar = new Y10.a(title2, C42745f0.U(bVarB, bVarB2, b(contactInfoFieldId2, contactInfoFormItemType2, clientBlock.getFirstName()), b(ContactInfoFieldId.f205529g, contactInfoFormItemType2, clientBlock.getLastName()), b(ContactInfoFieldId.f205528f, contactInfoFormItemType2, clientBlock.getMiddleName()), b(ContactInfoFieldId.f205530h, contactInfoFormItemType, clientBlock.getPhone())), false);
        C41213a agentBlock = bVar.getContent().getAgentBlock();
        return new C19669a(screenTitle, title, subtitle, action, false, aVar, new Y10.a(agentBlock.getTitle(), C42745f0.U(b(ContactInfoFieldId.f205532j, contactInfoFormItemType2, agentBlock.getFullName()), b(ContactInfoFieldId.f205533k, contactInfoFormItemType, agentBlock.getPhone())), false));
    }
}
