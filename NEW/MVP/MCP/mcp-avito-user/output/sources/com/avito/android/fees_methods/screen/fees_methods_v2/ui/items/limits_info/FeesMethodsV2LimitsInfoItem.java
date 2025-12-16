package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.LimitsInfo;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeesMethodsV2LimitsInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/limits_info/FeesMethodsV2LimitsInfoItem;", "Lcom/avito/conveyor_item/a;", "State", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeesMethodsV2LimitsInfoItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f158409b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f158410c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f158411d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Float f158412e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final State f158413f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f158414g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f158415h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LimitsInfo f158416i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeesMethodsV2LimitsInfoItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/limits_info/FeesMethodsV2LimitsInfoItem$State;", "", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f158417b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f158418c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ State[] f158419d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f158420e;

        static {
            State state = new State("NORMAL", 0);
            f158417b = state;
            State state2 = new State("WARNING", 1);
            f158418c = state2;
            State[] stateArr = {state, state2};
            f158419d = stateArr;
            f158420e = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f158419d.clone();
        }
    }

    public FeesMethodsV2LimitsInfoItem(@k String str, @k AttributedText attributedText, @l String str2, @l Float f12, @l State state, @l String str3, @l AttributedText attributedText2, @k LimitsInfo limitsInfo) {
        this.f158409b = str;
        this.f158410c = attributedText;
        this.f158411d = str2;
        this.f158412e = f12;
        this.f158413f = state;
        this.f158414g = str3;
        this.f158415h = attributedText2;
        this.f158416i = limitsInfo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeesMethodsV2LimitsInfoItem)) {
            return false;
        }
        FeesMethodsV2LimitsInfoItem feesMethodsV2LimitsInfoItem = (FeesMethodsV2LimitsInfoItem) obj;
        feesMethodsV2LimitsInfoItem.getClass();
        return L.f(this.f158409b, feesMethodsV2LimitsInfoItem.f158409b) && L.f(this.f158410c, feesMethodsV2LimitsInfoItem.f158410c) && L.f(this.f158411d, feesMethodsV2LimitsInfoItem.f158411d) && L.f(this.f158412e, feesMethodsV2LimitsInfoItem.f158412e) && this.f158413f == feesMethodsV2LimitsInfoItem.f158413f && L.f(this.f158414g, feesMethodsV2LimitsInfoItem.f158414g) && L.f(this.f158415h, feesMethodsV2LimitsInfoItem.f158415h) && L.f(this.f158416i, feesMethodsV2LimitsInfoItem.f158416i);
    }

    @Override // TV0.a
    public final long getId() {
        return -1351794127;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF154933b() {
        return "fees_methods_v2_limits_info";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(1044055023, 31, this.f158409b), 31, this.f158410c);
        String str = this.f158411d;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f12 = this.f158412e;
        int iHashCode2 = (this.f158413f.hashCode() + ((iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31)) * 31;
        String str2 = this.f158414g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f158415h;
        return this.f158416i.hashCode() + ((iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "FeesMethodsV2LimitsInfoItem(stringId=fees_methods_v2_limits_info, itemId=" + this.f158409b + ", title=" + this.f158410c + ", description=" + this.f158411d + ", progressValue=" + this.f158412e + ", progressState=" + this.f158413f + ", progressHint=" + this.f158414g + ", extraInfo=" + this.f158415h + ", limitsInfo=" + this.f158416i + ')';
    }
}
