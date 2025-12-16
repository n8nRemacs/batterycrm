package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.u;
import com.google.gson.internal.z;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final r f362031b = new r() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f362032a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f362032a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (u.f362168a >= 9) {
            arrayList.add(z.a(2, 2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Date read(com.google.gson.stream.a aVar) {
        Date dateB;
        if (aVar.F() == JsonToken.f362204j) {
            aVar.z();
            return null;
        }
        String strB = aVar.B();
        synchronized (this.f362032a) {
            try {
                Iterator it = this.f362032a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = GZ0.a.b(strB, new ParsePosition(0));
                            break;
                        } catch (ParseException e12) {
                            StringBuilder sbA = androidx.appcompat.app.r.A("Failed parsing '", strB, "' as Date; at path ");
                            sbA.append(aVar.j());
                            throw new JsonSyntaxException(sbA.toString(), e12);
                        }
                    }
                    try {
                        dateB = ((DateFormat) it.next()).parse(strB);
                    } catch (ParseException unused) {
                    }
                }
            } finally {
            }
        }
        return dateB;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Date date) throws IOException {
        String str;
        Date date2 = date;
        if (date2 == null) {
            cVar.j();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f362032a.get(0);
        synchronized (this.f362032a) {
            str = dateFormat.format(date2);
        }
        cVar.q(str);
    }
}
