package com.avito.android.blueprints.job_multigeo_address;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: MultiGeoResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/job_multigeo_address/r;", "Lcom/avito/android/blueprints/job_multigeo_address/q;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f106036a;

    public r(@Y61.k Resources resources) {
        this.f106036a = resources;
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.q
    @Y61.k
    public final String a() {
        return this.f106036a.getString(R.string.multigeo_bottomsheet_default_title);
    }
}
