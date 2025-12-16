package com.avito.android.remote.model.auto_contact_models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Models.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/auto_contact_models/Counter;", "Landroid/os/Parcelable;", "", "title", "", "percents", "progressColor", "progressBackground", "details", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/auto_contact_models/Counter;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "I", "getPercents", "getProgressColor", "getProgressBackground", "getDetails", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Counter implements Parcelable {

    @k
    public static final Parcelable.Creator<Counter> CREATOR = new Creator();

    @c("details")
    @k
    private final String details;

    @c("percents")
    private final int percents;

    @c("progressBackground")
    @k
    private final String progressBackground;

    @c("progressColor")
    @k
    private final String progressColor;

    @c("title")
    @k
    private final String title;

    /* compiled from: Models.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Counter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Counter createFromParcel(@k Parcel parcel) {
            return new Counter(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Counter[] newArray(int i12) {
            return new Counter[i12];
        }
    }

    public Counter(@k String str, int i12, @k String str2, @k String str3, @k String str4) {
        this.title = str;
        this.percents = i12;
        this.progressColor = str2;
        this.progressBackground = str3;
        this.details = str4;
    }

    public static /* synthetic */ Counter copy$default(Counter counter, String str, int i12, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = counter.title;
        }
        if ((i13 & 2) != 0) {
            i12 = counter.percents;
        }
        int i14 = i12;
        if ((i13 & 4) != 0) {
            str2 = counter.progressColor;
        }
        String str5 = str2;
        if ((i13 & 8) != 0) {
            str3 = counter.progressBackground;
        }
        String str6 = str3;
        if ((i13 & 16) != 0) {
            str4 = counter.details;
        }
        return counter.copy(str, i14, str5, str6, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPercents() {
        return this.percents;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getProgressColor() {
        return this.progressColor;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getProgressBackground() {
        return this.progressBackground;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @k
    public final Counter copy(@k String title, int percents, @k String progressColor, @k String progressBackground, @k String details) {
        return new Counter(title, percents, progressColor, progressBackground, details);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Counter)) {
            return false;
        }
        Counter counter = (Counter) other;
        return L.f(this.title, counter.title) && this.percents == counter.percents && L.f(this.progressColor, counter.progressColor) && L.f(this.progressBackground, counter.progressBackground) && L.f(this.details, counter.details);
    }

    @k
    public final String getDetails() {
        return this.details;
    }

    public final int getPercents() {
        return this.percents;
    }

    @k
    public final String getProgressBackground() {
        return this.progressBackground;
    }

    @k
    public final String getProgressColor() {
        return this.progressColor;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.details.hashCode() + H.d(H.d(r.e(this.percents, this.title.hashCode() * 31, 31), 31, this.progressColor), 31, this.progressBackground);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Counter(title=");
        sb2.append(this.title);
        sb2.append(", percents=");
        sb2.append(this.percents);
        sb2.append(", progressColor=");
        sb2.append(this.progressColor);
        sb2.append(", progressBackground=");
        sb2.append(this.progressBackground);
        sb2.append(", details=");
        return C22026a.c(sb2, this.details, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeInt(this.percents);
        parcel.writeString(this.progressColor);
        parcel.writeString(this.progressBackground);
        parcel.writeString(this.details);
    }
}
