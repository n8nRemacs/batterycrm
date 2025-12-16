package com.avito.android.remote.parse.adapter.date;

import Y61.k;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: CalendarDateTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/date/CalendarDateTypeAdapter;", "Lcom/google/gson/h;", "Ljava/util/Date;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CalendarDateTypeAdapter implements h<Date> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SimpleDateFormat f254264a = new SimpleDateFormat("dd.MM.yyyy", Locale.US);

    @Override // com.google.gson.h
    public final Date deserialize(i iVar, Type type, g gVar) throws ParseException {
        Date date = this.f254264a.parse(iVar.s());
        if (date != null) {
            return date;
        }
        throw new RuntimeException("Error parse date");
    }
}
