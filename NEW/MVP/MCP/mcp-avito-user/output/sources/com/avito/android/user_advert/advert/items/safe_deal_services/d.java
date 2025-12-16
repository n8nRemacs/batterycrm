package com.avito.android.user_advert.advert.items.safe_deal_services;

import Y41.l;
import Y61.k;
import android.text.SpannableString;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;

/* compiled from: SafeDealUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/d;", "", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f310050a = new d();

    /* compiled from: SafeDealUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f310051b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f310051b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return this.f310051b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f310051b;
        }

        public final int hashCode() {
            return this.f310051b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f310051b.invoke(deepLink);
        }
    }

    @Y61.l
    public static SpannableString a(@Y61.l String str, @Y61.l DeepLink deepLink, @k l lVar) {
        if (str == null || deepLink == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new OK0.b(deepLink, new a(lVar), false, 4, null), 0, str.length(), 33);
        return spannableString;
    }
}
