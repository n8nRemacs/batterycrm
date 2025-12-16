package com.avito.android.photo_picker.edit;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: ExifProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/u;", "Lcom/avito/android/photo_picker/edit/t;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f219440a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_storage.i f219441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N70.b f219442c;

    public u(@Y61.k Context context, @Y61.k com.avito.android.photo_storage.i iVar, @Y61.k N70.b bVar) {
        this.f219440a = context;
        this.f219441b = iVar;
        this.f219442c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0070 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.avito.android.photo_picker.edit.t
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.core.q<java.util.Map<java.lang.String, java.lang.String>> a(@Y61.k android.net.Uri r7) {
        /*
            r6 = this;
            com.avito.android.photo_storage.i r0 = r6.f219441b
            r1 = 0
            java.io.File r2 = r0.b(r1)
            java.lang.String r3 = r7.getScheme()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L3e
            int r4 = r3.hashCode()     // Catch: java.lang.Throwable -> L25
            r5 = 3213448(0x310888, float:4.503E-39)
            if (r4 == r5) goto L27
            r5 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r4 == r5) goto L1c
            goto L3e
        L1c:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L3e
            goto L30
        L25:
            r7 = move-exception
            goto L74
        L27:
            java.lang.String r4 = "http"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L30
            goto L3e
        L30:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L25
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L25
            java.io.InputStream r7 = r3.openStream()     // Catch: java.lang.Throwable -> L25
            goto L48
        L3e:
            android.content.Context r3 = r6.f219440a     // Catch: java.lang.Throwable -> L25
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L25
            java.io.InputStream r7 = r3.openInputStream(r7)     // Catch: java.lang.Throwable -> L25
        L48:
            if (r7 == 0) goto L70
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L61
            kotlin.io.b.b(r7, r3)     // Catch: java.lang.Throwable -> L63
            kotlin.io.c.a(r3, r1)     // Catch: java.lang.Throwable -> L61
            androidx.exifinterface.media.a r3 = new androidx.exifinterface.media.a     // Catch: java.lang.Throwable -> L61
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L61
            kotlin.io.c.a(r7, r1)     // Catch: java.lang.Throwable -> L25
            r0.c(r2)
            goto L7f
        L61:
            r3 = move-exception
            goto L6a
        L63:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L65
        L65:
            r5 = move-exception
            kotlin.io.c.a(r3, r4)     // Catch: java.lang.Throwable -> L61
            throw r5     // Catch: java.lang.Throwable -> L61
        L6a:
            throw r3     // Catch: java.lang.Throwable -> L6b
        L6b:
            r4 = move-exception
            kotlin.io.c.a(r7, r3)     // Catch: java.lang.Throwable -> L25
            throw r4     // Catch: java.lang.Throwable -> L25
        L70:
            r0.c(r2)
            goto L7e
        L74:
            com.avito.android.util.V2 r3 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "ExifProvider"
            java.lang.String r5 = "getExifForUri"
            r3.c(r4, r5, r7)     // Catch: java.lang.Throwable -> Lba
            goto L70
        L7e:
            r3 = r1
        L7f:
            if (r3 == 0) goto L86
            java.util.LinkedHashMap r7 = N70.e.a(r3)
            goto L87
        L86:
            r7 = r1
        L87:
            if (r7 == 0) goto Lb5
            N70.a r0 = new N70.a
            java.lang.String r1 = "ImageWidth"
            java.lang.Object r2 = r7.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "ImageLength"
            java.lang.Object r4 = r7.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.<init>(r2, r4)
            N70.b r2 = r6.f219442c
            java.lang.String r0 = r2.a(r0)
            java.util.Set<java.lang.String> r2 = N70.e.f11210a
            java.lang.String r2 = "UserComment"
            r7.put(r2, r0)
            r7.remove(r1)
            r7.remove(r3)
            io.reactivex.rxjava3.internal.operators.maybe.W r1 = io.reactivex.rxjava3.core.q.i(r7)
        Lb5:
            if (r1 != 0) goto Lb9
            io.reactivex.rxjava3.internal.operators.maybe.w r1 = io.reactivex.rxjava3.internal.operators.maybe.C41928w.f403335b
        Lb9:
            return r1
        Lba:
            r7 = move-exception
            r0.c(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_picker.edit.u.a(android.net.Uri):io.reactivex.rxjava3.core.q");
    }
}
