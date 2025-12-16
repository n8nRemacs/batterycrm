package com.avito.android.referral_contacts.mvi;

import Qi0.C14899a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.referral_contacts.PermissionCheckResult;
import com.avito.android.referral_contacts.models.ReferralContactsInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReferralContactsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/referral_contacts/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements com.avito.android.arch.mvi.b<ReferralContactsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.referral_contacts.domain.h f252540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.referral_contacts.c f252541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f252542c;

    /* compiled from: ReferralContactsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/referral_contacts/PermissionCheckResult;", "result", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "<anonymous>", "(Lcom/avito/android/referral_contacts/PermissionCheckResult;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.referral_contacts.mvi.ReferralContactsBootstrap$produce$1", f = "ReferralContactsBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<PermissionCheckResult, Continuation<? super InterfaceC43160i<? extends ReferralContactsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f252543q;

        /* compiled from: ReferralContactsBootstrap.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.referral_contacts.mvi.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C7584a {
            static {
                int[] iArr = new int[PermissionCheckResult.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PermissionCheckResult permissionCheckResult = PermissionCheckResult.f252364b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    PermissionCheckResult permissionCheckResult2 = PermissionCheckResult.f252364b;
                    iArr[6] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    PermissionCheckResult permissionCheckResult3 = PermissionCheckResult.f252364b;
                    iArr[2] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    PermissionCheckResult permissionCheckResult4 = PermissionCheckResult.f252364b;
                    iArr[5] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    PermissionCheckResult permissionCheckResult5 = PermissionCheckResult.f252364b;
                    iArr[7] = 6;
                } catch (NoSuchFieldError unused6) {
                }
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f252543q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(PermissionCheckResult permissionCheckResult, Continuation<? super InterfaceC43160i<? extends ReferralContactsInternalAction>> continuation) {
            return ((a) create(permissionCheckResult, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            PermissionCheckResult permissionCheckResult = (PermissionCheckResult) this.f252543q;
            PermissionCheckResult permissionCheckResult2 = PermissionCheckResult.f252365c;
            h hVar = h.this;
            if (permissionCheckResult == permissionCheckResult2) {
                hVar.f252542c.c(new C14899a());
            }
            int iOrdinal = permissionCheckResult.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 5) {
                    if (iOrdinal != 6) {
                        if (iOrdinal != 7) {
                            return C43175k.w();
                        }
                    }
                }
                return new C43210w(ReferralContactsInternalAction.Close.f252508b);
            }
            return hVar.f252540a.a();
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.referral_contacts.domain.h hVar, @Y61.k com.avito.android.referral_contacts.c cVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f252540a = hVar;
        this.f252541b = cVar;
        this.f252542c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ReferralContactsInternalAction> a() {
        return C43175k.N(C43175k.B(new a(null), this.f252541b.a()));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
