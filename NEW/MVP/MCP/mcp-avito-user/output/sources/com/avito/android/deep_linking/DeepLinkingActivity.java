package com.avito.android.deep_linking;

import Fu.e;
import android.content.Intent;
import android.os.Bundle;
import androidx.view.InterfaceC23040h0;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.di.C29972i;
import iR.C41336a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import vz.InterfaceC49400a;

/* compiled from: DeepLinkingActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/DeepLinkingActivity;", "Landroidx/appcompat/app/m;", "Lcom/avito/android/analytics/screens/j$a;", "Lvz/f;", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeepLinkingActivity extends androidx.appcompat.app.m implements InterfaceC28477j.a, vz.f {

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public D f132814b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f132815c;

    /* compiled from: DeepLinkingActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<G0, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            DeepLinkingActivity.this.finish();
            return G0.f406611a;
        }
    }

    /* compiled from: DeepLinkingActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f132817b;

        public b(Y41.l lVar) {
            this.f132817b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f132817b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f132817b;
        }

        public final int hashCode() {
            return this.f132817b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f132817b.invoke(obj);
        }
    }

    @Override // vz.f
    @Y61.k
    public final InterfaceC49400a G0() {
        return InterfaceC49400a.b.f441062a;
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        com.avito.android.deeplink_handler.view.d dVar = this.f132815c;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(i12, i13, intent);
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C41336a.C11375a.b();
        ((e.b) C29972i.a(C29972i.b(this), e.b.class)).Ki().a(cv.c.c(this)).a(this);
        com.avito.android.deeplink_handler.view.d dVar = this.f132815c;
        if (dVar == null) {
            dVar = null;
        }
        d.a.a(dVar, this, null, null, 30);
        D d12 = this.f132814b;
        if (d12 == null) {
            d12 = null;
        }
        d12.Z0().observe(this, new b(new a()));
        D d13 = this.f132814b;
        (d13 != null ? d13 : null).E(getIntent().getData());
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        D d12 = this.f132814b;
        if (d12 == null) {
            d12 = null;
        }
        d12.stop();
    }
}
