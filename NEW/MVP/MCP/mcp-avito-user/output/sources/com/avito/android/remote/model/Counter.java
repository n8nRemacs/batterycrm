package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Counter.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/Counter;", "Landroid/os/Parcelable;", "", "totalCount", "", "visibleObjectsCount", "Lcom/avito/android/remote/model/NoVisibleObjectsCurtain;", "noVisibleObjectsCurtain", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/NoVisibleObjectsCurtain;Ljava/lang/Boolean;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTotalCount", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getVisibleObjectsCount", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/NoVisibleObjectsCurtain;", "getNoVisibleObjectsCurtain", "()Lcom/avito/android/remote/model/NoVisibleObjectsCurtain;", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_search-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Counter implements Parcelable {

    @k
    public static final Parcelable.Creator<Counter> CREATOR = new Creator();

    @c("enabled")
    @l
    private final Boolean enabled;

    @c("noVisibleObjectsCurtain")
    @l
    private final NoVisibleObjectsCurtain noVisibleObjectsCurtain;

    @c("totalCount")
    @l
    private final String totalCount;

    @c("visibleObjectsCount")
    @l
    private final Integer visibleObjectsCount;

    /* compiled from: Counter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Counter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Counter createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            NoVisibleObjectsCurtain noVisibleObjectsCurtainCreateFromParcel = parcel.readInt() == 0 ? null : NoVisibleObjectsCurtain.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Counter(string, numValueOf, noVisibleObjectsCurtainCreateFromParcel, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Counter[] newArray(int i12) {
            return new Counter[i12];
        }
    }

    public Counter() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @l
    public final NoVisibleObjectsCurtain getNoVisibleObjectsCurtain() {
        return this.noVisibleObjectsCurtain;
    }

    @l
    public final String getTotalCount() {
        return this.totalCount;
    }

    @l
    public final Integer getVisibleObjectsCount() {
        return this.visibleObjectsCount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.totalCount);
        Integer num = this.visibleObjectsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        NoVisibleObjectsCurtain noVisibleObjectsCurtain = this.noVisibleObjectsCurtain;
        if (noVisibleObjectsCurtain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noVisibleObjectsCurtain.writeToParcel(parcel, flags);
        }
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public Counter(@l String str, @l Integer num, @l NoVisibleObjectsCurtain noVisibleObjectsCurtain, @l Boolean bool) {
        this.totalCount = str;
        this.visibleObjectsCount = num;
        this.noVisibleObjectsCurtain = noVisibleObjectsCurtain;
        this.enabled = bool;
    }

    public /* synthetic */ Counter(String str, Integer num, NoVisibleObjectsCurtain noVisibleObjectsCurtain, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : noVisibleObjectsCurtain, (i12 & 8) != 0 ? null : bool);
    }
}
