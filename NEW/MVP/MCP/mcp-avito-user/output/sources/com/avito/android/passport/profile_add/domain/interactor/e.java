package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PassportAddProfileInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.profile_add.domain.interactor.PassportAddProfileInteractor", f = "PassportAddProfileInteractor.kt", i = {0, 1, 1}, l = {44, 52}, m = "createProfile", n = {"this", "this", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f212317q;

    /* renamed from: r, reason: collision with root package name */
    public TypedResult.Success f212318r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f212319s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f212320t;

    /* renamed from: u, reason: collision with root package name */
    public int f212321u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f212320t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f212319s = obj;
        this.f212321u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f212320t.a(0, null, null, null, this);
    }
}
