package com.avito.android.advert.item.select.number_input;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectNumberInput.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* compiled from: AutoSelectNumberInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f79520b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f79520b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return this.f79520b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f79520b;
        }

        public final int hashCode() {
            return this.f79520b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f79520b.invoke(deepLink);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.advert.item.select.number_input.f r32, @Y61.k Y41.l r33, @Y61.k Y41.p r34, @Y61.k Y41.l r35, @Y61.l com.akita.compose.component.input.v r36, @Y61.l androidx.compose.runtime.A r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.select.number_input.e.a(com.avito.android.advert.item.select.number_input.f, Y41.l, Y41.p, Y41.l, com.akita.compose.component.input.v, androidx.compose.runtime.A, int, int):void");
    }
}
