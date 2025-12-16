package com.avito.android.ai_assistant.generated.api.di;

import Pb.c;
import com.avito.android.ai_assistant.generated.api.list.a;
import com.avito.android.ai_assistant.generated.api.open_v_2.OkRespDataSuccessElementsItem2;
import com.avito.android.ai_assistant.generated.api.open_v_2.a;
import com.avito.android.ai_assistant.generated.api.open_v_2.b;
import com.avito.android.ai_assistant.generated.api.open_v_2.c;
import com.avito.android.ai_assistant.generated.api.open_v_2.d;
import com.avito.android.ai_assistant.generated.api.send_v_2.OkRespDataSuccessElementsItem2;
import com.avito.android.ai_assistant.generated.api.send_v_2.a;
import com.avito.android.ai_assistant.generated.api.send_v_2.b;
import com.avito.android.ai_assistant.generated.api.send_v_2.c;
import com.avito.android.ai_assistant.generated.api.send_v_2.d;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: AiAssistantJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes11.dex */
public final class c implements h<Set<r>> {

    /* compiled from: AiAssistantJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f89042a = new c();
    }

    public static c a() {
        return a.f89042a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.ai_assistant.generated.api.di.a.f89040a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, Pb.c.class);
        optimalRuntimeTypeAdapterFactoryA.b(c.b.class, "chats");
        optimalRuntimeTypeAdapterFactoryA.b(c.a.class, "fallbackMessage");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = D8.k(com.avito.android.ai_assistant.generated.api.list.a.class, a.C2634a.class, "chat", a.b.class, "datetime");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK2 = D8.k(OkRespDataSuccessElementsItem2.class, OkRespDataSuccessElementsItem2.a.class, "datetime", OkRespDataSuccessElementsItem2.OkRespDataSuccessElementsItem2Message.class, "message");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK3 = D8.k(com.avito.android.ai_assistant.generated.api.open_v_2.a.class, a.C2635a.class, "actions", a.b.class, BeduinParameter.TYPE);
        optimalRuntimeTypeAdapterFactoryK3.b(a.c.class, "buttons");
        optimalRuntimeTypeAdapterFactoryK3.b(a.d.class, "images");
        optimalRuntimeTypeAdapterFactoryK3.b(a.e.class, "item");
        optimalRuntimeTypeAdapterFactoryK3.b(a.f.class, "items");
        optimalRuntimeTypeAdapterFactoryK3.b(a.g.class, "text");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK4 = D8.k(com.avito.android.ai_assistant.generated.api.open_v_2.b.class, b.a.class, "dislike", b.C2636b.class, "feedback");
        optimalRuntimeTypeAdapterFactoryK4.b(b.c.class, "like");
        optimalRuntimeTypeAdapterFactoryK4.b(b.d.class, "text");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK5 = D8.k(com.avito.android.ai_assistant.generated.api.open_v_2.c.class, c.b.class, "clickstream", c.C2637c.class, "clickstreamDeeplink");
        optimalRuntimeTypeAdapterFactoryK5.b(c.a.class, "message");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(d.class);
        optimalRuntimeTypeAdapterFactory.b(d.a.class, "beduinSnippet");
        optimalRuntimeTypeAdapterFactory.b(d.b.class, "legacy");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK6 = D8.k(com.avito.android.ai_assistant.generated.api.send_v_2.OkRespDataSuccessElementsItem2.class, OkRespDataSuccessElementsItem2.a.class, "datetime", OkRespDataSuccessElementsItem2.OkRespDataSuccessElementsItem2Message.class, "message");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK7 = D8.k(com.avito.android.ai_assistant.generated.api.send_v_2.a.class, a.C2638a.class, "actions", a.b.class, BeduinParameter.TYPE);
        optimalRuntimeTypeAdapterFactoryK7.b(a.c.class, "buttons");
        optimalRuntimeTypeAdapterFactoryK7.b(a.d.class, "images");
        optimalRuntimeTypeAdapterFactoryK7.b(a.e.class, "item");
        optimalRuntimeTypeAdapterFactoryK7.b(a.f.class, "items");
        optimalRuntimeTypeAdapterFactoryK7.b(a.g.class, "text");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory2 = new OptimalRuntimeTypeAdapterFactory(com.avito.android.ai_assistant.generated.api.send_v_2.b.class);
        optimalRuntimeTypeAdapterFactory2.b(b.a.class, "dislike");
        optimalRuntimeTypeAdapterFactory2.b(b.C2639b.class, "feedback");
        optimalRuntimeTypeAdapterFactory2.b(b.c.class, "like");
        optimalRuntimeTypeAdapterFactory2.b(b.d.class, "text");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK8 = D8.k(com.avito.android.ai_assistant.generated.api.send_v_2.c.class, c.b.class, "clickstream", c.C2640c.class, "clickstreamDeeplink");
        optimalRuntimeTypeAdapterFactoryK8.b(c.a.class, "message");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory3 = new OptimalRuntimeTypeAdapterFactory(com.avito.android.ai_assistant.generated.api.send_v_2.d.class);
        optimalRuntimeTypeAdapterFactory3.b(d.a.class, "beduinSnippet");
        optimalRuntimeTypeAdapterFactory3.b(d.b.class, "legacy");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactoryK2, optimalRuntimeTypeAdapterFactoryK3, optimalRuntimeTypeAdapterFactoryK4, optimalRuntimeTypeAdapterFactoryK5, optimalRuntimeTypeAdapterFactory, optimalRuntimeTypeAdapterFactoryK6, optimalRuntimeTypeAdapterFactoryK7, optimalRuntimeTypeAdapterFactory2, optimalRuntimeTypeAdapterFactoryK8, optimalRuntimeTypeAdapterFactory3});
        t.d(setL0);
        return setL0;
    }
}
