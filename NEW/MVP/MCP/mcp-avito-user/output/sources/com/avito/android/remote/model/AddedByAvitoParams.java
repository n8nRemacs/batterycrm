package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddedByAvitoParams.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\f¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/AddedByAvitoParams;", "Landroid/os/Parcelable;", "", "", "addedByAvitoImagesIndexes", "", "addedByAvitoImagesLabel", "<init>", "(Ljava/util/Set;Ljava/lang/String;)V", "component1", "()Ljava/util/Set;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/Set;Ljava/lang/String;)Lcom/avito/android/remote/model/AddedByAvitoParams;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Set;", "getAddedByAvitoImagesIndexes", "Ljava/lang/String;", "getAddedByAvitoImagesLabel", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AddedByAvitoParams implements Parcelable {

    @k
    public static final Parcelable.Creator<AddedByAvitoParams> CREATOR = new Creator();

    @c("addedByAvitoImagesIndexes")
    @k
    private final Set<Integer> addedByAvitoImagesIndexes;

    @c("addedByAvitoImagesLabel")
    @k
    private final String addedByAvitoImagesLabel;

    /* compiled from: AddedByAvitoParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddedByAvitoParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddedByAvitoParams createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashSet.add(Integer.valueOf(parcel.readInt()));
            }
            return new AddedByAvitoParams(linkedHashSet, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddedByAvitoParams[] newArray(int i12) {
            return new AddedByAvitoParams[i12];
        }
    }

    public AddedByAvitoParams(@k Set<Integer> set, @k String str) {
        this.addedByAvitoImagesIndexes = set;
        this.addedByAvitoImagesLabel = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddedByAvitoParams copy$default(AddedByAvitoParams addedByAvitoParams, Set set, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            set = addedByAvitoParams.addedByAvitoImagesIndexes;
        }
        if ((i12 & 2) != 0) {
            str = addedByAvitoParams.addedByAvitoImagesLabel;
        }
        return addedByAvitoParams.copy(set, str);
    }

    @k
    public final Set<Integer> component1() {
        return this.addedByAvitoImagesIndexes;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getAddedByAvitoImagesLabel() {
        return this.addedByAvitoImagesLabel;
    }

    @k
    public final AddedByAvitoParams copy(@k Set<Integer> addedByAvitoImagesIndexes, @k String addedByAvitoImagesLabel) {
        return new AddedByAvitoParams(addedByAvitoImagesIndexes, addedByAvitoImagesLabel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddedByAvitoParams)) {
            return false;
        }
        AddedByAvitoParams addedByAvitoParams = (AddedByAvitoParams) other;
        return L.f(this.addedByAvitoImagesIndexes, addedByAvitoParams.addedByAvitoImagesIndexes) && L.f(this.addedByAvitoImagesLabel, addedByAvitoParams.addedByAvitoImagesLabel);
    }

    @k
    public final Set<Integer> getAddedByAvitoImagesIndexes() {
        return this.addedByAvitoImagesIndexes;
    }

    @k
    public final String getAddedByAvitoImagesLabel() {
        return this.addedByAvitoImagesLabel;
    }

    public int hashCode() {
        return this.addedByAvitoImagesLabel.hashCode() + (this.addedByAvitoImagesIndexes.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AddedByAvitoParams(addedByAvitoImagesIndexes=");
        sb2.append(this.addedByAvitoImagesIndexes);
        sb2.append(", addedByAvitoImagesLabel=");
        return C22026a.c(sb2, this.addedByAvitoImagesLabel, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Set<Integer> set = this.addedByAvitoImagesIndexes;
        parcel.writeInt(set.size());
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeString(this.addedByAvitoImagesLabel);
    }
}
