package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.internal.C37141k;
import com.google.android.play.core.assetpacks.internal.C37146p;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.a1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37106a1 implements a2 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358289h = new com.google.android.play.core.assetpacks.internal.F("FakeAssetPackService");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f358290i = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f358291a;

    /* renamed from: b, reason: collision with root package name */
    public final K f358292b;

    /* renamed from: c, reason: collision with root package name */
    public final C37196z0 f358293c;

    /* renamed from: d, reason: collision with root package name */
    public final C37171q1 f358294d;

    /* renamed from: e, reason: collision with root package name */
    public final C37165o1 f358295e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f358296f = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public final C37146p f358297g;

    @j.k0
    public C37106a1(File file, K k12, C37196z0 c37196z0, Context context, C37171q1 c37171q1, C37146p c37146p, C37165o1 c37165o1) {
        this.f358291a = file.getAbsolutePath();
        this.f358292b = k12;
        this.f358293c = c37196z0;
        this.f358294d = c37171q1;
        this.f358297g = c37146p;
        this.f358295e = c37165o1;
    }

    @j.k0
    public static long h(@HY0.b int i12, long j12) {
        if (i12 == 2) {
            return j12 / 2;
        }
        if (i12 == 3 || i12 == 4) {
            return j12;
        }
        return 0L;
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void a(int i12) {
        f358289h.d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void b(final int i12, final String str) {
        f358289h.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f358297g.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.Z0
            @Override // java.lang.Runnable
            public final void run() {
                int i13 = i12;
                String str2 = str;
                C37106a1 c37106a1 = this.f358280b;
                c37106a1.getClass();
                try {
                    c37106a1.i(i13, 4, str2);
                } catch (LocalTestingException e12) {
                    C37106a1.f358289h.e("notifyModuleCompleted failed", e12);
                }
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final Task c(int i12, int i13, String str, String str2) throws LocalTestingException {
        int i14;
        Object[] objArr = {Integer.valueOf(i12), str, str2, Integer.valueOf(i13)};
        com.google.android.play.core.assetpacks.internal.F f12 = f358289h;
        f12.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", objArr);
        C37028k c37028k = new C37028k();
        try {
        } catch (LocalTestingException e12) {
            f12.e("getChunkFileDescriptor failed", e12);
            c37028k.a(e12);
        } catch (FileNotFoundException e13) {
            f12.e("getChunkFileDescriptor failed", e13);
            c37028k.a(new LocalTestingException("Asset Slice file not found.", e13));
        }
        for (File file : k(str)) {
            if (C37141k.a(file).equals(str2)) {
                c37028k.b(ParcelFileDescriptor.open(file, 268435456));
                return c37028k.f355672a;
            }
        }
        throw new LocalTestingException("Local testing slice for '" + str2 + "' not found.");
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final Task d(HashMap map) {
        f358289h.d("syncPacks()", new Object[0]);
        return C37030m.f(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void e(int i12, int i13, String str, String str2) {
        f358289h.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void f(List list) {
        f358289h.d("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void g(String str) {
        f358289h.d("removePack(%s)", str);
    }

    public final void i(int i12, @HY0.b int i13, String str) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f358294d.a());
        bundle.putInt("session_id", i12);
        File[] fileArrK = k(str);
        ArrayList<String> arrayList = new ArrayList<>();
        int length = fileArrK.length;
        long j12 = 0;
        int i14 = 0;
        while (i14 < length) {
            File file = fileArrK[i14];
            long length2 = j12 + file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i13 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strA = C37141k.a(file);
            bundle.putParcelableArrayList(HY0.f.b("chunk_intents", str, strA), arrayList2);
            try {
                bundle.putString(HY0.f.b("uncompressed_hash_sha256", str, strA), C37112c1.a(Arrays.asList(file)));
                bundle.putLong(HY0.f.b("uncompressed_size", str, strA), file.length());
                arrayList.add(strA);
                i14++;
                j12 = length2;
            } catch (IOException e12) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), e12);
            } catch (NoSuchAlgorithmException e13) {
                throw new LocalTestingException("SHA256 algorithm not supported.", e13);
            }
        }
        bundle.putStringArrayList(HY0.f.a("slice_ids", str), arrayList);
        bundle.putLong(HY0.f.a("pack_version", str), r4.a());
        bundle.putInt(HY0.f.a("status", str), i13);
        bundle.putInt(HY0.f.a("error_code", str), 0);
        bundle.putLong(HY0.f.a("bytes_downloaded", str), h(i13, j12));
        bundle.putLong(HY0.f.a("total_bytes_to_download", str), j12);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", h(i13, j12));
        bundle.putLong("total_bytes_to_download", j12);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f358296f.post(new Runnable() { // from class: com.google.android.play.core.assetpacks.Y0
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                this.f358272b.f358292b.b(intentPutExtra);
            }
        });
    }

    public final AssetPackState j(@HY0.b int i12, String str) throws IllegalAccessException, IOException, LocalTestingException, IllegalArgumentException, InvocationTargetException {
        long length = 0;
        for (File file : k(str)) {
            length += file.length();
        }
        return new X(str, i12, 0, h(i12, length), length, (int) Math.rint(this.f358293c.a(str) * 100.0d), 1, String.valueOf(this.f358294d.a()), this.f358295e.a(str));
    }

    public final File[] k(final String str) throws LocalTestingException {
        File file = new File(this.f358291a);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.X0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new LocalTestingException(AK.c.k("Failed fetching APKs for pack '", str, "'."));
        }
        if (fileArrListFiles.length == 0) {
            throw new LocalTestingException(AK.c.k("No APKs available for pack '", str, "'."));
        }
        for (File file2 : fileArrListFiles) {
            if (C37141k.a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new LocalTestingException(AK.c.k("No main slice available for pack '", str, "'."));
    }

    @Override // com.google.android.play.core.assetpacks.a2
    public final void f() {
        f358289h.d("keepAlive", new Object[0]);
    }
}
