package com.avito.android.re_agent_landing.landing.flows_dialog;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import com.avito.android.re_agent_landing.landing.items.action_block.CreationButton;
import com.avito.android.re_agent_landing.landing.items.action_block.CreationFlow;
import com.avito.android.re_agent_landing.landing.items.action_block.CreationInfoBlock;
import com.avito.android.re_agent_landing.landing.items.action_block.ReAgentProfileCreateLandingFlowsData;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentProfileCreateLandingFlowsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/e;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/c;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a, G0> f250660a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public TextView f250661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public FrameLayout f250662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public FrameLayout f250663d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public ImageView f250664e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ImageView f250665f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextView f250666g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public TextView f250667h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public LinearLayout f250668i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public TextView f250669j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Button f250670k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e f250671l = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 18);

    /* compiled from: ReAgentProfileCreateLandingFlowsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ReAgentProfileCreateLandingFlowsState.FlowType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ReAgentProfileCreateLandingFlowsState.FlowType flowType = ReAgentProfileCreateLandingFlowsState.FlowType.f250686b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a, G0> lVar) {
        this.f250660a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.re_agent_landing.landing.flows_dialog.c
    public final void a(@k ReAgentProfileCreateLandingFlowsState reAgentProfileCreateLandingFlowsState) {
        C42829l0 c42829l0;
        ReAgentProfileCreateLandingFlowsState.FlowType flowType = reAgentProfileCreateLandingFlowsState.f250685b;
        int iOrdinal = flowType.ordinal();
        ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData = reAgentProfileCreateLandingFlowsState.f250684a;
        if (iOrdinal == 0) {
            CreationFlow creationFlow = reAgentProfileCreateLandingFlowsData.f250729c;
            c42829l0 = new C42829l0(creationFlow, creationFlow.f250721d, reAgentProfileCreateLandingFlowsData.f250730d.f250720c);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            CreationFlow creationFlow2 = reAgentProfileCreateLandingFlowsData.f250730d;
            c42829l0 = new C42829l0(creationFlow2, reAgentProfileCreateLandingFlowsData.f250729c.f250720c, creationFlow2.f250721d);
        }
        CreationFlow creationFlow3 = (CreationFlow) c42829l0.f406871b;
        UniversalImage universalImage = (UniversalImage) c42829l0.f406872c;
        UniversalImage universalImage2 = (UniversalImage) c42829l0.f406873d;
        TextView textView = this.f250661b;
        if (textView != null) {
            I5.a(textView, reAgentProfileCreateLandingFlowsData.f250728b, false);
        }
        FrameLayout frameLayout = this.f250662c;
        if (frameLayout != null) {
            frameLayout.setSelected(flowType == ReAgentProfileCreateLandingFlowsState.FlowType.f250686b);
        }
        FrameLayout frameLayout2 = this.f250663d;
        if (frameLayout2 != null) {
            frameLayout2.setSelected(flowType == ReAgentProfileCreateLandingFlowsState.FlowType.f250687c);
        }
        ImageView imageView = this.f250664e;
        if (imageView != null) {
            com.avito.android.image_loader.glide.utils.b.c(imageView, n.a(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext()))).a(imageView));
        }
        ImageView imageView2 = this.f250665f;
        if (imageView2 != null) {
            com.avito.android.image_loader.glide.utils.b.c(imageView2, n.a(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage2, com.avito.android.lib.util.darkTheme.c.b(imageView2.getContext()))).a(imageView2));
        }
        TextView textView2 = this.f250666g;
        if (textView2 != null) {
            I5.a(textView2, reAgentProfileCreateLandingFlowsData.f250729c.f250719b, false);
        }
        TextView textView3 = this.f250667h;
        if (textView3 != null) {
            I5.a(textView3, reAgentProfileCreateLandingFlowsData.f250730d.f250719b, false);
        }
        LinearLayout linearLayout = this.f250668i;
        if (linearLayout != null) {
            ArrayList arrayList = creationFlow3.f250723f;
            linearLayout.removeAllViews();
            int i12 = 0;
            for (Object obj : arrayList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                CreationInfoBlock creationInfoBlock = (CreationInfoBlock) obj;
                com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                if (i12 != 0) {
                    layoutParams.topMargin = com.akita.view.foundation.util.f.a(16);
                }
                aVar.setLayoutParams(layoutParams);
                aVar.setText(creationInfoBlock.f250726b);
                aVar.setTextAppearance(C35835l0.j(R.attr.textH30, aVar.getContext()));
                com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = com.akita.view.foundation.util.f.a(6);
                aVar2.setLayoutParams(layoutParams2);
                aVar2.setTextAppearance(C35835l0.j(R.attr.textM10, aVar2.getContext()));
                j.c(aVar2, creationInfoBlock.f250727c, null);
                linearLayout.addView(aVar);
                linearLayout.addView(aVar2);
                i12 = i13;
            }
        }
        TextView textView4 = this.f250669j;
        if (textView4 != null) {
            AttributedText attributedText = creationFlow3.f250724g;
            if (attributedText != null) {
                attributedText.setOnDeepLinkClickListener(this.f250671l);
            }
            j.a(textView4, attributedText, null);
        }
        Button button = this.f250670k;
        if (button != null) {
            CreationButton creationButton = creationFlow3.f250722e;
            com.avito.android.lib.design.button.b.a(button, creationButton != null ? creationButton.f250717b : null, false);
        }
    }

    @Override // com.avito.android.re_agent_landing.landing.flows_dialog.c
    public final void b(@k View view) {
        View viewFindViewById = view.findViewById(R.id.re_agent_profile_create_landing_flows_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250661b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.re_agent_profile_create_landing_flows_upgrade_card_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        frameLayout.setOnClickListener(new d(this, 2));
        this.f250662c = frameLayout;
        View viewFindViewById3 = view.findViewById(R.id.re_agent_profile_create_landing_flows_create_card_content);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById3;
        frameLayout2.setOnClickListener(new d(this, 3));
        this.f250663d = frameLayout2;
        View viewFindViewById4 = view.findViewById(R.id.re_agent_profile_create_landing_flows_upgrade_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f250664e = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.re_agent_profile_create_landing_flows_create_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f250665f = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.re_agent_profile_create_landing_flows_upgrade_title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250666g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.re_agent_profile_create_landing_flows_create_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250667h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.re_agent_profile_create_landing_flows_info_block);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f250668i = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.re_agent_profile_create_landing_flows_disclaimer);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250669j = (TextView) viewFindViewById9;
    }

    @Override // com.avito.android.re_agent_landing.landing.flows_dialog.c
    public final void c(@k View view) {
        View viewFindViewById = view.findViewById(R.id.re_agent_profile_create_landing_flows_action_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        button.setOnClickListener(new d(this, 0));
        this.f250670k = button;
    }
}
