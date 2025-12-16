package com.avito.android.passport.profile_add.analytics;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticScreen.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/analytics/AnalyticScreen;", "", "Landroid/os/Parcelable;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AnalyticScreen implements Parcelable {

    @k
    public static final Parcelable.Creator<AnalyticScreen> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    public static final AnalyticScreen f211210c;

    /* renamed from: d, reason: collision with root package name */
    public static final AnalyticScreen f211211d;

    /* renamed from: e, reason: collision with root package name */
    public static final AnalyticScreen f211212e;

    /* renamed from: f, reason: collision with root package name */
    public static final AnalyticScreen f211213f;

    /* renamed from: g, reason: collision with root package name */
    public static final AnalyticScreen f211214g;

    /* renamed from: h, reason: collision with root package name */
    public static final AnalyticScreen f211215h;

    /* renamed from: i, reason: collision with root package name */
    public static final AnalyticScreen f211216i;

    /* renamed from: j, reason: collision with root package name */
    public static final AnalyticScreen f211217j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AnalyticScreen[] f211218k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f211219l;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f211220b;

    static {
        AnalyticScreen analyticScreen = new AnalyticScreen("RE_AGENT_SHORT_FLOW", 0, "short_flow");
        f211210c = analyticScreen;
        AnalyticScreen analyticScreen2 = new AnalyticScreen("RE_AGENT_TARGET_FLOW", 1, "target_flow");
        f211211d = analyticScreen2;
        AnalyticScreen analyticScreen3 = new AnalyticScreen("SETTINGS", 2, "settings");
        f211212e = analyticScreen3;
        AnalyticScreen analyticScreen4 = new AnalyticScreen("VERTICAL", 3, "vertical");
        f211213f = analyticScreen4;
        AnalyticScreen analyticScreen5 = new AnalyticScreen("NAME", 4, "name");
        f211214g = analyticScreen5;
        AnalyticScreen analyticScreen6 = new AnalyticScreen("VERIFICATION_POPUP", 5, "verification_popup");
        f211215h = analyticScreen6;
        AnalyticScreen analyticScreen7 = new AnalyticScreen("VERIFICATION", 6, "verification");
        f211216i = analyticScreen7;
        AnalyticScreen analyticScreen8 = new AnalyticScreen("MERGE_PROFILES_LIST", 7, "merge_profiles_list");
        f211217j = analyticScreen8;
        AnalyticScreen[] analyticScreenArr = {analyticScreen, analyticScreen2, analyticScreen3, analyticScreen4, analyticScreen5, analyticScreen6, analyticScreen7, analyticScreen8};
        f211218k = analyticScreenArr;
        f211219l = c.a(analyticScreenArr);
        CREATOR = new Parcelable.Creator<AnalyticScreen>() { // from class: com.avito.android.passport.profile_add.analytics.AnalyticScreen.a
            @Override // android.os.Parcelable.Creator
            public final AnalyticScreen createFromParcel(Parcel parcel) {
                return AnalyticScreen.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AnalyticScreen[] newArray(int i12) {
                return new AnalyticScreen[i12];
            }
        };
    }

    public AnalyticScreen(String str, int i12, String str2) {
        this.f211220b = str2;
    }

    public static AnalyticScreen valueOf(String str) {
        return (AnalyticScreen) Enum.valueOf(AnalyticScreen.class, str);
    }

    public static AnalyticScreen[] values() {
        return (AnalyticScreen[]) f211218k.clone();
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
