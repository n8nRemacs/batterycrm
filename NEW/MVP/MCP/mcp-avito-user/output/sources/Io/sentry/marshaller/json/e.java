package io.sentry.marshaller.json;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.FiltersBackNavigationSlot;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import io.sentry.event.Breadcrumb;
import io.sentry.event.Event;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;
import oX0.AbstractC44703c;
import y41.InterfaceC50060f;
import z41.InterfaceC50373a;

/* compiled from: JsonMarshaller.java */
/* loaded from: classes8.dex */
public class e implements InterfaceC50373a {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<DateFormat> f405210e = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final org.slf4j.a f405211f = org.slf4j.b.d(e.class);

    /* renamed from: a, reason: collision with root package name */
    public final JsonFactory f405212a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f405213b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f405214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f405215d;

    /* compiled from: JsonMarshaller.java */
    public static class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    /* compiled from: JsonMarshaller.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f405216a;

        static {
            int[] iArr = new int[Event.Level.values().length];
            f405216a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f405216a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f405216a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f405216a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f405216a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public e() {
        this(1000);
    }

    public final <T extends InterfaceC50060f, F extends T> void a(Class<F> cls, d<T> dVar) {
        this.f405213b.put(cls, dVar);
    }

    public final g b(OutputStream outputStream) {
        JsonGenerator jsonGeneratorC = this.f405212a.c(outputStream);
        g gVar = new g();
        gVar.f405223g = (AbstractC44703c) jsonGeneratorC;
        gVar.f405219c = 10;
        gVar.f405220d = Constants.MINIMAL_ERROR_STATUS_CODE;
        gVar.f405221e = 50;
        gVar.f405222f = 3;
        return gVar;
    }

    public final String c() {
        if (this.f405214c) {
            return "gzip";
        }
        return null;
    }

    public final void d(Event event, OutputStream outputStream) throws IOException {
        g gVarB;
        org.slf4j.a aVar = f405211f;
        OutputStream c12943a = new InterfaceC50373a.C12943a(outputStream);
        if (this.f405214c) {
            c12943a = new GZIPOutputStream(c12943a);
        }
        try {
            try {
                try {
                    gVarB = b(c12943a);
                } catch (IOException e12) {
                    aVar.l("An exception occurred while serialising the event.", e12);
                    c12943a.close();
                }
                try {
                    e(gVarB, event);
                    gVarB.close();
                    c12943a.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            gVarB.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c12943a.close();
                } catch (IOException e13) {
                    aVar.l("An exception occurred while serialising the event.", e13);
                }
                throw th5;
            }
        } catch (IOException e14) {
            aVar.l("An exception occurred while serialising the event.", e14);
        }
    }

    public final void e(g gVar, Event event) {
        String str;
        gVar.e0();
        gVar.k0("event_id", event.f405166b.toString().replaceAll("-", ""));
        gVar.k0("message", io.sentry.util.b.d(this.f405215d, event.f405167c));
        DateFormat dateFormat = f405210e.get();
        Date date = event.f405168d;
        gVar.k0("timestamp", dateFormat.format(date != null ? (Date) date.clone() : null));
        Event.Level level = event.f405169e;
        org.slf4j.a aVar = f405211f;
        if (level != null) {
            int iOrdinal = level.ordinal();
            if (iOrdinal == 0) {
                str = "fatal";
            } else if (iOrdinal == 1) {
                str = "error";
            } else if (iOrdinal == 2) {
                str = ConstraintKt.WARNING;
            } else if (iOrdinal == 3) {
                str = RequestReviewResultKt.INFO_TYPE;
            } else if (iOrdinal != 4) {
                aVar.b(level.name());
                str = null;
            } else {
                str = "debug";
            }
        } else {
            str = null;
        }
        gVar.k0("level", str);
        gVar.k0("logger", event.f405170f);
        gVar.k0("platform", event.f405171g);
        gVar.k0("culprit", null);
        gVar.k0("transaction", null);
        io.sentry.event.d dVar = event.f405172h;
        gVar.R("sdk");
        gVar.k0("name", dVar.f405199b);
        gVar.k0("version", dVar.f405200c);
        HashSet hashSet = dVar.f405201d;
        if (hashSet != null && !hashSet.isEmpty()) {
            gVar.q("integrations");
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                gVar.i0((String) it.next());
            }
            gVar.A();
        }
        gVar.B();
        Map<String, String> map = event.f405173i;
        gVar.R("tags");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            gVar.k0(entry.getKey(), entry.getValue());
        }
        gVar.B();
        List<Breadcrumb> list = event.f405174j;
        if (!list.isEmpty()) {
            gVar.R(FiltersBackNavigationSlot.TYPE);
            gVar.q("values");
            for (Breadcrumb breadcrumb : list) {
                gVar.e0();
                long time = breadcrumb.f405161b.getTime() / 1000;
                gVar.G("timestamp");
                gVar.M(time);
                String str2 = breadcrumb.f405162c;
                if (str2 != null) {
                    gVar.k0("message", str2);
                }
                gVar.B();
            }
            gVar.A();
            gVar.B();
        }
        Map<String, Map<String, Object>> map2 = event.f405175k;
        if (!map2.isEmpty()) {
            gVar.R("contexts");
            for (Map.Entry<String, Map<String, Object>> entry2 : map2.entrySet()) {
                gVar.R(entry2.getKey());
                for (Map.Entry<String, Object> entry3 : entry2.getValue().entrySet()) {
                    String key = entry3.getKey();
                    Object value = entry3.getValue();
                    gVar.G(key);
                    gVar.writeObject(value);
                }
                gVar.B();
            }
            gVar.B();
        }
        gVar.k0("server_name", event.f405179o);
        gVar.k0("release", event.f405176l);
        gVar.k0("dist", event.f405177m);
        gVar.k0("environment", event.f405178n);
        Map<String, Object> mapA = event.a();
        gVar.R("extra");
        for (Map.Entry<String, Object> entry4 : mapA.entrySet()) {
            gVar.G(entry4.getKey());
            gVar.n0(0, entry4.getValue());
        }
        gVar.B();
        gVar.k0("checksum", null);
        for (Map.Entry<String, InterfaceC50060f> entry5 : event.f405181q.entrySet()) {
            InterfaceC50060f value2 = entry5.getValue();
            HashMap map3 = this.f405213b;
            if (map3.containsKey(value2.getClass())) {
                gVar.G(entry5.getKey());
                ((d) map3.get(value2.getClass())).a(gVar, entry5.getValue());
            } else {
                aVar.d("Couldn't parse the content of '{}' provided in {}.", entry5.getKey(), value2);
            }
        }
        gVar.B();
    }

    public e(int i12) {
        this.f405212a = new JsonFactory();
        this.f405213b = new HashMap();
        this.f405214c = true;
        this.f405215d = i12;
    }
}
