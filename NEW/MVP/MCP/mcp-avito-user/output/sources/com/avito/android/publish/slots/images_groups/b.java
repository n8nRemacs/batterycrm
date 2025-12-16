package com.avito.android.publish.slots.images_groups;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_parameters.j;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view_groups.h;
import com.avito.android.publish.C0;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.ImageBadgeGroup;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameterKt;
import com.avito.android.remote.model.category_parameters.PhotoWidgetWithGroups;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import com.avito.android.util.R0;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;

/* compiled from: ImagesGroupsSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/images_groups/b;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* loaded from: classes16.dex */
public final class b extends j<ImagesGroupsSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImagesGroupsSlot f244127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f244128c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f244129d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC33214h f244130e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final H0 f244131f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Q1 f244132g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C0 f244133h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final g80.d f244134i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f244135j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public N0 f244136k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public N0 f244137l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f244138m = new com.jakewharton.rxrelay3.c();

    /* renamed from: n, reason: collision with root package name */
    @k
    public final ArrayList f244139n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    @k
    public final LinkedHashMap f244140o = new LinkedHashMap();

    /* renamed from: p, reason: collision with root package name */
    public int f244141p;

    /* compiled from: ImagesGroupsSlotWrapper.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_list_view/G;", "images", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.images_groups.ImagesGroupsSlotWrapper$subscribeToPhotos$1", f = "ImagesGroupsSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<List<? extends G>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f244142q;

        /* compiled from: ImagesGroupsSlotWrapper.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.slots.images_groups.ImagesGroupsSlotWrapper$subscribeToPhotos$1$2", f = "ImagesGroupsSlotWrapper.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.slots.images_groups.b$a$a, reason: collision with other inner class name */
        public static final class C7314a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f244144q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f244145r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ArrayList f244146s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7314a(b bVar, ArrayList arrayList, Continuation continuation) {
                super(2, continuation);
                this.f244145r = bVar;
                this.f244146s = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C7314a(this.f244145r, this.f244146s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7314a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f244144q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f244144q = 1;
                    if (C43131e0.b(2000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                h hVar = this.f244145r.f244129d;
                ArrayList arrayList = this.f244146s;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((G) it.next()).f218072e);
                }
                hVar.T6(arrayList2);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f244142q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(List<? extends G> list, Continuation<? super G0> continuation) {
            return ((a) create(list, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            C43238h c43238h;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            List<G> list = (List) this.f244142q;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (G g12 : list) {
                InterfaceC33208b.InterfaceC6540b interfaceC6540b = g12.f218070c;
                if (L.f(interfaceC6540b, InterfaceC33208b.InterfaceC6540b.c.f218119a)) {
                    arrayList.add(g12);
                } else if (L.f(interfaceC6540b, InterfaceC33208b.InterfaceC6540b.a.f218117a)) {
                    arrayList2.add(g12);
                }
            }
            b bVar = b.this;
            h hVar = bVar.f244129d;
            Iterator<Map.Entry<String, String>> it = hVar.l4().entrySet().iterator();
            while (true) {
                Object obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, String> next = it.next();
                String key = next.getKey();
                String value = next.getValue();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (L.f(((G) next2).f218068a, key)) {
                        obj2 = next2;
                        break;
                    }
                }
                G g13 = (G) obj2;
                if (g13 != null) {
                    hVar.d7(key);
                    hVar.H9(g13.f218072e, value);
                }
            }
            h hVar2 = bVar.f244129d;
            String f218617k = hVar2.getF218617K();
            if (f218617k != null) {
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((G) it3.next()).f218068a);
                }
                hVar2.Nd(f218617k, C42745f0.P0(arrayList3));
            }
            Iterator it4 = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it4.hasNext();
                c43238h = bVar.f244135j;
                if (!zHasNext) {
                    break;
                }
                G g14 = (G) it4.next();
                if (!bVar.f244139n.contains(g14.f218072e)) {
                    String str = g14.f218072e;
                    if (!hVar2.Mc(str) && !hVar2.ec(g14.f218068a)) {
                        C43259k.d(c43238h, null, null, new com.avito.android.publish.slots.images_groups.a(bVar, str, null), 3);
                    }
                }
            }
            N0 n02 = bVar.f244137l;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            bVar.f244137l = C43259k.d(c43238h, null, null, new C7314a(bVar, arrayList2, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: ImagesGroupsSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lcom/avito/android/photo_list_view/G;", "", "ex", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.images_groups.ImagesGroupsSlotWrapper$subscribeToPhotos$2", f = "ImagesGroupsSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.publish.slots.images_groups.b$b, reason: collision with other inner class name */
    public static final class C7315b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super List<? extends G>>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f244147q;

        public C7315b(Continuation<? super C7315b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super List<? extends G>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C7315b c7315b = b.this.new C7315b(continuation);
            c7315b.f244147q = th2;
            return c7315b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.this.f244128c.c(new NonFatalErrorEvent("ImagesGroupsSlotWrapper.subscribeToPhotos_error", this.f244147q, null, null, 12, null));
            return G0.f406611a;
        }
    }

    /* compiled from: ImagesGroupsSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lcom/avito/android/photo_list_view/G;", "", "ex", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.images_groups.ImagesGroupsSlotWrapper$subscribeToPhotos$3", f = "ImagesGroupsSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super List<? extends G>>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f244149q;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super List<? extends G>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f244149q = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f244149q;
            b bVar = b.this;
            Q1 q12 = bVar.f244132g;
            q12.getClass();
            n<Object> nVar = Q1.f67448x0[6];
            if (((Boolean) q12.f67488h.a().invoke()).booleanValue() && !(th2 instanceof CancellationException)) {
                int i12 = bVar.f244141p;
                if (i12 < 20) {
                    bVar.f244141p = i12 + 1;
                    bVar.j();
                } else {
                    bVar.f244128c.c(new NonFatalErrorEvent("ImagesGroupsSlotWrapper.resubscribeToPhotos_limitReached", null, null, null, 14, null));
                }
            }
            return G0.f406611a;
        }
    }

    @i31.c
    public b(@InterfaceC41220a @k ImagesGroupsSlot imagesGroupsSlot, @k InterfaceC28373a interfaceC28373a, @k h hVar, @k InterfaceC33214h interfaceC33214h, @k H0 h02, @k Q1 q12, @k C0 c02, @k g80.d dVar, @k R0 r02) {
        PhotoWidgetWithGroups photoWidgetWithGroups;
        List<ImageBadgeGroup> badges;
        this.f244127b = imagesGroupsSlot;
        this.f244128c = interfaceC28373a;
        this.f244129d = hVar;
        this.f244130e = interfaceC33214h;
        this.f244131f = h02;
        this.f244132g = q12;
        this.f244133h = c02;
        this.f244134i = dVar;
        this.f244135j = U.a(r02.a());
        CategoryParameters categoryParameters = c02.f231873k0;
        PhotoParameter photoParameter = categoryParameters != null ? (PhotoParameter) categoryParameters.getFirstParameterOfType(PhotoParameter.class) : null;
        if (photoParameter == null) {
            interfaceC28373a.c(new NonFatalErrorEvent("PhotoParameter should not be null in ImagesGroupsSlot", null, null, null, 14, null));
            return;
        }
        DisplayingOptions displayingOptions = photoParameter.getDisplayingOptions();
        if (displayingOptions != null && (photoWidgetWithGroups = displayingOptions.getPhotoWidgetWithGroups()) != null && (badges = photoWidgetWithGroups.getBadges()) != null) {
            for (ImageBadgeGroup imageBadgeGroup : badges) {
                this.f244140o.put(imageBadgeGroup.getId(), imageBadgeGroup.getTitle());
            }
        }
        j();
    }

    @Override // com.avito.android.publish.slots.q
    @k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f244138m;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        U.b(this.f244135j, null);
        this.f244141p = 0;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244127b;
    }

    public final void j() {
        CategoryParameters categoryParameters = this.f244133h.f231873k0;
        PhotoParameter photoParameter = categoryParameters != null ? (PhotoParameter) categoryParameters.getFirstParameterOfType(PhotoParameter.class) : null;
        N0 n02 = this.f244136k;
        if (n02 != null) {
            n02.c(null);
        }
        this.f244136k = C43175k.K(new X(new C43152f0(new C43197r1(new a(null), C43175k.V(C43175k.r(y.a(this.f244130e.a())), PhotoParameterKt.maxPhotos(photoParameter))), new C7315b(null)), new c(null)), this.f244135j);
    }
}
