package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.search.Theme;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: VinConfig.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/VinConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/VinScanner;", "vinScanner", "", "vinId", "Lcom/avito/android/remote/model/search/Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/remote/model/category_parameters/VinSuggest;", "vinSuggest", "<init>", "(Lcom/avito/android/remote/model/category_parameters/VinScanner;Ljava/lang/String;Lcom/avito/android/remote/model/search/Theme;Lcom/avito/android/remote/model/category_parameters/VinSuggest;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/VinScanner;", "getVinScanner", "()Lcom/avito/android/remote/model/category_parameters/VinScanner;", "Ljava/lang/String;", "getVinId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/search/Theme;", "getTheme", "()Lcom/avito/android/remote/model/search/Theme;", "Lcom/avito/android/remote/model/category_parameters/VinSuggest;", "getVinSuggest", "()Lcom/avito/android/remote/model/category_parameters/VinSuggest;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VinConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<VinConfig> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final Theme theme;

    @c("vinId")
    @k
    private final String vinId;

    @c("vinScanner")
    @l
    private final VinScanner vinScanner;

    @c("vinSuggest")
    @l
    private final VinSuggest vinSuggest;

    /* compiled from: VinConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VinConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VinConfig createFromParcel(@k Parcel parcel) {
            return new VinConfig(parcel.readInt() == 0 ? null : VinScanner.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString()), parcel.readInt() != 0 ? VinSuggest.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VinConfig[] newArray(int i12) {
            return new VinConfig[i12];
        }
    }

    public VinConfig(@l VinScanner vinScanner, @k String str, @l Theme theme, @l VinSuggest vinSuggest) {
        this.vinScanner = vinScanner;
        this.vinId = str;
        this.theme = theme;
        this.vinSuggest = vinSuggest;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Theme getTheme() {
        return this.theme;
    }

    @k
    public final String getVinId() {
        return this.vinId;
    }

    @l
    public final VinScanner getVinScanner() {
        return this.vinScanner;
    }

    @l
    public final VinSuggest getVinSuggest() {
        return this.vinSuggest;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        VinScanner vinScanner = this.vinScanner;
        if (vinScanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vinScanner.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.vinId);
        Theme theme = this.theme;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
        VinSuggest vinSuggest = this.vinSuggest;
        if (vinSuggest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vinSuggest.writeToParcel(parcel, flags);
        }
    }
}
