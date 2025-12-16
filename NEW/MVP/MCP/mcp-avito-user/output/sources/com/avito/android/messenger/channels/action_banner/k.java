package com.avito.android.messenger.channels.action_banner;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelsListBannerInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.channels.action_banner.ChannelsListBannerInteractorImpl", f = "ChannelsListBannerInteractor.kt", i = {}, l = {75}, m = "refreshAutoRepliesBannerUrl", n = {}, s = {})
/* loaded from: classes15.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f186742q;

    /* renamed from: r, reason: collision with root package name */
    public n f186743r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f186744s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f186745t;

    /* renamed from: u, reason: collision with root package name */
    public int f186746u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f186745t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f186744s = obj;
        this.f186746u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f186745t.f(this);
    }
}
