package com.avito.android.captcha;

import com.avito.android.captcha.q;
import com.avito.android.captcha.z;
import com.avito.android.remote.captcha.model.CaptchaType;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N;

/* compiled from: CoroutineExceptionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.captcha.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29326g extends AbstractCoroutineContextElement implements N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29327h f115039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29326g(N.b bVar, C29327h c29327h) {
        super(bVar);
        this.f115039b = c29327h;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlinx.coroutines.N
    public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        ?? r52 = this.f115039b.f115049k;
        if (r52 != 0) {
            r52.invoke(new z.d(new q.b(androidx.camera.camera2.internal.G.i(th2, new StringBuilder("Coroutine failed: ")), CaptchaType.AVITO_CAPTCHA)));
        }
    }
}
