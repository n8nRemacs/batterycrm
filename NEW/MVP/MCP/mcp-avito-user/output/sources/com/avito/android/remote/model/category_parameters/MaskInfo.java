package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MaskInfo.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MaskInfo;", "Landroid/os/Parcelable;", "", "mask", "Lcom/avito/android/remote/model/Color;", "backgroundColor", "", "constraints", "symbolsMap", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Color;Ljava/util/Map;Ljava/util/Map;)V", "", ChannelContext.Item.PLACEHOLDER, "", "isConstrainedPlaceholder", "(C)Z", "character", "isCharacterMatchesToConstraints", "(CC)Z", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Color;", "getBackgroundColor", "()Lcom/avito/android/remote/model/Color;", "Ljava/util/Map;", "getConstraints", "()Ljava/util/Map;", "getSymbolsMap", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MaskInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<MaskInfo> CREATOR = new Creator();

    @c("color")
    @l
    private final Color backgroundColor;

    @c("constraints")
    @l
    private final Map<String, String> constraints;

    @c("mask")
    @k
    private final String mask;

    @c("symbolsMap")
    @l
    private final Map<String, String> symbolsMap;

    /* compiled from: MaskInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MaskInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MaskInfo createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            Color color = (Color) parcel.readParcelable(MaskInfo.class.getClassLoader());
            int iA2 = 0;
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA3 = 0;
                while (iA3 != i12) {
                    iA3 = C0.a(parcel, linkedHashMap, parcel.readString(), iA3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
            }
            return new MaskInfo(string, color, linkedHashMap, linkedHashMap2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MaskInfo[] newArray(int i12) {
            return new MaskInfo[i12];
        }
    }

    public MaskInfo(@k String str, @l Color color, @l Map<String, String> map, @l Map<String, String> map2) {
        this.mask = str;
        this.backgroundColor = color;
        this.constraints = map;
        this.symbolsMap = map2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final Map<String, String> getConstraints() {
        return this.constraints;
    }

    @k
    public final String getMask() {
        return this.mask;
    }

    @l
    public final Map<String, String> getSymbolsMap() {
        return this.symbolsMap;
    }

    public final boolean isCharacterMatchesToConstraints(char placeholder, char character) {
        String str;
        Map<String, String> map = this.constraints;
        if (map == null || (str = map.get(String.valueOf(placeholder))) == null) {
            return false;
        }
        return C43066x.r(str, character);
    }

    public final boolean isConstrainedPlaceholder(char placeholder) {
        Map<String, String> map = this.constraints;
        return (map != null ? map.get(String.valueOf(placeholder)) : null) != null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.mask);
        parcel.writeParcelable(this.backgroundColor, flags);
        Map<String, String> map = this.constraints;
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
        Map<String, String> map2 = this.symbolsMap;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH2 = C0.h(parcel, 1, map2);
        while (itH2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }
}
