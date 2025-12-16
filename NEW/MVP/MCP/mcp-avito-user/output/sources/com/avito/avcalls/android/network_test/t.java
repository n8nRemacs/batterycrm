package com.avito.avcalls.android.network_test;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NetworkTestSocket.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.network_test.NetworkTestSocket", f = "NetworkTestSocket.kt", i = {0}, l = {84}, m = "receive", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public x f331842q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331843r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f331844s;

    /* renamed from: t, reason: collision with root package name */
    public int f331845t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331844s = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331843r = obj;
        this.f331845t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331844s.a(this);
    }
}
