package com.avito.android.profile.user_profile.mvi;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.deeplinks.PhonesListLink;
import com.avito.android.profile.user_profile.CardToOpenFromProfile;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$tryOpenCard$1", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class T extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C33388a f226262q;

    /* compiled from: UserProfileActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CardToOpenFromProfile.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CardToOpenFromProfile cardToOpenFromProfile = CardToOpenFromProfile.f224194b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C33388a c33388a, Continuation<? super T> continuation) {
        super(2, continuation);
        this.f226262q = c33388a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new T(this.f226262q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((T) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (!this.f226262q.f226305y) {
            this.f226262q.f226305y = true;
            if (this.f226262q.f226281a.ordinal() == 1) {
                b.a.a(this.f226262q.f226289i, new PhonesListLink(null, 1, null), "req_deep_link_user_profile", null, 4);
            }
        }
        return G0.f406611a;
    }
}
