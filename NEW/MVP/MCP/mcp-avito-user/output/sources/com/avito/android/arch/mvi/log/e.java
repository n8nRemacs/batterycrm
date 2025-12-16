package com.avito.android.arch.mvi.log;

import Y61.k;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: FeatureLogger.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_mvi-flow_util-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {
    @k
    public static final X a(@k InterfaceC43160i interfaceC43160i, @k String str, @k a aVar) {
        return new X(new C43197r1(new c(aVar, str, null), new C43137a0(new b(aVar, str, null), interfaceC43160i)), new d(aVar, str, null));
    }
}
