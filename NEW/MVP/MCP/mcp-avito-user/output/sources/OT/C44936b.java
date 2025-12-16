package ot;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.cv_actualization.view.JsxCvActualizationActivity;
import com.avito.android.cv_actualization.view.JsxCvActualizationOpenParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lot/b;", "Lot/a;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ot.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44936b implements InterfaceC44935a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f422323a;

    @Inject
    public C44936b(@k Application application) {
        this.f422323a = application;
    }

    @Override // ot.InterfaceC44935a
    @k
    public final Intent a(boolean z12, boolean z13) {
        JsxCvActualizationOpenParams jsxCvActualizationOpenParams = new JsxCvActualizationOpenParams(z12, z13);
        JsxCvActualizationActivity.f131105n.getClass();
        return new Intent(this.f422323a, (Class<?>) JsxCvActualizationActivity.class).putExtra("open_params", jsxCvActualizationOpenParams);
    }
}
