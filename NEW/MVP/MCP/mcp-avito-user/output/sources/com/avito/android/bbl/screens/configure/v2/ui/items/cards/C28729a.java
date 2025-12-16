package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import wZ.C49582f;

/* compiled from: BblConfigItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/a;", "Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/D;", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bbl.screens.configure.v2.ui.items.cards.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C28729a implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedText f99403a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99404b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f99405c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final wZ.l f99406d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final C2994a f99407e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Long f99408f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final C49582f f99409g;

    /* compiled from: BblConfigItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/a$a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bbl.screens.configure.v2.ui.items.cards.a$a, reason: collision with other inner class name */
    public static final class C2994a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f99410a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.component.docking_badge.m f99411b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.component.docking_badge.m f99412c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final N f99413d;

        /* JADX WARN: Multi-variable type inference failed */
        public C2994a(@Y61.k String str, @Y61.k com.akita.compose.component.docking_badge.m mVar, @Y61.k com.akita.compose.component.docking_badge.m mVar2, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, com.akita.compose.component.docking_badge.i> pVar) {
            this.f99410a = str;
            this.f99411b = mVar;
            this.f99412c = mVar2;
            this.f99413d = (N) pVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2994a)) {
                return false;
            }
            C2994a c2994a = (C2994a) obj;
            return L.f(this.f99410a, c2994a.f99410a) && L.f(this.f99411b, c2994a.f99411b) && L.f(this.f99412c, c2994a.f99412c);
        }

        public final int hashCode() {
            return this.f99412c.hashCode() + ((this.f99411b.hashCode() + (this.f99410a.hashCode() * 31)) * 31);
        }
    }

    public C28729a(@Y61.k AttributedText attributedText, boolean z12, boolean z13, @Y61.l wZ.l lVar, @Y61.l C2994a c2994a, @Y61.l Long l12, @Y61.l C49582f c49582f) {
        this.f99403a = attributedText;
        this.f99404b = z12;
        this.f99405c = z13;
        this.f99406d = lVar;
        this.f99407e = c2994a;
        this.f99408f = l12;
        this.f99409g = c49582f;
    }

    public static C28729a d(C28729a c28729a, boolean z12) {
        return new C28729a(c28729a.f99403a, z12, c28729a.f99405c, c28729a.f99406d, c28729a.f99407e, c28729a.f99408f, c28729a.f99409g);
    }

    @Override // com.avito.android.bbl.screens.configure.v2.ui.items.cards.D
    /* renamed from: a, reason: from getter */
    public final boolean getF99404b() {
        return this.f99404b;
    }

    @Override // com.avito.android.bbl.screens.configure.v2.ui.items.cards.D
    /* renamed from: b, reason: from getter */
    public final boolean getF99405c() {
        return this.f99405c;
    }

    @Override // com.avito.android.bbl.screens.configure.v2.ui.items.cards.D
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final C2994a getF99407e() {
        return this.f99407e;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28729a)) {
            return false;
        }
        C28729a c28729a = (C28729a) obj;
        return L.f(this.f99403a, c28729a.f99403a) && this.f99404b == c28729a.f99404b && this.f99405c == c28729a.f99405c && L.f(this.f99406d, c28729a.f99406d) && L.f(this.f99407e, c28729a.f99407e) && L.f(this.f99408f, c28729a.f99408f) && L.f(this.f99409g, c28729a.f99409g);
    }

    @Override // com.avito.android.bbl.screens.configure.v2.ui.items.cards.D
    @Y61.l
    /* renamed from: getImage, reason: from getter */
    public final wZ.l getF99406d() {
        return this.f99406d;
    }

    @Override // com.avito.android.bbl.screens.configure.v2.ui.items.cards.D
    @Y61.k
    /* renamed from: getText, reason: from getter */
    public final AttributedText getF99403a() {
        return this.f99403a;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f99403a.hashCode() * 31, 31, this.f99404b), 31, this.f99405c);
        wZ.l lVar = this.f99406d;
        int iHashCode = (i12 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C2994a c2994a = this.f99407e;
        int iHashCode2 = (iHashCode + (c2994a == null ? 0 : c2994a.hashCode())) * 31;
        Long l12 = this.f99408f;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        C49582f c49582f = this.f99409g;
        return iHashCode3 + (c49582f != null ? c49582f.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BblConfigItem(text=" + this.f99403a + ", checked=" + this.f99404b + ", isHalfSize=" + this.f99405c + ", image=" + this.f99406d + ", badge=" + this.f99407e + ", configId=" + this.f99408f + ", contact=" + this.f99409g + ')';
    }

    public /* synthetic */ C28729a(AttributedText attributedText, boolean z12, boolean z13, wZ.l lVar, C2994a c2994a, Long l12, C49582f c49582f, int i12, C42822w c42822w) {
        this(attributedText, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? null : lVar, (i12 & 16) != 0 ? null : c2994a, (i12 & 32) != 0 ? null : l12, (i12 & 64) == 0 ? c49582f : null);
    }
}
