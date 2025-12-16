package com.akita.compose.component.pull_to_refresh.internal;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PullToRefreshElement.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.akita.compose.component.pull_to_refresh.internal.PullToRefreshModifierNode", f = "PullToRefreshElement.kt", i = {0}, l = {JfifUtil.MARKER_RST7}, m = "show", n = {"this"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f62468q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f62469r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f62470s;

    /* renamed from: t, reason: collision with root package name */
    public int f62471t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f62470s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f62469r = obj;
        this.f62471t |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.n2(this.f62470s, this);
    }
}
