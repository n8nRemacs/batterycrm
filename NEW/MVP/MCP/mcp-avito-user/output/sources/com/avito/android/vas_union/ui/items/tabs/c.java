package com.avito.android.vas_union.ui.items.tabs;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2TabsItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/tabs/c;", "Lcom/avito/conveyor_item/a;", "a", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323246b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<a> f323247c;

    /* compiled from: VasUnionV2TabsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/tabs/c$a;", "", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f323248a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f323249b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f323250c;

        public a(@k PrintableText printableText, @k String str, boolean z12) {
            this.f323248a = str;
            this.f323249b = printableText;
            this.f323250c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f323248a, aVar.f323248a) && L.f(this.f323249b, aVar.f323249b) && this.f323250c == aVar.f323250c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f323250c) + com.avito.android.actions_sheet.a.f(this.f323249b, this.f323248a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tab(type=");
            sb2.append(this.f323248a);
            sb2.append(", text=");
            sb2.append(this.f323249b);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f323250c, ')');
        }
    }

    public c(@k String str, @k List<a> list) {
        this.f323246b = str;
        this.f323247c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f323246b, cVar.f323246b) && L.f(this.f323247c, cVar.f323247c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF323246b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323246b() {
        return this.f323246b;
    }

    public final int hashCode() {
        return this.f323247c.hashCode() + (this.f323246b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasUnionV2TabsItem(stringId=");
        sb2.append(this.f323246b);
        sb2.append(", tabs=");
        return H.p(sb2, this.f323247c, ')');
    }
}
