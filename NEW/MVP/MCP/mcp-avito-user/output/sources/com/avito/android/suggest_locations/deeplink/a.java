package com.avito.android.suggest_locations.deeplink;

import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.suggest_locations.deeplink.SuggestLocationsAddressLink;
import com.avito.android.suggest_locations.deeplink.b;
import com.avito.android.suggest_locations.sheet.SuggestLocationsFragmentSheet;
import com.avito.android.suggest_locations.sheet.SuggestLocationsSheetArguments;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import okhttp3.internal.http2.Http2;
import rv.C47918a;
import rv.C47919b;
import sv.C48421d;

/* compiled from: SuggestLocationsAddressLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/a;", "Lev/a;", "Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<SuggestLocationsAddressLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC35139d f292280f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f292281g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.d f292282h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f292283i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.f f292284j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C43238h f292285k;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.suggest_locations.deeplink.a$a, reason: collision with other inner class name */
    public static final class C8862a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f292286b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f292287c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.suggest_locations.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C8863a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f292288b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f292289c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.suggest_locations.deeplink.SuggestLocationsAddressLinkHandler$onCreate$$inlined$filter$1$2", f = "SuggestLocationsAddressLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.suggest_locations.deeplink.a$a$a$a, reason: collision with other inner class name */
            public static final class C8864a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f292290q;

                /* renamed from: r, reason: collision with root package name */
                public int f292291r;

                public C8864a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f292290q = obj;
                    this.f292291r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8863a.this.emit(null, this);
                }
            }

            public C8863a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f292288b = interfaceC43172j;
                this.f292289c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.suggest_locations.deeplink.a.C8862a.C8863a.C8864a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.suggest_locations.deeplink.a$a$a$a r0 = (com.avito.android.suggest_locations.deeplink.a.C8862a.C8863a.C8864a) r0
                    int r1 = r0.f292291r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f292291r = r1
                    goto L18
                L13:
                    com.avito.android.suggest_locations.deeplink.a$a$a$a r0 = new com.avito.android.suggest_locations.deeplink.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f292290q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f292291r
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
                    com.avito.android.suggest_locations.deeplink.a r2 = r4.f292289c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f292291r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f292288b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.suggest_locations.deeplink.a.C8862a.C8863a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C8862a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f292286b = interfaceC43160i;
            this.f292287c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f292286b).collect(new C8863a(interfaceC43172j, this.f292287c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SuggestLocationsAddressLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            AddressParameter.Value value;
            Location location;
            InterfaceC14249c.b c8861c;
            Bundle extras;
            Bundle extras2;
            C47918a c47918a2 = c47918a;
            a aVar = (a) this.receiver;
            aVar.getClass();
            int i12 = c47918a2.f437156b;
            Intent intent = c47918a2.f437157c;
            if (intent == null || (extras2 = intent.getExtras()) == null) {
                value = null;
            } else {
                value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras2.getParcelable("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : extras2.getParcelable("EXTRA_ADDRESS_RESULT"));
            }
            if (intent == null || (extras = intent.getExtras()) == null) {
                location = null;
            } else {
                location = (Location) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("location", Location.class) : extras.getParcelable("location"));
            }
            if (i12 == 0) {
                c8861c = SuggestLocationsAddressLink.c.a.f292273b;
            } else if (value != null) {
                c8861c = new SuggestLocationsAddressLink.c.C8861c(value.getText(), String.valueOf(value.getLat()), String.valueOf(value.getLng()));
            } else if (location != null) {
                String title = location.getF119974b();
                Coordinates coordinates = location.getCoordinates();
                String strValueOf = String.valueOf(coordinates != null ? Double.valueOf(coordinates.getLatitude()) : null);
                Coordinates coordinates2 = location.getCoordinates();
                c8861c = new SuggestLocationsAddressLink.c.C8861c(title, strValueOf, String.valueOf(coordinates2 != null ? Double.valueOf(coordinates2.getLongitude()) : null));
            } else {
                c8861c = SuggestLocationsAddressLink.c.b.f292274b;
            }
            aVar.j(c8861c);
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestLocationsAddressLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            InterfaceC14249c.b c8861c;
            C47919b c47919b2 = c47919b;
            a aVar = (a) this.receiver;
            aVar.getClass();
            Bundle bundle = c47919b2.f437159b;
            int i12 = Build.VERSION.SDK_INT;
            AddressParameter.Value value = (AddressParameter.Value) (i12 >= 34 ? (Parcelable) bundle.getParcelable("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : bundle.getParcelable("EXTRA_ADDRESS_RESULT"));
            Bundle bundle2 = c47919b2.f437159b;
            Location location = (Location) (i12 >= 34 ? (Parcelable) bundle2.getParcelable("location", Location.class) : bundle2.getParcelable("location"));
            if (value != null) {
                c8861c = new SuggestLocationsAddressLink.c.C8861c(value.getText(), String.valueOf(value.getLat()), String.valueOf(value.getLng()));
            } else if (location != null) {
                String title = location.getF119974b();
                Coordinates coordinates = location.getCoordinates();
                String strValueOf = String.valueOf(coordinates != null ? Double.valueOf(coordinates.getLatitude()) : null);
                Coordinates coordinates2 = location.getCoordinates();
                c8861c = new SuggestLocationsAddressLink.c.C8861c(title, strValueOf, String.valueOf(coordinates2 != null ? Double.valueOf(coordinates2.getLongitude()) : null));
            } else {
                c8861c = SuggestLocationsAddressLink.c.b.f292274b;
            }
            aVar.j(c8861c);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC35139d interfaceC35139d, @k a.InterfaceC4053a interfaceC4053a, @k a.d dVar, @k a.b bVar, @k a.f fVar, @k R0 r02) {
        this.f292280f = interfaceC35139d;
        this.f292281g = interfaceC4053a;
        this.f292282h = dVar;
        this.f292283i = bVar;
        this.f292284j = fVar;
        this.f292285k = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SuggestLocationsAddressLink suggestLocationsAddressLink = (SuggestLocationsAddressLink) deepLink;
        SuggestFlowType flowType = suggestLocationsAddressLink.getFlowType();
        int i12 = flowType == null ? -1 : b.a.f292293a[flowType.ordinal()];
        PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = i12 != 1 ? i12 != 2 ? i12 != 3 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : PublishIntentFactory.SuggestLocationsFlowType.Region.f231998b : PublishIntentFactory.SuggestLocationsFlowType.Historical.f231997b : PublishIntentFactory.SuggestLocationsFlowType.DefaultNoMap.f231996b;
        if (suggestLocationsAddressLink.getPresentationStyle() == SuggestPresentationType.BOTTOMSHEET) {
            SuggestLocationsFragmentSheet.a aVar = SuggestLocationsFragmentSheet.f292358k0;
            SuggestLocationsSheetArguments suggestLocationsSheetArguments = new SuggestLocationsSheetArguments(null, null, null, suggestLocationsAddressLink.getQuery(), PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, suggestLocationsFlowType, null, null, true, false, true, null, this.f395444b, suggestLocationsAddressLink.getTitle(), 2752, null);
            aVar.getClass();
            this.f292282h.w1(SuggestLocationsFragmentSheet.a.a(suggestLocationsSheetArguments), this.f395444b);
            return;
        }
        String query = suggestLocationsAddressLink.getQuery();
        PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c;
        suggestLocationsAddressLink.getWithRedesignTheme();
        this.f292281g.J(this.f292280f.a(null, null, null, query, locationPickerChooseButtonLocation, null, (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : suggestLocationsFlowType, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : null, (32576 & 2048) != 0 ? null : null, (32576 & 8192) != 0 ? null : null, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43197r1 c43197r1 = new C43197r1(new b(2, this, a.class, "handleActivityResult", "handleActivityResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V", 4), new C8862a(y.a(this.f292283i.Q()), this));
        C43238h c43238h = this.f292285k;
        C43175k.K(c43197r1, c43238h);
        C43175k.K(new C43197r1(new c(2, this, a.class, "handleFragmentResult", "handleFragmentResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f292284j.l1(this.f395444b))), c43238h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f292285k, null);
    }
}
