package tz;

import AK0.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EntryPointAccountOwnerStorageImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz/b;", "Ltz/a;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48744b implements InterfaceC48743a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f439698a;

    @Inject
    public C48744b(@k l lVar) {
        this.f439698a = lVar;
    }

    @Override // tz.InterfaceC48743a
    public final boolean a() {
        return this.f439698a.getBoolean("should_show_entry_point", true);
    }

    @Override // tz.InterfaceC48743a
    public final void b() {
        this.f439698a.putBoolean("should_show_entry_point", false);
    }
}
