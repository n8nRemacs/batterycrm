package com.avito.android.photo_picker.edit;

import android.graphics.Bitmap;
import android.view.View;
import com.avito.android.krop.KropView;
import com.avito.android.krop.ZoomableImageView;
import com.avito.android.krop.util.Transformation;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: EditPhotoFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/g;", "Lcom/facebook/imagepipeline/datasource/c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.facebook.imagepipeline.datasource.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditPhotoFragment f219405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transformation f219406b;

    public g(EditPhotoFragment editPhotoFragment, Transformation transformation) {
        this.f219405a = editPhotoFragment;
        this.f219406b = transformation;
    }

    @Override // com.facebook.imagepipeline.datasource.c
    public final void g(@Y61.l Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        EditPhotoFragment editPhotoFragment = this.f219405a;
        View view = editPhotoFragment.f219356n0;
        if (view == null) {
            view = null;
        }
        D6.w(view);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = editPhotoFragment.f219365w0;
        if ((photoPickerMode == null ? null : photoPickerMode) instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) {
            if (photoPickerMode == null) {
                photoPickerMode = null;
            }
            int iOrdinal = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar) photoPickerMode).f218807b.ordinal();
            if (iOrdinal == 0) {
                KropView kropView = editPhotoFragment.f219353k0;
                if (kropView == null) {
                    kropView = null;
                }
                kropView.f174747c = y6.b(26);
                kropView.f174755k.requestLayout();
                ZoomableImageView zoomableImageView = kropView.f174754j;
                zoomableImageView.currentZoom = 1.0f;
                zoomableImageView.d();
                kropView.invalidate();
                KropView kropView2 = editPhotoFragment.f219353k0;
                if (kropView2 == null) {
                    kropView2 = null;
                }
                kropView2.b(1, 1);
                com.avito.android.krop.e eVar = editPhotoFragment.f219354l0;
                if (eVar == null) {
                    eVar = null;
                }
                D6.H(eVar);
                com.avito.android.krop.e eVar2 = editPhotoFragment.f219355m0;
                if (eVar2 == null) {
                    eVar2 = null;
                }
                D6.w(eVar2);
                KropView kropView3 = editPhotoFragment.f219353k0;
                if (kropView3 == null) {
                    kropView3 = null;
                }
                com.avito.android.krop.e eVar3 = editPhotoFragment.f219354l0;
                if (eVar3 == null) {
                    eVar3 = null;
                }
                kropView3.f174751g = -1;
                kropView3.f174755k = eVar3;
                kropView3.c();
            } else if (iOrdinal == 1) {
                KropView kropView4 = editPhotoFragment.f219353k0;
                if (kropView4 == null) {
                    kropView4 = null;
                }
                kropView4.b(3, 2);
                com.avito.android.krop.e eVar4 = editPhotoFragment.f219355m0;
                if (eVar4 == null) {
                    eVar4 = null;
                }
                D6.H(eVar4);
                com.avito.android.krop.e eVar5 = editPhotoFragment.f219354l0;
                if (eVar5 == null) {
                    eVar5 = null;
                }
                D6.w(eVar5);
                KropView kropView5 = editPhotoFragment.f219353k0;
                if (kropView5 == null) {
                    kropView5 = null;
                }
                com.avito.android.krop.e eVar6 = editPhotoFragment.f219355m0;
                if (eVar6 == null) {
                    eVar6 = null;
                }
                kropView5.f174751g = -1;
                kropView5.f174755k = eVar6;
                kropView5.c();
            }
        } else {
            com.avito.android.krop.e eVar7 = editPhotoFragment.f219355m0;
            if (eVar7 == null) {
                eVar7 = null;
            }
            D6.H(eVar7);
            com.avito.android.krop.e eVar8 = editPhotoFragment.f219354l0;
            if (eVar8 == null) {
                eVar8 = null;
            }
            D6.w(eVar8);
            KropView kropView6 = editPhotoFragment.f219353k0;
            if (kropView6 == null) {
                kropView6 = null;
            }
            com.avito.android.krop.e eVar9 = editPhotoFragment.f219355m0;
            if (eVar9 == null) {
                eVar9 = null;
            }
            kropView6.f174751g = -1;
            kropView6.f174755k = eVar9;
            kropView6.c();
            if (bitmapCreateBitmap.getHeight() > bitmapCreateBitmap.getWidth()) {
                KropView kropView7 = editPhotoFragment.f219353k0;
                if (kropView7 == null) {
                    kropView7 = null;
                }
                float f12 = (C35835l0.g(kropView7.getContext()).x * 0.25f) / 2;
                KropView kropView8 = editPhotoFragment.f219353k0;
                if (kropView8 == null) {
                    kropView8 = null;
                }
                kropView8.f174747c = (int) f12;
                kropView8.f174755k.requestLayout();
                ZoomableImageView zoomableImageView2 = kropView8.f174754j;
                zoomableImageView2.currentZoom = 1.0f;
                zoomableImageView2.d();
                kropView8.invalidate();
                KropView kropView9 = editPhotoFragment.f219353k0;
                if (kropView9 == null) {
                    kropView9 = null;
                }
                kropView9.b(3, 4);
            } else {
                KropView kropView10 = editPhotoFragment.f219353k0;
                if (kropView10 == null) {
                    kropView10 = null;
                }
                kropView10.b(4, 3);
            }
        }
        Transformation transformation = this.f219406b;
        if (transformation != null) {
            KropView kropView11 = editPhotoFragment.f219353k0;
            if (kropView11 == null) {
                kropView11 = null;
            }
            kropView11.setTransformation(transformation);
        }
        KropView kropView12 = editPhotoFragment.f219353k0;
        if (kropView12 == null) {
            kropView12 = null;
        }
        kropView12.setBitmap(bitmapCreateBitmap);
        KropView kropView13 = editPhotoFragment.f219353k0;
        (kropView13 != null ? kropView13 : null).setTransformationListener(new f(editPhotoFragment));
    }

    @Override // com.facebook.datasource.e
    public final void a(@Y61.k com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
    }
}
