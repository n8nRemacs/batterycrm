package com.avito.android.employee_mode_impl.deeplink;

import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: EmployeeModeSwitchLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f147336l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EmployeeModeSwitchLink f147337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, EmployeeModeSwitchLink employeeModeSwitchLink) {
        super(0);
        this.f147336l = aVar;
        this.f147337m = employeeModeSwitchLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f147336l;
        C43259k.d(aVar.f147329m, null, null, new b(aVar, this.f147337m, null), 3);
        return G0.f406611a;
    }
}
