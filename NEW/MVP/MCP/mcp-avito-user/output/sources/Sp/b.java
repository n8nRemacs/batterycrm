package SP;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.job.cv_info_actualization.ui.JsxCvInfoActualizationActivity;
import com.avito.android.job.cv_info_actualization.ui.JsxCvInfoActualizationOpenParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSP/b;", "LSP/a;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f14983a;

    @Inject
    public b(@k Context context) {
        this.f14983a = context;
    }

    @Override // SP.a
    @k
    public final Intent a(@l DeepLink deepLink, @k String str) {
        JsxCvInfoActualizationOpenParams jsxCvInfoActualizationOpenParams = new JsxCvInfoActualizationOpenParams(deepLink, str);
        JsxCvInfoActualizationActivity.f174193w.getClass();
        return new Intent(this.f14983a, (Class<?>) JsxCvInfoActualizationActivity.class).putExtra("open_params", jsxCvInfoActualizationOpenParams);
    }
}
