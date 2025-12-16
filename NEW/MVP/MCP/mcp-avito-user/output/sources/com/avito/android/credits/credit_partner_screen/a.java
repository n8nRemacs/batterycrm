package com.avito.android.credits.credit_partner_screen;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CreditPartner.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/a;", "", "a", "b", "c", "d", "Lcom/avito/android/credits/credit_partner_screen/a$b;", "Lcom/avito/android/credits/credit_partner_screen/a$c;", "Lcom/avito/android/credits/credit_partner_screen/a$d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C3816a f128768g = new C3816a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f128769a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f128770b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f128771c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f128772d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f128773e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f128774f;

    /* compiled from: CreditPartner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/a$a;", "", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.credits.credit_partner_screen.a$a, reason: collision with other inner class name */
    public static final class C3816a {
        public /* synthetic */ C3816a(C42822w c42822w) {
            this();
        }

        public C3816a() {
        }
    }

    /* compiled from: CreditPartner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/a$b;", "Lcom/avito/android/credits/credit_partner_screen/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {
        public b(@l String str) {
            super(str == null ? "autobrokerHaraba" : str, G.f("HarabaCreditPartner_", str), "haraba-loan-web-page-application", null, null, null, 56, null);
        }
    }

    /* compiled from: CreditPartner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/a$c;", "Lcom/avito/android/credits/credit_partner_screen/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {
        public c(@l String str) {
            super(str == null ? "tinkoff" : str, G.f("TinkoffCreditPartner_", str), "tinkoff-loan-web-page-application", "desired_credit_amount", "down_payment", "desired_credit_term", null);
        }
    }

    /* compiled from: CreditPartner.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/a$d;", "Lcom/avito/android/credits/credit_partner_screen/a;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends a {

        /* renamed from: h, reason: collision with root package name */
        @k
        public static final d f128775h = new d();

        public d() {
            super("", "UnknownPartner", "", null, null, null, 56, null);
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, null);
    }

    public static int a(Uri uri, String str) {
        String queryParameter;
        Integer numY0;
        if (str == null || str.length() == 0 || (queryParameter = uri.getQueryParameter(str)) == null || (numY0 = C43066x.y0(queryParameter)) == null) {
            return 0;
        }
        return numY0.intValue();
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, C42822w c42822w) {
        this.f128769a = str;
        this.f128770b = str2;
        this.f128771c = str3;
        this.f128772d = str4;
        this.f128773e = str5;
        this.f128774f = str6;
    }
}
