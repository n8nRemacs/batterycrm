package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: CollectPublishParamsLink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/g;", "", "a", "b", "Lcom/avito/android/deep_linking/links/g$a;", "Lcom/avito/android/deep_linking/links/g$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.links.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC29681g {

    /* compiled from: CollectPublishParamsLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/g$a;", "Lcom/avito/android/deep_linking/links/g;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.g$a */
    public static final /* data */ class a implements InterfaceC29681g, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f134003b;

        public a(@Y61.k String str) {
            this.f134003b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f134003b, ((a) obj).f134003b);
        }

        public final int hashCode() {
            return this.f134003b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CollectPublishErrorParamsResult(errorMessage="), this.f134003b, ')');
        }
    }

    /* compiled from: CollectPublishParamsLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/g$b;", "Lcom/avito/android/deep_linking/links/g;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.g$b */
    public static final class b implements InterfaceC29681g, InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f134004b = new b();
    }
}
