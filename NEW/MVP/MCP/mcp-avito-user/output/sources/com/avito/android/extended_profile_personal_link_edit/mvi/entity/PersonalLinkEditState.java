package com.avito.android.extended_profile_personal_link_edit.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.printable_text.b;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonalLinkEditState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "InputState", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PersonalLinkEditState extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f151532f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final PersonalLinkEditState f151533g = new PersonalLinkEditState(false, null, null, null, 15, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f151534b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f151535c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InputState f151536d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f151537e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PersonalLinkEditState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditState$InputState;", "", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputState {

        /* renamed from: b, reason: collision with root package name */
        public static final InputState f151538b;

        /* renamed from: c, reason: collision with root package name */
        public static final InputState f151539c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ InputState[] f151540d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f151541e;

        static {
            InputState inputState = new InputState("NORMAL", 0);
            f151538b = inputState;
            InputState inputState2 = new InputState("ERROR", 1);
            f151539c = inputState2;
            InputState[] inputStateArr = {inputState, inputState2};
            f151540d = inputStateArr;
            f151541e = c.a(inputStateArr);
        }

        public InputState() {
            throw null;
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) f151540d.clone();
        }
    }

    /* compiled from: PersonalLinkEditState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditState$a;", "", "<init>", "()V", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public PersonalLinkEditState() {
        this(false, null, null, null, 15, null);
    }

    public static PersonalLinkEditState a(PersonalLinkEditState personalLinkEditState, boolean z12, String str, InputState inputState, PrintableText printableText, int i12) {
        if ((i12 & 1) != 0) {
            z12 = personalLinkEditState.f151534b;
        }
        if ((i12 & 2) != 0) {
            str = personalLinkEditState.f151535c;
        }
        if ((i12 & 4) != 0) {
            inputState = personalLinkEditState.f151536d;
        }
        if ((i12 & 8) != 0) {
            printableText = personalLinkEditState.f151537e;
        }
        personalLinkEditState.getClass();
        return new PersonalLinkEditState(z12, str, inputState, printableText);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalLinkEditState)) {
            return false;
        }
        PersonalLinkEditState personalLinkEditState = (PersonalLinkEditState) obj;
        return this.f151534b == personalLinkEditState.f151534b && L.f(this.f151535c, personalLinkEditState.f151535c) && this.f151536d == personalLinkEditState.f151536d && L.f(this.f151537e, personalLinkEditState.f151537e);
    }

    public final int hashCode() {
        return this.f151537e.hashCode() + ((this.f151536d.hashCode() + H.d(Boolean.hashCode(this.f151534b) * 31, 31, this.f151535c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonalLinkEditState(isLoading=");
        sb2.append(this.f151534b);
        sb2.append(", input=");
        sb2.append(this.f151535c);
        sb2.append(", inputState=");
        sb2.append(this.f151536d);
        sb2.append(", hint=");
        return AK.c.m(sb2, this.f151537e, ')');
    }

    public /* synthetic */ PersonalLinkEditState(boolean z12, String str, InputState inputState, PrintableText printableText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? InputState.f151538b : inputState, (i12 & 8) != 0 ? b.a() : printableText);
    }

    public PersonalLinkEditState(boolean z12, @k String str, @k InputState inputState, @k PrintableText printableText) {
        this.f151534b = z12;
        this.f151535c = str;
        this.f151536d = inputState;
        this.f151537e = printableText;
    }
}
