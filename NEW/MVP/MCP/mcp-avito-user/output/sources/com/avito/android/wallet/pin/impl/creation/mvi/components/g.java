package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import hP0.C40863a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletPinCreationActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationActor", f = "WalletPinCreationActor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5}, l = {146, 147, 153, 154, 155, 156, 160, 163}, m = "savePin", n = {"this", "$this$savePin", "enteredPin", "savePinUrl", "errors", "events", "shownErrorsCount", "this", "$this$savePin", "enteredPin", "errors", "events", "shownErrorsCount", "this", "$this$savePin", "enteredPin", "events", "response", "this", "$this$savePin", "response", "this", "$this$savePin", "response", "this", "$this$savePin", "response"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f328553q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f328554r;

    /* renamed from: s, reason: collision with root package name */
    public Object f328555s;

    /* renamed from: t, reason: collision with root package name */
    public Object f328556t;

    /* renamed from: u, reason: collision with root package name */
    public Object f328557u;

    /* renamed from: v, reason: collision with root package name */
    public C40863a f328558v;

    /* renamed from: w, reason: collision with root package name */
    public int f328559w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f328560x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a f328561y;

    /* renamed from: z, reason: collision with root package name */
    public int f328562z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328561y = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f328560x = obj;
        this.f328562z |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(this.f328561y, null, null, null, null, 0, null, this);
    }
}
