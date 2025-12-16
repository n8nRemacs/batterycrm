package com.avito.android.publish.slots.verification.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: VerificationTitleItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/verification/title/g;", "Lcom/avito/android/publish/slots/verification/title/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f245170b;

    public g(@k View view) {
        super(view);
        this.f245170b = (TextView) view;
    }

    @Override // com.avito.android.publish.slots.verification.title.f
    public final void setTitle(@k String str) {
        this.f245170b.setText(str);
    }
}
