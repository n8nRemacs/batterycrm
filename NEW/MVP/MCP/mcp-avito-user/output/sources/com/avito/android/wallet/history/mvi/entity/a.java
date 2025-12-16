package com.avito.android.wallet.history.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletHistoryState.kt */
@H0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/a;", "", "a", "b", "c", "Lcom/avito/android/wallet/history/mvi/entity/a$a;", "Lcom/avito/android/wallet/history/mvi/entity/a$b;", "Lcom/avito/android/wallet/history/mvi/entity/a$c;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: WalletHistoryState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/a$a;", "Lcom/avito/android/wallet/history/mvi/entity/a;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.history.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10157a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<GO0.b> f327676a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f327677b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final r f327678c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f327679d;

        /* JADX WARN: Multi-variable type inference failed */
        public C10157a(@k List<? extends GO0.b> list, boolean z12, @l r rVar, boolean z13) {
            this.f327676a = list;
            this.f327677b = z12;
            this.f327678c = rVar;
            this.f327679d = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10157a)) {
                return false;
            }
            C10157a c10157a = (C10157a) obj;
            return L.f(this.f327676a, c10157a.f327676a) && this.f327677b == c10157a.f327677b && L.f(this.f327678c, c10157a.f327678c) && this.f327679d == c10157a.f327679d;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(this.f327676a.hashCode() * 31, 31, this.f327677b);
            r rVar = this.f327678c;
            return Boolean.hashCode(this.f327679d) + ((i12 + (rVar == null ? 0 : rVar.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(historyItems=");
            sb2.append(this.f327676a);
            sb2.append(", hasMore=");
            sb2.append(this.f327677b);
            sb2.append(", perfTrackerParams=");
            sb2.append(this.f327678c);
            sb2.append(", isRefreshing=");
            return androidx.appcompat.app.r.x(sb2, this.f327679d, ')');
        }
    }

    /* compiled from: WalletHistoryState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/a$b;", "Lcom/avito/android/wallet/history/mvi/entity/a;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f327680a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1353095516;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: WalletHistoryState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/a$c;", "Lcom/avito/android/wallet/history/mvi/entity/a;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f327681a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1429029160;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
