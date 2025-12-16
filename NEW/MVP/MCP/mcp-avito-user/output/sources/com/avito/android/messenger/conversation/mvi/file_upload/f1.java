package com.avito.android.messenger.conversation.mvi.file_upload;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.InterfaceC32303b;
import com.avito.android.messenger.di.C32502t1;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: VideoUploadInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class f1 implements dagger.internal.h<C32104x0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f191149a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f191150b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f191151c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32060b> f191152d;

    /* renamed from: e, reason: collision with root package name */
    public final C30713g1 f191153e;

    /* renamed from: f, reason: collision with root package name */
    public final C32502t1 f191154f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f191155g;

    /* renamed from: h, reason: collision with root package name */
    public final C30102l3 f191156h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.video.f f191157i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.video.n f191158j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC32069f0> f191159k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f191160l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC32303b> f191161m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.messenger.util.m f191162n;

    public f1(Provider provider, Provider provider2, dagger.internal.f fVar, Provider provider3, C30713g1 c30713g1, C32502t1 c32502t1, dagger.internal.f fVar2, C30102l3 c30102l3, com.avito.android.messenger.conversation.mvi.video.f fVar3, com.avito.android.messenger.conversation.mvi.video.n nVar, Provider provider4, Provider provider5, Provider provider6, com.avito.android.messenger.util.m mVar) {
        this.f191149a = provider;
        this.f191150b = provider2;
        this.f191151c = fVar;
        this.f191152d = provider3;
        this.f191153e = c30713g1;
        this.f191154f = c32502t1;
        this.f191155g = fVar2;
        this.f191156h = c30102l3;
        this.f191157i = fVar3;
        this.f191158j = nVar;
        this.f191159k = provider4;
        this.f191160l = provider5;
        this.f191161m = provider6;
        this.f191162n = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC32024m interfaceC32024m = this.f191149a.get();
        com.avito.android.messenger.conversation.mvi.file_attachment.n nVar = this.f191150b.get();
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f191151c.get();
        InterfaceC32060b interfaceC32060b = this.f191152d.get();
        C30277e1 c30277e1 = (C30277e1) this.f191153e.get();
        C31667x c31667x = (C31667x) this.f191154f.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f191155g.get();
        Context context = (Context) this.f191156h.get();
        com.avito.android.messenger.conversation.mvi.video.b bVar = (com.avito.android.messenger.conversation.mvi.video.b) this.f191157i.get();
        com.avito.android.messenger.conversation.mvi.video.m mVar = (com.avito.android.messenger.conversation.mvi.video.m) this.f191158j.get();
        InterfaceC32069f0 interfaceC32069f0 = this.f191159k.get();
        com.avito.android.util.C c12 = this.f191160l.get();
        InterfaceC32303b interfaceC32303b = this.f191161m.get();
        this.f191162n.getClass();
        return new C32104x0(interfaceC32024m, nVar, interfaceC47842z, interfaceC32060b, c30277e1, c31667x, interfaceC28373a, context, bVar, mVar, interfaceC32069f0, c12, interfaceC32303b, new com.avito.android.messenger.util.k());
    }
}
