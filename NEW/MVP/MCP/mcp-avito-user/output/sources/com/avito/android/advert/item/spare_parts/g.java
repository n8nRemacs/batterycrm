package com.avito.android.advert.item.spare_parts;

import Nl0.InterfaceC14587a;
import Pl0.C14803a;
import Pl0.C14804b;
import Pl0.C14805c;
import Pl0.j;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.advert.item.spare_parts.data.CarCompatibility;
import com.avito.android.advert.item.spare_parts.data.CompatibilityV4Info;
import com.avito.android.advert.item.spare_parts.data.OtherCompatibility;
import com.avito.android.advert.item.spare_parts.data.SparePartsCompatibilityV3Holder;
import com.avito.android.advert.item.spare_parts.data.SparePartsCompatibilityV4Holder;
import com.avito.android.advert.item.spare_parts.data.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.spare_parts.generated.api.get_part_compatibilities_api_v_4.Car;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import okhttp3.internal.Util;

/* compiled from: SparePartsRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.spare_parts.SparePartsRepositoryImpl$loadSparePartsV4$1", f = "SparePartsRepository.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f80466q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f80467r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f80468s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f80469t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> f80470u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Map<String, String> map, String str, Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> z12, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f80467r = hVar;
        this.f80468s = map;
        this.f80469t = str;
        this.f80470u = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new g(this.f80467r, this.f80468s, this.f80469t, this.f80470u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object objA;
        P2<com.avito.android.advert.item.spare_parts.data.a> bVar;
        SparePartsCompatibilityV3Holder sparePartsCompatibilityV3Holder;
        CarCompatibility carCompatibility;
        OtherCompatibility otherCompatibility;
        CarCompatibility.Car car;
        CarCompatibility.Car.Status status;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f80466q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14587a interfaceC14587a = this.f80467r.f80472b.get();
            Pl0.i iVar = new Pl0.i("params", this.f80468s);
            long longOrDefault = Util.toLongOrDefault(this.f80469t, 0L);
            this.f80466q = 1;
            objA = interfaceC14587a.a(iVar, longOrDefault, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = obj;
        }
        TypedResult typedResult = (TypedResult) objA;
        if (typedResult instanceof TypedResult.Error) {
            bVar = new P2.a(((TypedResult.Error) typedResult).getError());
        } else {
            if (!(typedResult instanceof TypedResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            new com.avito.android.advert.item.spare_parts.data.b();
            Pl0.f fVar = (Pl0.f) ((TypedResult.Success) typedResult).getResult();
            Pl0.e compatibilityV3Info = fVar.getCompatibilityV3Info();
            CompatibilityV4Info compatibilityV4Info = null;
            if (compatibilityV3Info != null) {
                C14805c carCompatibility2 = compatibilityV3Info.getCarCompatibility();
                if (carCompatibility2 != null) {
                    String title = carCompatibility2.getTitle();
                    String subtitle = carCompatibility2.getSubtitle();
                    Car car2 = carCompatibility2.getCar();
                    if (car2 != null) {
                        Car.Status status2 = car2.getStatus();
                        int i13 = status2 == null ? -1 : b.C2380b.f80454b[status2.ordinal()];
                        if (i13 == -1) {
                            status = com.avito.android.advert.item.spare_parts.data.b.f80452b;
                        } else if (i13 == 1) {
                            status = CarCompatibility.Car.Status.f80417c;
                        } else if (i13 == 2) {
                            status = CarCompatibility.Car.Status.f80418d;
                        } else {
                            if (i13 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            status = CarCompatibility.Car.Status.f80419e;
                        }
                        j image = car2.getImage();
                        Image value = image != null ? image.getValue() : null;
                        j image2 = car2.getImage();
                        car = new CarCompatibility.Car(status, UniversalImageKt.universalImageOf(value, image2 != null ? image2.getValueDark() : null), car2.getTitle(), car2.getSubtitle());
                    } else {
                        car = null;
                    }
                    C14804b primaryButton = carCompatibility2.getPrimaryButton();
                    CarCompatibility.Button button = primaryButton != null ? new CarCompatibility.Button(primaryButton.getText(), primaryButton.getDeeplink()) : null;
                    C14804b secondaryButton = carCompatibility2.getSecondaryButton();
                    carCompatibility = new CarCompatibility(title, subtitle, car, button, secondaryButton != null ? new CarCompatibility.Button(secondaryButton.getText(), secondaryButton.getDeeplink()) : null);
                } else {
                    carCompatibility = null;
                }
                Pl0.d otherCompatibility2 = compatibilityV3Info.getOtherCompatibility();
                if (otherCompatibility2 != null) {
                    String title2 = otherCompatibility2.getTitle();
                    Boolean showTitleImage = otherCompatibility2.getShowTitleImage();
                    boolean zBooleanValue = showTitleImage != null ? showTitleImage.booleanValue() : false;
                    List<Pl0.g> listA = otherCompatibility2.a();
                    ArrayList arrayListB = listA != null ? com.avito.android.advert.item.spare_parts.data.b.b(listA) : null;
                    Long groupingsLimitCount = otherCompatibility2.getGroupingsLimitCount();
                    otherCompatibility = new OtherCompatibility(title2, zBooleanValue, arrayListB, groupingsLimitCount != null ? Integer.valueOf((int) groupingsLimitCount.longValue()) : null, otherCompatibility2.getGroupingsExpandText(), otherCompatibility2.getSubtitle());
                } else {
                    otherCompatibility = null;
                }
                sparePartsCompatibilityV3Holder = new SparePartsCompatibilityV3Holder(carCompatibility, otherCompatibility);
            } else {
                sparePartsCompatibilityV3Holder = null;
            }
            C14803a compatibilityV4Info2 = fVar.getCompatibilityV4Info();
            if (compatibilityV4Info2 != null) {
                String title3 = compatibilityV4Info2.getTitle();
                String subtitle2 = compatibilityV4Info2.getSubtitle();
                j image3 = compatibilityV4Info2.getImage();
                Image value2 = image3 != null ? image3.getValue() : null;
                j image4 = compatibilityV4Info2.getImage();
                UniversalImage universalImageUniversalImageOf = UniversalImageKt.universalImageOf(value2, image4 != null ? image4.getValueDark() : null);
                String rightIcon = compatibilityV4Info2.getRightIcon();
                DeepLink blockAction = compatibilityV4Info2.getBlockAction();
                C14804b button2 = compatibilityV4Info2.getButton();
                compatibilityV4Info = new CompatibilityV4Info(title3, subtitle2, universalImageUniversalImageOf, rightIcon, blockAction, button2 != null ? new CompatibilityV4Info.GarageCompatibilityButton(button2.getText(), button2.getDeeplink()) : null, compatibilityV4Info2.getDisclaimer());
            }
            bVar = new P2.b<>(new SparePartsCompatibilityV4Holder(sparePartsCompatibilityV3Holder, compatibilityV4Info, fVar.getAction()));
        }
        this.f80470u.setValue(bVar);
        return G0.f406611a;
    }
}
