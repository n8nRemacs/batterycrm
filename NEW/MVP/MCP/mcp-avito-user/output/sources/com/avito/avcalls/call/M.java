package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IncomingCallSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.IncomingCallSession", f = "IncomingCallSession.kt", i = {0, 1, 2, 3, 4, 5}, l = {253, 257, 275, 285, 288, 299}, m = "negotiateAndSendAnswer", n = {"this", "this", "this", "$this$onError$iv", "this", "$this$onError$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class M extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f332597q;

    /* renamed from: r, reason: collision with root package name */
    public K f332598r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f332599s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K f332600t;

    /* renamed from: u, reason: collision with root package name */
    public int f332601u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(K k12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332600t = k12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332599s = obj;
        this.f332601u |= BeduinInputModel.MIN_TEXT_VERSION;
        return K.k(this.f332600t, this);
    }
}
