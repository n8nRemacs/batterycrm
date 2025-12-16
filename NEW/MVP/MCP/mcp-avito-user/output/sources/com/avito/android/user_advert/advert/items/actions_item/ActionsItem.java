package com.avito.android.user_advert.advert.items.actions_item;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionsItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem;", "Lcom/avito/conveyor_item/a;", "Action", "a", "b", "c", "d", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ActionsItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309005b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Action> f309006c;

    /* compiled from: ActionsItem.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$Action;", "", "<init>", "()V", "Style", "Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$a;", "Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$b;", "Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$c;", "Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Action {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ActionsItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$Action$Style;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Style {

            /* renamed from: b, reason: collision with root package name */
            public static final Style f309007b;

            /* renamed from: c, reason: collision with root package name */
            public static final Style f309008c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Style[] f309009d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f309010e;

            static {
                Style style = new Style("PRIMARY", 0);
                f309007b = style;
                Style style2 = new Style("SECONDARY", 1);
                f309008c = style2;
                Style[] styleArr = {style, style2};
                f309009d = styleArr;
                f309010e = kotlin.enums.c.a(styleArr);
            }

            public Style() {
                throw null;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) f309009d.clone();
            }
        }

        public /* synthetic */ Action(C42822w c42822w) {
            this();
        }

        @Y61.k
        /* renamed from: a */
        public abstract Style getF309026c();

        @Y61.k
        /* renamed from: b */
        public abstract String getF309024a();

        public Action() {
        }
    }

    /* compiled from: ActionsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$a;", "Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$Action;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends Action {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f309011a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f309012b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Action.Style f309013c;

        public a(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k Action.Style style) {
            super(null);
            this.f309011a = str;
            this.f309012b = deepLink;
            this.f309013c = style;
        }

        @Override // com.avito.android.user_advert.advert.items.actions_item.ActionsItem.Action
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Action.Style getF309026c() {
            return this.f309013c;
        }

        @Override // com.avito.android.user_advert.advert.items.actions_item.ActionsItem.Action
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF309024a() {
            return this.f309011a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f309011a, aVar.f309011a) && L.f(this.f309012b, aVar.f309012b) && this.f309013c == aVar.f309013c;
        }

        public final int hashCode() {
            return this.f309013c.hashCode() + com.avito.android.actions_sheet.a.e(this.f309012b, this.f309011a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            return "Button(title=" + this.f309011a + ", deepLink=" + this.f309012b + ", style=" + this.f309013c + ')';
        }
    }

    /* compiled from: ActionsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$b;", "Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$Action;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends Action {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f309014a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f309015b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Action.Style f309016c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f309017d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l String str2) {
            super(null);
            Action.Style style = Action.Style.f309008c;
            this.f309014a = str;
            this.f309015b = deepLink;
            this.f309016c = style;
            this.f309017d = str2;
        }

        @Override // com.avito.android.user_advert.advert.items.actions_item.ActionsItem.Action
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Action.Style getF309026c() {
            return this.f309016c;
        }

        @Override // com.avito.android.user_advert.advert.items.actions_item.ActionsItem.Action
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF309024a() {
            return this.f309014a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f309014a, bVar.f309014a) && L.f(this.f309015b, bVar.f309015b) && this.f309016c == bVar.f309016c && L.f(this.f309017d, bVar.f309017d);
        }

        public final int hashCode() {
            int iHashCode = (this.f309016c.hashCode() + com.avito.android.actions_sheet.a.e(this.f309015b, this.f309014a.hashCode() * 31, 31)) * 31;
            String str = this.f309017d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonWithBadge(title=");
            sb2.append(this.f309014a);
            sb2.append(", deepLink=");
            sb2.append(this.f309015b);
            sb2.append(", style=");
            sb2.append(this.f309016c);
            sb2.append(", badgeText=");
            return C22026a.c(sb2, this.f309017d, ')');
        }
    }

    /* compiled from: ActionsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$c;", "Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$Action;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends Action {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f309018a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f309019b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Action.Style f309020c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f309021d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f309022e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f309023f;

        public c(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k Action.Style style, boolean z12, boolean z13, @Y61.k String str2) {
            super(null);
            this.f309018a = str;
            this.f309019b = deepLink;
            this.f309020c = style;
            this.f309021d = z12;
            this.f309022e = z13;
            this.f309023f = str2;
        }

        @Override // com.avito.android.user_advert.advert.items.actions_item.ActionsItem.Action
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Action.Style getF309026c() {
            return this.f309020c;
        }

        @Override // com.avito.android.user_advert.advert.items.actions_item.ActionsItem.Action
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF309024a() {
            return this.f309018a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f309018a, cVar.f309018a) && L.f(this.f309019b, cVar.f309019b) && this.f309020c == cVar.f309020c && this.f309021d == cVar.f309021d && this.f309022e == cVar.f309022e && L.f(this.f309023f, cVar.f309023f);
        }

        public final int hashCode() {
            return this.f309023f.hashCode() + r.i(r.i((this.f309020c.hashCode() + com.avito.android.actions_sheet.a.e(this.f309019b, this.f309018a.hashCode() * 31, 31)) * 31, 31, this.f309021d), 31, this.f309022e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PromotionButton(title=");
            sb2.append(this.f309018a);
            sb2.append(", deepLink=");
            sb2.append(this.f309019b);
            sb2.append(", style=");
            sb2.append(this.f309020c);
            sb2.append(", onboardingWasShown=");
            sb2.append(this.f309021d);
            sb2.append(", specificTextForTrxItem=");
            sb2.append(this.f309022e);
            sb2.append(", advertId=");
            return C22026a.c(sb2, this.f309023f, ')');
        }
    }

    /* compiled from: ActionsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$d;", "Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$Action;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends Action {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f309024a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f309025b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Action.Style f309026c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f309027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k String str2) {
            super(null);
            Action.Style style = Action.Style.f309007b;
            this.f309024a = str;
            this.f309025b = deepLink;
            this.f309026c = style;
            this.f309027d = str2;
        }

        @Override // com.avito.android.user_advert.advert.items.actions_item.ActionsItem.Action
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Action.Style getF309026c() {
            return this.f309026c;
        }

        @Override // com.avito.android.user_advert.advert.items.actions_item.ActionsItem.Action
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF309024a() {
            return this.f309024a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f309024a, dVar.f309024a) && L.f(this.f309025b, dVar.f309025b) && this.f309026c == dVar.f309026c && L.f(this.f309027d, dVar.f309027d);
        }

        public final int hashCode() {
            return this.f309027d.hashCode() + ((this.f309026c.hashCode() + com.avito.android.actions_sheet.a.e(this.f309025b, this.f309024a.hashCode() * 31, 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VasButton(title=");
            sb2.append(this.f309024a);
            sb2.append(", deepLink=");
            sb2.append(this.f309025b);
            sb2.append(", style=");
            sb2.append(this.f309026c);
            sb2.append(", advertId=");
            return C22026a.c(sb2, this.f309027d, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionsItem(@Y61.k String str, @Y61.k List<? extends Action> list) {
        this.f309005b = str;
        this.f309006c = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionsItem)) {
            return false;
        }
        ActionsItem actionsItem = (ActionsItem) obj;
        return L.f(this.f309005b, actionsItem.f309005b) && L.f(this.f309006c, actionsItem.f309006c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return getF150590d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF150590d() {
        return this.f309005b;
    }

    public final int hashCode() {
        return this.f309006c.hashCode() + (this.f309005b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionsItem(stringId=");
        sb2.append(this.f309005b);
        sb2.append(", actions=");
        return H.p(sb2, this.f309006c, ')');
    }
}
