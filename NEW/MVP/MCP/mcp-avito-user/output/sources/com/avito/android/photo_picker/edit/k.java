package com.avito.android.photo_picker.edit;

import android.net.Uri;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.b0;
import com.avito.android.krop.util.Transformation;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.SelectedPhoto;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EditPhotoViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/edit/k;", "Landroidx/lifecycle/M0;", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f219410E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f219411J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final b0 f219412K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final t f219413L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory.PhotoPickerMode f219414M;

    /* renamed from: O, reason: collision with root package name */
    public SelectedPhoto f219416O;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f219415N = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<a> f219417P = new C23038g0<>();

    /* compiled from: EditPhotoViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/photo_picker/edit/k$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/photo_picker/edit/k$a$a;", "Lcom/avito/android/photo_picker/edit/k$a$b;", "Lcom/avito/android/photo_picker/edit/k$a$c;", "Lcom/avito/android/photo_picker/edit/k$a$d;", "Lcom/avito/android/photo_picker/edit/k$a$e;", "Lcom/avito/android/photo_picker/edit/k$a$f;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: EditPhotoViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/edit/k$a$a;", "Lcom/avito/android/photo_picker/edit/k$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.edit.k$a$a, reason: collision with other inner class name */
        public static final class C6596a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6596a f219418a = new C6596a();

            public C6596a() {
                super(null);
            }
        }

        /* compiled from: EditPhotoViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/edit/k$a$b;", "Lcom/avito/android/photo_picker/edit/k$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f219419a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: EditPhotoViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/k$a$c;", "Lcom/avito/android/photo_picker/edit/k$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f219420a;

            public c() {
                super(null);
                this.f219420a = -90;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f219420a == ((c) obj).f219420a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f219420a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("Rotate(byAngle="), this.f219420a, ')');
            }
        }

        /* compiled from: EditPhotoViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/k$a$d;", "Lcom/avito/android/photo_picker/edit/k$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final SelectedPhoto f219421a;

            public d(@Y61.k SelectedPhoto selectedPhoto) {
                super(null);
                this.f219421a = selectedPhoto;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f219421a, ((d) obj).f219421a);
            }

            public final int hashCode() {
                return this.f219421a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "SaveAndClosePhoto(editedPhoto=" + this.f219421a + ')';
            }
        }

        /* compiled from: EditPhotoViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/edit/k$a$e;", "Lcom/avito/android/photo_picker/edit/k$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f219422a = new e();

            public e() {
                super(null);
            }
        }

        /* compiled from: EditPhotoViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/k$a$f;", "Lcom/avito/android/photo_picker/edit/k$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Uri f219423a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Transformation f219424b;

            public f(@Y61.k Uri uri, @Y61.l Transformation transformation) {
                super(null);
                this.f219423a = uri;
                this.f219424b = transformation;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return L.f(this.f219423a, fVar.f219423a) && L.f(this.f219424b, fVar.f219424b);
            }

            public final int hashCode() {
                int iHashCode = this.f219423a.hashCode() * 31;
                Transformation transformation = this.f219424b;
                return iHashCode + (transformation == null ? 0 : transformation.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "ShowImage(uri=" + this.f219423a + ", state=" + this.f219424b + ')';
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditPhotoViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PhotoPickerIntentFactory.CropType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhotoPickerIntentFactory.CropType cropType = PhotoPickerIntentFactory.CropType.f218802b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public k(@Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k b0 b0Var, @Y61.k t tVar, @Y61.k PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode) {
        this.f219410E = sharedPhotosStorage;
        this.f219411J = interfaceC35745a5;
        this.f219412K = b0Var;
        this.f219413L = tVar;
        this.f219414M = photoPickerMode;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f219415N.dispose();
    }
}
