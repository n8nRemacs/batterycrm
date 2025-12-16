package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.profile_settings_extended.entity.GalleryWidgetItemsGroup;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsImageActor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/B;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_management_core.images.a f230382a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.P f230383b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f230384c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f230385d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f230386e;

    /* compiled from: ExtendedProfileSettingsImageActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UploadImage.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UploadImage.Type type = UploadImage.Type.f226690b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UploadImage.Type type2 = UploadImage.Type.f226690b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UploadImage.Type type3 = UploadImage.Type.f226690b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UploadImage.Type type4 = UploadImage.Type.f226690b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UploadImage.Type type5 = UploadImage.Type.f226690b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<ExtendedProfileSettingsInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f230387b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f230388c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f230389d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f230390e;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f230391b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.N f230392c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ArrayList f230393d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f230394e;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$setImagesToBack$$inlined$mapNotNull$1$2", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {232}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile_settings_extended.mvi.B$b$a$a, reason: collision with other inner class name */
            public static final class C7007a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f230395q;

                /* renamed from: r, reason: collision with root package name */
                public int f230396r;

                public C7007a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f230395q = obj;
                    this.f230396r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC43172j interfaceC43172j, Y41.l lVar, ArrayList arrayList, String str) {
                this.f230391b = interfaceC43172j;
                this.f230392c = (kotlin.jvm.internal.N) lVar;
                this.f230393d = arrayList;
                this.f230394e = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r7v4, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.profile_settings_extended.mvi.B.b.a.C7007a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.profile_settings_extended.mvi.B$b$a$a r0 = (com.avito.android.profile_settings_extended.mvi.B.b.a.C7007a) r0
                    int r1 = r0.f230396r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f230396r = r1
                    goto L18
                L13:
                    com.avito.android.profile_settings_extended.mvi.B$b$a$a r0 = new com.avito.android.profile_settings_extended.mvi.B$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f230395q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f230396r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L82
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.profile_management_core.images.a$c r6 = (com.avito.android.profile_management_core.images.a.c) r6
                    boolean r7 = r6 instanceof com.avito.android.profile_management_core.images.a.c.b
                    if (r7 == 0) goto L44
                    com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$GroupImagesUpdate r7 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$GroupImagesUpdate
                    com.avito.android.profile_management_core.images.a$c$b r6 = (com.avito.android.profile_management_core.images.a.c.b) r6
                    java.util.ArrayList r6 = r6.f226626a
                    r7.<init>(r6)
                    goto L75
                L44:
                    boolean r7 = r6 instanceof com.avito.android.profile_management_core.images.a.c.C6879a
                    if (r7 == 0) goto L85
                    kotlin.jvm.internal.N r7 = r5.f230392c
                    if (r7 == 0) goto L5a
                    r2 = r6
                    com.avito.android.profile_management_core.images.a$c$a r2 = (com.avito.android.profile_management_core.images.a.c.C6879a) r2
                    java.lang.Throwable r2 = r2.f226625a
                    java.lang.Object r7 = r7.invoke(r2)
                    com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction r7 = (com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction) r7
                    if (r7 == 0) goto L5a
                    goto L75
                L5a:
                    java.util.ArrayList r7 = r5.f230393d
                    boolean r7 = r7.isEmpty()
                    if (r7 == 0) goto L73
                    com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar r7 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar
                    com.avito.android.profile_management_core.images.a$c$a r6 = (com.avito.android.profile_management_core.images.a.c.C6879a) r6
                    java.lang.Throwable r6 = r6.f226625a
                    yc0.g$f r2 = new yc0.g$f
                    java.lang.String r4 = r5.f230394e
                    r2.<init>(r4)
                    r7.<init>(r6, r2)
                    goto L75
                L73:
                    r6 = 0
                    r7 = r6
                L75:
                    if (r7 == 0) goto L82
                    r0.f230396r = r3
                    kotlinx.coroutines.flow.j r6 = r5.f230391b
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L82
                    return r1
                L82:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                L85:
                    kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.B.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43160i interfaceC43160i, Y41.l lVar, ArrayList arrayList, String str) {
            this.f230387b = interfaceC43160i;
            this.f230388c = (kotlin.jvm.internal.N) lVar;
            this.f230389d = arrayList;
            this.f230390e = str;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f230387b.collect(new a(interfaceC43172j, this.f230388c, this.f230389d, this.f230390e), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public B(@Y61.k com.avito.android.profile_management_core.images.a aVar, @Y61.k com.avito.android.profile_settings_extended.P p12, @Y61.k com.avito.android.connection_quality.connectivity.a aVar2, @Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f230382a = aVar;
        this.f230383b = p12;
        this.f230384c = aVar2;
        this.f230385d = e12;
        this.f230386e = interfaceC28373a;
    }

    public static final Image a(B b12, UploadImage uploadImage) {
        b12.getClass();
        if (uploadImage instanceof UploadImage.ImageFromApi) {
            return ((UploadImage.ImageFromApi) uploadImage).f226684j;
        }
        if (uploadImage instanceof UploadImage.ImageFromPhotoPicker) {
            return ImageKt.toImage(((UploadImage.ImageFromPhotoPicker) uploadImage).f226689j);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final InterfaceC43160i<ExtendedProfileSettingsInternalAction> b(String str, Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> aVar, Y41.l<? super Throwable, ? extends ExtendedProfileSettingsInternalAction> lVar) {
        List<com.avito.android.profile_settings_extended.entity.v> list;
        Object next;
        List<GalleryImageItem> list2;
        com.avito.android.profile_settings_extended.entity.u uVar = aVar.invoke().f230661b;
        ?? arrayList = 0;
        arrayList = 0;
        arrayList = 0;
        arrayList = 0;
        if (uVar != null && (list = uVar.f230357b) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof GalleryWidgetItemsGroup) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((GalleryWidgetItemsGroup) next).f230282b, str)) {
                    break;
                }
            }
            GalleryWidgetItemsGroup galleryWidgetItemsGroup = (GalleryWidgetItemsGroup) next;
            if (galleryWidgetItemsGroup != null && (list2 = galleryWidgetItemsGroup.f230286f) != null) {
                List<GalleryImageItem> list3 = list2;
                arrayList = new ArrayList(C42745f0.q(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((GalleryImageItem) it2.next()).f229421d);
                }
            }
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : iterable) {
            if (obj2 instanceof UploadImage.ImageFromPhotoPicker) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            UploadImageState uploadImageState = ((UploadImage.ImageFromPhotoPicker) next2).f226686g;
            if ((uploadImageState instanceof UploadImageState.Uploaded) || (uploadImageState instanceof UploadImageState.SettingError)) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : iterable) {
            if (((UploadImage) obj3).getF226677c() instanceof com.avito.android.profile_management_core.images.entity.j) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((UploadImage) it4.next()).getF226676b());
        }
        return O2.a(arrayList6) ? new b(this.f230382a.b(str, arrayList4, arrayList6), lVar, arrayList4, str) : C43175k.w();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return kotlin.jvm.internal.L.f(this.f230382a, b12.f230382a) && kotlin.jvm.internal.L.f(this.f230383b, b12.f230383b) && kotlin.jvm.internal.L.f(this.f230384c, b12.f230384c) && kotlin.jvm.internal.L.f(this.f230385d, b12.f230385d) && kotlin.jvm.internal.L.f(this.f230386e, b12.f230386e);
    }

    public final int hashCode() {
        return this.f230386e.hashCode() + ((this.f230385d.hashCode() + ((this.f230384c.hashCode() + ((this.f230383b.hashCode() + (this.f230382a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ExtendedProfileSettingsImageActor(imageInteractor=" + this.f230382a + ", resourceProvider=" + this.f230383b + ", connectivityProvider=" + this.f230384c + ", accountStateProvider=" + this.f230385d + ", analytics=" + this.f230386e + ')';
    }
}
