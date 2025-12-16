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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_snippet/list/snippet/GigShiftSnippetListItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftSnippetListItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftSnippetListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161029b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f161030c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f161031d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f161032e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final GigShiftSnippetTimer f161033f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f161034g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f161035h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f161036i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final GigShiftSnippetButton f161037j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final GigShiftSnippetButton f161038k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final GigShiftSnippetHeader f161039l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f161040m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f161041n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f161042o;

    /* compiled from: GigShiftSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftSnippetListItem> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftSnippetListItem createFromParcel(Parcel parcel) {
            return new GigShiftSnippetListItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(GigShiftSnippetListItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GigShiftSnippetTimer.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GigShiftSnippetButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GigShiftSnippetButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GigShiftSnippetHeader.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftSnippetListItem[] newArray(int i12) {
            return new GigShiftSnippetListItem[i12];
        }
    }

    public GigShiftSnippetListItem(@k String str, @k String str2, @k DeepLink deepLink, @k String str3, @l GigShiftSnippetTimer gigShiftSnippetTimer, @k String str4, @l String str5, @k String str6, @l GigShiftSnippetButton gigShiftSnippetButton, @l GigShiftSnippetButton gigShiftSnippetButton2, @l GigShiftSnippetHeader gigShiftSnippetHeader, boolean z12, boolean z13, boolean z14) {
        this.f161029b = str;
        this.f161030c = str2;
        this.f161031d = deepLink;
        this.f161032e = str3;
        this.f161033f = gigShiftSnippetTimer;
        this.f161034g = str4;
        this.f161035h = str5;
        this.f161036i = str6;
        this.f161037j = gigShiftSnippetButton;
        this.f161038k = gigShiftSnippetButton2;
        this.f161039l = gigShiftSnippetHeader;
        this.f161040m = z12;
        this.f161041n = z13;
        this.f161042o = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return getF161029b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF161029b() {
        return this.f161029b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161029b);
        parcel.writeString(this.f161030c);
        parcel.writeParcelable(this.f161031d, i12);
        parcel.writeString(this.f161032e);
        GigShiftSnippetTimer gigShiftSnippetTimer = this.f161033f;
        if (gigShiftSnippetTimer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftSnippetTimer.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f161034g);
        parcel.writeString(this.f161035h);
        parcel.writeString(this.f161036i);
        GigShiftSnippetButton gigShiftSnippetButton = this.f161037j;
        if (gigShiftSnippetButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftSnippetButton.writeToParcel(parcel, i12);
        }
        GigShiftSnippetButton gigShiftSnippetButton2 = this.f161038k;
        if (gigShiftSnippetButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftSnippetButton2.writeToParcel(parcel, i12);
        }
        GigShiftSnippetHeader gigShiftSnippetHeader = this.f161039l;
        if (gigShiftSnippetHeader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftSnippetHeader.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f161040m ? 1 : 0);
        parcel.writeInt(this.f161041n ? 1 : 0);
        parcel.writeInt(this.f161042o ? 1 : 0);
    }

    public /* synthetic */ GigShiftSnippetListItem(String str, String str2, DeepLink deepLink, String str3, GigShiftSnippetTimer gigShiftSnippetTimer, String str4, String str5, String str6, GigShiftSnippetButton gigShiftSnippetButton, GigShiftSnippetButton gigShiftSnippetButton2, GigShiftSnippetHeader gigShiftSnippetHeader, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(str, str2, deepLink, str3, gigShiftSnippetTimer, str4, str5, str6, gigShiftSnippetButton, gigShiftSnippetButton2, gigShiftSnippetHeader, z12, (i12 & 4096) != 0 ? false : z13, (i12 & 8192) != 0 ? false : z14);
    }
}
