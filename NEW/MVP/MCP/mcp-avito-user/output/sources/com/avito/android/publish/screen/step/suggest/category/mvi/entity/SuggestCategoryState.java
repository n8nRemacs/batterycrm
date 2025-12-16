package com.avito.android.publish.screen.step.suggest.category.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestCategoryState.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/mvi/entity/SuggestCategoryState;", "Landroid/os/Parcelable;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SuggestCategoryState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f242363b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f242364c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f242365d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f242366e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f242367f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f242361g = new a(null);

    @k
    public static final Parcelable.Creator<SuggestCategoryState> CREATOR = new b();

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final SuggestCategoryState f242362h = new SuggestCategoryState(C42784z0.f406748b, true, false, false, true);

    /* compiled from: SuggestCategoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/suggest/category/mvi/entity/SuggestCategoryState$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuggestCategoryState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SuggestCategoryState> {
        @Override // android.os.Parcelable.Creator
        public final SuggestCategoryState createFromParcel(Parcel parcel) {
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(parcel.readValue(SuggestCategoryState.class.getClassLoader()));
            }
            return new SuggestCategoryState(arrayList, z12, z13, z14, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestCategoryState[] newArray(int i12) {
            return new SuggestCategoryState[i12];
        }
    }

    public SuggestCategoryState(@k List list, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f242363b = z12;
        this.f242364c = z13;
        this.f242365d = z14;
        this.f242366e = list;
        this.f242367f = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SuggestCategoryState a(SuggestCategoryState suggestCategoryState, boolean z12, boolean z13, boolean z14, ArrayList arrayList, boolean z15, int i12) {
        if ((i12 & 1) != 0) {
            z12 = suggestCategoryState.f242363b;
        }
        boolean z16 = z12;
        if ((i12 & 2) != 0) {
            z13 = suggestCategoryState.f242364c;
        }
        boolean z17 = z13;
        if ((i12 & 4) != 0) {
            z14 = suggestCategoryState.f242365d;
        }
        boolean z18 = z14;
        List list = arrayList;
        if ((i12 & 8) != 0) {
            list = suggestCategoryState.f242366e;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            z15 = suggestCategoryState.f242367f;
        }
        suggestCategoryState.getClass();
        return new SuggestCategoryState(list2, z16, z17, z18, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestCategoryState)) {
            return false;
        }
        SuggestCategoryState suggestCategoryState = (SuggestCategoryState) obj;
        return this.f242363b == suggestCategoryState.f242363b && this.f242364c == suggestCategoryState.f242364c && this.f242365d == suggestCategoryState.f242365d && L.f(this.f242366e, suggestCategoryState.f242366e) && this.f242367f == suggestCategoryState.f242367f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242367f) + H.e(r.i(r.i(Boolean.hashCode(this.f242363b) * 31, 31, this.f242364c), 31, this.f242365d), 31, this.f242366e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestCategoryState(isLoading=");
        sb2.append(this.f242363b);
        sb2.append(", isError=");
        sb2.append(this.f242364c);
        sb2.append(", isPublishButtonVisible=");
        sb2.append(this.f242365d);
        sb2.append(", suggestions=");
        sb2.append(this.f242366e);
        sb2.append(", isSuggestListVisible=");
        return r.x(sb2, this.f242367f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f242363b ? 1 : 0);
        parcel.writeInt(this.f242364c ? 1 : 0);
        parcel.writeInt(this.f242365d ? 1 : 0);
        Iterator itJ = C0.j(this.f242366e, parcel);
        while (itJ.hasNext()) {
            parcel.writeValue(itJ.next());
        }
        parcel.writeInt(this.f242367f ? 1 : 0);
    }
}
