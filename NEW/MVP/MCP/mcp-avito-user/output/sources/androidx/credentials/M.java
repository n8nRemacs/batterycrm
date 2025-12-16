package androidx.credentials;

import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GetCustomCredentialOption.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/M;", "Landroidx/credentials/x;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class M extends AbstractC22874x {
    @X41.j
    public M() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M(Bundle bundle, String str, Bundle bundle2, boolean z12, boolean z13, Set set, int i12, int i13, C42822w c42822w) {
        boolean z14 = (i13 & 16) != 0 ? false : z13;
        this((i13 & 64) != 0 ? 2000 : i12, bundle, bundle2, str, (i13 & 32) != 0 ? B0.f406639b : set, z12, z14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M(String str, Bundle bundle, Bundle bundle2, boolean z12, boolean z13, Set set, int i12, int i13, C42822w c42822w) {
        boolean z14 = (i13 & 16) != 0 ? false : z13;
        this((i13 & 64) != 0 ? 2000 : i12, bundle, bundle2, str, (i13 & 32) != 0 ? B0.f406639b : set, z12, z14);
    }

    public M(String str, Bundle bundle, Bundle bundle2, boolean z12, boolean z13, Set set, int i12, C42822w c42822w) {
        this(bundle, str, bundle2, z12, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? B0.f406639b : set, 0, 64, (C42822w) null);
    }

    public M(int i12, @Y61.k Bundle bundle, @Y61.k Bundle bundle2, @Y61.k String str, @Y61.k Set set, boolean z12, boolean z13) {
        super(i12, bundle, bundle2, str, set, z12, z13);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
        if (i12 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }
}
