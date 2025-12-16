package com.avito.android.stories.view;

import Hx0.C14046a;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.stories.model.StoryBannerItem;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StoriesItemViewImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/stories/view/b;", "Lcom/avito/android/stories/view/a;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/stories/view/c;", "Lcom/avito/android/stories/view/p;", "Lcom/avito/android/stories/view/i;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends com.avito.android.serp.c implements a, c, p, i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f285300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.stories.view.wide_banner.b f285301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C14046a f285302d;

    public b(@Y61.k View view) {
        super(view);
        this.f285300b = new h(view);
        this.f285301c = new com.avito.android.stories.view.wide_banner.b(view);
        this.f285302d = new C14046a(view);
    }

    @Override // com.avito.android.stories.view.p
    public final void D40(@Y61.k StoryBannerItem storyBannerItem, @Y61.k Y41.a<G0> aVar) {
        this.f285301c.D40(storyBannerItem, aVar);
    }

    @Override // com.avito.android.stories.view.i
    public final void HV(@Y61.l String str) {
        this.f285302d.HV(str);
    }

    @Override // com.avito.android.stories.view.c
    public final void Nk(int i12, int i13) {
        this.f285300b.Nk(i12, i13);
    }

    @Override // com.avito.android.stories.view.c
    public final void VS(@Y61.k Y41.a<G0> aVar) {
        this.f285300b.VS(aVar);
    }

    @Override // com.avito.android.stories.view.c
    public final void W0(int i12) {
        this.f285300b.W0(i12);
    }

    @Override // com.avito.android.stories.view.p
    public final void cr(int i12) {
        this.f285301c.cr(i12);
    }

    @Override // com.avito.android.stories.view.c
    @Y61.l
    public final Parcelable lu() {
        return this.f285300b.lu();
    }

    @Override // com.avito.android.stories.view.p
    public final boolean ng() {
        return this.f285301c.ng();
    }

    @Override // com.avito.android.stories.view.c
    public final void ol(@Y61.l Parcelable parcelable) {
        this.f285300b.ol(parcelable);
    }

    @Override // com.avito.android.stories.view.c
    @Y61.k
    public final z<Integer> rj() {
        return this.f285300b.f285313g;
    }

    @Override // com.avito.android.stories.view.c
    public final void xv(@Y61.l ArrayList arrayList, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        this.f285300b.xv(arrayList, lVar, lVar2);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
    }
}
