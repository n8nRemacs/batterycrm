package com.avito.android.iac_calls_history.impl_module.screen;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CallsHistoryScreenResourcesProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/i;", "Lcom/avito/android/iac_calls_history/impl_module/screen/h;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f164784a;

    public i(@Y61.k Resources resources) {
        this.f164784a = resources;
    }

    @Override // com.avito.android.iac_calls_history.impl_module.screen.h
    @Y61.k
    public final String a() {
        return this.f164784a.getString(R.string.iac_calls_history_loading_error);
    }
}
