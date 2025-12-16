package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.Z1;

/* compiled from: EmployeeModeStateUpdater.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeStateUpdaterImpl", f = "EmployeeModeStateUpdater.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {139, 153}, m = "updateEmployeeInfo", n = {"this", "$this$updateEmployeeInfo", "$this$updateEmployeeInfo_u24lambda_u242", "starLoadingProfileId", "infoUpdateTime", "isApprovedEmployee", "updateMessengerInfo", "this", "$this$updateEmployeeInfo", "starLoadingProfileId", "infoUpdateTime", "updatedInfo"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes13.dex */
final class B extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public y f147380q;

    /* renamed from: r, reason: collision with root package name */
    public Z1 f147381r;

    /* renamed from: s, reason: collision with root package name */
    public Object f147382s;

    /* renamed from: t, reason: collision with root package name */
    public Serializable f147383t;

    /* renamed from: u, reason: collision with root package name */
    public Object f147384u;

    /* renamed from: v, reason: collision with root package name */
    public l0.a f147385v;

    /* renamed from: w, reason: collision with root package name */
    public int f147386w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f147387x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f147388y;

    /* renamed from: z, reason: collision with root package name */
    public int f147389z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147388y = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147387x = obj;
        this.f147389z |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = y.f147539i;
        return this.f147388y.e(null, false, false, this);
    }
}
