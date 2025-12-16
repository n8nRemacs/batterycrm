package Zd;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.AbstractApplicationC34428s;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35960v2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InternalAuthParams.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_authorization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n {
    @Y61.l
    public static final Intent a(@Y61.k Intent intent, @Y61.l InterfaceC28373a interfaceC28373a) {
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        if (intent2 == null) {
            return null;
        }
        AbstractApplicationC34428s.f256016b.getClass();
        AbstractApplicationC34428s abstractApplicationC34428s = AbstractApplicationC34428s.f256017c;
        C35960v2.a(intent2, abstractApplicationC34428s != null ? abstractApplicationC34428s : null, interfaceC28373a);
        return intent2;
    }

    @Y61.k
    public static final Intent b(@Y61.k ActivityC22955m activityC22955m, @Y61.l InterfaceC28373a interfaceC28373a) {
        Intent intentA = a(activityC22955m.getIntent(), interfaceC28373a);
        if (intentA != null) {
            return intentA;
        }
        throw new IllegalStateException("intent must be specified");
    }
}
