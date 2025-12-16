package com.avito.android.license.data;

import Y61.k;
import android.content.Context;
import android.content.res.AssetManager;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.util.R0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43047d;

/* compiled from: LicenseRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/license/data/e;", "Lcom/avito/android/license/data/b;", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f181511a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f181512b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<a> f181513c = C42745f0.U(new a("kotlin.txt", Collections.singletonList("Kotlin")), new a("rxjava.txt", Collections.singletonList("RxJava")), new a("retrofit.txt", Collections.singletonList("Retrofit")), new a("ok_http.txt", Collections.singletonList("OkHttp")), new a("otto.txt", Collections.singletonList("Otto")), new a("apache2.txt", C42745f0.U("android-support-v4", "android-support-v7-appcompat")), new a("image_view_zoom.txt", Collections.singletonList("ImageViewZoom")), new a("universal_image_loader.txt", Collections.singletonList("Universal Image Loader")), new a("jsoup.txt", Collections.singletonList("jsoup")));

    @Inject
    public e(@k Context context, @k R0 r02) {
        this.f181511a = context;
        this.f181512b = r02;
    }

    public static final void b(e eVar, StringBuilder sb2) {
        for (a aVar : eVar.f181513c) {
            AssetManager assets = eVar.f181511a.getAssets();
            StringBuilder sb3 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assets.open("licences/".concat(aVar.f181505a)), C43047d.f410589b), 8192);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb3.append(line);
                    sb3.append("\n");
                } finally {
                }
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(bufferedReader, null);
            String string = sb3.toString();
            sb2.append("<ul>");
            for (String str : aVar.f181506b) {
                sb2.append("<li>");
                sb2.append(str);
                sb2.append("</li>");
            }
            m.p(sb2, "</ul>", "<pre>", string, "</pre>");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.license.data.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.license.data.c
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.license.data.c r0 = (com.avito.android.license.data.c) r0
            int r1 = r0.f181509s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181509s = r1
            goto L18
        L13:
            com.avito.android.license.data.c r0 = new com.avito.android.license.data.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f181507q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f181509s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.C42729a0.b(r6)
            com.avito.android.util.R0 r6 = r5.f181512b
            kotlinx.coroutines.scheduling.b r6 = r6.a()
            com.avito.android.license.data.d r2 = new com.avito.android.license.data.d
            r4 = 0
            r2.<init>(r5, r4)
            r0.f181509s = r3
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.license.data.e.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
