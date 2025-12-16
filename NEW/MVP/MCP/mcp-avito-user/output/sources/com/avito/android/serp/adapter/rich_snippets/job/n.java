package com.avito.android.serp.adapter.rich_snippets.job;

import Q81.a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.KeyAttributes;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.SellerInfoInlineAdvantage;
import com.avito.android.remote.model.SellerOnlineStatus;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.serp.job.JobSnippetContactButtonType;

/* compiled from: AdvertRichJobItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/c;", "Lru/avito/component/serp/job/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.android.serp.c implements m, ru.avito.component.serp.job.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.avito.component.serp.job.e f270835b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public N f270836c;

    public n(@Y61.k View view, @InterfaceC42150f int i12, boolean z12, @Y61.k JobSnippetContactButtonType jobSnippetContactButtonType) {
        super(view);
        this.f270835b = new ru.avito.component.serp.job.e(view, i12, z12, jobSnippetContactButtonType);
    }

    @Override // ru.avito.component.serp.job.c
    public final void FO() {
        this.f270835b.FO();
    }

    @Override // ru.avito.component.serp.job.c
    public final void H0() {
        this.f270835b.H0();
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        ru.avito.component.serp.job.e eVar = this.f270835b;
        eVar.getClass();
        a.C0890a.a(eVar, z12);
    }

    @Override // ru.avito.component.serp.job.c
    public final void K0(@Y61.k String str, boolean z12) {
        this.f270835b.K0(str, z12);
    }

    @Override // ru.avito.component.serp.job.c
    public final void LS(@Y61.k Action action, @Y61.k Y41.a<G0> aVar) {
        this.f270835b.LS(action, aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void MU(@Y61.l KeyAttributes keyAttributes) {
        this.f270835b.MU(keyAttributes);
    }

    @Override // ru.avito.component.serp.job.c
    public final void Q50(@Y61.l com.avito.android.image_loader.a aVar) {
        this.f270835b.Q50(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void Vo(@Y61.l List<SellerInfoInlineAdvantage> list, @Y61.l String str, @Y61.l SellerOnlineStatus sellerOnlineStatus) {
        this.f270835b.Vo(list, str, sellerOnlineStatus);
    }

    @Override // ru.avito.component.serp.job.c
    public final void X50(@Y61.k Y41.a<G0> aVar) {
        this.f270835b.X50(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void b0(@Y61.l String str) {
        this.f270835b.b0(str);
    }

    @Override // ru.avito.component.serp.job.c
    public final void bk(@Y61.k ru.avito.component.serp.job.geo.a aVar) {
        this.f270835b.bk(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.rich_snippets.job.m
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f270836c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ?? r02 = this.f270836c;
        if (r02 != 0) {
            r02.invoke();
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void jb(boolean z12, boolean z13) {
        this.f270835b.jb(z12, false);
    }

    @Override // ru.avito.component.serp.job.c
    public final void l5(@Y61.k Y41.a<G0> aVar) {
        this.f270835b.l5(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void lo(@Y61.k ru.avito.component.serp.job.geo.g gVar) {
        this.f270835b.lo(gVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void n1(@Y61.l List<SellerInfoAdvantage> list) {
        this.f270835b.n1(list);
    }

    @Override // ru.avito.component.serp.job.c
    public final void o5(@Y61.l SerpBadgeBar serpBadgeBar) {
        this.f270835b.o5(serpBadgeBar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void om(@Y61.k Y41.l<? super AdvertAction, G0> lVar) {
        this.f270835b.om(lVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void p(@Y61.l String str) {
        this.f270835b.p(str);
    }

    @Override // ru.avito.component.serp.job.c
    public final void qD(@Y61.l List<? extends AdvertAction> list, boolean z12) {
        this.f270835b.qD(list, z12);
    }

    @Override // ru.avito.component.serp.job.c
    public final void setActive(boolean z12) {
        this.f270835b.setActive(z12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f270835b.setPhoneLoadingState(phoneLoadingState);
    }

    @Override // ru.avito.component.serp.job.c
    public final void setViewed(boolean z12) {
        this.f270835b.setViewed(z12);
    }

    @Override // ru.avito.component.serp.job.c
    public final void yT(@Y61.k Action action, @Y61.k Y41.a<G0> aVar) {
        this.f270835b.yT(action, aVar);
    }

    public /* synthetic */ n(View view, int i12, boolean z12, JobSnippetContactButtonType jobSnippetContactButtonType, int i13, C42822w c42822w) {
        this(view, (i13 & 2) != 0 ? R.attr.textM20 : i12, (i13 & 4) != 0 ? true : z12, (i13 & 8) != 0 ? JobSnippetContactButtonType.f430453e : jobSnippetContactButtonType);
    }
}
