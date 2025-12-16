package fo0;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.safety.safety_settings.SafetySettingsActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import po0.InterfaceC47119a;

/* compiled from: SafetySettingsIntentFactoryImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfo0/f;", "Lpo0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements InterfaceC47119a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f396082a;

    @Inject
    public f(@k Application application) {
        this.f396082a = application;
    }

    @Override // po0.InterfaceC47119a
    @k
    public final Intent a(@l String str, boolean z12) {
        Intent intent = new Intent(this.f396082a, (Class<?>) SafetySettingsActivity.class);
        intent.putExtra("needed_update_param", z12);
        if (str != null) {
            intent.putExtra("safety_settings_deeplink_source_param", str);
        }
        intent.setFlags(603979776);
        return intent;
    }
}
