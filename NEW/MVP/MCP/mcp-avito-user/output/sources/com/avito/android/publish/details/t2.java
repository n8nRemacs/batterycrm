package com.avito.android.publish.details;

import af0.InterfaceC19882a;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.validation.InterfaceC36030r0;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModelFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/t2;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t2 extends AbstractC22993a {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.seller_protection.c f234986A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.publish.details.auto.a> f234987B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30978i f234988C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f234989D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f234990E;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f234991d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final V0 f234992e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33779p0 f234993f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f234994g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f234995h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f234996i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f234997j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f234998k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19882a f234999l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C33794u1 f235000m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.realty_address_submission.h f235001n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.computer_vision.a f235002o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.item_wrapper.a f235003p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final PublishDetailsFlowTracker f235004q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.widget.tagged_input.l f235005r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final S0 f235006s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.uxfeedback_helper.b f235007t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Q1 f235008u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.e f235009v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.T0 f235010w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f235011x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f235012y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.beduin.custom_actions.a f235013z;

    @Inject
    public t2(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k com.avito.android.publish.C0 c02, @Y61.k V0 v02, @Y61.k InterfaceC33779p0 interfaceC33779p0, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k C33771m1 c33771m1, @Y61.k com.avito.android.photo_cache.j jVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC19882a interfaceC19882a, @Y61.k C33794u1 c33794u1, @Y61.k com.avito.android.publish.realty_address_submission.h hVar, @Y61.k com.avito.android.publish.details.computer_vision.a aVar, @Y61.k com.avito.android.publish.details.item_wrapper.a aVar2, @Y61.k PublishDetailsFlowTracker publishDetailsFlowTracker, @Y61.k com.avito.android.ui.widget.tagged_input.l lVar, @Y61.k S0 s02, @Y61.k com.avito.android.publish.uxfeedback_helper.b bVar, @Y61.k com.avito.android.Q1 q12, @Y61.k com.avito.android.publish.items.e eVar, @Y61.k com.avito.android.publish.T0 t02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.publish.details.beduin.custom_actions.a aVar4, @Y61.k com.avito.android.publish.details.seller_protection.c cVar, @Y61.k h31.e<com.avito.android.publish.details.auto.a> eVar2, @Y61.k InterfaceC30978i interfaceC30978i, @Y61.k @t3.k0 u3.l<SimpleTestGroupWithNone> lVar2, @t3.l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar3) {
        super(interfaceC23487e, null);
        this.f234991d = c02;
        this.f234992e = v02;
        this.f234993f = interfaceC33779p0;
        this.f234994g = interfaceC35745a5;
        this.f234995h = interfaceC36030r0;
        this.f234996i = c33771m1;
        this.f234997j = jVar;
        this.f234998k = interfaceC33535v;
        this.f234999l = interfaceC19882a;
        this.f235000m = c33794u1;
        this.f235001n = hVar;
        this.f235002o = aVar;
        this.f235003p = aVar2;
        this.f235004q = publishDetailsFlowTracker;
        this.f235005r = lVar;
        this.f235006s = s02;
        this.f235007t = bVar;
        this.f235008u = q12;
        this.f235009v = eVar;
        this.f235010w = t02;
        this.f235011x = aVar3;
        this.f235012y = interfaceC40691b;
        this.f235013z = aVar4;
        this.f234986A = cVar;
        this.f234987B = eVar2;
        this.f234988C = interfaceC30978i;
        this.f234989D = lVar2;
        this.f234990E = lVar3;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends androidx.view.M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(K1.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new K1(this.f234991d, this.f234992e, this.f234994g, this.f234996i, this.f234993f, this.f234997j, this.f234995h, this.f234998k, this.f235000m, this.f235001n, this.f235002o, this.f235003p, this.f235004q, this.f235005r, this.f234999l, this.f235006s, this.f235007t, this.f235008u, c23060r0, this.f235009v, this.f235010w, this.f235011x, this.f235012y, this.f235013z, this.f234986A, this.f234987B, this.f234988C, this.f234989D, this.f234990E);
    }
}
