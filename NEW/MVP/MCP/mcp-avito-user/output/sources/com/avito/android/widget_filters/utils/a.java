package com.avito.android.widget_filters.utils;

import NP0.h;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import kotlin.Metadata;

/* compiled from: DatesPlaceholderTextUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/utils/a;", "", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f330558a = new a();

    @l
    public static String a(@l SelectedDateRange selectedDateRange, @l h hVar) {
        if (hVar == null || selectedDateRange == null) {
            if (selectedDateRange != null) {
                return wy0.b.g(selectedDateRange);
            }
            return null;
        }
        String strG = wy0.b.g(selectedDateRange);
        if (!hVar.f11457c) {
            return strG;
        }
        StringBuilder sbZ = r.z(strG, ", ");
        sbZ.append(hVar.f11456b);
        return sbZ.toString();
    }
}
