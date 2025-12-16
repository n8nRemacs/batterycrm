package com.avito.android.credits.web_logger;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.PostMessageAction;
import com.avito.android.deep_linking.links.UxFeedbackActions;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HomeCreditWebAnalyticsEventLogger.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/web_logger/c;", "Lcom/avito/android/credits/web_logger/h;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, Object> f129070b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Map<String, Integer>> f129071c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UxFeedbackActions f129072d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f129073e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Gson f129074f;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@com.avito.android.credits.di.a @k Map<String, ? extends Object> map, @com.avito.android.credits.di.l @k Map<String, ? extends Map<String, Integer>> map2, @l UxFeedbackActions uxFeedbackActions, @k InterfaceC28373a interfaceC28373a, @k Gson gson) {
        this.f129070b = map;
        this.f129071c = map2;
        this.f129072d = uxFeedbackActions;
        this.f129073e = interfaceC28373a;
        this.f129074f = gson;
    }

    @Override // com.avito.android.credits.web_logger.h
    public final void a(@k String str, @l String str2) {
        Map mapC;
        InterfaceC28464o fVar;
        PostMessageAction postMessageAction;
        Object next;
        Map<String, Integer> map = this.f129071c.get(str);
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        if (str2 == null) {
            mapC = P0.c();
        } else {
            try {
                mapC = (Map) this.f129074f.e(str2, new b().getType());
            } catch (Throwable th2) {
                th2.printStackTrace();
                mapC = P0.c();
            }
        }
        dVar.putAll(mapC);
        dVar.putAll(this.f129070b);
        kotlin.collections.builders.d dVarB = dVar.b();
        boolean z12 = false;
        if (map != null) {
            Integer num = map.get("id");
            if (num == null) {
                return;
            }
            int iIntValue = num.intValue();
            Integer num2 = map.get("version");
            fVar = new a(new ParametrizedClickStreamEvent(iIntValue, num2 != null ? num2.intValue() : 0, dVarB, null, 8, null));
        } else {
            UxFeedbackActions uxFeedbackActions = this.f129072d;
            if (uxFeedbackActions != null) {
                List<PostMessageAction> listD = uxFeedbackActions.d();
                if (listD != null) {
                    Iterator<T> it = listD.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (L.f(((PostMessageAction) next).getEventType(), str)) {
                                break;
                            }
                        }
                    }
                    postMessageAction = (PostMessageAction) next;
                } else {
                    postMessageAction = null;
                }
                if (postMessageAction != null) {
                    z12 = true;
                }
            }
            fVar = (str.equals("redirect") || z12) ? null : new Bs.f(str, dVarB);
        }
        if (fVar != null) {
            this.f129073e.c(fVar);
        }
    }
}
