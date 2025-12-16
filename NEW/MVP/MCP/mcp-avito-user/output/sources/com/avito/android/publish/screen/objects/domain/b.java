package com.avito.android.publish.screen.objects.domain;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.screen.objects.domain.usecase.m;
import com.avito.android.publish.screen.objects.domain.usecase.o;
import com.avito.android.publish.screen.objects.domain.usecase.q;
import com.avito.android.publish.screen.objects.domain.usecase.s;
import com.avito.android.publish.screen.objects.domain.usecase.u;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ObjectFillFormInteractorAsync.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/b;", "Lcom/avito/android/publish/screen/objects/domain/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f239953a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.publish.screen.objects.domain.usecase.a f239954b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.publish.screen.objects.domain.usecase.e f239955c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final o f239956d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.publish.screen.objects.domain.usecase.c f239957e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final u f239958f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final s f239959g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final q f239960h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AtomicBoolean f239961i = new AtomicBoolean(false);

    @Inject
    public b(@k m mVar, @k com.avito.android.publish.screen.objects.domain.usecase.a aVar, @k com.avito.android.publish.screen.objects.domain.usecase.e eVar, @k o oVar, @k com.avito.android.publish.screen.objects.domain.usecase.c cVar, @k u uVar, @k s sVar, @k q qVar) {
        this.f239953a = mVar;
        this.f239954b = aVar;
        this.f239955c = eVar;
        this.f239956d = oVar;
        this.f239957e = cVar;
        this.f239958f = uVar;
        this.f239959g = sVar;
        this.f239960h = qVar;
    }

    @Override // com.avito.android.publish.screen.objects.domain.a
    @k
    public final InterfaceC43160i<ObjectFillFormInternalAction> C1() {
        return this.f239954b.a();
    }

    @Override // com.avito.android.publish.screen.objects.domain.a
    @k
    public final Bundle H() {
        return this.f239959g.f240139a.P();
    }

    @Override // com.avito.android.publish.screen.objects.domain.a
    @k
    public final ObjectFillFormInternalAction.SetupObjectView Q0() {
        return new ObjectFillFormInternalAction.SetupObjectView(this.f239958f.f240141a.e());
    }

    @Override // com.avito.android.publish.screen.objects.domain.a
    public final void a() {
        this.f239957e.f240086a.h();
    }

    @Override // com.avito.android.publish.screen.objects.domain.a
    public final void b(@l Bundle bundle) {
        this.f239960h.f240137a.b(bundle);
    }

    @Override // com.avito.android.publish.screen.objects.domain.a
    @k
    public final C43152f0 k1() {
        return this.f239953a.a(this.f239961i);
    }

    @Override // com.avito.android.publish.screen.objects.domain.a
    @k
    public final kotlinx.coroutines.flow.internal.m o1() {
        AtomicBoolean atomicBoolean = this.f239961i;
        com.avito.android.publish.screen.objects.domain.usecase.e eVar = this.f239955c;
        com.avito.android.publish.screen.objects.domain.repository.e eVar2 = eVar.f240089a;
        return C43175k.N(C43175k.G(new com.avito.android.publish.screen.objects.domain.usecase.g(eVar2.d(), null, eVar, atomicBoolean)), new com.avito.android.publish.screen.objects.domain.usecase.f(eVar2.a()), eVar2.g());
    }

    @Override // com.avito.android.publish.screen.objects.domain.a
    public final void q() {
        this.f239956d.f240135a.c();
    }
}
