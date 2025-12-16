package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import j.InterfaceC42161q;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarDayRedesignItemView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/f;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: r, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f290854r;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a f290855b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f290856c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f290857d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f290858e;

    /* renamed from: f, reason: collision with root package name */
    public final View f290859f;

    /* renamed from: g, reason: collision with root package name */
    public final View f290860g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f290861h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f290862i;

    /* renamed from: j, reason: collision with root package name */
    public final View f290863j;

    /* renamed from: k, reason: collision with root package name */
    public final View f290864k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f290865l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f290866m;

    /* renamed from: n, reason: collision with root package name */
    public final View f290867n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f290868o;

    /* renamed from: p, reason: collision with root package name */
    public final View f290869p;

    /* renamed from: q, reason: collision with root package name */
    public final View f290870q;

    /* compiled from: CalendarDayRedesignItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/f$a;", "", "<init>", "()V", "", "DEF_COLOR_ATTR", "I", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f290854r = R.attr.blue100;
    }

    public f(@k View view, @k com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a aVar) {
        super(view);
        this.f290855b = aVar;
        View viewFindViewById = this.itemView.findViewById(R.id.day_item_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f290856c = viewFindViewById;
        this.f290857d = (TextView) this.itemView.findViewById(R.id.main_tv);
        this.f290858e = (TextView) this.itemView.findViewById(R.id.secondary_tv);
        this.f290859f = this.itemView.findViewById(R.id.content_group);
        this.f290860g = this.itemView.findViewById(R.id.footer_container);
        this.f290861h = (TextView) this.itemView.findViewById(R.id.features_tv);
        this.f290862i = (TextView) this.itemView.findViewById(R.id.min_nights_tv);
        this.f290863j = this.itemView.findViewById(R.id.tag_group);
        this.f290864k = this.itemView.findViewById(R.id.tag_start_group);
        this.f290865l = (TextView) this.itemView.findViewById(R.id.tag_start_title_tv);
        this.f290866m = (TextView) this.itemView.findViewById(R.id.tag_start_subtitle_tv);
        this.f290867n = this.itemView.findViewById(R.id.tag_start_view);
        this.f290868o = (TextView) this.itemView.findViewById(R.id.indicator_tv);
        this.f290869p = this.itemView.findViewById(R.id.tag_middle_view);
        this.f290870q = this.itemView.findViewById(R.id.tag_end_view);
    }

    public final void B80(@l Integer num) {
        TextView textView = this.f290862i;
        if (num == null) {
            D6.w(textView);
            return;
        }
        I5.a(textView, num.toString(), false);
        FV.a.k(FV.a.f4720a, textView, R.attr.textIconMoonFilled);
        D6.H(textView);
    }

    public final int C80(@InterfaceC42161q int i12) throws Resources.NotFoundException {
        Context context = this.itemView.getContext();
        LinkedHashMap linkedHashMap = this.f290855b.f290839e;
        Object objValueOf = linkedHashMap.get(Integer.valueOf(i12));
        if (objValueOf == null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i12);
            linkedHashMap.put(Integer.valueOf(i12), Integer.valueOf(dimensionPixelSize));
            objValueOf = Integer.valueOf(dimensionPixelSize);
        }
        return ((Number) objValueOf).intValue();
    }

    public final void D80() {
        D6.w(this.f290857d);
        D6.w(this.f290858e);
        D6.w(this.f290860g);
        Context context = this.itemView.getContext();
        com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a aVar = this.f290855b;
        if (aVar.f290838d == null) {
            aVar.f290838d = androidx.core.content.d.getDrawable(context, R.drawable.calendar_day_unavailable_selected_bg);
        }
        this.f290856c.setBackground(aVar.f290838d);
    }

    public final void E80() {
        D6.w(this.f290857d);
        D6.w(this.f290858e);
        D6.w(this.f290860g);
        View view = this.itemView;
        Context context = view.getContext();
        com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a aVar = this.f290855b;
        if (aVar.f290836b == null) {
            aVar.f290836b = androidx.core.content.d.getDrawable(context, R.drawable.calendar_day_unavailable_bg);
        }
        view.setBackground(aVar.f290836b);
    }

    public final void F80(@l PrintableText printableText, boolean z12) {
        TextView textView = this.f290857d;
        textView.setText(printableText != null ? printableText.k0(textView.getContext()) : null);
        textView.setTextColor(z12 ? C35835l0.d(R.attr.gray20, textView.getContext()) : C35835l0.d(R.attr.black, textView.getContext()));
    }

    public final int G80(int i12) throws Resources.NotFoundException {
        int iC80 = C80(R.dimen.str_calendar_tag_end_width_redesign) + C80(R.dimen.str_calendar_tag_start_width_redesign);
        int i13 = i12 - 2;
        for (int i14 = 0; i14 < i13; i14++) {
            iC80 += C80(R.dimen.str_calendar_tag_middle_width_redesign);
        }
        return iC80 - (C80(R.dimen.str_calendar_tag_radius_redesign) * 2);
    }
}
