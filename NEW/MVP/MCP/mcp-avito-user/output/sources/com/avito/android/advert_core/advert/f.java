package com.avito.android.advert_core.advert;

import Tb.f;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.campaigns_sale.network.remote.model.HeaderTooltip;
import com.avito.android.captcha.C29327h;
import com.avito.android.captcha.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.publish.details.C33775o;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.ExtendedProfilePhone;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.user_advert.advert.items.realty.entry_point_client_room.ActionDescription;
import com.avito.android.user_advert.advert.items.realty.entry_point_client_room.ExtraAction;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f82666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f82667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f82668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f82669f;

    public /* synthetic */ f(int i12, String str, Object obj, Object obj2, Object obj3) {
        this.f82665b = i12;
        this.f82667d = obj;
        this.f82666c = str;
        this.f82668e = obj2;
        this.f82669f = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v10, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v11, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.avito.android.publish.screen.step.params.view.actions.r, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f82666c;
        Object obj2 = this.f82669f;
        Object obj3 = this.f82668e;
        Object obj4 = this.f82667d;
        switch (this.f82665b) {
            case 0:
                k kVar = ((g) obj4).f82671a;
                if (kVar != null) {
                    kVar.E((AdvertParameters.Button) obj3, (AdvertDetailsFlatViewType) obj2, (String) obj);
                    break;
                }
                break;
            case 1:
                final com.avito.android.advertising.ui.buzzoola.h hVar = ((com.avito.android.advertising.ui.buzzoola.b) obj4).f88578v;
                if (hVar != null) {
                    TextView textView = hVar.f88592F;
                    if (textView != null) {
                        textView.setText((String) obj);
                    }
                    TextView textView2 = hVar.f88593G;
                    if (textView2 != null) {
                        final Y41.a aVar = (Y41.a) obj3;
                        final int i12 = 0;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advertising.ui.buzzoola.f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                h hVar2 = hVar;
                                Y41.a aVar2 = aVar;
                                switch (i12) {
                                    case 0:
                                        int i13 = h.f88590I;
                                        aVar2.invoke();
                                        hVar2.r();
                                        break;
                                    default:
                                        int i14 = h.f88590I;
                                        aVar2.invoke();
                                        hVar2.r();
                                        break;
                                }
                            }
                        });
                    }
                    TextView textView3 = hVar.f88594H;
                    if (textView3 != null) {
                        final Y41.a aVar2 = (Y41.a) obj2;
                        final int i13 = 1;
                        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advertising.ui.buzzoola.f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                h hVar2 = hVar;
                                Y41.a aVar22 = aVar2;
                                switch (i13) {
                                    case 0:
                                        int i132 = h.f88590I;
                                        aVar22.invoke();
                                        hVar2.r();
                                        break;
                                    default:
                                        int i14 = h.f88590I;
                                        aVar22.invoke();
                                        hVar2.r();
                                        break;
                                }
                            }
                        });
                    }
                    com.avito.android.lib.util.g.a(hVar);
                    break;
                }
                break;
            case 2:
                ((com.avito.android.ai_assistant.adapter.message_actions.f) obj4).f88822b.a((String) obj, (ReactionState) obj3, (f.c.b) obj2);
                break;
            case 3:
                ((com.avito.android.ai_assistant.adapter.message_actions.f) obj4).f88822b.a((String) obj, (ReactionState) obj3, (f.c.a) obj2);
                break;
            case 4:
                int i14 = com.avito.android.campaigns_sale.konveyor.editBlock.p.f114000u;
                ((com.avito.android.campaigns_sale.konveyor.editBlock.p) obj4).D80((HeaderTooltip) obj3, view, (Y41.a) obj2, (Y41.a) obj);
                break;
            case 5:
                C29327h c29327h = (C29327h) obj4;
                c29327h.getClass();
                Editable editableM53getText = ((Input) obj3).m53getText();
                String string = editableM53getText != null ? editableM53getText.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (!C43066x.K(string)) {
                    ?? r02 = c29327h.f115048j;
                    if (r02 != 0) {
                        r02.invoke(new y.a(string));
                        break;
                    }
                } else {
                    ComponentContainer.n((ComponentContainer) obj2, ((Activity) obj).getString(R.string.avito_libs_captcha_input_empty_error), 2);
                    break;
                }
                break;
            case 6:
                int i15 = com.avito.android.category.element.n.f116618h;
                ((N) obj4).invoke((DeepLink) obj3, ((Object) ((com.avito.android.category.element.n) obj2).f116620c.getText()) + ", " + ((String) obj));
                break;
            case 7:
                int i16 = com.avito.android.extended_profile_phone_dialog.a.f151551J;
                ((N) obj4).invoke(((ExtendedProfilePhone) obj3).getDeepLink());
                FA.a aVar3 = (FA.a) obj2;
                com.avito.android.extended_profile_phone_dialog.a aVar4 = (com.avito.android.extended_profile_phone_dialog.a) obj;
                if (aVar3 != null) {
                    aVar4.f151552E.c(new FA.b(aVar3.f4581a, aVar3.f4582b, aVar3.f4583c, aVar3.f4584d));
                }
                aVar4.dismiss();
                break;
            case 8:
                CategoryPublishStep.Params.NavigationButtonAction action = (CategoryPublishStep.Params.NavigationButtonAction) obj3;
                CategoryPublishStep.Params.NavigationButton navigationButton = (CategoryPublishStep.Params.NavigationButton) obj2;
                if (action == null) {
                    action = navigationButton.getAction();
                }
                DeepLink deepLink = (DeepLink) obj;
                ((C33775o) obj4).f234858b.d(action, null, deepLink == null ? navigationButton.getDeepLink() : deepLink, null, null);
                break;
            case 9:
                CategoryPublishStep.Params.NavigationButton navigationButton2 = (CategoryPublishStep.Params.NavigationButton) obj2;
                CategoryPublishStep.Params.NavigationButtonAction action2 = (CategoryPublishStep.Params.NavigationButtonAction) obj3;
                if (action2 == null) {
                    action2 = navigationButton2.getAction();
                }
                DeepLink deepLink2 = (DeepLink) obj;
                ((com.avito.android.publish.screen.step.params.view.actions.h) obj4).f241557b.d(action2, null, deepLink2 == null ? navigationButton2.getDeepLink() : deepLink2, null, null);
                break;
            case 10:
                Set<String> set = com.avito.android.publish.slots.delivery_all_toggles.item.o.f243506u;
                com.avito.android.lib.util.g.a(new com.avito.android.publish.slots.delivery_all_toggles.item.c(((com.avito.android.publish.slots.delivery_all_toggles.item.o) obj4).f243507b.getContext(), (com.avito.android.publish.slots.delivery_all_toggles.item.a) obj3, (Y41.p) obj2, (Y41.a) obj));
                break;
            case 11:
                ActionDescription actionDescription = ((ExtraAction) obj4).f309900d;
                com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) obj2;
                if (!(actionDescription instanceof ActionDescription.CloseBanner)) {
                    if (actionDescription instanceof ActionDescription.OpenDeepLink) {
                        ((Y41.l) obj).invoke(((ActionDescription.OpenDeepLink) actionDescription).f309890b);
                        dVar.dismiss();
                        break;
                    }
                } else {
                    ((Y41.a) obj3).invoke();
                    dVar.dismiss();
                    break;
                }
                break;
            default:
                com.avito.android.user_advert.advert.items.realty.entry_point_client_room.h hVar2 = (com.avito.android.user_advert.advert.items.realty.entry_point_client_room.h) obj4;
                com.avito.android.lib.util.g.a(hVar2.f309914b.a(hVar2.f309915c, (ArrayList) obj3, (Y41.l) obj2, (Y41.a) obj));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(Y41.l lVar, ExtendedProfilePhone extendedProfilePhone, FA.a aVar, com.avito.android.extended_profile_phone_dialog.a aVar2) {
        this.f82665b = 7;
        this.f82667d = (N) lVar;
        this.f82668e = extendedProfilePhone;
        this.f82669f = aVar;
        this.f82666c = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(Y41.p pVar, DeepLink deepLink, com.avito.android.category.element.n nVar, String str) {
        this.f82665b = 6;
        this.f82667d = (N) pVar;
        this.f82668e = deepLink;
        this.f82669f = nVar;
        this.f82666c = str;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i12) {
        this.f82665b = i12;
        this.f82667d = obj;
        this.f82668e = obj2;
        this.f82669f = obj3;
        this.f82666c = obj4;
    }
}
