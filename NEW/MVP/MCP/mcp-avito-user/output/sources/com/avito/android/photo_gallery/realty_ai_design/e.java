package com.avito.android.photo_gallery.realty_ai_design;

import Y41.p;
import Y41.q;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: ImageComparisonSlider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.realty_ai_design.ImageComparisonSliderKt$ImageComparisonSlider$4", f = "ImageComparisonSlider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Image f217597q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.g f217598r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Image f217599s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T f217600t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Uri> f217601u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Uri> f217602v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f217603w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f217604x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f217605y;

    /* compiled from: ImageComparisonSlider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f217606b = new a();

        public a() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
        }
    }

    /* compiled from: ImageComparisonSlider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f217607b = new b();

        public b() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
        }
    }

    /* compiled from: ImageComparisonSlider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.realty_ai_design.ImageComparisonSliderKt$ImageComparisonSlider$4$3", f = "ImageComparisonSlider.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217608q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Context f217609r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Uri> f217610s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Uri> f217611t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f217612u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f217613v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, InterfaceC22204y1 interfaceC22204y13, InterfaceC22204y1 interfaceC22204y14, Continuation continuation) {
            super(2, continuation);
            this.f217609r = context;
            this.f217610s = interfaceC22204y1;
            this.f217611t = interfaceC22204y12;
            this.f217612u = interfaceC22204y13;
            this.f217613v = interfaceC22204y14;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f217609r, this.f217610s, this.f217611t, this.f217612u, this.f217613v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f217608q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Uri f42167b = this.f217610s.getF42167b();
                Uri f42167b2 = this.f217611t.getF42167b();
                Y41.a aVar = (Y41.a) this.f217612u.getF42167b();
                Y41.l lVar = (Y41.l) this.f217613v.getF42167b();
                this.f217608q = 1;
                Context context = this.f217609r;
                Object objC = U.c(new l(aVar, lVar, coil.d.a(context), context, f42167b, f42167b2, null), this);
                if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objC = G0.f406611a;
                }
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Image image, l0.g gVar, Image image2, T t12, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Context context, InterfaceC22204y1 interfaceC22204y13, InterfaceC22204y1 interfaceC22204y14, Continuation continuation) {
        super(2, continuation);
        this.f217597q = image;
        this.f217598r = gVar;
        this.f217599s = image2;
        this.f217600t = t12;
        this.f217601u = interfaceC22204y1;
        this.f217602v = interfaceC22204y12;
        this.f217603w = context;
        this.f217604x = interfaceC22204y13;
        this.f217605y = interfaceC22204y14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f217604x;
        InterfaceC22204y1 interfaceC22204y12 = this.f217605y;
        return new e(this.f217597q, this.f217598r, this.f217599s, this.f217600t, this.f217601u, this.f217602v, this.f217603w, interfaceC22204y1, interfaceC22204y12, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        l0.g gVar = this.f217598r;
        long j12 = gVar.f406841b;
        this.f217601u.setValue(C35829k2.b(this.f217597q, (int) (j12 >> 32), (int) (j12 & 4294967295L), 0.0f, 1, 44).c(a.f217606b));
        long j13 = gVar.f406841b;
        this.f217602v.setValue(C35829k2.b(this.f217599s, (int) (j13 >> 32), (int) (j13 & 4294967295L), 0.0f, 1, 44).c(b.f217607b));
        InterfaceC22204y1 interfaceC22204y1 = this.f217605y;
        C43259k.d(this.f217600t, null, null, new c(this.f217603w, this.f217601u, this.f217602v, this.f217604x, interfaceC22204y1, null), 3);
        return G0.f406611a;
    }
}
