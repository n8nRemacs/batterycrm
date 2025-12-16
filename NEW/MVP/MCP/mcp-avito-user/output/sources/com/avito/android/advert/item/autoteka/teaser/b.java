package com.avito.android.advert.item.autoteka.teaser;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.advert.b;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import l41.r;

/* compiled from: AdvertAutotekaPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/b;", "Lcom/avito/android/advert/item/autoteka/teaser/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.autoteka.teaser.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f73008a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public y f73009b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Z0 f73010c;

    /* compiled from: AdvertAutotekaPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f73011b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((ContactBar.Button.Target) obj).f125081i == ContactBar.Button.Target.Type.f125093j;
        }
    }

    /* compiled from: AdvertAutotekaPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.autoteka.teaser.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2194b extends H implements Y41.l<Throwable, G0> {
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertAutotekaPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<ContactBar.Button.Target, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContactBar.Button.Target target) {
            ContactBar.Button.Target target2 = target;
            Z0 z02 = b.this.f73010c;
            if (z02 != null) {
                b.a.a(z02, target2.f125076d, null, 6);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k InterfaceC28265d interfaceC28265d) {
        this.f73008a = interfaceC28265d;
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.a
    public final void a() {
        y yVar = this.f73009b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f73009b = null;
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.a
    public final void b() {
        y yVar = this.f73009b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f73009b = A1.h(this.f73008a.getF83157A().N(a.f73011b), new C2194b(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new c(), 2);
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.a
    public final void c0() {
        this.f73010c = null;
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.a
    public final void j0(@Y61.k Z0 z02) {
        this.f73010c = z02;
    }
}
