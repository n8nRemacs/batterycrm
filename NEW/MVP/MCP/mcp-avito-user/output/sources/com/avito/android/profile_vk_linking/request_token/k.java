package com.avito.android.profile_vk_linking.request_token;

import android.annotation.SuppressLint;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.Lifecycle;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: VkRequestTokenView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/k;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VkRequestTokenFragment f231359a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f231360b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WebView f231361c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f231362d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.status_view.g f231363e;

    public k(@Y61.k View view, @Y61.k VkRequestTokenFragment vkRequestTokenFragment, @Y61.k f fVar, @Y61.k l lVar) {
        this.f231359a = vkRequestTokenFragment;
        this.f231360b = fVar;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.vk_request_token_toolbar);
        WebView webView = (WebView) view.findViewById(R.id.vk_request_token_web_view);
        this.f231361c = webView;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.vk_request_token_refresh_layout);
        this.f231362d = swipeRefreshLayout;
        this.f231363e = new com.avito.android.status_view.g(view, null, new j(this), 2, null);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebViewClient(lVar);
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 10));
        toolbar.setNavigationOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 6));
        com.avito.android.arch.mvi.android.f.a(fVar, vkRequestTokenFragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, new h(1, this, k.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/profile_vk_linking/request_token/mvi/entity/VkRequestTokenOneTimeEvent;)V", 0), new i(1, this, k.class, "render", "render(Lcom/avito/android/profile_vk_linking/request_token/mvi/entity/VkRequestTokenState;)V", 0));
    }
}
