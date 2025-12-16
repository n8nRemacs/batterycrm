package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import dz.InterfaceC39830a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Z1;

/* compiled from: EmployeeModeStateUpdater.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeStateUpdaterImpl", f = "EmployeeModeStateUpdater.kt", i = {0, 0, 0}, l = {115}, m = "switchMode", n = {"this", "$this$switchMode", "action"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes13.dex */
final class z extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public y f147548q;

    /* renamed from: r, reason: collision with root package name */
    public Z1 f147549r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC39830a.e f147550s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f147551t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f147552u;

    /* renamed from: v, reason: collision with root package name */
    public int f147553v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147552u = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147551t = obj;
        this.f147553v |= BeduinInputModel.MIN_TEXT_VERSION;
        return y.b(this.f147552u, null, null, this);
    }
}
