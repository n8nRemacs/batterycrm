package com.avito.android.mnz_common.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MnzFloatingFooter.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "Landroid/os/Parcelable;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContacts;", "contacts", "Lcom/avito/android/remote/model/text/AttributedText;", "terms", "Lcom/avito/android/remote/model/ButtonAction;", "button", "secondButton", "<init>", "(Lcom/avito/android/mnz_common/data/MnzFloatingFooterContacts;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ButtonAction;)V", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContacts;", "d", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooterContacts;", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "e", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MnzFloatingFooter implements Parcelable {

    @k
    public static final Parcelable.Creator<MnzFloatingFooter> CREATOR = new a();

    @c("button")
    @k
    private final ButtonAction button;

    @c("contacts")
    @l
    private final MnzFloatingFooterContacts contacts;

    @c("secondButton")
    @l
    private final ButtonAction secondButton;

    @c("terms")
    @l
    private final AttributedText terms;

    /* compiled from: MnzFloatingFooter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MnzFloatingFooter> {
        @Override // android.os.Parcelable.Creator
        public final MnzFloatingFooter createFromParcel(Parcel parcel) {
            return new MnzFloatingFooter(parcel.readInt() == 0 ? null : MnzFloatingFooterContacts.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(MnzFloatingFooter.class.getClassLoader()), (ButtonAction) parcel.readParcelable(MnzFloatingFooter.class.getClassLoader()), (ButtonAction) parcel.readParcelable(MnzFloatingFooter.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MnzFloatingFooter[] newArray(int i12) {
            return new MnzFloatingFooter[i12];
        }
    }

    public MnzFloatingFooter(@l MnzFloatingFooterContacts mnzFloatingFooterContacts, @l AttributedText attributedText, @k ButtonAction buttonAction, @l ButtonAction buttonAction2) {
        this.contacts = mnzFloatingFooterContacts;
        this.terms = attributedText;
        this.button = buttonAction;
        this.secondButton = buttonAction2;
    }

    public static MnzFloatingFooter a(MnzFloatingFooter mnzFloatingFooter, MnzFloatingFooterContacts mnzFloatingFooterContacts) {
        AttributedText attributedText = mnzFloatingFooter.terms;
        ButtonAction buttonAction = mnzFloatingFooter.button;
        ButtonAction buttonAction2 = mnzFloatingFooter.secondButton;
        mnzFloatingFooter.getClass();
        return new MnzFloatingFooter(mnzFloatingFooterContacts, attributedText, buttonAction, buttonAction2);
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final MnzFloatingFooterContacts getContacts() {
        return this.contacts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ButtonAction getSecondButton() {
        return this.secondButton;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MnzFloatingFooter)) {
            return false;
        }
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) obj;
        return L.f(this.contacts, mnzFloatingFooter.contacts) && L.f(this.terms, mnzFloatingFooter.terms) && L.f(this.button, mnzFloatingFooter.button) && L.f(this.secondButton, mnzFloatingFooter.secondButton);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getTerms() {
        return this.terms;
    }

    public final int hashCode() {
        MnzFloatingFooterContacts mnzFloatingFooterContacts = this.contacts;
        int iHashCode = (mnzFloatingFooterContacts == null ? 0 : mnzFloatingFooterContacts.hashCode()) * 31;
        AttributedText attributedText = this.terms;
        int iHashCode2 = (this.button.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        ButtonAction buttonAction = this.secondButton;
        return iHashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnzFloatingFooter(contacts=");
        sb2.append(this.contacts);
        sb2.append(", terms=");
        sb2.append(this.terms);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", secondButton=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.secondButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        MnzFloatingFooterContacts mnzFloatingFooterContacts = this.contacts;
        if (mnzFloatingFooterContacts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mnzFloatingFooterContacts.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.terms, i12);
        parcel.writeParcelable(this.button, i12);
        parcel.writeParcelable(this.secondButton, i12);
    }
}
