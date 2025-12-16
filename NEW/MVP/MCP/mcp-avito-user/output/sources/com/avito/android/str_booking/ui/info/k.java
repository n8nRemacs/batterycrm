package com.avito.android.str_booking.ui.info;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import Y41.r;
import Y61.l;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.RunnableC22211b;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_booking.network.models.sections.InfoContent;
import com.avito.android.str_booking.network.models.sections.InfoPlaque;
import com.avito.android.str_booking.network.models.sections.PlaqueAction;
import com.avito.android.str_booking.network.models.sections.PlaqueIcon;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.Function4;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: StrBookingInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/info/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/info/j;", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f286060l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f286061b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutCompat f286062c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f286063d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f286064e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f286065f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f286066g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f286067h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f286068i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public Boolean f286069j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f286070k;

    /* compiled from: StrBookingInfoView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/str_booking/ui/info/k$a;", "", "<init>", "()V", "", "ANTI_CLOCKWISE_ROTATION_ANGLE", "F", "", "CHANGE_OPACITY_DURATION", "J", "CLOCKWISE_ROTATION_ANGLE", "INVISIBLE_ALPHA", "ROTATION_DURATION", "VISIBLE_ALPHA", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrBookingInfoView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f286072m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f286072m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            k kVar = k.this;
            int visibility = kVar.f286062c.getVisibility();
            LinearLayout linearLayout = kVar.f286066g;
            TextView textView = kVar.f286065f;
            ImageView imageView = kVar.f286064e;
            LinearLayoutCompat linearLayoutCompat = kVar.f286062c;
            if (visibility == 0) {
                imageView.animate().rotationBy(180.0f).setDuration(50L).start();
                kVar.f286069j = Boolean.TRUE;
                D6.w(linearLayoutCompat);
                D6.w(textView);
                D6.w(linearLayout);
            } else {
                imageView.animate().rotationBy(-180.0f).setDuration(50L).start();
                kVar.f286069j = Boolean.FALSE;
                D6.H(linearLayoutCompat);
                D6.H(textView);
                D6.H(linearLayout);
                linearLayoutCompat.setAlpha(0.0f);
                linearLayoutCompat.animate().alpha(1.0f).setDuration(500L).withStartAction(new RunnableC22211b(13, this.f286072m)).start();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingInfoView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<LayoutInflater> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final LayoutInflater invoke() {
            return LayoutInflater.from(k.this.f286061b.getContext());
        }
    }

    static {
        new a(null);
    }

    public k(@Y61.k View view) {
        super(view);
        this.f286061b = view;
        View viewFindViewById = view.findViewById(R.id.str_booking_info_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        }
        this.f286062c = (LinearLayoutCompat) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.str_booking_info_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286063d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.str_booking_expand_less_arrow);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f286064e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.str_booking_info_content);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286065f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.str_booking_info_buttons_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f286066g = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.str_booking_info_disclaimer_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f286067h = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.str_booking_info_plaques_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f286068i = (LinearLayout) viewFindViewById7;
        this.f286070k = C42727D.c(new c());
    }

    @Override // com.avito.android.str_booking.ui.info.j
    public final void Fh(@l AttributedText attributedText, @Y61.k r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        kotlin.c.c(this.f286065f, attributedText, rVar, null);
    }

    @Override // com.avito.android.str_booking.ui.info.j
    public final void Pe(@l Y41.a<G0> aVar) {
        ImageView imageView = this.f286064e;
        TextView textView = this.f286063d;
        if (aVar == null) {
            textView.setOnClickListener(null);
            imageView.setOnClickListener(null);
        } else {
            b bVar = new b(aVar);
            textView.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(28, bVar));
            imageView.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(29, bVar));
        }
    }

    @Override // com.avito.android.str_booking.ui.info.j
    public final void oD(@Y61.k com.avito.android.str_booking.ui.info.c cVar, @l r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        InfoContent infoContent = cVar.f286051b;
        Function4.b(this.f286066g, infoContent != null ? infoContent.c() : null, this.f286061b, rVar);
    }

    @Override // com.avito.android.str_booking.ui.info.j
    public final void pp(@Y61.k com.avito.android.str_booking.ui.info.c cVar) {
        Boolean collapsed;
        Boolean bool = this.f286069j;
        InfoContent infoContent = cVar.f286051b;
        if (bool == null) {
            if (infoContent == null || (collapsed = infoContent.getCollapsed()) == null) {
                collapsed = Boolean.FALSE;
            }
            this.f286069j = collapsed;
        }
        boolean zF2 = infoContent != null ? L.f(infoContent.getIsCollapsible(), Boolean.TRUE) : false;
        ImageView imageView = this.f286064e;
        D6.G(imageView, zF2);
        I5.a(this.f286063d, infoContent != null ? infoContent.getHeader() : null, false);
        boolean zF3 = L.f(this.f286069j, Boolean.TRUE);
        LinearLayout linearLayout = this.f286066g;
        TextView textView = this.f286065f;
        LinearLayoutCompat linearLayoutCompat = this.f286062c;
        if (zF3) {
            D6.w(linearLayoutCompat);
            D6.w(textView);
            D6.w(linearLayout);
        } else {
            imageView.setRotation(180.0f);
            D6.H(linearLayoutCompat);
            D6.H(textView);
            D6.H(linearLayout);
        }
    }

    @Override // com.avito.android.str_booking.ui.info.j
    public final void tA(@l List<AttributedText> list) {
        LinearLayout linearLayout = this.f286067h;
        linearLayout.removeAllViews();
        List<AttributedText> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            D6.w(linearLayout);
            return;
        }
        D6.H(linearLayout);
        for (AttributedText attributedText : list) {
            View view = this.f286061b;
            TextView textView = new TextView(view.getContext());
            kotlin.c.b(textView, attributedText);
            LinearLayoutCompat.b bVar = new LinearLayoutCompat.b(-2, -2);
            bVar.setMargins(0, com.avito.android.actions_sheet.a.d(view, R.dimen.str_booking_info_disclaimer_top_margin), 0, 0);
            textView.setLayoutParams(bVar);
            linearLayout.addView(textView);
        }
    }

    @Override // com.avito.android.str_booking.ui.info.j
    public final void uG(@Y61.k Y41.l lVar, @l List list) {
        UniversalColor tint;
        String value;
        int i12 = O2.a(list) ? 0 : 8;
        LinearLayout linearLayout = this.f286068i;
        linearLayout.setVisibility(i12);
        linearLayout.removeAllViews();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InfoPlaque infoPlaque = (InfoPlaque) it.next();
                View viewInflate = ((LayoutInflater) this.f286070k.getValue()).inflate(R.layout.str_booking_plaque, (ViewGroup) linearLayout, false);
                View viewFindViewById = viewInflate.findViewById(R.id.plaque_icon_container);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
                FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(R.id.plaque_icon);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById2;
                View viewFindViewById3 = viewInflate.findViewById(R.id.plaque_text);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView2 = (TextView) viewFindViewById3;
                View viewFindViewById4 = viewInflate.findViewById(R.id.chevron);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView = (ImageView) viewFindViewById4;
                frameLayout.setVisibility(infoPlaque.getIcon() != null ? 0 : 8);
                Context context = viewInflate.getContext();
                PlaqueIcon icon = infoPlaque.getIcon();
                frameLayout.setBackgroundTintList(C48065c.a(context, icon != null ? icon.getBackgroundColor() : null, R.attr.transparentBlack));
                viewInflate.setBackgroundTintList(C48065c.a(viewInflate.getContext(), infoPlaque.getBackgroundColor(), R.attr.transparentBlack));
                PlaqueIcon icon2 = infoPlaque.getIcon();
                FV.a.a(FV.a.f4720a, textView, (icon2 == null || (value = icon2.getValue()) == null) ? null : com.avito.android.lib.util.f.m(value));
                PlaqueIcon icon3 = infoPlaque.getIcon();
                if (icon3 != null && (tint = icon3.getTint()) != null) {
                    textView.setTextColor(C48063a.f437606a.a(viewInflate.getContext(), tint));
                }
                com.avito.android.util.text.j.a(textView2, infoPlaque.getContent(), null);
                textView2.setVisibility(infoPlaque.getContent() != null ? 0 : 8);
                PlaqueAction action = infoPlaque.getAction();
                imageView.setVisibility((action != null ? action.getDeepLink() : null) != null ? 0 : 8);
                viewInflate.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(21, lVar, (Parcelable) infoPlaque));
                linearLayout.addView(viewInflate);
            }
        }
    }
}
