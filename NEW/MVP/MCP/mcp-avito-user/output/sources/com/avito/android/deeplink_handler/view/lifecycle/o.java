package com.avito.android.deeplink_handler.view.lifecycle;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.architecture_components.D;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoadingRendererLifecycleDeeplinkView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/o;", "Lcom/avito/android/deeplink_handler/view/a$g;", "Lcom/avito/android/deeplink_handler/view/lifecycle/n;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class o implements a.g, n<a.g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D<a> f134667b = new D<>();

    /* compiled from: LoadingRendererLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/o$a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.deeplink_handler.handler.bundle.a f134668a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f134669b;

        public a(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
            this.f134668a = aVar;
            this.f134669b = z12;
        }
    }

    @Inject
    public o() {
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        this.f134667b.setValue(new a(aVar, z12));
    }
}
