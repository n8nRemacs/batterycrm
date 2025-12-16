package com.avito.android.verification.inn.list.group_card;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupCardItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/inn/list/group_card/GroupCardItem;", "Lcom/avito/conveyor_item/a;", "State", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GroupCardItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323985b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323986c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f323987d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f323988e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f323989f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final State f323990g;

    /* renamed from: h, reason: collision with root package name */
    public final int f323991h;

    /* renamed from: i, reason: collision with root package name */
    public final int f323992i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupCardItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/group_card/GroupCardItem$State;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f323993b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f323994c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f323995d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f323996e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f323997f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f323998g;

        static {
            State state = new State("DEFAULT", 0);
            f323993b = state;
            State state2 = new State("PENDING", 1);
            f323994c = state2;
            State state3 = new State("SUCCESS", 2);
            f323995d = state3;
            State state4 = new State("FAILURE", 3);
            f323996e = state4;
            State[] stateArr = {state, state2, state3, state4};
            f323997f = stateArr;
            f323998g = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f323997f.clone();
        }
    }

    public GroupCardItem(@k String str, @k String str2, @k AttributedText attributedText, @l DeepLink deepLink, @l UniversalImage universalImage, @k State state, int i12, int i13) {
        this.f323985b = str;
        this.f323986c = str2;
        this.f323987d = attributedText;
        this.f323988e = deepLink;
        this.f323989f = universalImage;
        this.f323990g = state;
        this.f323991h = i12;
        this.f323992i = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCardItem)) {
            return false;
        }
        GroupCardItem groupCardItem = (GroupCardItem) obj;
        return L.f(this.f323985b, groupCardItem.f323985b) && L.f(this.f323986c, groupCardItem.f323986c) && L.f(this.f323987d, groupCardItem.f323987d) && L.f(this.f323988e, groupCardItem.f323988e) && L.f(this.f323989f, groupCardItem.f323989f) && this.f323990g == groupCardItem.f323990g && this.f323991h == groupCardItem.f323991h && this.f323992i == groupCardItem.f323992i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80137b() {
        return getF283219m().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283219m() {
        return this.f323985b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(this.f323985b.hashCode() * 31, 31, this.f323986c), 31, this.f323987d);
        DeepLink deepLink = this.f323988e;
        int iHashCode = (iB2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f323989f;
        return Integer.hashCode(this.f323992i) + r.e(this.f323991h, (this.f323990g.hashCode() + ((iHashCode + (universalImage != null ? universalImage.hashCode() : 0)) * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupCardItem(stringId=");
        sb2.append(this.f323985b);
        sb2.append(", title=");
        sb2.append(this.f323986c);
        sb2.append(", description=");
        sb2.append(this.f323987d);
        sb2.append(", deeplink=");
        sb2.append(this.f323988e);
        sb2.append(", image=");
        sb2.append(this.f323989f);
        sb2.append(", state=");
        sb2.append(this.f323990g);
        sb2.append(", marginTop=");
        sb2.append(this.f323991h);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f323992i, ')');
    }

    public /* synthetic */ GroupCardItem(String str, String str2, AttributedText attributedText, DeepLink deepLink, UniversalImage universalImage, State state, int i12, int i13, int i14, C42822w c42822w) {
        this(str, str2, attributedText, deepLink, universalImage, state, (i14 & 64) != 0 ? 0 : i12, (i14 & 128) != 0 ? 0 : i13);
    }
}
