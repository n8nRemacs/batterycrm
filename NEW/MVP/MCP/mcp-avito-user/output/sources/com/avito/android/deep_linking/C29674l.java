package com.avito.android.deep_linking;

import Mu.C14528a;
import android.net.Uri;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppLinkPresenter.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/l;", "Lcom/avito/android/deep_linking/k;", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: com.avito.android.deep_linking.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29674l implements InterfaceC29673k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29669g f132916a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f132917b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C29667e f132918c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f132919d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public InterfaceC29693p f132920e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public r f132921f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f132922g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f132923h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f132924i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Uri f132925j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Uri f132926k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f132927l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f132928m;

    /* compiled from: AppLinkPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deep_linking.l$a */
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29693p f132929b;

        public a(InterfaceC29693p interfaceC29693p) {
            this.f132929b = interfaceC29693p;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f132929b.close();
        }
    }

    /* compiled from: AppLinkPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMu/a;", "appLink", "Lkotlin/G0;", "accept", "(LMu/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deep_linking.l$b */
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f132931c;

        public b(Uri uri) {
            this.f132931c = uri;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C14528a c14528a = (C14528a) obj;
            C29674l c29674l = C29674l.this;
            InterfaceC29693p interfaceC29693p = c29674l.f132920e;
            if (interfaceC29693p == null) {
                return;
            }
            c29674l.f132918c.a(c14528a.getDeepLink(), this.f132931c, interfaceC29693p);
            c29674l.f132928m = true;
        }
    }

    @Inject
    public C29674l(@Y61.k InterfaceC29669g interfaceC29669g, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C29667e c29667e, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f132916a = interfaceC29669g;
        this.f132917b = interfaceC35745a5;
        this.f132918c = c29667e;
        this.f132919d = aVar;
    }

    @Override // com.avito.android.deep_linking.InterfaceC29673k
    public final void a(@Y61.k InterfaceC29693p interfaceC29693p) {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f132924i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f132924i = (io.reactivex.rxjava3.internal.observers.y) this.f132919d.d9().t0(new a(interfaceC29693p));
        if (this.f132927l) {
            Uri uri = this.f132925j;
            if (uri == null) {
                interfaceC29693p.close();
            } else {
                this.f132920e = interfaceC29693p;
                d(uri, this.f132926k);
            }
        }
    }

    @Override // com.avito.android.deep_linking.InterfaceC29673k
    public final void b(@Y61.k r rVar) {
        Uri uri = this.f132925j;
        if (uri == null) {
            return;
        }
        this.f132921f = rVar;
        io.reactivex.rxjava3.internal.observers.y yVar = this.f132923h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f132923h = (io.reactivex.rxjava3.internal.observers.y) rVar.f134032a.e().j0(this.f132917b.e()).t0(new C29690m(this, uri));
    }

    @Override // com.avito.android.deep_linking.InterfaceC29673k
    public final void c(@Y61.l Uri uri, @Y61.l Uri uri2) {
        this.f132925j = uri;
        this.f132926k = uri2;
        this.f132927l = true;
    }

    @Override // com.avito.android.deep_linking.InterfaceC29673k
    public final void c0() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f132922g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f132922g = null;
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f132924i;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f132924i = null;
        this.f132920e = null;
    }

    public final void d(Uri uri, Uri uri2) {
        if (this.f132928m) {
            return;
        }
        r rVar = this.f132921f;
        if (rVar != null) {
            rVar.f134032a.k(null);
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f132922g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f132922g = (io.reactivex.rxjava3.internal.observers.y) this.f132916a.a(uri.toString(), String.valueOf(uri2)).j0(this.f132917b.e()).v0(new b(uri), new l41.g() { // from class: com.avito.android.deep_linking.l.c
            @Override // l41.g
            public final void accept(Object obj) {
                Throwable th2 = (Throwable) obj;
                C29674l c29674l = C29674l.this;
                c29674l.getClass();
                if (!(th2 instanceof ApiException)) {
                    r rVar2 = c29674l.f132921f;
                    if (rVar2 != null) {
                        rVar2.f134032a.a("");
                        return;
                    }
                    return;
                }
                r rVar3 = c29674l.f132921f;
                if (rVar3 != null) {
                    rVar3.f134032a.a(((ApiException) th2).getMessage());
                }
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.deep_linking.InterfaceC29673k
    public final void e0() {
        this.f132921f = null;
        io.reactivex.rxjava3.internal.observers.y yVar = this.f132923h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f132923h = null;
    }
}
