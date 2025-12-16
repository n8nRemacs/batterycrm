package com.avito.android.photo_list_view_group_selection;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionIntentFactory.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionResult;", "Landroid/os/Parcelable;", "a", "_avito_photo-list-view-group-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoItemGroupSelectionResult implements Parcelable {

    @k
    public static final Parcelable.Creator<PhotoItemGroupSelectionResult> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f218380b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f218381c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f218382d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f218383e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f218384f;

    /* compiled from: PhotoItemGroupSelectionIntentFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionResult$a;", "", "<init>", "()V", "", "KEY", "Ljava/lang/String;", "_avito_photo-list-view-group-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhotoItemGroupSelectionIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PhotoItemGroupSelectionResult> {
        @Override // android.os.Parcelable.Creator
        public final PhotoItemGroupSelectionResult createFromParcel(Parcel parcel) {
            return new PhotoItemGroupSelectionResult(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoItemGroupSelectionResult[] newArray(int i12) {
            return new PhotoItemGroupSelectionResult[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public PhotoItemGroupSelectionResult(@k String str, @k String str2, boolean z12, @l String str3, @k String str4) {
        this.f218380b = str;
        this.f218381c = str2;
        this.f218382d = z12;
        this.f218383e = str3;
        this.f218384f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoItemGroupSelectionResult)) {
            return false;
        }
        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
        return L.f(this.f218380b, photoItemGroupSelectionResult.f218380b) && L.f(this.f218381c, photoItemGroupSelectionResult.f218381c) && this.f218382d == photoItemGroupSelectionResult.f218382d && L.f(this.f218383e, photoItemGroupSelectionResult.f218383e) && L.f(this.f218384f, photoItemGroupSelectionResult.f218384f);
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f218380b.hashCode() * 31, 31, this.f218381c), 31, this.f218382d);
        String str = this.f218383e;
        return this.f218384f.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoItemGroupSelectionResult(imageId=");
        sb2.append(this.f218380b);
        sb2.append(", selectedGroupId=");
        sb2.append(this.f218381c);
        sb2.append(", imageLoaded=");
        sb2.append(this.f218382d);
        sb2.append(", groupTitle=");
        sb2.append(this.f218383e);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f218384f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f218380b);
        parcel.writeString(this.f218381c);
        parcel.writeInt(this.f218382d ? 1 : 0);
        parcel.writeString(this.f218383e);
        parcel.writeString(this.f218384f);
    }
}
