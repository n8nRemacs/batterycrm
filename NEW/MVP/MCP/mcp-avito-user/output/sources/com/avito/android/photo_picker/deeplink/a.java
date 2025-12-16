package com.avito.android.photo_picker.deeplink;

import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink.PhotoPickerDeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.util.R0;
import fv.C40483b;
import java.util.ArrayList;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import p80.InterfaceC46916a;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PhotoPickerDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/deeplink/PhotoPickerDeepLink;", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<PhotoPickerDeepLink> {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f219325l = 0;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f219326g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final PhotoPickerIntentFactory f219327h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Context f219328i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.b f219329j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC46916a f219330k;

    /* compiled from: PhotoPickerDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_picker/deeplink/a$a;", "", "<init>", "()V", "", "OPEN_PHOTO_PICKER_VIA_DEEPLINK", "Ljava/lang/String;", "PHOTO_PICKER_UPLOAD_TYPE", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.deeplink.a$a, reason: collision with other inner class name */
    public static final class C6589a {
        public /* synthetic */ C6589a(C42822w c42822w) {
            this();
        }

        public C6589a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f219331b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f219332c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.photo_picker.deeplink.a$b$a, reason: collision with other inner class name */
        public static final class C6590a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f219333b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f219334c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.photo_picker.deeplink.PhotoPickerDeepLinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "PhotoPickerDeepLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.photo_picker.deeplink.a$b$a$a, reason: collision with other inner class name */
            public static final class C6591a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f219335q;

                /* renamed from: r, reason: collision with root package name */
                public int f219336r;

                public C6591a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f219335q = obj;
                    this.f219336r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6590a.this.emit(null, this);
                }
            }

            public C6590a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f219333b = interfaceC43172j;
                this.f219334c = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.photo_picker.deeplink.a.b.C6590a.C6591a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.photo_picker.deeplink.a$b$a$a r0 = (com.avito.android.photo_picker.deeplink.a.b.C6590a.C6591a) r0
                    int r1 = r0.f219336r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f219336r = r1
                    goto L18
                L13:
                    com.avito.android.photo_picker.deeplink.a$b$a$a r0 = new com.avito.android.photo_picker.deeplink.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f219335q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f219336r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437155a
                    com.avito.android.photo_picker.deeplink.a r2 = r4.f219334c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f219336r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f219333b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_picker.deeplink.a.b.C6590a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f219331b = interfaceC43160i;
            this.f219332c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f219331b).collect(new C6590a(interfaceC43172j, this.f219332c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: PhotoPickerDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_picker.deeplink.PhotoPickerDeepLinkHandler$onCreateSuspend$3", f = "PhotoPickerDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f219338q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.f219338q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((c) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C47918a c47918a = (C47918a) this.f219338q;
            int i12 = a.f219325l;
            a aVar = a.this;
            aVar.getClass();
            Intent intent = c47918a.f437157c;
            ArrayList parcelableArrayListExtra = null;
            Uri data = intent != null ? intent.getData() : null;
            Intent intent2 = c47918a.f437157c;
            if (intent2 != null) {
                parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("selected_photos", Uri.class) : intent2.getParcelableArrayListExtra("selected_photos");
            }
            InterfaceC14249c.b c4033b = data != null ? new PhotoPickerDeepLink.b.C4033b(Collections.singletonList(data)) : (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) ? PhotoPickerDeepLink.b.a.f134092b : new PhotoPickerDeepLink.b.C4033b(parcelableArrayListExtra);
            aVar.f219330k.a();
            aVar.j(c4033b);
            return G0.f406611a;
        }
    }

    static {
        new C6589a(null);
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k PhotoPickerIntentFactory photoPickerIntentFactory, @k Context context, @k a.b bVar, @k InterfaceC46916a interfaceC46916a, @k R0 r02) {
        super(r02);
        this.f219326g = interfaceC4053a;
        this.f219327h = photoPickerIntentFactory;
        this.f219328i = context;
        this.f219329j = bVar;
        this.f219330k = interfaceC46916a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        PhotoPickerDeepLink photoPickerDeepLink = (PhotoPickerDeepLink) deepLink;
        int i12 = photoPickerDeepLink.f134089b;
        PhotoPickerIntentFactory.CameraType cameraType = PhotoPickerIntentFactory.CameraType.f218799b;
        PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd modeAdd = new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null);
        this.f219326g.J(PhotoPickerIntentFactory.a.a(this.f219327h, this.f219328i, "OPEN_PHOTO_PICKER_VIA_DEEPLINK", "PHOTO_PICKER_UPLOAD_TYPE", i12, photoPickerDeepLink.f134090c, null, cameraType, modeAdd, photoPickerDeepLink.f134091d, 32), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new c(null), new b(C40483b.a(this.f219329j), this)), this.f134492f);
        return G0.f406611a;
    }
}
