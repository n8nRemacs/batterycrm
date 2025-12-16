package com.avito.android.messenger.blacklist.mvi;

import Cd.C13243a;
import Zd.InterfaceC19542a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.AuthSource;
import com.avito.android.di.C29972i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.C47733d;
import ru.avito.messenger.C47743i;
import z1.AbstractC50339a;

/* compiled from: BlacklistActivity.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/BlacklistActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/messenger/blacklist/mvi/N;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]", "NonComposeScreen"})
/* loaded from: classes15.dex */
public final class BlacklistActivity extends com.avito.android.ui.activity.a implements N, InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f186328m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public C47743i f186329n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final O0 f186330o = new O0(m0.f406844a.b(C47733d.class), new d(), new c(new a()), new e());

    /* compiled from: BlacklistActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/avito/messenger/d;", "kotlin.jvm.PlatformType", "invoke", "()Lru/avito/messenger/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<C47733d> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C47733d invoke() {
            C47743i c47743i = BlacklistActivity.this.f186329n;
            if (c47743i == null) {
                c47743i = null;
            }
            return (C47733d) c47743i.get();
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "ru/avito/messenger/e", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC23040h0 {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                BlacklistActivity.this.finish();
            }
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f186333l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f186333l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f186333l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return BlacklistActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return BlacklistActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // com.avito.android.messenger.blacklist.mvi.N
    public final void D0() {
        InterfaceC19542a interfaceC19542a = this.f186328m;
        if (interfaceC19542a == null) {
            interfaceC19542a = null;
        }
        startActivityForResult(interfaceC19542a.a(AuthSource.f92716n), 0);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.messenger.blacklist.mvi.di.n.a().a((com.avito.android.messenger.blacklist.mvi.di.b) C29972i.a(C29972i.b(this), com.avito.android.messenger.blacklist.mvi.di.b.class)).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 0) {
            if (i13 != -1) {
                finish();
                return;
            }
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            BlacklistFragment.f186336w0.getClass();
            hE2.n(R.id.fragment_container, new BlacklistFragment(), "BlacklistFragment");
            hE2.f();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_DesignSystem_Re23);
        if (bundle == null) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            BlacklistFragment.f186336w0.getClass();
            hE2.n(R.id.fragment_container, new BlacklistFragment(), "BlacklistFragment");
            hE2.f();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        C47733d c47733d = (C47733d) this.f186330o.getValue();
        c47733d.f430743J.observe(this, new b());
    }
}
