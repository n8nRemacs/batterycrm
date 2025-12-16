package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "a", "b", "c", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f221057c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f221058d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC6681a f221059e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Y41.l<DeepLink, G0> f221060f;

    /* compiled from: PositionItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$a;", "", "a", "b", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$a$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$a$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a$a, reason: collision with other inner class name */
    public interface InterfaceC6681a {

        /* compiled from: PositionItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$a$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6682a implements InterfaceC6681a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final AttributedText f221061a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final AttributedText f221062b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final PrintableText f221063c;

            public C6682a(@l AttributedText attributedText, @l AttributedText attributedText2, @l PrintableText printableText) {
                this.f221061a = attributedText;
                this.f221062b = attributedText2;
                this.f221063c = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6682a)) {
                    return false;
                }
                C6682a c6682a = (C6682a) obj;
                return L.f(this.f221061a, c6682a.f221061a) && L.f(this.f221062b, c6682a.f221062b) && L.f(this.f221063c, c6682a.f221063c);
            }

            public final int hashCode() {
                AttributedText attributedText = this.f221061a;
                int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
                AttributedText attributedText2 = this.f221062b;
                int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
                PrintableText printableText = this.f221063c;
                return iHashCode2 + (printableText != null ? printableText.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(delta=");
                sb2.append(this.f221061a);
                sb2.append(", position=");
                sb2.append(this.f221062b);
                sb2.append(", tooltipText=");
                return AK.c.m(sb2, this.f221063c, ')');
            }
        }

        /* compiled from: PositionItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$a$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a$a$b */
        public static final /* data */ class b implements InterfaceC6681a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f221064a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -62319438;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: PositionItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f221065a;

        public b(@k ArrayList arrayList) {
            this.f221065a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f221065a.equals(((b) obj).f221065a);
        }

        public final int hashCode() {
            return this.f221065a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Payload(changes="), this.f221065a, ')');
        }
    }

    /* compiled from: PositionItem.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c;", "", "a", "b", "c", "d", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c$c;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c$d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: PositionItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C6683a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C6683a f221066a = new C6683a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C6683a);
            }

            public final int hashCode() {
                return 1658908441;
            }

            @k
            public final String toString() {
                return "Description";
            }
        }

        /* compiled from: PositionItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f221067a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1505128399;
            }

            @k
            public final String toString() {
                return "Info";
            }
        }

        /* compiled from: PositionItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c$c;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a$c$c, reason: collision with other inner class name */
        public static final /* data */ class C6684c implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C6684c f221068a = new C6684c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C6684c);
            }

            public final int hashCode() {
                return 1182179339;
            }

            @k
            public final String toString() {
                return "LinkClick";
            }
        }

        /* compiled from: PositionItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c$d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a$c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f221069a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 595683125;
            }

            @k
            public final String toString() {
                return "Title";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k PrintableText printableText, @l AttributedText attributedText, @k InterfaceC6681a interfaceC6681a, @k Y41.l<? super DeepLink, G0> lVar) {
        this.f221056b = str;
        this.f221057c = printableText;
        this.f221058d = attributedText;
        this.f221059e = interfaceC6681a;
        this.f221060f = lVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f221056b, aVar.f221056b) && L.f(this.f221057c, aVar.f221057c) && L.f(this.f221058d, aVar.f221058d) && L.f(this.f221059e, aVar.f221059e) && L.f(this.f221060f, aVar.f221060f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85764e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF116728d() {
        return this.f221056b;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f221057c, this.f221056b.hashCode() * 31, 31);
        AttributedText attributedText = this.f221058d;
        return this.f221060f.hashCode() + ((this.f221059e.hashCode() + ((iF2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionItem(stringId=");
        sb2.append(this.f221056b);
        sb2.append(", title=");
        sb2.append(this.f221057c);
        sb2.append(", description=");
        sb2.append(this.f221058d);
        sb2.append(", info=");
        sb2.append(this.f221059e);
        sb2.append(", onLinkClicked=");
        return H.l(sb2, this.f221060f, ')');
    }
}
