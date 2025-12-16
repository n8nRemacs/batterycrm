package com.avito.android.credits.web_handler;

import Y61.k;
import Y61.l;
import android.webkit.JavascriptInterface;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WebAnalyticsHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/credits/web_handler/f;", "", "<init>", "()V", "a", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f129063a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @l
    public y f129064b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.ui.view.d f129065c;

    /* compiled from: WebAnalyticsHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/credits/web_handler/f$a;", "", "", "type", "result", "data", "Lkotlin/G0;", "receiveMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f129066a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f129067b;

        public a(@k ArrayList arrayList, @k String str) {
            this.f129066a = arrayList;
            this.f129067b = str;
        }

        @JavascriptInterface
        public final void receiveMessage(@l String type, @l String result, @l String data) {
            if (type != null) {
                Iterator it = this.f129066a.iterator();
                while (it.hasNext()) {
                    ((com.avito.android.credits.web_logger.h) it.next()).a(type, result);
                }
            }
            V2.f318762a.c(this.f129067b, type + " : " + result + " : " + data, null);
        }
    }

    public void a(@k com.avito.android.ui.view.d dVar) {
        a aVar = new a(this.f129063a, getF129060e());
        this.f129065c = dVar;
        dVar.b(aVar, "AndroidAnalytics");
        y yVar = this.f129064b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f129064b = (y) dVar.f304688b.t0(new g(this));
    }

    public void b() {
        this.f129063a.clear();
        com.avito.android.ui.view.d dVar = this.f129065c;
        if (dVar != null) {
            dVar.e("AndroidAnalytics");
        }
        this.f129065c = null;
        y yVar = this.f129064b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f129064b = null;
    }

    @k
    /* renamed from: c */
    public abstract String getF129062e();

    @k
    /* renamed from: d */
    public abstract String getF129060e();

    public abstract void e(@l String str);
}
