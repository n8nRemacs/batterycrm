package com.avito.android.advertising.adapter.items.buzzoola;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.h;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaDirectConfig;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<h31.e<InterfaceC44739c>> f87312l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BannerInfo f87313m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f87314n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f87315o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaBanner.BuzzoolaDirect f87316p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(WeakReference<h31.e<InterfaceC44739c>> weakReference, BannerInfo bannerInfo, int i12, p pVar, BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect) {
        super(0);
        this.f87312l = weakReference;
        this.f87313m = bannerInfo;
        this.f87314n = i12;
        this.f87315o = pVar;
        this.f87316p = buzzoolaDirect;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC44739c interfaceC44739c;
        h31.e<InterfaceC44739c> eVar = this.f87312l.get();
        if (eVar != null && (interfaceC44739c = eVar.get()) != null) {
            interfaceC44739c.C1(this.f87313m, this.f87314n);
        }
        p pVar = this.f87315o;
        BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect = this.f87316p;
        BuzzoolaDirectConfig buzzoolaDirectConfig = buzzoolaDirect.f88226m;
        pVar.f87371c.d(buzzoolaDirect.f88227n);
        try {
            boolean z12 = C43066x.q(buzzoolaDirectConfig.f88288b, "play.google.com/store/apps", false) || buzzoolaDirect.f88221h.f88280c;
            Uri uri = Uri.parse(buzzoolaDirectConfig.f88288b);
            h.i iVar = new h.i();
            iVar.b(true);
            iVar.f22870e = 1;
            iVar.f22866a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            androidx.browser.customtabs.h hVarA = iVar.a();
            String str = (z12 || !pVar.f87372d.b("com.android.chrome")) ? null : "com.android.chrome";
            Intent intent = hVarA.f22864a;
            intent.setPackage(str);
            Activity activity = pVar.f87373e;
            intent.setData(uri);
            androidx.core.content.d.startActivity(activity, intent, hVarA.f22865b);
        } catch (Throwable unused) {
            pVar.k(buzzoolaDirectConfig.f88288b);
        }
        return G0.f406611a;
    }
}
