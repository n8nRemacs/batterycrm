package com.avito.android.messenger.channels.mvi.list_feature;

import HY.m;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor", f = "ChannelsListActor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {937, 953}, m = "syncLatestChats", n = {"this", "$this$syncLatestChats", "userInfo", "initiator", "origin", "this", "$this$syncLatestChats", "userInfo", "initiator", "origin"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes15.dex */
final class U extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C31772a f187846q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f187847r;

    /* renamed from: s, reason: collision with root package name */
    public MessengerUserHashInfo f187848s;

    /* renamed from: t, reason: collision with root package name */
    public Object f187849t;

    /* renamed from: u, reason: collision with root package name */
    public m.d f187850u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f187851v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C31772a f187852w;

    /* renamed from: x, reason: collision with root package name */
    public int f187853x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C31772a c31772a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f187852w = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f187851v = obj;
        this.f187853x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f187852w.j(null, null, null, this);
    }
}
