package com.avito.android.beduin.v2.page.impl.deeplinks;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.beduin.v2.page.o;
import com.avito.android.deeplink_handler.view.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;

/* compiled from: BeduinV2PageBaseDeepLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/deeplinks/e;", "", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f105106a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f105107b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a.b f105108c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f105109d = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: BeduinV2PageBaseDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f105110b;

        public a(int i12) {
            this.f105110b = i12;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == this.f105110b;
        }
    }

    /* compiled from: BeduinV2PageBaseDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H f105112c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super m, G0> lVar) {
            this.f105112c = (H) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            e.this.getClass();
            Intent intent = c47918a.f437157c;
            Bundle extras = intent != null ? intent.getExtras() : null;
            int i12 = c47918a.f437156b;
            this.f105112c.invoke(i12 != -1 ? i12 != 0 ? new m.b(extras, null) : new m.a(extras, null) : new m.c(extras, null));
        }
    }

    @Inject
    public e(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k o oVar, @Y61.k a.b bVar) {
        this.f105106a = interfaceC4053a;
        this.f105107b = oVar;
        this.f105108c = bVar;
    }

    public final void a(int i12, @Y61.k Y41.l<? super m, G0> lVar) {
        this.f105109d.b(this.f105108c.Q().N(new a(i12)).t0(new b(lVar)));
    }
}
