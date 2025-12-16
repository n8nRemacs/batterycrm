package com.avito.android.referral_contacts.storage;

import Y61.k;
import Y61.l;
import com.avito.android.referral_contacts.domain.e;
import com.avito.android.referral_contacts.models.ReferralContactsStorageDto;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReferralContactsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/storage/a;", "", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {
    @k
    LocalDateTime a();

    void b(@k LocalDateTime localDateTime);

    @l
    Object c(@k ReferralContactsStorageDto referralContactsStorageDto, @k e.a.C7581a c7581a);

    @k
    InterfaceC43160i<ReferralContactsStorageDto> d();
}
