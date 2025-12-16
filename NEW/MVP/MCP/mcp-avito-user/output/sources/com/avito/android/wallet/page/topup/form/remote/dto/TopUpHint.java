package com.avito.android.wallet.page.topup.form.remote.dto;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: TopUpHint.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/remote/dto/TopUpHint;", "Landroid/os/Parcelable;", "", "title", "", "value", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "I", "c", "()I", "getId", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TopUpHint implements Parcelable {

    @k
    public static final Parcelable.Creator<TopUpHint> CREATOR = new a();

    @c("fieldId")
    @k
    private final String id;

    @c("title")
    @k
    private final String title;

    @c("value")
    private final int value;

    /* compiled from: TopUpHint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TopUpHint> {
        @Override // android.os.Parcelable.Creator
        public final TopUpHint createFromParcel(Parcel parcel) {
            return new TopUpHint(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TopUpHint[] newArray(int i12) {
            return new TopUpHint[i12];
        }
    }

    public TopUpHint(@k String str, int i12, @k String str2) {
        this.title = str;
        this.value = i12;
        this.id = str2;
    }

    /* renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeInt(this.value);
        parcel.writeString(this.id);
    }
}
