package w40;

import Y61.k;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OfflineModeProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lw40/a;", "", "a", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC49441a {

    /* compiled from: OfflineModeProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw40/a$a;", "", "<init>", "()V", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w40.a$a, reason: collision with other inner class name */
    public static final class C12807a {
        static {
            new C12807a();
        }
    }

    @k
    InterfaceC43160i<Boolean> a();

    boolean isEnabled();

    void setEnabled(boolean z12);
}
