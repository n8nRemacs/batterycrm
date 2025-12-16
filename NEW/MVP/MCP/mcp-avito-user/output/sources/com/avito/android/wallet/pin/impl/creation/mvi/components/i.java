package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import hP0.C40863a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WalletPinCreationActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationActor", f = "WalletPinCreationActor.kt", i = {0, 0, 0, 1, 1}, l = {123, 124}, m = "showSecondInput", n = {"this", "$this$showSecondInput", "events", "this", "events"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f328569q;

    /* renamed from: r, reason: collision with root package name */
    public Object f328570r;

    /* renamed from: s, reason: collision with root package name */
    public C40863a f328571s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f328572t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f328573u;

    /* renamed from: v, reason: collision with root package name */
    public int f328574v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328573u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f328572t = obj;
        this.f328574v |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.e(this.f328573u, null, null, this);
    }
}
