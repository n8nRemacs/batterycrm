package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign;

import Sz0.InterfaceC15275d;
import Uz0.b;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.CalendarDayRedesignItem;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.e;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: CalendarDayRedesignPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/g;", "LTV0/f;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/f;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/CalendarDayRedesignItem;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements TV0.f<f, CalendarDayRedesignItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Uz0.b, G0> f290871b;

    /* compiled from: CalendarDayRedesignPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CalendarDayRedesignItem.CellType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalendarDayRedesignItem.CellType cellType = CalendarDayRedesignItem.CellType.f290829b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CalendarDayRedesignItem.CellType cellType2 = CalendarDayRedesignItem.CellType.f290829b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CalendarDayRedesignItem.CellType cellType3 = CalendarDayRedesignItem.CellType.f290829b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: CalendarDayRedesignPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15275d.a f290872l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f290873m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC15275d.a aVar, g gVar) {
            super(0);
            this.f290872l = aVar;
            this.f290873m = gVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f290872l.f15255b;
            if (deepLink != null) {
                this.f290873m.f290871b.invoke(new b.u(deepLink));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CalendarDayRedesignPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15275d.C1043d f290874l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f290875m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC15275d.C1043d c1043d, g gVar) {
            super(0);
            this.f290874l = c1043d;
            this.f290875m = gVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f290874l.f15265g;
            if (deepLink != null) {
                this.f290875m.f290871b.invoke(new b.u(deepLink));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super Uz0.b, G0> lVar) {
        this.f290871b = lVar;
    }

    public static void Y(f fVar, CalendarDayRedesignItem calendarDayRedesignItem, boolean z12) {
        if (z12) {
            D6.H(fVar.f290857d);
            D6.H(fVar.f290858e);
            D6.H(fVar.f290860g);
            Context context = fVar.itemView.getContext();
            com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a aVar = fVar.f290855b;
            if (aVar.f290837c == null) {
                aVar.f290837c = androidx.core.content.d.getDrawable(context, R.drawable.calendar_day_item_selected_background);
            }
            fVar.f290856c.setBackground(aVar.f290837c);
        } else {
            D6.H(fVar.f290857d);
            D6.H(fVar.f290858e);
            D6.H(fVar.f290860g);
            View view = fVar.itemView;
            Context context2 = view.getContext();
            com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a aVar2 = fVar.f290855b;
            if (aVar2.f290835a == null) {
                aVar2.f290835a = androidx.core.content.d.getDrawable(context2, R.drawable.calendar_day_item_background);
            }
            view.setBackground(aVar2.f290835a);
        }
        boolean z13 = calendarDayRedesignItem.f290826j;
        PrintableText printableText = calendarDayRedesignItem.f290820d;
        if (z13) {
            fVar.F80(printableText, true);
            fVar.f290858e.setText((CharSequence) null);
            fVar.B80(null);
            fVar.f290861h.setText("");
            return;
        }
        fVar.F80(printableText, false);
        PrintableText printableText2 = calendarDayRedesignItem.f290821e;
        TextView textView = fVar.f290858e;
        textView.setText(printableText2 != null ? printableText2.k0(textView.getContext()) : null);
        fVar.B80(calendarDayRedesignItem.f290825i);
        TextView textView2 = fVar.f290861h;
        textView2.setText("");
        if (calendarDayRedesignItem.f290822f) {
            FV.a.k(FV.a.f4720a, textView2, R.attr.textIconFlashFilled);
        }
        if (calendarDayRedesignItem.f290823g) {
            FV.a.k(FV.a.f4720a, textView2, R.attr.textIconFireFilled);
        }
        if (calendarDayRedesignItem.f290824h) {
            FV.a.k(FV.a.f4720a, textView2, R.attr.textIconVasFilled);
        }
    }

    public final void O(f fVar, InterfaceC15275d.C1043d c1043d) {
        UniversalColor universalColor = c1043d.f15259a;
        c cVar = new c(c1043d, this);
        D6.H(fVar.f290864k);
        D6.H(fVar.f290863j);
        int i12 = c1043d.f15262d ? R.attr.white : R.attr.black;
        TextView textView = fVar.f290865l;
        I5.a(textView, c1043d.f15260b, false);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        int i13 = c1043d.f15264f;
        layoutParams.width = fVar.G80(i13);
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(C35835l0.d(i12, textView.getContext()));
        TextView textView2 = fVar.f290866m;
        I5.a(textView2, c1043d.f15261c, false);
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        layoutParams2.width = fVar.G80(i13);
        textView2.setLayoutParams(layoutParams2);
        textView2.setTextColor(C35835l0.d(i12, textView2.getContext()));
        ColorStateList colorStateListA = C48065c.a(fVar.itemView.getContext(), universalColor, f.f290854r);
        View view = fVar.f290867n;
        view.setBackgroundTintList(colorStateListA);
        view.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(21, cVar));
        boolean z12 = c1043d.f15263e;
        TextView textView3 = fVar.f290868o;
        if (!z12) {
            D6.w(textView3);
            return;
        }
        D6.H(textView3);
        textView3.setText("");
        ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
        layoutParams3.width = fVar.C80(R.dimen.str_calendar_notification_collapsed_size);
        layoutParams3.height = fVar.C80(R.dimen.str_calendar_notification_collapsed_size);
        textView3.setLayoutParams(layoutParams3);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        V((f) eVar, (CalendarDayRedesignItem) aVar);
    }

    public final void V(@k f fVar, @k CalendarDayRedesignItem calendarDayRedesignItem) {
        int iOrdinal = calendarDayRedesignItem.f290828l.ordinal();
        if (iOrdinal == 0) {
            Y(fVar, calendarDayRedesignItem, false);
        } else if (iOrdinal == 1) {
            fVar.E80();
        } else if (iOrdinal == 2) {
            Y(fVar, calendarDayRedesignItem, true);
        } else if (iOrdinal == 3) {
            fVar.D80();
        }
        fVar.f290856c.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(20, new i(this, calendarDayRedesignItem)));
        InterfaceC15275d interfaceC15275d = calendarDayRedesignItem.f290827k;
        boolean z12 = interfaceC15275d instanceof InterfaceC15275d.c;
        View view = fVar.f290864k;
        View view2 = fVar.f290870q;
        View view3 = fVar.f290869p;
        View view4 = fVar.f290859f;
        View view5 = fVar.f290863j;
        if (z12) {
            D6.H(view4);
            D6.w(view5);
            D6.w(view2);
            D6.w(view3);
            D6.w(view);
            return;
        }
        if (interfaceC15275d instanceof InterfaceC15275d.C1043d) {
            D6.w(view4);
            D6.w(view2);
            D6.w(view3);
            O(fVar, (InterfaceC15275d.C1043d) interfaceC15275d);
            return;
        }
        if (interfaceC15275d instanceof InterfaceC15275d.b) {
            D6.w(view4);
            D6.w(view2);
            InterfaceC15275d.b bVar = (InterfaceC15275d.b) interfaceC15275d;
            UniversalColor universalColor = bVar.f15256a;
            h hVar = new h(bVar, this);
            D6.H(view3);
            D6.H(view5);
            view3.setBackgroundTintList(C48065c.a(fVar.itemView.getContext(), universalColor, f.f290854r));
            view3.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(22, hVar));
            D6.w(view);
            return;
        }
        if (interfaceC15275d instanceof InterfaceC15275d.a) {
            D6.w(view4);
            k(fVar, (InterfaceC15275d.a) interfaceC15275d);
            D6.w(view3);
            D6.w(view);
            return;
        }
        if (interfaceC15275d instanceof InterfaceC15275d.e) {
            D6.w(view4);
            InterfaceC15275d.e eVar = (InterfaceC15275d.e) interfaceC15275d;
            k(fVar, eVar.f15267b);
            D6.w(view3);
            O(fVar, eVar.f15266a);
        }
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        CalendarDayRedesignItem calendarDayRedesignItem = (CalendarDayRedesignItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<e> list2 = (List) obj;
        List list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            V(fVar, calendarDayRedesignItem);
            return;
        }
        for (e eVar2 : list2) {
            boolean z12 = eVar2 instanceof e.c;
            CalendarDayRedesignItem.CellType cellType = calendarDayRedesignItem.f290828l;
            if (z12) {
                if (!cellType.a()) {
                    fVar.F80(((e.c) eVar2).f290851a, calendarDayRedesignItem.f290826j);
                }
            } else if (eVar2 instanceof e.C8799e) {
                if (!cellType.a()) {
                    PrintableText printableText = ((e.C8799e) eVar2).f290853a;
                    TextView textView = fVar.f290858e;
                    textView.setText(printableText != null ? printableText.k0(textView.getContext()) : null);
                }
            } else if (eVar2 instanceof e.a) {
                int iOrdinal = cellType.ordinal();
                if (iOrdinal == 0) {
                    Y(fVar, calendarDayRedesignItem, false);
                } else if (iOrdinal == 1) {
                    fVar.E80();
                } else if (iOrdinal == 2) {
                    Y(fVar, calendarDayRedesignItem, true);
                } else if (iOrdinal == 3) {
                    fVar.D80();
                }
            } else if (eVar2 instanceof e.b) {
                if (!cellType.a()) {
                    fVar.f290861h.setText("");
                    TextView textView2 = fVar.f290861h;
                    if (calendarDayRedesignItem.f290822f) {
                        FV.a.k(FV.a.f4720a, textView2, R.attr.textIconFlashFilled);
                    }
                    if (calendarDayRedesignItem.f290823g) {
                        FV.a.k(FV.a.f4720a, textView2, R.attr.textIconFireFilled);
                    }
                    if (calendarDayRedesignItem.f290824h) {
                        FV.a.k(FV.a.f4720a, textView2, R.attr.textIconVasFilled);
                    }
                }
            } else if ((eVar2 instanceof e.d) && !cellType.a()) {
                fVar.B80(((e.d) eVar2).f290852a);
            }
        }
    }

    public final void k(f fVar, InterfaceC15275d.a aVar) {
        UniversalColor universalColor = aVar.f15254a;
        b bVar = new b(aVar, this);
        View view = fVar.f290870q;
        D6.H(view);
        D6.H(fVar.f290863j);
        view.setBackgroundTintList(C48065c.a(fVar.itemView.getContext(), universalColor, f.f290854r));
        view.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(23, bVar));
    }
}
