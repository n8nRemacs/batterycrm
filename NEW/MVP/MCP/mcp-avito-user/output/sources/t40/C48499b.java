package t40;

import Y61.k;
import android.os.Handler;
import android.os.Looper;
import com.avito.android.util.C;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import n11.RunnableC44167a;

/* compiled from: DebugAppCrasher.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt40/b;", "Lt40/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: t40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48499b implements InterfaceC48498a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C f439143a;

    @Inject
    public C48499b(@k C c12) {
        this.f439143a = c12;
    }

    @Override // t40.InterfaceC48498a
    public final void a(@k IllegalArgumentException illegalArgumentException) {
        if (this.f439143a.s()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC44167a(illegalArgumentException, 10));
        }
    }
}
