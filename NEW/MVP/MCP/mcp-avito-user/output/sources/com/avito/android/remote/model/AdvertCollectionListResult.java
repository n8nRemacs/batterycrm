package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionListResult.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/AdvertCollectionListResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/AdvertCollection;", "list", "", "isFirstCollectionCreated", "Lcom/avito/android/deep_linking/links/DeepLink;", "collectionsCreationDeeplink", "<init>", "(Ljava/util/List;ZLcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/util/List;ZLcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/AdvertCollectionListResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getList", "Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getCollectionsCreationDeeplink", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertCollectionListResult implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertCollectionListResult> CREATOR = new Creator();

    @c("collectionsCreationDeeplink")
    @l
    private final DeepLink collectionsCreationDeeplink;

    @c("isFirstCollectionCreated")
    private final boolean isFirstCollectionCreated;

    @c("collections")
    @k
    private final List<AdvertCollection> list;

    /* compiled from: AdvertCollectionListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertCollectionListResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCollectionListResult createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(AdvertCollection.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertCollectionListResult(arrayList, parcel.readInt() != 0, (DeepLink) parcel.readParcelable(AdvertCollectionListResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCollectionListResult[] newArray(int i12) {
            return new AdvertCollectionListResult[i12];
        }
    }

    public AdvertCollectionListResult(@k List<AdvertCollection> list, boolean z12, @l DeepLink deepLink) {
        this.list = list;
        this.isFirstCollectionCreated = z12;
        this.collectionsCreationDeeplink = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvertCollectionListResult copy$default(AdvertCollectionListResult advertCollectionListResult, List list, boolean z12, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = advertCollectionListResult.list;
        }
        if ((i12 & 2) != 0) {
            z12 = advertCollectionListResult.isFirstCollectionCreated;
        }
        if ((i12 & 4) != 0) {
            deepLink = advertCollectionListResult.collectionsCreationDeeplink;
        }
        return advertCollectionListResult.copy(list, z12, deepLink);
    }

    @k
    public final List<AdvertCollection> component1() {
        return this.list;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFirstCollectionCreated() {
        return this.isFirstCollectionCreated;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getCollectionsCreationDeeplink() {
        return this.collectionsCreationDeeplink;
    }

    @k
    public final AdvertCollectionListResult copy(@k List<AdvertCollection> list, boolean isFirstCollectionCreated, @l DeepLink collectionsCreationDeeplink) {
        return new AdvertCollectionListResult(list, isFirstCollectionCreated, collectionsCreationDeeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertCollectionListResult)) {
            return false;
        }
        AdvertCollectionListResult advertCollectionListResult = (AdvertCollectionListResult) other;
        return L.f(this.list, advertCollectionListResult.list) && this.isFirstCollectionCreated == advertCollectionListResult.isFirstCollectionCreated && L.f(this.collectionsCreationDeeplink, advertCollectionListResult.collectionsCreationDeeplink);
    }

    @l
    public final DeepLink getCollectionsCreationDeeplink() {
        return this.collectionsCreationDeeplink;
    }

    @k
    public final List<AdvertCollection> getList() {
        return this.list;
    }

    public int hashCode() {
        int i12 = r.i(this.list.hashCode() * 31, 31, this.isFirstCollectionCreated);
        DeepLink deepLink = this.collectionsCreationDeeplink;
        return i12 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    public final boolean isFirstCollectionCreated() {
        return this.isFirstCollectionCreated;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCollectionListResult(list=");
        sb2.append(this.list);
        sb2.append(", isFirstCollectionCreated=");
        sb2.append(this.isFirstCollectionCreated);
        sb2.append(", collectionsCreationDeeplink=");
        return a.v(sb2, this.collectionsCreationDeeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.list, parcel);
        while (itJ.hasNext()) {
            ((AdvertCollection) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isFirstCollectionCreated ? 1 : 0);
        parcel.writeParcelable(this.collectionsCreationDeeplink, flags);
    }
}
