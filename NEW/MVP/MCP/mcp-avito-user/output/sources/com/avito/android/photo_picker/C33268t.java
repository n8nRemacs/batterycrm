package com.avito.android.photo_picker;

import android.content.Intent;
import com.avito.android.R;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.edit.EditPhotoFragment;
import com.avito.android.photo_picker.gallery.GalleryPickerFragment;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.V2;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhotoPickerActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/photo_picker/PhotoPickerViewModel$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33268t extends kotlin.jvm.internal.N implements Y41.l<PhotoPickerViewModel.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhotoPickerActivity f219939l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33268t(PhotoPickerActivity photoPickerActivity) {
        super(1);
        this.f219939l = photoPickerActivity;
    }

    @Override // Y41.l
    public final G0 invoke(PhotoPickerViewModel.a aVar) {
        Intent intentO;
        PhotoPickerViewModel.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof PhotoPickerViewModel.a.f;
        PhotoPickerActivity photoPickerActivity = this.f219939l;
        if (z12) {
            int i12 = PhotoPickerActivity.f218778C;
            GalleryPickerFragment.a aVar3 = GalleryPickerFragment.f219444C0;
            boolean zA2 = photoPickerActivity.a2();
            aVar3.getClass();
            GalleryPickerFragment galleryPickerFragmentA = GalleryPickerFragment.a.a(zA2);
            androidx.fragment.app.H hE2 = photoPickerActivity.getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, galleryPickerFragmentA, null);
            hE2.e();
        } else if (aVar2 instanceof PhotoPickerViewModel.a.g) {
            boolean z13 = ((PhotoPickerViewModel.a.g) aVar2).f218850a;
            int i13 = PhotoPickerActivity.f218778C;
            photoPickerActivity.c2();
            if (z13) {
                InterfaceC35845m2 interfaceC35845m2 = photoPickerActivity.f218781m;
                intentO = (interfaceC35845m2 != null ? interfaceC35845m2 : null).e();
            } else {
                InterfaceC35845m2 interfaceC35845m22 = photoPickerActivity.f218781m;
                intentO = (interfaceC35845m22 != null ? interfaceC35845m22 : null).o();
            }
            try {
                C35974x2.d(intentO);
                photoPickerActivity.startActivityForResult(intentO, 1);
            } catch (Exception e12) {
                V2.f318762a.a("PhotoPickerActivity", "Error while trying to open image gallery", e12);
            }
        } else if (aVar2 instanceof PhotoPickerViewModel.a.h) {
            InterfaceC35845m2 interfaceC35845m23 = photoPickerActivity.f218781m;
            photoPickerActivity.startActivity((interfaceC35845m23 != null ? interfaceC35845m23 : null).i());
        } else if (aVar2 instanceof PhotoPickerViewModel.a.d) {
            int i14 = PhotoPickerActivity.f218778C;
            photoPickerActivity.setResult(0);
            photoPickerActivity.finish();
        } else if (aVar2 instanceof PhotoPickerViewModel.a.e) {
            photoPickerActivity.b2();
        } else if (aVar2 instanceof PhotoPickerViewModel.a.C6570a) {
            int i15 = PhotoPickerActivity.f218778C;
            photoPickerActivity.d2();
        } else if (aVar2 instanceof PhotoPickerViewModel.a.c) {
            String str = ((PhotoPickerViewModel.a.c) aVar2).f218846a;
            int i16 = PhotoPickerActivity.f218778C;
            EditPhotoFragment.a aVar4 = EditPhotoFragment.f219347y0;
            PhotoPickerViewModel photoPickerViewModel = photoPickerActivity.f218793y;
            if (photoPickerViewModel == null) {
                photoPickerViewModel = null;
            }
            PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode = photoPickerViewModel.f218819O;
            aVar4.getClass();
            EditPhotoFragment editPhotoFragmentA = EditPhotoFragment.a.a(str, photoPickerMode);
            androidx.fragment.app.H hE3 = photoPickerActivity.getSupportFragmentManager().e();
            hE3.n(R.id.fragment_container, editPhotoFragmentA, null);
            hE3.e();
        } else if (aVar2 instanceof PhotoPickerViewModel.a.b) {
            ArrayList arrayList = ((PhotoPickerViewModel.a.b) aVar2).f218845a;
            int i17 = PhotoPickerActivity.f218778C;
            if (!arrayList.isEmpty()) {
                photoPickerActivity.c2();
                photoPickerActivity.f218794z.post(new RunnableC33267s(photoPickerActivity, arrayList, 0));
            }
        }
        return G0.f406611a;
    }
}
