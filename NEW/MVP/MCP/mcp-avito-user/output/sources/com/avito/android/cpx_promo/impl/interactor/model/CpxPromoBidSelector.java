package com.avito.android.cpx_promo.impl.interactor.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: CpxPromoBidSelector.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoBidSelector;", "Landroid/os/Parcelable;", "Type", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoBidSelector implements Parcelable {

    @k
    public static final Parcelable.Creator<CpxPromoBidSelector> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedTextWithIcon f127027b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f127028c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f127029d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Type f127030e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f127031f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CpxPromoBidSelector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoBidSelector$Type;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f127032b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f127033c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f127034d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f127035e;

        static {
            Type type = new Type("AUTO", 0);
            f127032b = type;
            Type type2 = new Type("MANUAL", 1);
            f127033c = type2;
            Type[] typeArr = {type, type2};
            f127034d = typeArr;
            f127035e = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f127034d.clone();
        }
    }

    /* compiled from: CpxPromoBidSelector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoBidSelector> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoBidSelector createFromParcel(Parcel parcel) {
            return new CpxPromoBidSelector(AttributedTextWithIcon.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), Type.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoBidSelector[] newArray(int i12) {
            return new CpxPromoBidSelector[i12];
        }
    }

    public CpxPromoBidSelector(@k AttributedTextWithIcon attributedTextWithIcon, @k String str, @k String str2, @k Type type, boolean z12) {
        this.f127027b = attributedTextWithIcon;
        this.f127028c = str;
        this.f127029d = str2;
        this.f127030e = type;
        this.f127031f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f127027b.writeToParcel(parcel, i12);
        parcel.writeString(this.f127028c);
        parcel.writeString(this.f127029d);
        parcel.writeString(this.f127030e.name());
        parcel.writeInt(this.f127031f ? 1 : 0);
    }
}
