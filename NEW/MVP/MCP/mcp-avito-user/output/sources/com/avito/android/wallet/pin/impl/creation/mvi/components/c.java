package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WalletPinCreationActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationActor", f = "WalletPinCreationActor.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {273, 274, 279}, m = "handleBiometryResult", n = {"this", "$this$handleBiometryResult", "resultActions", "this", "$this$handleBiometryResult", "resultActions", "this", "resultActions"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f328530q;

    /* renamed from: r, reason: collision with root package name */
    public Object f328531r;

    /* renamed from: s, reason: collision with root package name */
    public AP0.c f328532s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f328533t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f328534u;

    /* renamed from: v, reason: collision with root package name */
    public int f328535v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328534u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f328533t = obj;
        this.f328535v |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = a.f328514h;
        return this.f328534u.g(null, null, false, this);
    }
}
