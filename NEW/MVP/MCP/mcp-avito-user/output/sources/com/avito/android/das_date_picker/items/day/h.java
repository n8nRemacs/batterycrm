package com.avito.android.das_date_picker.items.day;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.das_date_picker.model.Position;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DasCalendarDayItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/items/day/h;", "Lcom/avito/android/das_date_picker/items/day/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f132329d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f132330b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f132331c;

    /* compiled from: DasCalendarDayItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DasCalendarDayState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DasCalendarDayState dasCalendarDayState = DasCalendarDayState.f132310b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DasCalendarDayState dasCalendarDayState2 = DasCalendarDayState.f132310b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(@k View view) {
        super(view);
        this.f132330b = view.findViewById(R.id.background_view);
        this.f132331c = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.das_date_picker.items.day.g
    public final void Ix(@k DasCalendarDayState dasCalendarDayState) {
        int iOrdinal = dasCalendarDayState.ordinal();
        TextView textView = this.f132331c;
        View view = this.f132330b;
        if (iOrdinal == 0) {
            view.setTag(Position.f132356d);
            view.setBackground(null);
            D6.D(textView, R.drawable.das_calendar_ripple);
            textView.setTextColor(C35835l0.d(R.attr.black, textView.getContext()));
            return;
        }
        if (iOrdinal == 1) {
            view.setTag(Position.f132354b);
            D6.D(view, R.drawable.das_calendar_day_unavailable_single);
            textView.setBackground(null);
            textView.setTextColor(C35835l0.d(R.attr.gray36, textView.getContext()));
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        view.setTag(Position.f132354b);
        D6.D(view, R.drawable.das_calendar_day_selected);
        textView.setForeground(null);
        textView.setBackground(null);
        textView.setTextColor(C35835l0.d(R.attr.white, textView.getContext()));
    }

    @Override // com.avito.android.das_date_picker.items.day.g
    public final void V2() {
        this.f132331c.setOnClickListener(null);
    }

    @Override // com.avito.android.das_date_picker.items.day.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f132331c.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(3, aVar));
    }

    @Override // com.avito.android.das_date_picker.items.day.g
    public final void c8(boolean z12) {
        TextView textView = this.f132331c;
        if (z12) {
            textView.setForeground(androidx.core.content.d.getDrawable(textView.getContext(), R.drawable.das_calendar_current_day));
        } else {
            textView.setForeground(null);
        }
    }

    @Override // com.avito.android.das_date_picker.items.day.g
    public final void setText(@k String str) {
        this.f132331c.setText(str);
    }
}
