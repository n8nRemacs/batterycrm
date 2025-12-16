package com.avito.android.photo_picker.converter;

import Y61.k;
import Y61.l;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BitmapConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/converter/a;", "", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final File f219314a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f219315b;

    public a(@k File file, @k LinkedHashMap linkedHashMap) {
        this.f219314a = file;
        this.f219315b = linkedHashMap;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f219314a, aVar.f219314a) && this.f219315b.equals(aVar.f219315b);
    }

    public final int hashCode() {
        return this.f219315b.hashCode() + (this.f219314a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapConversionResult(file=");
        sb2.append(this.f219314a);
        sb2.append(", originalExifData=");
        return h.e(sb2, this.f219315b, ')');
    }
}
