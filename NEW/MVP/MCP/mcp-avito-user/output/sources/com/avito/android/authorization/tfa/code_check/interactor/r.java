package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TfaCodeCheckPreRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.interactor.TfaCodeCheckPreRequestInteractorImpl", f = "TfaCodeCheckPreRequestInteractor.kt", i = {0, 0, 0}, l = {79}, m = "requestCode-MGlA5h8", n = {"this", "$this$requestCode_u2dMGlA5h8", "successNavigation"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes11.dex */
final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public t f94693q;

    /* renamed from: r, reason: collision with root package name */
    public String f94694r;

    /* renamed from: s, reason: collision with root package name */
    public com.avito.android.code_check_public.a f94695s;

    /* renamed from: t, reason: collision with root package name */
    public t f94696t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f94697u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t f94698v;

    /* renamed from: w, reason: collision with root package name */
    public int f94699w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f94698v = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f94697u = obj;
        this.f94699w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f94698v.c(null, null, this);
    }
}
