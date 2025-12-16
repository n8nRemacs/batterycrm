package com.avito.android.lib.deprecated_design.tab;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Tab.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/CommonTab;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "Landroid/os/Parcelable;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class CommonTab implements com.avito.android.lib.deprecated_design.tab.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CommonTab> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f178125b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f178126c;

    /* compiled from: Tab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommonTab> {
        @Override // android.os.Parcelable.Creator
        public final CommonTab createFromParcel(Parcel parcel) {
            return new CommonTab(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonTab[] newArray(int i12) {
            return new CommonTab[i12];
        }
    }

    public CommonTab(@Y61.k String str, @Y61.l String str2) {
        this.f178125b = str;
        this.f178126c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @Y61.l
    /* renamed from: getLabel, reason: from getter */
    public String getF178126c() {
        return this.f178126c;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public String getF178125b() {
        return this.f178125b;
    }

    public void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f178125b);
        parcel.writeString(this.f178126c);
    }

    public /* synthetic */ CommonTab(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }
}
