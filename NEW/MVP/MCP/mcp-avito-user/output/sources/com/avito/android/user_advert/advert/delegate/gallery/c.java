package com.avito.android.user_advert.advert.delegate.gallery;

import Y61.k;
import com.avito.android.user_advert.advert.delegate.gallery.b;
import com.avito.android.util.InterfaceC35745a5;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.g;

/* compiled from: MyAdvertGalleryPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/gallery/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/gallery/a;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.gallery.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f308592f = 0;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f308593d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public Object f308594e = EmptyDisposable.f401988b;

    /* compiled from: MyAdvertGalleryPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/gallery/c$a;", "", "<init>", "()V", "", "GALLERY_PAGE_CHANGE_DELAY_MILLIS", "J", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MyAdvertGalleryPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_advert.advert.items.gallery.c f308596c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f308597d;

        public b(com.avito.android.user_advert.advert.items.gallery.c cVar, int i12) {
            this.f308596c = cVar;
            this.f308597d = i12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            int i12 = c.f308592f;
            com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar = c.this.f395801b;
            com.avito.android.user_advert.advert.items.gallery.c cVar2 = this.f308596c;
            cVar.accept(new b.C9466b(new com.avito.android.user_advert.advert.items.gallery.c(cVar2.f309410b, cVar2.f309411c, this.f308597d, cVar2.f309413e, cVar2.f309414f, cVar2.f309415g, cVar2.f309416h)));
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@k InterfaceC35745a5 interfaceC35745a5) {
        this.f308593d = interfaceC35745a5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // com.avito.android.user_advert.advert.delegate.gallery.a
    public final void U0(@k com.avito.android.user_advert.advert.items.gallery.c cVar, int i12) {
        if (cVar.f309412d == i12) {
            return;
        }
        this.f308594e.dispose();
        this.f308594e = I.C(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).s(this.f308593d.e()).x(new b(cVar, i12), io.reactivex.rxjava3.internal.functions.a.f401996f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        super.dispose();
        this.f308594e.dispose();
    }

    @Override // com.avito.android.user_advert.advert.delegate.gallery.a
    public final void x0(@k com.avito.android.user_advert.advert.items.gallery.c cVar, int i12) {
        this.f395801b.accept(new b.a(cVar, i12));
    }
}
