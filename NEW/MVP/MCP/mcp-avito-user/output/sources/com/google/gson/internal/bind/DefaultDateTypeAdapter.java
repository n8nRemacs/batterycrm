package com.google.gson.internal.bind;

import androidx.appcompat.app.r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.u;
import com.google.gson.internal.z;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f362033a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f362034b;

    public DefaultDateTypeAdapter() {
        throw null;
    }

    public DefaultDateTypeAdapter(b bVar, String str, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f362034b = arrayList;
        bVar.getClass();
        this.f362033a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(com.google.gson.stream.a aVar) {
        Date dateB;
        if (aVar.F() == JsonToken.f362204j) {
            aVar.z();
            return null;
        }
        String strB = aVar.B();
        synchronized (this.f362034b) {
            try {
                Iterator it = this.f362034b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = GZ0.a.b(strB, new ParsePosition(0));
                            break;
                        } catch (ParseException e12) {
                            StringBuilder sbA = r.A("Failed parsing '", strB, "' as Date; at path ");
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
        return this.f362033a.b(dateB);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f362034b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            cVar.j();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f362034b.get(0);
        synchronized (this.f362034b) {
            str = dateFormat.format(date);
        }
        cVar.q(str);
    }

    public DefaultDateTypeAdapter(b bVar, int i12, a aVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        this.f362034b = arrayList;
        bVar.getClass();
        this.f362033a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i12, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i12));
        }
        if (u.f362168a >= 9) {
            if (i12 == 0) {
                str = "EEEE, MMMM d, y";
            } else if (i12 == 1) {
                str = "MMMM d, y";
            } else if (i12 == 2) {
                str = "MMM d, y";
            } else if (i12 == 3) {
                str = "M/d/yy";
            } else {
                throw new IllegalArgumentException(AK.c.g(i12, "Unknown DateFormat style: "));
            }
            arrayList.add(new SimpleDateFormat(str, locale));
        }
    }

    public static abstract class b<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final b<Date> f362035b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f362036a;

        public b(Class<T> cls) {
            this.f362036a = cls;
        }

        public final com.google.gson.r a(int i12, int i13) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i12, i13, null);
            com.google.gson.r rVar = TypeAdapters.f362078a;
            return new TypeAdapters.AnonymousClass31(this.f362036a, defaultDateTypeAdapter);
        }

        public abstract T b(Date date);

        public class a extends b<Date> {
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            public final Date b(Date date) {
                return date;
            }
        }
    }

    public DefaultDateTypeAdapter(b bVar, int i12, int i13, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f362034b = arrayList;
        bVar.getClass();
        this.f362033a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i12, i13, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i12, i13));
        }
        if (u.f362168a >= 9) {
            arrayList.add(z.a(i12, i13));
        }
    }
}
