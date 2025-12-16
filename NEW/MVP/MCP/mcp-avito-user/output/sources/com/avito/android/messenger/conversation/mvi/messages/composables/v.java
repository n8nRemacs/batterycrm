package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.foundation.lazy.w0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ScrollEventsHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.ScrollEventsHandlerKt", f = "ScrollEventsHandler.kt", i = {0, 0, 1, 1, 3, 3}, l = {59, 63, 64, 72, 73}, m = "animateScrollToItemCenter", n = {"$this$animateScrollToItemCenter", "index", "$this$animateScrollToItemCenter", "index", "$this$animateScrollToItemCenter", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes15.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public w0 f192873q;

    /* renamed from: r, reason: collision with root package name */
    public int f192874r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f192875s;

    /* renamed from: t, reason: collision with root package name */
    public int f192876t;

    public v() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f192875s = obj;
        this.f192876t |= BeduinInputModel.MIN_TEXT_VERSION;
        return u.b(null, 0, this);
    }
}
