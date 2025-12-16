package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotSeller;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotAvatar;", "avatar", "<init>", "(Ljava/lang/String;Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotAvatar;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotAvatar;", "c", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotAvatar;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetSlotSeller implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetSlotSeller> CREATOR = new a();

    @c("avatar")
    @k
    private final GigShiftsWidgetSlotAvatar avatar;

    @c("name")
    @k
    private final String name;

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetSlotSeller> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotSeller createFromParcel(Parcel parcel) {
            return new GigShiftsWidgetSlotSeller(parcel.readString(), GigShiftsWidgetSlotAvatar.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotSeller[] newArray(int i12) {
            return new GigShiftsWidgetSlotSeller[i12];
        }
    }

    public GigShiftsWidgetSlotSeller(@k String str, @k GigShiftsWidgetSlotAvatar gigShiftsWidgetSlotAvatar) {
        this.name = str;
        this.avatar = gigShiftsWidgetSlotAvatar;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final GigShiftsWidgetSlotAvatar getAvatar() {
        return this.avatar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.name);
        this.avatar.writeToParcel(parcel, i12);
    }
}
