package com.avito.android.publish.slots.parameters_suggest;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.j;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.parameters_suggest.ParametersSuggestByAddressSlot;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.reflect.n;
import yc.C50213a;

/* compiled from: ParametersSuggestByAddressSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/parameters_suggest/f;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/parameters_suggest/ParametersSuggestByAddressSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends j<ParametersSuggestByAddressSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ParametersSuggestByAddressSlot f244674b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final H0 f244675c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Q1 f244676d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C0 f244677e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC34155z f244678f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f244679g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f244680h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f244681i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C50213a f244682j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f244683k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f244684l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f244685m;

    @i31.c
    public f(@InterfaceC41220a @k ParametersSuggestByAddressSlot parametersSuggestByAddressSlot, @k H0 h02, @k Q1 q12, @k C0 c02, @k InterfaceC34155z interfaceC34155z, @k com.avito.android.details.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k CategoryParametersConverter categoryParametersConverter, @k C50213a c50213a) {
        this.f244674b = parametersSuggestByAddressSlot;
        this.f244675c = h02;
        this.f244676d = q12;
        this.f244677e = c02;
        this.f244678f = interfaceC34155z;
        this.f244679g = aVar;
        this.f244680h = interfaceC35745a5;
        this.f244681i = categoryParametersConverter;
        this.f244682j = c50213a;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f244683k = cVar;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f244684l = cVar2;
        cVar.b(c02.f231882t0.N(a.f244669b).j0(interfaceC35745a5.e()).v0(new b(this), c.f244671b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        this.f244685m = cVar2;
    }

    @Override // com.avito.android.publish.slots.q
    @k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f244685m;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f244683k.e();
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244674b;
    }

    @Override // com.avito.android.category_parameters.j
    @k
    public final z<P2<G0>> h() {
        List<ParameterSlot> parameters;
        C0 c02 = this.f244677e;
        if (c02.f231872j0) {
            CategoryParameters categoryParametersC0 = this.f244679g.C0();
            if (categoryParametersC0 != null && (parameters = categoryParametersC0.getParameters()) != null) {
                Q1 q12 = this.f244676d;
                q12.getClass();
                n<Object> nVar = Q1.f67448x0[1];
                boolean zBooleanValue = ((Boolean) q12.f67478c.a().invoke()).booleanValue();
                InterfaceC34155z interfaceC34155z = this.f244678f;
                C50213a c50213a = this.f244682j;
                H0 h02 = this.f244675c;
                CategoryParametersConverter categoryParametersConverter = this.f244681i;
                z<TypedResult<CategoryParameters>> zVarL = zBooleanValue ? h02.L(c50213a.b(), categoryParametersConverter.convertToFieldMap(interfaceC34155z.U()), categoryParametersConverter.convertToFieldMap(parameters)) : h02.m(c50213a.b(), categoryParametersConverter.convertToFieldMap(interfaceC34155z.U()), categoryParametersConverter.convertToFieldMap(parameters));
                InterfaceC35745a5 interfaceC35745a5 = this.f244680h;
                this.f244683k.b(zVarL.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new d(this), new e(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
            c02.f231872j0 = false;
        }
        return super.h();
    }
}
