package ru.mts.biometry.api.dataSource;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IdentificationDataSourceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ru.mts.biometry.api.dataSource.IdentificationDataSourceImpl", f = "IdentificationDataSourceImpl.kt", i = {0, 1}, l = {130, 134}, m = "getConfig", n = {"this", Navigation.CONFIG}, s = {"L$0", "L$0"})
/* loaded from: classes9.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f436323q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f436324r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f436325s;

    /* renamed from: t, reason: collision with root package name */
    public int f436326t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f436325s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f436324r = obj;
        this.f436326t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f436325s.d(this);
    }
}
