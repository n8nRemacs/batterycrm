package com.avito.android.beduin.common.component.load_more;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLoadMoreModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/RetryButton;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/load_more/RetryButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "getTitle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RetryButton implements Parcelable {

    @k
    public static final Parcelable.Creator<RetryButton> CREATOR = new a();

    @l
    private final String style;

    @k
    private final String title;

    /* compiled from: BeduinLoadMoreModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RetryButton> {
        @Override // android.os.Parcelable.Creator
        public final RetryButton createFromParcel(Parcel parcel) {
            return new RetryButton(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RetryButton[] newArray(int i12) {
            return new RetryButton[i12];
        }
    }

    public RetryButton(@l String str, @k String str2) {
        this.style = str;
        this.title = str2;
    }

    public static /* synthetic */ RetryButton copy$default(RetryButton retryButton, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = retryButton.style;
        }
        if ((i12 & 2) != 0) {
            str2 = retryButton.title;
        }
        return retryButton.copy(str, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final RetryButton copy(@l String style, @k String title) {
        return new RetryButton(style, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetryButton)) {
            return false;
        }
        RetryButton retryButton = (RetryButton) other;
        return L.f(this.style, retryButton.style) && L.f(this.title, retryButton.title);
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.style;
        return this.title.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RetryButton(style=");
        sb2.append(this.style);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.style);
        parcel.writeString(this.title);
    }
}
