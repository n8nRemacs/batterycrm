package com.avito.android.util;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: UtmHelper.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/UtmParams;", "Landroid/os/Parcelable;", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UtmParams implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f318752b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f318750c = new a(null);

    @Y61.k
    public static final Parcelable.Creator<UtmParams> CREATOR = new b();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<String> f318751d = C42745f0.U("utm_medium", "utm_source", "utm_campaign", "utm_content", "utm_term");

    /* compiled from: UtmHelper.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/util/UtmParams$a;", "", "<init>", "()V", "", "", "paramsList", "Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static UtmParams a(@Y61.k Uri uri) {
            List<String> list = UtmParams.f318751d;
            int iF2 = kotlin.collections.P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (String str : list) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
            return new UtmParams(C35755b0.c(linkedHashMap));
        }

        public a() {
        }
    }

    /* compiled from: UtmHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UtmParams> {
        @Override // android.os.Parcelable.Creator
        public final UtmParams createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = com.akita.compose.theme.re23.style.C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new UtmParams(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UtmParams[] newArray(int i12) {
            return new UtmParams[i12];
        }
    }

    public UtmParams(@Y61.k LinkedHashMap linkedHashMap) {
        this.f318752b = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UtmParams) && this.f318752b.equals(((UtmParams) obj).f318752b);
    }

    public final int hashCode() {
        return this.f318752b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return org.webrtc.h.e(new StringBuilder("UtmParams(paramsMap="), this.f318752b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        LinkedHashMap linkedHashMap = this.f318752b;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
