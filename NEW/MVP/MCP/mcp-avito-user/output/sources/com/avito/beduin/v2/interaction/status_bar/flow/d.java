package com.avito.beduin.v2.interaction.status_bar.flow;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.Window;
import androidx.core.view.P;
import androidx.view.n;
import dU0.f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SetStatusBarContentAppearanceInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.status_bar.flow.SetStatusBarContentAppearanceInteractionHandler$handle$1", f = "SetStatusBarContentAppearanceInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f337861q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f337862r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f337861q = eVar;
        this.f337862r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f337861q, this.f337862r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        n nVarRequireActivity;
        Window window;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        OV0.a aVar = this.f337861q.f337863c;
        StatusBarContentAppearance statusBarContentAppearance = this.f337862r.f337859a;
        FV0.a aVar2 = aVar.f12295b;
        if (aVar2 != null) {
            if (aVar2 instanceof FV0.b) {
                nVarRequireActivity = ((FV0.b) aVar2).N3();
            } else {
                if (!(aVar2 instanceof FV0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVarRequireActivity = ((FV0.c) aVar2).j1().requireActivity();
            }
            if (nVarRequireActivity != null && (window = nVarRequireActivity.getWindow()) != null) {
                int iOrdinal = statusBarContentAppearance.ordinal();
                boolean z12 = false;
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z12 = true;
                    }
                    View decorView = window.getDecorView();
                    P.b(decorView, new OV0.b(decorView, window, z12));
                } else {
                    if ((nVarRequireActivity.getResources().getConfiguration().uiMode & 48) == 32) {
                        z12 = true;
                    }
                    View decorView2 = window.getDecorView();
                    P.b(decorView2, new OV0.b(decorView2, window, z12));
                }
            }
        }
        return G0.f406611a;
    }
}
