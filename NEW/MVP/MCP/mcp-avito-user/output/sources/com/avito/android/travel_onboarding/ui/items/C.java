package com.avito.android.travel_onboarding.ui.items;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConditionItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_travel-onboarding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class C {

    /* compiled from: ConditionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.deep_linking.links.w, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f302364b;

        public a(Y41.l lVar) {
            this.f302364b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof com.avito.android.deep_linking.links.w) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f302364b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f302364b;
        }

        public final int hashCode() {
            return this.f302364b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f302364b.invoke(deepLink);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.remote.model.text.AttributedText r36, @Y61.k com.avito.android.remote.model.text.AttributedText r37, @Y61.l com.avito.android.remote.model.UniversalImage r38, @Y61.k Y41.l r39, @Y61.l androidx.compose.ui.v r40, @Y61.l androidx.compose.runtime.A r41, int r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_onboarding.ui.items.C.a(com.avito.android.remote.model.text.AttributedText, com.avito.android.remote.model.text.AttributedText, com.avito.android.remote.model.UniversalImage, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }
}
