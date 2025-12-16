package com.avito.android.brandspace.router;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import kotlin.Metadata;

/* compiled from: BrandspaceArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/router/BrandspaceArguments;", "Landroid/os/Parcelable;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandspaceArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<BrandspaceArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f107764b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TreeClickStreamParent f107765c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f107766d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f107767e;

    /* compiled from: BrandspaceArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandspaceArguments> {
        @Override // android.os.Parcelable.Creator
        public final BrandspaceArguments createFromParcel(Parcel parcel) {
            return new BrandspaceArguments((TreeClickStreamParent) parcel.readParcelable(BrandspaceArguments.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BrandspaceArguments[] newArray(int i12) {
            return new BrandspaceArguments[i12];
        }
    }

    public BrandspaceArguments(@l TreeClickStreamParent treeClickStreamParent, @k String str, @k String str2, @l String str3) {
        this.f107764b = str;
        this.f107765c = treeClickStreamParent;
        this.f107766d = str2;
        this.f107767e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f107764b);
        parcel.writeParcelable(this.f107765c, i12);
        parcel.writeString(this.f107766d);
        parcel.writeString(this.f107767e);
    }
}
