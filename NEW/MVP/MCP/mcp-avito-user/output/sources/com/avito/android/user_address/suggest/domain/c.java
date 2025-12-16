package com.avito.android.user_address.suggest.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAddressSuggestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_address.suggest.domain.UserAddressSuggestInteractorImpl", f = "UserAddressSuggestInteractor.kt", i = {}, l = {33}, m = "getCoordsByAddress", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f308055q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f308056r;

    /* renamed from: s, reason: collision with root package name */
    public int f308057s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f308056r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f308055q = obj;
        this.f308057s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f308056r.b(null, this);
    }
}
