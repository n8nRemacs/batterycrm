package HK;

import AK0.o;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.preference.s;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacDialerStorage.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHK/b;", "LHK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f7030a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f7031b = "notificationChannelIncomingCallIndexKey";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f7032c = "notificationChannelActiveCallIndexKey";

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f7033d = "isNotificationChannelsRecreationBrokenKey";

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f7034e = "waitDialingBottomSheetLastShowTimeKey";

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f7035f = "waitRingingBottomSheetLastShowTimeKey";

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f7036g = "enableCallBottomSheetLastShowTimeKey";

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f7037h = "incomingCallsFeedbackScreenCounterKey";

    @Inject
    public b(@k Context context) {
        this.f7030a = new o(context.getSharedPreferences(s.a(context), 0));
    }

    @Override // HK.a
    public final void a() {
        this.f7030a.putBoolean(this.f7033d, true);
    }

    @Override // HK.a
    public final void b(long j12) {
        this.f7030a.putLong(this.f7037h, j12);
    }

    @Override // HK.a
    public final long c() {
        return this.f7030a.f316a.getLong(this.f7035f, 0L);
    }

    @Override // HK.a
    public final void d(long j12) {
        this.f7030a.putLong(this.f7036g, j12);
    }

    @Override // HK.a
    public final void e(long j12) {
        this.f7030a.putLong(this.f7035f, j12);
    }

    @Override // HK.a
    public final int f() {
        return this.f7030a.f316a.getInt(this.f7031b, 0);
    }

    @Override // HK.a
    public final long g() {
        return this.f7030a.f316a.getLong(this.f7036g, 0L);
    }

    @Override // HK.a
    public final int h() {
        return this.f7030a.f316a.getInt(this.f7032c, 0);
    }

    @Override // HK.a
    public final void i(long j12) {
        this.f7030a.putLong(this.f7034e, j12);
    }

    @Override // HK.a
    public final long j() {
        return this.f7030a.f316a.getLong(this.f7037h, 0L);
    }

    @Override // HK.a
    public final void k(int i12) {
        this.f7030a.a(i12, this.f7031b);
    }

    @Override // HK.a
    public final long l() {
        return this.f7030a.f316a.getLong(this.f7034e, 0L);
    }

    @Override // HK.a
    public final void m(int i12) {
        this.f7030a.a(i12, this.f7032c);
    }

    @Override // HK.a
    public final boolean n() {
        return this.f7030a.f316a.getBoolean(this.f7033d, false);
    }
}
