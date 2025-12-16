package com.avito.android.str_booking.network.models.common;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Button.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/str_booking/network/models/common/Button;", "Landroid/os/Parcelable;", "", "title", "preset", "Lcom/avito/android/str_booking/network/models/common/ButtonAction;", "action", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "clickstream", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/str_booking/network/models/common/ButtonAction;Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "Lcom/avito/android/str_booking/network/models/common/ButtonAction;", "c", "()Lcom/avito/android/str_booking/network/models/common/ButtonAction;", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "d", "()Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Button implements Parcelable {

    @k
    public static final Parcelable.Creator<Button> CREATOR = new a();

    @c("action")
    @l
    private final ButtonAction action;

    @c("clickstream")
    @l
    private final SuggestAnalyticsEvent clickstream;

    @c("preset")
    @l
    private final String preset;

    @c("title")
    @l
    private final String title;

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Button> {
        @Override // android.os.Parcelable.Creator
        public final Button createFromParcel(Parcel parcel) {
            return new Button(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel), (SuggestAnalyticsEvent) parcel.readParcelable(Button.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Button[] newArray(int i12) {
            return new Button[i12];
        }
    }

    public Button(@l String str, @l String str2, @l ButtonAction buttonAction, @l SuggestAnalyticsEvent suggestAnalyticsEvent) {
        this.title = str;
        this.preset = str2;
        this.action = buttonAction;
        this.clickstream = suggestAnalyticsEvent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ButtonAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final SuggestAnalyticsEvent getClickstream() {
        return this.clickstream;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getPreset() {
        return this.preset;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return L.f(this.title, button.title) && L.f(this.preset, button.preset) && L.f(this.action, button.action) && L.f(this.clickstream, button.clickstream);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preset;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonAction buttonAction = this.action;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        SuggestAnalyticsEvent suggestAnalyticsEvent = this.clickstream;
        return iHashCode3 + (suggestAnalyticsEvent != null ? suggestAnalyticsEvent.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "Button(title=" + this.title + ", preset=" + this.preset + ", action=" + this.action + ", clickstream=" + this.clickstream + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.preset);
        ButtonAction buttonAction = this.action;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.clickstream, i12);
    }
}
