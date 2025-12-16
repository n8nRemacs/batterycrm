package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor", f = "FiltersDelegateActor.kt", i = {0}, l = {228}, m = "extractFilterParams", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C35708a f316127q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f316128r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35708a f316129s;

    /* renamed from: t, reason: collision with root package name */
    public int f316130t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C35708a c35708a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f316129s = c35708a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f316128r = obj;
        this.f316130t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C35708a.f(this.f316129s, null, this);
    }
}
