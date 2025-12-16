package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TfaEnableCodeCheckPhoneRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.safety.tfa_enable_confirm.code_check.interactor.TfaEnableCodeCheckPhoneRequestInteractorImpl", f = "TfaEnableCodeCheckPhoneRequestInteractor.kt", i = {0}, l = {33}, m = "requestCode-qkHeqaA", n = {"$this$requestCode_u2dqkHeqaA"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f258182q;

    /* renamed from: r, reason: collision with root package name */
    public m f258183r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f258184s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f258185t;

    /* renamed from: u, reason: collision with root package name */
    public int f258186u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f258185t = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f258184s = obj;
        this.f258186u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f258185t.d(null, this);
    }
}
