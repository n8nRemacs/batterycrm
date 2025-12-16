package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

@j.X
/* renamed from: com.yandex.metrica.impl.ob.y7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39261y7 {

    /* renamed from: m, reason: collision with root package name */
    private static final Set<String> f382223m;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f382224a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f382225b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final File f382226c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final List<String> f382227d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final File f382228e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final File f382229f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final InterfaceC39011nm<Void, String> f382230g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final Jl f382231h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final C39237x7 f382232i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final Callable<String> f382233j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final C39070q7 f382234k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final B0 f382235l;

    /* renamed from: com.yandex.metrica.impl.ob.y7$a */
    public class a implements InterfaceC39011nm<Void, String> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public String a(Void r12) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y7$b */
    public class b implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public String call() {
            return CrashpadHelper.getLibDirInsideApk();
        }
    }

    @j.k0
    /* renamed from: com.yandex.metrica.impl.ob.y7$c */
    public static class c implements InterfaceC39011nm<File, Boolean> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public /* bridge */ /* synthetic */ Boolean a(File file) {
            return Boolean.TRUE;
        }
    }

    @j.k0
    /* renamed from: com.yandex.metrica.impl.ob.y7$d */
    public static class d implements InterfaceC39011nm<File, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        private final String f382236a;

        public d(String str) {
            this.f382236a = str;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public Boolean a(File file) {
            return Boolean.valueOf(!file.getName().endsWith(this.f382236a));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f382223m = hashSet;
        C31685o.r(hashSet, "armeabi-v7a", "arm64-v8a", "x86", "x86_64");
    }

    public C39261y7(@j.N Context context, @j.N B0 b02, @j.N ICommonExecutor iCommonExecutor) {
        this(context, b02, iCommonExecutor, Arrays.asList("libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.yandex.metrica.impl.ob.C7 a() throws java.io.IOException {
        /*
            r9 = this;
            java.io.File r0 = r9.f382226c
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L19
            boolean r0 = r0.exists()
            if (r0 != 0) goto Ld
            goto L19
        Ld:
            java.io.File r0 = r9.f382226c
            java.lang.String r0 = r0.getAbsolutePath()
            com.yandex.metrica.impl.ob.C7 r3 = new com.yandex.metrica.impl.ob.C7
            r3.<init>(r0, r2, r1)
            return r3
        L19:
            android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "-"
            r0.<init>(r3)
            com.yandex.metrica.impl.ob.nm<java.lang.Void, java.lang.String> r3 = r9.f382230g
            java.lang.Object r3 = r3.a(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.yandex.metrica.impl.ob.Jl r3 = r9.f382231h
            java.lang.String r3 = r3.a()
            if (r3 == 0) goto La2
            java.io.File r4 = r9.f382229f
            if (r4 != 0) goto L3f
            goto L61
        L3f:
            boolean r4 = r4.exists()
            r5 = 1
            if (r4 != 0) goto L62
            java.io.File r4 = r9.f382229f
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L4f
            goto L61
        L4f:
            java.io.File r4 = r9.f382228e
            if (r4 == 0) goto L61
            boolean r4 = r4.setExecutable(r5, r2)
            if (r4 != 0) goto L5a
            goto L61
        L5a:
            java.io.File r4 = r9.f382229f
            boolean r5 = r4.setExecutable(r5, r2)
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto La2
            com.yandex.metrica.impl.ob.y7$d r4 = new com.yandex.metrica.impl.ob.y7$d
            r4.<init>(r0)
            com.yandex.metrica.core.api.executors.ICommonExecutor r5 = r9.f382225b
            com.yandex.metrica.impl.ob.z7 r6 = new com.yandex.metrica.impl.ob.z7
            r6.<init>(r9, r4)
            r5.execute(r6)
            java.util.List<java.lang.String> r4 = r9.f382227d
            java.util.Iterator r4 = r4.iterator()
        L79:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La2
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.yandex.metrica.impl.ob.x7 r6 = r9.f382232i
            java.lang.String r7 = "lib/"
            java.lang.String r8 = "/"
            java.lang.String r7 = androidx.compose.ui.graphics.colorspace.e.n(r7, r3, r8, r5)
            java.lang.String r5 = androidx.appcompat.app.r.q(r5, r0)
            java.lang.String r5 = r6.a(r7, r5)
            android.os.SystemClock.elapsedRealtime()
            if (r5 == 0) goto L79
            com.yandex.metrica.impl.ob.C7 r0 = new com.yandex.metrica.impl.ob.C7
            r0.<init>(r5, r2, r1)
            r1 = r0
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39261y7.a():com.yandex.metrica.impl.ob.C7");
    }

    @j.P
    private File c() {
        String strCall;
        try {
            strCall = this.f382233j.call();
        } catch (Throwable unused) {
            strCall = null;
        }
        if (TextUtils.isEmpty(strCall)) {
            return null;
        }
        this.f382235l.getClass();
        return new File(strCall);
    }

    @j.P
    @j.l0
    public C7 b() {
        C39046p7 c39046p7;
        C7 c72 = null;
        if (A2.a(29)) {
            File fileC = c();
            if (fileC == null) {
                return null;
            }
            for (String str : this.f382227d) {
                this.f382235l.getClass();
                File file = new File(fileC, str);
                if (file.exists()) {
                    return new C7(file.getAbsolutePath(), true, null);
                }
            }
            return null;
        }
        if (!A2.a(23)) {
            return a();
        }
        C39070q7 c39070q7 = this.f382234k;
        Context context = this.f382224a;
        String strA = this.f382231h.a();
        c39070q7.getClass();
        try {
            String[] strArrA = D7.a(context, strA);
            c39046p7 = new C39046p7(strArrA[0], strArrA[1], Environment.getDataDirectory().getAbsolutePath());
        } catch (Throwable unused) {
            c39046p7 = null;
        }
        if (c39046p7 != null) {
            File fileC2 = c();
            if (fileC2 != null) {
                Iterator<String> it = this.f382227d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    this.f382235l.getClass();
                    File file2 = new File(fileC2, next);
                    if (file2.exists()) {
                        c72 = new C7(file2.getAbsolutePath(), false, c39046p7);
                        break;
                    }
                }
            } else {
                c72 = new C7("stub", false, c39046p7);
            }
        }
        if (c72 == null || c72.f377894d == null) {
            return a();
        }
        this.f382225b.execute(new RunnableC39285z7(this, new c()));
        return c72;
    }

    private C39261y7(@j.N Context context, @j.N B0 b02, @j.N ICommonExecutor iCommonExecutor, @j.N List<String> list) {
        this(context, iCommonExecutor, list, b02, b02.a(b02.a(context), list.get(0)), b02.b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), new a(), new b(), new Jl(f382223m));
    }

    private C39261y7(@j.N Context context, @j.N ICommonExecutor iCommonExecutor, @j.N List<String> list, @j.N B0 b02, @j.P File file, @j.P File file2, @j.N InterfaceC39011nm<Void, String> interfaceC39011nm, @j.N Callable<String> callable, @j.N Jl jl2) {
        this(context, iCommonExecutor, list, file, file2, interfaceC39011nm, callable, jl2, new C39237x7(context, file2), new C39070q7(), b02);
    }

    @j.k0
    public C39261y7(@j.N Context context, @j.N ICommonExecutor iCommonExecutor, @j.N List<String> list, @j.P File file, @j.P File file2, @j.N InterfaceC39011nm<Void, String> interfaceC39011nm, @j.N Callable<String> callable, @j.N Jl jl2, @j.N C39237x7 c39237x7, @j.N C39070q7 c39070q7, @j.N B0 b02) {
        this.f382224a = context;
        this.f382225b = iCommonExecutor;
        this.f382227d = list;
        this.f382226c = file;
        this.f382228e = context.getCacheDir();
        this.f382229f = file2;
        this.f382230g = interfaceC39011nm;
        this.f382233j = callable;
        this.f382231h = jl2;
        this.f382232i = c39237x7;
        this.f382234k = c39070q7;
        this.f382235l = b02;
    }

    @j.k0
    public void a(@j.N InterfaceC39011nm<File, Boolean> interfaceC39011nm) {
        File[] fileArrListFiles;
        File file = this.f382229f;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (interfaceC39011nm.a(file2).booleanValue()) {
                file2.delete();
            }
        }
    }
}
