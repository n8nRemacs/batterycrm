package com.avito.android.profile.pro.impl.screen;

import B90.a;
import D90.c;
import Gq0.C13908a;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.profile.pro.impl.screen.ProfileProFragment;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.util.InterfaceC35845m2;
import eu0.InterfaceC40158a;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pg.InterfaceC47075a;
import po0.InterfaceC47119a;

/* compiled from: ProfileProFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectEvents$3", f = "ProfileProFragment.kt", i = {}, l = {650}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223618q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f223619r;

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LD90/c;", "proEvent", "Lkotlin/G0;", "emit", "(LD90/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProfileProFragment f223620b;

        public a(ProfileProFragment profileProFragment) {
            this.f223620b = profileProFragment;
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r15v33, types: [java.lang.Object, kotlin.C] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            D90.c cVar = (D90.c) obj;
            int i12 = ProfileProFragment.f222861X0;
            ProfileProFragment profileProFragment = this.f223620b;
            boolean z12 = cVar instanceof c.b;
            InterfaceC40158a bVar = z12 ? new InterfaceC40158a.b(((c.b) cVar).f3044a) : ((cVar instanceof c.d) || (cVar instanceof c.e)) ? InterfaceC40158a.d.f395430a : null;
            if (bVar != null) {
                profileProFragment.E5().accept(bVar);
            }
            Object obj2 = z12 ? ((c.b) cVar).f3047d != null ? InterfaceC47075a.d.f428719a : InterfaceC47075a.b.f428714a : ((cVar instanceof c.d) || (cVar instanceof c.e)) ? InterfaceC47075a.b.f428714a : null;
            if (obj2 != null) {
                profileProFragment.D5().accept(obj2);
            }
            if (cVar instanceof c.i) {
                a.c cVar2 = ((c.i) cVar).f3054a;
                InterfaceC35845m2 interfaceC35845m2 = profileProFragment.f222889x0;
                if (interfaceC35845m2 == null) {
                    interfaceC35845m2 = null;
                }
                profileProFragment.startActivity(Intent.createChooser(interfaceC35845m2.d(cVar2.f932b, cVar2.f931a), (String) profileProFragment.f222883V0.getValue()));
            } else if (cVar instanceof c.f) {
                profileProFragment.F5(((c.f) cVar).f3051a);
            } else if (cVar instanceof c.h) {
                com.avito.android.settings.b bVar2 = profileProFragment.f222862A0;
                if (bVar2 == null) {
                    bVar2 = null;
                }
                profileProFragment.startActivity(bVar2.b(profileProFragment.q5()));
            } else if (cVar instanceof c.k) {
                com.avito.android.wallet.page.c cVar3 = profileProFragment.f222863B0;
                if (cVar3 == null) {
                    cVar3 = null;
                }
                profileProFragment.startActivity(cVar3.c(null, null, false));
            } else if (cVar instanceof c.j) {
                InterfaceC47119a interfaceC47119a = profileProFragment.f222864C0;
                if (interfaceC47119a == null) {
                    interfaceC47119a = null;
                }
                profileProFragment.startActivity(InterfaceC47119a.C12288a.a(interfaceC47119a, null, 3));
            } else if (cVar instanceof c.a) {
                profileProFragment.G5(((c.a) cVar).f3043a, null, null, null, x.f223752l, ToastBarPosition.f181047e);
            } else if (cVar instanceof c.g) {
                profileProFragment.f222884W0.b(G0.f406611a);
            } else if (cVar instanceof c.m) {
                s90.e eVar = profileProFragment.f222871J0;
                if (eVar == null) {
                    eVar = null;
                }
                eVar.a();
            } else if (cVar instanceof c.l) {
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(profileProFragment.requireContext(), 0, 2, null);
                View viewInflate = View.inflate(dVar.getContext(), R.layout.bottom_sheet_call_answer, null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_call_answer_close);
                ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.ib_close);
                button.setOnClickListener(new ViewOnClickListenerC33357a(dVar, 0));
                imageButton.setOnClickListener(new ViewOnClickListenerC33357a(dVar, 1));
                dVar.G(viewInflate, true);
                com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, false, 0, 0, 0, 121);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                dVar.show();
            } else if (cVar instanceof c.C0154c) {
                h.b bVar3 = profileProFragment.f222891z0;
                if (bVar3 == null) {
                    bVar3 = null;
                }
                com.avito.android.lib.util.g.a(bVar3.a(new C13908a(((c.C0154c) cVar).f3048a, "from_dashboard", false), profileProFragment, h.a.f267588b));
            } else if (cVar instanceof c.n) {
                com.avito.android.user_address.e.a(profileProFragment.requireView(), ((c.n) cVar).f3059a);
            } else if (cVar instanceof c.o) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, profileProFragment, ((c.o) cVar).f3060a, null, null, null, 0, ToastBarPosition.f181047e, 958);
            }
            if (z12) {
                ProfileProFragment.d dVar2 = (ProfileProFragment.d) profileProFragment.f222882U0.getValue();
                c.b bVar4 = (c.b) cVar;
                List<DeepLink> list = bVar4.f3045b;
                if (!L.f(dVar2.f222910b, list)) {
                    Iterator<DeepLink> it = list.iterator();
                    while (it.hasNext()) {
                        b.a.a(dVar2.f222909a, it.next(), null, null, 6);
                    }
                }
                dVar2.f222910b = list;
                DeepLink deepLink = bVar4.f3046c;
                if (deepLink != null) {
                    profileProFragment.F5(deepLink);
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ProfileProFragment profileProFragment, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f223619r = profileProFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f223619r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f223618q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ProfileProFragment profileProFragment = this.f223619r;
            D d12 = profileProFragment.f222885t0;
            if (d12 == null) {
                d12 = null;
            }
            a aVar = new a(profileProFragment);
            this.f223618q = 1;
            if (d12.ke(aVar, this) == coroutine_suspended) {
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
