package com.avito.android.universal_transaction.di;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.universal_transaction.transaction.TransactionFragment;
import h31.d;
import kotlin.Metadata;
import xG0.C49833b;

/* compiled from: TransactionComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_transaction/di/b;", "", "a", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TransactionComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/di/b$a;", "", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k @C49833b.d String str, @C49833b.c @h31.b @k String str2, @h31.b @C49833b.e @k String str3, @h31.b @C49833b.InterfaceC12856b @l String str4, @h31.b @l @C49833b.a String str5, @h31.b @k C28478k c28478k, @k c cVar, @k C31138n0 c31138n0);
    }

    void a(@k TransactionFragment transactionFragment);
}
