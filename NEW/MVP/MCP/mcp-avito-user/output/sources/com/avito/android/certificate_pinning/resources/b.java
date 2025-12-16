package com.avito.android.certificate_pinning.resources;

import Y61.k;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UnsafeNetworkResourceProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/resources/b;", "Lcom/avito/android/certificate_pinning/resources/a;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.certificate_pinning.resources.a
    @k
    public final PrintableText a() {
        return com.avito.android.printable_text.a.a(R.string.unknown_server_error);
    }

    @Override // com.avito.android.certificate_pinning.resources.a
    @k
    public final PrintableText b() {
        return com.avito.android.printable_text.a.a(R.string.network_unavailable_snack);
    }

    @Override // com.avito.android.certificate_pinning.resources.a
    @k
    public final PrintableText c() {
        return com.avito.android.printable_text.a.a(R.string.still_unsafe_network_error);
    }
}
