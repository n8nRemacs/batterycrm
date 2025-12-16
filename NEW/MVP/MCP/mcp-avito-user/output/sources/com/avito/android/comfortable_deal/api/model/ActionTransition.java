package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionTransition.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/ActionTransition;", "", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unreachable", "DidNotAgreeOnMeeting", "MeetingWasAgreed", "InAdvertising", "DepositMade", "Sold", "RefusedBySeller", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionTransition implements Parcelable {

    @k
    public static final Parcelable.Creator<ActionTransition> CREATOR;

    @c("deposit_made")
    public static final ActionTransition DepositMade;

    @c("did_not_agree_on_meeting")
    public static final ActionTransition DidNotAgreeOnMeeting;

    @c("in_advertising")
    public static final ActionTransition InAdvertising;

    @c("meeting_was_agreed")
    public static final ActionTransition MeetingWasAgreed;

    @c("refused_by_seller")
    public static final ActionTransition RefusedBySeller;

    @c("sold")
    public static final ActionTransition Sold;

    @c("unreachable")
    public static final ActionTransition Unreachable;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ActionTransition[] f119754c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119755d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119756b;

    static {
        ActionTransition actionTransition = new ActionTransition("Unreachable", 0, "unreachable");
        Unreachable = actionTransition;
        ActionTransition actionTransition2 = new ActionTransition("DidNotAgreeOnMeeting", 1, "did_not_agree_on_meeting");
        DidNotAgreeOnMeeting = actionTransition2;
        ActionTransition actionTransition3 = new ActionTransition("MeetingWasAgreed", 2, "meeting_was_agreed");
        MeetingWasAgreed = actionTransition3;
        ActionTransition actionTransition4 = new ActionTransition("InAdvertising", 3, "in_advertising");
        InAdvertising = actionTransition4;
        ActionTransition actionTransition5 = new ActionTransition("DepositMade", 4, "deposit_made");
        DepositMade = actionTransition5;
        ActionTransition actionTransition6 = new ActionTransition("Sold", 5, "sold");
        Sold = actionTransition6;
        ActionTransition actionTransition7 = new ActionTransition("RefusedBySeller", 6, "refused_by_seller");
        RefusedBySeller = actionTransition7;
        ActionTransition[] actionTransitionArr = {actionTransition, actionTransition2, actionTransition3, actionTransition4, actionTransition5, actionTransition6, actionTransition7};
        f119754c = actionTransitionArr;
        f119755d = kotlin.enums.c.a(actionTransitionArr);
        CREATOR = new Parcelable.Creator<ActionTransition>() { // from class: com.avito.android.comfortable_deal.api.model.ActionTransition.a
            @Override // android.os.Parcelable.Creator
            public final ActionTransition createFromParcel(Parcel parcel) {
                return ActionTransition.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionTransition[] newArray(int i12) {
                return new ActionTransition[i12];
            }
        };
    }

    private ActionTransition(String str, int i12, String str2) {
        this.f119756b = str2;
    }

    public static ActionTransition valueOf(String str) {
        return (ActionTransition) Enum.valueOf(ActionTransition.class, str);
    }

    public static ActionTransition[] values() {
        return (ActionTransition[]) f119754c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
