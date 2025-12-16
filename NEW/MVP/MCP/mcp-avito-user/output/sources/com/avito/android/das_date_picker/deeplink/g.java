package com.avito.android.das_date_picker.deeplink;

import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCardDatePickerLinkParser.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_das-date-picker_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f132262a = C42727D.c(a.f132263l);

    /* compiled from: TariffCardDatePickerLinkParser.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SimpleDateFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f132263l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, Locale.getDefault());
        }
    }
}
