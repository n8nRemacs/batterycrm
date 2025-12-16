package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import hP0.C40863a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletPinCreationActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationActor", f = "WalletPinCreationActor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {173, 174, 175, 185, 187}, m = "onSavePinFailure", n = {"this", "$this$onSavePinFailure", "errors", "events", "shownErrorsCount", "this", "$this$onSavePinFailure", "errors", "events", "shownErrorsCount", "this", "$this$onSavePinFailure", "errors", "events", "shownErrorsCount"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* loaded from: classes5.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f328536q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f328537r;

    /* renamed from: s, reason: collision with root package name */
    public hP0.j f328538s;

    /* renamed from: t, reason: collision with root package name */
    public C40863a f328539t;

    /* renamed from: u, reason: collision with root package name */
    public int f328540u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f328541v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f328542w;

    /* renamed from: x, reason: collision with root package name */
    public int f328543x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328542w = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f328541v = obj;
        this.f328543x |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = a.f328514h;
        return this.f328542w.h(null, null, 0, null, this);
    }
}
