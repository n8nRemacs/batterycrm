package com.avito.android.travel_onboarding.ui.items;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_travel-onboarding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class V {

    /* compiled from: HeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.deep_linking.links.w, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f302401b;

        public a(Y41.l lVar) {
            this.f302401b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof com.avito.android.deep_linking.links.w) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f302401b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f302401b;
        }

        public final int hashCode() {
            return this.f302401b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f302401b.invoke(deepLink);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.remote.model.text.AttributedText r28, @Y61.l com.avito.android.remote.model.text.AttributedText r29, @Y61.l com.avito.android.remote.model.UniversalImage r30, @Y61.k Y41.l r31, @Y61.l androidx.compose.ui.v r32, @Y61.l androidx.compose.runtime.A r33, int r34) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_onboarding.ui.items.V.a(com.avito.android.remote.model.text.AttributedText, com.avito.android.remote.model.text.AttributedText, com.avito.android.remote.model.UniversalImage, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }
}
