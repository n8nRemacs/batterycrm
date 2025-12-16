package com.avito.android.service_booking_common.blueprints.date;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.I5;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbDateViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/r;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f276367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Calendar f276368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f276369d;

    public r(s sVar, Calendar calendar, LinkedHashMap linkedHashMap) {
        this.f276367b = sVar;
        this.f276368c = calendar;
        this.f276369d = linkedHashMap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        if (i12 == 0) {
            s sVar = this.f276367b;
            TextView textView = sVar.f276376g;
            String strD80 = sVar.D80(this.f276368c, recyclerView, this.f276369d);
            if (strD80 == null) {
                strD80 = "";
            }
            I5.a(textView, strD80, false);
        }
    }
}
