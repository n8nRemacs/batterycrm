package com.avito.android.search.filter.converter.common;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.ParamButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemWithAdditionalButton.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ItemWithAdditionalButton;", "", "AdditionalButton", "AdditionalButtonType", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ItemWithAdditionalButton {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ItemWithAdditionalButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ItemWithAdditionalButton$AdditionalButtonType;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdditionalButtonType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AdditionalButtonType[] f262910b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f262911c;

        static {
            AdditionalButtonType[] additionalButtonTypeArr = {new AdditionalButtonType("HELP", 0)};
            f262910b = additionalButtonTypeArr;
            f262911c = kotlin.enums.c.a(additionalButtonTypeArr);
        }

        public AdditionalButtonType() {
            throw null;
        }

        public static AdditionalButtonType valueOf(String str) {
            return (AdditionalButtonType) Enum.valueOf(AdditionalButtonType.class, str);
        }

        public static AdditionalButtonType[] values() {
            return (AdditionalButtonType[]) f262910b.clone();
        }
    }

    /* compiled from: ItemWithAdditionalButton.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ItemWithAdditionalButton$AdditionalButton;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdditionalButton implements Parcelable {

        @k
        public static final Parcelable.Creator<AdditionalButton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AdditionalButtonType f262906b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f262907c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f262908d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ParamButton.Position f262909e;

        /* compiled from: ItemWithAdditionalButton.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdditionalButton> {
            @Override // android.os.Parcelable.Creator
            public final AdditionalButton createFromParcel(Parcel parcel) {
                return new AdditionalButton(AdditionalButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), ParamButton.Position.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final AdditionalButton[] newArray(int i12) {
                return new AdditionalButton[i12];
            }
        }

        public AdditionalButton(@k AdditionalButtonType additionalButtonType, @l String str, @k String str2, @k ParamButton.Position position) {
            this.f262906b = additionalButtonType;
            this.f262907c = str;
            this.f262908d = str2;
            this.f262909e = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f262906b.name());
            parcel.writeString(this.f262907c);
            parcel.writeString(this.f262908d);
            parcel.writeString(this.f262909e.name());
        }

        public /* synthetic */ AdditionalButton(AdditionalButtonType additionalButtonType, String str, String str2, ParamButton.Position position, int i12, C42822w c42822w) {
            this(additionalButtonType, (i12 & 2) != 0 ? null : str, str2, position);
        }
    }
}
