package Ii;

import X41.n;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: BeduinV2PageDeepLinkModule_ProvideBeduinV2BottomSheetMappingFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIi/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ii.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14113c implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f8482b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.v2.page.impl.deeplinks.b f8483a;

    /* compiled from: BeduinV2PageDeepLinkModule_ProvideBeduinV2BottomSheetMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIi/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ii.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @Y61.k
        public static C43834a a(@Y61.k com.avito.android.beduin.v2.page.impl.deeplinks.b bVar) {
            C14112b.f8481a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(BeduinV2BottomSheetDeepLink.class, new com.avito.android.beduin.v2.page.impl.deeplinks.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BeduinV2BottomSheetDeepLink.class), bVar));
        }

        public a() {
        }
    }

    public C14113c(@Y61.k com.avito.android.beduin.v2.page.impl.deeplinks.b bVar) {
        this.f8483a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.beduin.v2.page.impl.deeplinks.b bVar = this.f8483a;
        f8482b.getClass();
        return a.a(bVar);
    }
}
