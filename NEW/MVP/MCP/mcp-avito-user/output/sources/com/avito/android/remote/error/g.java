package com.avito.android.remote.error;

import android.app.Application;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Error;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.PretendResultError;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.K5;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ApiErrorThrowableConverterImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/error/g;", "Lcom/avito/android/remote/error/f;", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f253424a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f253425b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f253426c;

    /* compiled from: ApiErrorThrowableConverterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/error/ApiError;", "it", "Lcom/avito/android/remote/model/Error;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Error, ApiError> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final ApiError invoke(Error error) {
            Error error2 = error;
            g.this.getClass();
            if (error2 instanceof PretendResultError) {
                PretendResult pretendResult = ((PretendResultError) error2).getPretendResult();
                if (pretendResult != null) {
                    return new ApiError.PretendError(pretendResult);
                }
                String simpleMessage = error2.getSimpleMessage();
                return j.a(2, simpleMessage != null ? simpleMessage : "", null);
            }
            if (!error2.isPlural()) {
                String simpleMessage2 = error2.getSimpleMessage();
                return j.a(2, simpleMessage2 != null ? simpleMessage2 : "", null);
            }
            Map<String, String> paramsMessages = error2.getParamsMessages();
            if (paramsMessages == null) {
                paramsMessages = P0.c();
            }
            return new ApiError.IncorrectData(paramsMessages);
        }
    }

    @Inject
    public g(@Y61.k Application application, @Y61.k com.avito.android.remote.analytics.n nVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f253424a = application.getResources();
        this.f253425b = nVar;
        this.f253426c = interfaceC35741a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.remote.error.f
    @Y61.k
    public final ApiError a(@Y61.k Throwable th2) {
        a aVar = new a();
        boolean zC2 = K5.c(th2);
        Resources resources = this.f253424a;
        ApiError networkIOError = zC2 ? new ApiError.NetworkIOError(resources.getString(R.string.unsafe_network_message)) : K5.e(th2) ? new ApiError.NetworkIOError(resources.getString(R.string.network_unavailable_snack)) : K5.a(th2) ? j.c() : th2 instanceof ApiException ? ((ApiException) th2).f318522b : !(th2 instanceof n) ? j.a(2, com.avito.android.printable_text.b.g(InterfaceC35741a1.a.a(this.f253426c, th2, null, null, 6), resources), null) : (ApiError) aVar.invoke(((n) th2).getF318631d());
        this.f253425b.a(networkIOError, th2);
        return networkIOError;
    }
}
