package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentSetProfileNameState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "InputState", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReAgentSetProfileNameState extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f211484i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final ReAgentSetProfileNameState f211485j = new ReAgentSetProfileNameState(null, null, null, null, null, null, false, 127, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f211486b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f211487c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InputState f211488d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InputState f211489e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PrintableText f211490f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f211491g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f211492h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReAgentSetProfileNameState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameState$InputState;", "", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputState {

        /* renamed from: b, reason: collision with root package name */
        public static final InputState f211493b;

        /* renamed from: c, reason: collision with root package name */
        public static final InputState f211494c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ InputState[] f211495d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f211496e;

        static {
            InputState inputState = new InputState("NORMAL", 0);
            f211493b = inputState;
            InputState inputState2 = new InputState("ERROR", 1);
            f211494c = inputState2;
            InputState[] inputStateArr = {inputState, inputState2};
            f211495d = inputStateArr;
            f211496e = c.a(inputStateArr);
        }

        public InputState() {
            throw null;
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) f211495d.clone();
        }
    }

    /* compiled from: ReAgentSetProfileNameState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameState$a;", "", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public ReAgentSetProfileNameState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static ReAgentSetProfileNameState a(ReAgentSetProfileNameState reAgentSetProfileNameState, String str, String str2, InputState inputState, InputState inputState2, PrintableText printableText, PrintableText printableText2, boolean z12, int i12) {
        String str3 = (i12 & 1) != 0 ? reAgentSetProfileNameState.f211486b : str;
        String str4 = (i12 & 2) != 0 ? reAgentSetProfileNameState.f211487c : str2;
        InputState inputState3 = (i12 & 4) != 0 ? reAgentSetProfileNameState.f211488d : inputState;
        InputState inputState4 = (i12 & 8) != 0 ? reAgentSetProfileNameState.f211489e : inputState2;
        PrintableText printableText3 = (i12 & 16) != 0 ? reAgentSetProfileNameState.f211490f : printableText;
        PrintableText printableText4 = (i12 & 32) != 0 ? reAgentSetProfileNameState.f211491g : printableText2;
        boolean z13 = (i12 & 64) != 0 ? reAgentSetProfileNameState.f211492h : z12;
        reAgentSetProfileNameState.getClass();
        return new ReAgentSetProfileNameState(str3, str4, inputState3, inputState4, printableText3, printableText4, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReAgentSetProfileNameState)) {
            return false;
        }
        ReAgentSetProfileNameState reAgentSetProfileNameState = (ReAgentSetProfileNameState) obj;
        return L.f(this.f211486b, reAgentSetProfileNameState.f211486b) && L.f(this.f211487c, reAgentSetProfileNameState.f211487c) && this.f211488d == reAgentSetProfileNameState.f211488d && this.f211489e == reAgentSetProfileNameState.f211489e && L.f(this.f211490f, reAgentSetProfileNameState.f211490f) && L.f(this.f211491g, reAgentSetProfileNameState.f211491g) && this.f211492h == reAgentSetProfileNameState.f211492h;
    }

    public final int hashCode() {
        int iHashCode = (this.f211489e.hashCode() + ((this.f211488d.hashCode() + H.d(this.f211486b.hashCode() * 31, 31, this.f211487c)) * 31)) * 31;
        PrintableText printableText = this.f211490f;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        PrintableText printableText2 = this.f211491g;
        return Boolean.hashCode(this.f211492h) + ((iHashCode2 + (printableText2 != null ? printableText2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReAgentSetProfileNameState(enteredFirstName=");
        sb2.append(this.f211486b);
        sb2.append(", enteredSecondName=");
        sb2.append(this.f211487c);
        sb2.append(", firstNameInputState=");
        sb2.append(this.f211488d);
        sb2.append(", secondNameInputState=");
        sb2.append(this.f211489e);
        sb2.append(", firstNameErrorMessage=");
        sb2.append(this.f211490f);
        sb2.append(", secondNameErrorMessage=");
        sb2.append(this.f211491g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f211492h, ')');
    }

    public /* synthetic */ ReAgentSetProfileNameState(String str, String str2, InputState inputState, InputState inputState2, PrintableText printableText, PrintableText printableText2, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) == 0 ? str2 : "", (i12 & 4) != 0 ? InputState.f211493b : inputState, (i12 & 8) != 0 ? InputState.f211493b : inputState2, (i12 & 16) != 0 ? null : printableText, (i12 & 32) != 0 ? null : printableText2, (i12 & 64) != 0 ? false : z12);
    }

    public ReAgentSetProfileNameState(@k String str, @k String str2, @k InputState inputState, @k InputState inputState2, @l PrintableText printableText, @l PrintableText printableText2, boolean z12) {
        this.f211486b = str;
        this.f211487c = str2;
        this.f211488d = inputState;
        this.f211489e = inputState2;
        this.f211490f = printableText;
        this.f211491g = printableText2;
        this.f211492h = z12;
    }
}
