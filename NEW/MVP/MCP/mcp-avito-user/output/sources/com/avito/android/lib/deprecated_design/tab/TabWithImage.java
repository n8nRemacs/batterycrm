package com.avito.android.lib.deprecated_design.tab;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Tab.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/TabWithImage;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "Landroid/os/Parcelable;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class TabWithImage implements com.avito.android.lib.deprecated_design.tab.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TabWithImage> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f178135b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f178136c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Image f178137d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f178138e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Long f178139f;

    /* compiled from: Tab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TabWithImage> {
        @Override // android.os.Parcelable.Creator
        public final TabWithImage createFromParcel(Parcel parcel) {
            return new TabWithImage(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(TabWithImage.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final TabWithImage[] newArray(int i12) {
            return new TabWithImage[i12];
        }
    }

    public TabWithImage(@Y61.k String str, @Y61.l String str2, @Y61.l Image image, boolean z12, @Y61.l Long l12) {
        this.f178135b = str;
        this.f178136c = str2;
        this.f178137d = image;
        this.f178138e = z12;
        this.f178139f = l12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @Y61.l
    /* renamed from: getLabel, reason: from getter */
    public final String getF178136c() {
        return this.f178136c;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF178135b() {
        return this.f178135b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f178135b);
        parcel.writeString(this.f178136c);
        parcel.writeParcelable(this.f178137d, i12);
        parcel.writeInt(this.f178138e ? 1 : 0);
        Long l12 = this.f178139f;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }

    public /* synthetic */ TabWithImage(String str, String str2, Image image, boolean z12, Long l12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : image, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : l12);
    }
}
