package com.avito.android.beduin.common.component.albums.items;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.component.image.Size;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.beduin.common.utils.B;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AlbumItemView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/items/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/albums/items/e;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f100653g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f100654b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Size f100655c;

    /* renamed from: d, reason: collision with root package name */
    public int f100656d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f100657e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f100658f;

    /* compiled from: AlbumItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/items/f$a;", "", "<init>", "()V", "", "DEFAULT_CORNER_RADIUS", "I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public f(@k View view, @l Size size) {
        super(view);
        this.f100654b = view;
        this.f100655c = size;
        this.f100657e = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f100658f = (TextView) view.findViewById(R.id.text);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cell);
        if (size != null) {
            viewGroup.getLayoutParams().width = y6.d(size.getWidth());
            viewGroup.requestLayout();
        }
    }

    public final int B80() {
        double d12;
        int i12;
        Size size = this.f100655c;
        if (size != null) {
            return y6.d(size.getWidth());
        }
        int i13 = Resources.getSystem().getDisplayMetrics().widthPixels;
        if (i13 < y6.d(414)) {
            d12 = i13 - (this.f100656d * 2.5d);
            i12 = 2;
        } else {
            if (i13 < y6.d(768)) {
                return (i13 - (this.f100656d * 3)) / 3;
            }
            d12 = i13 - (this.f100656d * 3.5d);
            i12 = 4;
        }
        return (int) (d12 / i12);
    }

    @Override // com.avito.android.beduin.common.component.albums.items.e
    public final void Ea(int i12, int i13) {
        this.f100656d = (i12 + i13) / 2;
    }

    @Override // com.avito.android.beduin.common.component.albums.items.e
    public final void F(@l AttributedText attributedText) {
        TextView textView = this.f100658f;
        if (attributedText == null) {
            D6.w(textView);
            return;
        }
        textView.getLayoutParams().width = B80();
        textView.requestLayout();
        j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.beduin.common.component.albums.items.e
    public final void Ra(@l Corners corners) {
        RoundingParams roundingParams;
        if (corners == null || (corners.g() == null && corners.h() == null && corners.e() == null && corners.d() == null)) {
            if ((corners != null ? corners.g() : null) != null) {
                roundingParams = new RoundingParams();
                roundingParams.e(y6.d(corners.g().intValue()));
            } else {
                roundingParams = new RoundingParams();
                roundingParams.e(y6.d(5));
            }
        } else {
            float fD2 = y6.d(corners.g().intValue());
            float fD3 = y6.d(corners.h().intValue());
            float fD4 = y6.d(corners.e().intValue());
            float fD5 = y6.d(corners.d().intValue());
            roundingParams = new RoundingParams();
            roundingParams.d(fD2, fD3, fD4, fD5);
        }
        SimpleDraweeView simpleDraweeView = this.f100657e;
        simpleDraweeView.getHierarchy().s(roundingParams);
        simpleDraweeView.requestLayout();
    }

    @Override // com.avito.android.beduin.common.component.albums.items.e
    public final void c(@k Y41.a<G0> aVar) {
        this.f100654b.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(16, aVar));
    }

    @Override // com.avito.android.beduin.common.component.albums.items.e
    public final void nI(@k Image image, @k ImageStyle imageStyle) {
        SimpleDraweeView simpleDraweeView = this.f100657e;
        simpleDraweeView.getLayoutParams().width = B80();
        ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        Size size = this.f100655c;
        layoutParams.height = size != null ? y6.d(size.getHeight()) : (simpleDraweeView.getLayoutParams().width * 3) / 4;
        simpleDraweeView.requestLayout();
        Uri uriD = C35829k2.c(image, simpleDraweeView, 2, 22).d();
        if (uriD != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f(uriD);
            B.b(simpleDraweeView, imageStyle, aVarA);
            aVarA.c();
        }
    }
}
