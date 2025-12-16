package com.avito.android.publish;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.AbstractC35806h3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishParametersInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/PublishParametersInteractor;", "", "a", "RedirectUriException", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PublishParametersInteractor {

    /* compiled from: PublishParametersInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/PublishParametersInteractor$RedirectUriException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RedirectUriException extends RuntimeException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f232000b;

        public RedirectUriException(@Y61.k DeepLink deepLink) {
            this.f232000b = deepLink;
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/PublishParametersInteractor$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CategoryParameters f232001a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f232002b;

        public a(@Y61.k CategoryParameters categoryParameters, @Y61.l String str) {
            this.f232001a = categoryParameters;
            this.f232002b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f232001a, aVar.f232001a) && kotlin.jvm.internal.L.f(this.f232002b, aVar.f232002b);
        }

        public final int hashCode() {
            int iHashCode = this.f232001a.hashCode() * 31;
            String str = this.f232002b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(categoryParameters=");
            sb2.append(this.f232001a);
            sb2.append(", serializedPublishState=");
            return C22026a.c(sb2, this.f232002b, ')');
        }

        public /* synthetic */ a(CategoryParameters categoryParameters, String str, int i12, C42822w c42822w) {
            this(categoryParameters, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<AbstractC35806h3<CategoryParameters>> c(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters, @Y61.l String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<a> e(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters, boolean z12, @Y61.l String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<a> g(@Y61.k Navigation navigation2, @Y61.l String str, @Y61.l Map<String, ? extends Object> map, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l String str3);

    @Y61.k
    io.reactivex.rxjava3.core.I<ItemBrief> h(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<a> j(@Y61.k Navigation navigation2, @Y61.k String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    io.reactivex.rxjava3.core.z k(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters, @Y61.k String str);
}
