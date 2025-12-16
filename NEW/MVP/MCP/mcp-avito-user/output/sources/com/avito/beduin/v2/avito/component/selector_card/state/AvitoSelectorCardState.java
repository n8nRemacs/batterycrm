package com.avito.beduin.v2.avito.component.selector_card.state;

import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.beduin.v2.engine.component.F;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSelectorCardState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState;", "Lcom/avito/beduin/v2/engine/component/c;", "Lcom/avito/beduin/v2/engine/component/F;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$b;", "CardIndicatorType", "CardSelectionType", "CardState", "a", "b", "c", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvitoSelectorCardState implements InterfaceC36243c, F<b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<l> f335040a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CardState f335041b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CardSelectionType f335042c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CardIndicatorType f335043d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f335044e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f335045f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.avito.component.selector_card.state.a f335046g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335047h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f335048i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335049j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335050k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f335051l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoSelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$CardIndicatorType;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CardIndicatorType {

        /* renamed from: c, reason: collision with root package name */
        public static final CardIndicatorType f335052c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CardIndicatorType[] f335053d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f335054e;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f335055b;

        static {
            CardIndicatorType cardIndicatorType = new CardIndicatorType("None", 0, "none");
            CardIndicatorType cardIndicatorType2 = new CardIndicatorType("Checkmark", 1, "checkmark");
            f335052c = cardIndicatorType2;
            CardIndicatorType[] cardIndicatorTypeArr = {cardIndicatorType, cardIndicatorType2, new CardIndicatorType("Switcher", 2, "switcher")};
            f335053d = cardIndicatorTypeArr;
            f335054e = kotlin.enums.c.a(cardIndicatorTypeArr);
        }

        public CardIndicatorType(String str, int i12, String str2) {
            this.f335055b = str2;
        }

        public static CardIndicatorType valueOf(String str) {
            return (CardIndicatorType) Enum.valueOf(CardIndicatorType.class, str);
        }

        public static CardIndicatorType[] values() {
            return (CardIndicatorType[]) f335053d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoSelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$CardSelectionType;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CardSelectionType {

        /* renamed from: c, reason: collision with root package name */
        public static final CardSelectionType f335056c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CardSelectionType[] f335057d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f335058e;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f335059b;

        static {
            CardSelectionType cardSelectionType = new CardSelectionType("None", 0, "none");
            CardSelectionType cardSelectionType2 = new CardSelectionType("Border", 1, "border");
            f335056c = cardSelectionType2;
            CardSelectionType[] cardSelectionTypeArr = {cardSelectionType, cardSelectionType2, new CardSelectionType("BorderWithIndicator", 2, "borderWithIndicator")};
            f335057d = cardSelectionTypeArr;
            f335058e = kotlin.enums.c.a(cardSelectionTypeArr);
        }

        public CardSelectionType(String str, int i12, String str2) {
            this.f335059b = str2;
        }

        public static CardSelectionType valueOf(String str) {
            return (CardSelectionType) Enum.valueOf(CardSelectionType.class, str);
        }

        public static CardSelectionType[] values() {
            return (CardSelectionType[]) f335057d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoSelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$CardState;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CardState {

        /* renamed from: c, reason: collision with root package name */
        public static final CardState f335060c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CardState[] f335061d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f335062e;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f335063b;

        static {
            CardState cardState = new CardState("Normal", 0, Constants.NORMAL);
            f335060c = cardState;
            CardState[] cardStateArr = {cardState, new CardState("Error", 1, "error")};
            f335061d = cardStateArr;
            f335062e = kotlin.enums.c.a(cardStateArr);
        }

        public CardState(String str, int i12, String str2) {
            this.f335063b = str2;
        }

        public static CardState valueOf(String str) {
            return (CardState) Enum.valueOf(CardState.class, str);
        }

        public static CardState[] values() {
            return (CardState[]) f335061d.clone();
        }
    }

    /* compiled from: AvitoSelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$a;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.beduin.v2.avito.component.selector_card.state.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final b f335064a;

        public a(@Y61.l b bVar) {
            this.f335064a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f335064a, ((a) obj).f335064a);
        }

        public final int hashCode() {
            b bVar = this.f335064a;
            if (bVar == null) {
                return 0;
            }
            return bVar.f335065a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ComponentContent(content=" + this.f335064a + ')';
        }
    }

    /* compiled from: AvitoSelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$b;", "Lcom/avito/beduin/v2/engine/component/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC36244d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f335065a;

        public b(@Y61.k InterfaceC36249i interfaceC36249i) {
            this.f335065a = interfaceC36249i;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f335065a, ((b) obj).f335065a);
        }

        public final int hashCode() {
            return this.f335065a.hashCode();
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF333915a() {
            return this.f335065a;
        }

        @Y61.k
        public final String toString() {
            return "Content(component=" + this.f335065a + ')';
        }
    }

    /* compiled from: AvitoSelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$c;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements com.avito.beduin.v2.avito.component.selector_card.state.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f335066a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f335067b;

        public c(@Y61.k String str, @Y61.k String str2) {
            this.f335066a = str;
            this.f335067b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f335066a, cVar.f335066a) && L.f(this.f335067b, cVar.f335067b);
        }

        public final int hashCode() {
            return this.f335067b.hashCode() + (this.f335066a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextContent(title=");
            sb2.append(this.f335066a);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f335067b, ')');
        }
    }

    public AvitoSelectorCardState(@Y61.k com.avito.beduin.v2.theme.l<l> lVar, @Y61.k CardState cardState, @Y61.k CardSelectionType cardSelectionType, @Y61.k CardIndicatorType cardIndicatorType, boolean z12, boolean z13, @Y61.l com.avito.beduin.v2.avito.component.selector_card.state.a aVar, @Y61.l Y41.a<G0> aVar2, boolean z14, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l String str) {
        this.f335040a = lVar;
        this.f335041b = cardState;
        this.f335042c = cardSelectionType;
        this.f335043d = cardIndicatorType;
        this.f335044e = z12;
        this.f335045f = z13;
        this.f335046g = aVar;
        this.f335047h = aVar2;
        this.f335048i = z14;
        this.f335049j = aVar3;
        this.f335050k = aVar4;
        this.f335051l = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335049j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335050k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoSelectorCardState)) {
            return false;
        }
        AvitoSelectorCardState avitoSelectorCardState = (AvitoSelectorCardState) obj;
        return L.f(this.f335040a, avitoSelectorCardState.f335040a) && this.f335041b == avitoSelectorCardState.f335041b && this.f335042c == avitoSelectorCardState.f335042c && this.f335043d == avitoSelectorCardState.f335043d && this.f335044e == avitoSelectorCardState.f335044e && this.f335045f == avitoSelectorCardState.f335045f && L.f(this.f335046g, avitoSelectorCardState.f335046g) && L.f(this.f335047h, avitoSelectorCardState.f335047h) && this.f335048i == avitoSelectorCardState.f335048i && L.f(this.f335049j, avitoSelectorCardState.f335049j) && L.f(this.f335050k, avitoSelectorCardState.f335050k) && L.f(this.f335051l, avitoSelectorCardState.f335051l);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF333914h() {
        return this.f335051l;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF333911e() {
        return this.f335048i;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f335043d.hashCode() + ((this.f335042c.hashCode() + ((this.f335041b.hashCode() + (this.f335040a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f335044e), 31, this.f335045f);
        com.avito.beduin.v2.avito.component.selector_card.state.a aVar = this.f335046g;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335047h;
        int i13 = androidx.appcompat.app.r.i((iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f335048i);
        Y41.a<G0> aVar3 = this.f335049j;
        int iHashCode2 = (i13 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Y41.a<G0> aVar4 = this.f335050k;
        int iHashCode3 = (iHashCode2 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str = this.f335051l;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoSelectorCardState(style=");
        sb2.append(this.f335040a);
        sb2.append(", cardState=");
        sb2.append(this.f335041b);
        sb2.append(", cardSelectionType=");
        sb2.append(this.f335042c);
        sb2.append(", cardIndicatorType=");
        sb2.append(this.f335043d);
        sb2.append(", enabled=");
        sb2.append(this.f335044e);
        sb2.append(", selected=");
        sb2.append(this.f335045f);
        sb2.append(", content=");
        sb2.append(this.f335046g);
        sb2.append(", onSelect=");
        sb2.append(this.f335047h);
        sb2.append(", visible=");
        sb2.append(this.f335048i);
        sb2.append(", onShow=");
        sb2.append(this.f335049j);
        sb2.append(", onHide=");
        sb2.append(this.f335050k);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335051l, ')');
    }
}
