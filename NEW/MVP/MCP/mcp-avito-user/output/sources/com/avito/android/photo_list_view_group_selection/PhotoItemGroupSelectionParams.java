package com.avito.android.photo_list_view_group_selection;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionIntentFactory.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionParams;", "Landroid/os/Parcelable;", "a", "_avito_photo-list-view-group-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoItemGroupSelectionParams implements Parcelable {

    @k
    public static final Parcelable.Creator<PhotoItemGroupSelectionParams> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f218375b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ImageGroup> f218376c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f218377d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f218378e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f218379f;

    /* compiled from: PhotoItemGroupSelectionIntentFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionParams$a;", "", "<init>", "()V", "", "KEY", "Ljava/lang/String;", "_avito_photo-list-view-group-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhotoItemGroupSelectionIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PhotoItemGroupSelectionParams> {
        @Override // android.os.Parcelable.Creator
        public final PhotoItemGroupSelectionParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(PhotoItemGroupSelectionParams.class, parcel, arrayList, iL2, 1);
            }
            return new PhotoItemGroupSelectionParams(string, parcel.readString(), parcel.readString(), arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoItemGroupSelectionParams[] newArray(int i12) {
            return new PhotoItemGroupSelectionParams[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public PhotoItemGroupSelectionParams(@k String str, @l String str2, @k String str3, @k List list, boolean z12) {
        this.f218375b = str;
        this.f218376c = list;
        this.f218377d = str2;
        this.f218378e = z12;
        this.f218379f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoItemGroupSelectionParams)) {
            return false;
        }
        PhotoItemGroupSelectionParams photoItemGroupSelectionParams = (PhotoItemGroupSelectionParams) obj;
        return L.f(this.f218375b, photoItemGroupSelectionParams.f218375b) && L.f(this.f218376c, photoItemGroupSelectionParams.f218376c) && L.f(this.f218377d, photoItemGroupSelectionParams.f218377d) && this.f218378e == photoItemGroupSelectionParams.f218378e && L.f(this.f218379f, photoItemGroupSelectionParams.f218379f);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f218375b.hashCode() * 31, 31, this.f218376c);
        String str = this.f218377d;
        return this.f218379f.hashCode() + r.i((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f218378e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoItemGroupSelectionParams(imageId=");
        sb2.append(this.f218375b);
        sb2.append(", imageGroups=");
        sb2.append(this.f218376c);
        sb2.append(", currentGroupId=");
        sb2.append(this.f218377d);
        sb2.append(", imageLoaded=");
        sb2.append(this.f218378e);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f218379f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f218375b);
        Iterator itJ = C0.j(this.f218376c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f218377d);
        parcel.writeInt(this.f218378e ? 1 : 0);
        parcel.writeString(this.f218379f);
    }
}
