package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor", f = "FiltersDelegateActor.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {118, 119, 120, 122, 123}, m = "applyInitialModels", n = {"this", "$this$applyInitialModels_u24lambda_u243", "this", "$this$applyInitialModels_u24lambda_u243", "this", "$this$applyInitialModels_u24lambda_u243", "this", "$this$applyInitialModels_u24lambda_u243"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35710c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C35708a f316109q;

    /* renamed from: r, reason: collision with root package name */
    public UserAdvertsFiltersBeduinModel f316110r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f316111s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35708a f316112t;

    /* renamed from: u, reason: collision with root package name */
    public int f316113u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35710c(C35708a c35708a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f316112t = c35708a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f316111s = obj;
        this.f316113u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C35708a.d(this.f316112t, null, this);
    }
}
