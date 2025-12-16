package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor", f = "FiltersDelegateActor.kt", i = {0, 0, 1, 1}, l = {103, 104}, m = "applyResetChange", n = {"this", "$this$applyResetChange_u24lambda_u242", "this", "$this$applyResetChange_u24lambda_u242"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35711d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C35708a f316114q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC47308d.a f316115r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f316116s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35708a f316117t;

    /* renamed from: u, reason: collision with root package name */
    public int f316118u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35711d(C35708a c35708a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f316117t = c35708a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f316116s = obj;
        this.f316118u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C35708a.e(this.f316117t, null, this);
    }
}
