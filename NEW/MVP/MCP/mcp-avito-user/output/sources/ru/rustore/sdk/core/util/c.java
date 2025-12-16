package ru.rustore.sdk.core.util;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Metadata;

/* compiled from: ContextExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {
    public static final void a(@Y61.k Context context, @Y61.l ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (Throwable unused) {
        }
    }
}
