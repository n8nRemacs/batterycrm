package com.avito.android.publish.video_upload;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.S0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VideoUploadViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/video_upload/z;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final S0 f245612d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34148c f245613e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f245614f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f245615g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f245616h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245617i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Ff0.b f245618j;

    @Inject
    public z(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k S0 s02, @Y61.k InterfaceC34148c interfaceC34148c, @Y61.k C33771m1 c33771m1, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Ff0.b bVar) {
        super(interfaceC23487e, null);
        this.f245612d = s02;
        this.f245613e = interfaceC34148c;
        this.f245614f = c33771m1;
        this.f245615g = interfaceC33535v;
        this.f245616h = interfaceC33678b;
        this.f245617i = interfaceC35745a5;
        this.f245618j = bVar;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(s.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new s(this.f245612d, this.f245613e, this.f245614f, this.f245615g, this.f245616h, this.f245617i, this.f245618j);
    }
}
