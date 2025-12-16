package com.avito.android.publish.details;

import com.avito.android.publish.InterfaceC33513a;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.InterfaceC34150w0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.remote.model.AIDescription;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.util.AbstractC35806h3;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PublishDetailsInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/details/W0;", "Lcom/avito/android/publish/details/V0;", "Lcom/avito/android/publish/pretend/e;", "Lcom/avito/android/publish/PublishParametersInteractor;", "Lcom/avito/android/publish/l;", "Lcom/avito/android/publish/a;", "Lcom/avito/android/publish/w0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class W0 implements V0, com.avito.android.publish.pretend.e, PublishParametersInteractor, InterfaceC33878l, InterfaceC33513a, InterfaceC34150w0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.pretend.e f233175b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PublishParametersInteractor f233176c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33878l f233177d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33513a f233178e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34150w0 f233179f;

    @Inject
    public W0(@Y61.k com.avito.android.publish.pretend.e eVar, @Y61.k PublishParametersInteractor publishParametersInteractor, @Y61.k InterfaceC33878l interfaceC33878l, @Y61.k InterfaceC33513a interfaceC33513a, @Y61.k InterfaceC34150w0 interfaceC34150w0) {
        this.f233175b = eVar;
        this.f233176c = publishParametersInteractor;
        this.f233177d = interfaceC33878l;
        this.f233178e = interfaceC33513a;
        this.f233179f = interfaceC34150w0;
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final boolean Ca() {
        return this.f233179f.Ca();
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void Eb(@Y61.k String str) {
        this.f233179f.Eb(str);
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InterfaceC33878l.a> H8() {
        return this.f233177d.H8();
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    public final void W8(@Y61.k EditableParameter<?> editableParameter, @Y61.l String str, @Y61.l Integer num, @Y61.l CategoryParameters categoryParameters) {
        this.f233177d.W8(editableParameter, str, num, categoryParameters);
    }

    @Override // com.avito.android.publish.pretend.e
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PretendResult> a(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters) {
        return this.f233175b.a(navigation2, categoryParameters);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.z<AbstractC35806h3<CategoryParameters>> c(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters, @Y61.l String str) {
        return this.f233176c.c(navigation2, categoryParameters, str);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> e(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters, boolean z12, @Y61.l String str) {
        return this.f233176c.e(navigation2, categoryParameters, z12, str);
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final long e8() {
        return this.f233179f.e8();
    }

    @Override // com.avito.android.publish.InterfaceC33513a
    @Y61.l
    public final Object f(@Y61.l CategoryParameters categoryParameters, long j12, @Y61.k Continuation<? super TypedResult<String>> continuation) {
        return this.f233178e.f(categoryParameters, j12, continuation);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> g(@Y61.k Navigation navigation2, @Y61.l String str, @Y61.l Map<String, ? extends Object> map, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l String str3) {
        return this.f233176c.g(navigation2, str, map, str2, bool, str3);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ItemBrief> h(@Y61.k String str) {
        return this.f233176c.h(str);
    }

    @Override // com.avito.android.publish.InterfaceC33513a
    @Y61.k
    public final io.reactivex.rxjava3.core.I<AIDescription> i(@Y61.l CategoryParameters categoryParameters, @Y61.l String str, @Y61.l String str2) {
        return this.f233178e.i(categoryParameters, str, str2);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> j(@Y61.k Navigation navigation2, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return this.f233176c.j(navigation2, str, str2, str3);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.z k(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters, @Y61.k String str) {
        return this.f233176c.k(navigation2, categoryParameters, str);
    }

    @Override // com.avito.android.publish.pretend.e
    @Y61.k
    public final io.reactivex.rxjava3.core.z<AbstractC35806h3<PretendResult>> m(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters) {
        return this.f233175b.m(navigation2, categoryParameters);
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    public final void n6() {
        this.f233177d.n6();
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void oc() {
        this.f233179f.oc();
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final long qd() {
        return this.f233179f.qd();
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void r3(@Y61.k String str) {
        this.f233179f.r3(str);
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> z9(@Y61.k String str) {
        return this.f233179f.z9(str);
    }
}
