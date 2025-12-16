package com.avito.android.gig_apply.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GigApplyOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigApplyOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigApplyOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<GigApplyOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f159857b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<AttributedText> f159858c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f159859d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f159860e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f159861f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f159862g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f159863h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f159864i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f159865j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f159866k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f159867l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f159868m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f159869n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f159870o;

    /* compiled from: GigApplyOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigApplyOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GigApplyOpenParams createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(GigApplyOpenParams.class, parcel, arrayList, iL2, 1);
            }
            return new GigApplyOpenParams(j12, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GigApplyOpenParams[] newArray(int i12) {
            return new GigApplyOpenParams[i12];
        }
    }

    public GigApplyOpenParams(long j12, @Y61.k List<AttributedText> list, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.l String str6, @Y61.k String str7, @Y61.k String str8, @Y61.k String str9, @Y61.k String str10, @Y61.l String str11, boolean z12) {
        this.f159857b = j12;
        this.f159858c = list;
        this.f159859d = str;
        this.f159860e = str2;
        this.f159861f = str3;
        this.f159862g = str4;
        this.f159863h = str5;
        this.f159864i = str6;
        this.f159865j = str7;
        this.f159866k = str8;
        this.f159867l = str9;
        this.f159868m = str10;
        this.f159869n = str11;
        this.f159870o = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f159857b);
        Iterator itJ = C0.j(this.f159858c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f159859d);
        parcel.writeString(this.f159860e);
        parcel.writeString(this.f159861f);
        parcel.writeString(this.f159862g);
        parcel.writeString(this.f159863h);
        parcel.writeString(this.f159864i);
        parcel.writeString(this.f159865j);
        parcel.writeString(this.f159866k);
        parcel.writeString(this.f159867l);
        parcel.writeString(this.f159868m);
        parcel.writeString(this.f159869n);
        parcel.writeInt(this.f159870o ? 1 : 0);
    }
}
