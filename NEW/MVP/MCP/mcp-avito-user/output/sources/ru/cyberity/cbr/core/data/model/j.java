package ru.cyberity.cbr.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.ConfirmationType;

/* compiled from: ApplicantDataSource.kt */
@K51.d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/cyberity/cbr/core/data/model/j;", "Landroid/os/Parcelable;", "", "sourceId", "docType", "Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "confirmationType", "", "Lru/cyberity/cbr/core/data/model/h$d;", LocalPublishState.FIELDS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "h", "b", "f", "c", "Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "e", "()Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class j implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String sourceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String docType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ConfirmationType confirmationType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<h.d> fields;

    public j(@Y61.l String str, @Y61.l String str2, @Y61.l ConfirmationType confirmationType, @Y61.l List<h.d> list) {
        this.sourceId = str;
        this.docType = str2;
        this.confirmationType = confirmationType;
        this.fields = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return L.f(this.sourceId, jVar.sourceId) && L.f(this.docType, jVar.docType) && this.confirmationType == jVar.confirmationType && L.f(this.fields, jVar.fields);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    @Y61.l
    public final List<h.d> g() {
        return this.fields;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        String str = this.sourceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.docType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmationType confirmationType = this.confirmationType;
        int iHashCode3 = (iHashCode2 + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        List<h.d> list = this.fields;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicantDataSource(sourceId=");
        sb2.append(this.sourceId);
        sb2.append(", docType=");
        sb2.append(this.docType);
        sb2.append(", confirmationType=");
        sb2.append(this.confirmationType);
        sb2.append(", fields=");
        return H.p(sb2, this.fields, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.sourceId);
        parcel.writeString(this.docType);
        ConfirmationType confirmationType = this.confirmationType;
        if (confirmationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(confirmationType.name());
        }
        List<h.d> list = this.fields;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((h.d) itA.next()).writeToParcel(parcel, flags);
        }
    }

    /* compiled from: ApplicantDataSource.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j createFromParcel(@Y61.k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            ConfirmationType confirmationTypeValueOf = parcel.readInt() == 0 ? null : ConfirmationType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(h.d.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new j(string, string2, confirmationTypeValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j[] newArray(int i12) {
            return new j[i12];
        }
    }

    public /* synthetic */ j(String str, String str2, ConfirmationType confirmationType, List list, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : confirmationType, (i12 & 8) != 0 ? null : list);
    }
}
