package com.avito.android.date_time_formatter;

import com.avito.android.util.InterfaceC35945t1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimpleDateFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/date_time_formatter/r;", "Lcom/avito/android/util/t1;", "", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements InterfaceC35945t1<Long> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132588a;

    public r(@Y61.k String str, @Y61.k Locale locale, @Y61.k com.avito.android.server_time.h hVar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(hVar.getF274002b());
        this.f132588a = simpleDateFormat;
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(Long l12) {
        Long l13 = l12;
        String str = l13 != null ? this.f132588a.format(new Date(l13.longValue())) : null;
        return str == null ? "" : str;
    }
}
