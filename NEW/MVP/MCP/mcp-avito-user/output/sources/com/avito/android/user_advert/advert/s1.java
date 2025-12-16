package com.avito.android.user_advert.advert;

import com.avito.android.lib.design.toast_bar.i;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-advert_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s1 {

    /* compiled from: MyAdvertDetailsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements i.b, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a f310610b;

        public a(Y41.a aVar) {
            this.f310610b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof i.b) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f310610b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f310610b;
        }

        public final int hashCode() {
            return this.f310610b.hashCode();
        }

        @Override // com.avito.android.lib.design.toast_bar.i.b
        public final /* synthetic */ void invoke() {
            this.f310610b.invoke();
        }
    }
}
