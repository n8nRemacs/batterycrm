package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import android.util.Base64;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import com.google.gson.reflect.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;

/* compiled from: AvitoAreaObject.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"fromBase64EncodedJsonString", "Lcom/avito/android/avito_map/AvitoAreaObject;", "base64EncodedString", "", "fromValues", "type", "points", "", "Lcom/avito/android/avito_map/AvitoMapPoint;", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoAreaObjectKt {
    @l
    public static final AvitoAreaObject fromBase64EncodedJsonString(@l String str) {
        Object objE = null;
        if (str == null) {
            return null;
        }
        Charset charset = C43047d.f410589b;
        String str2 = new String(Base64.decode(str.getBytes(charset), 0), charset);
        Gson gson = new Gson();
        try {
            Type type = new a<AvitoAreaObject>() { // from class: com.avito.android.avito_map.AvitoAreaObjectKt$fromBase64EncodedJsonString$$inlined$fromJsonSafely$1
            }.getType();
            objE = gson.e(str2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
        } catch (Throwable unused) {
        }
        return (AvitoAreaObject) objE;
    }

    @k
    public static final AvitoAreaObject fromValues(@k String str, @k List<AvitoMapPoint> list) {
        List<AvitoMapPoint> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (AvitoMapPoint avitoMapPoint : list2) {
            arrayList.add(C42745f0.j(Double.valueOf(avitoMapPoint.getLongitude()), Double.valueOf(avitoMapPoint.getLatitude())));
        }
        return new AvitoAreaObject(str, C42745f0.j(new ArrayList(arrayList)));
    }
}
