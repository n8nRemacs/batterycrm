package com.avito.android.serp.adapter.map_banner;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.D6;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MapBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/map_banner/j;", "Lcom/avito/android/serp/adapter/map_banner/i;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f270300f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f270301b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f270302c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f270303d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f270304e;

    public j(@k View view) {
        super(view);
        this.f270301b = view;
        this.f270302c = (TextView) view.findViewById(R.id.body);
        this.f270303d = (Button) view.findViewById(R.id.button);
        a aVar = new a();
        this.f270304e = aVar;
        aVar.f270306c = view.findViewById(R.id.image);
    }

    @Override // com.avito.android.serp.adapter.map_banner.i
    public final void Wb(@l String str, @k Y41.a<G0> aVar) {
        if (str != null) {
            Button button = this.f270303d;
            button.setText(str);
            button.setOnClickListener(new o(19, aVar));
        }
    }

    @Override // com.avito.android.serp.adapter.map_banner.i
    public final void i(@l UniversalImage universalImage) {
        Image imageQ;
        if (universalImage == null || (imageQ = com.avito.android.actions_sheet.a.q(this.f270301b, universalImage)) == null) {
            return;
        }
        s.b(this.f270304e, imageQ, null, 30);
    }

    @Override // com.avito.android.serp.adapter.map_banner.i
    public final void setTitle(@l String str) {
        if (str != null) {
            this.f270302c.setText(str);
        }
    }

    /* compiled from: MapBannerItemView.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/map_banner/j$a;", "Lgw/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC40743a {

        /* renamed from: b, reason: collision with root package name */
        @l
        public Drawable f270305b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public View f270306c;

        public a() {
            State.a aVar = State.f135879c;
        }

        @Override // gw.InterfaceC40743a
        @l
        /* renamed from: getImage, reason: from getter */
        public final Drawable getF179015b() {
            return this.f270305b;
        }

        @Override // gw.InterfaceC40743a
        @l
        public final View getImageContainerView() {
            return this.f270306c;
        }

        @Override // gw.InterfaceC40743a
        public final void setImage(@l Drawable drawable) {
            this.f270305b = drawable;
            View view = this.f270306c;
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                D6.G(imageView, this.f270305b != null);
            }
        }

        @Override // gw.InterfaceC40743a
        public final void setState(@k State state) {
        }
    }
}
