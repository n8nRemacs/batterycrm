package com.avito.android.messenger.channels.action_banner;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelsListBannerInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.channels.action_banner.ChannelsListBannerInteractorImpl", f = "ChannelsListBannerInteractor.kt", i = {0}, l = {139}, m = "needToDisplayAutoRepliesBanner", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f186738q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f186739r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f186740s;

    /* renamed from: t, reason: collision with root package name */
    public int f186741t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f186740s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f186739r = obj;
        this.f186741t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f186740s.e(this);
    }
}
