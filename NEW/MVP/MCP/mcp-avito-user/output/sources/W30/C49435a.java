package w30;

import Ck0.InterfaceC13317a;
import I30.d;
import Y61.k;
import com.avito.android.remote.notification.A;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationChannelHelperImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw30/a;", "LCk0/a;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w30.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49435a implements InterfaceC13317a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final A f441243a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f441244b;

    @Inject
    public C49435a(@k A a12, @k d dVar) {
        this.f441243a = a12;
        this.f441244b = dVar;
    }

    @Override // Ck0.InterfaceC13317a
    @k
    public final String a() {
        return this.f441243a.a();
    }

    @Override // Ck0.InterfaceC13317a
    public final boolean b() {
        return this.f441244b.a(this.f441243a.a());
    }
}
