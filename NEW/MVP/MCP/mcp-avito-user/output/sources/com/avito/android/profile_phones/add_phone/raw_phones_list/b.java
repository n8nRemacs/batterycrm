package com.avito.android.profile_phones.add_phone.raw_phones_list;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.user_profile.Phone;
import com.avito.android.remote.model.user_profile.PhonesList;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.Q;
import l41.o;

/* compiled from: RawPhonesListInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/raw_phones_list/b;", "Lcom/avito/android/profile_phones/add_phone/raw_phones_list/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.profile_phones.add_phone.raw_phones_list.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34401z0 f226963a;

    /* compiled from: RawPhonesListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/user_profile/PhonesList;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_phones.add_phone.raw_phones_list.RawPhonesListInteractorImpl$getRawPhonesList$1", f = "RawPhonesListInteractor.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<PhonesList>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226964q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<PhonesList>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f226964q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC34401z0 interfaceC34401z0 = b.this.f226963a;
                this.f226964q = 1;
                obj = interfaceC34401z0.w(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: RawPhonesListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/user_profile/Phone;", "it", "Lcom/avito/android/remote/model/user_profile/PhonesList;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.add_phone.raw_phones_list.b$b, reason: collision with other inner class name */
    public static final class C6890b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C6890b<T, R> f226966b = new C6890b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((PhonesList) obj).getPhones();
        }
    }

    @Inject
    public b(@k InterfaceC34401z0 interfaceC34401z0) {
        this.f226963a = interfaceC34401z0;
    }

    @Override // com.avito.android.profile_phones.add_phone.raw_phones_list.a
    @k
    public final I<List<Phone>> f() {
        return g1.a(Q.a(EmptyCoroutineContext.INSTANCE, new a(null))).r(C6890b.f226966b);
    }
}
