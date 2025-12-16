package com.avito.android.photo_picker.gallery;

import Y61.k;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.R;
import com.avito.android.permissions.G;
import com.avito.android.permissions.t;
import com.avito.android.permissions.x;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q80.C47254a;
import q80.InterfaceC47255b;

/* compiled from: GalleryPickerViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e;", "Landroidx/lifecycle/M0;", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final x f219499E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f219500J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final InterfaceC47255b f219501K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final com.avito.android.photo_picker.gallery.gallery_list.c f219502L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final G f219503M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f219504N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public String f219505O = "";

    /* renamed from: P, reason: collision with root package name */
    @k
    public final ArrayList f219506P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final ArrayList f219507Q = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f219508R = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: S, reason: collision with root package name */
    @k
    public final C23038g0<a> f219509S = new C23038g0<>();

    /* renamed from: T, reason: collision with root package name */
    public PhotoPickerViewModel f219510T;

    /* compiled from: GalleryPickerViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "Lcom/avito/android/photo_picker/gallery/e$a$a;", "Lcom/avito/android/photo_picker/gallery/e$a$b;", "Lcom/avito/android/photo_picker/gallery/e$a$c;", "Lcom/avito/android/photo_picker/gallery/e$a$d;", "Lcom/avito/android/photo_picker/gallery/e$a$e;", "Lcom/avito/android/photo_picker/gallery/e$a$f;", "Lcom/avito/android/photo_picker/gallery/e$a$g;", "Lcom/avito/android/photo_picker/gallery/e$a$h;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: GalleryPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a$a;", "Lcom/avito/android/photo_picker/gallery/e$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.gallery.e$a$a, reason: collision with other inner class name */
        public static final class C6600a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C6600a f219511a = new C6600a();

            public C6600a() {
                super(null);
            }
        }

        /* compiled from: GalleryPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a$b;", "Lcom/avito/android/photo_picker/gallery/e$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f219512a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: GalleryPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a$c;", "Lcom/avito/android/photo_picker/gallery/e$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList f219513a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ArrayList f219514b;

            public c(@k ArrayList arrayList, @k ArrayList arrayList2) {
                super(null);
                this.f219513a = arrayList;
                this.f219514b = arrayList2;
            }
        }

        /* compiled from: GalleryPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a$d;", "Lcom/avito/android/photo_picker/gallery/e$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f219515a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: GalleryPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a$e;", "Lcom/avito/android/photo_picker/gallery/e$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_picker.gallery.e$a$e, reason: collision with other inner class name */
        public static final class C6601e extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f219516a;

            public C6601e(@k PrintableText printableText) {
                super(null);
                this.f219516a = printableText;
            }
        }

        /* compiled from: GalleryPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a$f;", "Lcom/avito/android/photo_picker/gallery/e$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f219517a;

            public f(int i12) {
                super(null);
                this.f219517a = i12;
            }
        }

        /* compiled from: GalleryPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a$g;", "Lcom/avito/android/photo_picker/gallery/e$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class g extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final g f219518a = new g();

            public g() {
                super(null);
            }
        }

        /* compiled from: GalleryPickerViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/gallery/e$a$h;", "Lcom/avito/android/photo_picker/gallery/e$a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class h extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList f219519a;

            public h(@k ArrayList arrayList) {
                super(null);
                this.f219519a = arrayList;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GalleryPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e.this.f219509S.setValue(a.g.f219518a);
        }
    }

    /* compiled from: GalleryPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/photo_picker/gallery/gallery_list/k;", "", "Lq80/a;", "result", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Q q12 = (Q) obj;
            e eVar = e.this;
            eVar.f219506P.clear();
            for (com.avito.android.photo_picker.gallery.gallery_list.k kVar : (List) q12.f406619b) {
                PhotoPickerViewModel photoPickerViewModel = eVar.f219510T;
                if (photoPickerViewModel == null) {
                    photoPickerViewModel = null;
                }
                kVar.f219548h = photoPickerViewModel.ye(kVar.f219545e);
                eVar.f219506P.add(kVar);
            }
            C47254a c47254a = new C47254a("all_photos", com.avito.android.printable_text.b.c(R.string.photo_picker_folder_all_photos, new Serializable[0]), null, 4, null);
            C47254a c47254a2 = new C47254a("other_source", com.avito.android.printable_text.b.c(R.string.photo_picker_folder_other_sources, new Serializable[0]), null, 4, null);
            ArrayList arrayList = eVar.f219507Q;
            arrayList.clear();
            arrayList.add(c47254a);
            arrayList.addAll((Collection) q12.f406620c);
            arrayList.add(c47254a2);
            eVar.ke();
            eVar.f219509S.setValue(new a.c(eVar.le(), arrayList));
        }
    }

    /* compiled from: GalleryPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f219522b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to load images and folders from device", (Throwable) obj);
        }
    }

    public e(@k x xVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC47255b interfaceC47255b, @k com.avito.android.photo_picker.gallery.gallery_list.c cVar, @k G g12, boolean z12) {
        this.f219499E = xVar;
        this.f219500J = interfaceC35745a5;
        this.f219501K = interfaceC47255b;
        this.f219502L = cVar;
        this.f219503M = g12;
        this.f219504N = z12;
    }

    public final void O() {
        C23038g0<a> c23038g0 = this.f219509S;
        boolean z12 = this.f219504N;
        int i12 = R.string.allow_access;
        x xVar = this.f219499E;
        if (!z12) {
            t.f215141z.getClass();
            String str = t.a.f215144c;
            if (xVar.b(str) || xVar.b("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                c23038g0.setValue(a.C6600a.f219511a);
                me();
                return;
            } else {
                if (!xVar.a(str)) {
                    i12 = R.string.go_to_settings;
                }
                c23038g0.setValue(new a.f(i12));
                return;
            }
        }
        t.f215141z.getClass();
        String str2 = t.a.f215144c;
        if (xVar.b(str2) || xVar.b("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
            c23038g0.setValue(a.C6600a.f219511a);
            me();
            return;
        }
        boolean zD2 = this.f219503M.d();
        boolean zA2 = xVar.a(str2);
        if (zD2 && !zA2) {
            i12 = R.string.go_to_settings;
        }
        c23038g0.setValue(new a.f(i12));
    }

    public final void ke() {
        if (this.f219504N) {
            PhotoPickerViewModel photoPickerViewModel = this.f219510T;
            if (photoPickerViewModel == null) {
                photoPickerViewModel = null;
            }
            int size = photoPickerViewModel.f218829Y.size();
            PhotoPickerViewModel photoPickerViewModel2 = this.f219510T;
            int i12 = (photoPickerViewModel2 != null ? photoPickerViewModel2 : null).f218820P;
            ArrayList arrayList = this.f219506P;
            if (size != i12) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.avito.android.photo_picker.gallery.gallery_list.k) it.next()).f219552l = false;
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.avito.android.photo_picker.gallery.gallery_list.k kVar = (com.avito.android.photo_picker.gallery.gallery_list.k) it2.next();
                    if (kVar.f219548h == 0) {
                        kVar.f219552l = true;
                    }
                }
            }
        }
    }

    public final ArrayList le() {
        int length = this.f219505O.length();
        ArrayList arrayList = this.f219506P;
        if (length != 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (L.f(((com.avito.android.photo_picker.gallery.gallery_list.k) next).f219546f, this.f219505O)) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        C23038g0<a> c23038g0 = this.f219509S;
        if (zIsEmpty) {
            c23038g0.setValue(a.g.f219518a);
        } else {
            c23038g0.setValue(a.b.f219512a);
        }
        return arrayList;
    }

    public final void me() {
        C42006d c42006dO = this.f219501K.O();
        InterfaceC35745a5 interfaceC35745a5 = this.f219500J;
        this.f219508R.b(c42006dO.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).i(new b()).x(new c(), d.f219522b));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f219508R.e();
        super.onCleared();
    }
}
