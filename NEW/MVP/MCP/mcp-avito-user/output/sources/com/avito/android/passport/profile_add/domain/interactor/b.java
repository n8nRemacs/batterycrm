package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendProfileInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.profile_add.domain.interactor.ExtendProfileInteractor", f = "ExtendProfileInteractor.kt", i = {0}, l = {37}, m = "createProfile", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f212302q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f212303r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f212304s;

    /* renamed from: t, reason: collision with root package name */
    public int f212305t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f212304s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f212303r = obj;
        this.f212305t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f212304s.a(0, null, null, null, this);
    }
}
