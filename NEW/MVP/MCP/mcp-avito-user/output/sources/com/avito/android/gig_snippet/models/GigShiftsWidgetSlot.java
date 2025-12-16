package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlot;", "Landroid/os/Parcelable;", "", "id", "", TooltipAttribute.PARAM_DEEP_LINK, "", "isDisable", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader;", "header", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer;", "timer", "gigerStartTime", "gigerEndTime", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetActionButtons;", "actionButtons", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetShiftData;", "shiftData", "<init>", "(Ljava/lang/Long;Ljava/lang/String;ZLcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader;Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/gig_snippet/models/GigShiftsWidgetActionButtons;Lcom/avito/android/gig_snippet/models/GigShiftsWidgetShiftData;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Z", "h", "()Z", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader;", "d", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotHeader;", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer;", "f", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer;", "getGigerStartTime", "getGigerEndTime", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetActionButtons;", "c", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetActionButtons;", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetShiftData;", "e", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetShiftData;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetSlot implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetSlot> CREATOR = new a();

    @c("actionButtons")
    @k
    private final GigShiftsWidgetActionButtons actionButtons;

    @c("gigerEndTime")
    @l
    private final String gigerEndTime;

    @c("gigerStartTime")
    @l
    private final String gigerStartTime;

    @c("header")
    @l
    private final GigShiftsWidgetSlotHeader header;

    @c("id")
    @l
    private final Long id;

    @c("isDisable")
    private final boolean isDisable;

    @c("shiftData")
    @k
    private final GigShiftsWidgetShiftData shiftData;

    @c("timer")
    @l
    private final GigShiftsWidgetSlotTimer timer;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final String uri;

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetSlot> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlot createFromParcel(Parcel parcel) {
            return new GigShiftsWidgetSlot(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : GigShiftsWidgetSlotHeader.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GigShiftsWidgetSlotTimer.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), GigShiftsWidgetActionButtons.CREATOR.createFromParcel(parcel), GigShiftsWidgetShiftData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlot[] newArray(int i12) {
            return new GigShiftsWidgetSlot[i12];
        }
    }

    public GigShiftsWidgetSlot(@l Long l12, @k String str, boolean z12, @l GigShiftsWidgetSlotHeader gigShiftsWidgetSlotHeader, @l GigShiftsWidgetSlotTimer gigShiftsWidgetSlotTimer, @l String str2, @l String str3, @k GigShiftsWidgetActionButtons gigShiftsWidgetActionButtons, @k GigShiftsWidgetShiftData gigShiftsWidgetShiftData) {
        this.id = l12;
        this.uri = str;
        this.isDisable = z12;
        this.header = gigShiftsWidgetSlotHeader;
        this.timer = gigShiftsWidgetSlotTimer;
        this.gigerStartTime = str2;
        this.gigerEndTime = str3;
        this.actionButtons = gigShiftsWidgetActionButtons;
        this.shiftData = gigShiftsWidgetShiftData;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final GigShiftsWidgetActionButtons getActionButtons() {
        return this.actionButtons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final GigShiftsWidgetSlotHeader getHeader() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final GigShiftsWidgetShiftData getShiftData() {
        return this.shiftData;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final GigShiftsWidgetSlotTimer getTimer() {
        return this.timer;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsDisable() {
        return this.isDisable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.id;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.uri);
        parcel.writeInt(this.isDisable ? 1 : 0);
        GigShiftsWidgetSlotHeader gigShiftsWidgetSlotHeader = this.header;
        if (gigShiftsWidgetSlotHeader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftsWidgetSlotHeader.writeToParcel(parcel, i12);
        }
        GigShiftsWidgetSlotTimer gigShiftsWidgetSlotTimer = this.timer;
        if (gigShiftsWidgetSlotTimer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftsWidgetSlotTimer.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.gigerStartTime);
        parcel.writeString(this.gigerEndTime);
        this.actionButtons.writeToParcel(parcel, i12);
        this.shiftData.writeToParcel(parcel, i12);
    }
}
