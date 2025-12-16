package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import hP0.C40863a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WalletPinCreationActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationActor", f = "WalletPinCreationActor.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {132, 133, 134}, m = "showPinsDoNotMatch", n = {"this", "$this$showPinsDoNotMatch", "events", "this", "$this$showPinsDoNotMatch", "events", "this", "events"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f328563q;

    /* renamed from: r, reason: collision with root package name */
    public Object f328564r;

    /* renamed from: s, reason: collision with root package name */
    public C40863a f328565s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f328566t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f328567u;

    /* renamed from: v, reason: collision with root package name */
    public int f328568v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328567u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f328566t = obj;
        this.f328568v |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.d(this.f328567u, null, null, this);
    }
}
