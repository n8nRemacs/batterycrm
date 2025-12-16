package gd;

import PO.i;
import Y61.k;
import Y61.l;
import com.avito.android.job.apply_only_with_cv_impl.generated.api.applies_create_v_3.AppliesCreateV3Response;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.text.C43066x;

/* compiled from: GeneratedApplyOnlyWithCvApiCaller.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgd/b;", "Lgd/a;", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/AppliesCreateV3Response;", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gd.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40662b implements InterfaceC40661a<AppliesCreateV3Response> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OO.a f396641a;

    @Inject
    public C40662b(@k OO.a aVar) {
        this.f396641a = aVar;
    }

    @Override // gd.InterfaceC40661a
    @l
    public final Object a(@k String str, @l Boolean bool, @k String str2, @l String str3, @l String str4, @k Continuation continuation) {
        Double dW02 = C43066x.w0(str);
        if (dW02 == null) {
            return new TypedResult.Error(new ApiError.UnknownError("vacancyId is not number.", null, null, 6, null), null, 2, null);
        }
        return this.f396641a.a(new i(str4, str3, bool, str2, dW02.doubleValue()), continuation);
    }
}
