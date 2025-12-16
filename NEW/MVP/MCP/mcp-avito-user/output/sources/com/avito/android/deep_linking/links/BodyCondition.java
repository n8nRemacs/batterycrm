package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BodyConditionBottomSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\rR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/deep_linking/links/BodyCondition;", "Lcom/avito/android/deep_linking/links/CarBodyCondition;", "Landroid/os/Parcelable;", "", "title", "schemeLinkTitle", "", "Lcom/avito/android/deep_linking/links/BodyConditionSide;", "sides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Ljava/util/List;", "getSides", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BodyCondition implements CarBodyCondition, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BodyCondition> CREATOR = new a();

    @com.google.gson.annotations.c("schemeLinkTitle")
    @Y61.l
    private final String schemeLinkTitle;

    @com.google.gson.annotations.c("sides")
    @Y61.k
    private final List<BodyConditionSide> sides;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: BodyConditionBottomSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BodyCondition> {
        @Override // android.os.Parcelable.Creator
        public final BodyCondition createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BodyConditionSide.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BodyCondition(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BodyCondition[] newArray(int i12) {
            return new BodyCondition[i12];
        }
    }

    public BodyCondition(@Y61.l String str, @Y61.l String str2, @Y61.k List<BodyConditionSide> list) {
        this.title = str;
        this.schemeLinkTitle = str2;
        this.sides = list;
    }

    public static BodyCondition a(BodyCondition bodyCondition) {
        String str = bodyCondition.schemeLinkTitle;
        List<BodyConditionSide> list = bodyCondition.sides;
        bodyCondition.getClass();
        return new BodyCondition(null, str, list);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getSchemeLinkTitle() {
        return this.schemeLinkTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyCondition)) {
            return false;
        }
        BodyCondition bodyCondition = (BodyCondition) obj;
        return kotlin.jvm.internal.L.f(this.title, bodyCondition.title) && kotlin.jvm.internal.L.f(this.schemeLinkTitle, bodyCondition.schemeLinkTitle) && kotlin.jvm.internal.L.f(this.sides, bodyCondition.sides);
    }

    @Override // com.avito.android.deep_linking.links.CarBodyCondition
    @Y61.k
    public final List<BodyConditionSide> getSides() {
        return this.sides;
    }

    @Override // com.avito.android.deep_linking.links.CarBodyCondition
    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schemeLinkTitle;
        return this.sides.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BodyCondition(title=");
        sb2.append(this.title);
        sb2.append(", schemeLinkTitle=");
        sb2.append(this.schemeLinkTitle);
        sb2.append(", sides=");
        return androidx.compose.foundation.H.p(sb2, this.sides, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.schemeLinkTitle);
        Iterator itJ = C0.j(this.sides, parcel);
        while (itJ.hasNext()) {
            ((BodyConditionSide) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
