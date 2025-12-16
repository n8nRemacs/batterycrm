package androidx.fragment.app;

import android.os.Bundle;
import androidx.compose.runtime.snapshots.C22166k;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Fragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22960s {
    public static final void a(@Y61.k Bundle bundle, @Y61.k Fragment fragment, @Y61.k String str) {
        fragment.getParentFragmentManager().o0(bundle, str);
    }

    public static final void b(@Y61.k Fragment fragment, @Y61.k String str, @Y61.k Y41.p<? super String, ? super Bundle, G0> pVar) {
        fragment.getParentFragmentManager().p0(str, fragment, new C22166k(1, pVar));
    }
}
