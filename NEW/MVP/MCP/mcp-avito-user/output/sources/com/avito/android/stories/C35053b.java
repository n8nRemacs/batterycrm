package com.avito.android.stories;

import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.stories.model.StoryBannerItem;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SerpStoriesItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/b;", "Lcom/avito/android/stories/view/a;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.stories.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35053b extends com.avito.android.serp.c implements com.avito.android.stories.view.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.stories.view.a f285081b;

    public C35053b(@Y61.k View view, @Y61.k com.avito.android.stories.view.j jVar) {
        super(view);
        this.f285081b = jVar.a(view);
    }

    @Override // com.avito.android.stories.view.p
    public final void D40(@Y61.k StoryBannerItem storyBannerItem, @Y61.k Y41.a<G0> aVar) {
        this.f285081b.D40(storyBannerItem, aVar);
    }

    @Override // com.avito.android.stories.view.i
    public final void HV(@Y61.l String str) {
        this.f285081b.HV(str);
    }

    @Override // com.avito.android.stories.view.c
    public final void Nk(int i12, int i13) {
        this.f285081b.Nk(i12, i13);
    }

    @Override // com.avito.android.stories.view.c
    public final void VS(@Y61.k Y41.a<G0> aVar) {
        this.f285081b.VS(aVar);
    }

    @Override // com.avito.android.stories.view.c
    public final void W0(int i12) {
        this.f285081b.W0(i12);
    }

    @Override // com.avito.android.stories.view.p
    public final void cr(int i12) {
        this.f285081b.cr(i12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f285081b.j5();
    }

    @Override // com.avito.android.stories.view.c
    @Y61.l
    public final Parcelable lu() {
        return this.f285081b.lu();
    }

    @Override // com.avito.android.stories.view.p
    public final boolean ng() {
        return this.f285081b.ng();
    }

    @Override // com.avito.android.stories.view.c
    public final void ol(@Y61.l Parcelable parcelable) {
        this.f285081b.ol(parcelable);
    }

    @Override // com.avito.android.stories.view.c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Integer> rj() {
        return this.f285081b.rj();
    }

    @Override // com.avito.android.stories.view.c
    public final void xv(@Y61.l ArrayList arrayList, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        this.f285081b.xv(arrayList, lVar, lVar2);
    }
}
