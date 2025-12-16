package com.avito.android.personal_selections.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.personal_selections.view.PersonalSelectionsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonalSelectionsItemState.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/personal_selections/mvi/entity/PersonalSelectionsItemState;", "Landroid/os/Parcelable;", "a", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PersonalSelectionsItemState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PersonalSelectionsItem f215818b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f215816c = new a(null);

    @k
    public static final Parcelable.Creator<PersonalSelectionsItemState> CREATOR = new b();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final PersonalSelectionsItemState f215817d = new PersonalSelectionsItemState(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* compiled from: PersonalSelectionsItemState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_selections/mvi/entity/PersonalSelectionsItemState$a;", "", "<init>", "()V", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PersonalSelectionsItemState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PersonalSelectionsItemState> {
        @Override // android.os.Parcelable.Creator
        public final PersonalSelectionsItemState createFromParcel(Parcel parcel) {
            return new PersonalSelectionsItemState(parcel.readInt() == 0 ? null : PersonalSelectionsItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PersonalSelectionsItemState[] newArray(int i12) {
            return new PersonalSelectionsItemState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersonalSelectionsItemState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalSelectionsItemState) && L.f(this.f215818b, ((PersonalSelectionsItemState) obj).f215818b);
    }

    public final int hashCode() {
        PersonalSelectionsItem personalSelectionsItem = this.f215818b;
        if (personalSelectionsItem == null) {
            return 0;
        }
        return personalSelectionsItem.hashCode();
    }

    @k
    public final String toString() {
        return "PersonalSelectionsItemState(item=" + this.f215818b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        PersonalSelectionsItem personalSelectionsItem = this.f215818b;
        if (personalSelectionsItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            personalSelectionsItem.writeToParcel(parcel, i12);
        }
    }

    public PersonalSelectionsItemState(@l PersonalSelectionsItem personalSelectionsItem) {
        this.f215818b = personalSelectionsItem;
    }

    public /* synthetic */ PersonalSelectionsItemState(PersonalSelectionsItem personalSelectionsItem, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : personalSelectionsItem);
    }
}
