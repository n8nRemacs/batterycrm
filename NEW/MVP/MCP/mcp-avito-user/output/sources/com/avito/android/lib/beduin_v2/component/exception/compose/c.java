package com.avito.android.lib.beduin_v2.component.exception.compose;

import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.render.compose.k;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;

/* compiled from: ErrorComponentRendererImpl_ErrorComponentRenderer_PerComposeBeduinRenderer_BindingModule_cab9df8d_ProvideErrorComponentRendererFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/exception/compose/c;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/compose/k;", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_component_exception"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements h<k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f175605a = new c();

    @Override // javax.inject.Provider
    public final Object get() {
        b.f175604a.getClass();
        a aVar = a.f175598a;
        t.b(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
