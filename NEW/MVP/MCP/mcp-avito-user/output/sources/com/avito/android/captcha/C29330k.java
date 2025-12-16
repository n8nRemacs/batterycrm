package com.avito.android.captcha;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CaptchaInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.captcha.AvitoCaptchaInteractor", f = "CaptchaInteractor.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 100}, m = "verifyAvitoCaptcha", n = {}, s = {})
/* renamed from: com.avito.android.captcha.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29330k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f115100q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f115101r;

    /* renamed from: s, reason: collision with root package name */
    public int f115102s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29330k(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f115101r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f115100q = obj;
        this.f115102s |= BeduinInputModel.MIN_TEXT_VERSION;
        return n.c(this.f115101r, null, this);
    }
}
