package com.avito.android.conveyor_shared_item.single_text;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: SingleTextView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/conveyor_shared_item/single_text/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/conveyor_shared_item/single_text/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f126164b;

    public f(@k View view, @k TextView textView) {
        super(view);
        this.f126164b = textView;
    }

    @Override // com.avito.android.conveyor_shared_item.single_text.e
    public final void b(@l String str) {
        I5.a(this.f126164b, str, false);
    }
}
