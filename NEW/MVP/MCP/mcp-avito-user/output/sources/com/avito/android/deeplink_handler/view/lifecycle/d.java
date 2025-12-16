package com.avito.android.deeplink_handler.view.lifecycle;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47918a;

/* compiled from: ActivityResultObserverLifecycleDeeplinkView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/d;", "Lcom/avito/android/deeplink_handler/view/a$b;", "Lcom/avito/android/deeplink_handler/view/lifecycle/n;", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class d implements a.b, n<a.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D<List<C47918a>> f134653b = new D<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<C47918a> f134654c = new io.reactivex.rxjava3.subjects.e<>();

    @Inject
    public d() {
    }

    @Override // com.avito.android.deeplink_handler.view.a.b
    @Y61.k
    public final C41981q0 Q() {
        io.reactivex.rxjava3.subjects.e<C47918a> eVar = this.f134654c;
        eVar.getClass();
        return new C41981q0(eVar);
    }
}
