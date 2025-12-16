package com.avito.android.remote.model.category_parameters.slot.user_verification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserVerificationSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/DefaultState;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Button;", "button", "title", "redesignTitle", "redesignDescription", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Button;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Button;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Button;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/user_verification/DefaultState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Button;", "getButton", "getTitle", "getRedesignTitle", "getRedesignDescription", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DefaultState implements Parcelable {

    @k
    public static final Parcelable.Creator<DefaultState> CREATOR = new Creator();

    @c("button")
    @k
    private final Button button;

    @c("redesignDescription")
    @l
    private final String redesignDescription;

    @c("redesignTitle")
    @l
    private final String redesignTitle;

    @c("text")
    @k
    private final String text;

    @c("title")
    @l
    private final String title;

    /* compiled from: UserVerificationSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DefaultState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DefaultState createFromParcel(@k Parcel parcel) {
            return new DefaultState(parcel.readString(), Button.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DefaultState[] newArray(int i12) {
            return new DefaultState[i12];
        }
    }

    public DefaultState(@k String str, @k Button button, @l String str2, @l String str3, @l String str4) {
        this.text = str;
        this.button = button;
        this.title = str2;
        this.redesignTitle = str3;
        this.redesignDescription = str4;
    }

    public static /* synthetic */ DefaultState copy$default(DefaultState defaultState, String str, Button button, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = defaultState.text;
        }
        if ((i12 & 2) != 0) {
            button = defaultState.button;
        }
        Button button2 = button;
        if ((i12 & 4) != 0) {
            str2 = defaultState.title;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            str3 = defaultState.redesignTitle;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            str4 = defaultState.redesignDescription;
        }
        return defaultState.copy(str, button2, str5, str6, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getRedesignTitle() {
        return this.redesignTitle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getRedesignDescription() {
        return this.redesignDescription;
    }

    @k
    public final DefaultState copy(@k String text, @k Button button, @l String title, @l String redesignTitle, @l String redesignDescription) {
        return new DefaultState(text, button, title, redesignTitle, redesignDescription);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultState)) {
            return false;
        }
        DefaultState defaultState = (DefaultState) other;
        return L.f(this.text, defaultState.text) && L.f(this.button, defaultState.button) && L.f(this.title, defaultState.title) && L.f(this.redesignTitle, defaultState.redesignTitle) && L.f(this.redesignDescription, defaultState.redesignDescription);
    }

    @k
    public final Button getButton() {
        return this.button;
    }

    @l
    public final String getRedesignDescription() {
        return this.redesignDescription;
    }

    @l
    public final String getRedesignTitle() {
        return this.redesignTitle;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.button.hashCode() + (this.text.hashCode() * 31)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redesignTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redesignDescription;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DefaultState(text=");
        sb2.append(this.text);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", redesignTitle=");
        sb2.append(this.redesignTitle);
        sb2.append(", redesignDescription=");
        return C22026a.c(sb2, this.redesignDescription, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        this.button.writeToParcel(parcel, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.redesignTitle);
        parcel.writeString(this.redesignDescription);
    }

    public /* synthetic */ DefaultState(String str, Button button, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, button, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4);
    }
}
