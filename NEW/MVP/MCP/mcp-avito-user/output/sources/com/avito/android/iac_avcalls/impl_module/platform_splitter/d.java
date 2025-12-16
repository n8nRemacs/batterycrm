package com.avito.android.iac_avcalls.impl_module.platform_splitter;

import com.avito.android.iac_avcalls.public_module.models.AvCallsCallState;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsPlatformSplitter.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/d;", "LHJ/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements HJ.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FJ.a f164502a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.iac_avcalls.impl_module.platform_v1.d> f164503b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.iac_avcalls.impl_module.platform.a> f164504c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f164505d = C42727D.c(new a());

    /* compiled from: AvCallsPlatformSplitter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LHJ/a;", "kotlin.jvm.PlatformType", "invoke", "()LHJ/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<HJ.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final HJ.a invoke() {
            d dVar = d.this;
            return dVar.f164502a.v().invoke().booleanValue() ? dVar.f164504c.get() : dVar.f164503b.get();
        }
    }

    @Inject
    public d(@Y61.k FJ.a aVar, @Y61.k h31.e<com.avito.android.iac_avcalls.impl_module.platform_v1.d> eVar, @Y61.k h31.e<com.avito.android.iac_avcalls.impl_module.platform.a> eVar2) {
        this.f164502a = aVar;
        this.f164503b = eVar;
        this.f164504c = eVar2;
    }

    @Override // HJ.a
    public final void a(@Y61.k String str, boolean z12) {
        o().a(str, z12);
    }

    @Override // HJ.a
    public final boolean b(@Y61.k String str, @Y61.k String str2) {
        return o().b(str, str2);
    }

    @Override // HJ.a
    public final void c(@Y61.k String str, boolean z12) {
        o().c(str, z12);
    }

    @Override // HJ.a
    public final void d(@Y61.k AvCallsCameraPosition avCallsCameraPosition) {
        o().d(avCallsCameraPosition);
    }

    @Override // HJ.a
    public final void e(@Y61.k String str, boolean z12, @Y61.k MJ.a aVar) {
        o().e(str, z12, aVar);
    }

    @Override // HJ.a
    @Y61.k
    public final z<AvCallsEvent> f() {
        return o().f();
    }

    @Override // HJ.a
    public final void g(@Y61.k String str, boolean z12, @Y61.k MJ.a aVar) {
        o().g(str, z12, aVar);
    }

    @Override // HJ.a
    @Y61.k
    public final JJ.b getConfig() {
        return o().getConfig();
    }

    @Override // HJ.a
    @Y61.k
    public final I<G0> h(@Y61.k String str, @Y61.k AvCallsTerminateReason avCallsTerminateReason) {
        return o().h(str, avCallsTerminateReason);
    }

    @Override // HJ.a
    @Y61.k
    public final I<G0> i(@Y61.k String str) {
        return o().i(str);
    }

    @Override // HJ.a
    @Y61.k
    public final I<G0> j(@Y61.k String str) {
        return o().j(str);
    }

    @Override // HJ.a
    @Y61.k
    public final I<G0> k(@Y61.k IacPiiString iacPiiString) {
        return o().k(iacPiiString);
    }

    @Override // HJ.a
    @Y61.k
    public final I<G0> l(@Y61.k String str) {
        return o().l(str);
    }

    @Override // HJ.a
    @Y61.k
    public final I<G0> m(@Y61.k IacPiiString iacPiiString) {
        return o().m(iacPiiString);
    }

    @Override // HJ.a
    @Y61.k
    public final I<AvCallsCallState> n(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo) {
        return o().n(str, str2, str3, z12, avCallsCreateCallMetaInfo);
    }

    @Y61.k
    public final HJ.a o() {
        return (HJ.a) this.f164505d.getValue();
    }
}
