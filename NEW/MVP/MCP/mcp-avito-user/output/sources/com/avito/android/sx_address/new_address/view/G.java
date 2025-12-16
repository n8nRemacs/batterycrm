package com.avito.android.sx_address.new_address.view;

import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.text.selection.C21030p;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.sx_address.new_address.domain.WeekDay;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WorkingDayView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/G;", "Lcom/avito/android/sx_address/new_address/view/E;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class G implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f293869a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WeekDay f293870b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Switcher f293871c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f293872d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f293873e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f293874f;

    public G(@Y61.k View view, @Y61.k WeekDay weekDay) {
        this.f293869a = view;
        this.f293870b = weekDay;
        View viewFindViewById = view.findViewById(R.id.day_switcher);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f293871c = (Switcher) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.day_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293872d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.day_start_time);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f293873e = (Input) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.day_end_time);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f293874f = (Input) viewFindViewById4;
    }

    public static String a(long j12) {
        return j12 < 10 ? C21030p.a(j12, "0") : String.valueOf(j12);
    }
}
