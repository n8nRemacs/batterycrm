package com.avito.android.remote.parse.adapter.messenger;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ContextActionHandlerTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/ContextActionHandlerTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContextActionHandlerTypeAdapter extends RuntimeTypeAdapter<ContextActionHandler> implements o<ContextActionHandler> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f254275a;

    public ContextActionHandlerTypeAdapter() {
        super(null, null, ContextActionHandler.Unknown.class, 3, null);
        this.f254275a = P0.g(new Q(ContextActionHandler.MethodCall.TYPE, ContextActionHandler.MethodCall.class), new Q("link", ContextActionHandler.Link.class));
    }

    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        ContextActionHandler contextActionHandler = (ContextActionHandler) obj;
        if (contextActionHandler instanceof ContextActionHandler.Link) {
            com.google.gson.k kVar = new com.google.gson.k();
            kVar.t("type", nVar.c("link"));
            com.google.gson.k kVar2 = new com.google.gson.k();
            ContextActionHandler.Link link = (ContextActionHandler.Link) contextActionHandler;
            kVar2.t(ContextActionHandler.Link.URL, nVar.c(link.getLink()));
            kVar2.t(ContextActionHandler.Link.DEEPLINK, nVar.c(link.getDeepLink()));
            G0 g02 = G0.f406611a;
            kVar.t("value", kVar2);
            return kVar;
        }
        if (!(contextActionHandler instanceof ContextActionHandler.MethodCall)) {
            if (contextActionHandler instanceof ContextActionHandler.Unknown) {
                return j.f362193b;
            }
            throw new NoWhenBranchMatchedException();
        }
        com.google.gson.k kVar3 = new com.google.gson.k();
        kVar3.t("type", nVar.c(ContextActionHandler.MethodCall.TYPE));
        com.google.gson.k kVar4 = new com.google.gson.k();
        ContextActionHandler.MethodCall methodCall = (ContextActionHandler.MethodCall) contextActionHandler;
        kVar4.t("method", nVar.c(methodCall.getMethod()));
        RawJson params = methodCall.getParams();
        if (params != null) {
            kVar4.t("params", nVar.c(params));
        }
        ContextActionHandler.MethodCall.Reaction reaction = methodCall.getReaction();
        if (reaction != null) {
            kVar4.t(ContextActionHandler.MethodCall.REACTION, nVar.c(reaction));
        }
        G0 g03 = G0.f406611a;
        kVar3.t("value", kVar4);
        return kVar3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.reflect.Type>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Type> getMapping() {
        return this.f254275a;
    }
}
