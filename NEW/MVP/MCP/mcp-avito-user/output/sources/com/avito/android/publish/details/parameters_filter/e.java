package com.avito.android.publish.details.parameters_filter;

import com.avito.android.remote.model.PaginationSelectedResponse;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.TypedResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: PublishSelectRepositoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/PaginationSelectedResponse;", "result", "LZp0/e;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f234884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f234885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f234886d;

    public e(f fVar, int i12, String str) {
        this.f234884b = fVar;
        this.f234885c = i12;
        this.f234886d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        PaginationSelectedResponse paginationSelectedResponse = (PaginationSelectedResponse) ((TypedResult.Success) typedResult).getResult();
        List<ParcelableEntity<String>> sectionedOptionsAsEntities = paginationSelectedResponse.getSectionedOptionsAsEntities();
        int optionsTotal = paginationSelectedResponse.getOptionsTotal();
        int optionsCount = paginationSelectedResponse.getOptionsCount();
        this.f234884b.getClass();
        int i12 = optionsCount + this.f234885c;
        return new TypedResult.Success(new Zp0.e(sectionedOptionsAsEntities, (sectionedOptionsAsEntities.isEmpty() || i12 >= optionsTotal) ? null : new a(i12, this.f234886d)));
    }
}
