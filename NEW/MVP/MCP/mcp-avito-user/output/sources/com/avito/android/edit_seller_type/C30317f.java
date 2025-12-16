package com.avito.android.edit_seller_type;

import android.os.Bundle;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.fragment.app.FragmentManager;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.edit_seller_type.EditSellerTypeFragment;
import com.avito.android.edit_seller_type.mvi.entity.b;
import com.avito.android.edit_seller_type.mvi.entity.c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: EditSellerTypeFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_seller_type.EditSellerTypeFragment$HandleEvents$2", f = "EditSellerTypeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.edit_seller_type.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30317f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f146730q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ EditSellerTypeFragment f146731r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<c.a> f146732s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f146733t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f146734u;

    /* compiled from: EditSellerTypeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/b;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/edit_seller_type/mvi/entity/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_seller_type.EditSellerTypeFragment$HandleEvents$2$1", f = "EditSellerTypeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.edit_seller_type.f$a */
    public static final class a extends SuspendLambda implements Y41.p<com.avito.android.edit_seller_type.mvi.entity.b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f146735q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ EditSellerTypeFragment f146736r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T f146737s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<c.a> f146738t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f146739u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f146740v;

        /* compiled from: EditSellerTypeFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.edit_seller_type.EditSellerTypeFragment$HandleEvents$2$1$1", f = "EditSellerTypeFragment.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.edit_seller_type.f$a$a, reason: collision with other inner class name */
        public static final class C4270a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f146741q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.edit_seller_type.mvi.entity.b f146742r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f146743s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f146744t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4270a(com.avito.android.edit_seller_type.mvi.entity.b bVar, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super C4270a> continuation) {
                super(2, continuation);
                this.f146742r = bVar;
                this.f146743s = uVar;
                this.f146744t = j12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C4270a(this.f146742r, this.f146743s, this.f146744t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4270a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f146741q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ((b.f) this.f146742r).getClass();
                    this.f146741q = 1;
                    if (this.f146743s.a(this.f146744t, null, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EditSellerTypeFragment editSellerTypeFragment, T t12, InterfaceC22204y1<c.a> interfaceC22204y1, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f146736r = editSellerTypeFragment;
            this.f146737s = t12;
            this.f146738t = interfaceC22204y1;
            this.f146739u = uVar;
            this.f146740v = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f146736r, this.f146737s, this.f146738t, this.f146739u, this.f146740v, continuation);
            aVar.f146735q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.edit_seller_type.mvi.entity.b bVar, Continuation<? super G0> continuation) {
            return ((a) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.edit_seller_type.mvi.entity.b bVar = (com.avito.android.edit_seller_type.mvi.entity.b) this.f146735q;
            boolean zF2 = kotlin.jvm.internal.L.f(bVar, b.C4272b.f146800a);
            InterfaceC22204y1<c.a> interfaceC22204y1 = this.f146738t;
            if (zF2) {
                EditSellerTypeFragment.a aVar = EditSellerTypeFragment.f146675s0;
                interfaceC22204y1.setValue(null);
            } else {
                boolean zF3 = kotlin.jvm.internal.L.f(bVar, b.a.f146799a);
                EditSellerTypeFragment editSellerTypeFragment = this.f146736r;
                if (zF3) {
                    editSellerTypeFragment.getParentFragmentManager().Y();
                } else if (bVar instanceof b.d) {
                    c.a aVar2 = ((b.d) bVar).f146803a;
                    EditSellerTypeFragment.a aVar3 = EditSellerTypeFragment.f146675s0;
                    interfaceC22204y1.setValue(aVar2);
                } else if (bVar instanceof b.f) {
                    C43259k.d(this.f146737s, null, null, new C4270a(bVar, this.f146739u, this.f146740v, null), 3);
                } else if (bVar instanceof b.e) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar4 = editSellerTypeFragment.f146679q0;
                    if (aVar4 == null) {
                        aVar4 = null;
                    }
                    b.a.a(aVar4, ((b.e) bVar).f146804a, null, null, 6);
                } else if (bVar instanceof b.c) {
                    FragmentManager parentFragmentManager = editSellerTypeFragment.getParentFragmentManager();
                    Bundle bundle = new Bundle();
                    b.c cVar = (b.c) bVar;
                    c.f fVar = cVar.f146802b;
                    bundle.putParcelable("seller_type_result", new EditSellerTypeResult(fVar.f146823a, fVar.f146824b, cVar.f146801a));
                    parentFragmentManager.o0(bundle, "type_edit_success");
                    parentFragmentManager.Y();
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30317f(EditSellerTypeFragment editSellerTypeFragment, InterfaceC22204y1<c.a> interfaceC22204y1, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super C30317f> continuation) {
        super(2, continuation);
        this.f146731r = editSellerTypeFragment;
        this.f146732s = interfaceC22204y1;
        this.f146733t = uVar;
        this.f146734u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30317f c30317f = new C30317f(this.f146731r, this.f146732s, this.f146733t, this.f146734u, continuation);
        c30317f.f146730q = obj;
        return c30317f;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C30317f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f146730q;
        EditSellerTypeFragment.a aVar = EditSellerTypeFragment.f146675s0;
        EditSellerTypeFragment editSellerTypeFragment = this.f146731r;
        C43175k.K(new C43197r1(new a(editSellerTypeFragment, t12, this.f146732s, this.f146733t, this.f146734u, null), editSellerTypeFragment.r5().getEvents()), t12);
        return G0.f406611a;
    }
}
