package com.avito.android.mortgage_invite.client_form.domain.mapper;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFormItemType;
import com.avito.android.remote.model.text.AttributedText;
import h20.C40763a;
import h20.g;
import h20.h;
import h20.i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: LoadClientFormResponseMapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/mapper/e;", "Lcom/avito/android/mortgage_invite/client_form/domain/mapper/d;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    public static Y10.b b(ContactInfoFieldId contactInfoFieldId, ContactInfoFormItemType contactInfoFormItemType, h20.f fVar) {
        if (fVar == null) {
            return null;
        }
        String title = fVar.getTitle();
        Boolean isMasked = fVar.getIsMasked();
        boolean zBooleanValue = isMasked != null ? isMasked.booleanValue() : false;
        String placeholder = fVar.getPlaceholder();
        boolean isRequired = fVar.getIsRequired();
        String value = fVar.getValue();
        if (value == null) {
            value = "";
        }
        return new Y10.b(contactInfoFieldId, contactInfoFormItemType, zBooleanValue, title, placeholder, isRequired, true, true, value, null, false, 1024, null);
    }

    public static T10.b c(h20.f fVar) {
        boolean isRequired = fVar.getIsRequired();
        String placeholder = fVar.getPlaceholder();
        String title = fVar.getTitle();
        Boolean isMasked = fVar.getIsMasked();
        return new T10.b(placeholder, title, isRequired, fVar.getValue(), isMasked != null ? isMasked.booleanValue() : false);
    }

    @Override // com.avito.android.mortgage_invite.client_form.domain.mapper.d
    @k
    public final T10.c a(@k C40763a c40763a) {
        i searchStage = c40763a.getSearchStage();
        String screenTitle = searchStage.getScreenTitle();
        String screenSubtitle = searchStage.getScreenSubtitle();
        AttributedText title = searchStage.getTitle();
        String acceptButton = searchStage.getAcceptButton();
        h20.b actionBanner = searchStage.getActionBanner();
        T10.e eVar = new T10.e(screenTitle, screenSubtitle, title, acceptButton, actionBanner != null ? new T10.a(actionBanner.getTitle(), actionBanner.getDescription(), actionBanner.getAction().getTitle(), actionBanner.getAction().getUri()) : null, c(searchStage.getClientSearch()), searchStage.getClientSearchErrorText());
        h newClientStage = c40763a.getNewClientStage();
        String screenTitle2 = newClientStage.getScreenTitle();
        AttributedText title2 = newClientStage.getTitle();
        String acceptButton2 = newClientStage.getAcceptButton();
        h20.e clientBlock = newClientStage.getClientBlock();
        String title3 = clientBlock.getTitle();
        ContactInfoFieldId contactInfoFieldId = ContactInfoFieldId.f205527e;
        ContactInfoFormItemType contactInfoFormItemType = ContactInfoFormItemType.f205537c;
        Y10.b bVarB = b(contactInfoFieldId, contactInfoFormItemType, clientBlock.getFirstName());
        Y10.b bVarB2 = b(ContactInfoFieldId.f205528f, contactInfoFormItemType, clientBlock.getMiddleName());
        Y10.b bVarB3 = b(ContactInfoFieldId.f205529g, contactInfoFormItemType, clientBlock.getLastName());
        ContactInfoFieldId contactInfoFieldId2 = ContactInfoFieldId.f205530h;
        ContactInfoFormItemType contactInfoFormItemType2 = ContactInfoFormItemType.f205538d;
        Y10.a aVar = new Y10.a(title3, C42756l.B(new Y10.b[]{bVarB, bVarB2, bVarB3, b(contactInfoFieldId2, contactInfoFormItemType2, clientBlock.getPhone()), b(ContactInfoFieldId.f205531i, contactInfoFormItemType, clientBlock.getEmail())}), false);
        h20.d agentBlock = newClientStage.getAgentBlock();
        T10.d dVar = new T10.d(screenTitle2, title2, acceptButton2, aVar, new Y10.a(agentBlock.getTitle(), C42756l.B(new Y10.b[]{b(ContactInfoFieldId.f205532j, contactInfoFormItemType, agentBlock.getFullName()), b(ContactInfoFieldId.f205533k, contactInfoFormItemType2, agentBlock.getPhone())}), false));
        g clientSelected = c40763a.getClientSelected();
        String screenTitle3 = clientSelected.getScreenTitle();
        String screenSubtitle2 = clientSelected.getScreenSubtitle();
        AttributedText title4 = clientSelected.getTitle();
        String acceptButton3 = clientSelected.getAcceptButton();
        h20.b actionBanner2 = clientSelected.getActionBanner();
        return new T10.c(eVar, dVar, new T10.f(screenTitle3, screenSubtitle2, title4, acceptButton3, actionBanner2 != null ? new T10.a(actionBanner2.getTitle(), actionBanner2.getDescription(), actionBanner2.getAction().getTitle(), actionBanner2.getAction().getUri()) : null, c(clientSelected.getFullName()), c(clientSelected.getPhone()), c(clientSelected.getEmail()), null, 256, null));
    }
}
