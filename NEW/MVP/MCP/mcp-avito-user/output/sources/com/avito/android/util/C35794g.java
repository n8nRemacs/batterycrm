package com.avito.android.util;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: AdvertLongPriceFormatter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/g;", "Lcom/avito/android/util/t1;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35794g implements InterfaceC35945t1<Long> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f318875a;

    /* compiled from: AdvertLongPriceFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<NumberFormat> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Locale f318876l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locale locale) {
            super(0);
            this.f318876l = locale;
        }

        @Override // Y41.a
        public final NumberFormat invoke() {
            NumberFormat numberInstance = NumberFormat.getNumberInstance(this.f318876l);
            numberInstance.setGroupingUsed(true);
            return numberInstance;
        }
    }

    @Inject
    public C35794g(@Y61.k Locale locale) {
        this.f318875a = C42727D.b(LazyThreadSafetyMode.f406615c, new a(locale));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.util.InterfaceC35945t1
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(@Y61.l Long l12) {
        String strValueOf;
        if (l12 == null) {
            return "";
        }
        long jLongValue = l12.longValue();
        try {
            strValueOf = ((Format) this.f318875a.getValue()).format(l12);
        } catch (Exception unused) {
            strValueOf = String.valueOf(jLongValue);
        }
        return androidx.appcompat.app.r.q(strValueOf, " ₽");
    }
}
