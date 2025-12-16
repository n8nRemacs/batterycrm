package dd0;

import Y61.k;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import fd0.C40403a;
import fd0.C40405c;
import fd0.C40406d;
import kotlin.Metadata;

/* compiled from: ProgressInfoToastBarAnalyticsVacancy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldd0/g;", "Ldd0/a;", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dd0.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39714g implements InterfaceC39708a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f393984a;

    public C39714g(@k InterfaceC28373a interfaceC28373a) {
        Parcelable.Creator<ProgressInfoToastBar.InitialFlow> creator = ProgressInfoToastBar.InitialFlow.CREATOR;
        this.f393984a = interfaceC28373a;
    }

    @Override // dd0.InterfaceC39708a
    public final void a() {
        this.f393984a.c(new C40405c());
    }

    @Override // dd0.InterfaceC39708a
    public final void b(int i12) {
        Parcelable.Creator<ProgressInfoToastBar.InitialFlow> creator = ProgressInfoToastBar.InitialFlow.CREATOR;
        this.f393984a.c(new C40406d(i12));
    }

    @Override // dd0.InterfaceC39708a
    public final void c() {
        Parcelable.Creator<ProgressInfoToastBar.InitialFlow> creator = ProgressInfoToastBar.InitialFlow.CREATOR;
        this.f393984a.c(new C40403a());
    }
}
