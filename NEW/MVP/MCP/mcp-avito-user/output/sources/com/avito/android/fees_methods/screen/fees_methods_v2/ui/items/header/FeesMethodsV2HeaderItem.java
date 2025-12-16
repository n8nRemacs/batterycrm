package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeesMethodsV2HeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/header/FeesMethodsV2HeaderItem;", "Lcom/avito/conveyor_item/a;", "State", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeesMethodsV2HeaderItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f158383b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f158384c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f158385d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Float f158386e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final State f158387f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f158388g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final State f158389h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeesMethodsV2HeaderItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/header/FeesMethodsV2HeaderItem$State;", "", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f158390b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f158391c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ State[] f158392d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f158393e;

        static {
            State state = new State("NORMAL", 0);
            f158390b = state;
            State state2 = new State("WARNING", 1);
            f158391c = state2;
            State[] stateArr = {state, state2};
            f158392d = stateArr;
            f158393e = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f158392d.clone();
        }
    }

    public FeesMethodsV2HeaderItem(@k AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l Float f12, @l State state, @l String str2, @l State state2) {
        this.f158383b = attributedText;
        this.f158384c = attributedText2;
        this.f158385d = str;
        this.f158386e = f12;
        this.f158387f = state;
        this.f158388g = str2;
        this.f158389h = state2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeesMethodsV2HeaderItem)) {
            return false;
        }
        FeesMethodsV2HeaderItem feesMethodsV2HeaderItem = (FeesMethodsV2HeaderItem) obj;
        feesMethodsV2HeaderItem.getClass();
        return L.f(this.f158383b, feesMethodsV2HeaderItem.f158383b) && L.f(this.f158384c, feesMethodsV2HeaderItem.f158384c) && L.f(this.f158385d, feesMethodsV2HeaderItem.f158385d) && L.f(this.f158386e, feesMethodsV2HeaderItem.f158386e) && this.f158387f == feesMethodsV2HeaderItem.f158387f && L.f(this.f158388g, feesMethodsV2HeaderItem.f158388g) && this.f158389h == feesMethodsV2HeaderItem.f158389h;
    }

    @Override // TV0.a
    public final long getId() {
        return 183122769;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF156524b() {
        return "fees_methods_v2_header";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(1381838543, 31, this.f158383b);
        AttributedText attributedText = this.f158384c;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.f158385d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f12 = this.f158386e;
        int iHashCode3 = (this.f158387f.hashCode() + ((iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31)) * 31;
        String str2 = this.f158388g;
        return this.f158389h.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "FeesMethodsV2HeaderItem(stringId=fees_methods_v2_header, title=" + this.f158383b + ", description=" + this.f158384c + ", barTitle=" + this.f158385d + ", barProgressValue=" + this.f158386e + ", barProgressState=" + this.f158387f + ", barDescriptionTitle=" + this.f158388g + ", barDescriptionState=" + this.f158389h + ')';
    }
}
