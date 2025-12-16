package com.avito.avcalls.android.network_test;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.N0;

/* compiled from: NetworkTestController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.network_test.NetworkTestController", f = "NetworkTestController.kt", i = {0, 0, 1, 1, 1}, l = {44, 49}, m = "start", n = {"this", "receivingJob", "this", "receivingJob", "stopSendingTime"}, s = {"L$0", "L$1", "L$0", "L$1", "J$0"})
/* loaded from: classes5.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e f331803q;

    /* renamed from: r, reason: collision with root package name */
    public N0 f331804r;

    /* renamed from: s, reason: collision with root package name */
    public long f331805s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f331806t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f331807u;

    /* renamed from: v, reason: collision with root package name */
    public int f331808v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331807u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331806t = obj;
        this.f331808v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331807u.a(this);
    }
}
