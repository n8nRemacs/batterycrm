package com.avito.android.comfortable_deal.deeplink;

import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PpRecallDeeplinkDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.PpRecallDeeplinkDeeplinkHandler", f = "PpRecallDeeplinkDeeplinkHandler.kt", i = {0, 0, 0}, l = {33}, m = "processWithoutSupportingNonAuthorizedUsers", n = {"this", Constants.DEEPLINK, "args"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes12.dex */
final class G extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public I f121859q;

    /* renamed from: r, reason: collision with root package name */
    public PpRecallDeeplink f121860r;

    /* renamed from: s, reason: collision with root package name */
    public Bundle f121861s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f121862t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I f121863u;

    /* renamed from: v, reason: collision with root package name */
    public int f121864v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f121863u = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f121862t = obj;
        this.f121864v |= BeduinInputModel.MIN_TEXT_VERSION;
        return I.k(this.f121863u, null, null, this);
    }
}
