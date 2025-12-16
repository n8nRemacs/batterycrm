package com.avito.android.delayed_ux_feedback;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RemoteFeedbackHelper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.delayed_ux_feedback.RemoteFeedbackHelperImpl", f = "RemoteFeedbackHelper.kt", i = {0, 0}, l = {48}, m = "delayedRestoreRemoteFeedbackByEvent", n = {"this", "remoteFeedbackEvent"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f134739q;

    /* renamed from: r, reason: collision with root package name */
    public int f134740r;

    public e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f134739q = obj;
        this.f134740r |= BeduinInputModel.MIN_TEXT_VERSION;
        throw null;
    }
}
