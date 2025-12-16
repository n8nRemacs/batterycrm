package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: AuctionAddLink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/a;", "", "a", "b", "Lcom/avito/android/deep_linking/links/a$a;", "Lcom/avito/android/deep_linking/links/a$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.links.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC29675a {

    /* compiled from: AuctionAddLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/a$a;", "Lcom/avito/android/deep_linking/links/a;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4022a implements InterfaceC29675a, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f133878b;

        public C4022a(@Y61.k String str) {
            this.f133878b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C4022a) && kotlin.jvm.internal.L.f(this.f133878b, ((C4022a) obj).f133878b);
        }

        public final int hashCode() {
            return this.f133878b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddAuctionErrorResult(errorMessage="), this.f133878b, ')');
        }
    }

    /* compiled from: AuctionAddLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/a$b;", "Lcom/avito/android/deep_linking/links/a;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.a$b */
    public static final class b implements InterfaceC29675a, InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f133879b = new b();
    }
}
