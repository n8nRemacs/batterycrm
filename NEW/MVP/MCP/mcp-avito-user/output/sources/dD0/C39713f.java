package dd0;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import ed0.C40090a;
import ed0.C40091b;
import ed0.C40092c;
import kotlin.Metadata;

/* compiled from: ProgressInfoToastBarAnalyticsTrucks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldd0/f;", "Ldd0/a;", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dd0.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39713f implements InterfaceC39708a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f393981a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f393982b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f393983c;

    public C39713f(@k InterfaceC28373a interfaceC28373a, @k String str, @l Integer num) {
        Parcelable.Creator<ProgressInfoToastBar.InitialFlow> creator = ProgressInfoToastBar.InitialFlow.CREATOR;
        this.f393981a = interfaceC28373a;
        this.f393982b = str;
        this.f393983c = num;
    }

    @Override // dd0.InterfaceC39708a
    public final void a() {
        this.f393981a.c(new C40091b(String.valueOf(this.f393983c)));
    }

    @Override // dd0.InterfaceC39708a
    public final void b(int i12) {
        Parcelable.Creator<ProgressInfoToastBar.InitialFlow> creator = ProgressInfoToastBar.InitialFlow.CREATOR;
        this.f393981a.c(new C40092c(this.f393982b, String.valueOf(this.f393983c)));
    }

    @Override // dd0.InterfaceC39708a
    public final void c() {
        this.f393981a.c(new C40090a(String.valueOf(this.f393983c)));
    }
}
