package com.avito.android.advert.item.spare_parts;

import Nl0.InterfaceC14587a;
import Ol0.C14708a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.advert.item.spare_parts.data.CarCompatibility;
import com.avito.android.advert.item.spare_parts.data.OtherCompatibility;
import com.avito.android.advert.item.spare_parts.data.SparePartsCompatibilityV3Holder;
import com.avito.android.advert.item.spare_parts.data.b;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SparePartsFilters;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.spare_parts.generated.api.get_part_compatibilities_api_v_3.Car;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import okhttp3.internal.Util;

/* compiled from: SparePartsRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.spare_parts.SparePartsRepositoryImpl$loadSparePartsV3$1", f = "SparePartsRepository.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f80460q;

    /* renamed from: r, reason: collision with root package name */
    public int f80461r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> f80462s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f80463t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f80464u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SparePartsFilters f80465v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> z12, h hVar, String str, SparePartsFilters sparePartsFilters, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f80462s = z12;
        this.f80463t = hVar;
        this.f80464u = str;
        this.f80465v = sparePartsFilters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f80462s, this.f80463t, this.f80464u, this.f80465v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> z12;
        Object objB;
        P2<com.avito.android.advert.item.spare_parts.data.a> bVar;
        CarCompatibility carCompatibility;
        OtherCompatibility otherCompatibility;
        CarCompatibility.Car car;
        CarCompatibility.Car.Status status;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f80461r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14587a interfaceC14587a = this.f80463t.f80472b.get();
            long longOrDefault = Util.toLongOrDefault(this.f80464u, 0L);
            SparePartsFilters sparePartsFilters = this.f80465v;
            Long lBoxLong = sparePartsFilters.getCarBrand() != null ? Boxing.boxLong(r4.intValue()) : null;
            Long lBoxLong2 = sparePartsFilters.getCarGeneration() != null ? Boxing.boxLong(r5.intValue()) : null;
            Long lBoxLong3 = sparePartsFilters.getCarModel() != null ? Boxing.boxLong(r6.intValue()) : null;
            Long lBoxLong4 = sparePartsFilters.getCarModification() != null ? Boxing.boxLong(r7.intValue()) : null;
            long microcategoryId = sparePartsFilters.getMicrocategoryId();
            Long lBoxLong5 = sparePartsFilters.getSubMicrocategoryId() != null ? Boxing.boxLong(r3.intValue()) : null;
            z12 = this.f80462s;
            this.f80460q = z12;
            this.f80461r = 1;
            objB = interfaceC14587a.b(longOrDefault, lBoxLong, lBoxLong3, lBoxLong2, lBoxLong4, microcategoryId, lBoxLong5, this);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> z13 = (Z1) this.f80460q;
            C42729a0.b(obj);
            z12 = z13;
            objB = obj;
        }
        TypedResult typedResult = (TypedResult) objB;
        if (typedResult instanceof TypedResult.Error) {
            bVar = new P2.a(((TypedResult.Error) typedResult).getError());
        } else {
            if (!(typedResult instanceof TypedResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            new com.avito.android.advert.item.spare_parts.data.b();
            Ol0.d dVar = (Ol0.d) ((TypedResult.Success) typedResult).getResult();
            Ol0.b carCompatibility2 = dVar.getCarCompatibility();
            if (carCompatibility2 != null) {
                String title = carCompatibility2.getTitle();
                String subtitle = carCompatibility2.getSubtitle();
                Car car2 = carCompatibility2.getCar();
                if (car2 != null) {
                    Car.Status status2 = car2.getStatus();
                    int i13 = status2 == null ? -1 : b.C2380b.f80453a[status2.ordinal()];
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
                    Ol0.g image = car2.getImage();
                    Image value = image != null ? image.getValue() : null;
                    Ol0.g image2 = car2.getImage();
                    car = new CarCompatibility.Car(status, UniversalImageKt.universalImageOf(value, image2 != null ? image2.getValueDark() : null), car2.getTitle(), car2.getSubtitle());
                } else {
                    car = null;
                }
                C14708a primaryButton = carCompatibility2.getPrimaryButton();
                CarCompatibility.Button button = primaryButton != null ? new CarCompatibility.Button(primaryButton.getText(), primaryButton.getDeeplink()) : null;
                C14708a secondaryButton = carCompatibility2.getSecondaryButton();
                carCompatibility = new CarCompatibility(title, subtitle, car, button, secondaryButton != null ? new CarCompatibility.Button(secondaryButton.getText(), secondaryButton.getDeeplink()) : null);
            } else {
                carCompatibility = null;
            }
            Ol0.c otherCompatibility2 = dVar.getOtherCompatibility();
            if (otherCompatibility2 != null) {
                String title2 = otherCompatibility2.getTitle();
                Boolean showTitleImage = otherCompatibility2.getShowTitleImage();
                boolean zBooleanValue = showTitleImage != null ? showTitleImage.booleanValue() : false;
                List<Ol0.e> listA = otherCompatibility2.a();
                ArrayList arrayListA = listA != null ? com.avito.android.advert.item.spare_parts.data.b.a(listA) : null;
                Long groupingsLimitCount = otherCompatibility2.getGroupingsLimitCount();
                otherCompatibility = new OtherCompatibility(title2, zBooleanValue, arrayListA, groupingsLimitCount != null ? Integer.valueOf((int) groupingsLimitCount.longValue()) : null, otherCompatibility2.getGroupingsExpandText(), otherCompatibility2.getSubtitle());
            } else {
                otherCompatibility = null;
            }
            bVar = new P2.b<>(new SparePartsCompatibilityV3Holder(carCompatibility, otherCompatibility));
        }
        z12.setValue(bVar);
        return G0.f406611a;
    }
}
