package com.avito.android.publish.slots.universal_beduin;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.y6;
import j.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalBeduinSlotResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/universal_beduin/b;", "Lcom/avito/android/publish/slots/universal_beduin/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f245042a;

    @Inject
    public b(@Y61.k Resources resources) {
        this.f245042a = resources;
    }

    @Override // com.avito.android.publish.slots.universal_beduin.a
    @r
    public final int a() {
        return y6.e(this.f245042a.getDimensionPixelSize(R.dimen.publish_container_horizontal_padding));
    }
}
