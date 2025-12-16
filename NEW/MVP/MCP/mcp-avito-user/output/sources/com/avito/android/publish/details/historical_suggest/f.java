package com.avito.android.publish.details.historical_suggest;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.S0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import nF.C44245a;

/* compiled from: HistoricalSuggestViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/historical_suggest/f;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C0 f234658d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final S0 f234659e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f234660f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final i f234661g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f234662h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f234663i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final b f234664j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f234665k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C44245a f234666l;

    @Inject
    public f(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k C0 c02, @Y61.k S0 s02, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k i iVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C33771m1 c33771m1, @Y61.k b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C44245a c44245a) {
        super(interfaceC23487e, null);
        this.f234658d = c02;
        this.f234659e = s02;
        this.f234660f = interfaceC33678b;
        this.f234661g = iVar;
        this.f234662h = interfaceC33535v;
        this.f234663i = c33771m1;
        this.f234664j = bVar;
        this.f234665k = interfaceC35745a5;
        this.f234666l = c44245a;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(e.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new e(this.f234658d, this.f234659e, this.f234660f, this.f234661g, this.f234662h, this.f234663i, this.f234664j, this.f234665k, this.f234666l);
    }
}
