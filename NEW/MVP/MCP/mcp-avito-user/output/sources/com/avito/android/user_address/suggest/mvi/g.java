package com.avito.android.user_address.suggest.mvi;

import com.avito.android.user_address.suggest.mvi.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAddressSuggestMviActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/user_address/suggest/mvi/f;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.a<f, UserAddressSuggestMviInternalAction, UserAddressSuggestMviState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.suggest.domain.a f308110a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.a f308111b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public f.d f308112c = new f.d("");

    /* compiled from: UserAddressSuggestMviActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/g$a;", "", "a", "b", "Lcom/avito/android/user_address/suggest/mvi/g$a$a;", "Lcom/avito/android/user_address/suggest/mvi/g$a$b;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAddressSuggestMviActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/g$a$a;", "Lcom/avito/android/user_address/suggest/mvi/g$a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_address.suggest.mvi.g$a$a, reason: collision with other inner class name */
        public static final class C9460a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9460a f308113a = new C9460a();
        }

        /* compiled from: UserAddressSuggestMviActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/g$a$b;", "Lcom/avito/android/user_address/suggest/mvi/g$a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f308114a = new b();
        }
    }

    @Inject
    public g(@Y61.k com.avito.android.user_address.suggest.domain.a aVar, @Y61.k com.avito.android.user_address.a aVar2) {
        this.f308110a = aVar;
        this.f308111b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new n(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, m.f308133l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UserAddressSuggestMviInternalAction> b(@Y61.k f fVar, @Y61.k UserAddressSuggestMviState userAddressSuggestMviState) {
        if (fVar instanceof f.d) {
            return new C43152f0(C43175k.G(new h(this, (f.d) fVar, null)), new i(3, null));
        }
        if (fVar instanceof f.a) {
            return C43175k.G(new j(2, null));
        }
        if (fVar instanceof f.c) {
            return new C43152f0(C43175k.G(new k(userAddressSuggestMviState, (f.c) fVar, this, null)), new l(3, null));
        }
        if (fVar instanceof f.b) {
            return new C43152f0(C43175k.G(new h(this, this.f308112c, null)), new i(3, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
