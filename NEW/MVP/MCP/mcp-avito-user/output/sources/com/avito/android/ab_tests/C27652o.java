package com.avito.android.ab_tests;

import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import u3.C48777a;

/* compiled from: AbTestsReloadTask.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final /* synthetic */ class C27652o extends C42801a implements Y41.p<Map<String, ? extends C48777a>, Continuation<? super G0>, Object>, SuspendFunction {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final Object invoke(Map<String, ? extends C48777a> map, Continuation<? super G0> continuation) {
        ((InterfaceC27648k) this.receiver).a(map);
        return G0.f406611a;
    }
}
