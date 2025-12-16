package com.akita.compose.component.toast_bar;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ToastBarHostState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.akita.compose.component.toast_bar.ToastBarHostState", f = "ToastBarHostState.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {117, 120}, m = "showToastBar", n = {"this", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "message", "payload", "positiveActionLabel", "negativeActionLabel", "duration", "position", "$this$withLock_u24default$iv", "this", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "message", "payload", "positiveActionLabel", "negativeActionLabel", "duration", "position", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
/* loaded from: classes10.dex */
final class v extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f63293A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ u f63294B;

    /* renamed from: C, reason: collision with root package name */
    public int f63295C;

    /* renamed from: q, reason: collision with root package name */
    public u f63296q;

    /* renamed from: r, reason: collision with root package name */
    public J f63297r;

    /* renamed from: s, reason: collision with root package name */
    public String f63298s;

    /* renamed from: t, reason: collision with root package name */
    public Object f63299t;

    /* renamed from: u, reason: collision with root package name */
    public String f63300u;

    /* renamed from: v, reason: collision with root package name */
    public String f63301v;

    /* renamed from: w, reason: collision with root package name */
    public ToastBarDuration f63302w;

    /* renamed from: x, reason: collision with root package name */
    public ToastBarPosition f63303x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f63304y;

    /* renamed from: z, reason: collision with root package name */
    public Object f63305z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, Continuation<? super v> continuation) {
        super(continuation);
        this.f63294B = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f63293A = obj;
        this.f63295C |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f63294B.a(null, null, null, null, null, null, false, this);
    }
}
