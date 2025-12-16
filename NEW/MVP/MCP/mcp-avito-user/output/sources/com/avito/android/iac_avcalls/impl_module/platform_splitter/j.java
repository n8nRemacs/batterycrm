package com.avito.android.iac_avcalls.impl_module.platform_splitter;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsVideoRendererStorageSplitter.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/j;", "LMJ/b;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements MJ.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FJ.a f164518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<EJ.d> f164519b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f164520c = C42727D.c(new a());

    /* compiled from: AvCallsVideoRendererStorageSplitter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LMJ/b;", "kotlin.jvm.PlatformType", "invoke", "()LMJ/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<MJ.b> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final MJ.b invoke() {
            j jVar = j.this;
            return jVar.f164518a.v().invoke().booleanValue() ? com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api.d.f164436a : jVar.f164519b.get();
        }
    }

    @Inject
    public j(@Y61.k FJ.a aVar, @Y61.k h31.e<EJ.d> eVar) {
        this.f164518a = aVar;
        this.f164519b = eVar;
    }

    @Override // MJ.b
    @Y61.k
    public final MJ.a a(@Y61.k String str, boolean z12) {
        return ((MJ.b) this.f164520c.getValue()).a(str, z12);
    }

    @Override // MJ.b
    public final void b(@Y61.k String str, boolean z12) {
        ((MJ.b) this.f164520c.getValue()).b(str, z12);
    }
}
