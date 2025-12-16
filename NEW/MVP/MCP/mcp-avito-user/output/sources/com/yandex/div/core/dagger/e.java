package com.yandex.div.core.dagger;

import android.content.Context;
import android.renderscript.RenderScript;

/* compiled from: Div2Module_ProvideRenderScriptFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class e implements dagger.internal.h<RenderScript> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f367403a;

    public e(dagger.internal.l lVar) {
        this.f367403a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f367403a.f393949a;
        RenderScript renderScriptCreateMultiContext = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
        dagger.internal.t.d(renderScriptCreateMultiContext);
        return renderScriptCreateMultiContext;
    }
}
