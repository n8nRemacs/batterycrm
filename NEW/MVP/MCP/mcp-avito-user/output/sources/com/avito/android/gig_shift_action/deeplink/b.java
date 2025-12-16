package com.avito.android.gig_shift_action.deeplink;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.gig_shift_action.GigShiftActionDeeplink;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GigShiftActionDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.gig_shift_action.deeplink.GigShiftActionDeeplinkHandler", f = "GigShiftActionDeeplinkHandler.kt", i = {0, 0, 0}, l = {88}, m = "openActionDialogInsideAnotherScreen", n = {"this", Constants.DEEPLINK, "actionDialogDeeplink"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes13.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f160399q;

    /* renamed from: r, reason: collision with root package name */
    public GigShiftActionDeeplink f160400r;

    /* renamed from: s, reason: collision with root package name */
    public GigShiftActionDeeplink f160401s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f160402t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f160403u;

    /* renamed from: v, reason: collision with root package name */
    public int f160404v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f160403u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f160402t = obj;
        this.f160404v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f160403u.o(null, this);
    }
}
