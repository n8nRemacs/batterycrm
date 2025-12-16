package com.avito.android.support_bottom_sheet.gig_deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.t1;
import com.avito.android.support_bottom_sheet.GigSupportDialogDeeplink;
import com.avito.android.support_bottom_sheet.ui.SupportDialogFragment;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: GigSupportDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/support_bottom_sheet/gig_deeplink/a;", "Lev/a;", "Lcom/avito/android/support_bottom_sheet/GigSupportDialogDeeplink;", "a", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<GigSupportDialogDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f292435f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ZG.a f292436g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final t1 f292437h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f292438i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.g f292439j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final R0 f292440k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.i f292441l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final C43238h f292442m;

    /* compiled from: GigSupportDialogDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/support_bottom_sheet/gig_deeplink/a$a;", "LJu/c$a;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.support_bottom_sheet.gig_deeplink.a$a, reason: collision with other inner class name */
    public static final class C8872a implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C8872a f292443b = new C8872a();
    }

    @Inject
    public a(@k a.d dVar, @k ZG.a aVar, @k t1 t1Var, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k a.g gVar, @k R0 r02, @k a.i iVar) {
        this.f292435f = dVar;
        this.f292436g = aVar;
        this.f292437h = t1Var;
        this.f292438i = aVar2;
        this.f292439j = gVar;
        this.f292440k = r02;
        this.f292441l = iVar;
        this.f292442m = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) kotlinx.coroutines.t1.b(), r02.a()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        GigSupportDialogDeeplink gigSupportDialogDeeplink = (GigSupportDialogDeeplink) deepLink;
        String str2 = gigSupportDialogDeeplink.f292385b;
        if (str2 == null) {
            this.f292439j.g(null, true);
            C43259k.d(this.f292442m, null, null, new b(this, gigSupportDialogDeeplink, null), 3);
            return;
        }
        SupportDialogFragment.a aVar = SupportDialogFragment.f292497k0;
        String str3 = gigSupportDialogDeeplink.f292389f;
        if (str3 == null) {
            str3 = "";
        }
        aVar.getClass();
        String str4 = gigSupportDialogDeeplink.f292386c;
        String str5 = gigSupportDialogDeeplink.f292387d;
        String str6 = gigSupportDialogDeeplink.f292388e;
        String str7 = gigSupportDialogDeeplink.f292390g;
        this.f292435f.w1(SupportDialogFragment.a.a(str2, gigSupportDialogDeeplink.f292391h, str4, str5, str6, str3, str7), this.f395444b);
        j(AbstractC14250d.c.f9171c);
    }
}
