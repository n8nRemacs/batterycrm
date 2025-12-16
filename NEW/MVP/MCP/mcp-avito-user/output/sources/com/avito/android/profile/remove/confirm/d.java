package com.avito.android.profile.remove.confirm;

import Y41.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile.remove.confirm.h;
import com.avito.android.profile.remove.o;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfileRemoveConfirmDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.remove.confirm.ProfileRemoveConfirmDialog$setupFooterView$2$1", f = "ProfileRemoveConfirmDialog.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223817q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f223818r;

    /* compiled from: ProfileRemoveConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/remove/confirm/h$b;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/profile/remove/confirm/h$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f223819b;

        public a(c cVar) {
            this.f223819b = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            h.b bVar = (h.b) obj;
            boolean z12 = bVar instanceof h.b.d;
            c cVar = this.f223819b;
            if (z12) {
                Button button = cVar.f223816M;
                if (button == null) {
                    button = null;
                }
                button.setLoading(true);
                Button button2 = cVar.f223816M;
                (button2 != null ? button2 : null).setClickable(false);
                cVar.setCanceledOnTouchOutside(false);
            } else if (bVar instanceof h.b.e) {
                o oVar = cVar.f223814K;
                (oVar != null ? oVar : null).G();
            } else if (bVar instanceof h.b.c) {
                o oVar2 = cVar.f223814K;
                (oVar2 != null ? oVar2 : null).n1();
            } else if (bVar instanceof h.b.C6776b) {
                o oVar3 = cVar.f223814K;
                (oVar3 != null ? oVar3 : null).N0(((h.b.C6776b) bVar).f223845a.getMessage());
            } else if (bVar instanceof h.b.a) {
                o oVar4 = cVar.f223814K;
                (oVar4 != null ? oVar4 : null).N0(((h.b.a) bVar).f223844a);
            }
            if (!z12) {
                cVar.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f223818r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f223818r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f223817q;
        if (i12 == 0) {
            C42729a0.b(obj);
            c cVar = this.f223818r;
            h hVar = cVar.f223810G;
            if (hVar == null) {
                hVar = null;
            }
            InterfaceC43160i<h.b> interfaceC43160iA = hVar.a(null);
            a aVar = new a(cVar);
            this.f223817q = 1;
            if (interfaceC43160iA.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
