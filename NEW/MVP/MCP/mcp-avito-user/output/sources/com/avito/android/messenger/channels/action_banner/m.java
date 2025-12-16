package com.avito.android.messenger.channels.action_banner;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelsListBannerInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.channels.action_banner.ChannelsListBannerInteractorImpl", f = "ChannelsListBannerInteractor.kt", i = {0, 0}, l = {49}, m = "switchBannerToNext", n = {"this", "currentBanner"}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f186752q;

    /* renamed from: r, reason: collision with root package name */
    public d f186753r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f186754s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f186755t;

    /* renamed from: u, reason: collision with root package name */
    public int f186756u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f186755t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f186754s = obj;
        this.f186756u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f186755t.a(null, this);
    }
}
