package com.avito.android.remote.model.early_access_advert;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvert.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;", "Landroid/os/Parcelable;", "", "title", "subtitle", "reason", "hint", "buttonTextWithFeedback", "buttonTextWithoutFeedback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeedback;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getReason", "getHint", "getButtonTextWithFeedback", "getButtonTextWithoutFeedback", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EarlyAccessFeedback implements Parcelable {

    @k
    public static final Parcelable.Creator<EarlyAccessFeedback> CREATOR = new Creator();

    @c("buttonTextWithFeedback")
    @l
    private final String buttonTextWithFeedback;

    @c("buttonTextWithoutFeedback")
    @l
    private final String buttonTextWithoutFeedback;

    @c("hint")
    @l
    private final String hint;

    @c("feedbackReason")
    @l
    private final String reason;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: EarlyAccessAdvert.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EarlyAccessFeedback> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EarlyAccessFeedback createFromParcel(@k Parcel parcel) {
            return new EarlyAccessFeedback(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EarlyAccessFeedback[] newArray(int i12) {
            return new EarlyAccessFeedback[i12];
        }
    }

    public EarlyAccessFeedback(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.title = str;
        this.subtitle = str2;
        this.reason = str3;
        this.hint = str4;
        this.buttonTextWithFeedback = str5;
        this.buttonTextWithoutFeedback = str6;
    }

    public static /* synthetic */ EarlyAccessFeedback copy$default(EarlyAccessFeedback earlyAccessFeedback, String str, String str2, String str3, String str4, String str5, String str6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = earlyAccessFeedback.title;
        }
        if ((i12 & 2) != 0) {
            str2 = earlyAccessFeedback.subtitle;
        }
        String str7 = str2;
        if ((i12 & 4) != 0) {
            str3 = earlyAccessFeedback.reason;
        }
        String str8 = str3;
        if ((i12 & 8) != 0) {
            str4 = earlyAccessFeedback.hint;
        }
        String str9 = str4;
        if ((i12 & 16) != 0) {
            str5 = earlyAccessFeedback.buttonTextWithFeedback;
        }
        String str10 = str5;
        if ((i12 & 32) != 0) {
            str6 = earlyAccessFeedback.buttonTextWithoutFeedback;
        }
        return earlyAccessFeedback.copy(str, str7, str8, str9, str10, str6);
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
    public final String getReason() {
        return this.reason;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getButtonTextWithFeedback() {
        return this.buttonTextWithFeedback;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getButtonTextWithoutFeedback() {
        return this.buttonTextWithoutFeedback;
    }

    @k
    public final EarlyAccessFeedback copy(@l String title, @l String subtitle, @l String reason, @l String hint, @l String buttonTextWithFeedback, @l String buttonTextWithoutFeedback) {
        return new EarlyAccessFeedback(title, subtitle, reason, hint, buttonTextWithFeedback, buttonTextWithoutFeedback);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyAccessFeedback)) {
            return false;
        }
        EarlyAccessFeedback earlyAccessFeedback = (EarlyAccessFeedback) other;
        return L.f(this.title, earlyAccessFeedback.title) && L.f(this.subtitle, earlyAccessFeedback.subtitle) && L.f(this.reason, earlyAccessFeedback.reason) && L.f(this.hint, earlyAccessFeedback.hint) && L.f(this.buttonTextWithFeedback, earlyAccessFeedback.buttonTextWithFeedback) && L.f(this.buttonTextWithoutFeedback, earlyAccessFeedback.buttonTextWithoutFeedback);
    }

    @l
    public final String getButtonTextWithFeedback() {
        return this.buttonTextWithFeedback;
    }

    @l
    public final String getButtonTextWithoutFeedback() {
        return this.buttonTextWithoutFeedback;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @l
    public final String getReason() {
        return this.reason;
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
        String str3 = this.reason;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hint;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonTextWithFeedback;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buttonTextWithoutFeedback;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessFeedback(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", reason=");
        sb2.append(this.reason);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", buttonTextWithFeedback=");
        sb2.append(this.buttonTextWithFeedback);
        sb2.append(", buttonTextWithoutFeedback=");
        return C22026a.c(sb2, this.buttonTextWithoutFeedback, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.reason);
        parcel.writeString(this.hint);
        parcel.writeString(this.buttonTextWithFeedback);
        parcel.writeString(this.buttonTextWithoutFeedback);
    }
}
