package com.avito.avcalls.android.network_test;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NetworkTestSocket.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.network_test.NetworkTestSocket", f = "NetworkTestSocket.kt", i = {0}, l = {68}, m = "send", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public x f331846q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331847r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f331848s;

    /* renamed from: t, reason: collision with root package name */
    public int f331849t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331848s = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331847r = obj;
        this.f331849t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331848s.b(0, this);
    }
}
