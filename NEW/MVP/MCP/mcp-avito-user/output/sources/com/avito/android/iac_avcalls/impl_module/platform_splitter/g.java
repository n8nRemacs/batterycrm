package com.avito.android.iac_avcalls.impl_module.platform_splitter;

import android.content.Context;
import android.view.View;
import com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsSurfaceViewRendererApiSplitter.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_splitter/g;", "Lcom/avito/android/iac_avcalls/public_module/video/AvCallsSurfaceViewRendererApi;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements AvCallsSurfaceViewRendererApi {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FJ.a f164511a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<EJ.a> f164512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f164513c = C42727D.c(new a());

    /* compiled from: AvCallsSurfaceViewRendererApiSplitter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_avcalls/public_module/video/AvCallsSurfaceViewRendererApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<AvCallsSurfaceViewRendererApi> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final AvCallsSurfaceViewRendererApi invoke() {
            g gVar = g.this;
            return gVar.f164511a.v().invoke().booleanValue() ? com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api.a.f164428a : gVar.f164512b.get();
        }
    }

    @Inject
    public g(@Y61.k FJ.a aVar, @Y61.k h31.e<EJ.a> eVar) {
        this.f164511a = aVar;
        this.f164512b = eVar;
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    @Y61.k
    public final View a(@Y61.k Context context) {
        return g().a(context);
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void b(@Y61.k View view, boolean z12) {
        g().b(view, z12);
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void c(@Y61.k View view) {
        g().c(view);
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void d(@Y61.k View view, @Y61.k String str, boolean z12, @Y61.k String str2) {
        g().d(view, str, z12, str2);
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void e(@Y61.k View view, @Y61.k AvCallsSurfaceViewRendererApi.ScalingTypeAspect scalingTypeAspect) {
        g().e(view, scalingTypeAspect);
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void f(@Y61.k View view, boolean z12) {
        g().f(view, z12);
    }

    @Y61.k
    public final AvCallsSurfaceViewRendererApi g() {
        return (AvCallsSurfaceViewRendererApi) this.f164513c.getValue();
    }
}
