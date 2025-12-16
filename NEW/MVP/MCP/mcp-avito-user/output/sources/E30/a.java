package E30;

import Y61.k;
import com.avito.android.notification_center.list.j;
import com.avito.android.preloading.coroutines.C;
import com.avito.android.remote.model.notification.NotificationsResponse;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NotificationsCenterListPreloadable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LE30/a;", "Lcom/avito/android/preloading/coroutines/C;", "Lkotlin/G0;", "Lcom/avito/android/remote/model/notification/NotificationsResponse;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends C<G0, NotificationsResponse> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f3716a;

    @Inject
    public a(@k j jVar) {
        this.f3716a = jVar;
    }

    @Override // com.avito.android.preloading.coroutines.C
    public final Object b(G0 g02, Continuation<? super NotificationsResponse> continuation) {
        return this.f3716a.b((ContinuationImpl) continuation);
    }
}
