package com.avito.android.authorization.analytics;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CodeConfirmationOpenedEvent.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/analytics/CodeConfirmationSource;", "", "Landroid/os/Parcelable;", "_avito_authorization_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CodeConfirmationSource implements Parcelable {

    @k
    public static final Parcelable.Creator<CodeConfirmationSource> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    public static final CodeConfirmationSource f92755c;

    /* renamed from: d, reason: collision with root package name */
    public static final CodeConfirmationSource f92756d;

    /* renamed from: e, reason: collision with root package name */
    public static final CodeConfirmationSource f92757e;

    /* renamed from: f, reason: collision with root package name */
    public static final CodeConfirmationSource f92758f;

    /* renamed from: g, reason: collision with root package name */
    public static final CodeConfirmationSource f92759g;

    /* renamed from: h, reason: collision with root package name */
    public static final CodeConfirmationSource f92760h;

    /* renamed from: i, reason: collision with root package name */
    public static final CodeConfirmationSource f92761i;

    /* renamed from: j, reason: collision with root package name */
    public static final CodeConfirmationSource f92762j;

    /* renamed from: k, reason: collision with root package name */
    public static final CodeConfirmationSource f92763k;

    /* renamed from: l, reason: collision with root package name */
    public static final CodeConfirmationSource f92764l;

    /* renamed from: m, reason: collision with root package name */
    public static final CodeConfirmationSource f92765m;

    /* renamed from: n, reason: collision with root package name */
    public static final CodeConfirmationSource f92766n;

    /* renamed from: o, reason: collision with root package name */
    public static final CodeConfirmationSource f92767o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ CodeConfirmationSource[] f92768p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f92769q;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92770b;

    static {
        CodeConfirmationSource codeConfirmationSource = new CodeConfirmationSource("AUTHORIZATION", 0, "authorization");
        f92755c = codeConfirmationSource;
        CodeConfirmationSource codeConfirmationSource2 = new CodeConfirmationSource("RESET_PASSWORD", 1, "restore_auth");
        f92756d = codeConfirmationSource2;
        CodeConfirmationSource codeConfirmationSource3 = new CodeConfirmationSource("LOGIN", 2, "login");
        f92757e = codeConfirmationSource3;
        CodeConfirmationSource codeConfirmationSource4 = new CodeConfirmationSource("REGISTRATION", 3, "registration");
        f92758f = codeConfirmationSource4;
        CodeConfirmationSource codeConfirmationSource5 = new CodeConfirmationSource("MESSENGER_PHONE_VERIFICATION", 4, "msg_phone_confirm");
        f92759g = codeConfirmationSource5;
        CodeConfirmationSource codeConfirmationSource6 = new CodeConfirmationSource("PHONE_ADD", 5, "profile:add");
        f92760h = codeConfirmationSource6;
        CodeConfirmationSource codeConfirmationSource7 = new CodeConfirmationSource("PHONE_ACTUALIZATION", 6, "profile:actualization");
        f92761i = codeConfirmationSource7;
        CodeConfirmationSource codeConfirmationSource8 = new CodeConfirmationSource("AUTO_RECOVERY", 7, "tfa_auto_recovery");
        f92762j = codeConfirmationSource8;
        CodeConfirmationSource codeConfirmationSource9 = new CodeConfirmationSource("VERIFICATION", 8, "profile:verification");
        f92763k = codeConfirmationSource9;
        CodeConfirmationSource codeConfirmationSource10 = new CodeConfirmationSource("PHONE_CHANGE", 9, "profile:change");
        f92764l = codeConfirmationSource10;
        CodeConfirmationSource codeConfirmationSource11 = new CodeConfirmationSource("RECALL_ME", 10, "recall_me_phone_confirm");
        f92765m = codeConfirmationSource11;
        CodeConfirmationSource codeConfirmationSource12 = new CodeConfirmationSource("SOCIAL", 11, "social_reg");
        f92766n = codeConfirmationSource12;
        CodeConfirmationSource codeConfirmationSource13 = new CodeConfirmationSource("EMPTY", 12, "");
        f92767o = codeConfirmationSource13;
        CodeConfirmationSource[] codeConfirmationSourceArr = {codeConfirmationSource, codeConfirmationSource2, codeConfirmationSource3, codeConfirmationSource4, codeConfirmationSource5, codeConfirmationSource6, codeConfirmationSource7, codeConfirmationSource8, codeConfirmationSource9, codeConfirmationSource10, codeConfirmationSource11, codeConfirmationSource12, codeConfirmationSource13};
        f92768p = codeConfirmationSourceArr;
        f92769q = c.a(codeConfirmationSourceArr);
        CREATOR = new Parcelable.Creator<CodeConfirmationSource>() { // from class: com.avito.android.authorization.analytics.CodeConfirmationSource.a
            @Override // android.os.Parcelable.Creator
            public final CodeConfirmationSource createFromParcel(Parcel parcel) {
                return CodeConfirmationSource.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CodeConfirmationSource[] newArray(int i12) {
                return new CodeConfirmationSource[i12];
            }
        };
    }

    public CodeConfirmationSource(String str, int i12, String str2) {
        this.f92770b = str2;
    }

    public static CodeConfirmationSource valueOf(String str) {
        return (CodeConfirmationSource) Enum.valueOf(CodeConfirmationSource.class, str);
    }

    public static CodeConfirmationSource[] values() {
        return (CodeConfirmationSource[]) f92768p.clone();
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
