package com.avito.android.profile.edit;

import android.animation.Animator;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35872q;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: EditProfileView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/S;", "Lcom/avito/android/profile/edit/O;", "a", "b", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class S implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f221996a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f221997b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f221998c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f221999d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f222000e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public PV.b f222001f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Toolbar f222002g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final MenuItem f222003h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f222004i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f222005j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f222006k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f222007l;

    /* compiled from: EditProfileView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/S$a;", "Lcom/avito/android/util/q$b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C35872q.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f222008a;

        public a(@Y61.k View view) {
            this.f222008a = view;
        }

        @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            D6.w(this.f222008a);
        }
    }

    /* compiled from: EditProfileView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/S$b;", "Lcom/avito/android/util/q$b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C35872q.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f222009a;

        public b(@Y61.k View view) {
            this.f222009a = view;
        }

        @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            View view = this.f222009a;
            view.setAlpha(1.0f);
            D6.H(view);
        }
    }

    public S(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f221996a = viewGroup;
        Context context = viewGroup.getContext();
        this.f221997b = context;
        View viewFindViewById = viewGroup.findViewById(R.id.recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f221998c = recyclerView;
        View viewFindViewById2 = viewGroup.findViewById(R.id.content_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f221999d = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById2, R.id.recycler, interfaceC28373a, 0, 0, 24, null);
        View viewFindViewById3 = viewGroup.findViewById(R.id.save_progress);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f222000e = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.toolbar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById4;
        this.f222002g = toolbar;
        View viewFindViewById5 = viewGroup.findViewById(R.id.picker_root_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f222004i = viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.empty_space);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f222005j = viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.take_photo_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f222006k = viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.delete_avatar_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f222007l = viewFindViewById8;
        recyclerView.setAdapter(jVar);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        View viewFindViewById9 = viewGroup.findViewById(R.id.shadow);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        D6.H(viewFindViewById9);
        toolbar.setTitle(context.getString(R.string.edit_profile_title));
        toolbar.setNavigationIcon(R.drawable.ic_close_24_blue);
        MenuItem menuItemAdd = toolbar.getMenu().add(R.string.save);
        this.f222003h = menuItemAdd;
        menuItemAdd.setShowAsAction(2);
        b(false);
    }

    public final void a() {
        K2.d(this.f221996a, true);
    }

    public final void b(boolean z12) {
        this.f222003h.setEnabled(z12);
    }

    public final void c() {
        this.f221999d.j();
        D6.w(this.f222000e);
    }

    public final void d() {
        this.f221999d.a("");
    }

    public final void e() {
        this.f221999d.k(null);
    }
}
