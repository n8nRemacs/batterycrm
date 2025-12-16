package com.avito.android.messenger.conversation.mvi.deeplinks.update_folder_tags;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: UpdateFolderTagsLinkDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f190691a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190692b;

    /* renamed from: c, reason: collision with root package name */
    public final f f190693c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f190694d;

    public e(f fVar, f fVar2, dv.b bVar, Provider provider) {
        this.f190691a = fVar;
        this.f190692b = provider;
        this.f190693c = fVar2;
        this.f190694d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC47842z) this.f190691a.get(), this.f190692b.get(), (InterfaceC28373a) this.f190693c.get(), (a.i) this.f190694d.get());
    }
}
