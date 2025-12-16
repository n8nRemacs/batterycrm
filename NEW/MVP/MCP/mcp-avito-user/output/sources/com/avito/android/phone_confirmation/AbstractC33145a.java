package com.avito.android.phone_confirmation;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.phone_confirmation.state.PhoneConfirmationResolution;
import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.phone_confirmation.state.PhoneConfirmationTime;
import com.avito.android.util.InterfaceC35945t1;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;
import s70.InterfaceC48008b;

/* compiled from: PhoneConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/a;", "Lcom/avito/android/phone_confirmation/U;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.phone_confirmation.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC33145a implements U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f215891a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<PhoneConfirmationScreenState> f215892b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B0 f215893c;

    /* compiled from: PhoneConfirmationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationResolution;", "it", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationScreenState;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.phone_confirmation.a$a, reason: collision with other inner class name */
    public static final class C6474a<T, R> implements l41.o {
        public C6474a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            PhoneConfirmationScreenState phoneConfirmationScreenState = (PhoneConfirmationScreenState) obj;
            if (phoneConfirmationScreenState.f215958e) {
                return PhoneConfirmationResolution.f215948e;
            }
            if (phoneConfirmationScreenState.f215960g) {
                return PhoneConfirmationResolution.f215952i;
            }
            if (phoneConfirmationScreenState.f215963j != null) {
                return PhoneConfirmationResolution.f215951h;
            }
            if (phoneConfirmationScreenState.f215962i != null) {
                return PhoneConfirmationResolution.f215950g;
            }
            if (phoneConfirmationScreenState.f215961h != null) {
                return PhoneConfirmationResolution.f215949f;
            }
            AbstractC33145a abstractC33145a = AbstractC33145a.this;
            abstractC33145a.getClass();
            PhoneConfirmationTime phoneConfirmationTime = phoneConfirmationScreenState.f215959f;
            boolean z12 = false;
            boolean z13 = phoneConfirmationTime == null;
            com.jakewharton.rxrelay3.b<PhoneConfirmationScreenState> bVar = abstractC33145a.f215892b;
            boolean zF2 = kotlin.jvm.internal.L.f(bVar.f364266b.get().f215955b, phoneConfirmationTime != null ? phoneConfirmationTime.f215965b : null);
            if ((phoneConfirmationTime != null ? phoneConfirmationTime.f215966c : 0L) < abstractC33145a.getF215898e().now() && !bVar.f364266b.get().f215957d) {
                z12 = true;
            }
            return (z13 || !zF2 || z12) ? PhoneConfirmationResolution.f215945b : phoneConfirmationScreenState.f215964k.length() == 5 ? PhoneConfirmationResolution.f215946c : PhoneConfirmationResolution.f215947d;
        }
    }

    public AbstractC33145a(@Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC48008b interfaceC48008b, @Y61.k PhoneConfirmationScreenState phoneConfirmationScreenState, @Y61.k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f215891a = fVar;
        com.jakewharton.rxrelay3.b<PhoneConfirmationScreenState> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f215892b = bVar;
        bVar.accept(PhoneConfirmationScreenState.a(phoneConfirmationScreenState, interfaceC35945t1.a(phoneConfirmationScreenState.f215955b), interfaceC48008b.a(), false, null, null, null, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION));
        this.f215893c = bVar.d0(new C6474a());
    }

    @Override // com.avito.android.phone_confirmation.U
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final B0 getF215893c() {
        return this.f215893c;
    }

    @Override // com.avito.android.phone_confirmation.U
    @Y61.k
    /* renamed from: c, reason: from getter */
    public com.avito.android.server_time.f getF215898e() {
        return this.f215891a;
    }

    @Override // com.avito.android.phone_confirmation.U
    @Y61.k
    public final PhoneConfirmationScreenState f0() {
        return this.f215892b.f364266b.get();
    }

    @Override // com.avito.android.phone_confirmation.U
    /* renamed from: getState, reason: from getter */
    public final /* bridge */ /* synthetic */ com.jakewharton.rxrelay3.b getF215892b() {
        return this.f215892b;
    }
}
