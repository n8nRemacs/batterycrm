package com.avito.android.employee_mode_impl.manager.state;

import Xy.C17060a;
import com.avito.android.employee_mode_impl.generated.api.api_messenger_info_v_2.ApiMessengerInfoV2Response;
import com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource;
import com.avito.android.remote.model.TypedResult;
import dz.C39832c;
import dz.InterfaceC39831b;
import javax.inject.Inject;
import jz.C42450a;
import jz.InterfaceC42451b;
import jz.InterfaceC42452c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: EmployeeModeStateReducer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/state/s;", "Lcom/avito/android/employee_mode_impl/manager/state/r;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements r {

    /* compiled from: EmployeeModeStateReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147536a;

        static {
            int[] iArr = new int[ApiMessengerInfoV2Response.ChatsType.values().length];
            try {
                iArr[ApiMessengerInfoV2Response.ChatsType.Employee.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiMessengerInfoV2Response.ChatsType.Company.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f147536a = iArr;
        }
    }

    @Inject
    public s() {
    }

    @Override // com.avito.android.employee_mode_impl.manager.state.r
    @Y61.k
    public final C39832c a(@Y61.k InterfaceC39831b interfaceC39831b, @Y61.k C39832c c39832c) {
        com.avito.android.employee_mode_impl.manager.domain.d dVar;
        boolean z12 = interfaceC39831b instanceof InterfaceC39831b.C11047b;
        C42450a c42450a = c39832c.f394202a;
        if (!z12) {
            if (interfaceC39831b instanceof InterfaceC39831b.d) {
                InterfaceC39831b.d dVar2 = (InterfaceC39831b.d) interfaceC39831b;
                return C39832c.a(c39832c, null, null, null, 0L, dVar2.f394199a, EmployeeModeSwitchSource.f147574d, dVar2.f394200b, 15);
            }
            if (!(interfaceC39831b instanceof InterfaceC39831b.e)) {
                if (!(interfaceC39831b instanceof InterfaceC39831b.c)) {
                    if (interfaceC39831b instanceof InterfaceC39831b.a) {
                        return C39832c.a(c39832c, null, null, null, 0L, "", null, InterfaceC42451b.a.f405966a, 15);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC39831b.c cVar = (InterfaceC39831b.c) interfaceC39831b;
                String str = cVar.f394196a;
                int length = str.length();
                String str2 = cVar.f394197b;
                return (length == 0 || str2.length() == 0) ? new C39832c(new C42450a(str, str2, InterfaceC42452c.b.f405973a), null, null, 0L, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null) : C39832c.a(c39832c, new C42450a(str, str2, cVar.f394198c), null, null, 0L, null, null, null, 118);
            }
            InterfaceC42452c bVar = c42450a.f405963a;
            boolean z13 = bVar instanceof InterfaceC42452c.a.C11597a;
            InterfaceC42451b interfaceC42451b = ((InterfaceC39831b.e) interfaceC39831b).f394201a;
            if (z13) {
                InterfaceC42452c.a.C11597a c11597a = (InterfaceC42452c.a.C11597a) bVar;
                bVar = new InterfaceC42452c.a.C11597a(interfaceC42451b, c11597a.f405969b, c11597a.f405970c, c11597a.f405971d);
            } else if (bVar instanceof InterfaceC42452c.a.b) {
                bVar = new InterfaceC42452c.a.b(interfaceC42451b);
            } else if (!(bVar instanceof InterfaceC42452c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return C39832c.a(c39832c, C42450a.a(c42450a, bVar), null, null, 0L, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        InterfaceC39831b.C11047b c11047b = (InterfaceC39831b.C11047b) interfaceC39831b;
        TypedResult<com.avito.android.employee_mode_impl.manager.domain.d> typedResult = c11047b.f394193a;
        InterfaceC42452c bVar2 = null;
        TypedResult.Success success = typedResult instanceof TypedResult.Success ? (TypedResult.Success) typedResult : null;
        boolean z14 = (success == null || (dVar = (com.avito.android.employee_mode_impl.manager.domain.d) success.getResult()) == null) ? false : dVar.f147367a;
        TypedResult<ApiMessengerInfoV2Response> typedResult2 = c11047b.f394194b;
        TypedResult.Success success2 = typedResult2 instanceof TypedResult.Success ? (TypedResult.Success) typedResult2 : null;
        ApiMessengerInfoV2Response apiMessengerInfoV2Response = success2 != null ? (ApiMessengerInfoV2Response) success2.getResult() : null;
        if (z14) {
            InterfaceC42451b f405972a = c42450a.f405963a.getF405972a();
            if (apiMessengerInfoV2Response != null) {
                int i12 = a.f147536a[apiMessengerInfoV2Response.getChatsType().ordinal()];
                if (i12 == 1) {
                    bVar2 = new InterfaceC42452c.a.b(f405972a);
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C17060a connect = apiMessengerInfoV2Response.getConnect();
                    if (connect != null) {
                        String privateCompanySessionId = connect.getPrivateCompanySessionId();
                        if (privateCompanySessionId == null) {
                            privateCompanySessionId = "";
                        }
                        String employeeId = connect.getEmployeeId();
                        if (employeeId == null) {
                            employeeId = "";
                        }
                        String companyHashId = connect.getCompanyHashId();
                        bVar2 = new InterfaceC42452c.a.C11597a(f405972a, privateCompanySessionId, employeeId, companyHashId != null ? companyHashId : "");
                    }
                }
            }
            if (bVar2 == null) {
                InterfaceC42452c interfaceC42452c = c42450a.f405963a;
                if (interfaceC42452c instanceof InterfaceC42452c.a) {
                    bVar2 = interfaceC42452c;
                } else {
                    if (!(interfaceC42452c instanceof InterfaceC42452c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((InterfaceC42452c.b) interfaceC42452c).getClass();
                    bVar2 = new InterfaceC42452c.a.b(InterfaceC42452c.b.f405974b);
                }
            }
        } else {
            bVar2 = InterfaceC42452c.b.f405973a;
        }
        return C39832c.a(c39832c, C42450a.a(c39832c.f394202a, bVar2), c11047b.f394193a, c11047b.f394194b, c11047b.f394195c, null, null, null, 112);
    }
}
