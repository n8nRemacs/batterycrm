package com.avito.android.employee_mode_impl.deeplink;

import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EmployeeModeSwitchLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljz/b;", "it", "Lkotlin/G0;", "emit", "(Ljz/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f147339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmployeeModeSwitchLink f147340c;

    public e(a aVar, EmployeeModeSwitchLink employeeModeSwitchLink) {
        this.f147339b = aVar;
        this.f147340c = employeeModeSwitchLink;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        a aVar = this.f147339b;
        aVar.f147326j.g(aVar.d(), false);
        this.f147340c.f133301d = false;
        this.f147339b.k(this.f147340c);
        return G0.f406611a;
    }
}
