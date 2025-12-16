package com.avito.android.deeplink_handler.app.handler;

import Ic.InterfaceC14058a;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeepLinkContainer;
import ev.AbstractC40161a;
import iR.C41336a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinkContainerHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/t;", "Lcom/avito/android/deep_linking/links/DeepLinkContainer;", "D", "Lev/a;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_handler.app.handler.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C29801t<D extends DeepLinkContainer> extends AbstractC40161a<D> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f134460f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14058a f134461g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.mapping.checker.c f134462h;

    /* compiled from: DeeplinkContainerHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/t$a;", "", "<init>", "()V", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.app.handler.t$a */
    public static abstract class a {

        /* compiled from: DeeplinkContainerHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/t$a$a;", "LJu/c$a;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.app.handler.t$a$a, reason: collision with other inner class name */
        public static final class C4043a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4043a f134463b = new C4043a();
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29801t(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC14058a interfaceC14058a, @Y61.k com.avito.android.deeplink_handler.mapping.checker.c cVar) {
        this.f134460f = aVar;
        this.f134461g = interfaceC14058a;
        this.f134462h = cVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeepLinkContainer deepLinkContainer = (DeepLinkContainer) deepLink;
        C41336a.C11375a.b();
        this.f134461g.a(deepLinkContainer.f133175c);
        List<DeepLink> listK = k(deepLinkContainer);
        a.C4043a c4043a = a.C4043a.f134463b;
        DeepLink[] deepLinkArr = (DeepLink[]) listK.toArray(new DeepLink[0]);
        i(c4043a, this.f134460f, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }

    @Y61.k
    public List<DeepLink> k(@Y61.k DeepLinkContainer deepLinkContainer) {
        ArrayList<DeepLink> arrayList = deepLinkContainer.f133174b;
        ArrayList arrayList2 = new ArrayList();
        for (DeepLink deepLink : arrayList) {
            C42745f0.h(deepLink instanceof DeepLinkContainer ? k((DeepLinkContainer) deepLink) : Collections.singletonList(deepLink), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f134462h.a((DeepLink) next)) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }
}
