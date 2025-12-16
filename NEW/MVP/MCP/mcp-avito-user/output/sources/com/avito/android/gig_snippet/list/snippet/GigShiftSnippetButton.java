package com.avito.android.gig_snippet.list.snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigShiftSnippetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_snippet/list/snippet/GigShiftSnippetButton;", "Landroid/os/Parcelable;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftSnippetButton implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftSnippetButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161020b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f161021c;

    /* compiled from: GigShiftSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftSnippetButton> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftSnippetButton createFromParcel(Parcel parcel) {
            return new GigShiftSnippetButton(parcel.readString(), (DeepLink) parcel.readParcelable(GigShiftSnippetButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftSnippetButton[] newArray(int i12) {
            return new GigShiftSnippetButton[i12];
        }
    }

    public GigShiftSnippetButton(@k String str, @l DeepLink deepLink) {
        this.f161020b = str;
        this.f161021c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161020b);
        parcel.writeParcelable(this.f161021c, i12);
    }

    public /* synthetic */ GigShiftSnippetButton(String str, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink);
    }
}
