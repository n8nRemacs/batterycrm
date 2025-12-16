package com.avito.android.mortgage.domain.check_access;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CheckAccessUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/domain/check_access/b;", "", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: CheckAccessUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static Object a(b bVar, String str, String str2, String str3, p pVar, p pVar2, ContinuationImpl continuationImpl) {
            return bVar.a(str, str2, str3, new c(1, null), pVar, pVar2, continuationImpl);
        }
    }

    @l
    Object a(@k String str, @k String str2, @k String str3, @k Y41.l lVar, @k p pVar, @k p pVar2, @k ContinuationImpl continuationImpl);
}
