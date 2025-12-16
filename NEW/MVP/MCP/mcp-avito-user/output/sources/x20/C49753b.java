package x20;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.l;
import z20.C50359a;

/* compiled from: MultiMessageSendAbTestProviderImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx20/b;", "Lx20/a;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x20.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49753b implements InterfaceC49752a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50359a f442132a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27642e f442133b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f442134c;

    @Inject
    public C49753b(@k C50359a c50359a, @k InterfaceC27642e interfaceC27642e, @k c0 c0Var) {
        this.f442132a = c50359a;
        this.f442133b = interfaceC27642e;
        this.f442134c = c0Var;
    }

    @Override // x20.InterfaceC49752a
    @k
    public final l<MultiMessageSendTestGroup> a() {
        return new l<>(this.f442133b.c(new e(this.f442132a)), this.f442134c);
    }
}
