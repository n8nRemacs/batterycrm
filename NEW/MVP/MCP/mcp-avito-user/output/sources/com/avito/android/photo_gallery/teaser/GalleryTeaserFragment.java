package com.avito.android.photo_gallery.teaser;

import Au.ViewOnClickListenerC13080b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.remote.model.model_card.LinkInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35968w3;
import com.facebook.drawee.view.SimpleDraweeView;
import cv.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: GalleryTeaserFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_gallery/teaser/GalleryTeaserFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GalleryTeaserFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final C35968w3 f217661n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f217662o0;

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f217660q0 = {m0.f406844a.e(new Y(GalleryTeaserFragment.class, "openParams", "getOpenParams()Lcom/avito/android/photo_gallery/teaser/GalleryTeaserOpenParams;", 0))};

    /* renamed from: p0, reason: collision with root package name */
    @k
    public static final a f217659p0 = new a(null);

    /* compiled from: GalleryTeaserFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/teaser/GalleryTeaserFragment$a;", "", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static GalleryTeaserFragment a(@k GalleryTeaserOpenParams galleryTeaserOpenParams) {
            GalleryTeaserFragment galleryTeaserFragment = new GalleryTeaserFragment();
            galleryTeaserFragment.f217661n0.setValue(galleryTeaserFragment, GalleryTeaserFragment.f217660q0[0], galleryTeaserOpenParams);
            return galleryTeaserFragment;
        }

        public a() {
        }
    }

    public GalleryTeaserFragment() {
        super(R.layout.fragment_gallery_teaser);
        this.f217661n0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @l
    public final Context m5(@k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_LookAndFeel));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        com.avito.android.photo_gallery.di.teaser.a.a().a(c.b(this)).a(this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.teaser_text);
        Button button = (Button) view.findViewById(R.id.teaser_button);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        n<Object>[] nVarArr = f217660q0;
        n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f217661n0;
        aVarA.d(com.avito.android.image_loader.n.a(((GalleryTeaserOpenParams) c35968w3.getValue(this, nVar)).f217663b.getImage()));
        aVarA.c();
        GalleryTeaserOpenParams galleryTeaserOpenParams = (GalleryTeaserOpenParams) c35968w3.getValue(this, nVarArr[0]);
        StringBuilder sb2 = new StringBuilder();
        GalleryTeaser galleryTeaser = galleryTeaserOpenParams.f217663b;
        String title = galleryTeaser.getTitle();
        if (title == null) {
            title = "";
        }
        sb2.append(title);
        sb2.append(' ');
        String subtitle = galleryTeaser.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        sb2.append(subtitle);
        textView.setText(sb2.toString());
        LinkInfo button2 = galleryTeaser.getButton();
        String title2 = button2 != null ? button2.getTitle() : null;
        button.setText(title2 != null ? title2 : "");
        button.setOnClickListener(new ViewOnClickListenerC13080b(19, galleryTeaser, this));
    }
}
