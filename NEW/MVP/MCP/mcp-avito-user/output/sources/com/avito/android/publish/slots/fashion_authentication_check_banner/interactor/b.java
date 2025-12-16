package com.avito.android.publish.slots.fashion_authentication_check_banner.interactor;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.FashionAuthenticationBannerResponse;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import io.reactivex.rxjava3.internal.operators.single.M;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.o;
import lf0.C43764a;

/* compiled from: FashionAuthenticationBannerInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/fashion_authentication_check_banner/interactor/b;", "Lcom/avito/android/publish/slots/fashion_authentication_check_banner/interactor/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.slots.fashion_authentication_check_banner.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f243868a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public C43764a f243869b;

    /* compiled from: FashionAuthenticationBannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/FashionAuthenticationBannerResponse;", "response", "Llf0/a;", "apply", "(Lcom/avito/android/remote/model/FashionAuthenticationBannerResponse;)Llf0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f243870b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            FashionAuthenticationBannerResponse fashionAuthenticationBannerResponse = (FashionAuthenticationBannerResponse) obj;
            String title = fashionAuthenticationBannerResponse.getTitle();
            if (title == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AttributedText text = fashionAuthenticationBannerResponse.getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String style = fashionAuthenticationBannerResponse.getStyle();
            if (style != null) {
                return new C43764a(title, text, style);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* compiled from: FashionAuthenticationBannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llf0/a;", "bannerConfig", "Lkotlin/G0;", "accept", "(Llf0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.fashion_authentication_check_banner.interactor.b$b, reason: collision with other inner class name */
    public static final class C7307b<T> implements g {
        public C7307b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.f243869b = (C43764a) obj;
        }
    }

    @Inject
    public b(@k H0 h02) {
        this.f243868a = h02;
    }

    @Override // com.avito.android.publish.slots.fashion_authentication_check_banner.interactor.a
    @k
    public final I<C43764a> a(@k String str) {
        C42022u c42022uK = this.f243868a.h(str).r(a.f243870b).k(new C7307b());
        C43764a c43764a = this.f243869b;
        M mQ2 = c43764a != null ? I.q(c43764a) : null;
        return mQ2 == null ? c42022uK : mQ2;
    }
}
