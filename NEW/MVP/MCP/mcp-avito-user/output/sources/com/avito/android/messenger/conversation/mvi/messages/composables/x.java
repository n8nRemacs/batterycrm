package com.avito.android.messenger.conversation.mvi.messages.composables;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ScrollEventsHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.ScrollEventsHandlerKt", f = "ScrollEventsHandler.kt", i = {}, l = {80}, m = "tryToPositionVisibleItemOnViewport", n = {}, s = {})
/* loaded from: classes15.dex */
final class x extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f192881q;

    /* renamed from: r, reason: collision with root package name */
    public int f192882r;

    public x() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f192881q = obj;
        this.f192882r |= BeduinInputModel.MIN_TEXT_VERSION;
        return u.d(null, 0, this);
    }
}
