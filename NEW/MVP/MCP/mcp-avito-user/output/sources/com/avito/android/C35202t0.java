package com.avito.android;

import com.avito.android.di.InterfaceC29975l;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FavoriteSellersRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/t0;", "Lcom/avito/android/r0;", "a", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.t0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C35202t0 implements InterfaceC34162r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.common.a f294213a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f294214b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<kotlin.G0> f294215c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.e2 f294216d = kotlinx.coroutines.flow.f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public C35202t0(@InterfaceC29975l @Y61.k com.avito.android.common.a aVar) {
        this.f294213a = aVar;
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    public final InterfaceC43160i<kotlin.G0> f() {
        return this.f294216d;
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    @InterfaceC42830m
    public final AbstractC41768a g(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.k String str) {
        return new C41826q(new C34429s0(this, str, bool, bool2, 0));
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Set<InterfaceC32897n0>> h() {
        return io.reactivex.rxjava3.core.I.q(C42745f0.P0(this.f294214b.values()));
    }

    @Override // com.avito.android.InterfaceC34162r0
    public final void i() {
        this.f294214b.clear();
    }

    @Override // com.avito.android.InterfaceC34162r0
    public final void j(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.k String str) {
        LinkedHashMap linkedHashMap = this.f294214b;
        a aVar = (a) linkedHashMap.get(str);
        if (aVar == null) {
            aVar = new a(str, false, null, 6, null);
        }
        boolean zBooleanValue = bool != null ? bool.booleanValue() : aVar.f294218c;
        if (bool2 == null) {
            bool2 = aVar.f294219d;
        }
        a aVar2 = new a(aVar.f294217b, zBooleanValue, bool2);
        if (aVar.equals(aVar2)) {
            return;
        }
        linkedHashMap.put(str, aVar2);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f294215c.accept(g02);
        this.f294216d.K5(g02);
        this.f294213a.c(false);
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    @InterfaceC42830m
    public final io.reactivex.rxjava3.core.z<kotlin.G0> k() {
        return this.f294215c;
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    public final Map<String, InterfaceC32897n0> m() {
        return this.f294214b;
    }

    /* compiled from: FavoriteSellersRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/t0$a;", "Lcom/avito/android/n0;", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.t0$a */
    public static final /* data */ class a implements InterfaceC32897n0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f294217b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f294218c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Boolean f294219d;

        public a(@Y61.k String str, boolean z12, @Y61.l Boolean bool) {
            this.f294217b = str;
            this.f294218c = z12;
            this.f294219d = bool;
        }

        @Override // com.avito.android.InterfaceC32897n0
        @Y61.k
        /* renamed from: L, reason: from getter */
        public final String getF294217b() {
            return this.f294217b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f294217b, aVar.f294217b) && this.f294218c == aVar.f294218c && kotlin.jvm.internal.L.f(this.f294219d, aVar.f294219d);
        }

        @Override // com.avito.android.InterfaceC32897n0
        /* renamed from: f, reason: from getter */
        public final boolean getF294218c() {
            return this.f294218c;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(this.f294217b.hashCode() * 31, 31, this.f294218c);
            Boolean bool = this.f294219d;
            return i12 + (bool == null ? 0 : bool.hashCode());
        }

        @Override // com.avito.android.InterfaceC32897n0
        @Y61.l
        /* renamed from: isNotificationsActivated, reason: from getter */
        public final Boolean getF294219d() {
            return this.f294219d;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Seller(userKey=");
            sb2.append(this.f294217b);
            sb2.append(", isSubscribed=");
            sb2.append(this.f294218c);
            sb2.append(", isNotificationsActivated=");
            return com.akita.compose.theme.re23.style.C0.g(sb2, this.f294219d, ')');
        }

        public /* synthetic */ a(String str, boolean z12, Boolean bool, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? null : bool);
        }
    }
}
