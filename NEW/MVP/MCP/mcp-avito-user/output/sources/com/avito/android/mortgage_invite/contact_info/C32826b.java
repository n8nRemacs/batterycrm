package com.avito.android.mortgage_invite.contact_info;

import b20.InterfaceC25394a;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationContactInfoFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/model/ContactInfoFieldId;", "id", "", "value", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage_invite/common/domain/model/ContactInfoFieldId;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.contact_info.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32826b extends N implements Y41.p<ContactInfoFieldId, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApplicationContactInfoFragment f205608l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32826b(ApplicationContactInfoFragment applicationContactInfoFragment) {
        super(2);
        this.f205608l = applicationContactInfoFragment;
    }

    @Override // Y41.p
    public final G0 invoke(ContactInfoFieldId contactInfoFieldId, String str) {
        ApplicationContactInfoFragment.a aVar = ApplicationContactInfoFragment.f205577u0;
        this.f205608l.q5().accept(new InterfaceC25394a.b(contactInfoFieldId, str));
        return G0.f406611a;
    }
}
