package com.avito.android.remote.model.submission;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RealtyAddressSubmissionResult.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionInfo;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAdvert;", "advertisement", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;", "activateAction", "continueAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAdvert;Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAdvert;", "getAdvertisement", "()Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAdvert;", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;", "getActivateAction", "()Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;", "getContinueAction", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealtyAddressSubmissionInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyAddressSubmissionInfo> CREATOR = new Creator();

    @c("activateAction")
    @l
    private final RealtyAddressSubmissionResultAction activateAction;

    @c("advertisement")
    @k
    private final RealtyAddressSubmissionResultAdvert advertisement;

    @c("continueAction")
    @l
    private final RealtyAddressSubmissionResultAction continueAction;

    @c("description")
    @k
    private final String description;

    @c("title")
    @k
    private final String title;

    /* compiled from: RealtyAddressSubmissionResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyAddressSubmissionInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyAddressSubmissionInfo createFromParcel(@k Parcel parcel) {
            return new RealtyAddressSubmissionInfo(parcel.readString(), parcel.readString(), RealtyAddressSubmissionResultAdvert.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RealtyAddressSubmissionResultAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RealtyAddressSubmissionResultAction.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyAddressSubmissionInfo[] newArray(int i12) {
            return new RealtyAddressSubmissionInfo[i12];
        }
    }

    public RealtyAddressSubmissionInfo(@k String str, @k String str2, @k RealtyAddressSubmissionResultAdvert realtyAddressSubmissionResultAdvert, @l RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction, @l RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction2) {
        this.title = str;
        this.description = str2;
        this.advertisement = realtyAddressSubmissionResultAdvert;
        this.activateAction = realtyAddressSubmissionResultAction;
        this.continueAction = realtyAddressSubmissionResultAction2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final RealtyAddressSubmissionResultAction getActivateAction() {
        return this.activateAction;
    }

    @k
    public final RealtyAddressSubmissionResultAdvert getAdvertisement() {
        return this.advertisement;
    }

    @l
    public final RealtyAddressSubmissionResultAction getContinueAction() {
        return this.continueAction;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        this.advertisement.writeToParcel(parcel, flags);
        RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction = this.activateAction;
        if (realtyAddressSubmissionResultAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realtyAddressSubmissionResultAction.writeToParcel(parcel, flags);
        }
        RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction2 = this.continueAction;
        if (realtyAddressSubmissionResultAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realtyAddressSubmissionResultAction2.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ RealtyAddressSubmissionInfo(String str, String str2, RealtyAddressSubmissionResultAdvert realtyAddressSubmissionResultAdvert, RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction, RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction2, int i12, C42822w c42822w) {
        this(str, str2, realtyAddressSubmissionResultAdvert, (i12 & 8) != 0 ? null : realtyAddressSubmissionResultAction, (i12 & 16) != 0 ? null : realtyAddressSubmissionResultAction2);
    }
}
