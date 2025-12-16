package com.avito.android.remote.model.auto_contact_models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Models.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JH\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b-\u0010\u0012¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/auto_contact_models/Counter;", "counter", "Lcom/avito/android/remote/model/auto_contact_models/Button;", "actionButton", "cancelButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/auto_contact_models/Counter;Lcom/avito/android/remote/model/auto_contact_models/Button;Lcom/avito/android/remote/model/auto_contact_models/Button;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/auto_contact_models/Counter;", "component4", "()Lcom/avito/android/remote/model/auto_contact_models/Button;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/auto_contact_models/Counter;Lcom/avito/android/remote/model/auto_contact_models/Button;Lcom/avito/android/remote/model/auto_contact_models/Button;)Lcom/avito/android/remote/model/auto_contact_models/SpendContactPopUp;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/auto_contact_models/Counter;", "getCounter", "Lcom/avito/android/remote/model/auto_contact_models/Button;", "getActionButton", "getCancelButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SpendContactPopUp implements Parcelable {

    @k
    public static final Parcelable.Creator<SpendContactPopUp> CREATOR = new Creator();

    @c("actionButton")
    @k
    private final Button actionButton;

    @c("cancelButton")
    @k
    private final Button cancelButton;

    @c("count")
    @l
    private final Counter counter;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: Models.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpendContactPopUp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SpendContactPopUp createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Counter counterCreateFromParcel = parcel.readInt() == 0 ? null : Counter.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<Button> creator = Button.CREATOR;
            return new SpendContactPopUp(string, string2, counterCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SpendContactPopUp[] newArray(int i12) {
            return new SpendContactPopUp[i12];
        }
    }

    public SpendContactPopUp(@l String str, @l String str2, @l Counter counter, @k Button button, @k Button button2) {
        this.title = str;
        this.subtitle = str2;
        this.counter = counter;
        this.actionButton = button;
        this.cancelButton = button2;
    }

    public static /* synthetic */ SpendContactPopUp copy$default(SpendContactPopUp spendContactPopUp, String str, String str2, Counter counter, Button button, Button button2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = spendContactPopUp.title;
        }
        if ((i12 & 2) != 0) {
            str2 = spendContactPopUp.subtitle;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            counter = spendContactPopUp.counter;
        }
        Counter counter2 = counter;
        if ((i12 & 8) != 0) {
            button = spendContactPopUp.actionButton;
        }
        Button button3 = button;
        if ((i12 & 16) != 0) {
            button2 = spendContactPopUp.cancelButton;
        }
        return spendContactPopUp.copy(str, str3, counter2, button3, button2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Counter getCounter() {
        return this.counter;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Button getActionButton() {
        return this.actionButton;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final Button getCancelButton() {
        return this.cancelButton;
    }

    @k
    public final SpendContactPopUp copy(@l String title, @l String subtitle, @l Counter counter, @k Button actionButton, @k Button cancelButton) {
        return new SpendContactPopUp(title, subtitle, counter, actionButton, cancelButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpendContactPopUp)) {
            return false;
        }
        SpendContactPopUp spendContactPopUp = (SpendContactPopUp) other;
        return L.f(this.title, spendContactPopUp.title) && L.f(this.subtitle, spendContactPopUp.subtitle) && L.f(this.counter, spendContactPopUp.counter) && L.f(this.actionButton, spendContactPopUp.actionButton) && L.f(this.cancelButton, spendContactPopUp.cancelButton);
    }

    @k
    public final Button getActionButton() {
        return this.actionButton;
    }

    @k
    public final Button getCancelButton() {
        return this.cancelButton;
    }

    @l
    public final Counter getCounter() {
        return this.counter;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Counter counter = this.counter;
        return this.cancelButton.hashCode() + ((this.actionButton.hashCode() + ((iHashCode2 + (counter != null ? counter.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public String toString() {
        return "SpendContactPopUp(title=" + this.title + ", subtitle=" + this.subtitle + ", counter=" + this.counter + ", actionButton=" + this.actionButton + ", cancelButton=" + this.cancelButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Counter counter = this.counter;
        if (counter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            counter.writeToParcel(parcel, flags);
        }
        this.actionButton.writeToParcel(parcel, flags);
        this.cancelButton.writeToParcel(parcel, flags);
    }
}
