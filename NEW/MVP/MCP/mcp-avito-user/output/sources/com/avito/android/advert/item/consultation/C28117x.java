package com.avito.android.advert.item.consultation;

import android.os.Bundle;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker;
import com.avito.android.remote.model.advert_details.realty.ConsultationButton;
import com.avito.android.remote.model.advert_details.realty.SuperFormInfo;
import com.avito.android.remote.model.advert_details.realty.SuperFormV4;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "name", "phone", "Lcom/avito/android/developments_advice/remote/model/CallInterval;", "timeInterval", "question", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_advice/remote/model/CallInterval;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.consultation.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28117x extends kotlin.jvm.internal.N implements Y41.r<String, String, CallInterval, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConsultationAfterIceBreakersItem f74848l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28118y f74849m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28117x(ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, C28118y c28118y) {
        super(4);
        this.f74848l = consultationAfterIceBreakersItem;
        this.f74849m = c28118y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.r
    public final G0 invoke(String str, String str2, CallInterval callInterval, String str3) {
        DeepLink deeplink;
        ButtonAction button;
        InterfaceC28130g0 interfaceC28130g0;
        kotlin.Q q12;
        SuperFormInfo info;
        SuperFormInfo info2;
        SuperFormV4 infoV4;
        ConsultationButton button2;
        String str4 = str;
        String str5 = str2;
        CallInterval callInterval2 = callInterval;
        String str6 = str3;
        ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem = this.f74848l;
        ConsultationAfterIceBreaker consultationAfterIceBreaker = consultationAfterIceBreakersItem.f74646e;
        if (consultationAfterIceBreaker == null || (infoV4 = consultationAfterIceBreaker.getInfoV4()) == null || (button2 = infoV4.getButton()) == null || (deeplink = button2.getUri()) == null) {
            deeplink = (consultationAfterIceBreaker == null || (button = consultationAfterIceBreaker.getButton()) == null) ? null : button.getDeeplink();
        }
        if (deeplink != null && (interfaceC28130g0 = this.f74849m.f74854f) != null) {
            Bundle bundle = new Bundle();
            boolean z12 = consultationAfterIceBreakersItem.f74647f;
            if (z12) {
                if ((consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getInfoV4() : null) != null) {
                    SuperFormV4 infoV42 = consultationAfterIceBreaker.getInfoV4();
                    if (infoV42 != null) {
                        infoV42.getTitle();
                    }
                    SuperFormV4 infoV43 = consultationAfterIceBreaker.getInfoV4();
                    if (infoV43 != null) {
                        infoV43.getDescription();
                    }
                }
                if ((consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getInfoV3() : null) != null) {
                    SuperFormInfo infoV3 = consultationAfterIceBreaker.getInfoV3();
                    String title = infoV3 != null ? infoV3.getTitle() : null;
                    SuperFormInfo infoV32 = consultationAfterIceBreaker.getInfoV3();
                    q12 = new kotlin.Q(title, infoV32 != null ? infoV32.getDescription() : null);
                } else {
                    q12 = new kotlin.Q((consultationAfterIceBreaker == null || (info2 = consultationAfterIceBreaker.getInfo()) == null) ? null : info2.getTitle(), (consultationAfterIceBreaker == null || (info = consultationAfterIceBreaker.getInfo()) == null) ? null : info.getDescription());
                }
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                q12 = new kotlin.Q(consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getTitle() : null, consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getDescription() : null);
            }
            String str7 = (String) q12.f406619b;
            String str8 = (String) q12.f406620c;
            bundle.putString("consultation_start_link_argument_name", str4);
            bundle.putString("consultation_start_link_argument_phone", str5);
            bundle.putString("consultation_start_link_argument_form_title", str7);
            bundle.putString("consultation_start_link_argument_form_subtitle", str8);
            bundle.putString("consultation_start_link_argument_question", str6);
            if ((consultationAfterIceBreaker != null ? consultationAfterIceBreaker.getInfoV4() : null) != null) {
                callInterval2 = new CallInterval(null, null, null, null, true, null, null, 111, null);
            }
            bundle.putParcelable("consultation_start_link_argument_time_interval", callInterval2);
            bundle.putBoolean("consultation_start_link_track_submit_event", true);
            G0 g02 = G0.f406611a;
            interfaceC28130g0.l0(deeplink, bundle);
        }
        return G0.f406611a;
    }
}
