package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsTooltipsQueue.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsQueue", f = "UserAdvertsTooltipsQueue.kt", i = {0, 0, 0}, l = {142}, m = "storeTooltipWasShown", n = {"this", TooltipAttribute.ATTRIBUTE_TYPE, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class O extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public P f315610q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC35693c f315611r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f315612s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f315613t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ P f315614u;

    /* renamed from: v, reason: collision with root package name */
    public int f315615v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f315614u = p12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f315613t = obj;
        this.f315615v |= BeduinInputModel.MIN_TEXT_VERSION;
        return P.b(this.f315614u, null, this);
    }
}
