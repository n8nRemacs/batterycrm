package com.avito.android.advert.item.consultation;

import android.view.View;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.advert_details.realty.ContactBarButtonData;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConsultationButtonPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConsultationButtonItem f74676l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L f74677m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(ConsultationButtonItem consultationButtonItem, L l12) {
        super(1);
        this.f74676l = consultationButtonItem;
        this.f74677m = l12;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        ConsultationButtonItem consultationButtonItem = this.f74676l;
        ContactBarButtonData contactBarButtonData = consultationButtonItem.f74654g;
        DeepLink uri = contactBarButtonData != null ? contactBarButtonData.getUri() : null;
        L l12 = this.f74677m;
        if (uri != null) {
            InterfaceC28130g0 interfaceC28130g0 = l12.f74680d;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.l0(consultationButtonItem.f74654g.getUri(), null);
        } else {
            InterfaceC28130g0 interfaceC28130g02 = l12.f74680d;
            (interfaceC28130g02 != null ? interfaceC28130g02 : null).q1(consultationButtonItem.f74653f, consultationButtonItem.f74655h, "item_contact_block");
        }
        return G0.f406611a;
    }
}
