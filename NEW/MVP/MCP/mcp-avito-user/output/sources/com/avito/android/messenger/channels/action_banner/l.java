package com.avito.android.messenger.channels.action_banner;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelsListBannerInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.channels.action_banner.ChannelsListBannerInteractorImpl", f = "ChannelsListBannerInteractor.kt", i = {0, 0}, l = {64, 69}, m = "refreshBannerState", n = {"this", "currentBanner"}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f186747q;

    /* renamed from: r, reason: collision with root package name */
    public d f186748r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f186749s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f186750t;

    /* renamed from: u, reason: collision with root package name */
    public int f186751u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f186750t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f186749s = obj;
        this.f186751u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f186750t.c(null, this);
    }
}
