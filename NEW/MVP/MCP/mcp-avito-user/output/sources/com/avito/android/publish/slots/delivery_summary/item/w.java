package com.avito.android.publish.slots.delivery_summary.item;

import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import hf0.C40928a;
import hf0.DialogC40929b;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySummaryItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/item/w;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/delivery_summary/item/s;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w extends com.avito.konveyor.adapter.b implements s {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f243606A = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f243607b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f243608c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ShimmerLayout f243609d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f243610e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f243611f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f243612g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f243613h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f243614i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final TextView f243615j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243616k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243617l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243618m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243619n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final RecyclerView f243620o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f243621p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final DescriptionParameterItem f243622q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final DescriptionParameterItem f243623r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final TextView f243624s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final TextView f243625t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final TextView f243626u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final DescriptionParameterItem f243627v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final DescriptionParameterItem f243628w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final TextView f243629x;

    /* renamed from: y, reason: collision with root package name */
    public final int f243630y;

    /* renamed from: z, reason: collision with root package name */
    public final int f243631z;

    /* compiled from: DeliverySummaryItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.delivery_summary_edit.item.o f243633m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.publish.slots.delivery_summary_edit.item.o oVar) {
            super(0);
            this.f243633m = oVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            w wVar = w.this;
            ViewGroup viewGroup = wVar.f243607b;
            View view = wVar.f243608c;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(view.getResources().getString(R.string.error_summary_toast_text));
            com.avito.android.publish.slots.delivery_summary_edit.item.o oVar = this.f243633m;
            com.avito.android.component.toast.c.b(cVar, viewGroup, printableTextF, null, Collections.singletonList(new c.a.C3719a(view.getResources().getString(R.string.error_summary_button), false, null, new v(oVar), 6, null)), null, new f.c(oVar.f243820a), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4010);
            return Boolean.TRUE;
        }
    }

    public w(@Y61.k View view, @Y61.k ViewGroup viewGroup) {
        super(view);
        this.f243607b = viewGroup;
        this.f243608c = view;
        View viewFindViewById = view.findViewById(R.id.delivery_summary_skeleton);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f243609d = (ShimmerLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.delivery_summary_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.f243610e = viewGroup2;
        View viewFindViewById3 = viewGroup2.findViewById(R.id.summary_icon_delivery);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f243611f = viewFindViewById3;
        View viewFindViewById4 = viewGroup2.findViewById(R.id.summary_advert_name);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243612g = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup2.findViewById(R.id.summary_advert_price);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243613h = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup2.findViewById(R.id.summary_image);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f243614i = (SimpleDraweeView) viewFindViewById6;
        this.f243615j = (TextView) viewGroup2.findViewById(R.id.summary_delivery_title);
        View viewFindViewById7 = viewGroup2.findViewById(R.id.summary_delivery_fee_block);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243616k = (DescriptionParameterItem) viewFindViewById7;
        View viewFindViewById8 = viewGroup2.findViewById(R.id.summary_delivery_fbs_fee_block);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243617l = (DescriptionParameterItem) viewFindViewById8;
        View viewFindViewById9 = viewGroup2.findViewById(R.id.summary_delivery_discount_block);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243618m = (DescriptionParameterItem) viewFindViewById9;
        View viewFindViewById10 = viewGroup2.findViewById(R.id.summary_delivery_total_block);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243619n = (DescriptionParameterItem) viewFindViewById10;
        this.f243620o = (RecyclerView) viewGroup2.findViewById(R.id.summary_delivery_fee_details_recycler);
        this.f243621p = (TextView) viewGroup2.findViewById(R.id.summary_dbs_title);
        this.f243622q = (DescriptionParameterItem) viewGroup2.findViewById(R.id.summary_dbs_fee_block);
        this.f243623r = (DescriptionParameterItem) viewGroup2.findViewById(R.id.summary_dbs_total_block);
        this.f243624s = (TextView) viewGroup2.findViewById(R.id.summary_dbs_additional_info);
        View viewFindViewById11 = viewGroup2.findViewById(R.id.summary_agreement_text);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById11;
        this.f243625t = textView;
        this.f243626u = (TextView) viewGroup2.findViewById(R.id.summary_cnc_title);
        this.f243627v = (DescriptionParameterItem) viewGroup2.findViewById(R.id.summary_cnc_fee_block);
        this.f243628w = (DescriptionParameterItem) viewGroup2.findViewById(R.id.summary_cnc_total_block);
        this.f243629x = (TextView) viewGroup2.findViewById(R.id.add_fee_to_price_details);
        this.f243630y = y6.b(12);
        this.f243631z = y6.b(16);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void B80(hf0.e eVar, Y41.l<? super String, G0> lVar) {
        if (eVar != null) {
            com.avito.android.lib.util.g.a(new DialogC40929b(this.f243610e.getContext(), eVar, lVar));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void ER(@Y61.k String str) {
        I5.a(this.f243612g, str, false);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void H9(@Y61.l x xVar) {
        G0 g02;
        Q<AttributedText, AttributedText> q12;
        DescriptionParameterItem descriptionParameterItem = this.f243623r;
        if (descriptionParameterItem != null) {
            D6.G(descriptionParameterItem, xVar != null);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null || xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void Jd(@Y61.l x xVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243618m;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void L40(@Y61.l com.avito.android.image_loader.a aVar) {
        D6.G(this.f243611f, aVar != null);
        boolean z12 = aVar != null;
        SimpleDraweeView simpleDraweeView = this.f243614i;
        D6.G(simpleDraweeView, z12);
        if (aVar != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(aVar);
            aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
            aVarA.c();
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void Nf(@Y61.l x xVar, @Y61.l com.avito.android.deep_linking.links.w wVar, @Y61.k Y41.l<? super String, G0> lVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243617l;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        DeepLink deepLink = xVar.f243635b;
        if (deepLink == null && xVar.f243636c == null) {
            D6.w(descriptionParameterItem.getIcon());
        } else if (deepLink != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new t(wVar, xVar, 0));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new u(this, xVar, lVar, 0));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void O6(@Y61.k Y41.l lVar, @Y61.l List list) {
        RecyclerView recyclerView = this.f243620o;
        if (recyclerView != null) {
            D6.G(recyclerView, O2.a(list));
        }
        if (list != null) {
            C40928a c40928a = new C40928a(lVar, list);
            if (recyclerView != null) {
                recyclerView.l(new hf0.d(), -1);
            }
            if (recyclerView == null) {
                return;
            }
            recyclerView.setAdapter(c40928a);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void Oa(@Y61.l AttributedText attributedText) {
        TextView textView = this.f243624s;
        if (textView != null) {
            D6.G(textView, attributedText != null);
        }
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void W5(@Y61.l AttributedText attributedText) {
        TextView textView = this.f243626u;
        if (textView != null) {
            D6.G(textView, attributedText != null);
        }
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
        int i12 = attributedText == null ? this.f243631z : this.f243630y;
        DescriptionParameterItem descriptionParameterItem = this.f243627v;
        if (descriptionParameterItem != null) {
            D6.c(descriptionParameterItem, null, Integer.valueOf(i12), null, null, 13);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void ab(@Y61.l AttributedText attributedText) {
        TextView textView = this.f243621p;
        if (textView != null) {
            D6.G(textView, attributedText != null);
        }
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
        int i12 = attributedText == null ? this.f243631z : this.f243630y;
        DescriptionParameterItem descriptionParameterItem = this.f243622q;
        if (descriptionParameterItem != null) {
            D6.c(descriptionParameterItem, null, Integer.valueOf(i12), null, null, 13);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void ac(@Y61.l x xVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243619n;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void bb(@Y61.l x xVar, @Y61.l com.avito.android.deep_linking.links.w wVar, @Y61.k Y41.l<? super String, G0> lVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243616k;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        DeepLink deepLink = xVar.f243635b;
        if (deepLink == null && xVar.f243636c == null) {
            D6.w(descriptionParameterItem.getIcon());
        } else if (deepLink != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new t(wVar, xVar, 2));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new u(this, xVar, lVar, 2));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void cb(@Y61.l z zVar, @Y61.k Y41.l<? super Boolean, G0> lVar) throws Resources.NotFoundException {
        G0 g02;
        com.avito.android.publish.slots.delivery_summary.item.a aVar;
        ViewGroup viewGroup = this.f243610e;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.add_fee_to_price_banner);
        Badge badge = (Badge) viewGroup.findViewById(R.id.add_fee_to_price_badge);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewGroup.findViewById(R.id.add_fee_to_price_image);
        Switcher switcher = (Switcher) viewGroup.findViewById(R.id.add_fee_to_price_switcher);
        boolean z12 = false;
        if (viewGroup2 != null) {
            D6.G(viewGroup2, zVar != null);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            return;
        }
        if (zVar != null && (aVar = zVar.f243655b) != null) {
            D6.G(badge, true);
            if (badge != null) {
                badge.setTitleText(aVar.f243572a);
            }
        }
        TextView textView = this.f243629x;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, zVar != null ? zVar.f243656c : null, null);
        }
        if (simpleDraweeView != null) {
            UniversalImage universalImage = zVar != null ? zVar.f243654a : null;
            Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null;
            if (imageDependsOnThemeOrDefault != null) {
                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
                D6.H(simpleDraweeView);
            } else {
                D6.w(simpleDraweeView);
                if (textView != null) {
                    D6.c(textView, Integer.valueOf(y6.b(4)), null, null, null, 14);
                }
            }
        }
        if (switcher != null) {
            switcher.setOnClickListener(new EV.a(lVar, switcher));
        }
        if (switcher == null) {
            return;
        }
        if (zVar != null && zVar.f243658e) {
            z12 = true;
        }
        switcher.setChecked(z12);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void f9(@Y61.l x xVar, @Y61.l com.avito.android.deep_linking.links.w wVar, @Y61.k Y41.l<? super String, G0> lVar) {
        G0 g02;
        Q<AttributedText, AttributedText> q12;
        DescriptionParameterItem descriptionParameterItem = this.f243627v;
        if (descriptionParameterItem != null) {
            D6.G(descriptionParameterItem, xVar != null);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null || xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        DeepLink deepLink = xVar.f243635b;
        if (deepLink == null && xVar.f243636c == null) {
            D6.w(descriptionParameterItem.getIcon());
        } else if (deepLink != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new t(wVar, xVar, 3));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new u(this, xVar, lVar, 3));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void l8(@Y61.l AttributedText attributedText) {
        TextView textView = this.f243615j;
        if (textView != null) {
            D6.G(textView, attributedText != null);
        }
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void o4(@Y61.k com.avito.android.publish.slots.delivery_summary_edit.item.o oVar) {
        D6.C(new a(oVar), this.f243607b);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void of(@Y61.k String str) {
        I5.a(this.f243613h, str, false);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void u2(@Y61.l AttributedText attributedText) {
        boolean z12 = attributedText != null;
        TextView textView = this.f243625t;
        D6.G(textView, z12);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void u5(boolean z12) {
        this.f243609d.setVisibility(z12 ? 0 : 8);
        this.f243610e.setVisibility(z12 ? 8 : 0);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void xb(@Y61.l x xVar, @Y61.l com.avito.android.deep_linking.links.w wVar, @Y61.k Y41.l<? super String, G0> lVar) {
        G0 g02;
        Q<AttributedText, AttributedText> q12;
        DescriptionParameterItem descriptionParameterItem = this.f243622q;
        if (descriptionParameterItem != null) {
            D6.G(descriptionParameterItem, xVar != null);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null || xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        DeepLink deepLink = xVar.f243635b;
        if (deepLink == null && xVar.f243636c == null) {
            D6.w(descriptionParameterItem.getIcon());
        } else if (deepLink != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new t(wVar, xVar, 1));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new u(this, xVar, lVar, 1));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.s
    public final void y8(@Y61.l x xVar) {
        G0 g02;
        Q<AttributedText, AttributedText> q12;
        DescriptionParameterItem descriptionParameterItem = this.f243628w;
        if (descriptionParameterItem != null) {
            D6.G(descriptionParameterItem, xVar != null);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null || xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }
}
