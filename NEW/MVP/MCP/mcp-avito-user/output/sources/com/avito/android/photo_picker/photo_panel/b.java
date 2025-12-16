package com.avito.android.photo_picker.photo_panel;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.SelectedPhoto;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoPanelViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_picker/photo_panel/b;", "Landroidx/lifecycle/M0;", "<init>", "()V", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @l
    public y f219929E;

    /* renamed from: J, reason: collision with root package name */
    public PhotoPickerViewModel f219930J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final C23038g0<a> f219931K = new C23038g0<>();

    /* compiled from: PhotoPanelViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/photo_panel/b$a;", "", "<init>", "()V", "a", "Lcom/avito/android/photo_picker/photo_panel/b$a$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: PhotoPanelViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/photo_panel/b$a$a;", "Lcom/avito/android/photo_picker/photo_panel/b$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.photo_panel.b$a$a, reason: collision with other inner class name */
        public static final class C6611a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f219932a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Uri f219933b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Uri f219934c;

            public C6611a(int i12, @l Uri uri, @l Uri uri2) {
                super(null);
                this.f219932a = i12;
                this.f219933b = uri;
                this.f219934c = uri2;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final void ke(ArrayList arrayList) {
        C23038g0<a> c23038g0 = this.f219931K;
        int size = arrayList.size();
        SelectedPhoto selectedPhoto = (SelectedPhoto) C42745f0.S(arrayList);
        Uri uri = selectedPhoto != null ? selectedPhoto.f218866b : null;
        SelectedPhoto selectedPhoto2 = (SelectedPhoto) C42745f0.S(C42745f0.x(arrayList));
        c23038g0.setValue(new a.C6611a(size, uri, selectedPhoto2 != null ? selectedPhoto2.f218866b : null));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        y yVar = this.f219929E;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
