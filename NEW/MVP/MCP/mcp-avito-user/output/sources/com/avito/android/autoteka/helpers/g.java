package com.avito.android.autoteka.helpers;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DelayPolling.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.autoteka.helpers.DelayPollingKt", f = "DelayPolling.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {11, 18}, m = "delayPolling", n = {"requestWithStatus", "isStop", "attempts", "requestWithStatus", "itemResult", "isStop", "attempts"}, s = {"L$0", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes11.dex */
final class g<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public p f96657q;

    /* renamed from: r, reason: collision with root package name */
    public TypedResult f96658r;

    /* renamed from: s, reason: collision with root package name */
    public int f96659s;

    /* renamed from: t, reason: collision with root package name */
    public long f96660t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f96661u;

    /* renamed from: v, reason: collision with root package name */
    public int f96662v;

    public g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f96661u = obj;
        this.f96662v |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.a(null, this);
    }
}
