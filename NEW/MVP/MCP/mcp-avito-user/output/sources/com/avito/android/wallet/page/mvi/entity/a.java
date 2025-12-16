package com.avito.android.wallet.page.mvi.entity;

import Y61.k;
import Y61.l;
import ZO0.f;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/a;", "", "a", "b", "c", "d", "Lcom/avito/android/wallet/page/mvi/entity/a$a;", "Lcom/avito/android/wallet/page/mvi/entity/a$b;", "Lcom/avito/android/wallet/page/mvi/entity/a$c;", "Lcom/avito/android/wallet/page/mvi/entity/a$d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f328198a;

    /* compiled from: WalletPageViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/a$a;", "Lcom/avito/android/wallet/page/mvi/entity/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.page.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10178a extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f328199b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ZO0.d f328200c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ZO0.c f328201d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ZO0.l f328202e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final f f328203f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f328204g;

        public C10178a(@k String str, @k ZO0.d dVar, @l ZO0.c cVar, @l ZO0.l lVar, @l f fVar, boolean z12) {
            super(z12, null);
            this.f328199b = str;
            this.f328200c = dVar;
            this.f328201d = cVar;
            this.f328202e = lVar;
            this.f328203f = fVar;
            this.f328204g = z12;
        }

        @Override // com.avito.android.wallet.page.mvi.entity.a
        /* renamed from: a, reason: from getter */
        public final boolean getF328198a() {
            return this.f328204g;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10178a)) {
                return false;
            }
            C10178a c10178a = (C10178a) obj;
            return L.f(this.f328199b, c10178a.f328199b) && L.f(this.f328200c, c10178a.f328200c) && L.f(this.f328201d, c10178a.f328201d) && L.f(this.f328202e, c10178a.f328202e) && L.f(this.f328203f, c10178a.f328203f) && this.f328204g == c10178a.f328204g;
        }

        public final int hashCode() {
            int iHashCode = (this.f328200c.hashCode() + (this.f328199b.hashCode() * 31)) * 31;
            ZO0.c cVar = this.f328201d;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            ZO0.l lVar = this.f328202e;
            int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            f fVar = this.f328203f;
            return Boolean.hashCode(this.f328204g) + ((iHashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f328199b);
            sb2.append(", money=");
            sb2.append(this.f328200c);
            sb2.append(", bonuses=");
            sb2.append(this.f328201d);
            sb2.append(", topUpAction=");
            sb2.append(this.f328202e);
            sb2.append(", promoBanner=");
            sb2.append(this.f328203f);
            sb2.append(", isRefreshing=");
            return r.x(sb2, this.f328204g, ')');
        }
    }

    /* compiled from: WalletPageViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/a$b;", "Lcom/avito/android/wallet/page/mvi/entity/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f328205b;

        public b(boolean z12) {
            super(z12, null);
            this.f328205b = z12;
        }

        @Override // com.avito.android.wallet.page.mvi.entity.a
        /* renamed from: a, reason: from getter */
        public final boolean getF328198a() {
            return this.f328205b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f328205b == ((b) obj).f328205b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f328205b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Error(isRefreshing="), this.f328205b, ')');
        }
    }

    /* compiled from: WalletPageViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/a$c;", "Lcom/avito/android/wallet/page/mvi/entity/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f328206b;

        public c(boolean z12) {
            super(z12, null);
            this.f328206b = z12;
        }

        @Override // com.avito.android.wallet.page.mvi.entity.a
        /* renamed from: a, reason: from getter */
        public final boolean getF328198a() {
            return this.f328206b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f328206b == ((c) obj).f328206b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f328206b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loading(isRefreshing="), this.f328206b, ')');
        }
    }

    /* compiled from: WalletPageViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/a$d;", "Lcom/avito/android/wallet/page/mvi/entity/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f328207b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f328208c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ZO0.a f328209d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ZO0.a f328210e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f328211f;

        public d(@k String str, @l String str2, @l ZO0.a aVar, @l ZO0.a aVar2, boolean z12) {
            super(z12, null);
            this.f328207b = str;
            this.f328208c = str2;
            this.f328209d = aVar;
            this.f328210e = aVar2;
            this.f328211f = z12;
        }

        @Override // com.avito.android.wallet.page.mvi.entity.a
        /* renamed from: a, reason: from getter */
        public final boolean getF328198a() {
            return this.f328211f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f328207b, dVar.f328207b) && L.f(this.f328208c, dVar.f328208c) && L.f(this.f328209d, dVar.f328209d) && L.f(this.f328210e, dVar.f328210e) && this.f328211f == dVar.f328211f;
        }

        public final int hashCode() {
            int iHashCode = this.f328207b.hashCode() * 31;
            String str = this.f328208c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ZO0.a aVar = this.f328209d;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            ZO0.a aVar2 = this.f328210e;
            return Boolean.hashCode(this.f328211f) + ((iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Unavailable(title=");
            sb2.append(this.f328207b);
            sb2.append(", message=");
            sb2.append(this.f328208c);
            sb2.append(", firstButton=");
            sb2.append(this.f328209d);
            sb2.append(", secondButton=");
            sb2.append(this.f328210e);
            sb2.append(", isRefreshing=");
            return r.x(sb2, this.f328211f, ')');
        }
    }

    public /* synthetic */ a(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, null);
    }

    /* renamed from: a, reason: from getter */
    public boolean getF328198a() {
        return this.f328198a;
    }

    public a(boolean z12, C42822w c42822w) {
        this.f328198a = z12;
    }
}
