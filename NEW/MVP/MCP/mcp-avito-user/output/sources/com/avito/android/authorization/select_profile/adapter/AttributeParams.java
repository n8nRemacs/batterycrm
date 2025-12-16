package com.avito.android.authorization.select_profile.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectProfileField.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/AttributeParams;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AttributeParams implements Parcelable {

    @k
    public static final Parcelable.Creator<AttributeParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f94256b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94257c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f94258d;

    /* compiled from: SelectProfileField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AttributeParams> {
        @Override // android.os.Parcelable.Creator
        public final AttributeParams createFromParcel(Parcel parcel) {
            return new AttributeParams(parcel.readInt(), (DeepLink) parcel.readParcelable(AttributeParams.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AttributeParams[] newArray(int i12) {
            return new AttributeParams[i12];
        }
    }

    public AttributeParams(@e0 int i12, @k DeepLink deepLink, @k String str) {
        this.f94256b = str;
        this.f94257c = i12;
        this.f94258d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeParams)) {
            return false;
        }
        AttributeParams attributeParams = (AttributeParams) obj;
        return L.f(this.f94256b, attributeParams.f94256b) && this.f94257c == attributeParams.f94257c && L.f(this.f94258d, attributeParams.f94258d);
    }

    public final int hashCode() {
        return this.f94258d.hashCode() + r.e(this.f94257c, this.f94256b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttributeParams(attributeTag=");
        sb2.append(this.f94256b);
        sb2.append(", attributeTitleId=");
        sb2.append(this.f94257c);
        sb2.append(", attributesDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f94258d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f94256b);
        parcel.writeInt(this.f94257c);
        parcel.writeParcelable(this.f94258d, i12);
    }

    public /* synthetic */ AttributeParams(String str, int i12, DeepLink deepLink, int i13, C42822w c42822w) {
        this(i12, deepLink, (i13 & 1) != 0 ? "attribute" : str);
    }
}
