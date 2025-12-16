package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelsListActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor", f = "ChannelsListActor.kt", i = {}, l = {1085}, m = "switchBannerToNext", n = {}, s = {})
/* loaded from: classes15.dex */
final class T extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f187837q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187838r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C31772a f187839s;

    /* renamed from: t, reason: collision with root package name */
    public int f187840t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C31772a c31772a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f187839s = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f187838r = obj;
        this.f187840t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C31772a.f(this.f187839s, null, this);
    }
}
