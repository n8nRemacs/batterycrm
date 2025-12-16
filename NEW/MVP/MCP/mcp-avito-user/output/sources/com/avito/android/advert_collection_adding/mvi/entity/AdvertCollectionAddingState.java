package com.avito.android.advert_collection_adding.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_collection_adding.adapter.advert_collection.skeleton.AdvertCollectionSkeletonItem;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.CreateAdvertCollectionResult;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionAddingState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "Create", "Select", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState$Create;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState$Select;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class AdvertCollectionAddingState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f81890b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Select f81891c = new Select(false, false, Collections.singletonList(new AdvertCollectionSkeletonItem(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0)), 2, null);

    /* compiled from: AdvertCollectionAddingState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState$Select;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Select extends AdvertCollectionAddingState {

        @k
        public static final Parcelable.Creator<Select> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final boolean f81896d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f81897e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<ParcelableItem> f81898f;

        /* compiled from: AdvertCollectionAddingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Select> {
            @Override // android.os.Parcelable.Creator
            public final Select createFromParcel(Parcel parcel) {
                int iL2 = 0;
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Select.class, parcel, arrayList, iL2, 1);
                }
                return new Select(arrayList, z12, z13);
            }

            @Override // android.os.Parcelable.Creator
            public final Select[] newArray(int i12) {
                return new Select[i12];
            }
        }

        public /* synthetic */ Select(boolean z12, boolean z13, List list, int i12, C42822w c42822w) {
            this(list, z12, (i12 & 2) != 0 ? false : z13);
        }

        public static Select d(Select select, boolean z12) {
            boolean z13 = select.f81896d;
            List<ParcelableItem> list = select.f81898f;
            select.getClass();
            return new Select(list, z13, z12);
        }

        @Override // com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState
        /* renamed from: c, reason: from getter */
        public final boolean getF81897e() {
            return this.f81897e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Select)) {
                return false;
            }
            Select select = (Select) obj;
            return this.f81896d == select.f81896d && this.f81897e == select.f81897e && L.f(this.f81898f, select.f81898f);
        }

        public final int hashCode() {
            return this.f81898f.hashCode() + r.i(Boolean.hashCode(this.f81896d) * 31, 31, this.f81897e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Select(isFirstCollectionCreated=");
            sb2.append(this.f81896d);
            sb2.append(", isLoading=");
            sb2.append(this.f81897e);
            sb2.append(", item=");
            return H.p(sb2, this.f81898f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f81896d ? 1 : 0);
            parcel.writeInt(this.f81897e ? 1 : 0);
            Iterator itJ = C0.j(this.f81898f, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }

        public Select(@k List list, boolean z12, boolean z13) {
            super(null);
            this.f81896d = z12;
            this.f81897e = z13;
            this.f81898f = list;
        }
    }

    /* compiled from: AdvertCollectionAddingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState$a;", "", "<init>", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ AdvertCollectionAddingState(C42822w c42822w) {
        this();
    }

    /* renamed from: c */
    public abstract boolean getF81897e();

    /* compiled from: AdvertCollectionAddingState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState$Create;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Create extends AdvertCollectionAddingState {

        @k
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final boolean f81892d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f81893e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final CreateAdvertCollectionResult.Created f81894f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f81895g;

        /* compiled from: AdvertCollectionAddingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Create> {
            @Override // android.os.Parcelable.Creator
            public final Create createFromParcel(Parcel parcel) {
                return new Create(parcel.readInt() != 0, parcel.readInt() != 0, (CreateAdvertCollectionResult.Created) parcel.readParcelable(Create.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Create[] newArray(int i12) {
                return new Create[i12];
            }
        }

        public /* synthetic */ Create(boolean z12, boolean z13, CreateAdvertCollectionResult.Created created, String str, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? null : created, (i12 & 8) != 0 ? "" : str);
        }

        public static Create d(Create create, boolean z12, CreateAdvertCollectionResult.Created created, String str, int i12) {
            boolean z13 = create.f81892d;
            if ((i12 & 2) != 0) {
                z12 = create.f81893e;
            }
            if ((i12 & 4) != 0) {
                created = create.f81894f;
            }
            if ((i12 & 8) != 0) {
                str = create.f81895g;
            }
            create.getClass();
            return new Create(z13, z12, created, str);
        }

        @Override // com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState
        /* renamed from: c, reason: from getter */
        public final boolean getF81897e() {
            return this.f81893e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Create)) {
                return false;
            }
            Create create = (Create) obj;
            return this.f81892d == create.f81892d && this.f81893e == create.f81893e && L.f(this.f81894f, create.f81894f) && L.f(this.f81895g, create.f81895g);
        }

        public final int hashCode() {
            int i12 = r.i(Boolean.hashCode(this.f81892d) * 31, 31, this.f81893e);
            CreateAdvertCollectionResult.Created created = this.f81894f;
            return this.f81895g.hashCode() + ((i12 + (created == null ? 0 : created.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Create(isFirstCollectionCreated=");
            sb2.append(this.f81892d);
            sb2.append(", isLoading=");
            sb2.append(this.f81893e);
            sb2.append(", collection=");
            sb2.append(this.f81894f);
            sb2.append(", collectionName=");
            return C22026a.c(sb2, this.f81895g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f81892d ? 1 : 0);
            parcel.writeInt(this.f81893e ? 1 : 0);
            parcel.writeParcelable(this.f81894f, i12);
            parcel.writeString(this.f81895g);
        }

        public Create(boolean z12, boolean z13, @l CreateAdvertCollectionResult.Created created, @k String str) {
            super(null);
            this.f81892d = z12;
            this.f81893e = z13;
            this.f81894f = created;
            this.f81895g = str;
        }
    }

    public AdvertCollectionAddingState() {
    }
}
