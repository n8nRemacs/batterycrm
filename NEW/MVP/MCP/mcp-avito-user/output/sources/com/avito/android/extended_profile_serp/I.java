package com.avito.android.extended_profile_serp;

import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.util.D6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSerpView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "enabled", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpView$initFloatingViews$2", f = "ExtendedProfileSerpView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class I extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152553q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f152554r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(F f12, Continuation<? super I> continuation) {
        super(2, continuation);
        this.f152554r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        I i12 = new I(this.f152554r, continuation);
        i12.f152553q = obj;
        return i12;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        return ((I) create(bool, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Boolean bool = (Boolean) this.f152553q;
        F f12 = this.f152554r;
        H h12 = f12.f152523H;
        if (h12 == null) {
            h12 = null;
        }
        h12.f152551b = bool.booleanValue();
        if (bool.booleanValue()) {
            ProfileSearchInputView profileSearchInputView = f12.f152547x;
            boolean z12 = profileSearchInputView.f153381A;
            boolean zY2 = D6.y(f12.f152543t.f283455J);
            if (!z12 && zY2) {
                profileSearchInputView.setFilterEnabled(false);
            } else if (z12 && !zY2) {
                profileSearchInputView.setFilterEnabled(true);
            }
        }
        return G0.f406611a;
    }
}
