package com.avito.android.guests_selector.io;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.printable_text.PrintableText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorInput.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/guests_selector/io/GuestsSelectorAvailableAge;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/printable_text/PrintableText;", "title", "<init>", "(Ljava/lang/String;Lcom/avito/android/printable_text/PrintableText;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/printable_text/PrintableText;", "c", "()Lcom/avito/android/printable_text/PrintableText;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GuestsSelectorAvailableAge implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestsSelectorAvailableAge> CREATOR = new a();

    @c("id")
    @k
    private final String id;

    @c("title")
    @k
    private final PrintableText title;

    /* compiled from: GuestsSelectorInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestsSelectorAvailableAge> {
        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorAvailableAge createFromParcel(Parcel parcel) {
            return new GuestsSelectorAvailableAge(parcel.readString(), (PrintableText) parcel.readParcelable(GuestsSelectorAvailableAge.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorAvailableAge[] newArray(int i12) {
            return new GuestsSelectorAvailableAge[i12];
        }
    }

    public GuestsSelectorAvailableAge(@k String str, @k PrintableText printableText) {
        this.id = str;
        this.title = printableText;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final PrintableText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestsSelectorAvailableAge)) {
            return false;
        }
        GuestsSelectorAvailableAge guestsSelectorAvailableAge = (GuestsSelectorAvailableAge) obj;
        return L.f(this.id, guestsSelectorAvailableAge.id) && L.f(this.title, guestsSelectorAvailableAge.title);
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.id.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsSelectorAvailableAge(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        return AK.c.m(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, i12);
    }
}
