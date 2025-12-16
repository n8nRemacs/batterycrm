package com.avito.android.hotel_available_rooms.konveyor.image_redesign;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.i;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomImageRedesignView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image_redesign/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/image_redesign/f;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f163026b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewGroup f163027c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f163028d;

    /* renamed from: e, reason: collision with root package name */
    public final int f163029e;

    /* renamed from: f, reason: collision with root package name */
    public final int f163030f;

    /* renamed from: g, reason: collision with root package name */
    public final int f163031g;

    /* compiled from: HotelRoomImageRedesignView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ImageRedesignSize.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ImageRedesignSize imageRedesignSize = ImageRedesignSize.f163012b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ImageRedesignSize imageRedesignSize2 = ImageRedesignSize.f163012b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(@k View view, @k ViewGroup viewGroup) {
        super(view);
        this.f163026b = view;
        this.f163027c = viewGroup;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        this.f163028d = imageView;
        int iS2 = D6.s(viewGroup) - (y6.b(16) * 2);
        this.f163029e = iS2;
        int iB2 = ((int) (iS2 * 0.5f)) - y6.b(1);
        this.f163030f = iB2;
        this.f163031g = ((int) ((D6.s(viewGroup) - (y6.b(10) * 2)) * 0.5f)) - y6.b(1);
        imageView.setClipToOutline(true);
        imageView.setMinimumWidth(iB2);
        imageView.setMaxWidth(iS2);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.image_redesign.f
    public final void YP(@k Image image, @k ImageRedesignSize imageRedesignSize, @k ImageRedesignCorners imageRedesignCorners, int i12) {
        int iA2;
        ImageView imageView = this.f163028d;
        Drawable drawableU = D6.u(imageView, i12);
        imageView.setForeground(D6.u(imageView, R.drawable.ic_hotels_placeholder));
        imageView.setClipToOutline(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C35835l0.d(R.attr.warmGray8, imageView.getContext()));
        gradientDrawable.setCornerRadii(imageRedesignCorners.f163011f);
        imageView.setBackground(gradientDrawable);
        int iOrdinal = imageRedesignSize.ordinal();
        int i13 = this.f163030f;
        int i14 = this.f163031g;
        if (iOrdinal == 0) {
            iA2 = (int) (C35829k2.a(image) * D6.r(this.f163027c));
            if (iA2 < i13) {
                iA2 = i13;
            }
            int i15 = this.f163029e;
            if (iA2 > i15) {
                iA2 = i15;
            }
        } else if (iOrdinal == 1) {
            iA2 = i14;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iA2 = -1;
        }
        boolean z12 = (iA2 == i13 || iA2 == i14 || iA2 == -1) ? false : true;
        View view = this.f163026b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = iA2;
        view.setLayoutParams(layoutParams);
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.d(com.avito.android.image_loader.b.b(image));
        aVar.f169491i = true;
        aVar.f169494l = true;
        aVar.f169492j = drawableU;
        aVar.f169493k = null;
        aVar.f169486d = z12;
        if (!z12) {
            aVar.f169502t = new ImageRequest.c(BeduinInputModel.MIN_TEXT_VERSION, BeduinInputModel.MIN_TEXT_VERSION);
        }
        aVar.f169490h = new b();
        aVar.c();
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.image_redesign.f
    public final void a(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.f163028d);
    }

    /* compiled from: ImageRequests.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements i {
        public b() {
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            g.this.f163028d.setForeground(null);
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@l Throwable th2) {
        }
    }
}
