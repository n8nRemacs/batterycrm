package com.avito.android.remote.model.early_access_advert;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvert.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JT\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u0014¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/early_access_advert/EarlyAccessAdvert;", "Landroid/os/Parcelable;", "", "title", "subtitle", "buttonText", "Lcom/avito/android/remote/model/early_access_advert/EarlyAccessData;", "earlyAccessData", "Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;", "positiveFeedback", "negativeFeedback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/early_access_advert/EarlyAccessData;Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/early_access_advert/EarlyAccessData;", "component5", "()Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/early_access_advert/EarlyAccessData;Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;)Lcom/avito/android/remote/model/early_access_advert/EarlyAccessAdvert;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getButtonText", "Lcom/avito/android/remote/model/early_access_advert/EarlyAccessData;", "getEarlyAccessData", "Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;", "getPositiveFeedback", "getNegativeFeedback", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EarlyAccessAdvert implements Parcelable {

    @k
    public static final Parcelable.Creator<EarlyAccessAdvert> CREATOR = new Creator();

    @c("buttonText")
    @l
    private final String buttonText;

    @c("earlyAccessDescription")
    @l
    private final EarlyAccessData earlyAccessData;

    @c("earlyAccessNegativeFeedback")
    @k
    private final EarlyAccessFeedback negativeFeedback;

    @c("earlyAccessPositiveFeedback")
    @k
    private final EarlyAccessFeedback positiveFeedback;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: EarlyAccessAdvert.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EarlyAccessAdvert> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EarlyAccessAdvert createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            EarlyAccessData earlyAccessDataCreateFromParcel = parcel.readInt() == 0 ? null : EarlyAccessData.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<EarlyAccessFeedback> creator = EarlyAccessFeedback.CREATOR;
            return new EarlyAccessAdvert(string, string2, string3, earlyAccessDataCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EarlyAccessAdvert[] newArray(int i12) {
            return new EarlyAccessAdvert[i12];
        }
    }

    public EarlyAccessAdvert(@l String str, @l String str2, @l String str3, @l EarlyAccessData earlyAccessData, @k EarlyAccessFeedback earlyAccessFeedback, @k EarlyAccessFeedback earlyAccessFeedback2) {
        this.title = str;
        this.subtitle = str2;
        this.buttonText = str3;
        this.earlyAccessData = earlyAccessData;
        this.positiveFeedback = earlyAccessFeedback;
        this.negativeFeedback = earlyAccessFeedback2;
    }

    public static /* synthetic */ EarlyAccessAdvert copy$default(EarlyAccessAdvert earlyAccessAdvert, String str, String str2, String str3, EarlyAccessData earlyAccessData, EarlyAccessFeedback earlyAccessFeedback, EarlyAccessFeedback earlyAccessFeedback2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = earlyAccessAdvert.title;
        }
        if ((i12 & 2) != 0) {
            str2 = earlyAccessAdvert.subtitle;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = earlyAccessAdvert.buttonText;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            earlyAccessData = earlyAccessAdvert.earlyAccessData;
        }
        EarlyAccessData earlyAccessData2 = earlyAccessData;
        if ((i12 & 16) != 0) {
            earlyAccessFeedback = earlyAccessAdvert.positiveFeedback;
        }
        EarlyAccessFeedback earlyAccessFeedback3 = earlyAccessFeedback;
        if ((i12 & 32) != 0) {
            earlyAccessFeedback2 = earlyAccessAdvert.negativeFeedback;
        }
        return earlyAccessAdvert.copy(str, str4, str5, earlyAccessData2, earlyAccessFeedback3, earlyAccessFeedback2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final EarlyAccessData getEarlyAccessData() {
        return this.earlyAccessData;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final EarlyAccessFeedback getPositiveFeedback() {
        return this.positiveFeedback;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final EarlyAccessFeedback getNegativeFeedback() {
        return this.negativeFeedback;
    }

    @k
    public final EarlyAccessAdvert copy(@l String title, @l String subtitle, @l String buttonText, @l EarlyAccessData earlyAccessData, @k EarlyAccessFeedback positiveFeedback, @k EarlyAccessFeedback negativeFeedback) {
        return new EarlyAccessAdvert(title, subtitle, buttonText, earlyAccessData, positiveFeedback, negativeFeedback);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyAccessAdvert)) {
            return false;
        }
        EarlyAccessAdvert earlyAccessAdvert = (EarlyAccessAdvert) other;
        return L.f(this.title, earlyAccessAdvert.title) && L.f(this.subtitle, earlyAccessAdvert.subtitle) && L.f(this.buttonText, earlyAccessAdvert.buttonText) && L.f(this.earlyAccessData, earlyAccessAdvert.earlyAccessData) && L.f(this.positiveFeedback, earlyAccessAdvert.positiveFeedback) && L.f(this.negativeFeedback, earlyAccessAdvert.negativeFeedback);
    }

    @l
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    public final EarlyAccessData getEarlyAccessData() {
        return this.earlyAccessData;
    }

    @k
    public final EarlyAccessFeedback getNegativeFeedback() {
        return this.negativeFeedback;
    }

    @k
    public final EarlyAccessFeedback getPositiveFeedback() {
        return this.positiveFeedback;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EarlyAccessData earlyAccessData = this.earlyAccessData;
        return this.negativeFeedback.hashCode() + ((this.positiveFeedback.hashCode() + ((iHashCode3 + (earlyAccessData != null ? earlyAccessData.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public String toString() {
        return "EarlyAccessAdvert(title=" + this.title + ", subtitle=" + this.subtitle + ", buttonText=" + this.buttonText + ", earlyAccessData=" + this.earlyAccessData + ", positiveFeedback=" + this.positiveFeedback + ", negativeFeedback=" + this.negativeFeedback + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.buttonText);
        EarlyAccessData earlyAccessData = this.earlyAccessData;
        if (earlyAccessData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earlyAccessData.writeToParcel(parcel, flags);
        }
        this.positiveFeedback.writeToParcel(parcel, flags);
        this.negativeFeedback.writeToParcel(parcel, flags);
    }
}
