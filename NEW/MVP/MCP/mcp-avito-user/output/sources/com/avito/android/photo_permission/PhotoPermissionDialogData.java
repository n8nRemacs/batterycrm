package com.avito.android.photo_permission;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.photo_permission.PhotoPermission;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoPermissionDialogData.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionDialogData;", "Landroid/os/Parcelable;", "a", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoPermissionDialogData implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<PhotoPermission, PhotoPermission.Strategy> f218698b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f218697c = new a(null);

    @Y61.k
    public static final Parcelable.Creator<PhotoPermissionDialogData> CREATOR = new b();

    /* compiled from: PhotoPermissionDialogData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionDialogData$a;", "", "<init>", "()V", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static PhotoPermissionDialogData a() {
            return new PhotoPermissionDialogData(P0.g(new Q(PhotoPermission.Storage.f218691b, PhotoPermission.Strategy.f218694c), new Q(PhotoPermission.Camera.f218689b, PhotoPermission.Strategy.f218693b)), null);
        }

        public a() {
        }
    }

    /* compiled from: PhotoPermissionDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PhotoPermissionDialogData> {
        @Override // android.os.Parcelable.Creator
        public final PhotoPermissionDialogData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readParcelable(PhotoPermissionDialogData.class.getClassLoader()), PhotoPermission.Strategy.valueOf(parcel.readString()));
            }
            return new PhotoPermissionDialogData(linkedHashMap, null);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoPermissionDialogData[] newArray(int i12) {
            return new PhotoPermissionDialogData[i12];
        }
    }

    public PhotoPermissionDialogData() {
        throw null;
    }

    public PhotoPermissionDialogData(Map map, C42822w c42822w) {
        this.f218698b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f218698b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i12);
            parcel.writeString(((PhotoPermission.Strategy) entry.getValue()).name());
        }
    }
}
