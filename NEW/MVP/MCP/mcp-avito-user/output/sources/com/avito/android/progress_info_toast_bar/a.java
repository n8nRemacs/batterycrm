package com.avito.android.progress_info_toast_bar;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.squareup.anvil.annotations.ContributesBinding;
import dd0.InterfaceC39708a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProgressInfoToastBarFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/a;", "Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBar$a;", "<init>", "()V", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements ProgressInfoToastBar.a {
    @Inject
    public a() {
    }

    @Override // com.avito.android.progress_info_toast_bar.ProgressInfoToastBar.a
    @k
    public final d a(@k Context context, @k ProgressInfoToastBarData progressInfoToastBarData, @l InterfaceC39708a interfaceC39708a) {
        return new d(context, progressInfoToastBarData, interfaceC39708a);
    }
}
