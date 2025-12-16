package com.avito.android.publish.screen.objects.view;

import Ge0.InterfaceC13872a;
import He0.C13982a;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.publish.details.C33745e;
import com.avito.android.publish.details.C33766l;
import com.avito.android.publish.details.C33781q;
import com.avito.android.publish.details.InterfaceC33684d;
import com.avito.android.publish.details.InterfaceC33748f;
import com.avito.android.publish.details.InterfaceC33763k;
import com.avito.android.publish.details.InterfaceC33769m;
import com.avito.android.publish.details.InterfaceC33778p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ObjectFillFormViewActions.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/l;", "Lcom/avito/android/publish/screen/objects/view/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f240348a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.view.actions.a f240349b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13872a, G0> f240350c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f240351d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33778p f240352e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33748f f240353f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33769m f240354g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33684d f240355h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33763k f240356i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final i f240357j;

    public l(@Y61.k m mVar, @Y61.k View view, @Y61.k View view2, @Y61.k com.avito.android.publish.screen.objects.view.actions.a aVar, @Y61.k Y41.l lVar, boolean z12, @Y61.k Q1 q12) {
        this.f240348a = view2;
        this.f240349b = aVar;
        this.f240350c = lVar;
        this.f240351d = q12;
        Context context = view2.getContext();
        if (q12.B().invoke().booleanValue()) {
            com.avito.android.publish.screen.step.params.view.actions.k kVar = new com.avito.android.publish.screen.step.params.view.actions.k(view, view2);
            com.avito.android.publish.screen.step.params.view.actions.f fVar = new com.avito.android.publish.screen.step.params.view.actions.f(view2, kVar, new j(this));
            com.avito.android.publish.screen.step.params.view.actions.h hVar = new com.avito.android.publish.screen.step.params.view.actions.h(view2, kVar, new C13982a(lVar));
            com.avito.android.publish.screen.step.params.view.actions.c cVar = new com.avito.android.publish.screen.step.params.view.actions.c(view2, kVar);
            this.f240356i = cVar;
            this.f240355h = new com.avito.android.publish.screen.step.params.view.actions.b(view2, cVar, fVar, hVar);
            i iVar = new i(kVar, 0);
            view2.addOnLayoutChangeListener(iVar);
            this.f240357j = iVar;
        } else {
            com.avito.android.publish.details.r rVar = new com.avito.android.publish.details.r(view);
            this.f240355h = new C33745e(new com.avito.android.publish.screen.objects.view.actions.f(view2, rVar, lVar), new com.avito.android.publish.screen.objects.view.actions.l(view2, rVar, lVar));
            this.f240356i = new C33766l(view2, rVar);
        }
        this.f240352e = q12.B().invoke().booleanValue() ? new com.avito.android.publish.screen.step.params.view.overlay.a(view, view2) : new C33781q(view, this.f240355h, this.f240356i);
        aVar.c(mVar, this.f240355h);
        this.f240355h.r(context.getResources().getString(z12 ? R.string.save_changes : R.string.add));
        this.f240355h.f();
    }
}
