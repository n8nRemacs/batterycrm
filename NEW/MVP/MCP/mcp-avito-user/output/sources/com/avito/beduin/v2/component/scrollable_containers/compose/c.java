package com.avito.beduin.v2.component.scrollable_containers.compose;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HandleScrollToPositionInteraction.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.beduin.v2.component.scrollable_containers.compose.HandleScrollToPositionInteractionKt", f = "HandleScrollToPositionInteraction.kt", i = {0, 0, 0, 0}, l = {114, 129, 131}, m = "scrollToEnd", n = {"$this$scrollToEnd", "animate", "isVertical", "position"}, s = {"L$0", "Z$0", "Z$1", "I$0"})
/* loaded from: classes5.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f336262q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f336263r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f336264s;

    /* renamed from: t, reason: collision with root package name */
    public int f336265t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f336266u;

    /* renamed from: v, reason: collision with root package name */
    public int f336267v;

    public c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f336266u = obj;
        this.f336267v |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(null, false, false, 0, this);
    }
}
