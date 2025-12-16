package com.avito.android.section;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.section.SectionGroupTypeElement;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.remote.model.section.SectionTypeItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RedesignUnitedSectionTypeItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/RedesignUnitedSectionTypeItem;", "Lcom/avito/android/remote/model/section/SectionGroupTypeElement;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes3.dex */
public final /* data */ class RedesignUnitedSectionTypeItem implements SectionGroupTypeElement {

    @Y61.k
    public static final Parcelable.Creator<RedesignUnitedSectionTypeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f264594b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public SectionTypeItem f264595c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public String f264596d = "";

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public String f264597e = "";

    /* compiled from: RedesignUnitedSectionTypeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RedesignUnitedSectionTypeItem> {
        @Override // android.os.Parcelable.Creator
        public final RedesignUnitedSectionTypeItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(RedesignUnitedSectionTypeItem.class, parcel, arrayList, iL2, 1);
            }
            return new RedesignUnitedSectionTypeItem(arrayList, (SectionTypeItem) parcel.readParcelable(RedesignUnitedSectionTypeItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RedesignUnitedSectionTypeItem[] newArray(int i12) {
            return new RedesignUnitedSectionTypeItem[i12];
        }
    }

    public RedesignUnitedSectionTypeItem(@Y61.k ArrayList arrayList, @Y61.k SectionTypeItem sectionTypeItem) {
        this.f264594b = arrayList;
        this.f264595c = sectionTypeItem;
    }

    @Override // com.avito.android.remote.model.section.SectionGroupTypeElement
    public final boolean containsSection(@Y61.k String str) {
        Object next;
        Iterator it = this.f264594b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((SectionTypeItem) next).getSectionId(), str)) {
                break;
            }
        }
        return next != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedesignUnitedSectionTypeItem)) {
            return false;
        }
        RedesignUnitedSectionTypeItem redesignUnitedSectionTypeItem = (RedesignUnitedSectionTypeItem) obj;
        return this.f264594b.equals(redesignUnitedSectionTypeItem.f264594b) && L.f(this.f264595c, redesignUnitedSectionTypeItem.f264595c);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public final boolean getHasContent() {
        return this.f264595c.getHasContent();
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @Y61.k
    /* renamed from: getIconUri, reason: from getter */
    public final String getF264597e() {
        return this.f264597e;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final String getF264596d() {
        return this.f264596d;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @Y61.k
    public final String getSectionId() {
        return SectionGroupTypeElement.DefaultImpls.getSectionId(this);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @Y61.l
    public final String getTitle() {
        return this.f264595c.getTitle();
    }

    public final int hashCode() {
        return this.f264595c.hashCode() + (this.f264594b.hashCode() * 31);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @Y61.k
    /* renamed from: isAvailableToHide */
    public final Boolean getIsAvailableToHide() {
        return Boolean.FALSE;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @Y61.k
    /* renamed from: isCollapsed */
    public final Boolean getIsCollapsed() {
        return Boolean.FALSE;
    }

    @Override // com.avito.android.remote.model.section.SectionGroupTypeElement, com.avito.android.remote.model.section.SectionTypeElement
    public final boolean isSectionWithId(@Y61.k String str) {
        return SectionGroupTypeElement.DefaultImpls.isSectionWithId(this, str);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public final void setIconUri(@Y61.k String str) {
        this.f264597e = str;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public final void setId(@Y61.k String str) {
        this.f264596d = str;
    }

    @Y61.k
    public final String toString() {
        return "RedesignUnitedSectionTypeItem(sections=" + this.f264594b + ", selectedSection=" + this.f264595c + ')';
    }

    @Override // com.avito.android.remote.model.section.SectionGroupTypeElement
    @Y61.k
    public final SectionGroupTypeElement updateSection(@Y61.k SectionTypeElement sectionTypeElement) {
        if (!(sectionTypeElement instanceof SectionTypeItem)) {
            return this;
        }
        ArrayList<SectionTypeItem> arrayList = this.f264594b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (SectionTypeItem sectionTypeItem : arrayList) {
            if (L.f(sectionTypeItem.getSectionId(), sectionTypeElement.getSectionId())) {
                sectionTypeItem = (SectionTypeItem) sectionTypeElement;
            }
            arrayList2.add(sectionTypeItem);
        }
        return new RedesignUnitedSectionTypeItem(arrayList2, L.f(this.f264595c.getSectionId(), sectionTypeElement.getSectionId()) ? (SectionTypeItem) sectionTypeElement : this.f264595c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f264594b, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeParcelable(this.f264595c, i12);
    }
}
