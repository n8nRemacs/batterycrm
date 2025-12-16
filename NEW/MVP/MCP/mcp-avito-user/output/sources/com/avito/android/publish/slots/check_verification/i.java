package com.avito.android.publish.slots.check_verification;

import Fk.InterfaceC13812d;
import androidx.compose.runtime.internal.P;
import com.avito.android.buy_contact.api.CheckVerificationResponse;
import com.avito.android.buy_contact.api.VerificationStatus;
import com.avito.android.publish.slots.check_verification.i;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.rx3.Q;
import l41.o;

/* compiled from: CheckVerificationStatusInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/check_verification/i;", "Lcom/avito/android/publish/slots/check_verification/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13812d f243179a;

    /* compiled from: CheckVerificationStatusInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f243180a;

        static {
            int[] iArr = new int[VerificationStatus.values().length];
            try {
                iArr[VerificationStatus.VERIFICATION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationStatus.VERIFICATION_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f243180a = iArr;
        }
    }

    @Inject
    public i(@Y61.k InterfaceC13812d interfaceC13812d) {
        this.f243179a = interfaceC13812d;
    }

    @Override // com.avito.android.publish.slots.check_verification.h
    @Y61.k
    public final O a() {
        return Q.a(EmptyCoroutineContext.INSTANCE, new j(this, null)).r(new o() { // from class: com.avito.android.publish.slots.check_verification.k
            @Override // l41.o
            public final Object apply(Object obj) {
                TypedResult typedResult = (TypedResult) obj;
                this.f243204b.getClass();
                if (!(typedResult instanceof TypedResult.Success)) {
                    if (typedResult instanceof TypedResult.Error) {
                        return BlockType.f243164b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Success success = (TypedResult.Success) typedResult;
                if (!((CheckVerificationResponse) success.getResult()).getNeedBlockVacancy()) {
                    return BlockType.f243164b;
                }
                VerificationStatus verificationStatus = ((CheckVerificationResponse) success.getResult()).getVerificationStatus();
                int i12 = verificationStatus == null ? -1 : i.a.f243180a[verificationStatus.ordinal()];
                return i12 != 1 ? i12 != 2 ? BlockType.f243164b : BlockType.f243166d : BlockType.f243165c;
            }
        });
    }
}
