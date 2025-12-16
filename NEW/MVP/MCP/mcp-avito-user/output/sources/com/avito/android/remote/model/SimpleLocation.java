package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SimpleLocation.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/SimpleLocation;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Entity;", "", "id", "Lcom/avito/android/remote/model/CaseText;", "names", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/CaseText;)V", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/CaseText;", "getNames", "()Lcom/avito/android/remote/model/CaseText;", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SimpleLocation implements Parcelable, Entity<String> {

    @k
    public static final Parcelable.Creator<SimpleLocation> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    @c("names")
    @k
    private final CaseText names;

    /* compiled from: SimpleLocation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SimpleLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SimpleLocation createFromParcel(@k Parcel parcel) {
            return new SimpleLocation(parcel.readString(), CaseText.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SimpleLocation[] newArray(int i12) {
            return new SimpleLocation[i12];
        }
    }

    public SimpleLocation(@k String str, @k CaseText caseText) {
        this.id = str;
        this.names = caseText;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof Location)) {
            return L.f(((Location) other).getId(), getId());
        }
        return false;
    }

    @Override // com.avito.android.remote.model.Entity
    @l
    /* renamed from: getName */
    public String getF156312c() {
        return this.names.getName();
    }

    @k
    public final CaseText getNames() {
        return this.names;
    }

    public int hashCode() {
        return getId().hashCode() + 31;
    }

    @k
    public String toString() {
        return "Location[" + getId() + ", " + getF156312c() + ']';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        this.names.writeToParcel(parcel, flags);
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    public String getId() {
        return this.id;
    }

    public SimpleLocation(@k String str, @k String str2) {
        this(str, new CaseText());
        this.names.setName(1, str2);
    }
}
