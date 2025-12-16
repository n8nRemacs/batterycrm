package mZ0;

import AK.c;
import androidx.camera.core.impl.r0;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.C37592n;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.d;
import com.google.firebase.crashlytics.internal.settings.g;
import j.N;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CrashlyticsReportPersistence.java */
/* renamed from: mZ0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C44034a {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f414575d = Charset.forName(Constants.ENCODING);

    /* renamed from: e, reason: collision with root package name */
    public static final int f414576e = 15;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.firebase.crashlytics.internal.model.serialization.b f414577f = new com.google.firebase.crashlytics.internal.model.serialization.b();

    /* renamed from: g, reason: collision with root package name */
    public static final r0 f414578g = new r0(14);

    /* renamed from: h, reason: collision with root package name */
    public static final C37592n f414579h = new C37592n(3);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f414580a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final C44035b f414581b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final g f414582c;

    public C44034a(C44035b c44035b, g gVar) {
        this.f414581b = c44035b;
        this.f414582c = gVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    @N
    public static String e(@N File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i12 = fileInputStream.read(bArr);
                if (i12 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f414575d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f414575d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        C44035b c44035b = this.f414581b;
        arrayList.addAll(C44035b.f(c44035b.f414587e.listFiles()));
        arrayList.addAll(C44035b.f(c44035b.f414588f.listFiles()));
        r0 r0Var = f414578g;
        Collections.sort(arrayList, r0Var);
        List listF = C44035b.f(c44035b.f414586d.listFiles());
        Collections.sort(listF, r0Var);
        arrayList.addAll(listF);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(C44035b.f(this.f414581b.f414585c.list())).descendingSet();
    }

    public final void d(@N CrashlyticsReport.f.d dVar, @N String str, boolean z12) {
        C44035b c44035b = this.f414581b;
        d.b bVar = this.f414582c.a().f361455a;
        f414577f.getClass();
        try {
            f(c44035b.c(str, c.k("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f414580a.getAndIncrement())), z12 ? "_" : "")), com.google.firebase.crashlytics.internal.model.serialization.b.f361385a.a(dVar));
        } catch (IOException unused) {
            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
        }
        C37592n c37592n = new C37592n(4);
        c44035b.getClass();
        File file = new File(c44035b.f414585c, str);
        file.mkdirs();
        List<File> listF = C44035b.f(file.listFiles(c37592n));
        Collections.sort(listF, new r0(15));
        int size = listF.size();
        for (File file2 : listF) {
            if (size <= bVar.f361464a) {
                return;
            }
            C44035b.e(file2);
            size--;
        }
    }
}
