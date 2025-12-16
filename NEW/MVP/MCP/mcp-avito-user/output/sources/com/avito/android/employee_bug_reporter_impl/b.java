package com.avito.android.employee_bug_reporter_impl;

import Oy.InterfaceC14751d;
import Ry.C15095a;
import android.app.Activity;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.webview.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;

/* compiled from: EmployeeBugReporterLifecycleCallbacksImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f147252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Activity f147253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14751d f147254n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, Activity activity, InterfaceC14751d interfaceC14751d) {
        super(0);
        this.f147252l = fVar;
        this.f147253m = activity;
        this.f147254n = interfaceC14751d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f147252l;
        C15095a c15095a = fVar.f147307e;
        c15095a.getClass();
        n<Object> nVar = C15095a.f14752d[1];
        if (((Boolean) c15095a.f14754c.a().invoke()).booleanValue()) {
            fVar.f147305c.a();
        }
        DeepLink deepLink = ((InterfaceC14751d.c) this.f147254n).f12739b;
        boolean z12 = deepLink instanceof WebViewLink;
        Activity activity = this.f147253m;
        if (z12) {
            activity.startActivity(l.a.a(fVar.f147306d, ((WebViewLink) deepLink).getF133855b(), null, 6));
        } else {
            T0 t02 = activity instanceof T0 ? (T0) activity : null;
            if (t02 != null) {
                b.a.a((com.avito.android.deeplink_handler.handler.composite.d) new P0(t02).a(com.avito.android.deeplink_handler.handler.composite.d.class), deepLink, null, null, 6);
            }
        }
        return G0.f406611a;
    }
}
