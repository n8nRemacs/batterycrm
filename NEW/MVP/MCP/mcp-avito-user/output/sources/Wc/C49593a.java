package wc;

import Y61.k;
import android.os.Bundle;
import com.avito.android.analytics.statsd.InterfaceC28514f;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendStatsdEventsTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwc/a;", "Lcom/avito/android/service/short_task/ShortTask;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C49593a implements ShortTask {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28514f f441669a;

    @Inject
    public C49593a(@k InterfaceC28514f interfaceC28514f) {
        this.f441669a = interfaceC28514f;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @k
    public final I<ShortTask.Status> start(@k Bundle bundle) {
        return this.f441669a.start();
    }
}
