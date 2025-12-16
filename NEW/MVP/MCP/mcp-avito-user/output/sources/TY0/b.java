package Ty0;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_cancellation_settings.StrCancellationSettingsActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrCancellationSettingsIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTy0/b;", "LTy0/a;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC15425a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f16032a;

    @Inject
    public b(@k Application application) {
        this.f16032a = application;
    }

    @Override // Ty0.InterfaceC15425a
    @k
    public final Intent a(long j12, @l String str, @l String str2, @l String str3) {
        StrCancellationSettingsActivity.f288110m.getClass();
        Intent intent = new Intent(this.f16032a, (Class<?>) StrCancellationSettingsActivity.class);
        intent.putExtra("item_id_extra", j12);
        intent.putExtra("start_date_extra", str);
        intent.putExtra("end_date_extra", str2);
        intent.putExtra("from_page_label_extra", str3);
        return intent;
    }
}
