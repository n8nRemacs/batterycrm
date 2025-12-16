package com.avito.android.snippet.video;

import Gk.InterfaceC13891a;
import android.view.View;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.util.R0;
import com.avito.android.video_snippets.g;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import mc.C44049b;

/* compiled from: SnippetVideoController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/snippet/video/m;", "LGk/a;", "_avito_snippet_video_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements InterfaceC13891a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.video_snippets.g f284017a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final View f284018b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f284019c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f284020d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43238h f284021e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N0 f284022f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f284023g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f284024h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Class<Object> f284025i = m.class;

    /* compiled from: SnippetVideoController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.snippet.video.SnippetVideoController$updateVideoSnippets$1", f = "SnippetVideoController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return m.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            m mVar = m.this;
            mVar.f284017a.e(mVar.f284024h, C44049b.a(VideoEventFromPage.f90107c), mVar.f284018b);
            return G0.f406611a;
        }
    }

    public m(@Y61.k R0 r02, @Y61.k com.avito.android.video_snippets.g gVar, @Y61.l View view, @Y61.k com.avito.android.player_holder.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f284017a = gVar;
        this.f284018b = view;
        this.f284019c = aVar;
        this.f284020d = interfaceC28373a;
        this.f284021e = U.a(r02.b().plus(t1.b()));
    }

    @Override // Gk.InterfaceC13892b
    public final boolean a(@Y61.k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof p;
    }

    @Override // Gk.InterfaceC13892b
    public final void c(int i12, @Y61.k b.InterfaceC10495b interfaceC10495b) {
        p pVar = interfaceC10495b instanceof p ? (p) interfaceC10495b : null;
        if (pVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f284023g;
        String str = pVar.f284031d;
        g.c cVarA = (g.c) linkedHashMap.get(str);
        if (cVarA == null) {
            return;
        }
        if (cVarA.f326089c != i12) {
            cVarA = g.c.a(cVarA, i12);
            linkedHashMap.put(str, g.c.a(cVarA, i12));
        }
        this.f284024h.put(str, cVarA);
        i();
    }

    @Override // Gk.InterfaceC13892b
    @Y61.k
    public final Class<Object> d() {
        return this.f284025i;
    }

    @Override // Gk.InterfaceC13891a
    public final void e(@Y61.k b.InterfaceC10495b interfaceC10495b) {
        p pVar = interfaceC10495b instanceof p ? (p) interfaceC10495b : null;
        if (pVar == null || ((g.c) this.f284024h.remove(pVar.f284031d)) == null) {
            return;
        }
        i();
    }

    @Override // Gk.InterfaceC13892b
    public final float f() {
        return 0.2f;
    }

    @Override // Gk.InterfaceC13892b
    public final long h() {
        return 1000L;
    }

    public final void i() {
        N0 n02 = this.f284022f;
        if (n02 == null || !((AbstractC43075a) n02).isActive()) {
            this.f284022f = C43259k.d(this.f284021e, null, null, new a(null), 3);
        }
    }
}
