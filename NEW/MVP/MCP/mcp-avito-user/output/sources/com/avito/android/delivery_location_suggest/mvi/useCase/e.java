package com.avito.android.delivery_location_suggest.mvi.useCase;

import Y61.k;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.delivery_location_suggest.l;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import com.avito.android.error.z;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.remote.model.Coordinates;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import uF.d;

/* compiled from: SearchSuggestionsUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/useCase/e;", "", "a", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeliveryLocationSuggestParams f135198a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f135199b;

    /* compiled from: SearchSuggestionsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/useCase/e$a;", "", "<init>", "()V", "", "EMPTY_ITEM_ID", "Ljava/lang/String;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k DeliveryLocationSuggestParams deliveryLocationSuggestParams, @k l lVar) {
        this.f135198a = deliveryLocationSuggestParams;
        this.f135199b = lVar;
    }

    public static DeliveryLocationSuggestInternalAction b(uF.d dVar) {
        List listSingletonList;
        if (!(dVar instanceof d.c)) {
            if (dVar instanceof d.b) {
                Throwable error = ((d.b) dVar).f439868a;
                if (error == null) {
                    error = new Error();
                }
                return new DeliveryLocationSuggestInternalAction.SearchFailed(z.n(error));
            }
            if (!(dVar instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable error2 = ((d.a) dVar).f439867b;
            if (error2 == null) {
                error2 = new Error();
            }
            return new DeliveryLocationSuggestInternalAction.SearchFailed(z.n(error2));
        }
        List<AddressSuggestion> listA = ((d.c) dVar).a();
        if (listA.isEmpty()) {
            listSingletonList = Collections.singletonList(new com.avito.android.delivery_location_suggest.konveyor.empty.c("empty_item_id", null, 2, null));
        } else {
            List<AddressSuggestion> list = listA;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (AddressSuggestion addressSuggestion : list) {
                String strValueOf = String.valueOf(addressSuggestion.getCoordinates());
                String title = addressSuggestion.getTitle();
                String subtitle = addressSuggestion.getSubtitle();
                Coordinates coordinates = addressSuggestion.getCoordinates();
                arrayList.add(new com.avito.android.delivery_location_suggest.konveyor.suggest.c(strValueOf, title, subtitle, coordinates != null ? new com.avito.android.delivery_location_suggest.Coordinates(coordinates.getLatitude(), coordinates.getLongitude()) : null));
            }
            listSingletonList = arrayList;
        }
        return new DeliveryLocationSuggestInternalAction.SuggestionsLoaded(listSingletonList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.delivery_location_suggest.mvi.useCase.f
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.delivery_location_suggest.mvi.useCase.f r0 = (com.avito.android.delivery_location_suggest.mvi.useCase.f) r0
            int r1 = r0.f135203t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135203t = r1
            goto L18
        L13:
            com.avito.android.delivery_location_suggest.mvi.useCase.f r0 = new com.avito.android.delivery_location_suggest.mvi.useCase.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f135201r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f135203t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.delivery_location_suggest.mvi.useCase.e r5 = r0.f135200q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4c
        L2b:
            r5 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            com.avito.android.delivery_location_suggest.l r6 = r4.f135199b     // Catch: java.lang.Throwable -> L2b
            com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams r2 = r4.f135198a     // Catch: java.lang.Throwable -> L2b
            io.reactivex.rxjava3.internal.operators.single.W r5 = r6.a(r5, r2)     // Catch: java.lang.Throwable -> L2b
            r0.f135200q = r4     // Catch: java.lang.Throwable -> L2b
            r0.f135203t = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = kotlinx.coroutines.rx3.C43292o.b(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            uF.d r6 = (uF.d) r6     // Catch: java.lang.Throwable -> L2b
            r5.getClass()     // Catch: java.lang.Throwable -> L2b
            com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction r5 = b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L60
        L56:
            com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction$SearchFailed r6 = new com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction$SearchFailed
            com.avito.android.remote.error.ApiError r5 = com.avito.android.error.z.n(r5)
            r6.<init>(r5)
            r5 = r6
        L60:
            kotlinx.coroutines.flow.w r6 = new kotlinx.coroutines.flow.w
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_location_suggest.mvi.useCase.e.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
