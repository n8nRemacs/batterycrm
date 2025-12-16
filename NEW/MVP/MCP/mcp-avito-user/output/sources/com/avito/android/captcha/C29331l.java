package com.avito.android.captcha;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CaptchaInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.captcha.AvitoCaptchaInteractor", f = "CaptchaInteractor.kt", i = {}, l = {68, 78}, m = "verifyGeetestCaptcha", n = {}, s = {})
/* renamed from: com.avito.android.captcha.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29331l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f115103q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f115104r;

    /* renamed from: s, reason: collision with root package name */
    public int f115105s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29331l(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f115104r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f115103q = obj;
        this.f115105s |= BeduinInputModel.MIN_TEXT_VERSION;
        return n.d(this.f115104r, null, this);
    }
}
