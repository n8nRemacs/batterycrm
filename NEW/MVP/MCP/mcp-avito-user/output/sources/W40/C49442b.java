package w40;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: OfflineModeProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw40/b;", "Lw40/a;", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49442b implements InterfaceC49441a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Z1<Boolean> f441266a = p2.a(Boolean.FALSE);

    @Inject
    public C49442b() {
    }

    @Override // w40.InterfaceC49441a
    @k
    public final InterfaceC43160i<Boolean> a() {
        return C43175k.b(this.f441266a);
    }

    @Override // w40.InterfaceC49441a
    public final boolean isEnabled() {
        return this.f441266a.getValue().booleanValue();
    }

    @Override // w40.InterfaceC49441a
    public final void setEnabled(boolean z12) {
        this.f441266a.setValue(Boolean.valueOf(z12));
    }
}
