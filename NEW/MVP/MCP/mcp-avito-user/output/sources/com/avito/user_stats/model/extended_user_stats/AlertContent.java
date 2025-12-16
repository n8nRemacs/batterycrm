package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/AlertContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/user_stats/model/extended_user_stats/ButtonAction;", "button", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/user_stats/model/extended_user_stats/ButtonAction;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/user_stats/model/extended_user_stats/ButtonAction;", "getButton", "()Lcom/avito/user_stats/model/extended_user_stats/ButtonAction;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AlertContent implements Parcelable {

    @k
    public static final Parcelable.Creator<AlertContent> CREATOR = new a();

    @c("button")
    @l
    private final ButtonAction button;

    @c("text")
    @l
    private final AttributedText text;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AlertContent> {
        @Override // android.os.Parcelable.Creator
        public final AlertContent createFromParcel(Parcel parcel) {
            return new AlertContent((AttributedText) parcel.readParcelable(AlertContent.class.getClassLoader()), parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AlertContent[] newArray(int i12) {
            return new AlertContent[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertContent)) {
            return false;
        }
        AlertContent alertContent = (AlertContent) obj;
        return L.f(this.text, alertContent.text) && L.f(this.button, alertContent.button);
    }

    public final int hashCode() {
        AttributedText attributedText = this.text;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        ButtonAction buttonAction = this.button;
        return iHashCode + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AlertContent(text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.text, i12);
        ButtonAction buttonAction = this.button;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, i12);
        }
    }

    public AlertContent(@l AttributedText attributedText, @l ButtonAction buttonAction) {
        this.text = attributedText;
        this.button = buttonAction;
    }

    public /* synthetic */ AlertContent(AttributedText attributedText, ButtonAction buttonAction, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText, (i12 & 2) != 0 ? null : buttonAction);
    }
}
