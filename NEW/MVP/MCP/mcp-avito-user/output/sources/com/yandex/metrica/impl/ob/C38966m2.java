package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.C39057pi;
import com.yandex.metrica.impl.ob.C39081qi;
import com.yandex.metrica.impl.ob.C39109s;
import com.yandex.metrica.impl.ob.C39185v3;
import com.yandex.metrica.impl.ob.D1;
import com.yandex.metrica.impl.ob.InterfaceC38800fa;
import com.yandex.metrica.impl.ob.Ud;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.m2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38966m2 extends D1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38774e9 f380995a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Context f380996b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38673a8 f380997c;

    /* renamed from: com.yandex.metrica.impl.ob.m2$a */
    public class a extends SparseArray<D1.a> {
        public a() {
            put(29, new j(C38966m2.this.f380996b));
            put(39, new k());
            put(47, new l(C38966m2.this.f380995a));
            put(60, new m(C38966m2.this.f380995a));
            put(62, new n());
            put(66, new o());
            put(67, new g(InterfaceC38800fa.b.a(C39081qi.class).b(C38966m2.this.f380996b), new C38799f9(C38899ja.a(C38966m2.this.f380996b).q(), C38966m2.this.f380996b.getPackageName())));
            put(68, new u());
            put(72, new f(InterfaceC38800fa.b.b(Bd.class).b(C38966m2.this.f380996b), InterfaceC38800fa.b.a(C39081qi.class).b(C38966m2.this.f380996b)));
            put(82, new h(InterfaceC38800fa.b.b(Bd.class).b(C38966m2.this.f380996b), InterfaceC38800fa.b.a(C39147td.class).b(C38966m2.this.f380996b)));
            put(87, new i(InterfaceC38800fa.b.a(C39081qi.class).b(C38966m2.this.f380996b)));
            put(92, new c(InterfaceC38800fa.b.a(C39081qi.class).b(C38966m2.this.f380996b)));
            put(93, new e(C38966m2.this.f380996b, InterfaceC38800fa.b.a(C38779ee.class).b(C38966m2.this.f380996b), InterfaceC38800fa.b.a(Ud.class).b(C38966m2.this.f380996b)));
            put(94, new p(C38966m2.this.f380996b, InterfaceC38800fa.b.a(C39081qi.class).b(C38966m2.this.f380996b)));
            put(98, new t(C38966m2.this.f380995a));
            put(100, new b(new C38799f9(C38899ja.a(C38966m2.this.f380996b).q(), C38966m2.this.f380996b.getPackageName())));
            put(UpdateStatusCode.DialogButton.CONFIRM, new q(C38966m2.this.f380995a, InterfaceC38800fa.b.a(C39081qi.class).b(C38966m2.this.f380996b)));
            put(102, new r(InterfaceC38800fa.b.a(Ud.class).b(C38966m2.this.f380996b)));
            put(103, new d(InterfaceC38800fa.b.a(Z1.class).b(C38966m2.this.f380996b), InterfaceC38800fa.b.a(C39185v3.class).b(C38966m2.this.f380996b), C38966m2.this.f380995a));
            put(104, new s(C38899ja.a(C38966m2.this.f380996b).o()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$b */
    public static class b implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        private final C38799f9 f380999a;

        public b(@j.N C38799f9 c38799f9) {
            this.f380999a = c38799f9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            this.f380999a.f();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$c */
    public static class c implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381000a;

        public c(@j.N ProtobufStateStorage protobufStateStorage) {
            this.f381000a = protobufStateStorage;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            C39081qi c39081qi = (C39081qi) this.f381000a.read();
            this.f381000a.save(c39081qi.a(c39081qi.f381626r).g(c39081qi.f381624p).a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$d */
    public static class d implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381001a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381002b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final C38774e9 f381003c;

        public d(@j.N ProtobufStateStorage protobufStateStorage, @j.N ProtobufStateStorage protobufStateStorage2, @j.N C38774e9 c38774e9) {
            this.f381001a = protobufStateStorage;
            this.f381002b = protobufStateStorage2;
            this.f381003c = c38774e9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            Z1 z12 = (Z1) this.f381001a.read();
            this.f381001a.delete();
            if (z12.f379979b) {
                if (!A2.b(z12.f379978a)) {
                    C39185v3.a aVar = new C39185v3.a(z12.f379978a, EnumC39158u0.SATELLITE);
                    this.f381002b.save(new C39185v3(aVar, Collections.singletonList(aVar)));
                }
                this.f381003c.h();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$e */
    public static class e implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final C38679ae f381004a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381005b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381006c;

        public e(@j.N Context context, @j.N ProtobufStateStorage protobufStateStorage, @j.N ProtobufStateStorage protobufStateStorage2) {
            this(protobufStateStorage, protobufStateStorage2, new C38679ae(context));
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            C38779ee c38779eeInvoke;
            C38779ee c38779ee = (C38779ee) this.f381005b.read();
            ArrayList arrayList = new ArrayList();
            EnumC39158u0 enumC39158u0 = c38779ee.f380485e;
            if (enumC39158u0 != EnumC39158u0.UNDEFINED) {
                arrayList.add(new Ud.a(c38779ee.f380481a, c38779ee.f380482b, enumC39158u0));
            }
            if (c38779ee.f380485e == EnumC39158u0.RETAIL && (c38779eeInvoke = this.f381004a.invoke()) != null) {
                arrayList.add(new Ud.a(c38779eeInvoke.f380481a, c38779eeInvoke.f380482b, c38779eeInvoke.f380485e));
            }
            this.f381006c.save(new Ud(c38779ee, arrayList));
            this.f381005b.delete();
        }

        @j.k0
        public e(@j.N ProtobufStateStorage protobufStateStorage, @j.N ProtobufStateStorage protobufStateStorage2, @j.N C38679ae c38679ae) {
            this.f381005b = protobufStateStorage;
            this.f381006c = protobufStateStorage2;
            this.f381004a = c38679ae;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$f */
    public static class f implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381007a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381008b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final B0 f381009c;

        public f(@j.N ProtobufStateStorage protobufStateStorage, @j.N ProtobufStateStorage protobufStateStorage2) {
            this(protobufStateStorage, protobufStateStorage2, new B0());
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(@j.N Context context) {
            JSONObject jSONObject;
            String strOptString;
            V7 v7H = C38899ja.a(context).h();
            List<Bd> listB = v7H.b();
            if (listB != null) {
                this.f381007a.save(listB);
                v7H.a();
            }
            C39081qi c39081qi = (C39081qi) this.f381008b.read();
            C39081qi.b bVarA = c39081qi.a(c39081qi.f381626r);
            String strOptString2 = null;
            try {
                jSONObject = new JSONObject(L0.a(this.f381009c.b(context.getFilesDir(), "credentials.dat")));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                int i12 = X21.a.f18568a;
                try {
                    jSONObject = new JSONObject(L0.a(this.f381009c.b(context.getNoBackupFilesDir(), "credentials.dat")));
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject != null) {
                strOptString2 = jSONObject.optString("device_id", null);
                strOptString = jSONObject.optString("device_id_hash", null);
            } else {
                strOptString = null;
            }
            if (!TextUtils.isEmpty(strOptString2)) {
                bVarA.c(strOptString2);
            }
            if (!TextUtils.isEmpty(strOptString)) {
                bVarA.d(strOptString);
            }
            bVarA.b(true);
            this.f381008b.save(bVarA.a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }

        @j.k0
        public f(@j.N ProtobufStateStorage protobufStateStorage, @j.N ProtobufStateStorage protobufStateStorage2, @j.N B0 b02) {
            this.f381007a = protobufStateStorage;
            this.f381008b = protobufStateStorage2;
            this.f381009c = b02;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$g */
    public static class g implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private ProtobufStateStorage f381010a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private C38799f9 f381011b;

        public g(@j.N ProtobufStateStorage protobufStateStorage, @j.N C38799f9 c38799f9) {
            this.f381010a = protobufStateStorage;
            this.f381011b = c38799f9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            this.f381010a.save(this.f381011b.g());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$h */
    public static class h implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381012a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381013b;

        public h(@j.N ProtobufStateStorage protobufStateStorage, @j.N ProtobufStateStorage protobufStateStorage2) {
            this.f381012a = protobufStateStorage;
            this.f381013b = protobufStateStorage2;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            this.f381013b.save(new C39147td(new ArrayList((Collection) this.f381012a.read()), null, new ArrayList()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$i */
    public static class i implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381014a;

        public i(@j.N ProtobufStateStorage protobufStateStorage) {
            this.f381014a = protobufStateStorage;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            ProtobufStateStorage protobufStateStorage = this.f381014a;
            C39081qi c39081qi = (C39081qi) protobufStateStorage.read();
            protobufStateStorage.save(c39081qi.a(c39081qi.f381626r).b(true).a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$j */
    public static class j implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        private Pd f381015a;

        /* renamed from: b, reason: collision with root package name */
        private C38799f9 f381016b;

        public j(@j.N Context context) {
            this.f381015a = new Pd(context);
            this.f381016b = new C38799f9(C38899ja.a(context).p(), context.getPackageName());
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            String strB = this.f381015a.b((String) null);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            this.f381016b.i(strB).d();
            Pd.b(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$k */
    public static class k implements D1.a {
        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            Md md2 = new Md(context, context.getPackageName());
            SharedPreferences sharedPreferencesA = C38689b.a(context, "_boundentrypreferences");
            Rd rd2 = Md.f378902H;
            String string = sharedPreferencesA.getString(rd2.b(), null);
            Rd rd3 = Md.f378903I;
            long j12 = sharedPreferencesA.getLong(rd3.b(), -1L);
            if (string == null || j12 == -1) {
                return;
            }
            md2.a(new C39109s.a(string, j12)).b();
            sharedPreferencesA.edit().remove(rd2.b()).remove(rd3.b()).apply();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$l */
    public static class l implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final C38774e9 f381017a;

        public l(@j.N C38774e9 c38774e9) {
            this.f381017a = c38774e9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            C38774e9 c38774e9 = this.f381017a;
            Qd qd2 = new Qd(context, null);
            if (qd2.f()) {
                c38774e9.d(true);
                qd2.g();
            }
            C38774e9 c38774e92 = this.f381017a;
            Od od2 = new Od(context, context.getPackageName());
            long jA2 = od2.a(0);
            if (jA2 != 0) {
                c38774e92.l(jA2);
            }
            od2.f();
            new Md(context, new W3(context.getPackageName(), null).b()).i().b();
            this.f381017a.d();
            Hd hd2 = new Hd(context);
            hd2.a();
            hd2.b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$m */
    public static class m implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final C38774e9 f381018a;

        public m(@j.N C38774e9 c38774e9) {
            this.f381018a = c38774e9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            boolean z12 = new C38799f9(C38899ja.a(context).q(), context.getPackageName()).g().f381629u > 0;
            boolean z13 = this.f381018a.b(-1) > 0;
            if (z12 || z13) {
                this.f381018a.c(false).d();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$n */
    public static class n implements D1.a {
        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            C38799f9 c38799f9 = new C38799f9(C38899ja.a(context).q(), context.getPackageName());
            String strH = c38799f9.h(null);
            if (strH != null) {
                c38799f9.b(Collections.singletonList(strH));
            }
            String strG = c38799f9.g(null);
            if (strG != null) {
                c38799f9.a(Collections.singletonList(strG));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$o */
    public static class o implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final B0 f381019a;

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$a */
        public static class a implements FilenameFilter {

            /* renamed from: a, reason: collision with root package name */
            final Iterable<FilenameFilter> f381020a;

            public a(Iterable<FilenameFilter> iterable) {
                this.f381020a = iterable;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                Iterator<FilenameFilter> it = this.f381020a.iterator();
                while (it.hasNext()) {
                    if (it.next().accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$b */
        public static class b implements FilenameFilter {

            /* renamed from: a, reason: collision with root package name */
            private final FilenameFilter f381021a;

            public b(FilenameFilter filenameFilter) {
                this.f381021a = filenameFilter;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    FilenameFilter filenameFilter = this.f381021a;
                    if (str.endsWith("-journal")) {
                        str = str.replace("-journal", "");
                    }
                    return filenameFilter.accept(file, str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$c */
        public static class c implements FilenameFilter {
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$d */
        public static class d implements FilenameFilter {

            /* renamed from: a, reason: collision with root package name */
            private final String f381022a;

            public d(@j.N String str) {
                this.f381022a = str;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return !str.contains(this.f381022a);
            }
        }

        public o() {
            this(new B0());
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            for (File file : b(context) == null ? new File[0] : b(context).listFiles(new a(Arrays.asList(new b(new d(context.getPackageName())), new b(new c()))))) {
                try {
                    if (!file.delete()) {
                        ((C39006nh) C39031oh.a()).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th2) {
                    ((C39006nh) C39031oh.a()).reportError("Can not delete file", th2);
                }
            }
            new C38799f9(C38899ja.a(context).q(), context.getPackageName()).f(new Rd("LAST_STARTUP_CLIDS_SAVE_TIME", null).a()).d();
        }

        @j.k0
        @j.P
        public File b(@j.N Context context) {
            if (A2.a(21)) {
                return context.getNoBackupFilesDir();
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                return this.f381019a.b(filesDir.getParentFile(), "databases");
            }
            return null;
        }

        @j.k0
        public o(@j.N B0 b02) {
            this.f381019a = b02;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$r */
    public static class r implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381033a;

        public r(@j.N ProtobufStateStorage protobufStateStorage) {
            this.f381033a = protobufStateStorage;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            Ud ud2 = (Ud) this.f381033a.read();
            ArrayList arrayList = new ArrayList();
            Ud.a aVar = null;
            for (Ud.a aVar2 : ud2.f379612b) {
                if (aVar2.f379615c != EnumC39158u0.APP) {
                    arrayList.add(aVar2);
                } else if (aVar == null) {
                    arrayList.add(aVar2);
                    aVar = aVar2;
                }
            }
            this.f381033a.save(new Ud(ud2.f379611a, arrayList));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$s */
    public static class s implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final R7 f381034a;

        public s(@j.N R7 r72) {
            this.f381034a = r72;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            this.f381034a.b("notification_cache_state");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$t */
    public static class t implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        private final C38774e9 f381035a;

        public t(@j.N C38774e9 c38774e9) {
            this.f381035a = c38774e9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            this.f381035a.f(new Rd("REFERRER", null).a()).f(new Rd("REFERRER_HOLDER_STATE", null).a()).d();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$u */
    public static class u implements D1.a {
        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            ProtobufStateStorage protobufStateStorageB = InterfaceC38800fa.b.a(C39081qi.class).b(context);
            C39081qi c39081qi = (C39081qi) protobufStateStorageB.read();
            protobufStateStorageB.save(c39081qi.a(c39081qi.f381626r).a(c39081qi.f381629u > 0).b(true).a());
        }
    }

    @j.k0
    public C38966m2(@j.N Context context, @j.N C38774e9 c38774e9, @j.N C38673a8 c38673a8) {
        this.f380996b = context;
        this.f380995a = c38774e9;
        this.f380997c = c38673a8;
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$q */
    public static class q implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final C38774e9 f381025a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381026b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final C38673a8 f381027c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final String f381028d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        private final String f381029e;

        /* renamed from: f, reason: collision with root package name */
        @j.N
        private final String f381030f;

        /* renamed from: g, reason: collision with root package name */
        @j.N
        private final String f381031g;

        /* renamed from: h, reason: collision with root package name */
        @j.N
        private final String f381032h;

        public q(@j.N C38774e9 c38774e9, @j.N ProtobufStateStorage protobufStateStorage) {
            this(c38774e9, protobufStateStorage, F0.g().w().b());
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            C39081qi c39081qi = (C39081qi) this.f381026b.read();
            Nd nd2 = new Nd(context);
            int iF2 = nd2.f();
            if (iF2 == -1) {
                iF2 = this.f381025a.a(-1);
            }
            this.f381027c.a(c39081qi.f381610b, c39081qi.f381611c, this.f381025a.a(this.f381028d, (String) null), this.f381025a.c(this.f381029e) ? Boolean.valueOf(this.f381025a.a(this.f381029e, false)) : null, this.f381025a.c(this.f381030f) ? Long.valueOf(this.f381025a.a(this.f381030f, -1L)) : null, this.f381025a.c(this.f381031g) ? Long.valueOf(this.f381025a.a(this.f381031g, -1L)) : null, this.f381025a.c(this.f381032h) ? Long.valueOf(this.f381025a.a(this.f381032h, -1L)) : null, iF2 == -1 ? null : Integer.valueOf(iF2));
            this.f381025a.j().f(this.f381028d).f(this.f381029e).f(this.f381030f).f(this.f381031g).f(this.f381032h).d();
            nd2.h().b();
        }

        @j.k0
        public q(@j.N C38774e9 c38774e9, @j.N ProtobufStateStorage protobufStateStorage, @j.N C38673a8 c38673a8) {
            this.f381028d = new Rd("REFERRER_FROM_PLAY_SERVICES").a();
            this.f381029e = new Rd("REFERRER_CHECKED").a();
            this.f381030f = new Rd("L_ID").a();
            this.f381031g = new Rd("LBS_ID").a();
            this.f381032h = new Rd("L_REQ_NUM").a();
            this.f381025a = c38774e9;
            this.f381026b = protobufStateStorage;
            this.f381027c = c38673a8;
        }
    }

    @Override // com.yandex.metrica.impl.ob.D1
    public SparseArray<D1.a> a() {
        return new a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$p */
    public static class p implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ProtobufStateStorage f381023a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final C38759dj f381024b;

        public p(@j.N Context context, @j.N ProtobufStateStorage protobufStateStorage) {
            this(protobufStateStorage, C38784ej.a(context).b(context, new C38883ij(new C39057pi.b(context))));
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            String str = this.f381024b.a().f379795a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C39081qi c39081qi = (C39081qi) this.f381023a.read();
            if (str.equals(c39081qi.f381609a)) {
                return;
            }
            this.f381023a.save(c39081qi.a(c39081qi.f381626r).k(str).a());
        }

        @j.k0
        public p(@j.N ProtobufStateStorage protobufStateStorage, @j.N C38759dj c38759dj) {
            this.f381023a = protobufStateStorage;
            this.f381024b = c38759dj;
        }
    }

    @Override // com.yandex.metrica.impl.ob.D1
    public int a(Nd nd2) {
        int iF2 = nd2.f();
        if (iF2 == -1) {
            iF2 = this.f380995a.a(-1);
        }
        return iF2 == -1 ? this.f380997c.c() : iF2;
    }

    @Override // com.yandex.metrica.impl.ob.D1
    public void a(Nd nd2, int i12) {
        this.f380997c.a(i12);
    }
}
