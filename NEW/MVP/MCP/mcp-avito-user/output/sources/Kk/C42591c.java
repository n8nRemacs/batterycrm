package kK;

import Y61.k;
import android.content.Context;
import android.content.IntentFilter;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: IacBroadcastReceiverLauncher.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LkK/c;", "LkK/b;", "LkK/g;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* renamed from: kK.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42591c implements InterfaceC42590b, g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f406231a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f406232b = f2.b(0, 4, null, 5);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f406233c = f2.b(0, 4, null, 5);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f406234d = f2.b(0, 4, null, 5);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e2 f406235e = f2.b(0, 4, null, 5);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e2 f406236f = f2.b(0, 4, null, 5);

    @Inject
    public C42591c(@k Context context) {
        this.f406231a = context;
    }

    @Override // kK.InterfaceC42590b
    /* renamed from: a, reason: from getter */
    public final e2 getF406232b() {
        return this.f406232b;
    }

    @Override // kK.InterfaceC42590b
    public final void b() {
        androidx.core.content.d.registerReceiver(this.f406231a.getApplicationContext(), new C42589a(this), new IntentFilter("IacBroadcastReceiver.ACTION_IAC_BROADCAST_ACTION"), 2);
    }

    @Override // kK.InterfaceC42590b
    /* renamed from: c, reason: from getter */
    public final e2 getF406236f() {
        return this.f406236f;
    }

    @Override // kK.InterfaceC42590b
    /* renamed from: d, reason: from getter */
    public final e2 getF406234d() {
        return this.f406234d;
    }
}
