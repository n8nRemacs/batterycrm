package com.avito.android.advertising.loaders.avito_targeting;

import android.net.Uri;
import android.util.Base64;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.util.C35800g5;
import com.avito.android.util.C35809h6;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import k31.C42495d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.text.C43047d;

/* compiled from: AvitoTargetingBannerLoader.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/advertising/b;", "it", "apply", "(Lcom/avito/android/advertising/b;)Lcom/avito/android/advertising/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f88048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AvitoNetworkBannerItem f88049c;

    public n(i iVar, AvitoNetworkBannerItem avitoNetworkBannerItem) {
        this.f88048b = iVar;
        this.f88049c = avitoNetworkBannerItem;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        com.avito.android.advertising.b bVar = (com.avito.android.advertising.b) obj;
        this.f88048b.getClass();
        if (!(bVar instanceof AvitoNetworkBanner.ProfilePromo)) {
            return bVar;
        }
        AvitoNetworkBanner.ProfilePromo profilePromo = (AvitoNetworkBanner.ProfilePromo) bVar;
        AvitoNetworkBannerItem avitoNetworkBannerItem = this.f88049c;
        String alid = avitoNetworkBannerItem.getAlid();
        String bannerCode = avitoNetworkBannerItem.getBannerCode();
        Map mapD = C35800g5.d(Uri.parse(profilePromo.f88003e).getQueryParameter("context"));
        if (mapD == null) {
            mapD = P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapD);
        if (alid != null) {
            linkedHashMap.put("alid", alid);
        }
        if (bannerCode != null) {
            linkedHashMap.put("banner_code", bannerCode);
        }
        Uri uri = Uri.parse(profilePromo.f88003e);
        C42495d c42495d = new C42495d();
        StringBuffer stringBuffer = new StringBuffer();
        c42495d.a(linkedHashMap, stringBuffer, true);
        String string = stringBuffer.toString();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream), C43047d.f410589b), 8192);
        try {
            bufferedWriter.write(string);
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(bufferedWriter, null);
            return new AvitoNetworkBanner.ProfilePromo(profilePromo.f88000b, profilePromo.f88001c, profilePromo.f88002d, C35809h6.c(uri, "context", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 11)).toString(), profilePromo.f88004f, profilePromo.f88005g, profilePromo.f88006h, profilePromo.f88007i);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(bufferedWriter, th2);
                throw th3;
            }
        }
    }
}
