package com.avito.android.advertising.loaders.my_target;

import android.content.Context;
import com.avito.android.remote.model.advertising.MyTargetNetworkBannerItem;
import e11.C39901r0;
import e11.h2;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.internal.operators.observable.C;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import rb.InterfaceC47628b;

/* compiled from: MyTargetBannerLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/k;", "Lcom/avito/android/advertising/loaders/my_target/MyTargetBannerLoader;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements MyTargetBannerLoader {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f88424a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.f f88425b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47628b f88426c;

    @Inject
    public k(@Y61.k Context context, @Y61.k com.avito.android.advertising.loaders.f fVar, @Y61.k InterfaceC47628b interfaceC47628b) {
        this.f88424a = context;
        this.f88425b = fVar;
        this.f88426c = interfaceC47628b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.avito.android.advertising.loaders.my_target.k r1, io.reactivex.rxjava3.core.B r2, java.lang.String r3) {
        /*
            r1.getClass()
            int r1 = r3.hashCode()
            r0 = -1189051956(0xffffffffb92081cc, float:-1.5307142E-4)
            if (r1 == r0) goto L31
            r0 = 3385796(0x33a9c4, float:4.744511E-39)
            if (r1 == r0) goto L20
            r0 = 614801274(0x24a51f7a, float:7.161067E-17)
            if (r1 == r0) goto L17
            goto L39
        L17:
            java.lang.String r1 = "myTarget banner have is null or empty domain asset"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L39
            goto L3f
        L20:
            java.lang.String r1 = "noAd"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L29
            goto L39
        L29:
            com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader$MyTargetBannerLoaderNoAdException r1 = new com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader$MyTargetBannerLoaderNoAdException
            r3 = 0
            r0 = 1
            r1.<init>(r3, r0, r3)
            goto L44
        L31:
            java.lang.String r1 = "MyTarget banner is null"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3f
        L39:
            com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader$MyTargetBannerLoaderException r1 = new com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader$MyTargetBannerLoaderException
            r1.<init>()
            goto L44
        L3f:
            com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader$MyTargetBannerLoaderException r1 = new com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader$MyTargetBannerLoaderException
            r1.<init>()
        L44:
            r2.g(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advertising.loaders.my_target.k.b(com.avito.android.advertising.loaders.my_target.k, io.reactivex.rxjava3.core.B, java.lang.String):void");
    }

    @Override // com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader
    @Y61.k
    public final C a(@Y61.k final MyTargetNetworkBannerItem myTargetNetworkBannerItem) {
        final WeakReference weakReference = new WeakReference(this.f88425b);
        final b bVar = new b();
        return new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.advertising.loaders.my_target.f
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                MyTargetNetworkBannerItem myTargetNetworkBannerItem2 = myTargetNetworkBannerItem;
                int iIntValue = myTargetNetworkBannerItem2.getBlockId().intValue();
                k kVar = this;
                com.my.target.nativeads.d dVar = new com.my.target.nativeads.d(iIntValue, kVar.f88424a);
                WeakReference weakReference2 = new WeakReference(b12);
                WeakReference weakReference3 = new WeakReference(kVar.f88426c);
                Map<String, String> params = myTargetNetworkBannerItem2.getParams();
                C39901r0 c39901r0 = dVar.f395639a;
                if (params != null) {
                    params.forEach(new g(0, new j(2, c39901r0.f394764a, f11.c.class, "setCustomParam", "setCustomParam(Ljava/lang/String;Ljava/lang/String;)V", 0)));
                }
                WeakReference weakReference4 = weakReference;
                b bVar2 = bVar;
                i iVar = new i(weakReference4, bVar2);
                dVar.f365005i = iVar;
                h2 h2Var = dVar.f365002f;
                if (h2Var != null) {
                    h2Var.d(iVar);
                }
                String bannerCode = myTargetNetworkBannerItem2.getBannerCode();
                if (bannerCode == null) {
                    bannerCode = "unknown";
                }
                dVar.f365003g = new h(weakReference2, kVar, weakReference3, bannerCode, String.valueOf(myTargetNetworkBannerItem2.getBlockId().intValue()), bVar2);
                c39901r0.f394771h = 3;
                dVar.b();
            }
        });
    }
}
