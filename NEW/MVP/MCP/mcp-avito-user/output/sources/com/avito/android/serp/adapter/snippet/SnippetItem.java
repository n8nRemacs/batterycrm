package com.avito.android.serp.adapter.snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.InterfaceC34742k0;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SnippetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/snippet/SnippetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/serp/adapter/k0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnippetItem implements PersistableSerpItem, InterfaceC34742k0 {

    @k
    public static final Parcelable.Creator<SnippetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f272342b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f272343c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272344d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Action f272345e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Image f272346f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f272347g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f272348h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Map<String, String> f272349i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f272350j = SerpViewType.f268585e;

    /* compiled from: SnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SnippetItem> {
        @Override // android.os.Parcelable.Creator
        public final SnippetItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            Action action = (Action) parcel.readParcelable(SnippetItem.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(SnippetItem.class.getClassLoader());
            String string2 = parcel.readString();
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SnippetItem(j12, string, i12, action, image, string2, z12, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final SnippetItem[] newArray(int i12) {
            return new SnippetItem[i12];
        }
    }

    public SnippetItem(long j12, @k String str, int i12, @k Action action, @k Image image, @k String str2, boolean z12, @l Map<String, String> map) {
        this.f272342b = j12;
        this.f272343c = str;
        this.f272344d = i12;
        this.f272345e = action;
        this.f272346f = image;
        this.f272347g = str2;
        this.f272348h = z12;
        this.f272349i = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF207391e() {
        return this.f272342b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80678d() {
        return this.f272344d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF171602b() {
        return this.f272343c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78224g() {
        return this.f272350j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f272342b);
        parcel.writeString(this.f272343c);
        parcel.writeInt(this.f272344d);
        parcel.writeParcelable(this.f272345e, i12);
        parcel.writeParcelable(this.f272346f, i12);
        parcel.writeString(this.f272347g);
        parcel.writeInt(this.f272348h ? 1 : 0);
        Map<String, String> map = this.f272349i;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
