package com.avito.android.profile_management_core.images;

import Y41.p;
import android.net.Uri;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.profile_management_core.images.a;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.extended.modification.ModificationBody;
import com.avito.android.remote.model.extended.modification.UploadImageModification;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import jb0.InterfaceC42346a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: ProfileManagementImageInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/d;", "Lcom/avito/android/profile_management_core/images/a;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.profile_management_core.images.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f226640a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.converter.f f226641b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f226642c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f226643d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f226644e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f226645f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f226646g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f226647h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap f226648i = new ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap f226649j = new ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap f226650k = new ConcurrentHashMap();

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/extended/modification/ModificationBody;", "img", "Lcom/avito/android/profile_management_core/images/entity/UploadImage$ImageFromPhotoPicker;", "uploadId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<UploadImage.ImageFromPhotoPicker, Long, ModificationBody> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final ModificationBody invoke(UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, Long l12) {
            long jLongValue = l12.longValue();
            return d.l(d.this, imageFromPhotoPicker, jLongValue);
        }
    }

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$d;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/profile_management_core/images/a$d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$uploadAndSetImage$1", f = "ProfileManagementImageInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<a.d, Continuation<? super InterfaceC43160i<? extends a.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f226652q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ UploadImage.ImageFromPhotoPicker f226654s;

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/extended/modification/ModificationBody;", "img", "Lcom/avito/android/profile_management_core/images/entity/UploadImage$ImageFromPhotoPicker;", "uploadId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements p<UploadImage.ImageFromPhotoPicker, Long, ModificationBody> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ d f226655l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(2);
                this.f226655l = dVar;
            }

            @Override // Y41.p
            public final ModificationBody invoke(UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, Long l12) {
                long jLongValue = l12.longValue();
                return d.l(this.f226655l, imageFromPhotoPicker, jLongValue);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f226654s = imageFromPhotoPicker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = d.this.new b(this.f226654s, continuation);
            bVar.f226652q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(a.d dVar, Continuation<? super InterfaceC43160i<? extends a.d>> continuation) {
            return ((b) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a.d dVar = (a.d) this.f226652q;
            if (dVar instanceof a.d.b) {
                UploadImageState uploadImageState = ((a.d.b) dVar).f226628a.f226686g;
                if (uploadImageState instanceof UploadImageState.Uploaded) {
                    long j12 = ((UploadImageState.Uploaded) uploadImageState).f226711b;
                    d dVar2 = d.this;
                    return dVar2.o(this.f226654s, j12, new a(dVar2));
                }
            }
            return new C43210w(dVar);
        }
    }

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$d;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/profile_management_core/images/a$d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$uploadAndSetImage$2", f = "ProfileManagementImageInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<a.d, Continuation<? super InterfaceC43160i<? extends a.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f226656q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ UploadImage.ImageFromPhotoPicker f226658s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ p<UploadImage.ImageFromPhotoPicker, Long, ModificationBody> f226659t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, p<? super UploadImage.ImageFromPhotoPicker, ? super Long, ModificationBody> pVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f226658s = imageFromPhotoPicker;
            this.f226659t = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = d.this.new c(this.f226658s, this.f226659t, continuation);
            cVar.f226656q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(a.d dVar, Continuation<? super InterfaceC43160i<? extends a.d>> continuation) {
            return ((c) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a.d dVar = (a.d) this.f226656q;
            if (dVar instanceof a.d.b) {
                UploadImageState uploadImageState = ((a.d.b) dVar).f226628a.f226686g;
                if (uploadImageState instanceof UploadImageState.Uploaded) {
                    return d.this.o(this.f226658s, ((UploadImageState.Uploaded) uploadImageState).f226711b, this.f226659t);
                }
            }
            return new C43210w(dVar);
        }
    }

    @Inject
    public d(@Y61.k h31.e<D0> eVar, @Y61.k com.avito.android.photo_picker.converter.f fVar, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k R0 r02, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k h31.e<Gson> eVar2, @Y61.k @InterfaceC42346a String str) {
        this.f226640a = eVar;
        this.f226641b = fVar;
        this.f226642c = bVar;
        this.f226643d = sharedPhotosStorage;
        this.f226644e = r02;
        this.f226645f = interfaceC35863o4;
        this.f226646g = eVar2;
        this.f226647h = str;
    }

    public static final ModificationBody l(d dVar, UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, long j12) {
        dVar.getClass();
        return new ModificationBody(Collections.singletonList(new UploadImageModification(imageFromPhotoPicker.f226687h, Collections.singletonList(new UploadImageModification.Operation(imageFromPhotoPicker.f226685f, UploadImageModification.OperationType.ADD, new UploadImageModification.Operation.Value(j12), null, 8, null)), null, 4, null)));
    }

    public static final UploadImage.ImageFromPhotoPicker m(d dVar, PhotoUpload photoUpload, String str, InterfaceC35863o4 interfaceC35863o4, UploadImage.Type type, String str2) {
        dVar.getClass();
        if (str2 == null) {
            str2 = interfaceC35863o4.a();
        }
        String str3 = str2;
        Uri uri = photoUpload.f216305g;
        if (uri != null) {
            return new UploadImage.ImageFromPhotoPicker(str3, UploadImageState.Selected.f226706b, str, type, uri);
        }
        throw new IllegalStateException("Uri must not be null");
    }

    public static final ArrayList n(d dVar, ArrayList arrayList, Y41.l lVar) {
        dVar.getClass();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UploadImage.ImageFromPhotoPicker imageFromPhotoPickerG = (UploadImage.ImageFromPhotoPicker) it.next();
            UploadImageState uploadImageState = (UploadImageState) lVar.invoke(imageFromPhotoPickerG.f226685f);
            if (uploadImageState != null) {
                imageFromPhotoPickerG = UploadImage.ImageFromPhotoPicker.g(imageFromPhotoPickerG, uploadImageState);
            }
            arrayList2.add(imageFromPhotoPickerG);
        }
        return arrayList2;
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.l
    public final Object a(@Y61.k SuspendLambda suspendLambda) {
        Object objG = C43259k.g(this.f226644e.a(), new l(this, null), suspendLambda);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.k
    public final InterfaceC43160i b(@Y61.k String str, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2) {
        return C43175k.G(new g(this, str, arrayList, arrayList2, null));
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.l
    public final Object c(@Y61.k SuspendLambda suspendLambda) {
        Object objG = C43259k.g(this.f226644e.a(), new k(this, null), suspendLambda);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.profile_management_core.images.a
    public final void d(@Y61.k List<? extends Uri> list) {
        for (Uri uri : list) {
            this.f226650k.put(uri.toString(), uri);
        }
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.k
    public final X e(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker) {
        return new X(C43175k.G(new h(this, imageFromPhotoPicker, null)), new i(this, imageFromPhotoPicker, null));
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.k
    public final InterfaceC43160i<a.d> f(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, @Y61.k p<? super UploadImage.ImageFromPhotoPicker, ? super Long, ModificationBody> pVar) {
        return C43175k.C(new c(imageFromPhotoPicker, pVar, null), e(imageFromPhotoPicker));
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.k
    public final InterfaceC43160i<a.d> g(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker) {
        UploadImageState uploadImageState = imageFromPhotoPicker.f226686g;
        return uploadImageState instanceof UploadImageState.UploadingError ? k(imageFromPhotoPicker) : uploadImageState instanceof UploadImageState.SettingError ? o(imageFromPhotoPicker, ((UploadImageState.SettingError) uploadImageState).f226710c, new a()) : C43175k.w();
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.l
    public final Object h(@Y61.k UploadImage uploadImage, @Y61.k Continuation continuation) {
        return C43259k.g(this.f226644e.a(), new com.avito.android.profile_management_core.images.b(uploadImage, this, null), continuation);
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.l
    public final Object i(@Y61.k String str, @Y61.k UploadImage.Type type, @Y61.l String str2, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f226644e.a(), new com.avito.android.profile_management_core.images.c(this, str, type, str2, null), suspendLambda);
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m j(@Y61.k List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C43152f0(e((UploadImage.ImageFromPhotoPicker) it.next()), new j(3, null)));
        }
        return C43175k.M(arrayList);
    }

    @Override // com.avito.android.profile_management_core.images.a
    @Y61.k
    public final InterfaceC43160i<a.d> k(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker) {
        return C43175k.C(new b(imageFromPhotoPicker, null), e(imageFromPhotoPicker));
    }

    public final X o(UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, long j12, p pVar) {
        return new X(C43175k.G(new e(imageFromPhotoPicker, this, pVar, j12, null)), new f(this, imageFromPhotoPicker, null));
    }
}
