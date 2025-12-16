package IW;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;

/* compiled from: AnalyticsEventHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIW/a;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f8184a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.a f8185b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f8186c;

    public a(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.a aVar, @k String str) {
        this.f8184a = interfaceC28373a;
        this.f8185b = aVar;
        this.f8186c = str;
    }

    public final void a(@k String str, @l b bVar) {
        String strA = this.f8185b.a();
        String str2 = strA == null ? "" : strA;
        String str3 = bVar != null ? bVar.f8188b : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = bVar != null ? bVar.f8187a : null;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = bVar != null ? bVar.f8189c : null;
        String str6 = str5 == null ? "" : str5;
        String str7 = bVar != null ? bVar.f8190d : null;
        this.f8184a.c(new LW.a(str2, str, str3, str4, this.f8186c, str6, str7 == null ? "" : str7));
    }
}
