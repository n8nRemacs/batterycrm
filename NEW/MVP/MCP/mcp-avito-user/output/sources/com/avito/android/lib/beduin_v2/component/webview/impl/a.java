package com.avito.android.lib.beduin_v2.component.webview.impl;

import Y41.l;
import Y61.k;
import android.webkit.JavascriptInterface;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43018a;
import kotlin.sequences.C43033p;
import org.json.JSONObject;

/* compiled from: JsBridge.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/impl/a;", "", "", "json", "Lkotlin/G0;", "postMessage", "(Ljava/lang/String;)V", "a", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<Map<String, String>, G0> f175966a;

    /* compiled from: JsBridge.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/impl/a$a;", "", "<init>", "()V", "", "JS_KEY", "Ljava/lang/String;", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.webview.impl.a$a, reason: collision with other inner class name */
    public static final class C5209a {
        public /* synthetic */ C5209a(C42822w c42822w) {
            this();
        }

        public C5209a() {
        }
    }

    static {
        new C5209a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k l<? super Map<String, String>, G0> lVar) {
        this.f175966a = lVar;
    }

    @JavascriptInterface
    public final void postMessage(@k String json) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            JSONObject jSONObject = new JSONObject(json);
            C43018a c43018aB = C43033p.b(jSONObject.keys());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = c43018aB.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(next, jSONObject.getString((String) next));
            }
            ((d) this.f175966a).invoke(linkedHashMap);
            bVar = G0.f406611a;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        Throwable thB = Z.b(bVar);
        if (thB != null) {
            V2.f318762a.c("WebView", "Failed to parse JS message: ".concat(json), thB);
        }
    }
}
