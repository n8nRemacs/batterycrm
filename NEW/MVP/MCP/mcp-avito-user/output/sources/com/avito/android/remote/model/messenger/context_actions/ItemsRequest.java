package com.avito.android.remote.model.messenger.context_actions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemsRequest.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/ItemsRequest;", "Landroid/os/Parcelable;", "", "method", "Lcom/avito/android/remote/model/RawJson;", "params", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/RawJson;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMethod", "Lcom/avito/android/remote/model/RawJson;", "getParams", "()Lcom/avito/android/remote/model/RawJson;", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ItemsRequest implements Parcelable {

    @k
    public static final String METHOD = "method";

    @k
    public static final String PARAMS = "params";

    @c("method")
    @k
    private final String method;

    @c("params")
    @l
    private final RawJson params;

    @k
    public static final Parcelable.Creator<ItemsRequest> CREATOR = new Creator();

    /* compiled from: ItemsRequest.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemsRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemsRequest createFromParcel(@k Parcel parcel) {
            return new ItemsRequest(parcel.readString(), parcel.readInt() == 0 ? null : RawJson.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemsRequest[] newArray(int i12) {
            return new ItemsRequest[i12];
        }
    }

    public ItemsRequest(@k String str, @l RawJson rawJson) {
        this.method = str;
        this.params = rawJson;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemsRequest)) {
            return false;
        }
        ItemsRequest itemsRequest = (ItemsRequest) other;
        return L.f(this.method, itemsRequest.method) && L.f(this.params, itemsRequest.params);
    }

    @k
    public final String getMethod() {
        return this.method;
    }

    @l
    public final RawJson getParams() {
        return this.params;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        RawJson rawJson = this.params;
        return iHashCode + (rawJson != null ? rawJson.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ItemsRequest(method='" + this.method + "', params=" + this.params + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.method);
        RawJson rawJson = this.params;
        if (rawJson == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rawJson.writeToParcel(parcel, flags);
        }
    }
}
