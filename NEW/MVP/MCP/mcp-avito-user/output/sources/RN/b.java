package RN;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.CancellationDialog;
import com.avito.android.deep_linking.links.Loader;
import com.avito.android.deep_linking.links.UxFeedbackActions;
import com.avito.android.installments.form.InstallmentsFormActivity;
import com.avito.android.installments.form.InstallmentsFormScreenParams;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InstallmentsIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRN/b;", "LRN/a;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f14413a;

    @Inject
    public b(@k Context context) {
        this.f14413a = context;
    }

    @Override // RN.a
    @k
    public final Intent a(@l Uri uri, @l String str, @l String str2, @l Map<String, ? extends Object> map, @l Map<String, ? extends Map<String, Integer>> map2, @l Boolean bool, @l Loader loader, @l UxFeedbackActions uxFeedbackActions, @l CancellationDialog cancellationDialog, @l Map<String, Loader> map3) {
        return new Intent(this.f14413a, (Class<?>) InstallmentsFormActivity.class).putExtra("open_params", new InstallmentsFormScreenParams(uri, str, str2, map, map2, bool, loader, uxFeedbackActions, cancellationDialog, map3));
    }
}
