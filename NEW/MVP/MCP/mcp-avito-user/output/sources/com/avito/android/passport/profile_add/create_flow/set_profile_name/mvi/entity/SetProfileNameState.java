package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import j.e0;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SetProfileNameState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "InputState", "b", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SetProfileNameState extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f212154h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final SetProfileNameState f212155i = new SetProfileNameState(null, null, null, null, false, null, 63, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f212156b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f212157c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f212158d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InputState f212159e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f212160f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f212161g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SetProfileNameState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState$InputState;", "", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputState {

        /* renamed from: b, reason: collision with root package name */
        public static final InputState f212162b;

        /* renamed from: c, reason: collision with root package name */
        public static final InputState f212163c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ InputState[] f212164d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f212165e;

        static {
            InputState inputState = new InputState("NORMAL", 0);
            f212162b = inputState;
            InputState inputState2 = new InputState("ERROR", 1);
            f212163c = inputState2;
            InputState[] inputStateArr = {inputState, inputState2};
            f212164d = inputStateArr;
            f212165e = c.a(inputStateArr);
        }

        public InputState() {
            throw null;
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) f212164d.clone();
        }
    }

    /* compiled from: SetProfileNameState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState$a;", "", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SetProfileNameState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState$b;", "", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f212166a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f212167b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f212168c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f212169d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PrintableText f212170e;

        public b() {
            this(null, null, null, null, null, 31, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f212166a, bVar.f212166a) && L.f(this.f212167b, bVar.f212167b) && L.f(this.f212168c, bVar.f212168c) && L.f(this.f212169d, bVar.f212169d) && L.f(this.f212170e, bVar.f212170e);
        }

        public final int hashCode() {
            return this.f212170e.hashCode() + com.avito.android.actions_sheet.a.f(this.f212169d, com.avito.android.actions_sheet.a.f(this.f212168c, com.avito.android.actions_sheet.a.f(this.f212167b, this.f212166a.hashCode() * 31, 31), 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextsState(title=");
            sb2.append(this.f212166a);
            sb2.append(", subtitle=");
            sb2.append(this.f212167b);
            sb2.append(", description=");
            sb2.append(this.f212168c);
            sb2.append(", placeholder=");
            sb2.append(this.f212169d);
            sb2.append(", action=");
            return AK.c.m(sb2, this.f212170e, ')');
        }

        public b(@k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3, @k PrintableText printableText4, @k PrintableText printableText5) {
            this.f212166a = printableText;
            this.f212167b = printableText2;
            this.f212168c = printableText3;
            this.f212169d = printableText4;
            this.f212170e = printableText5;
        }

        public /* synthetic */ b(PrintableText printableText, PrintableText printableText2, PrintableText printableText3, PrintableText printableText4, PrintableText printableText5, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? com.avito.android.printable_text.b.a() : printableText, (i12 & 2) != 0 ? com.avito.android.printable_text.b.a() : printableText2, (i12 & 4) != 0 ? com.avito.android.printable_text.b.a() : printableText3, (i12 & 8) != 0 ? com.avito.android.printable_text.b.a() : printableText4, (i12 & 16) != 0 ? com.avito.android.printable_text.b.a() : printableText5);
        }
    }

    public SetProfileNameState() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static SetProfileNameState a(SetProfileNameState setProfileNameState, String str, InputState inputState, boolean z12, PrintableText printableText, int i12) {
        b bVar = setProfileNameState.f212156b;
        Integer num = setProfileNameState.f212157c;
        if ((i12 & 4) != 0) {
            str = setProfileNameState.f212158d;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            inputState = setProfileNameState.f212159e;
        }
        InputState inputState2 = inputState;
        if ((i12 & 16) != 0) {
            z12 = setProfileNameState.f212160f;
        }
        boolean z13 = z12;
        if ((i12 & 32) != 0) {
            printableText = setProfileNameState.f212161g;
        }
        setProfileNameState.getClass();
        return new SetProfileNameState(bVar, num, str2, inputState2, z13, printableText);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetProfileNameState)) {
            return false;
        }
        SetProfileNameState setProfileNameState = (SetProfileNameState) obj;
        return L.f(this.f212156b, setProfileNameState.f212156b) && L.f(this.f212157c, setProfileNameState.f212157c) && L.f(this.f212158d, setProfileNameState.f212158d) && this.f212159e == setProfileNameState.f212159e && this.f212160f == setProfileNameState.f212160f && L.f(this.f212161g, setProfileNameState.f212161g);
    }

    public final int hashCode() {
        int iHashCode = this.f212156b.hashCode() * 31;
        Integer num = this.f212157c;
        int i12 = r.i((this.f212159e.hashCode() + H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f212158d)) * 31, 31, this.f212160f);
        PrintableText printableText = this.f212161g;
        return i12 + (printableText != null ? printableText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetProfileNameState(textsState=");
        sb2.append(this.f212156b);
        sb2.append(", footerRes=");
        sb2.append(this.f212157c);
        sb2.append(", enteredName=");
        sb2.append(this.f212158d);
        sb2.append(", inputState=");
        sb2.append(this.f212159e);
        sb2.append(", isLoading=");
        sb2.append(this.f212160f);
        sb2.append(", errorMessage=");
        return AK.c.m(sb2, this.f212161g, ')');
    }

    public /* synthetic */ SetProfileNameState(b bVar, Integer num, String str, InputState inputState, boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new b(null, null, null, null, null, 31, null) : bVar, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? InputState.f212162b : inputState, (i12 & 16) != 0 ? false : z12, (i12 & 32) == 0 ? printableText : null);
    }

    public SetProfileNameState(@k b bVar, @l @e0 Integer num, @k String str, @k InputState inputState, boolean z12, @l PrintableText printableText) {
        this.f212156b = bVar;
        this.f212157c = num;
        this.f212158d = str;
        this.f212159e = inputState;
        this.f212160f = z12;
        this.f212161g = printableText;
    }
}
