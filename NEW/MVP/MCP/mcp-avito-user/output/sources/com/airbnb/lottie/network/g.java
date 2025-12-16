package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.C27296p;
import com.airbnb.lottie.I;
import j.N;
import j.P;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
@RestrictTo
/* loaded from: classes10.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final f f59908a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final e f59909b;

    /* compiled from: NetworkFetcher.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59910a;

        static {
            int[] iArr = new int[FileExtension.values().length];
            f59910a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59910a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(@P f fVar, @N e eVar) {
        this.f59908a = fVar;
        this.f59909b = eVar;
    }

    @N
    public final I<C27291k> a(Context context, @N String str, @N InputStream inputStream, @P String str2, @P String str3) {
        I<C27291k> iH2;
        FileExtension fileExtension;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        f fVar = this.f59908a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.e.a("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            iH2 = (str3 == null || fVar == null) ? C27296p.h(context, new ZipInputStream(inputStream), null) : C27296p.h(context, new ZipInputStream(new FileInputStream(fVar.d(str, inputStream, fileExtension2))), str);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            com.airbnb.lottie.utils.e.a("Handling gzip response.");
            fileExtension = FileExtension.GZIP;
            iH2 = (str3 == null || fVar == null) ? C27296p.d(new GZIPInputStream(inputStream), null) : C27296p.d(new GZIPInputStream(new FileInputStream(fVar.d(str, inputStream, fileExtension))), str);
        } else {
            com.airbnb.lottie.utils.e.a("Received json response.");
            fileExtension = FileExtension.JSON;
            iH2 = (str3 == null || fVar == null) ? C27296p.d(inputStream, null) : C27296p.d(new FileInputStream(fVar.d(str, inputStream, fileExtension).getAbsolutePath()), str);
        }
        if (str3 != null && iH2.f59108a != null && fVar != null) {
            File file = new File(fVar.c(), f.a(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            com.airbnb.lottie.utils.e.a("Copying temp file to real file (" + file2 + ")");
            if (!zRenameTo) {
                com.airbnb.lottie.utils.e.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return iH2;
    }
}
