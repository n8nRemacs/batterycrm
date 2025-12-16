package com.avito.android.publish.infomodel_request;

import Zd0.InterfaceC19543a;
import Zd0.InterfaceC19545c;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33685d0;
import com.avito.android.publish.di.S;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: InfomodelRequestViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/infomodel_request/p;", "Lcom/avito/android/publish/infomodel_request/o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PublishParametersInteractor f236175a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33685d0 f236176b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f236177c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f236178d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f236179e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19543a f236180f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C50213a f236181g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19545c f236182h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Z f236183i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C0 f236184j;

    @Inject
    public p(@Y61.k InterfaceC19543a interfaceC19543a, @Y61.k InterfaceC19545c interfaceC19545c, @Y61.k Z z12, @Y61.k PublishParametersInteractor publishParametersInteractor, @Y61.k C0 c02, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC33685d0 interfaceC33685d0, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k @S.a Gson gson, @Y61.k C50213a c50213a) {
        this.f236175a = publishParametersInteractor;
        this.f236176b = interfaceC33685d0;
        this.f236177c = gson;
        this.f236178d = interfaceC35745a5;
        this.f236179e = interfaceC33535v;
        this.f236180f = interfaceC19543a;
        this.f236181g = c50213a;
        this.f236182h = interfaceC19545c;
        this.f236183i = z12;
        this.f236184j = c02;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(f.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        InterfaceC19545c interfaceC19545c = this.f236182h;
        InterfaceC33535v interfaceC33535v = this.f236179e;
        InterfaceC19543a interfaceC19543a = this.f236180f;
        PublishParametersInteractor publishParametersInteractor = this.f236175a;
        InterfaceC33685d0 interfaceC33685d0 = this.f236176b;
        Gson gson = this.f236177c;
        return cls.cast(new f(interfaceC19543a, interfaceC19545c, this.f236183i, publishParametersInteractor, this.f236184j, interfaceC33535v, interfaceC33685d0, this.f236178d, gson, this.f236181g));
    }
}
