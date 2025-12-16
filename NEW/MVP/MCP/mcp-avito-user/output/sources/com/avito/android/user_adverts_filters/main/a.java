package com.avito.android.user_adverts_filters.main;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.component.toast.f;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.user_adverts_filters.main.vm.h;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;

/* compiled from: UserAdvertsFiltersMainMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.UserAdvertsFiltersMainMviFragment$collectMainEvents$1", f = "UserAdvertsFiltersMainMviFragment.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315990q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsFiltersMainMviFragment f315991r;

    /* compiled from: UserAdvertsFiltersMainMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_filters.main.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9798a implements InterfaceC43172j, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsFiltersMainMviFragment f315992b;

        public C9798a(UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment) {
            this.f315992b = userAdvertsFiltersMainMviFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            h.d dVar = (h.d) obj;
            UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = this.f315992b;
            if (dVar instanceof h.d.a) {
                userAdvertsFiltersMainMviFragment.q5();
            } else if (dVar instanceof h.d.b) {
                ActivityC22955m activityC22955mRequireActivity = userAdvertsFiltersMainMviFragment.requireActivity();
                UserAdvertsFiltersData.a aVar = UserAdvertsFiltersData.f315950e;
                Intent intent = new Intent();
                UserAdvertsFiltersData userAdvertsFiltersData = ((h.d.b) dVar).f316424a;
                aVar.getClass();
                activityC22955mRequireActivity.setResult(-1, intent.putExtra("user_adverts_filters_host_extra_data", userAdvertsFiltersData));
                userAdvertsFiltersMainMviFragment.q5();
            } else if (dVar instanceof h.d.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                h.d.c cVar2 = (h.d.c) dVar;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(z.k(cVar2.f316425a));
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar, userAdvertsFiltersMainMviFragment, printableTextF, null, null, f.c.a.a(cVar2.f316425a, null), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            }
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, this.f315992b, UserAdvertsFiltersMainMviFragment.class, "handeFiltersEvent", "handeFiltersEvent(Lcom/avito/android/user_adverts_filters/main/vm/UserAdvertsFiltersMainMviViewModel$Event;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f315991r = userAdvertsFiltersMainMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f315991r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315990q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = this.f315991r;
            Y1 y12 = (Y1) userAdvertsFiltersMainMviFragment.r5().f316410T.getValue();
            C9798a c9798a = new C9798a(userAdvertsFiltersMainMviFragment);
            this.f315990q = 1;
            if (y12.collect(c9798a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
