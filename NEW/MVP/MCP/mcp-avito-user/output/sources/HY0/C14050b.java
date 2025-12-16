package Hy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrCalendarNonFatalTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHy0/b;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hy0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14050b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f7845a;

    @Inject
    public C14050b(@k InterfaceC28373a interfaceC28373a) {
        this.f7845a = interfaceC28373a;
    }

    public final void a(@l Throwable th2) {
        this.f7845a.c(new NonFatalErrorEvent("StrSellerCalendar: Something went wrong", th2, null, null, 12, null));
    }
}
