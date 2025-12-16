package com.avito.android.service_booking_calendar.view.day;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.view.day.DayItemContent;
import com.avito.android.service_booking_calendar.view.day.d;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: CalendarCellViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/j;", "Lcom/avito/android/service_booking_calendar/view/day/i;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f276196g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f276197b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f276198c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f276199d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f276200e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f276201f;

    /* compiled from: CalendarCellViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f276202a;

        static {
            int[] iArr = new int[DayItemContent.HighlightType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DayItemContent.HighlightType highlightType = DayItemContent.HighlightType.f276182b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DayItemContent.EventType.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DayItemContent.EventType eventType = DayItemContent.EventType.f276176b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DayItemContent.EventType eventType2 = DayItemContent.EventType.f276176b;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DayItemContent.EventType eventType3 = DayItemContent.EventType.f276176b;
                iArr2[0] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[DayItemContent.DayType.values().length];
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            f276202a = iArr3;
        }
    }

    public j(@Y61.k View view) {
        super(view);
        this.f276197b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276198c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.day_group);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276199d = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text_background);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276200e = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.dot);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276201f = viewFindViewById4;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.i
    public final void OT(@Y61.k Y41.a<G0> aVar) {
        this.f276200e.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(26, aVar));
    }

    @Override // com.avito.android.service_booking_calendar.view.day.i
    public final void lI(@Y61.k d dVar) {
        boolean z12 = dVar instanceof d.a;
        View view = this.f276199d;
        if (!z12) {
            if (dVar instanceof d.c) {
                D6.w(view);
                return;
            }
            return;
        }
        D6.H(view);
        DayItemContent dayItemContent = ((d.a) dVar).f276190c;
        String f276203a = dayItemContent.getF277635a();
        TextView textView = this.f276198c;
        textView.setText(f276203a);
        View view2 = this.f276197b;
        Context context = view2.getContext();
        int i12 = a.f276202a[dayItemContent.getF277637c().ordinal()];
        int i13 = R.attr.black;
        textView.setTextColor(C35835l0.d(i12 == 1 ? R.attr.gray36 : R.attr.black, context));
        Context context2 = view2.getContext();
        int iOrdinal = dayItemContent.getF277636b().ordinal();
        if (iOrdinal == 0) {
            i13 = R.attr.transparentWhite;
        } else if (iOrdinal == 1) {
            i13 = R.attr.gray36;
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.attr.orange800;
        }
        this.f276201f.setBackgroundTintList(C35835l0.e(i13, context2));
        int iOrdinal2 = dayItemContent.getF277638d().ordinal();
        View view3 = this.f276200e;
        if (iOrdinal2 == 0) {
            view3.setBackground(C43852a.a(view2.getContext(), R.drawable.day_border));
        } else {
            if (iOrdinal2 != 1) {
                return;
            }
            view3.setBackground(null);
        }
    }
}
