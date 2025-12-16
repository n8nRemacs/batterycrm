package Nr0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.vertical_main.analytics.WidgetPageSource;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerticalMainAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNr0/b;", "LNr0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC14605a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f11762a;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f11762a = interfaceC28373a;
    }

    @Override // Nr0.InterfaceC14605a
    public final void J(@Y61.k WidgetPageSource widgetPageSource, @l Integer num, @l Integer num2, @l Long l12, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l Map map) {
        this.f11762a.c(new d(widgetPageSource, num, num2, l12, str, str2, str3, str5, str6, C35800g5.a(new C35792f5(str4)), map));
    }

    @Override // Nr0.InterfaceC14605a
    public final void S(@Y61.k WidgetPageSource widgetPageSource, @l String str, @l String str2, @Y61.k String str3, @l String str4, @l String str5) {
        this.f11762a.c(new j(widgetPageSource, str, str2, str3, str5, C35800g5.a(new C35792f5(str4))));
    }

    @Override // Nr0.InterfaceC14605a
    public final void V(int i12, @Y61.k WidgetPageSource widgetPageSource, @l Integer num, @l Integer num2, @l Long l12, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @Y61.k LinkedHashMap linkedHashMap) {
        this.f11762a.c(new e(i12, widgetPageSource, num, num2, l12, str, str2, str3, str5, str6, C35800g5.a(new C35792f5(str4)), linkedHashMap));
    }

    @Override // Nr0.InterfaceC14605a
    public final void u(int i12, @l String str, int i13, @l String str2, @l String str3, @l String str4, @Y61.k WidgetPageSource widgetPageSource, @l String str5, @l String str6, @l Long l12, @Y61.k LinkedHashMap linkedHashMap) {
        this.f11762a.c(new i(i12, str, Integer.valueOf(i13), str2, str3, str5, str6, C35800g5.a(new C35792f5(str4)), widgetPageSource, l12, linkedHashMap));
    }

    @Override // Nr0.InterfaceC14605a
    public final void w(@l String str, int i12, @l String str2, @l String str3, @l String str4, @Y61.k WidgetPageSource widgetPageSource, @l String str5, @l String str6, @l Long l12, @l Map<String, String> map) {
        this.f11762a.c(new h(str, Integer.valueOf(i12), str2, str3, str5, str6, C35800g5.a(new C35792f5(str4)), widgetPageSource, l12, map));
    }
}
