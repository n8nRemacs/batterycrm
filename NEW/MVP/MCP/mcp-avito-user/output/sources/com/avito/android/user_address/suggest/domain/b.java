package com.avito.android.user_address.suggest.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAddressSuggestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_address.suggest.domain.UserAddressSuggestInteractorImpl", f = "UserAddressSuggestInteractor.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "getAddressSuggestion", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f308052q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f308053r;

    /* renamed from: s, reason: collision with root package name */
    public int f308054s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f308053r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f308052q = obj;
        this.f308054s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f308053r.a(null, null, this);
    }
}
