package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageTerms.kt */
@d
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/mortgage/api/model/MortgageTerms;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "terms", "", "bankIconsUrls", "Lcom/avito/android/mortgage/api/model/ActionButton;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/mortgage/api/model/ActionButton;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/mortgage/api/model/ActionButton;", "c", "()Lcom/avito/android/mortgage/api/model/ActionButton;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageTerms implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageTerms> CREATOR = new a();

    @c("changeAction")
    @l
    private final ActionButton action;

    @c("bankIcons")
    @l
    private final List<String> bankIconsUrls;

    @c("terms")
    @k
    private final AttributedText terms;

    @c("title")
    @k
    private final String title;

    /* compiled from: MortgageTerms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageTerms> {
        @Override // android.os.Parcelable.Creator
        public final MortgageTerms createFromParcel(Parcel parcel) {
            return new MortgageTerms(parcel.readString(), (AttributedText) parcel.readParcelable(MortgageTerms.class.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageTerms[] newArray(int i12) {
            return new MortgageTerms[i12];
        }
    }

    public MortgageTerms(@k String str, @k AttributedText attributedText, @l List<String> list, @l ActionButton actionButton) {
        this.title = str;
        this.terms = attributedText;
        this.bankIconsUrls = list;
        this.action = actionButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ActionButton getAction() {
        return this.action;
    }

    @l
    public final List<String> d() {
        return this.bankIconsUrls;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTerms() {
        return this.terms;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageTerms)) {
            return false;
        }
        MortgageTerms mortgageTerms = (MortgageTerms) obj;
        return L.f(this.title, mortgageTerms.title) && L.f(this.terms, mortgageTerms.terms) && L.f(this.bankIconsUrls, mortgageTerms.bankIconsUrls) && L.f(this.action, mortgageTerms.action);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.title.hashCode() * 31, 31, this.terms);
        List<String> list = this.bankIconsUrls;
        int iHashCode = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
        ActionButton actionButton = this.action;
        return iHashCode + (actionButton != null ? actionButton.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MortgageTerms(title=" + this.title + ", terms=" + this.terms + ", bankIconsUrls=" + this.bankIconsUrls + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.terms, i12);
        parcel.writeStringList(this.bankIconsUrls);
        ActionButton actionButton = this.action;
        if (actionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton.writeToParcel(parcel, i12);
        }
    }
}
