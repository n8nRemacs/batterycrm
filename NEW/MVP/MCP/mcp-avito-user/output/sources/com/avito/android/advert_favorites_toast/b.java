package com.avito.android.advert_favorites_toast;

import HV.a;
import LV.c;
import VU.b;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.FavoritesToastAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.serp.adapter.S;
import com.avito.android.util.C35835l0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AdvertFavoritesToastHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_favorites_toast/b;", "Lcom/avito/android/advert_favorites_toast/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert_favorites_toast.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final E f85788a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f85789b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f85790c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43238h f85791d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public N0 f85792e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public e f85793f;

    /* compiled from: AdvertFavoritesToastHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_favorites_toast.AdvertFavoritesToastHandlerImpl$onFavoriteButtonClicked$1", f = "AdvertFavoritesToastHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f85795r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ FavoritesToast f85796s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, FavoritesToast favoritesToast, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f85795r = z12;
            this.f85796s = favoritesToast;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f85795r, this.f85796s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b bVar = b.this;
            e eVar = bVar.f85793f;
            if (eVar != null) {
                com.avito.android.lib.design.toast_bar.k kVar = eVar.f85807d;
                if (kVar != null) {
                    kVar.f();
                }
                eVar.f85807d = null;
            }
            if (!bVar.f85788a.b()) {
                return G0.f406611a;
            }
            if (this.f85795r) {
                return G0.f406611a;
            }
            FavoritesToast favoritesToast = this.f85796s;
            if (favoritesToast == null) {
                return G0.f406611a;
            }
            e eVar2 = bVar.f85793f;
            if (eVar2 != null) {
                com.avito.android.lib.design.toast_bar.k kVar2 = eVar2.f85807d;
                if (kVar2 != null) {
                    kVar2.f();
                }
                eVar2.f85807d = null;
                View view = eVar2.f85804a;
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23);
                kotlin.collections.builders.b bVarT = C42745f0.t();
                UniversalImage image = favoritesToast.getImage();
                if (image != null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(contextThemeWrapper);
                    int i12 = eVar2.f85809f;
                    appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(i12, i12));
                    com.avito.android.image_loader.glide.utils.b.b(appCompatImageView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(image, com.avito.android.lib.util.darkTheme.c.b(contextThemeWrapper))).a(appCompatImageView), 0, eVar2.f85808e);
                    bVarT.add(appCompatImageView);
                }
                kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
                kotlin.collections.builders.b bVarT2 = C42745f0.t();
                FavoritesToastAction action = favoritesToast.getAction();
                if (action != null) {
                    String title = action.getTitle();
                    DeepLink deeplink = action.getDeeplink();
                    if (title != null && title.length() != 0 && deeplink != null) {
                        Button button = new Button(contextThemeWrapper, null, 0, 0, 14, null);
                        b.a aVar = VU.b.f17147t;
                        aVar.getClass();
                        button.setStyle((VU.b) c.a.a(aVar, contextThemeWrapper, R.attr.buttonSecondarySmall));
                        button.setState(new UU.a(title, null, false, false, false, new d(button, eVar2, deeplink), null, null, null, false, 990, null));
                        bVarT2.add(button);
                    }
                }
                kotlin.collections.builders.b bVarP2 = C42745f0.p(bVarT2);
                CharSequence charSequenceC = eVar2.f85806c.c(contextThemeWrapper, favoritesToast.getText());
                if (charSequenceC == null) {
                    charSequenceC = "";
                }
                ToastBarState toastBarState = new ToastBarState(com.avito.android.printable_text.b.e(charSequenceC), null, ToastBarPosition.f181047e, bVarP, bVarP2, null, null, 2750, false, false, null, null, 3938, null);
                a.C0407a c0407a = HV.a.f7100w;
                int iJ2 = C35835l0.j(R.attr.toastBarDefault, contextThemeWrapper);
                c0407a.getClass();
                eVar2.f85807d = IV.a.d(view, toastBarState, a.C0407a.b(iJ2, contextThemeWrapper));
                DeepLink onShow = favoritesToast.getOnShow();
                if (onShow != null) {
                    b.a.a(eVar2.f85805b, onShow, null, null, 6);
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k E e12, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.util.text.a aVar2, @k R0 r02) {
        this.f85788a = e12;
        this.f85789b = aVar;
        this.f85790c = aVar2;
        this.f85791d = U.a(r02.d());
    }

    @Override // com.avito.android.advert_favorites_toast.a
    public final void a() {
        N0 n02 = this.f85792e;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f85792e = null;
        e eVar = this.f85793f;
        if (eVar != null) {
            com.avito.android.lib.design.toast_bar.k kVar = eVar.f85807d;
            if (kVar != null) {
                kVar.f();
            }
            eVar.f85807d = null;
        }
        this.f85793f = null;
    }

    @Override // com.avito.android.advert_favorites_toast.a
    public final void b(@k View view) {
        this.f85793f = new e(view, this.f85789b, this.f85790c);
    }

    @Override // com.avito.android.advert_favorites_toast.a
    public final void c(@k S s5) {
        d(s5.getF268380G(), s5.getF268461s0());
    }

    @Override // com.avito.android.advert_favorites_toast.a
    public final void d(boolean z12, @l FavoritesToast favoritesToast) {
        N0 n02 = this.f85792e;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f85792e = C43259k.d(this.f85791d, null, null, new a(z12, favoritesToast, null), 3);
    }
}
