package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculateDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/GuestCountInfo;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/GuestCountOption;", "selectedOption", "", "options", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/GuestCountOption;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/GuestCountOption;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/GuestCountOption;Ljava/util/List;)Lcom/avito/android/remote/model/GuestCountInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/GuestCountOption;", "getSelectedOption", "Ljava/util/List;", "getOptions", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GuestCountInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestCountInfo> CREATOR = new Creator();

    @c("options")
    @k
    private final List<GuestCountOption> options;

    @c("value")
    @k
    private final GuestCountOption selectedOption;

    @c("title")
    @k
    private final String title;

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GuestCountInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GuestCountInfo createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            GuestCountOption guestCountOptionCreateFromParcel = GuestCountOption.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(GuestCountOption.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GuestCountInfo(string, guestCountOptionCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GuestCountInfo[] newArray(int i12) {
            return new GuestCountInfo[i12];
        }
    }

    public GuestCountInfo(String str, GuestCountOption guestCountOption, List list, int i12, C42822w c42822w) {
        this(str, guestCountOption, (i12 & 4) != 0 ? C42784z0.f406748b : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuestCountInfo copy$default(GuestCountInfo guestCountInfo, String str, GuestCountOption guestCountOption, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = guestCountInfo.title;
        }
        if ((i12 & 2) != 0) {
            guestCountOption = guestCountInfo.selectedOption;
        }
        if ((i12 & 4) != 0) {
            list = guestCountInfo.options;
        }
        return guestCountInfo.copy(str, guestCountOption, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final GuestCountOption getSelectedOption() {
        return this.selectedOption;
    }

    @k
    public final List<GuestCountOption> component3() {
        return this.options;
    }

    @k
    public final GuestCountInfo copy(@k String title, @k GuestCountOption selectedOption, @k List<GuestCountOption> options) {
        return new GuestCountInfo(title, selectedOption, options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestCountInfo)) {
            return false;
        }
        GuestCountInfo guestCountInfo = (GuestCountInfo) other;
        return L.f(this.title, guestCountInfo.title) && L.f(this.selectedOption, guestCountInfo.selectedOption) && L.f(this.options, guestCountInfo.options);
    }

    @k
    public final List<GuestCountOption> getOptions() {
        return this.options;
    }

    @k
    public final GuestCountOption getSelectedOption() {
        return this.selectedOption;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.selectedOption.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GuestCountInfo(title=");
        sb2.append(this.title);
        sb2.append(", selectedOption=");
        sb2.append(this.selectedOption);
        sb2.append(", options=");
        return H.p(sb2, this.options, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.selectedOption.writeToParcel(parcel, flags);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((GuestCountOption) itJ.next()).writeToParcel(parcel, flags);
        }
    }

    public GuestCountInfo(@k String str, @k GuestCountOption guestCountOption, @k List<GuestCountOption> list) {
        this.title = str;
        this.selectedOption = guestCountOption;
        this.options = list;
    }
}
