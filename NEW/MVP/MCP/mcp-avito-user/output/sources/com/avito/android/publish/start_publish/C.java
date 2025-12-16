package com.avito.android.publish.start_publish;

import android.content.DialogInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.profile_settings_extended.mvi.entity.CommonValueBottomMenuAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.spare_parts.bottom_sheet.SparePartsBottomSheetActivity;
import kotlin.G0;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView;
import wc0.C49597b;
import wc0.C49600e;
import wc0.C49602g;
import wc0.C49605j;
import wc0.C49607l;
import yc0.g;
import yc0.z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class C implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f245256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f245257c;

    public /* synthetic */ C(Object obj, int i12) {
        this.f245256b = i12;
        this.f245257c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object obj = this.f245257c;
        switch (this.f245256b) {
            case 0:
                StartPublishSheet startPublishSheet = (StartPublishSheet) obj;
                startPublishSheet.f245307M = null;
                startPublishSheet.f245306L.dispose();
                Y41.a<G0> aVar = startPublishSheet.f245301G;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 1:
                int i12 = SparePartsBottomSheetActivity.f284733v;
                ((SparePartsBottomSheetActivity) obj).finish();
                break;
            case 2:
                ((com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.e) obj).f286745G = null;
                break;
            case 3:
                com.avito.android.subscriptions_settings.d dVar = (com.avito.android.subscriptions_settings.d) obj;
                dVar.f291511m = null;
                dVar.f291502d = null;
                dVar.f291503e = null;
                dVar.f291504f = null;
                dVar.f291505g = null;
                dVar.f291506h = null;
                dVar.f291507i = null;
                dVar.f291508j = null;
                dVar.f291509k = null;
                dVar.f291510l = null;
                dVar.f291518t.K5(G0.f406611a);
                break;
            case 4:
                com.avito.android.subscriptions_settings.j jVar = (com.avito.android.subscriptions_settings.j) obj;
                jVar.f291538m = null;
                jVar.f291529d = null;
                jVar.f291530e = null;
                jVar.f291531f = null;
                jVar.f291532g = null;
                jVar.f291533h = null;
                jVar.f291534i = null;
                jVar.f291535j = null;
                jVar.f291536k = null;
                jVar.f291537l = null;
                jVar.f291544s.K5(G0.f406611a);
                break;
            case 5:
                CBRApplicantDataSelectionFieldView.m312showDialog$lambda4((CBRApplicantDataSelectionFieldView) obj, dialogInterface);
                break;
            case 6:
                ((RecyclerView) obj).setAdapter(null);
                break;
            case 7:
                C49597b c49597b = (C49597b) obj;
                c49597b.f441673c = null;
                c49597b.f441677g = null;
                c49597b.f441674d = null;
                c49597b.f441675e = null;
                c49597b.f441676f = null;
                c49597b.f441672b.invoke(CommonValueBottomMenuAction.a.f230546a);
                break;
            case 8:
                C49600e c49600e = (C49600e) obj;
                c49600e.f441684d = null;
                c49600e.f441685e = null;
                AttributedText attributedText = c49600e.f441690j;
                if (attributedText != null) {
                    attributedText.setOnDeepLinkClickListener(null);
                }
                c49600e.f441686f = null;
                c49600e.f441688h = null;
                c49600e.f441687g = null;
                c49600e.f441682b.invoke(g.a.f443252a);
                break;
            case 9:
                C49602g c49602g = (C49602g) obj;
                c49602g.f441694d = null;
                c49602g.f441695e = null;
                break;
            case 10:
                C49605j c49605j = (C49605j) obj;
                c49605j.f441701c = null;
                c49605j.f441702d = null;
                c49605j.f441703e = null;
                c49605j.f441704f = null;
                c49605j.f441705g = null;
                c49605j.f441706h = null;
                c49605j.f441707i = null;
                c49605j.f441708j = null;
                c49605j.f441709k = null;
                c49605j.f441710l = null;
                c49605j.f441711m = null;
                c49605j.f441712n = null;
                c49605j.f441713o = null;
                c49605j.f441700b.invoke(z.b.f443356a);
                break;
            default:
                C49607l c49607l = (C49607l) obj;
                c49607l.f441717d = null;
                c49607l.f441718e = null;
                break;
        }
    }
}
