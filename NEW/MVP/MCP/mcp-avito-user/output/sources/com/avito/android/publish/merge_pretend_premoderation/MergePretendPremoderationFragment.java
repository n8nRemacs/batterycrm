package com.avito.android.publish.merge_pretend_premoderation;

import Id0.InterfaceC14062b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23040h0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;

/* compiled from: MergePretendPremoderationFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/merge_pretend_premoderation/MergePretendPremoderationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/publish/premoderation/a;", "LId0/b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MergePretendPremoderationFragment extends BaseFragment implements com.avito.android.ui.fragments.c, com.avito.android.publish.premoderation.a, InterfaceC14062b, InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f237393t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public e f237394n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC44261b f237395o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f237396p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f237397q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public Q1 f237398r0;

    /* renamed from: s0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f237399s0;

    /* compiled from: MergePretendPremoderationFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/publish/merge_pretend_premoderation/MergePretendPremoderationFragment$a;", "", "<init>", "()V", "", "KEY_SHOULD_FINISH_AFTER_ACTIVATION", "Ljava/lang/String;", "", "REQ_ADVERT_DUPLICATE_DIALOG", "I", "TAG_ADVERT_DUPLICATE_DIALOG", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MergePretendPremoderationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f237400b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f237400b = (H) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f237400b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f237400b;
        }

        public final int hashCode() {
            return this.f237400b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f237400b.invoke(obj);
        }
    }

    public MergePretendPremoderationFragment() {
        super(R.layout.loading_progress_overlay_fragment);
    }

    @Override // com.avito.android.publish.premoderation.a
    public final void H0() {
        e eVar = this.f237394n0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.i0();
    }

    @Override // com.avito.android.publish.premoderation.a
    public final void Q1() {
        e eVar = this.f237394n0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.Q1();
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        e eVar = this.f237394n0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.i0();
        return true;
    }

    @Override // com.avito.android.publish.premoderation.a
    public final void n3(@Y61.k DeepLink deepLink) {
        Bundle bundle;
        if (deepLink instanceof MyAdvertDetailsLink ? true : deepLink instanceof MyAdvertLink.Activate) {
            bundle = new Bundle();
            InterfaceC44261b interfaceC44261b = this.f237395o0;
            bundle.putParcelable("up_intent", InterfaceC44261b.a.a(interfaceC44261b != null ? interfaceC44261b : null, null, null, null, null, 31));
            bundle.putBoolean("key_should_finish_after_activation", false);
        } else {
            bundle = null;
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f237397q0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, bundle, 2);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.publish.merge_pretend_premoderation.di.a.a().a(getF42820b(), (com.avito.android.publish.merge_pretend_premoderation.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.merge_pretend_premoderation.di.c.class), cv.c.b(this)).a(this);
        ViewGroup viewGroup = (ViewGroup) getView();
        InterfaceC28373a interfaceC28373a = this.f237396p0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.progress_overlay_container, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_progress_overlay, 0, 16, null);
        this.f237399s0 = lVar;
        lVar.f231600j = new com.avito.android.publish.merge_pretend_premoderation.a(this);
        e eVar = this.f237394n0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.o0().observe(getViewLifecycleOwner(), new b(new com.avito.android.publish.merge_pretend_premoderation.b(1, this, MergePretendPremoderationFragment.class, "renderState", "renderState(Lcom/avito/android/publish/merge_pretend_premoderation/state/MergePretendPremoderationScreenState;)V", 0)));
        e eVar2 = this.f237394n0;
        (eVar2 != null ? eVar2 : null).za().observe(getViewLifecycleOwner(), new b(new c(1, this, MergePretendPremoderationFragment.class, "renderActions", "renderActions(Lcom/avito/android/publish/merge_pretend_premoderation/state/MergePretendPremoderationAction;)V", 0)));
    }
}
