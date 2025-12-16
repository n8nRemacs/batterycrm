package com.avito.android.wallet.page.history.mvi.component;

import VO0.b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentHistoryItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/component/o;", "", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.page.feature.a f328049a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f328050b;

    /* compiled from: PaymentHistoryItemsConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/component/o$a;", "", "<init>", "()V", "", "HISTORY_ID_TOP_UP", "Ljava/lang/String;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public o(@Y61.k com.avito.android.wallet.page.feature.a aVar, @com.avito.android.wallet.page.history.di.c @Y61.k String str) {
        this.f328049a = aVar;
        this.f328050b = str;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((VO0.b) obj) instanceof b.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
