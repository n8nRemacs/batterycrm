package com.avito.android.passport.remove_draft;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PassportRemoveDraftProfileInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.remove_draft.PassportRemoveDraftProfileInteractorImpl", f = "PassportRemoveDraftProfileInteractor.kt", i = {0}, l = {20, 22}, m = "removeDraftProfile", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f213906q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f213907r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f213908s;

    /* renamed from: t, reason: collision with root package name */
    public int f213909t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f213908s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f213907r = obj;
        this.f213909t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f213908s.a(0, this);
    }
}
