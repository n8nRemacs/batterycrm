package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TeamRole.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/TeamRole;", "", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HeadAgent", "Agent", "Seller", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TeamRole implements Parcelable {

    @c("agent")
    public static final TeamRole Agent;

    @k
    public static final Parcelable.Creator<TeamRole> CREATOR;

    @c("head_agent")
    public static final TeamRole HeadAgent;

    @c("seller")
    public static final TeamRole Seller;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ TeamRole[] f119774c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119775d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119776b;

    static {
        TeamRole teamRole = new TeamRole("HeadAgent", 0, "head_agent");
        HeadAgent = teamRole;
        TeamRole teamRole2 = new TeamRole("Agent", 1, "agent");
        Agent = teamRole2;
        TeamRole teamRole3 = new TeamRole("Seller", 2, "seller");
        Seller = teamRole3;
        TeamRole[] teamRoleArr = {teamRole, teamRole2, teamRole3};
        f119774c = teamRoleArr;
        f119775d = kotlin.enums.c.a(teamRoleArr);
        CREATOR = new Parcelable.Creator<TeamRole>() { // from class: com.avito.android.comfortable_deal.api.model.TeamRole.a
            @Override // android.os.Parcelable.Creator
            public final TeamRole createFromParcel(Parcel parcel) {
                return TeamRole.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TeamRole[] newArray(int i12) {
                return new TeamRole[i12];
            }
        };
    }

    private TeamRole(String str, int i12, String str2) {
        this.f119776b = str2;
    }

    public static TeamRole valueOf(String str) {
        return (TeamRole) Enum.valueOf(TeamRole.class, str);
    }

    public static TeamRole[] values() {
        return (TeamRole[]) f119774c.clone();
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
