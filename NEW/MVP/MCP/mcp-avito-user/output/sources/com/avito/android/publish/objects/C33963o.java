package com.avito.android.publish.objects;

import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.rx3.g1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ObjectFillFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0001*\u0004\u0018\u00010\u00000\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/remote/model/PretendResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.objects.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33963o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33967q f238057b;

    public C33963o(C33967q c33967q) {
        this.f238057b = c33967q;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PretendResult pretendResult = (PretendResult) obj;
        if (!pretendResult.getSuccess()) {
            return io.reactivex.rxjava3.core.I.q(pretendResult);
        }
        C33967q c33967q = this.f238057b;
        c33967q.d(c33967q.f238070k);
        List listSingletonList = Collections.singletonList(c33967q.a());
        CategoryParametersConverter categoryParametersConverter = c33967q.f238068i;
        Map<String, String> mapConvertToFieldMap = categoryParametersConverter.convertToFieldMap(listSingletonList);
        return g1.a(c33967q.f238061b.a(categoryParametersConverter.convertToFieldMap(c33967q.C0().getNavigation()), null, null, mapConvertToFieldMap, c33967q.f238062c.b())).r(C33959m.f238053b).r(new C33961n(c33967q));
    }
}
