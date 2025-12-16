package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsDetailsInfoV2.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.competitor_analytics.ui.z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29553z {

    /* compiled from: CompetitorAnalyticsDetailsInfoV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.ui.z$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f124877l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124878m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f124879n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AttributedText attributedText, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i12) {
            super(2);
            this.f124877l = attributedText;
            this.f124878m = lVar;
            this.f124879n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124879n | 1);
            C29553z.a(this.f124877l, this.f124878m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsDetailsInfoV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.z$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f124880l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124881m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar, AttributedText attributedText) {
            super(1);
            this.f124880l = attributedText;
            this.f124881m = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            this.f124880l.setOnDeepLinkClickListener(new SE0.a(16, this.f124881m));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsDetailsInfoV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.ui.z$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f124882l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124883m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f124884n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(AttributedText attributedText, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i12) {
            super(2);
            this.f124882l = attributedText;
            this.f124883m = lVar;
            this.f124884n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124884n | 1);
            C29553z.a(this.f124882l, this.f124883m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l AttributedText attributedText, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1476870412);
        if (attributedText == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new a(attributedText, lVar, i12);
                return;
            }
            return;
        }
        androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
        float f12 = 16;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, C22501m2.a(R1.m(vVarD, f12, 20, f12, 0.0f, 8), "details_info_text_v2"), R.attr.textM20, null, new b(lVar, attributedText), 0, bE2, 56, 40);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new c(attributedText, lVar, i12);
        }
    }
}
