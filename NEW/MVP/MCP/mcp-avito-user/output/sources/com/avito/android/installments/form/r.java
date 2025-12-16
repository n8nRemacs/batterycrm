package com.avito.android.installments.form;

import android.net.Uri;
import com.avito.android.deep_linking.links.Loader;
import com.avito.android.installments.form.InstallmentsFormActivity;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: InstallmentsFormView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/r;", "Lcom/yatatsu/powerwebview/d;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r implements com.yatatsu.powerwebview.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f172821a;

    public r(p pVar) {
        this.f172821a = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // com.yatatsu.powerwebview.d
    public final boolean b(boolean z12, @Y61.k Uri uri) {
        p pVar = this.f172821a;
        com.avito.android.installments.form.loader.b bVar = pVar.f172814j;
        String host = uri.getHost();
        Loader loader = null;
        if (host != null) {
            Iterator it = bVar.f172704a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Loader loader2 = (Loader) entry.getValue();
                if (C43066x.q(host, str, false)) {
                    loader = loader2;
                    break;
                }
            }
        } else {
            bVar.getClass();
        }
        if (loader != null) {
            pVar.f172816l.a(loader);
        }
        return ((Boolean) ((InstallmentsFormActivity.d) pVar.f172807c).invoke(uri)).booleanValue();
    }
}
