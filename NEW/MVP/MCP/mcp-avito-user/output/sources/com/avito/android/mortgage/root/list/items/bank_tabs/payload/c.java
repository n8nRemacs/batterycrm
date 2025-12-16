package com.avito.android.mortgage.root.list.items.bank_tabs.payload;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.items.bank_tabs.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBanksTabPayload.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/payload/c;", "", "a", "b", "Lcom/avito/android/mortgage/root/list/items/bank_tabs/payload/c$a;", "Lcom/avito/android/mortgage/root/list/items/bank_tabs/payload/c$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: MortgageRootBanksTabPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/payload/c$a;", "Lcom/avito/android/mortgage/root/list/items/bank_tabs/payload/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f202430a;

        public a(int i12) {
            this.f202430a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f202430a == ((a) obj).f202430a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f202430a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectedTabUpdated(selectedTabIdx="), this.f202430a, ')');
        }
    }

    /* compiled from: MortgageRootBanksTabPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/payload/c$b;", "Lcom/avito/android/mortgage/root/list/items/bank_tabs/payload/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<c.a> f202431a;

        public b(@k List<c.a> list) {
            this.f202431a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f202431a, ((b) obj).f202431a);
        }

        public final int hashCode() {
            return this.f202431a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("TabsUpdated(tabs="), this.f202431a, ')');
        }
    }
}
