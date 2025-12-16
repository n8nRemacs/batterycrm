package com.avito.android.favorites.adapter.avito_for_business_exit;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoForBusinessExitBlockItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/avito_for_business_exit/AvitoForBusinessExitBlockItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "Button", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AvitoForBusinessExitBlockItem implements FavoriteListItem {

    @k
    public static final Parcelable.Creator<AvitoForBusinessExitBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f156510b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f156511c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f156512d;

    /* compiled from: AvitoForBusinessExitBlockItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/avito_for_business_exit/AvitoForBusinessExitBlockItem$Button;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f156513b;

        /* compiled from: AvitoForBusinessExitBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str) {
            this.f156513b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Button) && L.f(this.f156513b, ((Button) obj).f156513b);
        }

        public final int hashCode() {
            return this.f156513b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Button(text="), this.f156513b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f156513b);
        }
    }

    /* compiled from: AvitoForBusinessExitBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvitoForBusinessExitBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final AvitoForBusinessExitBlockItem createFromParcel(Parcel parcel) {
            return new AvitoForBusinessExitBlockItem(parcel.readString(), (AttributedText) parcel.readParcelable(AvitoForBusinessExitBlockItem.class.getClassLoader()), Button.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoForBusinessExitBlockItem[] newArray(int i12) {
            return new AvitoForBusinessExitBlockItem[i12];
        }
    }

    public AvitoForBusinessExitBlockItem(@k String str, @k AttributedText attributedText, @k Button button) {
        this.f156510b = str;
        this.f156511c = attributedText;
        this.f156512d = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF155015b() {
        return this.f156510b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f156510b);
        parcel.writeParcelable(this.f156511c, i12);
        this.f156512d.writeToParcel(parcel, i12);
    }
}
