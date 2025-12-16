package com.avito.android.code_confirmation.code_confirmation;

import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class H extends kotlin.jvm.internal.H implements Y41.l<Map<String, ? extends String>, G0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Map<String, ? extends String> map) {
        f0 f0Var;
        Map<String, ? extends String> map2 = map;
        T t12 = (T) this.receiver;
        t12.f119462w = map2;
        String str = (String) C42745f0.F(map2.values());
        if (str != null && (f0Var = t12.f119452m) != null) {
            f0Var.e(str);
        }
        return G0.f406611a;
    }
}
