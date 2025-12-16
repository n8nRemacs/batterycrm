package com.avito.android.employee_mode_impl.deeplink;

import android.content.res.Resources;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.employee_mode_impl.deeplink.a;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EmployeeModeSwitchLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/employee_mode_impl/deeplink/a$a;", "modeResult", "Lkotlin/G0;", "emit", "(Lcom/avito/android/employee_mode_impl/deeplink/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f147345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmployeeModeSwitchLink f147346c;

    public h(a aVar, EmployeeModeSwitchLink employeeModeSwitchLink) {
        this.f147345b = aVar;
        this.f147346c = employeeModeSwitchLink;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
        String string;
        a.InterfaceC4290a interfaceC4290a = (a.InterfaceC4290a) obj;
        a aVar = this.f147345b;
        aVar.f147326j.g(aVar.d(), false);
        this.f147346c.f133301d = false;
        if (interfaceC4290a instanceof a.InterfaceC4290a.C4291a) {
            a aVar2 = this.f147345b;
            EmployeeModeSwitchLink employeeModeSwitchLink = this.f147346c;
            ApiError apiError = ((a.InterfaceC4290a.C4291a) interfaceC4290a).f147330a;
            if (apiError == null || (string = z.i(apiError)) == null) {
                string = aVar2.f147328l.getString(R.string.employee_mode_error_switch_message);
            }
            String str = string;
            DeepLink deepLink = employeeModeSwitchLink.f133300c;
            if (deepLink == null ? true : deepLink.equals(new NoMatchLink())) {
                f.c.f125255c.getClass();
                a.i.C4057a.e(aVar2.f147327k, str, f.c.a.a(apiError, null), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                aVar2.j(EmployeeModeSwitchLink.b.a.C3998a.f133308b);
            } else {
                aVar2.i(EmployeeModeSwitchLink.b.InterfaceC4000b.a.f133311b, aVar2.f147322f, new ScreenFlowLink(deepLink, new ToastMessageLink(str, ToastMessageLink.ToastType.f133736e, ToastMessageLink.ToastBarPosition.f133726d, null, null, false, null, 120, null)));
            }
        } else if (interfaceC4290a instanceof a.InterfaceC4290a.b) {
            a aVar3 = this.f147345b;
            EmployeeModeSwitchLink employeeModeSwitchLink2 = this.f147346c;
            String string2 = aVar3.f147328l.getString(R.string.employee_mode_not_approved_message);
            DeepLink deepLink2 = employeeModeSwitchLink2.f133300c;
            if (deepLink2 == null ? true : deepLink2.equals(new NoMatchLink())) {
                a.i.C4057a.e(aVar3.f147327k, string2, null, 0, null, 1022);
                aVar3.j(EmployeeModeSwitchLink.b.a.C3999b.f133309b);
            } else {
                aVar3.i(EmployeeModeSwitchLink.b.InterfaceC4000b.C4001b.f133312b, aVar3.f147322f, new ScreenFlowLink(deepLink2, new ToastMessageLink(string2, ToastMessageLink.ToastType.f133735d, ToastMessageLink.ToastBarPosition.f133725c, null, null, false, null, 120, null)));
            }
        } else if (interfaceC4290a instanceof a.InterfaceC4290a.c) {
            this.f147345b.k(this.f147346c);
        }
        return G0.f406611a;
    }
}
