package ru.avito.component.serp.job;

import Q81.a;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.KeyAttributes;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.SellerInfoInlineAdvantage;
import com.avito.android.remote.model.SellerOnlineStatus;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import com.avito.android.verification.verification_input_inn.o;
import com.google.android.material.internal.CheckableImageButton;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.kotlin.A1;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.serp.job.geo.a;
import ru.avito.component.snippet_badge_bar.SnippetBadgeBar;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: SerpAdvertRichJobCard.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/e;", "Lru/avito/component/serp/job/c;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e implements c {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f430470A;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f430471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430472c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RelativeLayout f430473d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final k f430474e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f430475f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final TextView f430476g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final View f430477h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f430478i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f430479j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SnippetBadgeBar f430480k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f430481l;

    /* renamed from: m, reason: collision with root package name */
    public final float f430482m;

    /* renamed from: n, reason: collision with root package name */
    public final float f430483n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final View f430484o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f430485p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final View f430486q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final Button f430487r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final Button f430488s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final View f430489t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final TextView f430490u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final f f430491v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final ru.avito.component.serp.job.b f430492w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.a f430493x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final g f430494y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final i f430495z;

    /* compiled from: SerpAdvertRichJobCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f430496l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(1);
            this.f430496l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            this.f430496l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: SerpAdvertRichJobCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f430497l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.a<G0> aVar) {
            super(1);
            this.f430497l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            this.f430497l.invoke();
            return G0.f406611a;
        }
    }

    public e(@Y61.k View view, @InterfaceC42150f int i12, boolean z12, @Y61.k JobSnippetContactButtonType jobSnippetContactButtonType) throws Resources.NotFoundException {
        this.f430471b = view;
        this.f430472c = i12;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
        this.f430473d = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430474e = new k((TextView) viewFindViewById2, z12);
        View viewFindViewById3 = view.findViewById(R.id.price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430475f = (TextView) viewFindViewById3;
        this.f430476g = (TextView) view.findViewById(R.id.date);
        this.f430477h = view.findViewById(R.id.viewed_info_badge);
        View viewFindViewById4 = view.findViewById(R.id.inline_advantages_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById4;
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.advantages_container);
        View viewFindViewById5 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        this.f430478i = (CheckableImageButton) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.actions_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout3 = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.seller_logo);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f430479j = (SimpleDraweeView) viewFindViewById7;
        this.f430480k = (SnippetBadgeBar) view.findViewById(R.id.badges_container);
        this.f430481l = (TextView) view.findViewById(R.id.key_attributes_container);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        this.f430484o = view.findViewById(R.id.multigeo_grouping_1_group);
        this.f430485p = (TextView) view.findViewById(R.id.multigeo_grouping_1_text);
        this.f430486q = view.findViewById(R.id.multigeo_grouping_1_clickable);
        this.f430487r = (Button) view.findViewById(R.id.multigeo_grouping_2);
        this.f430488s = (Button) view.findViewById(R.id.additional_contact_button);
        this.f430489t = view.findViewById(R.id.inactive_info_badge);
        this.f430490u = (TextView) view.findViewById(R.id.aggregation_disclaimer);
        this.f430491v = new f(layoutInflaterFrom, linearLayout);
        this.f430492w = linearLayout2 != null ? new ru.avito.component.serp.job.b(layoutInflaterFrom, linearLayout2) : null;
        this.f430493x = new ru.avito.component.serp.job.a(layoutInflaterFrom, linearLayout3, jobSnippetContactButtonType);
        View viewFindViewById8 = view.findViewById(R.id.single_line_location_container);
        this.f430494y = viewFindViewById8 != null ? new g(viewFindViewById8) : null;
        View viewFindViewById9 = view.findViewById(R.id.multi_line_location_root);
        this.f430495z = viewFindViewById9 != null ? new i(viewFindViewById9) : null;
        Resources resources = view.getResources();
        this.f430470A = new io.reactivex.rxjava3.disposables.c();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.inactive_alpha_old, typedValue, true);
        this.f430483n = typedValue.getFloat();
        resources.getValue(R.dimen.active_alpha, typedValue, true);
        this.f430482m = typedValue.getFloat();
    }

    @Override // ru.avito.component.serp.job.c
    public final void FO() {
        D6.w(this.f430484o);
        D6.w(this.f430487r);
    }

    @Override // ru.avito.component.serp.job.c
    public final void H0() {
        this.f430470A.e();
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        a.C0890a.a(this, z12);
    }

    @Override // ru.avito.component.serp.job.c
    public final void K0(@Y61.k String str, boolean z12) {
        k kVar = this.f430474e;
        Drawable drawable = z12 ? kVar.f430534d : null;
        int i12 = z12 ? kVar.f430535e : kVar.f430537g;
        int i13 = kVar.f430536f;
        int i14 = z12 ? i13 : 0;
        if (!z12 || !kVar.f430532b) {
            i13 = 0;
        }
        int i15 = z12 ? kVar.f430538h : kVar.f430533c;
        TextView textView = kVar.f430531a;
        textView.setPadding(i14, i13, i14, i13);
        D6.c(kVar.f430531a, Integer.valueOf(i15), null, null, null, 14);
        textView.setBackground(drawable);
        textView.setTextColor(i12);
        textView.setText(str);
    }

    @Override // ru.avito.component.serp.job.c
    public final void LS(@Y61.k Action action, @Y61.k Y41.a<G0> aVar) {
        FO();
        D6.H(this.f430484o);
        View view = this.f430486q;
        if (view != null) {
            view.setOnClickListener(new d(0, aVar));
        }
        TextView textView = this.f430485p;
        if (textView != null) {
            I5.a(textView, action.getTitle(), false);
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void MU(@Y61.l KeyAttributes keyAttributes) {
        Integer maxLines;
        TextView textView = this.f430481l;
        if (textView != null) {
            textView.setMaxLines((keyAttributes == null || (maxLines = keyAttributes.getMaxLines()) == null) ? Integer.MAX_VALUE : maxLines.intValue());
        }
        if (textView != null) {
            I5.a(textView, keyAttributes != null ? keyAttributes.getText() : null, false);
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void Q50(@Y61.l com.avito.android.image_loader.a aVar) {
        this.f430479j.setVisibility(0);
        C35949t5.c(this.f430479j, aVar, null, null, null, 14);
    }

    @Override // ru.avito.component.serp.job.c
    public final void Vo(@Y61.l List<SellerInfoInlineAdvantage> list, @Y61.l String str, @Y61.l SellerOnlineStatus sellerOnlineStatus) {
        f fVar = this.f430491v;
        LinearLayout linearLayout = fVar.f430499b;
        linearLayout.removeAllViews();
        List<SellerInfoInlineAdvantage> list2 = list;
        boolean z12 = (list2 == null || list2.isEmpty()) && (str == null || C43066x.K(str));
        linearLayout.setVisibility(!z12 ? 0 : 8);
        if (z12) {
            return;
        }
        LayoutInflater layoutInflater = fVar.f430498a;
        if (list != null) {
            for (SellerInfoInlineAdvantage sellerInfoInlineAdvantage : list) {
                View viewInflate = layoutInflater.inflate(R.layout.advert_item_rich_job_inline_advantage_logo, (ViewGroup) linearLayout, false);
                ImageView imageView = viewInflate instanceof ImageView ? (ImageView) viewInflate : null;
                if (imageView != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(C48063a.f437606a.a(imageView.getContext(), sellerInfoInlineAdvantage.getColor())));
                    Integer numA = q.a(sellerInfoInlineAdvantage.getIcon());
                    imageView.setImageDrawable(numA != null ? C35835l0.h(numA.intValue(), imageView.getContext()) : null);
                    linearLayout.addView(imageView);
                }
            }
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.advert_item_rich_job_inline_advantage_title, (ViewGroup) linearLayout, false);
        TextView textView = viewInflate2 instanceof TextView ? (TextView) viewInflate2 : null;
        if (textView == null) {
            return;
        }
        textView.setTextAppearance(C35835l0.j(this.f430472c, textView.getContext()));
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = 1.0f;
        textView.setLayoutParams(layoutParams2);
        I5.a(textView, str, false);
        linearLayout.addView(textView);
        if (sellerOnlineStatus == null) {
            return;
        }
        View viewInflate3 = layoutInflater.inflate(R.layout.advert_item_rich_job_inline_advantage_online_status, (ViewGroup) linearLayout, false);
        TextView textView2 = viewInflate3 instanceof TextView ? (TextView) viewInflate3 : null;
        if (textView2 == null) {
            return;
        }
        textView2.setTextColor(C48065c.d(textView2.getContext(), sellerOnlineStatus.getTextColor(), R.attr.green600));
        I5.a(textView2, sellerOnlineStatus.getText(), false);
        linearLayout.addView(textView2);
    }

    @Override // ru.avito.component.serp.job.c
    public final void X50(@Y61.k Y41.a<G0> aVar) {
        this.f430470A.b(A1.h(C37722i.a(this.f430471b), null, new b(aVar), 3));
    }

    @Override // ru.avito.component.serp.job.c
    public final void b0(@Y61.l String str) {
        TextView textView = this.f430476g;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void bk(@Y61.k ru.avito.component.serp.job.geo.a aVar) {
        i iVar = this.f430495z;
        if (iVar != null) {
            iVar.f430526a.setVisibility(8);
        }
        g gVar = this.f430494y;
        if (gVar != null) {
            gVar.f430500a.setVisibility(0);
            ArrayList arrayList = aVar.f430510d;
            String strConcat = null;
            ArrayList arrayList2 = O2.a(arrayList) ? arrayList : null;
            ImageView imageView = gVar.f430501b;
            C35821j2.a(imageView, arrayList2 != null ? new Q81.g(imageView.getContext(), arrayList2, 4, 4.5f, 0) : null);
            a.C12400a c12400a = aVar.f430507a;
            int i12 = c12400a.f430512a;
            Integer numValueOf = Integer.valueOf(i12);
            TextView textView = gVar.f430502c;
            D6.c(textView, numValueOf, null, null, null, 14);
            I5.a(textView, c12400a.f430513b, false);
            LinearLayout linearLayout = gVar.f430506g;
            if (linearLayout != null) {
                D6.c(linearLayout, Integer.valueOf(i12), null, null, null, 14);
            }
            I5.a(gVar.f430503d, aVar.f430508b, false);
            String str = aVar.f430509c;
            Integer numA = str != null ? q.a(str) : null;
            ImageView imageView2 = gVar.f430504e;
            C35821j2.a(imageView2, numA != null ? C35835l0.h(numA.intValue(), imageView2.getContext()) : null);
            String str2 = aVar.f430511e;
            if (str2 != null && str2.length() != 0) {
                strConcat = " · ".concat(str2);
            }
            TextView textView2 = gVar.f430505f;
            if (textView2 != null) {
                I5.a(textView2, strConcat, false);
            }
        }
    }

    @Override // ru.avito.component.serp.job.c
    @SuppressLint({"RestrictedApi"})
    public final void jb(boolean z12, boolean z13) {
        CheckableImageButton checkableImageButton = this.f430478i;
        checkableImageButton.setChecked(z12);
        checkableImageButton.requestLayout();
    }

    @Override // ru.avito.component.serp.job.c
    public final void l5(@Y61.k Y41.a<G0> aVar) {
        this.f430470A.b(A1.h(C37722i.a(this.f430478i), null, new a(aVar), 3));
    }

    @Override // ru.avito.component.serp.job.c
    public final void lo(@Y61.k ru.avito.component.serp.job.geo.g gVar) {
        g gVar2 = this.f430494y;
        if (gVar2 != null) {
            gVar2.f430500a.setVisibility(8);
        }
        i iVar = this.f430495z;
        if (iVar != null) {
            iVar.f430526a.setVisibility(0);
            iVar.a(gVar);
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void n1(@Y61.l List<SellerInfoAdvantage> list) {
        ru.avito.component.serp.job.b bVar = this.f430492w;
        if (bVar != null) {
            bVar.a(R.attr.textM20, list);
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void o5(@Y61.l SerpBadgeBar serpBadgeBar) {
        SnippetBadgeBar snippetBadgeBar = this.f430480k;
        if (snippetBadgeBar != null) {
            snippetBadgeBar.a(serpBadgeBar != null ? Q81.b.d(serpBadgeBar) : null);
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void om(@Y61.k Y41.l<? super AdvertAction, G0> lVar) {
        this.f430470A.b(A1.h(this.f430493x.f430464e, null, lVar, 3));
    }

    @Override // ru.avito.component.serp.job.c
    public final void p(@Y61.l String str) {
        I5.a(this.f430475f, str, false);
    }

    @Override // ru.avito.component.serp.job.c
    public final void qD(@Y61.l List<? extends AdvertAction> list, boolean z12) {
        int i12;
        ru.avito.component.serp.job.a aVar = this.f430493x;
        LinearLayout linearLayout = aVar.f430461b;
        linearLayout.removeAllViews();
        List<? extends AdvertAction> list2 = list;
        boolean z13 = list2 == null || list2.isEmpty();
        linearLayout.setVisibility(!z13 ? 0 : 8);
        if (z13 || list == null) {
            return;
        }
        for (AdvertAction advertAction : list) {
            View viewInflate = aVar.f430460a.inflate(R.layout.advert_item_rich_job_action_button, (ViewGroup) linearLayout, false);
            Button button = viewInflate instanceof Button ? (Button) viewInflate : null;
            if (button != null) {
                button.setOnClickListener(new o(25, aVar, advertAction));
                com.avito.android.lib.design.button.b.a(button, advertAction.getTitle(), false);
                boolean z14 = advertAction instanceof AdvertAction.Messenger;
                button.setId(z14 ? R.id.btn_write : advertAction instanceof AdvertAction.Phone ? R.id.btn_call : -1);
                JobSnippetContactButtonType jobSnippetContactButtonType = aVar.f430462c;
                if (!z12) {
                    i12 = jobSnippetContactButtonType.f430459d;
                } else if (z14) {
                    i12 = jobSnippetContactButtonType.f430458c;
                } else if (advertAction instanceof AdvertAction.Phone) {
                    aVar.f430465f = button;
                    i12 = jobSnippetContactButtonType.f430457b;
                } else {
                    i12 = jobSnippetContactButtonType.f430459d;
                }
                button.setAppearanceFromAttr(i12);
                linearLayout.addView(button);
            }
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void setActive(boolean z12) {
        float f12 = z12 ? this.f430482m : this.f430483n;
        this.f430471b.setClickable(z12);
        this.f430473d.setAlpha(f12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        Button button = this.f430493x.f430465f;
        if (button == null) {
            return;
        }
        if (phoneLoadingState == PhoneLoadingState.f430441b) {
            button.setClickable(true);
            button.setOnTouchListener(null);
        } else {
            button.setClickable(false);
            button.setOnTouchListener(new Ha1.a(1));
        }
        button.setLoading(phoneLoadingState == PhoneLoadingState.f430442c);
    }

    @Override // ru.avito.component.serp.job.c
    public final void setViewed(boolean z12) {
        View view = this.f430477h;
        if (view == null) {
            return;
        }
        view.setVisibility(z12 ? 0 : 8);
    }

    @Override // ru.avito.component.serp.job.c
    public final void yT(@Y61.k Action action, @Y61.k Y41.a<G0> aVar) {
        Button button;
        FO();
        Action.TitleWithSalary titleWithSalary = action.getTitleWithSalary();
        if (titleWithSalary == null || (button = this.f430487r) == null) {
            return;
        }
        D6.H(button);
        View viewFindViewById = button.findViewById(R.id.button_texts_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        linearLayout.setGravity(19);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        linearLayout.setLayoutParams(layoutParams);
        View viewFindViewById2 = button.findViewById(R.id.text_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, y6.b(16), 0, titleWithSalary.getSalaryRange() == null ? y6.b(16) : 0);
        }
        textView.setGravity(3);
        View viewFindViewById3 = button.findViewById(R.id.subtitle_text_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.setMargins(0, y6.b(2), 0, y6.b(16));
        }
        button.setOnClickListener(new A(29, aVar));
        button.setText(titleWithSalary.getTitle());
        String salaryRange = titleWithSalary.getSalaryRange();
        if (salaryRange == null) {
            salaryRange = "";
        }
        button.setSubtitle(salaryRange);
    }

    public /* synthetic */ e(View view, int i12, boolean z12, JobSnippetContactButtonType jobSnippetContactButtonType, int i13, C42822w c42822w) {
        this(view, (i13 & 2) != 0 ? R.attr.textM20 : i12, (i13 & 4) != 0 ? true : z12, (i13 & 8) != 0 ? JobSnippetContactButtonType.f430453e : jobSnippetContactButtonType);
    }
}
