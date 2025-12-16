package com.avito.android.loyalty.ui.criteria.items.card;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CardItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/a;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183469b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f183470c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f183471d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f183472e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AbstractC5383a f183473f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f183474g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f183475h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final b f183476i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f183477j;

    /* compiled from: CardItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/a$a;", "", "a", "b", "c", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$a$a;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$a$b;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$a$c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.loyalty.ui.criteria.items.card.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC5383a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f183478a;

        /* compiled from: CardItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/a$a$a;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.loyalty.ui.criteria.items.card.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5384a extends AbstractC5383a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f183479b;

            public C5384a() {
                super("green", null);
                this.f183479b = "green";
            }

            @Override // com.avito.android.loyalty.ui.criteria.items.card.a.AbstractC5383a
            @k
            /* renamed from: a, reason: from getter */
            public final String getF183478a() {
                return this.f183479b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5384a) && L.f(this.f183479b, ((C5384a) obj).f183479b);
            }

            public final int hashCode() {
                return this.f183479b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Green(colorName="), this.f183479b, ')');
            }
        }

        /* compiled from: CardItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/a$a$b;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.loyalty.ui.criteria.items.card.a$a$b */
        public static final /* data */ class b extends AbstractC5383a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f183480b;

            public b() {
                super("red", null);
                this.f183480b = "red";
            }

            @Override // com.avito.android.loyalty.ui.criteria.items.card.a.AbstractC5383a
            @k
            /* renamed from: a, reason: from getter */
            public final String getF183478a() {
                return this.f183480b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f183480b, ((b) obj).f183480b);
            }

            public final int hashCode() {
                return this.f183480b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Red(colorName="), this.f183480b, ')');
            }
        }

        /* compiled from: CardItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/a$a$c;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.loyalty.ui.criteria.items.card.a$a$c */
        public static final /* data */ class c extends AbstractC5383a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f183481b;

            public c() {
                super("yellow", null);
                this.f183481b = "yellow";
            }

            @Override // com.avito.android.loyalty.ui.criteria.items.card.a.AbstractC5383a
            @k
            /* renamed from: a, reason: from getter */
            public final String getF183478a() {
                return this.f183481b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f183481b, ((c) obj).f183481b);
            }

            public final int hashCode() {
                return this.f183481b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Yellow(colorName="), this.f183481b, ')');
            }
        }

        public AbstractC5383a(String str, C42822w c42822w) {
            this.f183478a = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public String getF183478a() {
            return this.f183478a;
        }
    }

    /* compiled from: CardItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/a$b;", "", "a", "b", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$b$a;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$b$b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CardItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/a$b$a;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.loyalty.ui.criteria.items.card.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C5385a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f183482a;

            public C5385a() {
                super("advices", null);
                this.f183482a = "advices";
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5385a) && L.f(this.f183482a, ((C5385a) obj).f183482a);
            }

            public final int hashCode() {
                return this.f183482a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Advice(name="), this.f183482a, ')');
            }
        }

        /* compiled from: CardItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/a$b$b;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a$b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.loyalty.ui.criteria.items.card.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5386b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f183483a;

            public C5386b() {
                super(ProfileTab.ALL, null);
                this.f183483a = ProfileTab.ALL;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5386b) && L.f(this.f183483a, ((C5386b) obj).f183483a);
            }

            public final int hashCode() {
                return this.f183483a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("All(name="), this.f183483a, ')');
            }
        }

        public b(String str, C42822w c42822w) {
        }
    }

    public a(@k String str, @k String str2, @k String str3, @k AttributedText attributedText, @l AbstractC5383a abstractC5383a, @l Integer num, @l String str4, @l b bVar, boolean z12) {
        this.f183469b = str;
        this.f183470c = str2;
        this.f183471d = str3;
        this.f183472e = attributedText;
        this.f183473f = abstractC5383a;
        this.f183474g = num;
        this.f183475h = str4;
        this.f183476i = bVar;
        this.f183477j = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183469b, aVar.f183469b) && L.f(this.f183470c, aVar.f183470c) && L.f(this.f183471d, aVar.f183471d) && L.f(this.f183472e, aVar.f183472e) && L.f(this.f183473f, aVar.f183473f) && L.f(this.f183474g, aVar.f183474g) && L.f(this.f183475h, aVar.f183475h) && L.f(this.f183476i, aVar.f183476i) && this.f183477j == aVar.f183477j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162223b() {
        return getF183469b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183469b() {
        return this.f183469b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(H.d(this.f183469b.hashCode() * 31, 31, this.f183470c), 31, this.f183471d), 31, this.f183472e);
        AbstractC5383a abstractC5383a = this.f183473f;
        int iHashCode = (iB2 + (abstractC5383a == null ? 0 : abstractC5383a.hashCode())) * 31;
        Integer num = this.f183474g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f183475h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f183476i;
        return Boolean.hashCode(this.f183477j) + ((iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardItem(stringId=");
        sb2.append(this.f183469b);
        sb2.append(", title=");
        sb2.append(this.f183470c);
        sb2.append(", criteriaName=");
        sb2.append(this.f183471d);
        sb2.append(", description=");
        sb2.append(this.f183472e);
        sb2.append(", color=");
        sb2.append(this.f183473f);
        sb2.append(", score=");
        sb2.append(this.f183474g);
        sb2.append(", badge=");
        sb2.append(this.f183475h);
        sb2.append(", tab=");
        sb2.append(this.f183476i);
        sb2.append(", isExpanded=");
        return r.x(sb2, this.f183477j, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, AttributedText attributedText, AbstractC5383a abstractC5383a, Integer num, String str4, b bVar, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, attributedText, abstractC5383a, num, str4, bVar, (i12 & 256) != 0 ? false : z12);
    }
}
