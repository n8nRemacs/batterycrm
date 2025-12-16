package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBaseCard.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJL\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/AvitoFinanceButton;", "Landroid/os/Parcelable;", "", "title", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lcom/avito/android/remote/model/AvitoFinanceAction;", "onSelect", "onAppear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/AvitoFinanceButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getStyle", "Ljava/util/List;", "getOnSelect", "getOnAppear", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvitoFinanceButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoFinanceButton> CREATOR = new Creator();

    @c("onAppear")
    @l
    private final List<AvitoFinanceAction> onAppear;

    @c("onSelect")
    @l
    private final List<AvitoFinanceAction> onSelect;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("title")
    @l
    private final String title;

    /* compiled from: AvitoFinanceBaseCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoFinanceButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoFinanceButton createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(AvitoFinanceButton.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(AvitoFinanceButton.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new AvitoFinanceButton(string, string2, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoFinanceButton[] newArray(int i12) {
            return new AvitoFinanceButton[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvitoFinanceButton(@l String str, @l String str2, @l List<? extends AvitoFinanceAction> list, @l List<? extends AvitoFinanceAction> list2) {
        this.title = str;
        this.style = str2;
        this.onSelect = list;
        this.onAppear = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvitoFinanceButton copy$default(AvitoFinanceButton avitoFinanceButton, String str, String str2, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = avitoFinanceButton.title;
        }
        if ((i12 & 2) != 0) {
            str2 = avitoFinanceButton.style;
        }
        if ((i12 & 4) != 0) {
            list = avitoFinanceButton.onSelect;
        }
        if ((i12 & 8) != 0) {
            list2 = avitoFinanceButton.onAppear;
        }
        return avitoFinanceButton.copy(str, str2, list, list2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    public final List<AvitoFinanceAction> component3() {
        return this.onSelect;
    }

    @l
    public final List<AvitoFinanceAction> component4() {
        return this.onAppear;
    }

    @k
    public final AvitoFinanceButton copy(@l String title, @l String style, @l List<? extends AvitoFinanceAction> onSelect, @l List<? extends AvitoFinanceAction> onAppear) {
        return new AvitoFinanceButton(title, style, onSelect, onAppear);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoFinanceButton)) {
            return false;
        }
        AvitoFinanceButton avitoFinanceButton = (AvitoFinanceButton) other;
        return L.f(this.title, avitoFinanceButton.title) && L.f(this.style, avitoFinanceButton.style) && L.f(this.onSelect, avitoFinanceButton.onSelect) && L.f(this.onAppear, avitoFinanceButton.onAppear);
    }

    @l
    public final List<AvitoFinanceAction> getOnAppear() {
        return this.onAppear;
    }

    @l
    public final List<AvitoFinanceAction> getOnSelect() {
        return this.onSelect;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.style;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AvitoFinanceAction> list = this.onSelect;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AvitoFinanceAction> list2 = this.onAppear;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceButton(title=");
        sb2.append(this.title);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", onSelect=");
        sb2.append(this.onSelect);
        sb2.append(", onAppear=");
        return H.p(sb2, this.onAppear, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.style);
        List<AvitoFinanceAction> list = this.onSelect;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<AvitoFinanceAction> list2 = this.onAppear;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }
}
