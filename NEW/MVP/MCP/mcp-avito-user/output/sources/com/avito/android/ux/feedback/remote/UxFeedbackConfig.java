package com.avito.android.ux.feedback.remote;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Navigation;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UxFeedbackConfig.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/ux/feedback/remote/UxFeedbackConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/ux/feedback/remote/UxFeedbackAttributes;", Navigation.ATTRIBUTES, "", "", "properties", "<init>", "(Lcom/avito/android/ux/feedback/remote/UxFeedbackAttributes;Ljava/util/Map;)V", "Lcom/avito/android/ux/feedback/remote/UxFeedbackAttributes;", "c", "()Lcom/avito/android/ux/feedback/remote/UxFeedbackAttributes;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "_avito_ux-feedback_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UxFeedbackConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<UxFeedbackConfig> CREATOR = new a();

    @c(Navigation.ATTRIBUTES)
    @l
    private final UxFeedbackAttributes attributes;

    @c("properties")
    @l
    private final Map<String, String> properties;

    /* compiled from: UxFeedbackConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UxFeedbackConfig> {
        @Override // android.os.Parcelable.Creator
        public final UxFeedbackConfig createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap = null;
            UxFeedbackAttributes uxFeedbackAttributesCreateFromParcel = parcel.readInt() == 0 ? null : UxFeedbackAttributes.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new UxFeedbackConfig(uxFeedbackAttributesCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UxFeedbackConfig[] newArray(int i12) {
            return new UxFeedbackConfig[i12];
        }
    }

    public UxFeedbackConfig(@l UxFeedbackAttributes uxFeedbackAttributes, @l Map<String, String> map) {
        this.attributes = uxFeedbackAttributes;
        this.properties = map;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UxFeedbackAttributes getAttributes() {
        return this.attributes;
    }

    @l
    public final Map<String, String> d() {
        return this.properties;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxFeedbackConfig)) {
            return false;
        }
        UxFeedbackConfig uxFeedbackConfig = (UxFeedbackConfig) obj;
        return L.f(this.attributes, uxFeedbackConfig.attributes) && L.f(this.properties, uxFeedbackConfig.properties);
    }

    public final int hashCode() {
        UxFeedbackAttributes uxFeedbackAttributes = this.attributes;
        int iHashCode = (uxFeedbackAttributes == null ? 0 : uxFeedbackAttributes.hashCode()) * 31;
        Map<String, String> map = this.properties;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UxFeedbackConfig(attributes=");
        sb2.append(this.attributes);
        sb2.append(", properties=");
        return r.w(sb2, this.properties, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        UxFeedbackAttributes uxFeedbackAttributes = this.attributes;
        if (uxFeedbackAttributes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uxFeedbackAttributes.writeToParcel(parcel, i12);
        }
        Map<String, String> map = this.properties;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
