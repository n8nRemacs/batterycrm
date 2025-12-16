package ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet;

import Y41.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_extended.mvi.entity.CommonValueBottomMenuAction;
import com.avito.android.remote.model.category_parameters.NavigationNode;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import com.avito.android.short_term_rent.view.components.retro_badges.RetroBadgesView;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import kotlin.G0;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentItem;
import ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRDocumentViewHolder;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog;
import ru.tinkoff.core.tinkoffId.ui.webView.TinkoffWebViewAuthActivity;
import ru.tinkoff.core.tinkoffId.ui.webView.f;
import wc0.C49597b;
import wc0.C49607l;
import yc0.k;
import zp0.C50606a;
import zp0.C50607b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f434236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f434237d;

    public /* synthetic */ c(int i12, Object obj, Object obj2) {
        this.f434235b = i12;
        this.f434236c = obj;
        this.f434237d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.avito.android.lib.design.bottom_sheet.d dVar;
        Object obj = this.f434237d;
        ?? r12 = this.f434236c;
        switch (this.f434235b) {
            case 0:
                CBRPickerDialog.m314bindItemViewHolder$lambda10((CBRPickerDialog) r12, (CBRPickerDialog.Item) obj, view);
                break;
            case 1:
                ru.cyberity.cbr.presentation.screen.error.b.a((Control) r12, (ru.cyberity.cbr.presentation.screen.error.b) obj, view);
                break;
            case 2:
                int i12 = TinkoffWebViewAuthActivity.f437095e;
                ((TinkoffWebViewAuthActivity) r12).H1(((f) obj).f437108b);
                break;
            case 3:
                l<? super RetroBadgeItemHint, G0> lVar = ((RetroBadgesView) r12).f283044f;
                if (lVar != null) {
                    lVar.invoke(((RetroBadgeItem) obj).f283048e);
                    break;
                }
                break;
            case 4:
                CBRDocumentViewHolder.m280bind$lambda2$lambda0((CBRDocumentViewHolder) r12, (CBRDocumentItem) obj, view);
                break;
            case 5:
                C49597b c49597b = (C49597b) r12;
                c49597b.f441672b.invoke((k) obj);
                com.avito.android.lib.design.bottom_sheet.d dVar2 = c49597b.f441673c;
                if (dVar2 != null) {
                    dVar2.dismiss();
                    break;
                }
                break;
            case 6:
                ((C49597b) r12).f441672b.invoke((CommonValueBottomMenuAction.DeleteCommonValue) obj);
                break;
            case 7:
                C49607l c49607l = (C49607l) r12;
                c49607l.f441716c.invoke((DeepLink) obj);
                com.avito.android.lib.design.bottom_sheet.d dVar3 = c49607l.f441717d;
                if (dVar3 != null && dVar3.isShowing() && (dVar = c49607l.f441717d) != null) {
                    dVar.dismiss();
                    break;
                }
                break;
            case 8:
                r12.invoke((UserAdvertsHintItem) obj);
                break;
            case 9:
                l<? super DeepLink, G0> lVar2 = ((C50606a) r12).f444254d;
                if (lVar2 != null) {
                    lVar2.invoke(((NavigationNode) obj).getDeeplink());
                    break;
                }
                break;
            default:
                l<? super DeepLink, G0> lVar3 = ((C50607b) r12).f444257d;
                if (lVar3 != null) {
                    lVar3.invoke(((NavigationNode) obj).getDeeplink());
                    break;
                }
                break;
        }
    }
}
