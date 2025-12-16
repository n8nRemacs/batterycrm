package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilters;", "Landroid/os/Parcelable;", "", "status", "Lcom/avito/android/remote/model/search/Result;", "result", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/Result;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/search/Result;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/Result;)Lcom/avito/android/remote/model/search/InlineFilters;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStatus", "Lcom/avito/android/remote/model/search/Result;", "getResult", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InlineFilters implements Parcelable {

    @k
    public static final Parcelable.Creator<InlineFilters> CREATOR = new Creator();

    @c("result")
    @l
    private final Result result;

    @c("status")
    @l
    private final String status;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InlineFilters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InlineFilters createFromParcel(@k Parcel parcel) {
            return new InlineFilters(parcel.readString(), parcel.readInt() == 0 ? null : Result.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InlineFilters[] newArray(int i12) {
            return new InlineFilters[i12];
        }
    }

    public InlineFilters(@l String str, @l Result result) {
        this.status = str;
        this.result = result;
    }

    public static /* synthetic */ InlineFilters copy$default(InlineFilters inlineFilters, String str, Result result, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = inlineFilters.status;
        }
        if ((i12 & 2) != 0) {
            result = inlineFilters.result;
        }
        return inlineFilters.copy(str, result);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    @k
    public final InlineFilters copy(@l String status, @l Result result) {
        return new InlineFilters(status, result);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineFilters)) {
            return false;
        }
        InlineFilters inlineFilters = (InlineFilters) other;
        return L.f(this.status, inlineFilters.status) && L.f(this.result, inlineFilters.result);
    }

    @l
    public final Result getResult() {
        return this.result;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Result result = this.result;
        return iHashCode + (result != null ? result.hashCode() : 0);
    }

    @k
    public String toString() {
        return "InlineFilters(status=" + this.status + ", result=" + this.result + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.status);
        Result result = this.result;
        if (result == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            result.writeToParcel(parcel, flags);
        }
    }
}
