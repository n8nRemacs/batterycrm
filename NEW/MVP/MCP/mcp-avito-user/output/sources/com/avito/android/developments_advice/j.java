package com.avito.android.developments_advice;

import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.FormInput;
import com.avito.android.remote.model.LandingInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.D6;
import com.avito.android.util.L4;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.AppBarLayoutWithTextAction;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: ConsultationFormView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/j;", "Lcom/avito/android/developments_advice/c;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ConsultationFormActivity f136102a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L4 f136103b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CoordinatorLayout f136104c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AppBarLayoutWithTextAction f136105d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f136106e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f136107f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f136108g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Input f136109h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f136110i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Input f136111j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f136112k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Input f136113l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f136114m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f136115n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f136116o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f136117p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f136118q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public List<CallInterval> f136119r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final String f136120s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public List<String> f136121t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f136122u;

    /* renamed from: v, reason: collision with root package name */
    public final int f136123v;

    public j(@Y61.k View view, @Y61.k ConsultationFormActivity consultationFormActivity, @Y61.k L4 l42) {
        this.f136102a = consultationFormActivity;
        this.f136103b = l42;
        this.f136104c = (CoordinatorLayout) view.findViewById(R.id.consultation_root);
        AppBarLayoutWithTextAction appBarLayoutWithTextAction = (AppBarLayoutWithTextAction) view.findViewById(R.id.app_bar);
        this.f136105d = appBarLayoutWithTextAction;
        this.f136106e = (ComponentContainer) view.findViewById(R.id.container_question);
        this.f136107f = (Input) view.findViewById(R.id.input_question);
        this.f136108g = (ComponentContainer) view.findViewById(R.id.container_name);
        Input input = (Input) view.findViewById(R.id.input_name);
        this.f136109h = input;
        this.f136110i = (ComponentContainer) view.findViewById(R.id.container_phone);
        Input input2 = (Input) view.findViewById(R.id.input_phone);
        this.f136111j = input2;
        this.f136112k = (ComponentContainer) view.findViewById(R.id.container_time);
        this.f136113l = (Input) view.findViewById(R.id.select_time);
        Button button = (Button) view.findViewById(R.id.consultation_button);
        this.f136114m = button;
        TextView textView = (TextView) view.findViewById(R.id.consultation_disclaimer);
        this.f136115n = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.subtitle);
        this.f136116o = textView2;
        this.f136117p = (Button) view.findViewById(R.id.landing_button);
        this.f136118q = new io.reactivex.rxjava3.disposables.c();
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f136119r = c42784z0;
        this.f136120s = view.getResources().getString(R.string.consultation_form_question_hint);
        this.f136121t = c42784z0;
        this.f136123v = y6.b(16);
        com.avito.android.lib.design.input.n.c(input, new e(this));
        com.avito.android.lib.design.input.n.c(input2, new f(this));
        input2.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(12, this, view));
        Resources resources = view.getResources();
        com.avito.android.util.text.j.c(textView, new AttributedText(resources.getString(R.string.consultation_form_disclaimer_text), Collections.singletonList(new LinkAttribute(resources.getString(R.string.consultation_form_disclaimer_link_name), resources.getString(R.string.consultation_form_disclaimer_link_text), resources.getString(R.string.consultation_form_disclaimer_link_url), C42745f0.U(FontParameter.UnderlineParameter.INSTANCE, new FontParameter.ColorParameter(null, null, "gray48")))), 1), null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        CollapsingTitleAppBarLayout.m(appBarLayoutWithTextAction, R.drawable.ic_close_24);
        appBarLayoutWithTextAction.setTitle(view.getResources().getString(R.string.consultation_form_title));
        appBarLayoutWithTextAction.setShortTitle(appBarLayoutWithTextAction.getTitle());
        button.setOnClickListener(new d(this, 1));
        appBarLayoutWithTextAction.setClickListener(new g(this));
    }

    public final void a(@Y61.k ConsultationFormData consultationFormData) {
        String title = consultationFormData.getTitle();
        if (title != null) {
            AppBarLayoutWithTextAction appBarLayoutWithTextAction = this.f136105d;
            appBarLayoutWithTextAction.setTitle(title);
            appBarLayoutWithTextAction.setShortTitle(title);
        }
        String subtitle = consultationFormData.getSubtitle();
        TextView textView = this.f136116o;
        if (subtitle != null) {
            textView.setText(subtitle);
        }
        AttributedText attributedSubtitle = consultationFormData.getAttributedSubtitle();
        io.reactivex.rxjava3.disposables.c cVar = this.f136118q;
        if (attributedSubtitle != null) {
            com.avito.android.util.text.j.c(textView, attributedSubtitle, null);
            z<DeepLink> zVarLinkClicksV3 = attributedSubtitle.linkClicksV3();
            h hVar = new h(this);
            l41.g<? super Throwable> gVar = i.f136101b;
            zVarLinkClicksV3.getClass();
            cVar.b(zVarLinkClicksV3.v0(hVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
        FormInput questionInput = consultationFormData.getQuestionInput();
        if (questionInput != null) {
            this.f136106e.setVisibility(L.f(questionInput.getIsHidden(), Boolean.TRUE) ? 8 : 0);
            String hint = questionInput.getHint();
            if (hint == null) {
                hint = this.f136120s;
            }
            Input input = this.f136107f;
            input.setHint(hint);
            String data = questionInput.getData();
            if (data != null) {
                Input.t(input, data, false, 6);
            }
            Integer maxLength = questionInput.getMaxLength();
            if (maxLength != null) {
                input.setMaxLength(maxLength.intValue());
            }
        }
        FormInput nameInput = consultationFormData.getNameInput();
        if (nameInput != null) {
            this.f136108g.setVisibility(L.f(nameInput.getIsHidden(), Boolean.TRUE) ? 8 : 0);
            String hint2 = nameInput.getHint();
            if (hint2 != null) {
                this.f136109h.setHint(hint2);
            }
            Input.t(this.f136109h, nameInput.getData(), false, 6);
        }
        FormInput phoneInput = consultationFormData.getPhoneInput();
        if (phoneInput != null) {
            this.f136111j.setHint(phoneInput.getHint());
            Input.t(this.f136111j, phoneInput.getData(), false, 6);
        }
        AttributedText policy = consultationFormData.getPolicy();
        if (policy != null) {
            com.avito.android.util.text.j.c(this.f136115n, policy, null);
            z<DeepLink> zVarLinkClicksV32 = policy.linkClicksV3();
            h hVar2 = new h(this);
            l41.g<? super Throwable> gVar2 = i.f136101b;
            zVarLinkClicksV32.getClass();
            cVar.b(zVarLinkClicksV32.v0(hVar2, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
        LandingInfo landing = consultationFormData.getLanding();
        Button button = this.f136117p;
        if (landing != null) {
            D6.H(button);
            LandingInfo landing2 = consultationFormData.getLanding();
            com.avito.android.lib.design.button.b.a(button, landing2 != null ? landing2.getMainTextLinkText() : null, false);
            button.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(13, consultationFormData, this));
        } else {
            D6.w(button);
        }
        String buttonTitle = consultationFormData.getButtonTitle();
        if (buttonTitle != null) {
            this.f136114m.setText(buttonTitle);
        }
    }
}
