package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import q50.InterfaceC47204b;

/* compiled from: AdvertListLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertListLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "ItemList", "Lcom/avito/android/deep_linking/links/AdvertListLink$ItemList;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AdvertListLink extends PublicDeeplink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f132973b;

    /* compiled from: AdvertListLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertListLink$ItemList;", "Lcom/avito/android/deep_linking/links/AdvertListLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class ItemList extends AdvertListLink {

        @Y61.k
        public static final Parcelable.Creator<ItemList> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f132974c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f132975d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final List<String> f132976e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f132977f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f132978g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final List<String> f132979h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f132980i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f132981j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final List<String> f132982k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final Boolean f132983l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final Boolean f132984m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f132985n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final String f132986o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final String f132987p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final String f132988q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final String f132989r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f132990s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final String f132991t;

        /* compiled from: AdvertListLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemList> {
            @Override // android.os.Parcelable.Creator
            public final ItemList createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                String string = parcel.readString();
                String string2 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ItemList(string, string2, arrayListCreateStringArrayList, string3, string4, arrayListCreateStringArrayList2, string5, string6, arrayListCreateStringArrayList3, boolValueOf, boolValueOf2, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ItemList[] newArray(int i12) {
                return new ItemList[i12];
            }
        }

        public /* synthetic */ ItemList(String str, String str2, List list, String str3, String str4, List list2, String str5, String str6, List list3, Boolean bool, Boolean bool2, boolean z12, String str7, String str8, String str9, String str10, boolean z13, String str11, int i12, C42822w c42822w) {
            this(str, str2, list, str3, str4, list2, str5, str6, list3, bool, bool2, z12, str7, (i12 & 8192) != 0 ? null : str8, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str9, (32768 & i12) != 0 ? null : str10, (65536 & i12) != 0 ? false : z13, (i12 & 131072) != 0 ? null : str11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f132974c);
            parcel.writeString(this.f132975d);
            parcel.writeStringList(this.f132976e);
            parcel.writeString(this.f132977f);
            parcel.writeString(this.f132978g);
            parcel.writeStringList(this.f132979h);
            parcel.writeString(this.f132980i);
            parcel.writeString(this.f132981j);
            parcel.writeStringList(this.f132982k);
            Boolean bool = this.f132983l;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.f132984m;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeInt(this.f132985n ? 1 : 0);
            parcel.writeString(this.f132986o);
            parcel.writeString(this.f132987p);
            parcel.writeString(this.f132988q);
            parcel.writeString(this.f132989r);
            parcel.writeInt(this.f132990s ? 1 : 0);
            parcel.writeString(this.f132991t);
        }

        public ItemList(@Y61.l String str, @Y61.l String str2, @Y61.k List<String> list, @Y61.l String str3, @Y61.l String str4, @Y61.l List<String> list2, @Y61.l String str5, @Y61.l String str6, @Y61.l List<String> list3, @Y61.l Boolean bool, @Y61.l Boolean bool2, boolean z12, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, boolean z13, @Y61.l String str11) {
            super(str, str2, list, null);
            this.f132974c = str;
            this.f132975d = str2;
            this.f132976e = list;
            this.f132977f = str3;
            this.f132978g = str4;
            this.f132979h = list2;
            this.f132980i = str5;
            this.f132981j = str6;
            this.f132982k = list3;
            this.f132983l = bool;
            this.f132984m = bool2;
            this.f132985n = z12;
            this.f132986o = str7;
            this.f132987p = str8;
            this.f132988q = str9;
            this.f132989r = str10;
            this.f132990s = z13;
            this.f132991t = str11;
        }
    }

    public AdvertListLink() {
        throw null;
    }

    public AdvertListLink(String str, String str2, List list, C42822w c42822w) {
        this.f132973b = list;
    }
}
