package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TfaCodeCheckPhoneRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.interactor.TfaCodeCheckPhoneRequestInteractorImpl", f = "TfaCodeCheckPhoneRequestInteractor.kt", i = {0}, l = {31}, m = "requestCode-qkHeqaA", n = {"$this$requestCode_u2dqkHeqaA"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f94677q;

    /* renamed from: r, reason: collision with root package name */
    public h f94678r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f94679s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f94680t;

    /* renamed from: u, reason: collision with root package name */
    public int f94681u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f94680t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f94679s = obj;
        this.f94681u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f94680t.d(null, this);
    }
}
