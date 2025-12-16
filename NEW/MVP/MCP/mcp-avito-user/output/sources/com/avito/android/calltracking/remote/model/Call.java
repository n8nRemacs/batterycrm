package com.avito.android.calltracking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;

/* compiled from: CalltrackingResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u000e\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/avito/android/calltracking/remote/model/Call;", "Landroid/os/Parcelable;", "", FailedBinderCallBack.CALLER_ID, "callTime", "type", "phoneText", "itemDescription", "price", "Lcom/avito/android/remote/model/Image;", "image", "", "isMissed", "isNew", "isHidden", "userPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;ZZZLjava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "getType", "f", "e", "getPrice", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Z", "h", "()Z", "i", "g", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Call implements Parcelable {

    @k
    public static final Parcelable.Creator<Call> CREATOR = new a();

    @c(FailedBinderCallBack.CALLER_ID)
    @k
    private final String callId;

    @c("callTime")
    @k
    private final String callTime;

    @c("image")
    @l
    private final Image image;

    @c("isHidden")
    private final boolean isHidden;

    @c("isMissed")
    private final boolean isMissed;

    @c("isNew")
    private final boolean isNew;

    @c("itemText")
    @l
    private final String itemDescription;

    @c("phoneText")
    @k
    private final String phoneText;

    @c("price")
    @l
    private final String price;

    @c("type")
    @k
    private final String type;

    @c("userPhone")
    @l
    private final String userPhone;

    /* compiled from: CalltrackingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Call> {
        @Override // android.os.Parcelable.Creator
        public final Call createFromParcel(Parcel parcel) {
            return new Call(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Call.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Call[] newArray(int i12) {
            return new Call[i12];
        }
    }

    public Call(@k String str, @k String str2, @k String str3, @k String str4, @l String str5, @l String str6, @l Image image, boolean z12, boolean z13, boolean z14, @l String str7) {
        this.callId = str;
        this.callTime = str2;
        this.type = str3;
        this.phoneText = str4;
        this.itemDescription = str5;
        this.price = str6;
        this.image = image;
        this.isMissed = z12;
        this.isNew = z13;
        this.isHidden = z14;
        this.userPhone = str7;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getCallTime() {
        return this.callTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getPhoneText() {
        return this.phoneText;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getUserPhone() {
        return this.userPhone;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @k
    public final String getType() {
        return this.type;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsMissed() {
        return this.isMissed;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.callId);
        parcel.writeString(this.callTime);
        parcel.writeString(this.type);
        parcel.writeString(this.phoneText);
        parcel.writeString(this.itemDescription);
        parcel.writeString(this.price);
        parcel.writeParcelable(this.image, i12);
        parcel.writeInt(this.isMissed ? 1 : 0);
        parcel.writeInt(this.isNew ? 1 : 0);
        parcel.writeInt(this.isHidden ? 1 : 0);
        parcel.writeString(this.userPhone);
    }
}
