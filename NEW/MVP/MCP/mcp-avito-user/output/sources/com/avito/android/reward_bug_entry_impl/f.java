package com.avito.android.reward_bug_entry_impl;

import Y61.k;
import android.app.Activity;
import android.app.Application;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.reward_bug_entry_impl.mvi.p;
import com.avito.android.util.AbstractC35776d5;
import com.avito.android.webview.m;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.IdentityHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import ln0.C43803a;
import mn0.C44109b;

/* compiled from: RewardBugEntryLifecycleCallbacksImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/f;", "Lcom/avito/android/reward_bug_entry_impl/domain/b;", "Lcom/avito/android/util/d5;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends AbstractC35776d5 implements com.avito.android.reward_bug_entry_impl.domain.b {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final m f255627c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43803a f255628d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final p f255629e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final IdentityHashMap<Activity, C44109b> f255630f = new IdentityHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<String> f255631g = C42745f0.U("DebugActivity", "WebViewActivity", "LeakActivity", "AvlPlayerActivity");

    @Inject
    public f(@k m mVar, @k C43803a c43803a, @k p pVar) {
        this.f255627c = mVar;
        this.f255628d = c43803a;
        this.f255629e = pVar;
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.b
    public final void a(@k Application application) {
        C43803a c43803a = this.f255628d;
        c43803a.getClass();
        n<Object> nVar = C43803a.f414191d[0];
        if (((Boolean) c43803a.f414192b.a().invoke()).booleanValue()) {
            application.registerActivityLifecycleCallbacks(this.f318859a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.util.AbstractC35776d5
    public final void c(@k Activity activity) {
        if (this.f255631g.contains(activity.getClass().getSimpleName()) || activity.getResources().getConfiguration().orientation == 2) {
            return;
        }
        InterfaceC22983P interfaceC22983P = activity instanceof InterfaceC22983P ? (InterfaceC22983P) activity : null;
        if (interfaceC22983P != null) {
            com.avito.android.arch.mvi.android.f.a(this.f255629e, interfaceC22983P, Lifecycle.State.f46681d, d.f255575l, new e(this, activity));
        }
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void d(@k Activity activity) {
        i(activity);
    }

    public final void i(Activity activity) {
        IdentityHashMap<Activity, C44109b> identityHashMap = this.f255630f;
        C44109b c44109b = identityHashMap.get(activity);
        if (c44109b != null) {
            c44109b.getCloseIcon().setOnClickListener(null);
            c44109b.getImageView().setOnClickListener(null);
            c44109b.setOnPositionOnScreenChanged(null);
            c44109b.setOnClick(null);
            c44109b.setOnDrag(null);
        }
        if (identityHashMap.containsKey(activity)) {
            identityHashMap.remove(activity);
        }
    }

    @Override // com.avito.android.util.AbstractC35776d5
    public final void f(@k Activity activity) {
    }
}
