package com.akita.compose.component.pull_to_refresh.internal;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PullToRefreshElement.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.akita.compose.component.pull_to_refresh.internal.PullToRefreshModifierNode", f = "PullToRefreshElement.kt", i = {0, 0}, l = {191}, m = "onRelease", n = {"this", "consumed"}, s = {"L$0", "F$0"})
/* loaded from: classes10.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f62463q;

    /* renamed from: r, reason: collision with root package name */
    public float f62464r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f62465s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f62466t;

    /* renamed from: u, reason: collision with root package name */
    public int f62467u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62466t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f62465s = obj;
        this.f62467u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f62466t.r2(0.0f, this);
    }
}
