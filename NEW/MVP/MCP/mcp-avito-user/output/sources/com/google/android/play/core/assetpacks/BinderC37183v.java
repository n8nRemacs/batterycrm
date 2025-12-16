package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC37183v extends BinderC37177t {
    @Override // com.google.android.play.core.assetpacks.BinderC37177t, com.google.android.play.core.assetpacks.internal.y
    public final void G0(Bundle bundle, Bundle bundle2) {
        super.G0(bundle, bundle2);
        this.f358499a.d((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
