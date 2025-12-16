package ru.mts.biometry.api.dataSource;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ru.mts.biometry.api.entity.inn.InnRequestResponse;

/* compiled from: IdentificationDataSourceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.dataSource.IdentificationDataSourceImpl", f = "IdentificationDataSourceImpl.kt", i = {0, 1, 1}, l = {60, 63, 64}, m = "getINN", n = {"this", "this", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public j f436327q;

    /* renamed from: r, reason: collision with root package name */
    public InnRequestResponse f436328r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f436329s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f436330t;

    /* renamed from: u, reason: collision with root package name */
    public int f436331u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f436330t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f436329s = obj;
        this.f436331u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f436330t.e(null, this);
    }
}
