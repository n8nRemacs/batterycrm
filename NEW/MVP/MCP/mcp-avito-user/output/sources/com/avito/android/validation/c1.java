package com.avito.android.validation;

import android.content.res.Resources;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ParametersUtilsModule_ProvideCategoryParameterStringValueConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class c1 implements dagger.internal.h<InterfaceC35998b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f319353a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Resources> f319354b;

    /* renamed from: c, reason: collision with root package name */
    public final S3 f319355c;

    public c1(S3 s32, Provider provider, Provider provider2) {
        this.f319353a = provider;
        this.f319354b = provider2;
        this.f319355c = s32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = this.f319353a.get();
        Resources resources = this.f319354b.get();
        this.f319355c.getClass();
        L4 l4A = S3.a();
        b1.f319347a.getClass();
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setGroupingUsed(false);
        return new C36000c(numberFormat, l4A, locale, resources);
    }
}
