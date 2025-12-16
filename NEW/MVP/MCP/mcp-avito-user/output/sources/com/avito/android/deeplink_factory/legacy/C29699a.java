package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_factory.legacy.E2;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29699a {

    /* compiled from: LegacyDeepLinkFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_factory.legacy.a$a, reason: collision with other inner class name */
    public static final class C4038a implements E2.a, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f134276b;

        public C4038a(Y41.l lVar) {
            this.f134276b = lVar;
        }

        @Override // com.avito.android.deeplink_factory.legacy.E2.a
        public final /* synthetic */ DeepLink a(Uri uri) {
            return (DeepLink) this.f134276b.invoke(uri);
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof E2.a) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f134276b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f134276b;
        }

        public final int hashCode() {
            return this.f134276b.hashCode();
        }
    }
}
