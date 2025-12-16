package com.avito.android.passport.profiles_list;

import android.content.Intent;
import com.avito.android.passport.profiles_list.PassportProfilesListActivity;
import com.avito.android.util.N0;
import j60.InterfaceC42205b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PassportProfilesListActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profiles_list.PassportProfilesListActivity$observeScreenState$2", f = "PassportProfilesListActivity.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f213752q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PassportProfilesListActivity f213753r;

    /* compiled from: PassportProfilesListActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements InterfaceC43172j, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PassportProfilesListActivity f213754b;

        public a(PassportProfilesListActivity passportProfilesListActivity) {
            this.f213754b = passportProfilesListActivity;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            com.avito.android.lib.design.bottom_sheet.d dVar;
            InterfaceC42205b interfaceC42205b = (InterfaceC42205b) obj;
            PassportProfilesListActivity.a aVar = PassportProfilesListActivity.f213728u;
            PassportProfilesListActivity passportProfilesListActivity = this.f213754b;
            passportProfilesListActivity.getClass();
            if (interfaceC42205b instanceof InterfaceC42205b.a) {
                passportProfilesListActivity.setResult(-1, new Intent().putExtra("PassportProfilesListActivity.ResultExtra", ((InterfaceC42205b.a) interfaceC42205b).f405434a));
                passportProfilesListActivity.finish();
            } else if ((interfaceC42205b instanceof InterfaceC42205b.C11548b) && (dVar = passportProfilesListActivity.f213729m) != null) {
                dVar.setOnDismissListener(null);
                N0.a(dVar);
            }
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, this.f213754b, PassportProfilesListActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListOneTimeEvent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PassportProfilesListActivity passportProfilesListActivity, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f213753r = passportProfilesListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f213753r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f213752q;
        if (i12 == 0) {
            C42729a0.b(obj);
            PassportProfilesListActivity passportProfilesListActivity = this.f213753r;
            InterfaceC43160i<InterfaceC42205b> events = ((i) passportProfilesListActivity.f213734r.getValue()).getEvents();
            a aVar = new a(passportProfilesListActivity);
            this.f213752q = 1;
            if (events.collect(aVar, this) == coroutine_suspended) {
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
