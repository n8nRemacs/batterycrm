package com.avito.android.comfortable_deal.clients.use_case;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.U;
import kp.C43477c;

/* compiled from: RequestsCountUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/use_case/c;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.repository.a f120438a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f120439b;

    /* compiled from: RequestsCountUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RequestType requestType = RequestType.f120269c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RequestType requestType2 = RequestType.f120269c;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RequestType requestType3 = RequestType.f120269c;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public c(@k com.avito.android.comfortable_deal.repository.a aVar, @k R0 r02) {
        this.f120438a = aVar;
        this.f120439b = r02;
    }

    @l
    public final Object a(@k RequestType requestType, @l C43477c c43477c, @k ContinuationImpl continuationImpl) {
        return U.c(new d(requestType, this, c43477c, null), continuationImpl);
    }
}
