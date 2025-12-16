package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.AbstractC22849b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CreateCustomCredentialRequest.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/d;", "Landroidx/credentials/b;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22851d extends AbstractC22849b {
    public C22851d(String str, Bundle bundle, Bundle bundle2, boolean z12, AbstractC22849b.C1761b c1761b, boolean z13, String str2, boolean z14, int i12, C42822w c42822w) {
        super(str, bundle, bundle2, z12, (i12 & 32) != 0 ? false : z13, c1761b, (i12 & 64) != 0 ? null : str2, (i12 & 128) != 0 ? false : z14);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
