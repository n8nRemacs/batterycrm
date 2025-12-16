package tN0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: VideoSnippetsExposureInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtN0/c;", "LtN0/b;", "_avito_video-snippets-utils_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f439236a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f439237b = new ArrayList();

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a) {
        this.f439236a = interfaceC28373a;
    }

    @Override // tN0.b
    public final void a(@k List<String> list) {
        ArrayList arrayList = this.f439237b;
        List<String> list2 = list;
        if (arrayList.containsAll(list2) || list2.isEmpty()) {
            return;
        }
        this.f439236a.c(new C48583a(list));
        arrayList.addAll(list2);
    }
}
