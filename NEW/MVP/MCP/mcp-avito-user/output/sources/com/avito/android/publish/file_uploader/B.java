package com.avito.android.publish.file_uploader;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.S0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FileUploaderViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/file_uploader/B;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f235647d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.file_uploader.d f235648e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.cpa_ddu_upload.e f235649f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.file_uploader_redesign.e f235650g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final S0 f235651h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33853a f235652i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final o f235653j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f235654k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235655l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f235656m;

    @Inject
    public B(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.publish.items.file_uploader.d dVar, @Y61.k com.avito.android.publish.slots.cpa_ddu_upload.e eVar, @Y61.k com.avito.android.publish.items.file_uploader_redesign.e eVar2, @Y61.k S0 s02, @Y61.k InterfaceC33853a interfaceC33853a, @Y61.k o oVar, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k R0 r02) {
        super(interfaceC23487e, null);
        this.f235647d = interfaceC33535v;
        this.f235648e = dVar;
        this.f235649f = eVar;
        this.f235650g = eVar2;
        this.f235651h = s02;
        this.f235652i = interfaceC33853a;
        this.f235653j = oVar;
        this.f235654k = interfaceC33678b;
        this.f235655l = interfaceC35745a5;
        this.f235656m = r02;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(t.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new t(this.f235648e, this.f235649f, this.f235650g, this.f235647d, this.f235651h, this.f235654k, this.f235652i, this.f235653j, this.f235655l, this.f235656m);
    }
}
