package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.io.File;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.n7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38996n7 implements InterfaceC38772e7<File> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f381148a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final File f381149b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38724c9 f381150c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final B0 f381151d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38872i7 f381152e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final InterfaceC38797f7<String> f381153f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f381154g;

    /* renamed from: com.yandex.metrica.impl.ob.n7$a */
    public static class a implements InterfaceC38986mm<File> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.N File file) {
            file.delete();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n7$b */
    public static class b implements InterfaceC38986mm<String> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final InterfaceC38797f7<String> f381155a;

        public b(@j.N InterfaceC38797f7<String> interfaceC38797f7) {
            this.f381155a = interfaceC38797f7;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.N String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f381155a.b(str2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n7$c */
    public static class c implements InterfaceC38986mm<String> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final InterfaceC38797f7<String> f381156a;

        public c(@j.N InterfaceC38797f7<String> interfaceC38797f7) {
            this.f381156a = interfaceC38797f7;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.N String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f381156a.a(str2);
        }
    }

    @j.k0
    public C38996n7(@j.N Context context, @j.N B0 b02, @j.N C38872i7 c38872i7, @j.N InterfaceC38797f7<String> interfaceC38797f7, @j.N ICommonExecutor iCommonExecutor, @j.N C38724c9 c38724c9) {
        this.f381148a = context;
        this.f381151d = b02;
        this.f381149b = b02.b(context);
        this.f381152e = c38872i7;
        this.f381153f = interfaceC38797f7;
        this.f381154g = iCommonExecutor;
        this.f381150c = c38724c9;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38772e7
    public void a(@j.N File file) {
        this.f381154g.execute(new RunnableC39140t6(file, this.f381152e, new a(), new b(this.f381153f)));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38772e7
    public synchronized void a() {
        int i12 = X21.a.f18568a;
        File fileB = this.f381151d.b(this.f381148a.getFilesDir(), "YandexMetricaNativeCrashes");
        if (fileB != null) {
            if (this.f381150c.o()) {
                if (fileB.exists()) {
                    try {
                        fileB.delete();
                    } catch (Throwable unused) {
                    }
                }
            } else {
                a2(fileB);
                this.f381150c.p();
            }
        }
        a2(this.f381149b);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(@j.P File file) {
        File[] fileArrListFiles;
        if (file != null && file.exists()) {
            fileArrListFiles = file.listFiles(new C38971m7(this));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        } else {
            fileArrListFiles = new File[0];
        }
        for (File file2 : fileArrListFiles) {
            this.f381154g.execute(new RunnableC39140t6(file2, this.f381152e, new a(), new c(this.f381153f)));
        }
    }
}
