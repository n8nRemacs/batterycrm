package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import android.net.Uri;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.text.C22602e;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LotItemPreviewBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34216l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C34216l f251022a = new C34216l();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f251023b = new C22096n(1801511852, a.f251025l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f251024c = new C22096n(-1511887038, b.f251026l, false);

    /* compiled from: LotItemPreviewBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.l$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f251025l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                Image image = new Image(Collections.singletonMap(new Size(432, 324), Uri.parse("https://00-staging-avicdn.msk.avito.ru/image/1/1.gvOO3LaxLhrYeaQdhs7a79R9LBo8aSoY.rDzBCS3Pf4bgHrtVZnQ7WVW1WEeJMj2V-YbGR6AnDCc?cqp=2.XouE6SaTaoMqmW06sOjp3oTTDFly3bAqaelj8Zae--hdKexH")));
                C22602e.b bVar = new C22602e.b(0, 1, null);
                bVar.f("Комиссия агента 338 772 ₽");
                x.a(new I(1L, image, false, "6 677 543 ₽", "231 057 ₽ за м²", "20м²  ·  16 из 18 эт.  ·  4 кв. 2028  ·  Лоджия  ·  С/у совмещ  ·  Предчистовая", bVar.m(), true), null, a13, 8, 2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LotItemPreviewBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.l$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f251026l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                x.a(new I(1L, null, true, "Не продаётся", null, "20м²  ·  16 из 18 эт.  ·  4 кв. 2028  ·  Лоджия  ·  С/у совмещ  ·  Предчистовая", null, false), null, a13, 8, 2);
            }
            return G0.f406611a;
        }
    }
}
