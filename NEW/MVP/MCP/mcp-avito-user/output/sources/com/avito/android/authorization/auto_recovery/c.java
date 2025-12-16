package com.avito.android.authorization.auto_recovery;

import com.avito.android.authorization.auto_recovery.f;
import com.avito.android.authorization.auto_recovery.g;
import com.avito.android.authorization.generated.api.ar_flow_v_2.ArFlowV2Response;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: AutoRecoveryAvailabilityInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response;", "typedResult", "Lcom/avito/android/authorization/auto_recovery/g;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AutoRecoveryLink.Scenario f93071b;

    /* compiled from: AutoRecoveryAvailabilityInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AutoRecoveryLink.Scenario.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AutoRecoveryLink.Scenario scenario = AutoRecoveryLink.Scenario.f133899c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AutoRecoveryLink.Scenario scenario2 = AutoRecoveryLink.Scenario.f133899c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AutoRecoveryLink.Scenario scenario3 = AutoRecoveryLink.Scenario.f133899c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AutoRecoveryLink.Scenario scenario4 = AutoRecoveryLink.Scenario.f133899c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public c(AutoRecoveryLink.Scenario scenario) {
        this.f93071b = scenario;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Object cVar;
        TypedResult.Success success;
        g.c cVar2;
        TypedResult typedResult = (TypedResult) obj;
        int iOrdinal = this.f93071b.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return typedResult;
                }
                throw new NoWhenBranchMatchedException();
            }
            switch (f.a.f93076a[((ArFlowV2Response) ((TypedResult.Success) typedResult).getResult()).getFlow().ordinal()]) {
                case 1:
                    cVar = g.b.f93193a;
                    break;
                case 2:
                    cVar = g.d.f93195a;
                    break;
                case 3:
                    cVar = g.a.f93192a;
                    break;
                case 4:
                    cVar = g.a.f93192a;
                    break;
                case 5:
                    cVar = new g.c(f.a("/api/1/automated/recovery/beduin/form/resolution?flow=resolution-support"));
                    break;
                case 6:
                    cVar = new g.c(f.a("/api/1/automated/recovery/beduin/form/resolution?flow=resolution-reject"));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            success = new TypedResult.Success(cVar);
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return typedResult;
                }
                throw new NoWhenBranchMatchedException();
            }
            switch (f.a.f93076a[((ArFlowV2Response) ((TypedResult.Success) typedResult).getResult()).getFlow().ordinal()]) {
                case 1:
                case 3:
                case 6:
                    cVar2 = new g.c(f.a("/api/1/automated/recovery/beduin/form/resolution?channel=email&flow=no-access-reject"));
                    break;
                case 2:
                case 4:
                case 5:
                    cVar2 = new g.c(f.a("/api/1/automated/recovery/beduin/form/resolution?channel=email&flow=no-access-support"));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            success = new TypedResult.Success(cVar2);
        }
        return success;
    }
}
