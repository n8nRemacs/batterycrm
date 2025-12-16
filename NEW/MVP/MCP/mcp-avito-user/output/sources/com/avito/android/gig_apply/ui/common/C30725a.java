package com.avito.android.gig_apply.ui.common;

import android.net.Uri;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: SlotPaymentInfoWidget.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.gig_apply.ui.common.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30725a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C30725a f159921a = new C30725a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f159922b = new C22096n(2008608761, C4675a.f159923l, false);

    /* compiled from: SlotPaymentInfoWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.gig_apply.ui.common.a$a, reason: collision with other inner class name */
    public static final class C4675a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4675a f159923l = new C4675a();

        public C4675a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                Image image = new Image(Collections.singletonMap(new Size(44, 44), Uri.parse("")));
                C42784z0 c42784z0 = C42784z0.f406748b;
                i.c(new t(new h("Через СБП по номеру +7······2210", new AttributedText("Сюда не получится отправить деньги", c42784z0, 0, 4, null), new UniversalImage(image, image), null, 8, null), "Получить", new NoMatchLink(), new AttributedText("Нажимая кнопку, вы соглашаетесь с пользовательским соглашением партнёра", c42784z0, 0, 4, null)), null, null, a13, 8, 14);
            }
            return G0.f406611a;
        }
    }
}
