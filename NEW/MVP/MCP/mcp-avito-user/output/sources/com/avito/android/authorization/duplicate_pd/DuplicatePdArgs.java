package com.avito.android.authorization.duplicate_pd;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DuplicatePdArgs.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/duplicate_pd/DuplicatePdArgs;", "Landroid/os/Parcelable;", "Button", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DuplicatePdArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<DuplicatePdArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f93810b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f93811c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f93812d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f93813e;

    /* compiled from: DuplicatePdArgs.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/duplicate_pd/DuplicatePdArgs$Button;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f93814b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f93815c;

        /* compiled from: DuplicatePdArgs.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k String str2) {
            this.f93814b = str;
            this.f93815c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f93814b, button.f93814b) && L.f(this.f93815c, button.f93815c);
        }

        public final int hashCode() {
            return this.f93815c.hashCode() + (this.f93814b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f93814b);
            sb2.append(", url=");
            return C22026a.c(sb2, this.f93815c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f93814b);
            parcel.writeString(this.f93815c);
        }
    }

    /* compiled from: DuplicatePdArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DuplicatePdArgs> {
        @Override // android.os.Parcelable.Creator
        public final DuplicatePdArgs createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<Button> creator = Button.CREATOR;
            return new DuplicatePdArgs(string, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DuplicatePdArgs[] newArray(int i12) {
            return new DuplicatePdArgs[i12];
        }
    }

    public DuplicatePdArgs(@k String str, @k String str2, @k Button button, @k Button button2) {
        this.f93810b = str;
        this.f93811c = str2;
        this.f93812d = button;
        this.f93813e = button2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuplicatePdArgs)) {
            return false;
        }
        DuplicatePdArgs duplicatePdArgs = (DuplicatePdArgs) obj;
        return L.f(this.f93810b, duplicatePdArgs.f93810b) && L.f(this.f93811c, duplicatePdArgs.f93811c) && L.f(this.f93812d, duplicatePdArgs.f93812d) && L.f(this.f93813e, duplicatePdArgs.f93813e);
    }

    public final int hashCode() {
        return this.f93813e.hashCode() + ((this.f93812d.hashCode() + H.d(this.f93810b.hashCode() * 31, 31, this.f93811c)) * 31);
    }

    @k
    public final String toString() {
        return "DuplicatePdArgs(phoneHint=" + this.f93810b + ", supportLink=" + this.f93811c + ", button1=" + this.f93812d + ", button2=" + this.f93813e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f93810b);
        parcel.writeString(this.f93811c);
        this.f93812d.writeToParcel(parcel, i12);
        this.f93813e.writeToParcel(parcel, i12);
    }
}
