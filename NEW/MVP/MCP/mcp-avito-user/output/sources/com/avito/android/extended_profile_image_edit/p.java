package com.avito.android.extended_profile_image_edit;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import com.avito.android.extended_profile_image_edit.p;
import com.avito.android.krop.KropView;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vA.InterfaceC49183a;

/* compiled from: BannerImageEditView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/p;", "Lcom/facebook/imagepipeline/datasource/c;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p extends com.facebook.imagepipeline.datasource.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f151108a;

    /* compiled from: BannerImageEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Bitmap> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f151109l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            super(0);
            this.f151109l = qVar;
        }

        @Override // Y41.a
        public final Bitmap invoke() {
            return this.f151109l.f151115f.getCroppedBitmap();
        }
    }

    public p(q qVar) {
        this.f151108a = qVar;
    }

    @Override // com.facebook.imagepipeline.datasource.c
    public final void g(@Y61.l Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        final q qVar = this.f151108a;
        D6.w(qVar.f151124o);
        D6.H(qVar.f151123n);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        KropView kropView = qVar.f151115f;
        kropView.setBitmap(bitmapCreateBitmap);
        kropView.setTransformationListener(new m(qVar));
        qVar.f151110a.post(new Runnable() { // from class: com.avito.android.extended_profile_image_edit.o
            @Override // java.lang.Runnable
            public final void run() {
                q qVar2 = qVar;
                qVar2.f151111b.accept(new InterfaceC49183a.c(new p.a(qVar2)));
            }
        });
        ValueAnimator valueAnimator = qVar.f151126q;
        valueAnimator.setStartDelay(1000L);
        valueAnimator.start();
    }

    @Override // com.facebook.datasource.e
    public final void a(@Y61.k com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
    }
}
