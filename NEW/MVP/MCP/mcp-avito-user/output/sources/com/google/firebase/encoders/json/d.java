package com.google.firebase.encoders.json;

import com.google.firebase.encoders.g;
import j.N;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import sZ0.InterfaceC48138b;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes6.dex */
public final class d implements InterfaceC48138b<d> {

    /* renamed from: f, reason: collision with root package name */
    public static final c f361550f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f361551g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f361553a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f361554b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.firebase.encoders.json.b f361555c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f361556d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.firebase.encoders.json.b f361549e = new com.google.firebase.encoders.json.b();

    /* renamed from: h, reason: collision with root package name */
    public static final b f361552h = new b(null);

    /* compiled from: JsonDataEncoderBuilder.java */
    public class a implements com.google.firebase.encoders.a {
        public a() {
        }

        @Override // com.google.firebase.encoders.a
        public final String a(@N Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(stringWriter, obj);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // com.google.firebase.encoders.a
        public final void b(@N Writer writer, @N Object obj) throws IOException {
            d dVar = d.this;
            e eVar = new e(writer, dVar.f361553a, dVar.f361554b, dVar.f361555c, dVar.f361556d);
            eVar.a(obj);
            eVar.c();
            eVar.f361560b.flush();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    public static final class b implements com.google.firebase.encoders.f<Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f361558a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f361558a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // com.google.firebase.encoders.f
        public final void encode(@N Object obj, @N Object obj2) {
            ((g) obj2).add(f361558a.format((Date) obj));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.firebase.encoders.json.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.encoders.json.c] */
    static {
        final int i12 = 0;
        f361550f = new com.google.firebase.encoders.f() { // from class: com.google.firebase.encoders.json.c
            @Override // com.google.firebase.encoders.f
            public final void encode(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        b bVar = d.f361549e;
                        ((g) obj2).add((String) obj);
                        break;
                    default:
                        b bVar2 = d.f361549e;
                        ((g) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i13 = 1;
        f361551g = new com.google.firebase.encoders.f() { // from class: com.google.firebase.encoders.json.c
            @Override // com.google.firebase.encoders.f
            public final void encode(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        b bVar = d.f361549e;
                        ((g) obj2).add((String) obj);
                        break;
                    default:
                        b bVar2 = d.f361549e;
                        ((g) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f361553a = map;
        HashMap map2 = new HashMap();
        this.f361554b = map2;
        this.f361555c = f361549e;
        this.f361556d = false;
        map2.put(String.class, f361550f);
        map.remove(String.class);
        map2.put(Boolean.class, f361551g);
        map.remove(Boolean.class);
        map2.put(Date.class, f361552h);
        map.remove(Date.class);
    }

    @N
    public final com.google.firebase.encoders.a a() {
        return new a();
    }

    @Override // sZ0.InterfaceC48138b
    @N
    public final InterfaceC48138b registerEncoder(@N Class cls, @N com.google.firebase.encoders.d dVar) {
        this.f361553a.put(cls, dVar);
        this.f361554b.remove(cls);
        return this;
    }
}
