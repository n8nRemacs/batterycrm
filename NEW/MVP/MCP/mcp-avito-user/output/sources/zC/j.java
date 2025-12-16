package ZC;

import Y61.k;
import com.avito.android.remote.model.CreateAdvertCollectionResult;
import com.avito.android.util.C35873q0;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: FavoritesJsonModule_ProvideCreateCollectionTypedResultEntriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LZC/j;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/q0;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<Set<C35873q0>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final j f19971a = new j();

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = i.f19970a;
        return Collections.singleton(new C35873q0(CreateAdvertCollectionResult.class, P0.g(new Q("success", CreateAdvertCollectionResult.Created.class), new Q("validation", CreateAdvertCollectionResult.ValidationError.class))));
    }
}
