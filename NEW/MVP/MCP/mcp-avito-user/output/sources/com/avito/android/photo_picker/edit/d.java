package com.avito.android.photo_picker.edit;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.avito.android.R;
import com.avito.android.krop.KropView;
import com.avito.android.krop.util.ScaleAfterRotationStyle;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.SelectedPhoto;
import com.avito.android.photo_picker.edit.EditPhotoFragment;
import com.avito.android.photo_picker.edit.k;
import com.avito.android.util.D6;
import com.avito.android.util.L5;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: EditPhotoFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/photo_picker/edit/k$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/photo_picker/edit/k$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.l<k.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditPhotoFragment f219377l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditPhotoFragment editPhotoFragment) {
        super(1);
        this.f219377l = editPhotoFragment;
    }

    @Override // Y41.l
    public final G0 invoke(k.a aVar) {
        String str;
        com.avito.android.photo_picker.legacy.thumbnail_list.l next;
        com.avito.android.photo_picker.legacy.thumbnail_list.l next2;
        k.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof k.a.f;
        final EditPhotoFragment editPhotoFragment = this.f219377l;
        if (z12) {
            k.a.f fVar = (k.a.f) aVar2;
            Uri uri = fVar.f219423a;
            View view = editPhotoFragment.f219356n0;
            if (view == null) {
                view = null;
            }
            D6.G(view, true);
            com.facebook.datasource.c cVarA = com.facebook.drawee.backends.pipeline.d.a().a(ImageRequestBuilder.b(uri).a(), null);
            editPhotoFragment.f219360r0 = cVarA;
            cVarA.d(new g(editPhotoFragment, fVar.f219424b), com.facebook.common.executors.i.a());
        } else if (aVar2 instanceof k.a.b) {
            L5.a(editPhotoFragment.requireContext(), R.string.photo_edit_open_error, 0);
            PhotoPickerViewModel photoPickerViewModel = editPhotoFragment.f219349g0;
            (photoPickerViewModel != null ? photoPickerViewModel : null).we(false);
        } else if (aVar2 instanceof k.a.C6596a) {
            PhotoPickerViewModel photoPickerViewModel2 = editPhotoFragment.f219349g0;
            (photoPickerViewModel2 != null ? photoPickerViewModel2 : null).we(false);
        } else if (aVar2 instanceof k.a.d) {
            PhotoPickerViewModel photoPickerViewModel3 = editPhotoFragment.f219349g0;
            if (photoPickerViewModel3 == null) {
                photoPickerViewModel3 = null;
            }
            SelectedPhoto selectedPhoto = ((k.a.d) aVar2).f219421a;
            Iterator it = photoPickerViewModel3.f218829Y.iterator();
            int i12 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                str = selectedPhoto.f218868d;
                if (!zHasNext) {
                    i12 = -1;
                    break;
                }
                if (L.f(((SelectedPhoto) it.next()).f218868d, str)) {
                    break;
                }
                i12++;
            }
            if (i12 != -1) {
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = photoPickerViewModel3.f218828X;
                Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (L.f(next.f219881b, str)) {
                        break;
                    }
                }
                com.avito.android.photo_picker.legacy.thumbnail_list.l lVar = next;
                if (lVar == null) {
                    photoPickerViewModel3.f218829Y.set(i12, selectedPhoto);
                    Iterator<com.avito.android.photo_picker.legacy.thumbnail_list.l> it3 = photoPickerViewModel3.f218827W.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        if (L.f(next2.f219881b, str)) {
                            break;
                        }
                    }
                    com.avito.android.photo_picker.legacy.thumbnail_list.l lVar2 = next2;
                    if (lVar2 != null) {
                        arrayList.add(lVar2);
                    }
                } else {
                    ArrayList arrayList2 = photoPickerViewModel3.f218829Y;
                    Uri uri2 = lVar.f219905e;
                    if (uri2 == null) {
                        uri2 = lVar.f219906f;
                    }
                    arrayList2.set(i12, SelectedPhoto.a(selectedPhoto, null, uri2, null, 119));
                }
            }
            PhotoPickerViewModel photoPickerViewModel4 = editPhotoFragment.f219349g0;
            (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).we(false);
        } else if (aVar2 instanceof k.a.e) {
            L5.a(editPhotoFragment.requireContext(), R.string.photo_edit_save_result_error, 0);
            PhotoPickerViewModel photoPickerViewModel5 = editPhotoFragment.f219349g0;
            (photoPickerViewModel5 != null ? photoPickerViewModel5 : null).we(false);
        } else if (aVar2 instanceof k.a.c) {
            final float f12 = ((k.a.c) aVar2).f219420a;
            EditPhotoFragment.a aVar3 = EditPhotoFragment.f219347y0;
            final l0.e eVar = new l0.e();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(eVar.f406839b, f12);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.photo_picker.edit.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    EditPhotoFragment.a aVar4 = EditPhotoFragment.f219347y0;
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    l0.e eVar2 = eVar;
                    float f13 = fFloatValue - eVar2.f406839b;
                    eVar2.f406839b = fFloatValue;
                    ScaleAfterRotationStyle scaleAfterRotationStyle = fFloatValue == f12 ? ScaleAfterRotationStyle.f174841d : ScaleAfterRotationStyle.f174839b;
                    KropView kropView = editPhotoFragment.f219353k0;
                    if (kropView == null) {
                        kropView = null;
                    }
                    kropView.f174754j.j(f13, scaleAfterRotationStyle);
                }
            });
            valueAnimatorOfFloat.addListener(new e(editPhotoFragment));
            valueAnimatorOfFloat.start();
        }
        return G0.f406611a;
    }
}
