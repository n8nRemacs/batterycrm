package com.avito.android.deeplink_handler.handler.registry.lifecycle;

import Y61.k;
import androidx.view.C23485c;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.deeplink_handler.handler.registry.e;
import kotlin.Metadata;

/* compiled from: DeeplinkHandlerScreenRecreateCaller.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/registry/lifecycle/a;", "Landroidx/savedstate/c$a;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements C23485c.a {

    /* compiled from: DeeplinkHandlerScreenRecreateCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/registry/lifecycle/a$a;", "Landroidx/lifecycle/P0$c;", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.handler.registry.lifecycle.a$a, reason: collision with other inner class name */
    public static final class C4050a implements P0.c {
        @Override // androidx.lifecycle.P0.c
        @k
        public final <T extends M0> T create(@k Class<T> cls) throws InstantiationException {
            throw new InstantiationException("Creation of view model " + cls + " is prohibited.");
        }
    }

    @Override // androidx.view.C23485c.a
    public final void a(@k InterfaceC23487e interfaceC23487e) {
        com.avito.android.deeplink_handler.handler.registry.a aVar = null;
        T0 t02 = interfaceC23487e instanceof T0 ? (T0) interfaceC23487e : null;
        if (t02 != null) {
            try {
                aVar = (com.avito.android.deeplink_handler.handler.registry.a) new P0(t02.getF42820b(), new C4050a(), null, 4, null).a(e.class);
            } catch (InstantiationException unused) {
            }
            if (aVar != null) {
                aVar.nc();
            }
            interfaceC23487e.getSavedStateRegistry().d(a.class);
            return;
        }
        throw new IllegalStateException(("Cannot access ViewModelStore and obtain DeeplinkHandlerRegistry from " + interfaceC23487e + ". Please, make sure that " + interfaceC23487e + " is also a ViewModelStoreOwner.").toString());
    }
}
