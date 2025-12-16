package IE;

import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilterCommons.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIE/a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {
    @k
    public static DeepLink a(@k Intent intent) {
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("result", DeepLink.class) : intent.getParcelableExtra("result");
        if (parcelableExtra != null) {
            return (DeepLink) parcelableExtra;
        }
        throw new IllegalArgumentException((intent + " should contain result field").toString());
    }
}
