package fo0;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.auth.PasswordChangeLink;
import com.avito.android.safety.password_change.PasswordChangeActivity;
import com.avito.android.safety.password_change.PasswordChangeParams;
import com.avito.android.safety.password_setting.PasswordSettingActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InternalSafetySettingsIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfo0/b;", "Lfo0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40456b implements InterfaceC40455a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f396080a;

    /* compiled from: InternalSafetySettingsIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fo0.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PasswordChangeLink.Mode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PasswordChangeLink.Mode mode = PasswordChangeLink.Mode.f133926b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public C40456b(@k Application application) {
        this.f396080a = application;
    }

    @Override // fo0.InterfaceC40455a
    @k
    public final Intent a(@k PasswordChangeLink passwordChangeLink) {
        PasswordChangeParams.LogicFlow logicFlow;
        int iOrdinal = passwordChangeLink.f133925g.ordinal();
        if (iOrdinal == 0) {
            logicFlow = PasswordChangeParams.LogicFlow.f257239c;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            logicFlow = PasswordChangeParams.LogicFlow.f257238b;
        }
        PasswordChangeParams passwordChangeParams = new PasswordChangeParams(logicFlow, passwordChangeLink.f133923e, passwordChangeLink.f133920b, passwordChangeLink.f133921c, passwordChangeLink.f133922d, passwordChangeLink.f133924f);
        Intent intent = new Intent(this.f396080a, (Class<?>) PasswordChangeActivity.class);
        intent.putExtra("extra_params", passwordChangeParams);
        return intent;
    }

    @Override // fo0.InterfaceC40455a
    @k
    public final Intent b() {
        return new Intent(this.f396080a, (Class<?>) PasswordSettingActivity.class);
    }
}
