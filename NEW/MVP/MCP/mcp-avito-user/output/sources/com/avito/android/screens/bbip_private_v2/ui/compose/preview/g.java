package com.avito.android.screens.bbip_private_v2.ui.compose.preview;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tp0.InterfaceC48701b;

/* compiled from: BbipPrivateV2ScreenPreviews.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final BbipPrivateV2State.SegmentsBlock f261353a = new BbipPrivateV2State.SegmentsBlock(C42745f0.U(new BbipPrivateV2State.SegmentsBlock.Segment("Рекомендуем", BbipPrivateV2State.SegmentsBlock.Segment.Type.f261036b), new BbipPrivateV2State.SegmentsBlock.Segment("Настройка", BbipPrivateV2State.SegmentsBlock.Segment.Type.f261037c)), 0);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final wZ.l f261354b = new wZ.l(new Image(P0.c()), new Image(P0.c()));

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final BbipPrivateV2State.f f261355c = new BbipPrivateV2State.f("Продвижение с прогнозом", "Подзаголовок", null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final BbipPrivateV2State.c f261356d = new BbipPrivateV2State.c("Пропустить", null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final BbipPrivateV2State.c f261357e = new BbipPrivateV2State.c("Продолжить", null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC43160i<InterfaceC48701b> f261358f = C43175k.w();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<DeepLink, G0> f261359g = a.f261360l;

    /* compiled from: BbipPrivateV2ScreenPreviews.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f261360l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    public static BbipPrivateV2State a(BbipPrivateV2State.SegmentsBlock segmentsBlock, C42784z0 c42784z0, wZ.g gVar, BbipPrivateV2State.e eVar, BbipPrivateV2State.h hVar, BbipPrivateV2State.b bVar, BbipPrivateV2State.a aVar, int i12) {
        C42784z0 c42784z0U;
        String str = (i12 & 1) != 0 ? null : "Попробуйте обновить страницу или загляните позже — мы обязательно всё починим.";
        boolean z12 = (i12 & 2) == 0;
        BbipPrivateV2State.f fVar = (i12 & 4) != 0 ? f261355c : null;
        BbipPrivateV2State.SegmentsBlock segmentsBlock2 = (i12 & 8) != 0 ? f261353a : segmentsBlock;
        if ((i12 & 16) != 0) {
            BbipPrivateV2State.g.a aVar2 = new BbipPrivateV2State.g.a(600L, 7, null, null);
            wZ.l lVar = f261354b;
            c42784z0U = C42745f0.U(new BbipPrivateV2State.g(aVar2, "Обгоните 10% \nконкурентов", "600 ₽ за 7 дней", lVar, false, "7—12 просмотров", "15%", null, null, "Покупатели увидят просмотры автомобиля за 1 день"), new BbipPrivateV2State.g(new BbipPrivateV2State.g.a(900L, 2, null, null), "Обгоните 50% \nконкурентов", "900 ₽ за 2 дня", lVar, true, "9—15 просмотров", null, "1700 ₽", null, null), new BbipPrivateV2State.g(new BbipPrivateV2State.g.a(2790L, 14, null, null), "Обгоните 90% \nконкурентов", "2 790 ₽ за 14 дней", lVar, false, null, "20%", null, null, null));
        } else {
            c42784z0U = c42784z0;
        }
        BbipPrivateV2State.c cVar = (i12 & 32) != 0 ? f261356d : null;
        BbipPrivateV2State.c cVar2 = (i12 & 64) != 0 ? f261357e : null;
        wZ.g gVar2 = (i12 & 128) != 0 ? null : gVar;
        return new BbipPrivateV2State(new uZ.e(null, new ButtonAction("Помощь", null, null, null, 12, null)), fVar, (i12 & 256) != 0 ? null : eVar, (i12 & 1024) != 0 ? null : bVar, cVar, cVar2, null, str, z12, false, gVar2, null, null, segmentsBlock2, (i12 & 512) != 0 ? null : hVar, c42784z0U, (i12 & 2048) != 0 ? null : aVar, 6720, null);
    }
}
