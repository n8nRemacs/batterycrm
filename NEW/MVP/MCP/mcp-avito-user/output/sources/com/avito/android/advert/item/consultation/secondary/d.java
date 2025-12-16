package com.avito.android.advert.item.consultation.secondary;

import Y41.p;
import android.os.Bundle;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.advert_details.realty.ConsultationButton;
import com.avito.android.remote.model.advert_details.realty.NonNdForm;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SecondaryConsultationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "name", "phone", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements p<String, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SecondaryConsultationItem f74804l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f74805m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SecondaryConsultationItem secondaryConsultationItem, e eVar) {
        super(2);
        this.f74804l = secondaryConsultationItem;
        this.f74805m = eVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, String str2) {
        ConsultationButton button;
        DeepLink uri;
        InterfaceC28130g0 interfaceC28130g0;
        String str3 = str;
        String str4 = str2;
        SecondaryConsultationItem secondaryConsultationItem = this.f74804l;
        NonNdForm nonNdForm = secondaryConsultationItem.f74799e;
        if (nonNdForm != null && (button = nonNdForm.getButton()) != null && (uri = button.getUri()) != null && (interfaceC28130g0 = this.f74805m.f74809e) != null) {
            Bundle bundle = new Bundle();
            NonNdForm nonNdForm2 = secondaryConsultationItem.f74799e;
            String title = nonNdForm2.getTitle();
            String description = nonNdForm2.getDescription();
            bundle.putString("consultation_start_link_argument_name", str3);
            bundle.putString("consultation_start_link_argument_phone", str4);
            bundle.putString("consultation_start_link_argument_form_title", title);
            bundle.putString("consultation_start_link_argument_form_subtitle", description);
            bundle.putBoolean("consultation_start_link_track_submit_event", true);
            G0 g02 = G0.f406611a;
            interfaceC28130g0.l0(uri, bundle);
        }
        return G0.f406611a;
    }
}
