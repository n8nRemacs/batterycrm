package com.avito.android.extended_profile_adverts;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ProfileAdvertsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile_adverts.ProfileAdvertsInteractorImpl", f = "ProfileAdvertsInteractor.kt", i = {}, l = {138}, m = "getSearchElements", n = {}, s = {})
/* loaded from: classes13.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f150839q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f150840r;

    /* renamed from: s, reason: collision with root package name */
    public int f150841s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f150840r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f150839q = obj;
        this.f150841s |= BeduinInputModel.MIN_TEXT_VERSION;
        return f.b(this.f150840r, null, 0, null, null, this);
    }
}
