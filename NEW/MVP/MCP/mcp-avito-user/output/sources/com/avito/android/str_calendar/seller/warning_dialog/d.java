package com.avito.android.str_calendar.seller.warning_dialog;

import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.str_booking.network.models.common.Button;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogActions;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogCondition;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogData;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: StrCalendarWarningDialogScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f288071a = new d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f288072b = new C22096n(1975052474, a.f288073l, false);

    /* compiled from: StrCalendarWarningDialogScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f288073l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                q.a(new WarningDialogData("Отключить мгновенное бронирование?", C42745f0.U(new WarningDialogCondition(null, new AttributedText("{{condition}} {{link}}", C42745f0.U(new FontAttribute("condition", "Вы не сможете принимать командированных", com.avito.android.advert.item.delivery_suggests.l.u(null, "m20")), new LinkAttribute("link", "ссылка", "http://google.com", null, 8, null)), 1)), new WarningDialogCondition(null, new AttributedText("{{condition}}", Collections.singletonList(new FontAttribute("condition", "Базовая комиссия за бронь без него — 17%", com.avito.android.advert.item.delivery_suggests.l.u(null, "m20"))), 1))), new WarningDialogActions(new Button("Да, отключить", "secondary", null, null), new Button("Нет, к настройкам", "primary", new ButtonAction(Collections.singletonMap("scrollToId", "instant.active"), null, null, null, null), null))), com.avito.android.str_calendar.seller.warning_dialog.a.f288062l, b.f288063l, c.f288064l, a13, 3512);
            }
            return G0.f406611a;
        }
    }
}
