package com.avito.android.serp.adapter.constructor.rich;

import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mc.C44049b;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "videoUrl", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.constructor.rich.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34726e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f269665l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269666m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f269667n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34726e(z zVar, SerpConstructorAdvertItem serpConstructorAdvertItem, int i12) {
        super(1);
        this.f269665l = zVar;
        this.f269666m = serpConstructorAdvertItem;
        this.f269667n = i12;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f269665l.f269716e.c(new mc.e(str, this.f269666m.getF83282d(), C44049b.a(VideoEventFromPage.f90107c), Integer.valueOf(this.f269667n), null, null, null, 96, null));
        return G0.f406611a;
    }
}
