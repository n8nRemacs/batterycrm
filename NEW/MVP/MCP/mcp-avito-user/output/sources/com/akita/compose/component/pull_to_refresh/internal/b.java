package com.akita.compose.component.pull_to_refresh.internal;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PullToRefreshElement.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.akita.compose.component.pull_to_refresh.internal.PullToRefreshModifierNode", f = "PullToRefreshElement.kt", i = {0}, l = {226}, m = ConstraintKt.CONDITION_FLOW_HIDE, n = {"this"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f62444q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f62445r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f62446s;

    /* renamed from: t, reason: collision with root package name */
    public int f62447t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62446s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f62445r = obj;
        this.f62447t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f62446s.q2(this);
    }
}
