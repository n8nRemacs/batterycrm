package com.avito.android.deeplink_handler.view.impl;

import android.app.ProgressDialog;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.extended_profile.ExtendedProfileFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CancelableDialogLoadingRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/b;", "Lcom/avito/android/deeplink_handler/view/a$g;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f134597b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileFragment.d f134598c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ProgressDialog f134599d;

    /* compiled from: CancelableDialogLoadingRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/b$a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    public b(@Y61.k ActivityC22955m activityC22955m, @Y61.k ExtendedProfileFragment.d dVar) {
        this.f134597b = activityC22955m;
        this.f134598c = dVar;
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        if (!z12) {
            ProgressDialog progressDialog = this.f134599d;
            if (progressDialog != null) {
                progressDialog.setOnDismissListener(null);
                progressDialog.dismiss();
            }
            this.f134599d = null;
            return;
        }
        ProgressDialog progressDialog2 = this.f134599d;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
        ProgressDialog progressDialogD = new com.avito.android.lib.deprecated_design.dialog.b(this.f134597b).d();
        progressDialogD.setOnDismissListener(new com.avito.android.advert.item.properties.g(8, aVar, this));
        this.f134599d = progressDialogD;
    }
}
