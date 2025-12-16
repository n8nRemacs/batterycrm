package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.profile_add.domain.interactor.VerificationInteractor", f = "VerificationInteractor.kt", i = {0, 1, 1}, l = {49, 72}, m = "createProfile", n = {"this", "this", "queryParams"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public q f212351q;

    /* renamed from: r, reason: collision with root package name */
    public Map f212352r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f212353s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f212354t;

    /* renamed from: u, reason: collision with root package name */
    public int f212355u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f212354t = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f212353s = obj;
        this.f212355u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f212354t.a(0, null, null, null, this);
    }
}
