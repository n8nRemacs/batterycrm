package fg0;

import Y61.k;
import com.avito.android.push.PushService;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: PushTokenProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfg0/d;", "", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fg0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40420d {

    /* compiled from: PushTokenProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fg0.d$a */
    public static final class a {
    }

    @k
    I<? extends f> a(@k String str);

    @k
    PushService getType();
}
