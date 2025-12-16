package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import aw0.C24186b;
import aw0.C24187c;
import aw0.C24188d;
import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/m;", "", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f281918e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BookingFormOpenParams f281919a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f281920b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.data.models.c f281921c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f281922d;

    /* compiled from: BookingFormMapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/m$a;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static C24186b a(@Y61.k BookingFormOpenParams bookingFormOpenParams) {
            C24188d c24188d;
            Integer num = bookingFormOpenParams.f281217e;
            if (num == null && bookingFormOpenParams.f281218f == null && bookingFormOpenParams.f281219g == null) {
                c24188d = null;
            } else {
                c24188d = new C24188d(num, bookingFormOpenParams.f281218f, bookingFormOpenParams.f281220h, bookingFormOpenParams.f281219g, bookingFormOpenParams.f281221i, false);
            }
            return new C24186b(bookingFormOpenParams.f281214b, new C24187c(bookingFormOpenParams.f281215c, bookingFormOpenParams.f281216d, false), c24188d, P0.c(), null, null, bookingFormOpenParams.f281225m, null, bookingFormOpenParams.f281222j, bookingFormOpenParams.f281223k, null);
        }

        public a() {
        }
    }

    @Inject
    public m(@Y61.k BookingFormOpenParams bookingFormOpenParams, @Y61.k Gson gson, @Y61.k com.avito.android.short_term_rent.bookingform.data.models.c cVar, @Y61.k k kVar) {
        this.f281919a = bookingFormOpenParams;
        this.f281920b = gson;
        this.f281921c = cVar;
        this.f281922d = kVar;
    }
}
