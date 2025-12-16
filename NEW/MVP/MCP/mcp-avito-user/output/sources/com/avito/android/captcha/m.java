package com.avito.android.captcha;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CaptchaInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.captcha.AvitoCaptchaInteractor", f = "CaptchaInteractor.kt", i = {}, l = {52, 62}, m = "verifyHCaptcha", n = {}, s = {})
/* loaded from: classes12.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f115106q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f115107r;

    /* renamed from: s, reason: collision with root package name */
    public int f115108s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f115107r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f115106q = obj;
        this.f115108s |= BeduinInputModel.MIN_TEXT_VERSION;
        return n.e(this.f115107r, null, this);
    }
}
