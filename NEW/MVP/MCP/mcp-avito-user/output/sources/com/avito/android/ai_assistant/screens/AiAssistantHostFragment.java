package com.avito.android.ai_assistant.screens;

import Vb.InterfaceC15661a;
import Y41.l;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.view.C19918B;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.ai_assistant.AiAssistantActivity;
import com.avito.android.ai_assistant.AssistantChatArguments;
import com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment;
import com.avito.android.ai_assistant.screens.chat_list.AiAssistantChatListFragment;
import com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.ui.fragment.e;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.ui.status_bar.d;
import com.avito.android.ui.status_bar.k;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: AiAssistantHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/screens/AiAssistantHostFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/ai_assistant/screens/c;", "Lcom/avito/android/ui/status_bar/a;", "Lcom/avito/android/ui/status_bar/k;", "Lcom/avito/android/bottom_navigation/ui/fragment/e;", "<init>", "()V", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AiAssistantHostFragment extends TabBaseFragment implements InterfaceC28477j.a, c, com.avito.android.ui.status_bar.a, k, e {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f89138w0 = new a(null);

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f89139t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final n2<d> f89140u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f89141v0;

    /* compiled from: AiAssistantHostFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/ai_assistant/screens/AiAssistantHostFragment$a;", "", "<init>", "()V", "", "BUYER_ASSISTANT_ARGS", "Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AiAssistantHostFragment a(@Y61.k AssistantChatArguments assistantChatArguments) {
            AiAssistantHostFragment aiAssistantHostFragment = new AiAssistantHostFragment();
            C35966w1.a(aiAssistantHostFragment, -1, new com.avito.android.ai_assistant.screens.a(assistantChatArguments));
            return aiAssistantHostFragment;
        }

        public a() {
        }
    }

    /* compiled from: AiAssistantHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<x, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            AiAssistantHostFragment.this.D3();
            return G0.f406611a;
        }
    }

    public AiAssistantHostFragment() {
        super(R.layout.ai_assistant_host_fragment);
        this.f89139t0 = new NavigationState(false, null, 2, null);
        this.f89140u0 = p2.a(new d(ThemeAppearance.f181334b, new d.a.C9356a(R.attr.bg_elevation1)));
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.e
    public final boolean D3() {
        Fragment fragment = (Fragment) C42745f0.S(getChildFragmentManager().P());
        if (getChildFragmentManager().L() > 0 && (fragment instanceof AiAssistantChatListFragment)) {
            getChildFragmentManager().Y();
            return true;
        }
        G0 g02 = null;
        AiAssistantChatFragment aiAssistantChatFragment = fragment instanceof AiAssistantChatFragment ? (AiAssistantChatFragment) fragment : null;
        if (aiAssistantChatFragment != null) {
            aiAssistantChatFragment.q5().accept(InterfaceC15661a.d.f17216a);
            g02 = G0.f406611a;
        }
        if (g02 != null) {
            return true;
        }
        close();
        return true;
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.ai_assistant.screens.c
    public final void close() {
        if (!(l1() instanceof AiAssistantActivity)) {
            r5();
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<d> e2() {
        return this.f89140u0;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(@Y61.l android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            if (r7 != 0) goto L31
            android.os.Bundle r7 = r6.getArguments()
            if (r7 == 0) goto L22
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L18
            java.lang.Object r7 = com.avito.android.actions_sheet.b.B(r7)
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            goto L1e
        L18:
            java.lang.String r0 = "key.buyer_assistant_args"
            android.os.Parcelable r7 = r7.getParcelable(r0)
        L1e:
            com.avito.android.ai_assistant.AssistantChatArguments r7 = (com.avito.android.ai_assistant.AssistantChatArguments) r7
            if (r7 != 0) goto L2e
        L22:
            com.avito.android.ai_assistant.AssistantChatArguments r7 = new com.avito.android.ai_assistant.AssistantChatArguments
            r2 = 0
            r3 = 0
            java.lang.String r1 = ""
            r4 = 6
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
        L2e:
            r6.q4(r7)
        L31:
            com.avito.android.ui.status_bar.e r7 = r6.f89141v0
            if (r7 == 0) goto L36
            goto L37
        L36:
            r7 = 0
        L37:
            java.util.List r0 = java.util.Collections.singletonList(r6)
            r7.c(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.AiAssistantHostFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        a.b.c(this, false);
        ActivityC22955m activityC22955mL1 = l1();
        AiAssistantActivity aiAssistantActivity = activityC22955mL1 instanceof AiAssistantActivity ? (AiAssistantActivity) activityC22955mL1 : null;
        if (aiAssistantActivity != null) {
            C19918B.a(aiAssistantActivity.getF21241d(), getViewLifecycleOwner(), new b(), 2);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.ai_assistant.di.host.c.a().a((com.avito.android.ai_assistant.di.host.b) C29972i.a(C29972i.b(this), com.avito.android.ai_assistant.di.host.b.class)).a(this);
    }

    @Override // com.avito.android.ai_assistant.screens.c
    public final void q4(@Y61.k AssistantChatArguments assistantChatArguments) {
        AiAssistantChatFragment.f89144v0.getClass();
        AiAssistantChatFragment aiAssistantChatFragmentA = AiAssistantChatFragment.a.a(assistantChatArguments);
        H hE2 = getChildFragmentManager().e();
        hE2.o(R.anim.ai_assistant_slide_in_right, R.anim.ai_assistant_slide_out_left, R.anim.ai_assistant_slide_in_left, R.anim.ai_assistant_slide_out_right);
        hE2.n(R.id.buyer_assistant_host_fragment_container, aiAssistantChatFragmentA, null);
        hE2.e();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF89139t0() {
        return this.f89139t0;
    }

    @Override // com.avito.android.ai_assistant.screens.c
    public final void y4(@Y61.l String str, @Y61.l String str2) {
        AssistantChatListArguments assistantChatListArguments = new AssistantChatListArguments(str, str2);
        AiAssistantChatListFragment.f89567s0.getClass();
        AiAssistantChatListFragment aiAssistantChatListFragmentA = AiAssistantChatListFragment.a.a(assistantChatListArguments);
        H hE2 = getChildFragmentManager().e();
        hE2.o(R.anim.ai_assistant_slide_in_right, R.anim.ai_assistant_slide_out_left, R.anim.ai_assistant_slide_in_left, R.anim.ai_assistant_slide_out_right);
        hE2.n(R.id.buyer_assistant_host_fragment_container, aiAssistantChatListFragmentA, null);
        hE2.c(null);
        hE2.e();
    }
}
