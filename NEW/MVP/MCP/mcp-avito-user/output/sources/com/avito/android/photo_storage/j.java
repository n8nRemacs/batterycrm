package com.avito.android.photo_storage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import com.avito.android.util.C35836l1;
import java.io.File;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PrivatePhotosStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_storage/j;", "Lcom/avito/android/photo_storage/i;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f219957a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f219958b = C42727D.c(new a());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f219959c = C42727D.c(new b());

    /* compiled from: PrivatePhotosStorage.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<File> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            File externalFilesDir = j.this.f219957a.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            if (externalFilesDir == null || !L.f(Environment.getExternalStorageState(), "mounted")) {
                externalFilesDir = null;
            }
            File file = new File(externalFilesDir, "photos-cache");
            C35836l1.a(file);
            return file;
        }
    }

    /* compiled from: PrivatePhotosStorage.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<File> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            File file = new File(j.this.f219957a.getCacheDir(), "photos-cache");
            C35836l1.a(file);
            return file;
        }
    }

    @Inject
    public j(@Y61.k Context context) {
        this.f219957a = context;
    }

    public static void e(File file, ArrayList arrayList) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file2 : fileArrListFiles) {
            if (!arrayList.contains(Uri.fromFile(file2))) {
                file2.delete();
            }
        }
    }

    @Override // com.avito.android.photo_storage.i
    public final void a(@Y61.k ArrayList arrayList) {
        e((File) this.f219959c.getValue(), arrayList);
        File file = (File) this.f219958b.getValue();
        if (file != null) {
            e(file, arrayList);
        }
    }

    @Override // com.avito.android.photo_storage.i
    @Y61.k
    public final File b(@Y61.l String str) {
        return File.createTempFile("avito-", str, (File) this.f219959c.getValue());
    }

    @Override // com.avito.android.photo_storage.i
    public final void c(@Y61.k File file) {
        file.delete();
    }

    @Override // com.avito.android.photo_storage.i
    public final boolean d(@Y61.k Uri uri) {
        File file;
        File file2 = (File) this.f219958b.getValue();
        return (file2 != null ? file2.exists() : false) || ((file = (File) this.f219959c.getValue()) != null && C43066x.h0(uri.getPath(), file.getAbsolutePath(), true));
    }
}
