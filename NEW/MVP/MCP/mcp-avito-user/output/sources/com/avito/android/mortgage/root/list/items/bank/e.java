package com.avito.android.mortgage.root.list.items.bank;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BankItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/e;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f202352c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f202353a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f202354b;

    /* compiled from: BankItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/e$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k String str, @Y61.k String str2) {
        this.f202353a = str;
        this.f202354b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f202353a, eVar.f202353a) && L.f(this.f202354b, eVar.f202354b);
    }

    public final int hashCode() {
        return this.f202354b.hashCode() + (this.f202353a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankItemCreditInfoField(title=");
        sb2.append(this.f202353a);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f202354b, ')');
    }
}
