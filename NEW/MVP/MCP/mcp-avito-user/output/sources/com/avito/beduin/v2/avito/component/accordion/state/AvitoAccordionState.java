package com.avito.beduin.v2.avito.component.accordion.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.F;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoAccordionState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState;", "Lcom/avito/beduin/v2/engine/component/c;", "Lcom/avito/beduin/v2/engine/component/F;", "Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$a;", "ArrowAlignment", "a", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvitoAccordionState implements InterfaceC36243c, F<a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f333696a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ArrowAlignment f333697b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final a f333698c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f333699d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f333700e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333701f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<k> f333702g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f333703h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333704i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333705j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f333706k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoAccordionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$ArrowAlignment;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ArrowAlignment {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ArrowAlignment[] f333707b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f333708c;

        static {
            ArrowAlignment[] arrowAlignmentArr = {new ArrowAlignment("TextEdge", 0), new ArrowAlignment("Trailing", 1)};
            f333707b = arrowAlignmentArr;
            f333708c = kotlin.enums.c.a(arrowAlignmentArr);
        }

        public ArrowAlignment() {
            throw null;
        }

        public static ArrowAlignment valueOf(String str) {
            return (ArrowAlignment) Enum.valueOf(ArrowAlignment.class, str);
        }

        public static ArrowAlignment[] values() {
            return (ArrowAlignment[]) f333707b.clone();
        }
    }

    /* compiled from: AvitoAccordionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$a;", "Lcom/avito/beduin/v2/engine/component/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements InterfaceC36244d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f333709a;

        public a(@Y61.k InterfaceC36249i interfaceC36249i) {
            this.f333709a = interfaceC36249i;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f333709a, ((a) obj).f333709a);
        }

        public final int hashCode() {
            return this.f333709a.hashCode();
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF333713a() {
            return this.f333709a;
        }

        @Y61.k
        public final String toString() {
            return "Content(component=" + this.f333709a + ')';
        }
    }

    public AvitoAccordionState(@Y61.k b bVar, @Y61.l ArrowAlignment arrowAlignment, @Y61.l a aVar, boolean z12, boolean z13, @Y61.l Y41.a<G0> aVar2, @Y61.k com.avito.beduin.v2.theme.l<k> lVar, boolean z14, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l String str) {
        this.f333696a = bVar;
        this.f333697b = arrowAlignment;
        this.f333698c = aVar;
        this.f333699d = z12;
        this.f333700e = z13;
        this.f333701f = aVar2;
        this.f333702g = lVar;
        this.f333703h = z14;
        this.f333704i = aVar3;
        this.f333705j = aVar4;
        this.f333706k = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f333704i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f333705j;
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
        if (!(obj instanceof AvitoAccordionState)) {
            return false;
        }
        AvitoAccordionState avitoAccordionState = (AvitoAccordionState) obj;
        return L.f(this.f333696a, avitoAccordionState.f333696a) && this.f333697b == avitoAccordionState.f333697b && L.f(this.f333698c, avitoAccordionState.f333698c) && this.f333699d == avitoAccordionState.f333699d && this.f333700e == avitoAccordionState.f333700e && L.f(this.f333701f, avitoAccordionState.f333701f) && L.f(this.f333702g, avitoAccordionState.f333702g) && this.f333703h == avitoAccordionState.f333703h && L.f(this.f333704i, avitoAccordionState.f333704i) && L.f(this.f333705j, avitoAccordionState.f333705j) && L.f(this.f333706k, avitoAccordionState.f333706k);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF333706k() {
        return this.f333706k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF333703h() {
        return this.f333703h;
    }

    public final int hashCode() {
        int iHashCode = this.f333696a.hashCode() * 31;
        ArrowAlignment arrowAlignment = this.f333697b;
        int iHashCode2 = (iHashCode + (arrowAlignment == null ? 0 : arrowAlignment.hashCode())) * 31;
        a aVar = this.f333698c;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode2 + (aVar == null ? 0 : aVar.f333709a.hashCode())) * 31, 31, this.f333699d), 31, this.f333700e);
        Y41.a<G0> aVar2 = this.f333701f;
        int i13 = androidx.appcompat.app.r.i(C31685o.g(this.f333702g, (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31), 31, this.f333703h);
        Y41.a<G0> aVar3 = this.f333704i;
        int iHashCode3 = (i13 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Y41.a<G0> aVar4 = this.f333705j;
        int iHashCode4 = (iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str = this.f333706k;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoAccordionState(title=");
        sb2.append(this.f333696a);
        sb2.append(", preferredArrowAlignment=");
        sb2.append(this.f333697b);
        sb2.append(", content=");
        sb2.append(this.f333698c);
        sb2.append(", loading=");
        sb2.append(this.f333699d);
        sb2.append(", expanded=");
        sb2.append(this.f333700e);
        sb2.append(", onClick=");
        sb2.append(this.f333701f);
        sb2.append(", style=");
        sb2.append(this.f333702g);
        sb2.append(", visible=");
        sb2.append(this.f333703h);
        sb2.append(", onShow=");
        sb2.append(this.f333704i);
        sb2.append(", onHide=");
        sb2.append(this.f333705j);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f333706k, ')');
    }

    /* compiled from: AvitoAccordionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$b;", "", "a", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f333710a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f333711b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final a f333712c;

        /* compiled from: AvitoAccordionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$b$a;", "Lcom/avito/beduin/v2/engine/component/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC36244d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final InterfaceC36249i f333713a;

            public a(@Y61.k InterfaceC36249i interfaceC36249i) {
                this.f333713a = interfaceC36249i;
            }

            @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
            public final boolean a() {
                return true;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f333713a, ((a) obj).f333713a);
            }

            public final int hashCode() {
                return this.f333713a.hashCode();
            }

            @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
            @Y61.k
            /* renamed from: r0, reason: from getter */
            public final InterfaceC36249i getF333713a() {
                return this.f333713a;
            }

            @Y61.k
            public final String toString() {
                return "Accessory(component=" + this.f333713a + ')';
            }
        }

        /* compiled from: AvitoAccordionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$b$b;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState$b$b, reason: collision with other inner class name */
        public static final class C10365b {
            public /* synthetic */ C10365b(C42822w c42822w) {
                this();
            }

            public C10365b() {
            }
        }

        static {
            new C10365b(null);
        }

        public b(@Y61.k String str, @Y61.l String str2, @Y61.l a aVar) {
            this.f333710a = str;
            this.f333711b = str2;
            this.f333712c = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f333710a, bVar.f333710a) && L.f(this.f333711b, bVar.f333711b) && L.f(this.f333712c, bVar.f333712c);
        }

        public final int hashCode() {
            int iHashCode = this.f333710a.hashCode() * 31;
            String str = this.f333711b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.f333712c;
            return iHashCode2 + (aVar != null ? aVar.f333713a.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Title(text=" + this.f333710a + ", icon=" + this.f333711b + ", accessory=" + this.f333712c + ')';
        }

        public /* synthetic */ b(String str, String str2, a aVar, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : aVar);
        }
    }
}
