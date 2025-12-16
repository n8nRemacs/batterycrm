package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor", f = "ChannelsListActor.kt", i = {0, 0, 0, 0, 0}, l = {842, 868}, m = "initialDataRequest", n = {"this", "$this$initialDataRequest", "userInfo", "isRetry", "curLoadingId"}, s = {"L$0", "L$1", "L$2", "Z$0", "J$0"})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31776c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C31772a f187990q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f187991r;

    /* renamed from: s, reason: collision with root package name */
    public MessengerUserHashInfo f187992s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f187993t;

    /* renamed from: u, reason: collision with root package name */
    public long f187994u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f187995v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C31772a f187996w;

    /* renamed from: x, reason: collision with root package name */
    public int f187997x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31776c(C31772a c31772a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f187996w = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f187995v = obj;
        this.f187997x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C31772a.d(this.f187996w, null, null, false, null, this);
    }
}
