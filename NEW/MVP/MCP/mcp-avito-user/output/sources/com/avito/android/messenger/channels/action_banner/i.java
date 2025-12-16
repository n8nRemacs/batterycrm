package com.avito.android.messenger.channels.action_banner;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelsListBannerInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.channels.action_banner.ChannelsListBannerInteractorImpl", f = "ChannelsListBannerInteractor.kt", i = {0, 0}, l = {112}, m = "availableBannersByPriority", n = {"this", "$this$availableBannersByPriority_u24lambda_u243"}, s = {"L$0", "L$2"})
/* loaded from: classes15.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f186732q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f186733r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f186734s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f186735t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f186736u;

    /* renamed from: v, reason: collision with root package name */
    public int f186737v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f186736u = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f186735t = obj;
        this.f186737v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f186736u.d(this);
    }
}
