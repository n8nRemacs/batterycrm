package com.avito.android.gig_snippet.list.snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_snippet.list.next_button.GigShiftNextButtonItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigShiftSnippetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_snippet/list/snippet/GigShiftSnippetItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftSnippetItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftSnippetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161024b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<GigShiftSnippetListItem> f161025c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f161026d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f161027e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final GigShiftNextButtonItem f161028f;

    /* compiled from: GigShiftSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftSnippetItem> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftSnippetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(GigShiftSnippetListItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GigShiftSnippetItem(string, arrayList, parcel.readString(), (DeepLink) parcel.readParcelable(GigShiftSnippetItem.class.getClassLoader()), parcel.readInt() == 0 ? null : GigShiftNextButtonItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftSnippetItem[] newArray(int i12) {
            return new GigShiftSnippetItem[i12];
        }
    }

    public GigShiftSnippetItem(@k String str, @k List<GigShiftSnippetListItem> list, @k String str2, @l DeepLink deepLink, @l GigShiftNextButtonItem gigShiftNextButtonItem) {
        this.f161024b = str;
        this.f161025c = list;
        this.f161026d = str2;
        this.f161027e = deepLink;
        this.f161028f = gigShiftNextButtonItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF161012d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF161012d() {
        return this.f161026d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161024b);
        Iterator itJ = C0.j(this.f161025c, parcel);
        while (itJ.hasNext()) {
            ((GigShiftSnippetListItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f161026d);
        parcel.writeParcelable(this.f161027e, i12);
        GigShiftNextButtonItem gigShiftNextButtonItem = this.f161028f;
        if (gigShiftNextButtonItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftNextButtonItem.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ GigShiftSnippetItem(String str, List list, String str2, DeepLink deepLink, GigShiftNextButtonItem gigShiftNextButtonItem, int i12, C42822w c42822w) {
        this(str, list, str2, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? null : gigShiftNextButtonItem);
    }
}
