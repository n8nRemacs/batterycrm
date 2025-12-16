package io.ktor.utils.io.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.service_subscription_legacy.SubscriptionStatus;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AwaitingSlot.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", i = {0}, l = {57}, m = "trySuspend", n = {SubscriptionStatus.SUSPENDED}, s = {"I$0"})
/* loaded from: classes8.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public int f401018q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401019r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f401020s;

    /* renamed from: t, reason: collision with root package name */
    public int f401021t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401020s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401019r = obj;
        this.f401021t |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f401022a;
        return this.f401020s.c(null, this);
    }
}
