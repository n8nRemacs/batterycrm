package coil.fetch;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.CacheControl;

/* compiled from: HttpUriFetcher.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {}, l = {224}, m = "executeNetworkRequest", n = {}, s = {})
/* loaded from: classes10.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f58405q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f58406r;

    /* renamed from: s, reason: collision with root package name */
    public int f58407s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58406r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58405q = obj;
        this.f58407s |= BeduinInputModel.MIN_TEXT_VERSION;
        CacheControl cacheControl = j.f58389f;
        return this.f58406r.a(null, this);
    }
}
