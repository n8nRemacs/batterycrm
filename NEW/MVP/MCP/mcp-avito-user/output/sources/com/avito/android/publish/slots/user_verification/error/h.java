package com.avito.android.publish.slots.user_verification.error;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: UserVerificationErrorView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/error/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/user_verification/error/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f245130b;

    public h(@k View view) {
        super(view);
        this.f245130b = (TextView) view;
    }

    @Override // com.avito.android.publish.slots.user_verification.error.g
    public final void setError(@k String str) {
        this.f245130b.setText(str);
    }
}
