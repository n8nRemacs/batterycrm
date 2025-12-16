package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TfaEnableCodeCheckPreRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.safety.tfa_enable_confirm.code_check.interactor.TfaEnableCodeCheckPreRequestInteractorImpl", f = "TfaEnableCodeCheckPreRequestInteractor.kt", i = {0, 0}, l = {62}, m = "requestCode-qkHeqaA", n = {"this", "$this$requestCode_u2dqkHeqaA"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class w extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public y f258195q;

    /* renamed from: r, reason: collision with root package name */
    public String f258196r;

    /* renamed from: s, reason: collision with root package name */
    public y f258197s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f258198t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f258199u;

    /* renamed from: v, reason: collision with root package name */
    public int f258200v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f258199u = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f258198t = obj;
        this.f258200v |= BeduinInputModel.MIN_TEXT_VERSION;
        return y.c(this.f258199u, null, this);
    }
}
