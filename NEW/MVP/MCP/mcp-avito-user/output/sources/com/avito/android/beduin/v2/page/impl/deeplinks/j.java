package com.avito.android.beduin.v2.page.impl.deeplinks;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.BeduinV2PageModalDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import sv.C48421d;

/* compiled from: BeduinV2PageModalDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/deeplinks/j;", "Lev/a;", "Lcom/avito/android/beduin/v2/page/BeduinV2PageModalDeepLink;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends AbstractC40161a<BeduinV2PageModalDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e f105120f;

    /* compiled from: BeduinV2PageModalDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<InterfaceC14249c.b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14249c.b bVar) {
            ((j) this.receiver).j(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k e eVar) {
        this.f105120f = eVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        int iA2 = C48421d.a(this);
        e eVar = this.f105120f;
        eVar.f105106a.J(eVar.f105107b.a((BeduinV2PageModalDeepLink) deepLink), iA2, d.f105105l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f105120f.a(C48421d.a(this), new a(1, this, j.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f105120f.f105109d.dispose();
    }
}
