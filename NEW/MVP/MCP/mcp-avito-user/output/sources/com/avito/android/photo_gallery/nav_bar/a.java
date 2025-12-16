package com.avito.android.photo_gallery.nav_bar;

import LV.c;
import Y41.p;
import Zd.InterfaceC19542a;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.comparison.remote.model.FromPage;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.lib.design.nav_bar.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.q;
import com.avito.android.lib.util.z;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarAuthData;
import com.avito.android.toggle_comparison_state.s;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.O2;
import com.avito.android.util.R0;
import com.avito.android.util.V0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.reactive.A;

/* compiled from: PhotoGalleryNavBarDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/a;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Activity f217522a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f217523b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f217524c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f217525d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19542a f217526e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.toggle_comparison_state.l f217527f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f217528g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R0 f217529h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f217530i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C29640d f217531j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f217532k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Resources f217533l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final T f217534m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.sharing.a f217535n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.e f217536o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public NavBar f217537p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public View f217538q;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public androidx.appcompat.view.d f217541t;

    /* renamed from: x, reason: collision with root package name */
    public final int f217545x;

    /* renamed from: y, reason: collision with root package name */
    public final int f217546y;

    /* renamed from: z, reason: collision with root package name */
    public final int f217547z;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public PhotoGalleryNavBarState f217539r = new PhotoGalleryNavBarState(null, null, false, false, null, null, 0, 127, null);

    /* renamed from: s, reason: collision with root package name */
    public final int f217540s = R.color.re_23_constant_gray_12;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f217542u = C42727D.c(new c());

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public ArrayList f217543v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public com.avito.android.lib.design.nav_bar.a f217544w = new com.avito.android.lib.design.nav_bar.a(null, null, false, null, null, null, null, 127, null);

    /* compiled from: PhotoGalleryNavBarDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_gallery.nav_bar.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6525a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217548a;

        static {
            int[] iArr = new int[PhotoGalleryNavBarActionType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhotoGalleryNavBarActionType photoGalleryNavBarActionType = PhotoGalleryNavBarActionType.f217475b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PhotoGalleryNavBarActionType photoGalleryNavBarActionType2 = PhotoGalleryNavBarActionType.f217475b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PhotoGalleryNavBarActionType photoGalleryNavBarActionType3 = PhotoGalleryNavBarActionType.f217475b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[PhotoGalleryNavBarMenuItemType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType = PhotoGalleryNavBarMenuItemType.f217499b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType2 = PhotoGalleryNavBarMenuItemType.f217499b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType3 = PhotoGalleryNavBarMenuItemType.f217499b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType4 = PhotoGalleryNavBarMenuItemType.f217499b;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f217548a = iArr2;
        }
    }

    /* compiled from: PhotoGalleryNavBarDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.toggle_comparison_state.a f217550m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.toggle_comparison_state.a aVar) {
            super(0);
            this.f217550m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.a.a(a.this.f217528g, this.f217550m.f301570c, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoGalleryNavBarDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/util/f5;", "invoke", "()Lcom/avito/android/util/f5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<C35792f5> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C35792f5 invoke() {
            return new C35792f5(a.this.f217539r.f217517g);
        }
    }

    /* compiled from: PhotoGalleryNavBarDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/s;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/toggle_comparison_state/s;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarDelegate$toggleComparisonStateAndHandleResult$1", f = "PhotoGalleryNavBarDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<s, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f217552q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = a.this.new d(continuation);
            dVar.f217552q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(s sVar, Continuation<? super G0> continuation) {
            return ((d) create(sVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Resources.NotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            s sVar = (s) this.f217552q;
            a aVar = a.this;
            aVar.getClass();
            if (sVar instanceof s.a) {
                aVar.f217539r = PhotoGalleryNavBarState.a(aVar.f217539r, null, null, false, true, null, null, 0L, 119);
                aVar.b(((s.a) sVar).f301632a.f301622a);
                ArrayList arrayList = aVar.f217543v;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k kVarA = (k) it.next();
                    if (kVarA.f217565b == PhotoGalleryNavBarMenuItemType.f217501d) {
                        androidx.appcompat.view.d dVar = aVar.f217541t;
                        kVarA = k.a(kVarA, dVar != null ? C35835l0.h(R.attr.ic_compare24, dVar) : null, null, 59);
                    }
                    arrayList2.add(kVarA);
                }
                aVar.f217543v = new ArrayList(arrayList2);
                PhotoGalleryNavBarState photoGalleryNavBarState = aVar.f217539r;
                List<PhotoGalleryNavBarDropdownMenuItem> list = photoGalleryNavBarState.f217513c;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                for (PhotoGalleryNavBarDropdownMenuItem photoGalleryNavBarDropdownMenuItem : list) {
                    if (photoGalleryNavBarDropdownMenuItem.f217489b == PhotoGalleryNavBarMenuItemType.f217501d) {
                        photoGalleryNavBarDropdownMenuItem = new PhotoGalleryNavBarDropdownMenuItem(photoGalleryNavBarDropdownMenuItem.f217489b, Integer.valueOf(R.attr.textIconAddedToTheComparison), com.avito.android.printable_text.b.c(R.string.photo_gallery_added_to_compare, new Serializable[0]), photoGalleryNavBarDropdownMenuItem.f217492e);
                    }
                    arrayList3.add(photoGalleryNavBarDropdownMenuItem);
                }
                aVar.f217539r = PhotoGalleryNavBarState.a(photoGalleryNavBarState, null, arrayList3, false, false, null, null, 0L, 125);
                aVar.d();
            } else if (sVar instanceof s.b) {
                aVar.b(((s.b) sVar).f301634a.f301622a);
            } else if (sVar instanceof s.d) {
                aVar.f217539r = PhotoGalleryNavBarState.a(aVar.f217539r, null, null, false, false, null, null, 0L, 119);
                aVar.b(((s.d) sVar).f301639a);
                ArrayList arrayList4 = aVar.f217543v;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    k kVarA2 = (k) it2.next();
                    if (kVarA2.f217565b == PhotoGalleryNavBarMenuItemType.f217501d) {
                        androidx.appcompat.view.d dVar2 = aVar.f217541t;
                        kVarA2 = k.a(kVarA2, dVar2 != null ? C35835l0.h(R.attr.ic_addCompare24, dVar2) : null, null, 59);
                    }
                    arrayList5.add(kVarA2);
                }
                aVar.f217543v = new ArrayList(arrayList5);
                PhotoGalleryNavBarState photoGalleryNavBarState2 = aVar.f217539r;
                List<PhotoGalleryNavBarDropdownMenuItem> list2 = photoGalleryNavBarState2.f217513c;
                ArrayList arrayList6 = new ArrayList(C42745f0.q(list2, 10));
                for (PhotoGalleryNavBarDropdownMenuItem photoGalleryNavBarDropdownMenuItem2 : list2) {
                    if (photoGalleryNavBarDropdownMenuItem2.f217489b == PhotoGalleryNavBarMenuItemType.f217501d) {
                        photoGalleryNavBarDropdownMenuItem2 = new PhotoGalleryNavBarDropdownMenuItem(photoGalleryNavBarDropdownMenuItem2.f217489b, Integer.valueOf(R.attr.textIconAddToComparison), com.avito.android.printable_text.b.c(R.string.photo_gallery_add_to_compare, new Serializable[0]), photoGalleryNavBarDropdownMenuItem2.f217492e);
                    }
                    arrayList6.add(photoGalleryNavBarDropdownMenuItem2);
                }
                aVar.f217539r = PhotoGalleryNavBarState.a(photoGalleryNavBarState2, null, arrayList6, false, false, null, null, 0L, 125);
                aVar.d();
            } else {
                if (!(sVar instanceof s.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th2 = ((s.c) sVar).f301637b;
                String message = th2.getMessage();
                Resources resources = aVar.f217533l;
                if (message == null) {
                    message = resources.getString(R.string.photo_gallery_unknown_error);
                }
                String string = resources.getString(R.string.photo_gallery_repeat);
                com.avito.android.photo_gallery.nav_bar.b bVar = new com.avito.android.photo_gallery.nav_bar.b(aVar);
                NavBar navBar = aVar.f217537p;
                if (navBar != null) {
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, navBar, com.avito.android.printable_text.b.f(message), null, Collections.singletonList(new c.a.C3719a(string, false, null, bVar, 6, null)), null, new f.c(th2), 0, null, null, false, false, null, null, 4074);
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k Activity activity, @Y61.k E e12, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC19542a interfaceC19542a, @Y61.k com.avito.android.toggle_comparison_state.l lVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.favorite.h hVar, @Y61.k C29640d c29640d, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k Resources resources, @Y61.k T t12, @Y61.k com.avito.android.advert_core.analytics.sharing.a aVar2, @Y61.k com.avito.android.analytics.provider.e eVar) {
        this.f217522a = activity;
        this.f217523b = e12;
        this.f217524c = bVar;
        this.f217525d = interfaceC28373a;
        this.f217526e = interfaceC19542a;
        this.f217527f = lVar;
        this.f217528g = aVar;
        this.f217529h = r02;
        this.f217530i = hVar;
        this.f217531j = c29640d;
        this.f217532k = interfaceC35845m2;
        this.f217533l = resources;
        this.f217534m = t12;
        this.f217535n = aVar2;
        this.f217536o = eVar;
        new com.avito.android.lib.design.nav_bar.b(0, null, 0, null, null, null, null, 127, null);
        this.f217545x = resources.getDimensionPixelSize(R.dimen.photo_gallery_navbar_back_button_margin_start);
        this.f217546y = resources.getDimensionPixelSize(R.dimen.photo_gallery_navbar_icons_padding);
        this.f217547z = resources.getDimensionPixelSize(R.dimen.photo_gallery_navbar_padding_horizontal);
    }

    public static final void a(a aVar) {
        int i12;
        Drawable drawableH;
        boolean z12 = aVar.f217539r.f217514d;
        int i13 = z12 ? R.attr.ic_favoritesFilled24 : R.attr.ic_favorites24;
        if (z12) {
            androidx.appcompat.view.d dVar = aVar.f217541t;
            i12 = (dVar == null || !com.avito.android.lib.util.darkTheme.c.b(dVar)) ? R.attr.red600 : R.attr.red900;
        } else {
            i12 = R.attr.constantWhite;
        }
        ArrayList<k> arrayList = aVar.f217543v;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (k kVarA : arrayList) {
            if (kVarA.f217565b == PhotoGalleryNavBarMenuItemType.f217499b) {
                androidx.appcompat.view.d dVar2 = aVar.f217541t;
                Drawable drawableMutate = (dVar2 == null || (drawableH = C35835l0.h(i13, dVar2)) == null) ? null : drawableH.mutate();
                androidx.appcompat.view.d dVar3 = aVar.f217541t;
                kVarA = k.a(kVarA, drawableMutate, dVar3 != null ? new C35763c0(C35835l0.d(i12, dVar3), null, null, null, 14, null) : null, 51);
            }
            arrayList2.add(kVarA);
        }
        aVar.f217543v = new ArrayList(arrayList2);
    }

    public final void b(com.avito.android.toggle_comparison_state.a aVar) {
        View view;
        String str = aVar.f301569b;
        int length = str.length();
        String str2 = aVar.f301568a;
        if ((length == 0 && str2.length() == 0) || (view = this.f217538q) == null) {
            return;
        }
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.f(str), null, Collections.singletonList(new c.a.C3719a(str2, false, null, new b(aVar), 6, null)), null, null, 0, ToastBarPosition.f181044b, null, false, false, null, null, 4026);
    }

    public final void c(@Y61.l String str, @Y61.k View view, @Y61.k androidx.appcompat.view.d dVar, @Y61.l PhotoGalleryNavBar photoGalleryNavBar, @Y61.k Y41.a aVar, @Y61.k View view2, @Y61.l String str2) {
        ArrayList arrayList;
        Continuation continuation;
        PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures;
        PhotoGalleryNavBarFavoriteFeature photoGalleryNavBarFavoriteFeature;
        int i12;
        Integer numValueOf;
        char c12;
        char c13;
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType;
        PhotoGalleryNavBarDropdownMenuItem photoGalleryNavBarDropdownMenuItem;
        PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures2;
        PhotoGalleryNavBarCompareFeature photoGalleryNavBarCompareFeature;
        PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures3;
        PhotoGalleryNavBarFavoriteFeature photoGalleryNavBarFavoriteFeature2;
        this.f217539r = PhotoGalleryNavBarState.a(this.f217539r, str, null, (photoGalleryNavBar == null || (photoGalleryNavBarFeatures3 = photoGalleryNavBar.f217474d) == null || (photoGalleryNavBarFavoriteFeature2 = photoGalleryNavBarFeatures3.f217496b) == null) ? false : photoGalleryNavBarFavoriteFeature2.f217493b, (photoGalleryNavBar == null || (photoGalleryNavBarFeatures2 = photoGalleryNavBar.f217474d) == null || (photoGalleryNavBarCompareFeature = photoGalleryNavBarFeatures2.f217498d) == null || !photoGalleryNavBarCompareFeature.f217484d) ? false : true, photoGalleryNavBar, str2, 0L, 66);
        this.f217541t = dVar;
        View viewFindViewById = view2.findViewById(R.id.nav_bar_container);
        this.f217537p = (NavBar) view2.findViewById(R.id.navbar);
        this.f217538q = view2.findViewById(R.id.contact_bar_container);
        D6.w(viewFindViewById);
        D6.H(this.f217537p);
        com.avito.android.lib.design.nav_bar.a aVarA = com.avito.android.lib.design.nav_bar.a.a(this.f217544w, C35835l0.h(R.attr.ic_arrowBack24, dVar), new com.avito.android.photo_gallery.nav_bar.c(aVar), null, view, null, new com.avito.android.photo_gallery.nav_bar.d(1, this, a.class, "onRightButtonClick", "onRightButtonClick(I)V", 0), 44);
        NavBar navBar = this.f217537p;
        if (navBar != null) {
            navBar.setState(aVarA);
        }
        this.f217544w = aVarA;
        b.C5290b c5290b = com.avito.android.lib.design.nav_bar.b.f179844h;
        int iJ2 = C35835l0.j(R.attr.navBarDefault, dVar);
        c5290b.getClass();
        com.avito.android.lib.design.nav_bar.b bVar = (com.avito.android.lib.design.nav_bar.b) c.a.a(c5290b, dVar, iJ2);
        int i13 = this.f217540s;
        RippleDrawable rippleDrawableC = V0.c(ColorStateList.valueOf(androidx.core.content.d.getColor(dVar, i13)));
        bVar.f179846b.getClass();
        com.avito.android.lib.design.nav_bar.b bVarA = com.avito.android.lib.design.nav_bar.b.a(bVar, this.f217547z, new b.a(R.attr.constantWhite, this.f217545x, this.f217546y, rippleDrawableC), 0, new C35763c0(dVar.getColor(R.color.expected_gallery_navbar_background), null, null, null, 14, null), new C35763c0(C35835l0.d(R.attr.constantWhite, dVar), null, null, null, 14, null), 84);
        NavBar navBar2 = this.f217537p;
        if (navBar2 != null) {
            navBar2.setStyle(bVarA);
        }
        PhotoGalleryNavBar photoGalleryNavBar2 = this.f217539r.f217516f;
        ArrayList arrayList2 = photoGalleryNavBar2 != null ? photoGalleryNavBar2.f217472b : null;
        ArrayList<PhotoGalleryNavBarDropdownAction> arrayList3 = photoGalleryNavBar2 != null ? photoGalleryNavBar2.f217473c : null;
        this.f217543v.clear();
        PhotoGalleryNavBarState photoGalleryNavBarState = this.f217539r;
        int i14 = 2;
        int i15 = 3;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            for (PhotoGalleryNavBarDropdownAction photoGalleryNavBarDropdownAction : arrayList3) {
                int iOrdinal = photoGalleryNavBarDropdownAction.f217485b.ordinal();
                if (iOrdinal == i14) {
                    boolean z12 = this.f217539r.f217515e;
                    photoGalleryNavBarDropdownMenuItem = new PhotoGalleryNavBarDropdownMenuItem(PhotoGalleryNavBarMenuItemType.f217501d, Integer.valueOf(z12 ? R.attr.textIconAddedToTheComparison : R.attr.textIconAddToComparison), com.avito.android.printable_text.b.c(z12 ? R.string.photo_gallery_added_to_compare : R.string.photo_gallery_add_to_compare, new Serializable[0]), null, 8, null);
                } else if (iOrdinal != i15) {
                    photoGalleryNavBarDropdownMenuItem = null;
                } else {
                    PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType2 = PhotoGalleryNavBarMenuItemType.f217503f;
                    String str3 = photoGalleryNavBarDropdownAction.f217486c;
                    Integer numM = str3 != null ? com.avito.android.lib.util.f.m(str3) : null;
                    String str4 = photoGalleryNavBarDropdownAction.f217487d;
                    photoGalleryNavBarDropdownMenuItem = new PhotoGalleryNavBarDropdownMenuItem(photoGalleryNavBarMenuItemType2, numM, str4 != null ? com.avito.android.printable_text.b.f(str4) : null, photoGalleryNavBarDropdownAction.f217488e);
                }
                if (photoGalleryNavBarDropdownMenuItem != null) {
                    arrayList.add(photoGalleryNavBarDropdownMenuItem);
                }
                i14 = 2;
                i15 = 3;
            }
        } else {
            arrayList = null;
        }
        this.f217539r = PhotoGalleryNavBarState.a(photoGalleryNavBarState, null, arrayList == null ? C42784z0.f406748b : arrayList, false, false, null, null, 0L, 125);
        if (O2.a(arrayList3)) {
            this.f217543v.add(new k(0, PhotoGalleryNavBarMenuItemType.f217502e, C35835l0.h(R.attr.ic_more24, dVar), null, V0.c(ColorStateList.valueOf(androidx.core.content.d.getColor(dVar, i13))), null, 40, null));
        }
        if (arrayList2 != null) {
            int i16 = 0;
            for (Object obj : arrayList2) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                PhotoGalleryNavBarVisibleAction photoGalleryNavBarVisibleAction = (PhotoGalleryNavBarVisibleAction) obj;
                String str5 = photoGalleryNavBarVisibleAction.f217520c;
                PhotoGalleryNavBarActionType photoGalleryNavBarActionType = photoGalleryNavBarVisibleAction.f217519b;
                if (str5 == null || (numValueOf = q.a(str5)) == null) {
                    int iOrdinal2 = photoGalleryNavBarActionType.ordinal();
                    if (iOrdinal2 != 0) {
                        i12 = 1;
                        if (iOrdinal2 == 1) {
                            numValueOf = Integer.valueOf(R.attr.ic_share24);
                        } else if (iOrdinal2 != 2) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(this.f217539r.f217515e ? R.attr.ic_compare24 : R.attr.ic_addCompare24);
                        }
                    } else {
                        i12 = 1;
                        numValueOf = Integer.valueOf(this.f217539r.f217514d ? R.attr.ic_favoritesFilled24 : R.attr.ic_favorites24);
                    }
                } else {
                    i12 = 1;
                }
                Drawable drawableH = numValueOf != null ? C35835l0.h(numValueOf.intValue(), dVar) : null;
                if (drawableH != null) {
                    int iOrdinal3 = photoGalleryNavBarActionType.ordinal();
                    if (iOrdinal3 == 0) {
                        c12 = 3;
                        c13 = 2;
                        photoGalleryNavBarMenuItemType = PhotoGalleryNavBarMenuItemType.f217499b;
                    } else if (iOrdinal3 != i12) {
                        c13 = 2;
                        if (iOrdinal3 != 2) {
                            c12 = 3;
                            if (iOrdinal3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            photoGalleryNavBarMenuItemType = PhotoGalleryNavBarMenuItemType.f217503f;
                        } else {
                            c12 = 3;
                            photoGalleryNavBarMenuItemType = PhotoGalleryNavBarMenuItemType.f217501d;
                        }
                    } else {
                        c12 = 3;
                        c13 = 2;
                        photoGalleryNavBarMenuItemType = PhotoGalleryNavBarMenuItemType.f217500c;
                    }
                    this.f217543v.add(new k(i16, photoGalleryNavBarMenuItemType, drawableH, null, V0.c(ColorStateList.valueOf(androidx.core.content.d.getColor(dVar, i13))), photoGalleryNavBarVisibleAction.f217521d, 8, null));
                }
                i16 = i17;
            }
        }
        d();
        T t12 = this.f217534m;
        com.avito.android.favorite.h hVar = this.f217530i;
        if (str != null) {
            continuation = null;
            C43175k.K(new C43197r1(new e(this, null), A.a(hVar.b(str, (photoGalleryNavBar == null || (photoGalleryNavBarFeatures = photoGalleryNavBar.f217474d) == null || (photoGalleryNavBarFavoriteFeature = photoGalleryNavBarFeatures.f217496b) == null || !photoGalleryNavBarFavoriteFeature.f217493b) ? false : true).D())), t12);
        } else {
            continuation = null;
        }
        C43175k.K(new C43197r1(new f(this, dVar, continuation), A.a(hVar.c())), t12);
        z zVar = z.f181429a;
        Window window = this.f217522a.getWindow();
        Integer numValueOf2 = Integer.valueOf(R.attr.constantBlack);
        zVar.getClass();
        z.d(window, dVar, numValueOf2, false);
    }

    public final void d() {
        com.avito.android.lib.design.nav_bar.a aVar = this.f217544w;
        ArrayList<k> arrayList = this.f217543v;
        ArrayList arrayList2 = new ArrayList();
        for (k kVar : arrayList) {
            Drawable drawable = kVar.f217566c;
            a.C5289a c5289a = drawable != null ? new a.C5289a(drawable, kVar.f217567d, kVar.f217568e, 0, 0, this.f217546y, 24, null) : null;
            if (c5289a != null) {
                arrayList2.add(c5289a);
            }
        }
        com.avito.android.lib.design.nav_bar.a aVarA = com.avito.android.lib.design.nav_bar.a.a(aVar, null, null, null, null, arrayList2, null, 95);
        NavBar navBar = this.f217537p;
        if (navBar != null) {
            navBar.setState(aVarA);
        }
        this.f217544w = aVarA;
    }

    public final void e() {
        PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures;
        PhotoGalleryNavBarCompareFeature photoGalleryNavBarCompareFeature;
        boolean zB2 = this.f217523b.b();
        PhotoGalleryNavBarState photoGalleryNavBarState = this.f217539r;
        PhotoGalleryNavBar photoGalleryNavBar = photoGalleryNavBarState.f217516f;
        if (photoGalleryNavBar == null || (photoGalleryNavBarFeatures = photoGalleryNavBar.f217474d) == null || (photoGalleryNavBarCompareFeature = photoGalleryNavBarFeatures.f217498d) == null) {
            return;
        }
        if (!zB2) {
            AuthSource authSource = AuthSource.f92694c;
            this.f217522a.startActivityForResult(this.f217526e.b(PhotoGalleryNavBarAuthData.ComparisonFeature.f217481b, "cmp_gallery"), 1);
            return;
        }
        String str = photoGalleryNavBarCompareFeature.f217483c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        FromPage[] fromPageArr = FromPage.f124197b;
        C43175k.K(new C43197r1(new d(null), A.a(this.f217527f.a(new com.avito.android.toggle_comparison_state.p(photoGalleryNavBarCompareFeature.f217482b, str2, photoGalleryNavBarState.f217517g, "item", photoGalleryNavBarState.f217515e, false)).D())), this.f217534m);
    }
}
