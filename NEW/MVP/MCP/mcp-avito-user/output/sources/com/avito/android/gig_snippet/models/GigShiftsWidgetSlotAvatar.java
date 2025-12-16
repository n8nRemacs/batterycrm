package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotAvatar;", "Landroid/os/Parcelable;", "", "defaultUrl", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetSlotAvatar implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetSlotAvatar> CREATOR = new a();

    @c("defaultUrl")
    @l
    private final String defaultUrl;

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetSlotAvatar> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotAvatar createFromParcel(Parcel parcel) {
            return new GigShiftsWidgetSlotAvatar(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotAvatar[] newArray(int i12) {
            return new GigShiftsWidgetSlotAvatar[i12];
        }
    }

    public GigShiftsWidgetSlotAvatar(@l String str) {
        this.defaultUrl = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDefaultUrl() {
        return this.defaultUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.defaultUrl);
    }
}
