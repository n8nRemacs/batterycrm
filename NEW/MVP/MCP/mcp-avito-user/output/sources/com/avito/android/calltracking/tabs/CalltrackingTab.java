package com.avito.android.calltracking.tabs;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CalltrackingTab.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calltracking/tabs/CalltrackingTab;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "Landroid/os/Parcelable;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CalltrackingTab implements com.avito.android.lib.deprecated_design.tab.a, Parcelable {

    @k
    public static final Parcelable.Creator<CalltrackingTab> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f113778b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f113779c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f113780d;

    /* compiled from: CalltrackingTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalltrackingTab> {
        @Override // android.os.Parcelable.Creator
        public final CalltrackingTab createFromParcel(Parcel parcel) {
            return new CalltrackingTab(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CalltrackingTab[] newArray(int i12) {
            return new CalltrackingTab[i12];
        }
    }

    public CalltrackingTab(@k String str, @l String str2, boolean z12) {
        this.f113778b = str;
        this.f113779c = str2;
        this.f113780d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @l
    /* renamed from: getLabel, reason: from getter */
    public final String getF113779c() {
        return this.f113779c;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF113778b() {
        return this.f113778b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f113778b);
        parcel.writeString(this.f113779c);
        parcel.writeInt(this.f113780d ? 1 : 0);
    }

    public /* synthetic */ CalltrackingTab(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? false : z12);
    }
}
