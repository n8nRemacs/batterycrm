package com.avito.android.gallery.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gallery.deeplink.OpenGalleryDeeplink;
import ev.AbstractC40161a;
import gF.InterfaceC40577a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: OpenGalleryDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gallery/deeplink/a;", "Lev/a;", "Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<OpenGalleryDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f159211f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC40577a f159212g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f159213h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f159214i;

    /* compiled from: OpenGalleryDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.gallery.deeplink.a$a, reason: collision with other inner class name */
    public static final class C4654a<T> implements r {
        public C4654a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: OpenGalleryDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "activityResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b c4653b;
            C47918a c47918a = (C47918a) obj;
            if (c47918a.f437155a == 0) {
                c4653b = OpenGalleryDeeplink.b.a.f159209b;
            } else {
                Intent intent = c47918a.f437157c;
                c4653b = new OpenGalleryDeeplink.b.C4653b(intent != null ? intent.getIntExtra("image_position", 0) : 0);
            }
            a.this.j(c4653b);
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC40577a interfaceC40577a, @k a.b bVar) {
        this.f159211f = interfaceC4053a;
        this.f159212g = interfaceC40577a;
        this.f159213h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        OpenGalleryDeeplink openGalleryDeeplink = (OpenGalleryDeeplink) deepLink;
        ArrayList arrayList = openGalleryDeeplink.f159208c;
        this.f159211f.J(this.f159212g.a(openGalleryDeeplink.f159207b, arrayList), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f159214i = (y) this.f159213h.Q().N(new C4654a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f159214i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
