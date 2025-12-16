package com.avito.android.beduin.common.component.load_more;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.action.BeduinToastAction;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLoadMoreModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JP\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u0019¨\u00066"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/ErrorToast;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;", "timeout", "", "title", "message", "Lcom/avito/android/beduin/common/component/load_more/RetryButton;", "retryButton", "", "closeOnAction", "<init>", "(Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/load_more/RetryButton;Ljava/lang/Boolean;)V", "component1", "()Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;", "component2", "()Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/avito/android/beduin/common/component/load_more/RetryButton;", "component6", "()Ljava/lang/Boolean;", "copy", "(Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/load_more/RetryButton;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/load_more/ErrorToast;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;", "getStyle", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;", "getTimeout", "Ljava/lang/String;", "getTitle", "getMessage", "Lcom/avito/android/beduin/common/component/load_more/RetryButton;", "getRetryButton", "Ljava/lang/Boolean;", "getCloseOnAction", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ErrorToast implements Parcelable {

    @k
    public static final Parcelable.Creator<ErrorToast> CREATOR = new a();

    @l
    private final Boolean closeOnAction;

    @k
    private final String message;

    @k
    private final RetryButton retryButton;

    @k
    private final BeduinToastAction.Style style;

    @l
    private final BeduinToastAction.Timeout timeout;

    @k
    private final String title;

    /* compiled from: BeduinLoadMoreModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ErrorToast> {
        @Override // android.os.Parcelable.Creator
        public final ErrorToast createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            BeduinToastAction.Style styleValueOf = BeduinToastAction.Style.valueOf(parcel.readString());
            BeduinToastAction.Timeout timeoutValueOf = parcel.readInt() == 0 ? null : BeduinToastAction.Timeout.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            RetryButton retryButtonCreateFromParcel = RetryButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ErrorToast(styleValueOf, timeoutValueOf, string, string2, retryButtonCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ErrorToast[] newArray(int i12) {
            return new ErrorToast[i12];
        }
    }

    public ErrorToast(@k BeduinToastAction.Style style, @l BeduinToastAction.Timeout timeout, @k String str, @k String str2, @k RetryButton retryButton, @l Boolean bool) {
        this.style = style;
        this.timeout = timeout;
        this.title = str;
        this.message = str2;
        this.retryButton = retryButton;
        this.closeOnAction = bool;
    }

    public static /* synthetic */ ErrorToast copy$default(ErrorToast errorToast, BeduinToastAction.Style style, BeduinToastAction.Timeout timeout, String str, String str2, RetryButton retryButton, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            style = errorToast.style;
        }
        if ((i12 & 2) != 0) {
            timeout = errorToast.timeout;
        }
        BeduinToastAction.Timeout timeout2 = timeout;
        if ((i12 & 4) != 0) {
            str = errorToast.title;
        }
        String str3 = str;
        if ((i12 & 8) != 0) {
            str2 = errorToast.message;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            retryButton = errorToast.retryButton;
        }
        RetryButton retryButton2 = retryButton;
        if ((i12 & 32) != 0) {
            bool = errorToast.closeOnAction;
        }
        return errorToast.copy(style, timeout2, str3, str4, retryButton2, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BeduinToastAction.Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinToastAction.Timeout getTimeout() {
        return this.timeout;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final RetryButton getRetryButton() {
        return this.retryButton;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getCloseOnAction() {
        return this.closeOnAction;
    }

    @k
    public final ErrorToast copy(@k BeduinToastAction.Style style, @l BeduinToastAction.Timeout timeout, @k String title, @k String message, @k RetryButton retryButton, @l Boolean closeOnAction) {
        return new ErrorToast(style, timeout, title, message, retryButton, closeOnAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorToast)) {
            return false;
        }
        ErrorToast errorToast = (ErrorToast) other;
        return this.style == errorToast.style && this.timeout == errorToast.timeout && L.f(this.title, errorToast.title) && L.f(this.message, errorToast.message) && L.f(this.retryButton, errorToast.retryButton) && L.f(this.closeOnAction, errorToast.closeOnAction);
    }

    @l
    public final Boolean getCloseOnAction() {
        return this.closeOnAction;
    }

    @k
    public final String getMessage() {
        return this.message;
    }

    @k
    public final RetryButton getRetryButton() {
        return this.retryButton;
    }

    @k
    public final BeduinToastAction.Style getStyle() {
        return this.style;
    }

    @l
    public final BeduinToastAction.Timeout getTimeout() {
        return this.timeout;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.style.hashCode() * 31;
        BeduinToastAction.Timeout timeout = this.timeout;
        int iHashCode2 = (this.retryButton.hashCode() + H.d(H.d((iHashCode + (timeout == null ? 0 : timeout.hashCode())) * 31, 31, this.title), 31, this.message)) * 31;
        Boolean bool = this.closeOnAction;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorToast(style=");
        sb2.append(this.style);
        sb2.append(", timeout=");
        sb2.append(this.timeout);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", retryButton=");
        sb2.append(this.retryButton);
        sb2.append(", closeOnAction=");
        return C0.g(sb2, this.closeOnAction, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.style.name());
        BeduinToastAction.Timeout timeout = this.timeout;
        if (timeout == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeout.name());
        }
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        this.retryButton.writeToParcel(parcel, flags);
        Boolean bool = this.closeOnAction;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ ErrorToast(BeduinToastAction.Style style, BeduinToastAction.Timeout timeout, String str, String str2, RetryButton retryButton, Boolean bool, int i12, C42822w c42822w) {
        this(style, timeout, str, str2, retryButton, (i12 & 32) != 0 ? null : bool);
    }
}
