package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AutoDeal.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/AutoDeal;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/SimpleAction;", "action", "", "isRemoteAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SimpleAction;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/SimpleAction;", "getAction", "()Lcom/avito/android/remote/model/SimpleAction;", "Z", "()Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AutoDeal implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoDeal> CREATOR = new Creator();

    @c("action")
    @k
    private final SimpleAction action;

    @c("description")
    @k
    private final String description;

    @c("isRemoteAvailable")
    private final boolean isRemoteAvailable;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutoDeal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoDeal> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoDeal createFromParcel(@k Parcel parcel) {
            return new AutoDeal(parcel.readString(), parcel.readString(), SimpleAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoDeal[] newArray(int i12) {
            return new AutoDeal[i12];
        }
    }

    public AutoDeal(@k String str, @k String str2, @k SimpleAction simpleAction, boolean z12) {
        this.title = str;
        this.description = str2;
        this.action = simpleAction;
        this.isRemoteAvailable = z12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final SimpleAction getAction() {
        return this.action;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: isRemoteAvailable, reason: from getter */
    public final boolean getIsRemoteAvailable() {
        return this.isRemoteAvailable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        this.action.writeToParcel(parcel, flags);
        parcel.writeInt(this.isRemoteAvailable ? 1 : 0);
    }
}
