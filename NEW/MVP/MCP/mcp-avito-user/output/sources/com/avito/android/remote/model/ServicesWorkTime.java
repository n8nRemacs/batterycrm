package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServicesWorkTime.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/ServicesWorkTime;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "common", "delimeter", "details", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/ServicesWorkTime;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getCommon", "getDelimeter", "getDetails", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ServicesWorkTime implements Parcelable {

    @k
    public static final Parcelable.Creator<ServicesWorkTime> CREATOR = new Creator();

    @c("common")
    @k
    private final AttributedText common;

    @c("delimeter")
    @l
    private final AttributedText delimeter;

    @c("details")
    @l
    private final AttributedText details;

    /* compiled from: ServicesWorkTime.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServicesWorkTime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServicesWorkTime createFromParcel(@k Parcel parcel) {
            return new ServicesWorkTime((AttributedText) parcel.readParcelable(ServicesWorkTime.class.getClassLoader()), (AttributedText) parcel.readParcelable(ServicesWorkTime.class.getClassLoader()), (AttributedText) parcel.readParcelable(ServicesWorkTime.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServicesWorkTime[] newArray(int i12) {
            return new ServicesWorkTime[i12];
        }
    }

    public ServicesWorkTime(@k AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3) {
        this.common = attributedText;
        this.delimeter = attributedText2;
        this.details = attributedText3;
    }

    public static /* synthetic */ ServicesWorkTime copy$default(ServicesWorkTime servicesWorkTime, AttributedText attributedText, AttributedText attributedText2, AttributedText attributedText3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = servicesWorkTime.common;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = servicesWorkTime.delimeter;
        }
        if ((i12 & 4) != 0) {
            attributedText3 = servicesWorkTime.details;
        }
        return servicesWorkTime.copy(attributedText, attributedText2, attributedText3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getCommon() {
        return this.common;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDelimeter() {
        return this.delimeter;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getDetails() {
        return this.details;
    }

    @k
    public final ServicesWorkTime copy(@k AttributedText common, @l AttributedText delimeter, @l AttributedText details) {
        return new ServicesWorkTime(common, delimeter, details);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicesWorkTime)) {
            return false;
        }
        ServicesWorkTime servicesWorkTime = (ServicesWorkTime) other;
        return L.f(this.common, servicesWorkTime.common) && L.f(this.delimeter, servicesWorkTime.delimeter) && L.f(this.details, servicesWorkTime.details);
    }

    @k
    public final AttributedText getCommon() {
        return this.common;
    }

    @l
    public final AttributedText getDelimeter() {
        return this.delimeter;
    }

    @l
    public final AttributedText getDetails() {
        return this.details;
    }

    public int hashCode() {
        int iHashCode = this.common.hashCode() * 31;
        AttributedText attributedText = this.delimeter;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.details;
        return iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesWorkTime(common=");
        sb2.append(this.common);
        sb2.append(", delimeter=");
        sb2.append(this.delimeter);
        sb2.append(", details=");
        return a.w(sb2, this.details, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.common, flags);
        parcel.writeParcelable(this.delimeter, flags);
        parcel.writeParcelable(this.details, flags);
    }
}
