package com.avito.android.util;

import android.annotation.SuppressLint;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: DayAndMonthDateFormatter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/H0;", "Lcom/avito/android/util/t1;", "", "<init>", "()V", "_common_formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H0 implements InterfaceC35945t1<Long> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"SimpleDateFormat"})
    public final SimpleDateFormat f318617a;

    public H0() {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setMonths(new String[]{"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"});
        this.f318617a = new SimpleDateFormat("d MMMM", dateFormatSymbols);
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(Long l12) {
        Long l13 = l12;
        String str = l13 != null ? this.f318617a.format(new Date(l13.longValue())) : null;
        return str == null ? "" : str;
    }
}
