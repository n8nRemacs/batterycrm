package com.avito.android.master_plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: MasterPlanLinkData.kt */
@K51.d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/avito/android/master_plan/MasterPlanLinkData;", "Landroid/os/Parcelable;", "", "developmentId", "Lcom/avito/android/remote/model/Image;", "image", "Ljava/util/ArrayList;", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;", "Lkotlin/collections/ArrayList;", "pins", SearchParamsConverterKt.SOURCE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/ArrayList;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/util/ArrayList;", "d", "()Ljava/util/ArrayList;", "e", "_avito_master-plan_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MasterPlanLinkData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<MasterPlanLinkData> CREATOR = new a();

    @com.google.gson.annotations.c("developmentId")
    @Y61.k
    private final String developmentId;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final Image image;

    @com.google.gson.annotations.c("pins")
    @Y61.k
    private final ArrayList<MasterPlanPin> pins;

    @com.google.gson.annotations.c(SearchParamsConverterKt.SOURCE)
    @Y61.k
    private final String source;

    /* compiled from: MasterPlanLinkData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MasterPlanLinkData> {
        @Override // android.os.Parcelable.Creator
        public final MasterPlanLinkData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(MasterPlanLinkData.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(MasterPlanLinkData.class, parcel, arrayList, iL2, 1);
            }
            return new MasterPlanLinkData(string, image, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MasterPlanLinkData[] newArray(int i12) {
            return new MasterPlanLinkData[i12];
        }
    }

    public MasterPlanLinkData(@Y61.k String str, @Y61.k Image image, @Y61.k ArrayList<MasterPlanPin> arrayList, @Y61.k String str2) {
        this.developmentId = str;
        this.image = image;
        this.pins = arrayList;
        this.source = str2;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getDevelopmentId() {
        return this.developmentId;
    }

    @Y61.k
    public final ArrayList<MasterPlanPin> d() {
        return this.pins;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Y61.k
    public final Image getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.developmentId);
        parcel.writeParcelable(this.image, i12);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.pins, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeString(this.source);
    }
}
