package com.avito.android.beduin.common.component.model;

import X41.g;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Path.kt */
@K51.d
@g
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/model/Path;", "Landroid/os/Parcelable;", "path", "", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Path implements Parcelable {

    @k
    public static final Parcelable.Creator<Path> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f101776b;

    /* compiled from: Path.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Path> {
        @Override // android.os.Parcelable.Creator
        public final Path createFromParcel(Parcel parcel) {
            return Path.a(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Path[] newArray(int i12) {
            return new Path[i12];
        }
    }

    private /* synthetic */ Path(List list) {
        this.f101776b = list;
    }

    public static final /* synthetic */ Path a(ArrayList arrayList) {
        return new Path(arrayList);
    }

    public static String b(List<? extends String> list) {
        return "Path(path=" + list + ')';
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Path) {
            return L.f(this.f101776b, ((Path) obj).f101776b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f101776b.hashCode();
    }

    public final String toString() {
        return b(this.f101776b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.f101776b);
    }
}
