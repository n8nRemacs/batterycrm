package com.avito.android.verification;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import vM0.f;

/* compiled from: VerificationResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/c;", "LvM0/f;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f323381a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f323382b = com.avito.android.printable_text.b.c(R.string.verification_alfa_id_default_error, new Serializable[0]);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f323383c = com.avito.android.printable_text.b.c(R.string.verification_vtb_id_default_error, new Serializable[0]);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f323384d = com.avito.android.printable_text.b.c(R.string.verification_tinkoff_default_error, new Serializable[0]);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f323385e = com.avito.android.printable_text.b.c(R.string.verification_tinkoff_app_not_installed_error, new Serializable[0]);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PrintableText f323386f = com.avito.android.printable_text.b.c(R.string.verification_tochka_default_error, new Serializable[0]);

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PrintableText f323387g = com.avito.android.printable_text.b.c(R.string.verification_sber_id_default_error, new Serializable[0]);

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f323388h;

    @Inject
    public c(@k Resources resources) throws Resources.NotFoundException {
        this.f323381a = resources.getString(R.string.verification_esia_default_error);
        resources.getString(R.string.verification_sber_business_default_error);
        this.f323388h = resources.getString(R.string.verification_default_select_placeholder);
    }

    @Override // vM0.f
    @k
    /* renamed from: a, reason: from getter */
    public final PrintableText getF323383c() {
        return this.f323383c;
    }

    @Override // vM0.f
    @k
    /* renamed from: b, reason: from getter */
    public final PrintableText getF323382b() {
        return this.f323382b;
    }

    @Override // vM0.f
    @k
    /* renamed from: c, reason: from getter */
    public final PrintableText getF323385e() {
        return this.f323385e;
    }

    @Override // vM0.f
    @k
    /* renamed from: d, reason: from getter */
    public final PrintableText getF323386f() {
        return this.f323386f;
    }

    @Override // vM0.f
    @k
    /* renamed from: e, reason: from getter */
    public final PrintableText getF323384d() {
        return this.f323384d;
    }

    @Override // vM0.f
    @k
    /* renamed from: f, reason: from getter */
    public final String getF323381a() {
        return this.f323381a;
    }

    @Override // vM0.f
    @k
    /* renamed from: g, reason: from getter */
    public final String getF323388h() {
        return this.f323388h;
    }

    @Override // vM0.f
    @k
    /* renamed from: h, reason: from getter */
    public final PrintableText getF323387g() {
        return this.f323387g;
    }
}
