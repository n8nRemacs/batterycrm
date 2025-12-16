package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: MyAdvertDetails.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertDetails;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/MyAdvertVas;", "vas", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/MyAdvertVas;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/MyAdvertVas;", "getVas", "()Lcom/avito/android/remote/model/MyAdvertVas;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class MyAdvertDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<MyAdvertDetails> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    @c("vas")
    @l
    private final MyAdvertVas vas;

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MyAdvertDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyAdvertDetails createFromParcel(@k Parcel parcel) {
            return new MyAdvertDetails(parcel.readString(), parcel.readInt() == 0 ? null : MyAdvertVas.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyAdvertDetails[] newArray(int i12) {
            return new MyAdvertDetails[i12];
        }
    }

    public MyAdvertDetails(@k String str, @l MyAdvertVas myAdvertVas) {
        this.id = str;
        this.vas = myAdvertVas;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final MyAdvertVas getVas() {
        return this.vas;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        MyAdvertVas myAdvertVas = this.vas;
        if (myAdvertVas == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            myAdvertVas.writeToParcel(parcel, flags);
        }
    }
}
