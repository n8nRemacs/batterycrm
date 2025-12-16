package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsTooltipsQueue.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsQueue", f = "UserAdvertsTooltipsQueue.kt", i = {0, 0, 0}, l = {142}, m = "needToShowQueuedTooltip", n = {"this", "queuedTooltip", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class I extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public P f315579q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC35693c f315580r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f315581s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f315582t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ P f315583u;

    /* renamed from: v, reason: collision with root package name */
    public int f315584v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(P p12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f315583u = p12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f315582t = obj;
        this.f315584v |= BeduinInputModel.MIN_TEXT_VERSION;
        return P.a(this.f315583u, null, this);
    }
}
