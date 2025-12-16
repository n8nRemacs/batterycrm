package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.preview;

import ML0.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StickerEditPreviews.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"LML0/c;", "currentState", "_avito_vas-performance_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Image f320940a = new Image(P0.c());

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC43160i<ML0.b> f320941b = C43175k.w();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<DeepLink, G0> f320942c = a.f320943l;

    /* compiled from: StickerEditPreviews.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f320943l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    public static ML0.c a(int i12) {
        Float fValueOf = Float.valueOf(0.5f);
        String str = (i12 & 1) != 0 ? null : "Попробуйте обновить страницу или загляните позже — мы обязательно всё починим.";
        boolean z12 = (i12 & 2) == 0;
        Float f12 = (i12 & 8) != 0 ? null : fValueOf;
        ML0.c.f10600s.getClass();
        return ML0.c.a(ML0.c.f10601t, true, z12, str, f12, null, null, null, null, null, null, null, null, new c.d("Вернуться к объявлению", false, false), null, null, null, null, 126960);
    }
}
