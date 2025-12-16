package com.avito.android.pagination.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import r50.AbstractC47493a;

/* compiled from: RequestNewPortionHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.pagination.mvi.RequestNewPortionHandler", f = "RequestNewPortionHandler.kt", i = {0, 0}, l = {82}, m = "request", n = {"this", "direction"}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public s f210583q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC47493a f210584r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f210585s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f210586t;

    /* renamed from: u, reason: collision with root package name */
    public int f210587u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f210586t = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f210585s = obj;
        this.f210587u |= BeduinInputModel.MIN_TEXT_VERSION;
        s.a(this.f210586t, null, this);
        throw null;
    }
}
