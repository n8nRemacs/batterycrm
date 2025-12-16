package com.avito.android.publish.details.auto_description;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.V0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36026p;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: AutoDescriptionViewModelDelegateFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/auto_description/h;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final V0 f233534d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final S0 f233535e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f233536f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f233537g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f233538h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36026p f233539i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C50213a f233540j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final R0 f233541k;

    @Inject
    public h(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k V0 v02, @Y61.k S0 s02, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC36026p interfaceC36026p, @Y61.k C50213a c50213a, @Y61.k R0 r02) {
        super(interfaceC23487e, null);
        this.f233534d = v02;
        this.f233535e = s02;
        this.f233536f = interfaceC33535v;
        this.f233537g = interfaceC33678b;
        this.f233538h = interfaceC35745a5;
        this.f233539i = interfaceC36026p;
        this.f233540j = c50213a;
        this.f233541k = r02;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(e.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new e(this.f233534d, this.f233535e, this.f233536f, this.f233537g, this.f233538h, this.f233539i, this.f233540j, this.f233541k);
    }
}
