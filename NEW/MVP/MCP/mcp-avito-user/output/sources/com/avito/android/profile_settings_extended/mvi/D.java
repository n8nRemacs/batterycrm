package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.profile_settings_extended.entity.GalleryWidgetItemsGroup;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsImageActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processCommonImageAction$2", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {71, 92, 95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class D extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230403q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230404r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f230405s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230406t;

    /* compiled from: ExtendedProfileSettingsImageActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230407a;

        static {
            int[] iArr = new int[UploadImage.Type.values().length];
            try {
                UploadImage.Type type = UploadImage.Type.f226690b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UploadImage.Type type2 = UploadImage.Type.f226690b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UploadImage.Type type3 = UploadImage.Type.f226690b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UploadImage.Type type4 = UploadImage.Type.f226690b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UploadImage.Type type5 = UploadImage.Type.f226690b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UploadImage.Type type6 = UploadImage.Type.f226690b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f230407a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Y41.a aVar, B b12, Continuation continuation) {
        super(2, continuation);
        this.f230405s = b12;
        this.f230406t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        D d12 = new D(this.f230406t, this.f230405s, continuation);
        d12.f230404r = obj;
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((D) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230403q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f230404r;
            B b12 = this.f230405s;
            if (b12.f230384c.c()) {
                com.avito.android.profile_settings_extended.mvi.entity.a aVarInvoke = this.f230406t.invoke();
                UploadImage uploadImage = aVarInvoke.f230665f;
                UploadImage.Type f226679e = uploadImage != null ? uploadImage.getF226679e() : null;
                int i13 = -1;
                int i14 = f226679e == null ? -1 : a.f230407a[f226679e.ordinal()];
                int i15 = 0;
                if (i14 == 1 || i14 == 2) {
                    com.avito.android.profile_settings_extended.entity.u uVar = aVarInvoke.f230661b;
                    List<com.avito.android.profile_settings_extended.entity.v> list = uVar != null ? uVar.f230357b : null;
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof GalleryWidgetItemsGroup) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    loop1: while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        List<GalleryImageItem> list2 = ((GalleryWidgetItemsGroup) next).f230286f;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (kotlin.jvm.internal.L.f(((GalleryImageItem) it2.next()).f229421d.getF226676b(), uploadImage.getF226676b())) {
                                    break loop1;
                                }
                            }
                        }
                    }
                    GalleryWidgetItemsGroup galleryWidgetItemsGroup = (GalleryWidgetItemsGroup) next;
                    List<GalleryImageItem> list3 = galleryWidgetItemsGroup != null ? galleryWidgetItemsGroup.f230286f : null;
                    if (list3 == null) {
                        list3 = C42784z0.f406748b;
                    }
                    List<GalleryImageItem> list4 = list3;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
                    Iterator<T> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(B.a(b12, ((GalleryImageItem) it3.next()).f229421d));
                    }
                    Iterator<GalleryImageItem> it4 = list3.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (kotlin.jvm.internal.L.f(it4.next().f229421d.getF226676b(), uploadImage.getF226676b())) {
                            i13 = i15;
                            break;
                        }
                        i15++;
                    }
                    ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenGalleryEvent openGalleryEvent = new ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenGalleryEvent(arrayList2, i13);
                    this.f230403q = 2;
                    if (interfaceC43172j.emit(openGalleryEvent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i14 == 3) {
                    ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenGalleryEvent openGalleryEvent2 = new ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenGalleryEvent(Collections.singletonList(B.a(b12, uploadImage)), 0, 2, null);
                    this.f230403q = 3;
                    if (interfaceC43172j.emit(openGalleryEvent2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar showToastBar = new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar(b12.f230383b.i(), true);
                this.f230403q = 1;
                if (interfaceC43172j.emit(showToastBar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
