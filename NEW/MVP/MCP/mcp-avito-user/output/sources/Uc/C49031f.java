package uc;

import Y61.k;
import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.J5;
import com.avito.android.util.V2;
import com.my.tracker.MyTracker;
import kotlin.Metadata;

/* compiled from: MyTrackerFacadeImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Luc/f;", "Luc/e;", "Lcom/avito/android/util/J5;", "_common_analytics-mytracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uc.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49031f extends J5 implements InterfaceC49030e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Application f440186c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f440187d;

    public C49031f(@k Application application, @k InterfaceC28373a interfaceC28373a) {
        this.f440186c = application;
        this.f440187d = interfaceC28373a;
    }

    @Override // uc.InterfaceC49030e
    @k
    public final String j() {
        try {
            return MyTracker.getInstanceId(this.f440186c);
        } catch (Exception e12) {
            String message = e12.getMessage();
            this.f440187d.c(new NonFatalErrorEvent(message == null ? "" : message, e12, null, null, 12, null));
            return "";
        }
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        MyTracker.initTracker("55521460977769330893", this.f440186c);
        V2.f318762a.i("MyTrackerInitializer", "MyTracker initialized", null);
    }
}
