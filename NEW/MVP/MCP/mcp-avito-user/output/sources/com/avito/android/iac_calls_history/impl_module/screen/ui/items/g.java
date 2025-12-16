package com.avito.android.iac_calls_history.impl_module.screen.ui.items;

import Y61.k;
import com.avito.android.R;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacCallsHistoryItemUI.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-calls-history_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f164926a = C42727D.c(a.f164930l);

    /* renamed from: b, reason: collision with root package name */
    public static final int f164927b = R.string.iac_calls_history_item_status_separator;

    /* renamed from: c, reason: collision with root package name */
    public static final int f164928c = R.string.iac_calls_history_item_status_avito;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<IacCallsHistoryItem> f164929d;

    /* compiled from: IacCallsHistoryItemUI.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<DateTimeFormatter> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f164930l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final DateTimeFormatter invoke() {
            return DateTimeFormatter.ofPattern("H:mm");
        }
    }

    static {
        UniversalColor universalColor = new UniversalColor(null, new Color(android.graphics.Color.parseColor("#878787")), new Color(android.graphics.Color.parseColor("#757575")));
        f164929d = C42745f0.U(new IacCallsHistoryItem("", new NoMatchLink(), LocalDateTime.of(2025, 9, 1, 17, 45), 129, "Входящий", universalColor, "Apple MacBook Air 15 2023", 170000L, "Валерий Петров"), new IacCallsHistoryItem("", new NoMatchLink(), LocalDateTime.of(2025, 8, 30, 11, 19), null, "Исходящий", universalColor, "Карбюратор 2101", 2000L, "Михаил"), new IacCallsHistoryItem("", new NoMatchLink(), LocalDateTime.of(2025, 8, 30, 10, 54), 35, "Исходящий", universalColor, "Карбюратор 2101", 2000L, "Михаил"), new IacCallsHistoryItem("", new NoMatchLink(), LocalDateTime.of(2025, 8, 27, 17, 32), null, "Пропущенный", new UniversalColor(null, new Color(android.graphics.Color.parseColor("#FC5D63")), new Color(android.graphics.Color.parseColor("#FF4053"))), "Sony playstation 5 pro", 42000L, "Алиса"));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem r41, @Y61.k java.time.LocalDate r42, @Y61.k Y41.l r43, @Y61.l androidx.compose.runtime.A r44, int r45) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_calls_history.impl_module.screen.ui.items.g.a(com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem, java.time.LocalDate, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
