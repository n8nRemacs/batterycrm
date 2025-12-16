package com.avito.android.clientEventBus.repository.clientEventBus;

import Do.InterfaceC13423a;
import Y61.k;
import androidx.camera.camera2.internal.G;
import com.avito.android.util.InterfaceC35745a5;
import h31.e;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ClientEventBusRepositoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/clientEventBus/repository/clientEventBus/b;", "Lcom/avito/android/clientEventBus/repository/clientEventBus/a;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.clientEventBus.repository.clientEventBus.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC13423a> f118554a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f118555b;

    /* compiled from: ClientEventBusRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/clientEventBus/repository/clientEventBus/b$a;", "", "<init>", "()V", "", "SUBTYPE_PARAMETER", "Ljava/lang/String;", "TOPICS_PARAMETER", "TYPE_PARAMETER", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k InterfaceC35745a5 interfaceC35745a5, @k e eVar) {
        this.f118554a = eVar;
        this.f118555b = interfaceC35745a5;
    }

    @Override // com.avito.android.clientEventBus.repository.clientEventBus.a
    @k
    public final W a(@k List list) {
        d dVar = new d();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            mx0.e eVar = (mx0.e) obj;
            dVar.put(G.e(i12, "topics[", "][type]"), eVar.f414833a);
            String str = eVar.f414834b;
            if (str != null) {
                dVar.put("topics[" + i12 + "][subType]", str);
            }
            i12 = i13;
        }
        return this.f118554a.get().a(dVar.b()).z(this.f118555b.a());
    }
}
