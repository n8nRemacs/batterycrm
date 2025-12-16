package u0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22029a2;
import androidx.compose.runtime.InterfaceC22132o;
import j.T;
import j.e0;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: StringResources.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    @InterfaceC22029a2
    @InterfaceC22132o
    @k
    public static final String a(@T int i12, int i13, @k Object[] objArr, @l A a12) {
        return h.a(a12).getQuantityString(i12, i13, Arrays.copyOf(objArr, objArr.length));
    }

    @InterfaceC22029a2
    @InterfaceC22132o
    @k
    public static final String b(@e0 int i12, @k Object[] objArr, @l A a12) {
        return h.a(a12).getString(i12, Arrays.copyOf(objArr, objArr.length));
    }

    @InterfaceC22029a2
    @InterfaceC22132o
    @k
    public static final String c(@l A a12, @e0 int i12) {
        return h.a(a12).getString(i12);
    }
}
