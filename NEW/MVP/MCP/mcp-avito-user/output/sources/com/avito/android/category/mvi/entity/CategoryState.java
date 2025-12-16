package com.avito.android.category.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.category.CategoryArguments;
import com.avito.android.category.ListItem;
import com.avito.android.remote.model.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CategoryState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final OverlayState f116677b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ListItem> f116678c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Location f116679d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Q<Location, String> f116680e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final CategoryArguments f116681f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f116676g = new a(null);

    @k
    public static final Parcelable.Creator<CategoryState> CREATOR = new b();

    /* compiled from: CategoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryState$a;", "", "<init>", "()V", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CategoryState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CategoryState> {
        @Override // android.os.Parcelable.Creator
        public final CategoryState createFromParcel(Parcel parcel) {
            OverlayState overlayStateCreateFromParcel = OverlayState.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CategoryState.class, parcel, arrayList, iL2, 1);
            }
            return new CategoryState(overlayStateCreateFromParcel, arrayList, (Location) parcel.readParcelable(CategoryState.class.getClassLoader()), (Q) parcel.readSerializable(), CategoryArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryState[] newArray(int i12) {
            return new CategoryState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryState(@k OverlayState overlayState, @k List<? extends ListItem> list, @k Location location, @l Q<Location, String> q12, @k CategoryArguments categoryArguments) {
        this.f116677b = overlayState;
        this.f116678c = list;
        this.f116679d = location;
        this.f116680e = q12;
        this.f116681f = categoryArguments;
    }

    public static CategoryState a(CategoryState categoryState, OverlayState overlayState, List list, Location location, Q q12, int i12) {
        if ((i12 & 1) != 0) {
            overlayState = categoryState.f116677b;
        }
        OverlayState overlayState2 = overlayState;
        if ((i12 & 2) != 0) {
            list = categoryState.f116678c;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            location = categoryState.f116679d;
        }
        Location location2 = location;
        if ((i12 & 8) != 0) {
            q12 = categoryState.f116680e;
        }
        CategoryArguments categoryArguments = categoryState.f116681f;
        categoryState.getClass();
        return new CategoryState(overlayState2, list2, location2, q12, categoryArguments);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryState)) {
            return false;
        }
        CategoryState categoryState = (CategoryState) obj;
        return this.f116677b == categoryState.f116677b && L.f(this.f116678c, categoryState.f116678c) && L.f(this.f116679d, categoryState.f116679d) && L.f(this.f116680e, categoryState.f116680e) && L.f(this.f116681f, categoryState.f116681f);
    }

    public final int hashCode() {
        int iHashCode = (this.f116679d.hashCode() + H.e(this.f116677b.hashCode() * 31, 31, this.f116678c)) * 31;
        Q<Location, String> q12 = this.f116680e;
        return this.f116681f.hashCode() + ((iHashCode + (q12 == null ? 0 : q12.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "CategoryState(overlay=" + this.f116677b + ", categories=" + this.f116678c + ", location=" + this.f116679d + ", cachedRequest=" + this.f116680e + ", arguments=" + this.f116681f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f116677b.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.f116678c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f116679d, i12);
        parcel.writeSerializable(this.f116680e);
        this.f116681f.writeToParcel(parcel, i12);
    }
}
