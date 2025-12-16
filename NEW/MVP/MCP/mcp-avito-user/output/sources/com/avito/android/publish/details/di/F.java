package com.avito.android.publish.details.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.publish.details.InterfaceC33675a;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class F implements dagger.internal.h<com.avito.android.category_parameters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f233618a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233619b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f233620c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f233621d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f233622e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f233623f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f233624g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC33675a> f233625h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f233626i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f233627j;

    public F(S3 s32, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider, dagger.internal.u uVar5, dagger.internal.u uVar6) {
        this.f233618a = s32;
        this.f233619b = uVar;
        this.f233620c = uVar2;
        this.f233621d = lVar;
        this.f233622e = lVar2;
        this.f233623f = uVar3;
        this.f233624g = uVar4;
        this.f233625h = provider;
        this.f233626i = uVar5;
        this.f233627j = uVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        CategoryPublishStep.Params.Config config;
        Boolean showRequiredFieldSign;
        this.f233618a.getClass();
        L4 l4A = S3.a();
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) this.f233619b.get();
        Locale locale = (Locale) this.f233620c.get();
        Resources resources = (Resources) this.f233621d.f393949a;
        boolean zBooleanValue = ((Boolean) this.f233622e.f393949a).booleanValue();
        hJ.e eVar = (hJ.e) this.f233623f.get();
        hJ.g gVar = (hJ.g) this.f233624g.get();
        InterfaceC33675a interfaceC33675a = this.f233625h.get();
        Q1 q12 = (Q1) this.f233626i.get();
        u3.l lVar = (u3.l) this.f233627j.get();
        B.f233608a.getClass();
        CategoryPublishStep categoryPublishStepA = interfaceC33675a.a();
        boolean zBooleanValue2 = false;
        if (categoryPublishStepA != null && (categoryPublishStepA instanceof CategoryPublishStep.Params) && (config = ((CategoryPublishStep.Params) categoryPublishStepA).getConfig()) != null && (showRequiredFieldSign = config.getShowRequiredFieldSign()) != null) {
            zBooleanValue2 = showRequiredFieldSign.booleanValue();
        }
        boolean z12 = zBooleanValue2;
        kotlin.reflect.n<Object>[] nVarArr = Q1.f67448x0;
        kotlin.reflect.n<Object> nVar = nVarArr[13];
        boolean zBooleanValue3 = ((Boolean) q12.f67502o.a().invoke()).booleanValue();
        kotlin.reflect.n<Object> nVar2 = nVarArr[35];
        boolean zBooleanValue4 = ((Boolean) q12.f67458J.a().invoke()).booleanValue();
        kotlin.reflect.n<Object> nVar3 = nVarArr[36];
        boolean zBooleanValue5 = ((Boolean) q12.f67459K.a().invoke()).booleanValue();
        kotlin.reflect.n<Object> nVar4 = nVarArr[52];
        return new com.avito.android.category_parameters.a(l4A, resources, fVar, zBooleanValue, false, locale, false, gVar, eVar, q12, z12, zBooleanValue3, zBooleanValue4, zBooleanValue5, ((Boolean) q12.f67474Z.a().invoke()).booleanValue(), lVar, 80, null);
    }
}
