package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.foundation.lazy.w0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ScrollEventsHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.ScrollEventsHandlerKt", f = "ScrollEventsHandler.kt", i = {0, 0}, l = {52, 54}, m = "scrollItemToTop", n = {"$this$scrollItemToTop", "index"}, s = {"L$0", "I$0"})
/* loaded from: classes15.dex */
final class w extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public w0 f192877q;

    /* renamed from: r, reason: collision with root package name */
    public int f192878r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f192879s;

    /* renamed from: t, reason: collision with root package name */
    public int f192880t;

    public w() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f192879s = obj;
        this.f192880t |= BeduinInputModel.MIN_TEXT_VERSION;
        return u.c(null, 0, this);
    }
}
