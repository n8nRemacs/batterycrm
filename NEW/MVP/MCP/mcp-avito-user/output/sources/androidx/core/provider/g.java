package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import androidx.collection.C20212g0;
import androidx.core.provider.n;
import com.adjust.sdk.Constants;
import j.N;
import j.P;
import j.X;
import j.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: FontProvider.java */
/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C20212g0<d, ProviderInfo> f44814a = new C20212g0<>(2);

    /* renamed from: b, reason: collision with root package name */
    public static final f f44815b = new f();

    /* compiled from: FontProvider.java */
    public interface a {
    }

    /* compiled from: FontProvider.java */
    public static class b implements a {
    }

    /* compiled from: FontProvider.java */
    @X
    public static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f44816a;

        public c(Context context, Uri uri) {
            this.f44816a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    /* compiled from: FontProvider.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f44817a;

        /* renamed from: b, reason: collision with root package name */
        public String f44818b;

        /* renamed from: c, reason: collision with root package name */
        public List<List<byte[]>> f44819c;

        public d() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Objects.equals(this.f44817a, dVar.f44817a) && Objects.equals(this.f44818b, dVar.f44818b) && Objects.equals(this.f44819c, dVar.f44819c);
        }

        public final int hashCode() {
            return Objects.hash(this.f44817a, this.f44818b, this.f44819c);
        }
    }

    @N
    public static n.b a(@N Context context, @N List list) {
        Trace.beginSection(androidx.tracing.b.e("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < list.size(); i12++) {
                h hVar = (h) list.get(i12);
                ProviderInfo providerInfoB = b(context.getPackageManager(), hVar, context.getResources());
                if (providerInfoB == null) {
                    n.b bVar = new n.b();
                    Trace.endSection();
                    return bVar;
                }
                arrayList.add(c(context, hVar, providerInfoB.authority));
            }
            n.b bVar2 = new n.b(arrayList);
            Trace.endSection();
            return bVar2;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @k0
    @P
    public static ProviderInfo b(@N PackageManager packageManager, @N h hVar, @P Resources resources) {
        Trace.beginSection(androidx.tracing.b.e("FontProvider.getProvider"));
        try {
            List<List<byte[]>> listB = hVar.f44823d;
            String str = hVar.f44820a;
            String str2 = hVar.f44821b;
            if (listB == null) {
                listB = androidx.core.content.res.f.b(resources, 0);
            }
            d dVar = new d();
            dVar.f44817a = str;
            dVar.f44818b = str2;
            dVar.f44819c = listB;
            C20212g0<d, ProviderInfo> c20212g0 = f44814a;
            ProviderInfo providerInfo = c20212g0.get(dVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            f fVar = f44815b;
            Collections.sort(arrayList, fVar);
            for (int i12 = 0; i12 < listB.size(); i12++) {
                ArrayList arrayList2 = new ArrayList(listB.get(i12));
                Collections.sort(arrayList2, fVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i13), (byte[]) arrayList2.get(i13))) {
                            break;
                        }
                    }
                    c20212g0.put(dVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    @N
    @k0
    public static n.c[] c(Context context, h hVar, String str) {
        Trace.beginSection(androidx.tracing.b.e("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClient = new c(context, uriBuild).f44816a;
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(androidx.tracing.b.e("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {hVar.f44822c};
                    if (contentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException unused) {
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i12 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new n.c(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : Constants.MINIMAL_ERROR_STATUS_CODE, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i12));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    return (n.c[]) arrayList.toArray(new n.c[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClient != null) {
                    contentProviderClient.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
