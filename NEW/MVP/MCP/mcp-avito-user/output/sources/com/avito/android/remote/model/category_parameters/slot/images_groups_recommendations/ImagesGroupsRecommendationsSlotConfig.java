package com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.base.WithDependency;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImagesGroupsRecommendationsSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b*\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/ImagesGroupsRecommendationsSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/base/WithDependency;", "", "title", "", "Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/Recommendation;", "recommendations", "", "skeletonsCount", "paramsMustBeFilled", "<init>", "(Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;ILjava/util/List;)Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/ImagesGroupsRecommendationsSlotConfig;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getRecommendations", "I", "getSkeletonsCount", "getParamsMustBeFilled", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImagesGroupsRecommendationsSlotConfig implements SlotConfig, WithDependency {

    @k
    public static final Parcelable.Creator<ImagesGroupsRecommendationsSlotConfig> CREATOR = new Creator();

    @c("paramsMustBeFilled")
    @l
    private final List<String> paramsMustBeFilled;

    @c("recommendations")
    @k
    private final List<Recommendation> recommendations;

    @c("skeletonsCount")
    private final int skeletonsCount;

    @c("title")
    @k
    private final String title;

    /* compiled from: ImagesGroupsRecommendationsSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImagesGroupsRecommendationsSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImagesGroupsRecommendationsSlotConfig createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Recommendation.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ImagesGroupsRecommendationsSlotConfig(string, arrayList, parcel.readInt(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImagesGroupsRecommendationsSlotConfig[] newArray(int i12) {
            return new ImagesGroupsRecommendationsSlotConfig[i12];
        }
    }

    public ImagesGroupsRecommendationsSlotConfig(@k String str, @k List<Recommendation> list, int i12, @l List<String> list2) {
        this.title = str;
        this.recommendations = list;
        this.skeletonsCount = i12;
        this.paramsMustBeFilled = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImagesGroupsRecommendationsSlotConfig copy$default(ImagesGroupsRecommendationsSlotConfig imagesGroupsRecommendationsSlotConfig, String str, List list, int i12, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = imagesGroupsRecommendationsSlotConfig.title;
        }
        if ((i13 & 2) != 0) {
            list = imagesGroupsRecommendationsSlotConfig.recommendations;
        }
        if ((i13 & 4) != 0) {
            i12 = imagesGroupsRecommendationsSlotConfig.skeletonsCount;
        }
        if ((i13 & 8) != 0) {
            list2 = imagesGroupsRecommendationsSlotConfig.paramsMustBeFilled;
        }
        return imagesGroupsRecommendationsSlotConfig.copy(str, list, i12, list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<Recommendation> component2() {
        return this.recommendations;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSkeletonsCount() {
        return this.skeletonsCount;
    }

    @l
    public final List<String> component4() {
        return this.paramsMustBeFilled;
    }

    @k
    public final ImagesGroupsRecommendationsSlotConfig copy(@k String title, @k List<Recommendation> recommendations, int skeletonsCount, @l List<String> paramsMustBeFilled) {
        return new ImagesGroupsRecommendationsSlotConfig(title, recommendations, skeletonsCount, paramsMustBeFilled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImagesGroupsRecommendationsSlotConfig)) {
            return false;
        }
        ImagesGroupsRecommendationsSlotConfig imagesGroupsRecommendationsSlotConfig = (ImagesGroupsRecommendationsSlotConfig) other;
        return L.f(this.title, imagesGroupsRecommendationsSlotConfig.title) && L.f(this.recommendations, imagesGroupsRecommendationsSlotConfig.recommendations) && this.skeletonsCount == imagesGroupsRecommendationsSlotConfig.skeletonsCount && L.f(this.paramsMustBeFilled, imagesGroupsRecommendationsSlotConfig.paramsMustBeFilled);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.WithDependency
    @l
    public List<String> getParamsMustBeFilled() {
        return this.paramsMustBeFilled;
    }

    @k
    public final List<Recommendation> getRecommendations() {
        return this.recommendations;
    }

    public final int getSkeletonsCount() {
        return this.skeletonsCount;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = r.e(this.skeletonsCount, H.e(this.title.hashCode() * 31, 31, this.recommendations), 31);
        List<String> list = this.paramsMustBeFilled;
        return iE2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImagesGroupsRecommendationsSlotConfig(title=");
        sb2.append(this.title);
        sb2.append(", recommendations=");
        sb2.append(this.recommendations);
        sb2.append(", skeletonsCount=");
        sb2.append(this.skeletonsCount);
        sb2.append(", paramsMustBeFilled=");
        return H.p(sb2, this.paramsMustBeFilled, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.recommendations, parcel);
        while (itJ.hasNext()) {
            ((Recommendation) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.skeletonsCount);
        parcel.writeStringList(this.paramsMustBeFilled);
    }
}
