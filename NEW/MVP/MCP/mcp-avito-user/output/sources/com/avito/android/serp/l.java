package com.avito.android.serp;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.V0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: SerpSnippetInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/l;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l {

    /* compiled from: SerpSnippetInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/l$a;", "Lcom/avito/android/serp/l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC35745a5 f273959a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final V0 f273960b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.remote.error.f f273961c;

        /* compiled from: SerpSnippetInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "it", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.serp.l$a$a, reason: collision with other inner class name */
        public static final class C8131a<T> implements l41.g {

            /* renamed from: b, reason: collision with root package name */
            public static final C8131a<T> f273962b = new C8131a<>();

            @Override // l41.g
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* compiled from: SerpSnippetInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements l41.g {

            /* renamed from: b, reason: collision with root package name */
            public static final b<T> f273963b = new b<>();

            @Override // l41.g
            public final void accept(Object obj) {
                V2.f318762a.f((Throwable) obj);
            }
        }

        @Inject
        public a(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k V0 v02, @Y61.k com.avito.android.remote.error.f fVar) {
            this.f273959a = interfaceC35745a5;
            this.f273960b = v02;
            this.f273961c = fVar;
        }

        @Override // com.avito.android.serp.l
        public final void a(@Y61.k String str, @Y61.l Map<String, String> map) {
            e(str, "show", map);
        }

        @Override // com.avito.android.serp.l
        public final void b(@Y61.k String str, @Y61.l Map<String, String> map) {
            e(str, "disappear", map);
        }

        @Override // com.avito.android.serp.l
        public final void c(@Y61.k String str, @Y61.l Map<String, String> map) {
            e(str, "click", map);
        }

        @Override // com.avito.android.serp.l
        public final void d(@Y61.k String str, @Y61.l Map<String, String> map) {
            e(str, "close", map);
        }

        public final void e(String str, String str2, Map<String, String> map) {
            if (map == null) {
                map = P0.c();
            }
            this.f273960b.j(str, str2, map).x0(this.f273959a.a()).u0(C8131a.f273962b, b.f273963b);
        }
    }

    void a(@Y61.k String str, @Y61.l Map<String, String> map);

    void b(@Y61.k String str, @Y61.l Map<String, String> map);

    void c(@Y61.k String str, @Y61.l Map<String, String> map);

    void d(@Y61.k String str, @Y61.l Map<String, String> map);
}
