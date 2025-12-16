package com.avito.android.serp.adapter.header;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import java.util.List;
import kotlin.Metadata;

/* compiled from: HeaderView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/header/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HeaderWidget f270143b;

    public g(@k View view) {
        super(view);
        this.f270143b = (HeaderWidget) view.findViewById(R.id.header);
    }

    @Override // com.avito.android.serp.adapter.header.f
    public final void Db(@l String str, @l List<String> list) {
        HeaderWidget headerWidget = this.f270143b;
        headerWidget.a(headerWidget.f270137e, str, list);
    }
}
