package com.avito.android.ux.feedback.remote;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UxFeedbackConfig.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/avito/android/ux/feedback/remote/UxFeedbackAttributes;", "Landroid/os/Parcelable;", "", "", "stringAttrs", "", "intAttrs", "", "boolAttrs", "", "doubleAttrs", "Ljava/util/Date;", "dateAttrs", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "f", "c", "e", "d", "_avito_ux-feedback_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UxFeedbackAttributes implements Parcelable {

    @k
    public static final Parcelable.Creator<UxFeedbackAttributes> CREATOR = new a();

    @c("boolAttrs")
    @l
    private final Map<String, Boolean> boolAttrs;

    @c("dateAttrs")
    @l
    private final Map<String, Date> dateAttrs;

    @c("doubleAttrs")
    @l
    private final Map<String, Double> doubleAttrs;

    @c("intAttrs")
    @l
    private final Map<String, Integer> intAttrs;

    @c("stringAttrs")
    @l
    private final Map<String, String> stringAttrs;

    /* compiled from: UxFeedbackConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UxFeedbackAttributes> {
        @Override // android.os.Parcelable.Creator
        public final UxFeedbackAttributes createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            LinkedHashMap linkedHashMap4;
            LinkedHashMap linkedHashMap5 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap6, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashMap7.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                linkedHashMap2 = linkedHashMap7;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashMap8.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                linkedHashMap3 = linkedHashMap8;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap4 = null;
            } else {
                int i17 = parcel.readInt();
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    linkedHashMap9.put(parcel.readString(), Double.valueOf(parcel.readDouble()));
                }
                linkedHashMap4 = linkedHashMap9;
            }
            if (parcel.readInt() != 0) {
                int i19 = parcel.readInt();
                linkedHashMap5 = new LinkedHashMap(i19);
                for (int i22 = 0; i22 != i19; i22++) {
                    linkedHashMap5.put(parcel.readString(), parcel.readSerializable());
                }
            }
            return new UxFeedbackAttributes(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5);
        }

        @Override // android.os.Parcelable.Creator
        public final UxFeedbackAttributes[] newArray(int i12) {
            return new UxFeedbackAttributes[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UxFeedbackAttributes(@l Map<String, String> map, @l Map<String, Integer> map2, @l Map<String, Boolean> map3, @l Map<String, Double> map4, @l Map<String, ? extends Date> map5) {
        this.stringAttrs = map;
        this.intAttrs = map2;
        this.boolAttrs = map3;
        this.doubleAttrs = map4;
        this.dateAttrs = map5;
    }

    @l
    public final Map<String, Boolean> c() {
        return this.boolAttrs;
    }

    @l
    public final Map<String, Date> d() {
        return this.dateAttrs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final Map<String, Double> e() {
        return this.doubleAttrs;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxFeedbackAttributes)) {
            return false;
        }
        UxFeedbackAttributes uxFeedbackAttributes = (UxFeedbackAttributes) obj;
        return L.f(this.stringAttrs, uxFeedbackAttributes.stringAttrs) && L.f(this.intAttrs, uxFeedbackAttributes.intAttrs) && L.f(this.boolAttrs, uxFeedbackAttributes.boolAttrs) && L.f(this.doubleAttrs, uxFeedbackAttributes.doubleAttrs) && L.f(this.dateAttrs, uxFeedbackAttributes.dateAttrs);
    }

    @l
    public final Map<String, Integer> f() {
        return this.intAttrs;
    }

    @l
    public final Map<String, String> g() {
        return this.stringAttrs;
    }

    public final int hashCode() {
        Map<String, String> map = this.stringAttrs;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Integer> map2 = this.intAttrs;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Boolean> map3 = this.boolAttrs;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, Double> map4 = this.doubleAttrs;
        int iHashCode4 = (iHashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, Date> map5 = this.dateAttrs;
        return iHashCode4 + (map5 != null ? map5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UxFeedbackAttributes(stringAttrs=");
        sb2.append(this.stringAttrs);
        sb2.append(", intAttrs=");
        sb2.append(this.intAttrs);
        sb2.append(", boolAttrs=");
        sb2.append(this.boolAttrs);
        sb2.append(", doubleAttrs=");
        sb2.append(this.doubleAttrs);
        sb2.append(", dateAttrs=");
        return r.w(sb2, this.dateAttrs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Map<String, String> map = this.stringAttrs;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Map<String, Integer> map2 = this.intAttrs;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeInt(((Number) entry2.getValue()).intValue());
            }
        }
        Map<String, Boolean> map3 = this.boolAttrs;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH3 = C0.h(parcel, 1, map3);
            while (itH3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) itH3.next();
                parcel.writeString((String) entry3.getKey());
                parcel.writeInt(((Boolean) entry3.getValue()).booleanValue() ? 1 : 0);
            }
        }
        Map<String, Double> map4 = this.doubleAttrs;
        if (map4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH4 = C0.h(parcel, 1, map4);
            while (itH4.hasNext()) {
                Map.Entry entry4 = (Map.Entry) itH4.next();
                parcel.writeString((String) entry4.getKey());
                parcel.writeDouble(((Number) entry4.getValue()).doubleValue());
            }
        }
        Map<String, Date> map5 = this.dateAttrs;
        if (map5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH5 = C0.h(parcel, 1, map5);
        while (itH5.hasNext()) {
            Map.Entry entry5 = (Map.Entry) itH5.next();
            parcel.writeString((String) entry5.getKey());
            parcel.writeSerializable((Serializable) entry5.getValue());
        }
    }
}
