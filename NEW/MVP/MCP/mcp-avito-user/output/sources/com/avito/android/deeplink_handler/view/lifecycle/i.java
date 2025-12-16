package com.avito.android.deeplink_handler.view.lifecycle;

import androidx.fragment.app.C;
import androidx.view.C23038g0;
import com.avito.android.deeplink_handler.view.a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: FragmentResultObserverLifecycleDeeplinkView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/i;", "Lcom/avito/android/deeplink_handler/view/a$f;", "Lcom/avito/android/deeplink_handler/view/a$e;", "Lcom/avito/android/deeplink_handler/view/lifecycle/n;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class i implements a.f, a.e, n<a.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C23038g0<HashMap<String, a>> f134659b = new C23038g0<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<C47919b> f134660c = new io.reactivex.rxjava3.subjects.e<>();

    /* compiled from: FragmentResultObserverLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/i$a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f134661a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C f134662b;

        public a(@Y61.k String str, @Y61.k C c12) {
            this.f134661a = str;
            this.f134662b = c12;
        }
    }

    @Inject
    public i() {
    }

    @Override // com.avito.android.deeplink_handler.view.a.e
    public final void A1(@Y61.k String str, @Y61.k C c12) {
        C23038g0<HashMap<String, a>> c23038g0 = this.f134659b;
        HashMap<String, a> value = c23038g0.getValue();
        if (value == null) {
            value = new HashMap<>();
        }
        value.put(str, new a(str, c12));
        c23038g0.setValue(value);
    }

    @Override // com.avito.android.deeplink_handler.view.a.f
    @Y61.k
    public final W l1(@Y61.k String str) {
        A1(str, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 11));
        io.reactivex.rxjava3.subjects.e<C47919b> eVar = this.f134660c;
        eVar.getClass();
        return new C41981q0(eVar).N(new l(str));
    }
}
