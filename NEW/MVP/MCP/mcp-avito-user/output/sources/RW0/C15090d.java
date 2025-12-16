package Rw0;

import android.view.View;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.snippet.video.m;
import com.avito.android.util.R0;
import com.avito.android.video_snippets.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SnippetVideoControllerModule_ProvidesSnippetVideoControllerFactory.java */
@e
@y
@x
/* renamed from: Rw0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15090d implements h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final C15089c f14745a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f14746b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<g> f14747c;

    /* renamed from: d, reason: collision with root package name */
    public final l f14748d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.player_holder.a> f14749e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f14750f;

    public C15090d(C15089c c15089c, Provider provider, Provider provider2, l lVar, Provider provider3, Provider provider4) {
        this.f14745a = c15089c;
        this.f14746b = provider;
        this.f14747c = provider2;
        this.f14748d = lVar;
        this.f14749e = provider3;
        this.f14750f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f14746b.get();
        g gVar = this.f14747c.get();
        View view = (View) this.f14748d.f393949a;
        com.avito.android.player_holder.a aVar = this.f14749e.get();
        InterfaceC28373a interfaceC28373a = this.f14750f.get();
        this.f14745a.getClass();
        return new m(r02, gVar, view, aVar, interfaceC28373a);
    }
}
