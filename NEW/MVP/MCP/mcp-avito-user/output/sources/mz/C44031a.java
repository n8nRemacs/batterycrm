package mZ;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import h31.e;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import qZ.InterfaceC47362a;

/* compiled from: UpdateUnreadCounterLauncherImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmZ/a;", "LqZ/a;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mZ.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44031a implements InterfaceC47362a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<com.avito.android.messenger_unread_counter.impl_module.b> f414572a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f414573b;

    @Inject
    public C44031a(@k e<com.avito.android.messenger_unread_counter.impl_module.b> eVar) {
        this.f414572a = eVar;
    }

    @Override // qZ.InterfaceC47362a
    public final void a() {
        if (this.f414573b) {
            return;
        }
        this.f414572a.get().a();
        this.f414573b = true;
    }
}
