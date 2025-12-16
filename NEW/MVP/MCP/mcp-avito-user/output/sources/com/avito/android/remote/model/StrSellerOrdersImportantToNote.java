package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersListResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\n¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/StrSellerOrdersImportantToNote;", "Landroid/os/Parcelable;", "", "blockTitle", "", "Lcom/avito/android/remote/model/ImportantToNoteBlockInfo;", "_importantToNoteBlockInfos", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component2", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/StrSellerOrdersImportantToNote;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBlockTitle", "Ljava/util/List;", "getImportantToNoteBlockInfos", "getImportantToNoteBlockInfos$annotations", "()V", "importantToNoteBlockInfos", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerOrdersImportantToNote implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerOrdersImportantToNote> CREATOR = new Creator();

    @c("blockInfos")
    @l
    private final List<ImportantToNoteBlockInfo> _importantToNoteBlockInfos;

    @c("blockTitle")
    @l
    private final String blockTitle;

    /* compiled from: StrSellerOrdersListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerOrdersImportantToNote> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersImportantToNote createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ImportantToNoteBlockInfo.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new StrSellerOrdersImportantToNote(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersImportantToNote[] newArray(int i12) {
            return new StrSellerOrdersImportantToNote[i12];
        }
    }

    public StrSellerOrdersImportantToNote(@l String str, @l List<ImportantToNoteBlockInfo> list) {
        this.blockTitle = str;
        this._importantToNoteBlockInfos = list;
    }

    private final List<ImportantToNoteBlockInfo> component2() {
        return this._importantToNoteBlockInfos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrSellerOrdersImportantToNote copy$default(StrSellerOrdersImportantToNote strSellerOrdersImportantToNote, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strSellerOrdersImportantToNote.blockTitle;
        }
        if ((i12 & 2) != 0) {
            list = strSellerOrdersImportantToNote._importantToNoteBlockInfos;
        }
        return strSellerOrdersImportantToNote.copy(str, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getBlockTitle() {
        return this.blockTitle;
    }

    @k
    public final StrSellerOrdersImportantToNote copy(@l String blockTitle, @l List<ImportantToNoteBlockInfo> _importantToNoteBlockInfos) {
        return new StrSellerOrdersImportantToNote(blockTitle, _importantToNoteBlockInfos);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerOrdersImportantToNote)) {
            return false;
        }
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote = (StrSellerOrdersImportantToNote) other;
        return L.f(this.blockTitle, strSellerOrdersImportantToNote.blockTitle) && L.f(this._importantToNoteBlockInfos, strSellerOrdersImportantToNote._importantToNoteBlockInfos);
    }

    @l
    public final String getBlockTitle() {
        return this.blockTitle;
    }

    @k
    public final List<ImportantToNoteBlockInfo> getImportantToNoteBlockInfos() {
        List<ImportantToNoteBlockInfo> list = this._importantToNoteBlockInfos;
        return list == null ? C42784z0.f406748b : list;
    }

    public int hashCode() {
        String str = this.blockTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ImportantToNoteBlockInfo> list = this._importantToNoteBlockInfos;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersImportantToNote(blockTitle=");
        sb2.append(this.blockTitle);
        sb2.append(", _importantToNoteBlockInfos=");
        return H.p(sb2, this._importantToNoteBlockInfos, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.blockTitle);
        List<ImportantToNoteBlockInfo> list = this._importantToNoteBlockInfos;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((ImportantToNoteBlockInfo) itA.next()).writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getImportantToNoteBlockInfos$annotations() {
    }
}
