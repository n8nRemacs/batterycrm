package com.avito.android.comfortable_deal.factory;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.comfortable_deal.deal.DealFragment;
import com.avito.android.comfortable_deal.deal.model.DealArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import zN0.InterfaceC50490a;

/* compiled from: ComfortableDealCategoryFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/factory/a;", "LzN0/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC50490a
@C11.a
/* loaded from: classes12.dex */
public final class a implements zN0.b {
    @Inject
    public a() {
    }

    @Override // zN0.b
    public final Fragment a(String str) {
        DealFragment.a aVar = DealFragment.f120940y0;
        DealArguments.DealProcessIdArguments dealProcessIdArguments = new DealArguments.DealProcessIdArguments(str);
        aVar.getClass();
        return DealFragment.a.a(dealProcessIdArguments);
    }
}
