package com.avito.android.beduin.common.component.photo_picker;

import Ui.InterfaceC15523b;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.work.impl.CallableC23587q;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin.common.component.photo_picker.s;
import com.avito.android.beduin.common.form.transforms.PhotoPickerTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.inject.Inject;
import ji.InterfaceC42385a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: BeduinPhotoPickerViewModel.kt */
@com.avito.android.di.B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/p;", "Lji/a;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements InterfaceC42385a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f102036a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f102037b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102038c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f102039d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.component.photo_picker.data.d f102040e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f102041f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f102042g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f102043h = new LinkedHashMap();

    /* compiled from: BeduinPhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/p$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f102044a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f102045b;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f102044a = str;
            this.f102045b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f102044a, aVar.f102044a) && L.f(this.f102045b, aVar.f102045b);
        }

        public final int hashCode() {
            return this.f102045b.hashCode() + (this.f102044a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModelKey(formId=");
            sb2.append(this.f102044a);
            sb2.append(", modelId=");
            return C22026a.c(sb2, this.f102045b, ')');
        }
    }

    /* compiled from: BeduinPhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/p$b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a f102046a;

        /* renamed from: b, reason: collision with root package name */
        public final long f102047b;

        public b(@Y61.k a aVar, long j12) {
            this.f102046a = aVar;
            this.f102047b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f102046a, bVar.f102046a) && this.f102047b == bVar.f102047b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f102047b) + (this.f102046a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UploadPhotoKey(modelKey=");
            sb2.append(this.f102046a);
            sb2.append(", photoStorageId=");
            return androidx.appcompat.app.r.u(sb2, this.f102047b, ')');
        }
    }

    /* compiled from: BeduinPhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSatisfied", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f102049c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f102050d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f102051e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ BeduinPhotoPickerModel.ImageUploadParams f102052f;

        public c(Uri uri, a aVar, long j12, BeduinPhotoPickerModel.ImageUploadParams imageUploadParams) {
            this.f102049c = uri;
            this.f102050d = aVar;
            this.f102051e = j12;
            this.f102052f = imageUploadParams;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                p.this.f(this.f102049c, this.f102050d, this.f102051e, this.f102052f);
            } else {
                p.this.c(this.f102050d, new PhotoPickerTransform.UserImageMinSizeError(this.f102051e));
            }
        }
    }

    /* compiled from: BeduinPhotoPickerViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/s$b;", "userImagesChanges", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/common/component/photo_picker/s$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f102055c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BeduinPhotoPickerModel f102056d;

        public e(a aVar, BeduinPhotoPickerModel beduinPhotoPickerModel) {
            this.f102055c = aVar;
            this.f102056d = beduinPhotoPickerModel;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            s.b bVar = (s.b) obj;
            BeduinModelTransform[] beduinModelTransformArr = {new PhotoPickerTransform.UserImages(bVar.f102077a)};
            a aVar = this.f102055c;
            p pVar = p.this;
            pVar.c(aVar, beduinModelTransformArr);
            for (BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage : bVar.f102078b) {
                BeduinPhotoPickerModel beduinPhotoPickerModel = this.f102056d;
                pVar.b(aVar, beduinPhotoPickerModel.getImageUploadParams(), beduinPhotoPickerModel.getConstraints(), photoPickerImage);
            }
            Iterator<T> it = bVar.f102079c.iterator();
            while (it.hasNext()) {
                pVar.e(aVar, (BeduinPhotoPickerModel.PhotoPickerImage) it.next());
            }
        }
    }

    /* compiled from: BeduinPhotoPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\"\u0012\u001e\b\u0001\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/util/Optional;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageDeleteParams;", "imageDeleteParamsOptional", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Ljava/util/Optional;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements l41.o {
        public g() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Optional optional = (Optional) obj;
            return (optional.isPresent() ? p.this.f102040e.a((BeduinPhotoPickerModel.ImageDeleteParams) optional.get()) : io.reactivex.rxjava3.core.z.c0(new P2.b(G0.f406611a))).d0(new q(optional));
        }
    }

    /* compiled from: BeduinPhotoPickerViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00022\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "Ljava/util/Optional;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$ImageDeleteParams;", "<name for destructuring parameter 0>", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f102060c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f102061d;

        public h(a aVar, long j12) {
            this.f102060c = aVar;
            this.f102061d = j12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            List<BeduinAction> listC;
            Q q12 = (Q) obj;
            P2 p22 = (P2) q12.f406619b;
            Optional optional = (Optional) q12.f406620c;
            boolean zF2 = L.f(p22, P2.c.f318721a);
            a aVar = this.f102060c;
            long j12 = this.f102061d;
            p pVar = p.this;
            if (zF2) {
                p.a(pVar, aVar, j12, BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Loading.f101928b);
                return;
            }
            if (!(p22 instanceof P2.a)) {
                if (p22 instanceof P2.b) {
                    pVar.c(aVar, new PhotoPickerTransform.DeletePhoto(j12));
                    return;
                }
                return;
            }
            p.a(pVar, aVar, j12, new BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Error(true));
            BeduinPhotoPickerModel.ImageDeleteParams imageDeleteParams = (BeduinPhotoPickerModel.ImageDeleteParams) optional.orElse(null);
            if (imageDeleteParams == null || (listC = imageDeleteParams.c()) == null) {
                return;
            }
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                pVar.f102038c.o((BeduinAction) it.next());
            }
        }
    }

    /* compiled from: BeduinPhotoPickerViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel$PhotoPickerImage;", "loadingState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f102064c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f102065d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ BeduinPhotoPickerModel.ImageUploadParams f102066e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f102067f;

        public j(a aVar, long j12, BeduinPhotoPickerModel.ImageUploadParams imageUploadParams, b bVar) {
            this.f102064c = aVar;
            this.f102065d = j12;
            this.f102066e = imageUploadParams;
            this.f102067f = bVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean zEquals = p22.equals(P2.c.f318721a);
            a aVar = this.f102064c;
            long j12 = this.f102065d;
            p pVar = p.this;
            if (zEquals) {
                p.a(pVar, aVar, j12, BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Loading.f101928b);
                return;
            }
            boolean z12 = p22 instanceof P2.a;
            b bVar = this.f102067f;
            if (z12) {
                p.a(pVar, aVar, j12, new BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Error(true));
                List<BeduinAction> listC = this.f102066e.c();
                if (listC != null) {
                    Iterator<T> it = listC.iterator();
                    while (it.hasNext()) {
                        pVar.f102038c.o((BeduinAction) it.next());
                    }
                }
                io.reactivex.rxjava3.subjects.h hVar = (io.reactivex.rxjava3.subjects.h) pVar.f102043h.remove(bVar);
                if (hVar != null) {
                    hVar.onSuccess(Optional.empty());
                    return;
                }
                return;
            }
            if (p22 instanceof P2.b) {
                BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage = (BeduinPhotoPickerModel.PhotoPickerImage) ((P2.b) p22).f318720a;
                pVar.c(aVar, new PhotoPickerTransform.UserImage(this.f102065d, photoPickerImage.getId(), photoPickerImage.getUrls(), photoPickerImage.getImageDeleteParams(), BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Loaded.f101927b, photoPickerImage.getControlButton(), photoPickerImage.h()));
                List<BeduinAction> listF = photoPickerImage.f();
                if (listF != null) {
                    Iterator<T> it2 = listF.iterator();
                    while (it2.hasNext()) {
                        pVar.f102038c.o((BeduinAction) it2.next());
                    }
                }
                io.reactivex.rxjava3.subjects.h hVar2 = (io.reactivex.rxjava3.subjects.h) pVar.f102043h.remove(bVar);
                if (hVar2 != null) {
                    hVar2.onSuccess(Optional.ofNullable(photoPickerImage.getImageDeleteParams()));
                }
            }
        }
    }

    @Inject
    public p(@Y61.k s sVar, @Y61.k com.avito.android.beduin.common.form.store.b bVar, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.beduin.common.component.photo_picker.data.d dVar) {
        this.f102036a = sVar;
        this.f102037b = bVar;
        this.f102038c = interfaceC15523b;
        this.f102039d = interfaceC35745a5;
        this.f102040e = dVar;
    }

    public static final void a(p pVar, a aVar, long j12, BeduinPhotoPickerModel.PhotoPickerImage.LoadingState loadingState) {
        pVar.getClass();
        pVar.c(aVar, new PhotoPickerTransform.PhotoLoadingState(j12, loadingState));
    }

    public final void b(a aVar, BeduinPhotoPickerModel.ImageUploadParams imageUploadParams, BeduinPhotoPickerModel.PhotoPickerConstraints photoPickerConstraints, BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage) {
        Long l12 = photoPickerImage.f101921c;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            Image urls = photoPickerImage.getUrls();
            L0 l02 = this.f102036a.f102076b;
            Uri uriB = C35829k2.b(urls, l02.c(), l02.d(), 10.0f, 0, 52).b();
            if (uriB == null || imageUploadParams == null) {
                c(aVar, new PhotoPickerTransform.DeletePhoto(jLongValue));
                return;
            }
            BeduinPhotoPickerModel.PhotoPickerConstraints.MinSizeConstraint minSize = photoPickerConstraints != null ? photoPickerConstraints.getMinSize() : null;
            if (minSize == null) {
                f(uriB, aVar, jLongValue, imageUploadParams);
                return;
            }
            com.avito.android.beduin.common.component.photo_picker.data.d dVar = this.f102040e;
            dVar.getClass();
            S s5 = new G(new CallableC23587q(dVar, uriB, minSize, 2)).z(dVar.f101964c.a()).s(this.f102039d.e());
            c cVar = new c(uriB, aVar, jLongValue, imageUploadParams);
            final V2 v22 = V2.f318762a;
            io.reactivex.rxjava3.disposables.d dVarX = s5.x(cVar, new l41.g() { // from class: com.avito.android.beduin.common.component.photo_picker.p.d
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            });
            LinkedHashMap linkedHashMap = this.f102042g;
            Object cVar2 = linkedHashMap.get(aVar);
            if (cVar2 == null) {
                cVar2 = new io.reactivex.rxjava3.disposables.c();
                linkedHashMap.put(aVar, cVar2);
            }
            ((io.reactivex.rxjava3.disposables.e) cVar2).b(dVarX);
        }
    }

    public final void c(a aVar, BeduinModelTransform... beduinModelTransformArr) {
        InterfaceC43779a interfaceC43779a = this.f102037b.get(aVar.f102044a);
        if (interfaceC43779a != null) {
            com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a, aVar.f102045b, (BeduinModelTransform[]) Arrays.copyOf(beduinModelTransformArr, beduinModelTransformArr.length));
        }
    }

    public final void d(@Y61.k String str, @Y61.k String str2) {
        a aVar = new a(str, str2);
        InterfaceC43779a interfaceC43779a = this.f102037b.get(str);
        BeduinModel beduinModelB = interfaceC43779a != null ? interfaceC43779a.b(str2) : null;
        BeduinPhotoPickerModel beduinPhotoPickerModel = beduinModelB instanceof BeduinPhotoPickerModel ? (BeduinPhotoPickerModel) beduinModelB : null;
        if (beduinPhotoPickerModel == null) {
            return;
        }
        s sVar = this.f102036a;
        sVar.getClass();
        List<BeduinPhotoPickerModel.PhotoPickerImage> listL = beduinPhotoPickerModel.l();
        if (listL == null) {
            listL = C42784z0.f406748b;
        }
        List<BeduinPhotoPickerModel.PhotoPickerImage> list = listL;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list) {
            linkedHashMap.put(((BeduinPhotoPickerModel.PhotoPickerImage) obj).f101921c, obj);
        }
        S s5 = sVar.f102075a.a("beduin_photo_picker_user_".concat(beduinPhotoPickerModel.getF100853b())).d0(t.f102080b).S().r(new u(listL, linkedHashMap, beduinPhotoPickerModel)).s(this.f102039d.e());
        e eVar = new e(aVar, beduinPhotoPickerModel);
        final V2 v22 = V2.f318762a;
        io.reactivex.rxjava3.disposables.d dVarX = s5.x(eVar, new l41.g() { // from class: com.avito.android.beduin.common.component.photo_picker.p.f
            @Override // l41.g
            public final void accept(Object obj2) {
                v22.f((Throwable) obj2);
            }
        });
        LinkedHashMap linkedHashMap2 = this.f102042g;
        Object cVar = linkedHashMap2.get(aVar);
        if (cVar == null) {
            cVar = new io.reactivex.rxjava3.disposables.c();
            linkedHashMap2.put(aVar, cVar);
        }
        ((io.reactivex.rxjava3.disposables.e) cVar).b(dVarX);
    }

    public final void e(a aVar, BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage) {
        Long l12 = photoPickerImage.f101921c;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            I iQ2 = (io.reactivex.rxjava3.subjects.h) this.f102043h.get(new b(aVar, jLongValue));
            if (photoPickerImage.getImageDeleteParams() != null) {
                iQ2 = I.q(Optional.of(photoPickerImage.getImageDeleteParams()));
            } else if (iQ2 == null) {
                iQ2 = I.q(Optional.empty());
            }
            I0 i0J0 = iQ2.p(new g()).j0(this.f102039d.e());
            h hVar = new h(aVar, jLongValue);
            final V2 v22 = V2.f318762a;
            io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(hVar, new l41.g() { // from class: com.avito.android.beduin.common.component.photo_picker.p.i
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            }, io.reactivex.rxjava3.internal.functions.a.f401993c);
            LinkedHashMap linkedHashMap = this.f102042g;
            Object cVar = linkedHashMap.get(aVar);
            if (cVar == null) {
                cVar = new io.reactivex.rxjava3.disposables.c();
                linkedHashMap.put(aVar, cVar);
            }
            ((io.reactivex.rxjava3.disposables.e) cVar).b(dVarV0);
        }
    }

    public final void f(Uri uri, a aVar, long j12, BeduinPhotoPickerModel.ImageUploadParams imageUploadParams) {
        b bVar = new b(aVar, j12);
        LinkedHashMap linkedHashMap = this.f102043h;
        if (linkedHashMap.get(bVar) == null) {
            linkedHashMap.put(bVar, new io.reactivex.rxjava3.subjects.h());
        }
        I0 i0J0 = this.f102040e.b(imageUploadParams, uri).j0(this.f102039d.e());
        j jVar = new j(aVar, j12, imageUploadParams, bVar);
        final V2 v22 = V2.f318762a;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(jVar, new l41.g() { // from class: com.avito.android.beduin.common.component.photo_picker.p.k
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
        LinkedHashMap linkedHashMap2 = this.f102042g;
        Object cVar = linkedHashMap2.get(aVar);
        if (cVar == null) {
            cVar = new io.reactivex.rxjava3.disposables.c();
            linkedHashMap2.put(aVar, cVar);
        }
        ((io.reactivex.rxjava3.disposables.e) cVar).b(dVarV0);
    }

    @Override // ji.InterfaceC42385a
    public final void onCleared() {
        Iterator it = this.f102042g.entrySet().iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.c) ((Map.Entry) it.next()).getValue()).dispose();
        }
    }
}
