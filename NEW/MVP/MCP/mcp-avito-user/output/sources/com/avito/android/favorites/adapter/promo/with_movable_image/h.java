package com.avito.android.favorites.adapter.promo.with_movable_image;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.favorites.adapter.promo.FavoritesPromoItem;
import com.avito.android.favorites.adapter.promo.s;
import com.avito.android.favorites.adapter.promo.u;
import com.avito.android.favorites.adapter.promo.w;
import com.avito.android.favorites.adapter.promo.x;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.vertical_main.MovableImage;
import com.avito.android.remote.model.vertical_main.Position;
import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.remote.model.vertical_main.ScaleType;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoItemWithMovableImageView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/with_movable_image/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/promo/with_movable_image/g;", "Lcom/avito/android/favorites/adapter/promo/u;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, u {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f156707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f156708c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f156709d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f156710e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f156711f;

    /* compiled from: PromoItemWithMovableImageView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156712a;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScaleType.CENTER_INSIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ScaleType.CENTER_CROP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ScaleType.FOCUS_CROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ScaleType.FIT_BOTTOM_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f156712a = iArr;
        }
    }

    public h(@k View view, @k s sVar, @k x xVar) {
        super(view);
        this.f156707b = xVar;
        View viewInflate = LayoutInflater.from(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.favorites_promo_block_with_movable_image_content, (ViewGroup) null);
        this.f156708c = new w(view, sVar, xVar, viewInflate);
        this.f156709d = view.getResources().getBoolean(R.bool.is_tablet);
        View viewFindViewById = viewInflate.findViewById(R.id.promo_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156710e = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.promo_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f156711f = (SimpleDraweeView) viewFindViewById2;
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void KV(@k PromoStyle promoStyle) {
        w wVar = this.f156708c;
        wVar.f156680e.setAppearanceFromAttr(this.f156707b.a(promoStyle));
        Banner banner = wVar.f156680e;
        if (this.f156709d) {
            Banner.m(banner, 0, 1);
        } else {
            Banner.m(banner, 0, 3);
        }
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void W2() {
        this.f156708c.W2();
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void co(@k List<PromoAction> list, @k FavoritesPromoItem favoritesPromoItem, int i12) {
        this.f156708c.co(list, favoritesPromoItem, i12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f156708c.getClass();
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void jY(@k String str) {
        this.f156708c.f156680e.setTitle(null);
        I5.a(this.f156710e, str, false);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void r6(@k String str) {
        this.f156708c.r6(str);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void v8() {
        this.f156708c.v8();
    }

    @Override // com.avito.android.favorites.adapter.promo.with_movable_image.g
    public final void xe(@l MovableImage movableImage) {
        s.c cVar;
        Float offsetY;
        Float offsetX;
        ScaleType scaleType = movableImage != null ? movableImage.getScaleType() : null;
        switch (scaleType == null ? -1 : a.f156712a[scaleType.ordinal()]) {
            case 1:
                cVar = s.c.f340129a;
                break;
            case 2:
                cVar = s.c.f340132d;
                break;
            case 3:
                cVar = s.c.f340133e;
                break;
            case 4:
                cVar = s.c.f340134f;
                break;
            case 5:
                cVar = s.c.f340135g;
                break;
            case 6:
                cVar = s.c.f340136h;
                break;
            case 7:
                cVar = s.c.f340137i;
                break;
            case 8:
                cVar = s.c.f340137i;
                break;
            case 9:
                cVar = s.c.f340139k;
                break;
            default:
                cVar = null;
                break;
        }
        SimpleDraweeView simpleDraweeView = this.f156711f;
        if (cVar != null) {
            simpleDraweeView.getHierarchy().n(cVar);
        }
        UniversalImage image = movableImage != null ? movableImage.getImage() : null;
        Image imageDependsOnThemeOrDefault = image != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(image, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null;
        if (imageDependsOnThemeOrDefault != null) {
            C35949t5.c(this.f156711f, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
            D6.H(simpleDraweeView);
        } else {
            D6.w(simpleDraweeView);
        }
        Position position = movableImage != null ? movableImage.getPosition() : null;
        float fFloatValue = 0.0f;
        simpleDraweeView.setTranslationX(y6.a((position == null || (offsetX = position.getOffsetX()) == null) ? 0.0f : offsetX.floatValue()));
        if (position != null && (offsetY = position.getOffsetY()) != null) {
            fFloatValue = offsetY.floatValue();
        }
        simpleDraweeView.setTranslationY(y6.a(fFloatValue));
    }
}
