package com.avito.android.user_advert.advert.delegate.short_term_rent;

import OH0.e;
import Y61.k;
import com.avito.android.advert_core.short_term_rent.g;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdvertStrSwitchResponse;
import com.avito.android.user_advert.advert.delegate.short_term_rent.b;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortTermRentPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/short_term_rent/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/short_term_rent/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.short_term_rent.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f308822d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f308823e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.short_term_rent.d f308824f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public Object f308825g = EmptyDisposable.f401988b;

    /* compiled from: ShortTermRentPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/AdvertStrSwitchResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f308827c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f308828d;

        public a(e eVar, boolean z12) {
            this.f308827c = eVar;
            this.f308828d = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            boolean z13 = false;
            boolean z14 = this.f308828d;
            e eVar = this.f308827c;
            c cVar = c.this;
            if (z12) {
                cVar.f395801b.accept(new b.a(e.a(eVar, false, z14)));
                return;
            }
            if (p22 instanceof P2.a) {
                com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar2 = cVar.f395801b;
                e eVarA = e.a(eVar, true, !z14);
                ApiError apiError = ((P2.a) p22).f318719a;
                cVar2.accept(new b.C9478b(eVarA, z.k(apiError), apiError));
                return;
            }
            if (p22 instanceof P2.b) {
                if (((AdvertStrSwitchResponse) ((P2.b) p22).f318720a).getSuccess()) {
                    z13 = z14;
                } else if (!z14) {
                    z13 = true;
                }
                cVar.f395801b.accept(new b.a(e.a(eVar, true, z13)));
            }
        }
    }

    /* compiled from: ShortTermRentPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f308829b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public c(@k g gVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.advert_core.short_term_rent.d dVar) {
        this.f308822d = gVar;
        this.f308823e = interfaceC35745a5;
        this.f308824f = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // com.avito.android.user_advert.advert.delegate.short_term_rent.a
    public final void B1(@k e eVar, boolean z12) {
        this.f308825g.dispose();
        this.f308825g = this.f308822d.a(z12).j0(this.f308823e.e()).v0(new a(eVar, z12), b.f308829b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.user_advert.advert.delegate.short_term_rent.a
    public final void W0(@k OH0.a aVar) {
        this.f308824f.a();
        this.f395801b.accept(new InterfaceC40292b.a(aVar.f12155c.getDeepLink()));
    }

    @Override // com.avito.android.user_advert.advert.delegate.short_term_rent.a
    public final void X1(@k e eVar, @k DeepLink deepLink) {
        this.f395801b.accept(new InterfaceC40292b.a(deepLink));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f308825g.dispose();
        super.dispose();
    }

    @Override // com.avito.android.user_advert.advert.delegate.short_term_rent.a
    public final void z0(@k OH0.b bVar, @k DeepLink deepLink) {
        this.f395801b.accept(new InterfaceC40292b.a(deepLink));
    }
}
