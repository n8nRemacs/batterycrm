package com.avito.android.publish.start_publish;

import Zd0.InterfaceC19545c;
import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.Q1;
import com.avito.android.publish.analytics.C33536w;
import hz.InterfaceC41196a;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: StartPublishViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/L;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class L extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final t f245269d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C50213a f245270e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19545c f245271f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f245272g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.plugin.rx.a f245273h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C33536w f245274i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f245275j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Q1 f245276k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f245277l;

    @Inject
    public L(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k t tVar, @Y61.k C50213a c50213a, @Y61.k InterfaceC19545c interfaceC19545c, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.account.plugin.rx.a aVar2, @Y61.k C33536w c33536w, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k Q1 q12, @Y61.l String str) {
        super(interfaceC23487e, null);
        this.f245269d = tVar;
        this.f245270e = c50213a;
        this.f245271f = interfaceC19545c;
        this.f245272g = aVar;
        this.f245273h = aVar2;
        this.f245274i = c33536w;
        this.f245275j = interfaceC41196a;
        this.f245276k = q12;
        this.f245277l = str;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(StartPublishViewModel.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new StartPublishViewModel(this.f245269d, this.f245270e, this.f245271f, this.f245274i, this.f245272g, this.f245273h, c23060r0, this.f245275j, this.f245276k, this.f245277l);
    }
}
