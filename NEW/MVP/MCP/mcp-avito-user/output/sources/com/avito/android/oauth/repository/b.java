package com.avito.android.oauth.repository;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OAuthRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.oauth.repository.OAuthRepository", f = "OAuthRepository.kt", i = {}, l = {65}, m = "getAccountData", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f208459q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f208460r;

    /* renamed from: s, reason: collision with root package name */
    public int f208461s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f208460r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f208459q = obj;
        this.f208461s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f208460r.a(this);
    }
}
