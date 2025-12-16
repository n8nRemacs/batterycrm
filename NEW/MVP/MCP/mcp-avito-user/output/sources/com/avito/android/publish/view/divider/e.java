package com.avito.android.publish.view.divider;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DividerWithTextItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/view/divider/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/view/divider/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f245642b;

    public e(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.divider_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245642b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.publish.view.divider.d
    public final void U0(int i12) {
        TextView textView = this.f245642b;
        textView.setText(textView.getContext().getString(R.string.imei_divider_text));
    }
}
