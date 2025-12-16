package Rv;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d;
import com.avito.android.util.L3;
import com.avito.android.util.M3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorDiffUtil.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"LRv/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "a", "b", "c", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15084a extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C15084a f14728a = new C15084a();

    /* compiled from: TarifikatorDiffUtil.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRv/a$a;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rv.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0992a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final L3<String> f14729a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final L3<Boolean> f14730b;

        public C0992a(@k L3<String> l32, @k L3<Boolean> l33) {
            this.f14729a = l32;
            this.f14730b = l33;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0992a)) {
                return false;
            }
            C0992a c0992a = (C0992a) obj;
            return L.f(this.f14729a, c0992a.f14729a) && L.f(this.f14730b, c0992a.f14730b);
        }

        public final int hashCode() {
            return this.f14730b.hashCode() + (this.f14729a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "CustomTariffsItemPayload(description=" + this.f14729a + ", isLoading=" + this.f14730b + ')';
        }
    }

    /* compiled from: TarifikatorDiffUtil.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRv/a$b;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rv.a$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final L3<String> f14731a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final L3<com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c> f14732b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final L3<com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c> f14733c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final L3<com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c> f14734d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final L3<String> f14735e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final L3<List<com.avito.android.lib.design.bottom_sheet.k>> f14736f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final L3<Boolean> f14737g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final L3<Boolean> f14738h;

        public b(@k L3<String> l32, @k L3<com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c> l33, @k L3<com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c> l34, @k L3<com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c> l35, @k L3<String> l36, @k L3<List<com.avito.android.lib.design.bottom_sheet.k>> l37, @k L3<Boolean> l38, @k L3<Boolean> l39) {
            this.f14731a = l32;
            this.f14732b = l33;
            this.f14733c = l34;
            this.f14734d = l35;
            this.f14735e = l36;
            this.f14736f = l37;
            this.f14737g = l38;
            this.f14738h = l39;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f14731a, bVar.f14731a) && L.f(this.f14732b, bVar.f14732b) && L.f(this.f14733c, bVar.f14733c) && L.f(this.f14734d, bVar.f14734d) && L.f(this.f14735e, bVar.f14735e) && L.f(this.f14736f, bVar.f14736f) && L.f(this.f14737g, bVar.f14737g) && L.f(this.f14738h, bVar.f14738h);
        }

        public final int hashCode() {
            return this.f14738h.hashCode() + com.avito.android.actions_sheet.a.k(this.f14737g, com.avito.android.actions_sheet.a.k(this.f14736f, com.avito.android.actions_sheet.a.k(this.f14735e, com.avito.android.actions_sheet.a.k(this.f14734d, com.avito.android.actions_sheet.a.k(this.f14733c, com.avito.android.actions_sheet.a.k(this.f14732b, this.f14731a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        }

        @k
        public final String toString() {
            return "SettingItemPayload(title=" + this.f14731a + ", price=" + this.f14732b + ", minDays=" + this.f14733c + ", maxDays=" + this.f14734d + ", selectedTariffName=" + this.f14735e + ", selectOptions=" + this.f14736f + ", shouldShowSaveButton=" + this.f14737g + ", isLoading=" + this.f14738h + ')';
        }
    }

    /* compiled from: TarifikatorDiffUtil.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRv/a$c;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rv.a$c */
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final L3<String> f14739a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final L3<String> f14740b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final L3<Boolean> f14741c;

        public c(@k L3<String> l32, @k L3<String> l33, @k L3<Boolean> l34) {
            this.f14739a = l32;
            this.f14740b = l33;
            this.f14741c = l34;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f14739a, cVar.f14739a) && L.f(this.f14740b, cVar.f14740b) && L.f(this.f14741c, cVar.f14741c);
        }

        public final int hashCode() {
            return this.f14741c.hashCode() + com.avito.android.actions_sheet.a.k(this.f14740b, this.f14739a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "TariffCardItemPayload(name=" + this.f14739a + ", description=" + this.f14740b + ", isLoading=" + this.f14741c + ')';
        }
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF79989b() == aVar4.getF79989b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof d) && (aVar4 instanceof d)) {
            d dVar = (d) aVar4;
            d dVar2 = (d) aVar3;
            return new b(M3.b(dVar.f135410c, dVar2.f135410c), M3.b(dVar.f135411d, dVar2.f135411d), M3.b(dVar.f135412e, dVar2.f135412e), M3.b(dVar.f135413f, dVar2.f135413f), M3.b(dVar.f135414g, dVar2.f135414g), M3.b(dVar.f135415h, dVar2.f135415h), M3.b(Boolean.valueOf(dVar.f135416i), Boolean.valueOf(dVar2.f135416i)), M3.b(Boolean.valueOf(dVar.f135418k), Boolean.valueOf(dVar2.f135418k)));
        }
        if ((aVar3 instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d) && (aVar4 instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d)) {
            com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d dVar3 = (com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d) aVar4;
            com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d dVar4 = (com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d) aVar3;
            return new C0992a(M3.b(dVar3.f135368f, dVar4.f135368f), M3.b(Boolean.valueOf(dVar3.f135370h), Boolean.valueOf(dVar4.f135370h)));
        }
        if (!(aVar3 instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c) || !(aVar4 instanceof com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c)) {
            return null;
        }
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c cVar = (com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c) aVar4;
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c cVar2 = (com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c) aVar3;
        return new c(M3.b(cVar.f135469d, cVar2.f135469d), M3.b(cVar.f135470e, cVar2.f135470e), M3.b(Boolean.valueOf(cVar.f135472g), Boolean.valueOf(cVar2.f135472g)));
    }
}
