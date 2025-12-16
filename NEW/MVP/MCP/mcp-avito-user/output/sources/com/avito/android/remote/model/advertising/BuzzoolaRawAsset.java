package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.media3.common.C23088b;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BuzzoolaRawResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000b\u0010\u0006\u001a\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0002\b\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00070\u0004¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\r\b\u0002\u0010\u0006\u001a\u00070\u0004¢\u0006\u0002\b\u00052\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0002\b\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001f\u0010\u0006\u001a\u00070\u0004¢\u0006\u0002\b\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000eR-\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0002\b\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0010¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/advertising/BuzzoolaRawAsset;", "Landroid/os/Parcelable;", "", "type", "", "LK51/e;", "value", "", "ext", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)Lcom/avito/android/remote/model/advertising/BuzzoolaRawAsset;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Ljava/lang/Object;", "getValue", "Ljava/util/Map;", "getExt", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BuzzoolaRawAsset implements Parcelable {

    @k
    public static final Parcelable.Creator<BuzzoolaRawAsset> CREATOR = new Creator();

    @c("ext")
    @l
    private final Map<String, Object> ext;

    @c("type")
    @k
    private final String type;

    @c("value")
    @k
    private final Object value;

    /* compiled from: BuzzoolaRawResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuzzoolaRawAsset> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuzzoolaRawAsset createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            Object value = parcel.readValue(BuzzoolaRawAsset.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(BuzzoolaRawAsset.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BuzzoolaRawAsset(string, value, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuzzoolaRawAsset[] newArray(int i12) {
            return new BuzzoolaRawAsset[i12];
        }
    }

    public BuzzoolaRawAsset(@k String str, @k Object obj, @l Map<String, ? extends Object> map) {
        this.type = str;
        this.value = obj;
        this.ext = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuzzoolaRawAsset copy$default(BuzzoolaRawAsset buzzoolaRawAsset, String str, Object obj, Map map, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = buzzoolaRawAsset.type;
        }
        if ((i12 & 2) != 0) {
            obj = buzzoolaRawAsset.value;
        }
        if ((i12 & 4) != 0) {
            map = buzzoolaRawAsset.ext;
        }
        return buzzoolaRawAsset.copy(str, obj, map);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @l
    public final Map<String, Object> component3() {
        return this.ext;
    }

    @k
    public final BuzzoolaRawAsset copy(@k String type, @k Object value, @l Map<String, ? extends Object> ext) {
        return new BuzzoolaRawAsset(type, value, ext);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuzzoolaRawAsset)) {
            return false;
        }
        BuzzoolaRawAsset buzzoolaRawAsset = (BuzzoolaRawAsset) other;
        return L.f(this.type, buzzoolaRawAsset.type) && L.f(this.value, buzzoolaRawAsset.value) && L.f(this.ext, buzzoolaRawAsset.ext);
    }

    @l
    public final Map<String, Object> getExt() {
        return this.ext;
    }

    @k
    public final String getType() {
        return this.type;
    }

    @k
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iA2 = C23088b.a(this.type.hashCode() * 31, 31, this.value);
        Map<String, Object> map = this.ext;
        return iA2 + (map == null ? 0 : map.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BuzzoolaRawAsset(type=");
        sb2.append(this.type);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", ext=");
        return r.w(sb2, this.ext, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type);
        parcel.writeValue(this.value);
        Map<String, Object> map = this.ext;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
