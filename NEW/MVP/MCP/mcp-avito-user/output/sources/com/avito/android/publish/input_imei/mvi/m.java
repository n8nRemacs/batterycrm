package com.avito.android.publish.input_imei.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.external_apps.deep_linking.ExternalAppLink;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.di.W;
import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: InputImeiBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/m;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements com.avito.android.arch.mvi.b<InputImeiInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.input_imei.di.m f236430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f236431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final CategoryPublishStep f236432c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.input_imei.h f236433d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f236434e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f236435f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final x f236436g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f236437h;

    @Inject
    public m(@Y61.k com.avito.android.publish.input_imei.di.m mVar, @W int i12, @Y61.l CategoryPublishStep categoryPublishStep, @Y61.k com.avito.android.publish.input_imei.h hVar, @Y61.k Set<TV0.d<?, ?>> set, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f236430a = mVar;
        this.f236431b = i12;
        this.f236432c = categoryPublishStep;
        this.f236433d = hVar;
        this.f236434e = set;
        this.f236435f = interfaceC33535v;
        this.f236436g = xVar;
        this.f236437h = aVar;
    }

    public static final void c(m mVar, ItemWithAdditionalButton itemWithAdditionalButton) {
        mVar.getClass();
        ItemWithAdditionalButton.AdditionalButton f117488m = itemWithAdditionalButton.getF117488m();
        String str = f117488m != null ? f117488m.f173891c : null;
        if (f117488m != null) {
            mVar.f236435f.j(f117488m.f173892d);
        }
        if (str == null) {
            return;
        }
        DeepLink deepLinkB = mVar.f236436g.b(str);
        if (deepLinkB instanceof NoMatchLink) {
            deepLinkB = new ExternalAppLink(Uri.parse(str), null, 2, null);
        }
        b.a.a(mVar.f236437h, deepLinkB, null, null, 6);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InputImeiInternalAction> a() {
        return C43175k.N(C43175k.G(new l(this, null)), C43175k.h(new h(this, null)), C43175k.h(new j(this, null)), new i(y.a(this.f236430a.c(this.f236431b).q())), C43175k.G(new k(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
