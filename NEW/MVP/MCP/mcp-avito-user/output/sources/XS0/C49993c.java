package xs0;

import Y61.k;
import android.os.Bundle;
import com.avito.android.analytics.clickstream.h0;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendClickStreamEventsTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxs0/c;", "Lcom/avito/android/service/short_task/ShortTask;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xs0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C49993c implements ShortTask {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h0 f442684a;

    @Inject
    public C49993c(@k h0 h0Var) {
        this.f442684a = h0Var;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @k
    public final I<ShortTask.Status> start(@k Bundle bundle) {
        return this.f442684a.start();
    }
}
