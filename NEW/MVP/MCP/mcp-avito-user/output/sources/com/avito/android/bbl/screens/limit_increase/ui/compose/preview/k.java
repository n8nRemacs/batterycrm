package com.avito.android.bbl.screens.limit_increase.ui.compose.preview;

import Eh.InterfaceC13486b;
import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LimitIncreaseScreenPreviews.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC43160i<InterfaceC13486b> f99933a = C43175k.w();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final l<DeepLink, G0> f99934b = a.f99935l;

    /* compiled from: LimitIncreaseScreenPreviews.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f99935l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    public static Eh.c a(int i12) {
        return new Eh.c(false, (i12 & 2) == 0, (i12 & 1) != 0 ? null : "Попробуйте обновить страницу или загляните позже — мы обязательно всё починим.", null, null, null, null, null, null, null, null, false);
    }
}
