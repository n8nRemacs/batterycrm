package com.avito.android.publish.details.historical_suggest;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.rx3.y;
import nF.C44245a;

/* compiled from: HistoricalSuggestsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/historical_suggest/m;", "Lcom/avito/android/publish/details/historical_suggest/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f234690a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f234691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C44245a f234692c;

    @Inject
    public m(@Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C44245a c44245a) {
        this.f234690a = gVar;
        this.f234691b = interfaceC35745a5;
        this.f234692c = c44245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.publish.details.historical_suggest.m r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.avito.android.publish.details.historical_suggest.j
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.publish.details.historical_suggest.j r0 = (com.avito.android.publish.details.historical_suggest.j) r0
            int r1 = r0.f234680t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f234680t = r1
            goto L1b
        L16:
            com.avito.android.publish.details.historical_suggest.j r0 = new com.avito.android.publish.details.historical_suggest.j
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f234678r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f234680t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.publish.details.historical_suggest.m r4 = r0.f234677q
            kotlin.C42729a0.b(r6)
            goto L46
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C42729a0.b(r6)
            r0.f234677q = r4
            r0.f234680t = r3
            com.avito.android.geo_common.interactor.g r6 = r4.f234690a
            java.lang.Object r6 = r6.o(r5, r0)
            if (r6 != r1) goto L46
            goto L6c
        L46:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 != 0) goto L73
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L6d
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            com.avito.android.geo_common.model.CoordsByAddressResult r5 = (com.avito.android.geo_common.model.CoordsByAddressResult) r5
            com.avito.android.geo_common.model.CoordsByAddressResult$Point r5 = r5.getPoint()
            r4.getClass()
            com.avito.android.remote.model.Coordinates r1 = new com.avito.android.remote.model.Coordinates
            double r2 = r5.getLatitude()
            double r4 = r5.getLongitude()
            r1.<init>(r2, r4)
        L6c:
            return r1
        L6d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L73:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.details.historical_suggest.m.b(com.avito.android.publish.details.historical_suggest.m, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.publish.details.historical_suggest.i
    @Y61.k
    public final W a() {
        C44245a c44245a = this.f234692c;
        c44245a.getClass();
        kotlin.reflect.n<Object> nVar = C44245a.f414956i[3];
        boolean zBooleanValue = ((Boolean) c44245a.f414960e.a().invoke()).booleanValue();
        InterfaceC35745a5 interfaceC35745a5 = this.f234691b;
        return zBooleanValue ? y.b(C43175k.G(new k(this, null))).S().u(new C32102w0(6)).z(interfaceC35745a5.a()) : this.f234690a.y("", (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? P0.c() : null).S().r(l.f234689b).u(new C32102w0(7)).z(interfaceC35745a5.a());
    }
}
