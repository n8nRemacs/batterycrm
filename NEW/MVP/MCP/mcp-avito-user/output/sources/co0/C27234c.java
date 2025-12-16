package co0;

import AK0.l;
import Y61.k;
import androidx.camera.camera2.internal.G;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import do0.C39768b;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SafeDealStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lco0/c;", "Lco0/b;", "_avito_safedeal-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: co0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C27234c implements InterfaceC27233b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C39768b f58141a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f58142b;

    @Inject
    public C27234c(@k C39768b c39768b, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f58141a = c39768b;
        this.f58142b = interfaceC35745a5;
    }

    @Override // co0.InterfaceC27233b
    public final void a(@k String str) {
        C39768b c39768b = this.f58141a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c39768b.f394062b.putLong(G.f("item_", str), jCurrentTimeMillis);
        c39768b.f394061a.putLong("safe_deal_return_checkout_dialog_last_time_show", jCurrentTimeMillis);
    }

    @Override // co0.InterfaceC27233b
    public final void b() {
        this.f58141a.f394061a.putBoolean("safe_deal_return_checkout_dialog_disable_show", true);
    }

    @Override // co0.InterfaceC27233b
    @k
    public final C41982q1 c() {
        return z.W(new VH0.c(this, 2)).x0(this.f58142b.a());
    }

    @Override // co0.InterfaceC27233b
    public final boolean d(long j12, @k String str) {
        C39768b c39768b = this.f58141a;
        l lVar = c39768b.f394061a;
        if (lVar.c("safe_deal_return_checkout_dialog_disable_show")) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j13 = j12 * 1000;
        if (jCurrentTimeMillis <= lVar.getLong("safe_deal_return_checkout_dialog_last_time_show", 0L) + j13) {
            return false;
        }
        return jCurrentTimeMillis > c39768b.f394062b.getLong(G.f("item_", str), 0L) + j13;
    }
}
