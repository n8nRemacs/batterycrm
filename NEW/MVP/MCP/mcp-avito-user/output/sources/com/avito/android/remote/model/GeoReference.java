package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: GeoReference.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001%BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/GeoReference;", "Landroid/os/Parcelable;", "", "", "colors", "content", "after", "Lcom/avito/android/remote/model/AfterWithIcon;", "afterWithIcon", "Lcom/avito/android/remote/model/GeoReference$AdditionalInfo;", "additionalInfo", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AfterWithIcon;Lcom/avito/android/remote/model/GeoReference$AdditionalInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "getAfter", "Lcom/avito/android/remote/model/AfterWithIcon;", "getAfterWithIcon", "()Lcom/avito/android/remote/model/AfterWithIcon;", "Lcom/avito/android/remote/model/GeoReference$AdditionalInfo;", "getAdditionalInfo", "()Lcom/avito/android/remote/model/GeoReference$AdditionalInfo;", "setAdditionalInfo", "(Lcom/avito/android/remote/model/GeoReference$AdditionalInfo;)V", "AdditionalInfo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GeoReference implements Parcelable {

    @k
    public static final Parcelable.Creator<GeoReference> CREATOR = new Creator();

    @c("additionalInfo")
    @l
    private AdditionalInfo additionalInfo;

    @c("after")
    @l
    private final String after;

    @c("afterWithIcon")
    @l
    private final AfterWithIcon afterWithIcon;

    @c("colors")
    @l
    private final List<String> colors;

    @c("content")
    @l
    private final String content;

    /* compiled from: GeoReference.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/GeoReference$AdditionalInfo;", "Landroid/os/Parcelable;", "", "content", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/GeoReference$AdditionalInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getContent", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AdditionalInfo implements Parcelable {

        @c("content")
        @l
        private final String content;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        @k
        public static final Parcelable.Creator<AdditionalInfo> CREATOR = new Creator();

        /* compiled from: GeoReference.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/GeoReference$AdditionalInfo$Companion;", "", "()V", "isNotNullAndNotEmpty", "", "Lcom/avito/android/remote/model/GeoReference$AdditionalInfo;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            public final boolean isNotNullAndNotEmpty(@l AdditionalInfo additionalInfo) {
                if (additionalInfo == null) {
                    return false;
                }
                String content = additionalInfo.getContent();
                return content != null ? C43066x.K(content) ^ true : false;
            }

            private Companion() {
            }
        }

        /* compiled from: GeoReference.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdditionalInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdditionalInfo createFromParcel(@k Parcel parcel) {
                return new AdditionalInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdditionalInfo[] newArray(int i12) {
                return new AdditionalInfo[i12];
            }
        }

        public AdditionalInfo(@l String str) {
            this.content = str;
        }

        public static /* synthetic */ AdditionalInfo copy$default(AdditionalInfo additionalInfo, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = additionalInfo.content;
            }
            return additionalInfo.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @k
        public final AdditionalInfo copy(@l String content) {
            return new AdditionalInfo(content);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdditionalInfo) && L.f(this.content, ((AdditionalInfo) other).content);
        }

        @l
        public final String getContent() {
            return this.content;
        }

        public int hashCode() {
            String str = this.content;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("AdditionalInfo(content="), this.content, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.content);
        }
    }

    /* compiled from: GeoReference.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GeoReference> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoReference createFromParcel(@k Parcel parcel) {
            return new GeoReference(parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AfterWithIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AdditionalInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoReference[] newArray(int i12) {
            return new GeoReference[i12];
        }
    }

    public GeoReference(@l List<String> list, @l String str, @l String str2, @l AfterWithIcon afterWithIcon, @l AdditionalInfo additionalInfo) {
        this.colors = list;
        this.content = str;
        this.after = str2;
        this.afterWithIcon = afterWithIcon;
        this.additionalInfo = additionalInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @l
    public final String getAfter() {
        return this.after;
    }

    @l
    public final AfterWithIcon getAfterWithIcon() {
        return this.afterWithIcon;
    }

    @l
    public final List<String> getColors() {
        return this.colors;
    }

    @l
    public final String getContent() {
        return this.content;
    }

    public final void setAdditionalInfo(@l AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.colors);
        parcel.writeString(this.content);
        parcel.writeString(this.after);
        AfterWithIcon afterWithIcon = this.afterWithIcon;
        if (afterWithIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            afterWithIcon.writeToParcel(parcel, flags);
        }
        AdditionalInfo additionalInfo = this.additionalInfo;
        if (additionalInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalInfo.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ GeoReference(List list, String str, String str2, AfterWithIcon afterWithIcon, AdditionalInfo additionalInfo, int i12, C42822w c42822w) {
        this(list, str, str2, (i12 & 8) != 0 ? null : afterWithIcon, (i12 & 16) != 0 ? null : additionalInfo);
    }
}
