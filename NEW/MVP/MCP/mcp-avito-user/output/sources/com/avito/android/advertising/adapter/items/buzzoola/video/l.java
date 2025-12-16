package com.avito.android.advertising.adapter.items.buzzoola.video;

import Db.InterfaceC13381a;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.advertising.di.s;
import com.avito.android.advertising.di.v;
import com.avito.android.util.Kundle;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ob.InterfaceC44739c;

/* compiled from: CommercialVideoPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/l;", "Lcom/avito/android/advertising/adapter/items/buzzoola/video/j;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44739c> f87572b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87573c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f87574d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.ui.i f87575e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.video_snippets.g f87576f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.j f87577g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final g f87578h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87579i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87580j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final h31.e<y.a> f87581k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advertising.ui.buzzoola.i f87582l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final CommercialVideoStates f87583m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public WeakReference<StyledPlayerView> f87584n;

    /* compiled from: CommercialVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advertising/adapter/items/buzzoola/video/l$a", "Landroidx/lifecycle/L;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22979L {

        /* compiled from: CommercialVideoPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advertising.adapter.items.buzzoola.video.l$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2603a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f87586a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f87586a = iArr;
            }
        }

        public a() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.Event event) {
            d0 player;
            d0 player2;
            StyledPlayerView styledPlayerView;
            d0 player3;
            int i12 = C2603a.f87586a[event.ordinal()];
            l lVar = l.this;
            if (i12 != 1) {
                if (i12 != 2 || (styledPlayerView = lVar.f87584n.get()) == null || (player3 = styledPlayerView.getPlayer()) == null || player3.getPlayWhenReady()) {
                    return;
                }
                StyledPlayerView styledPlayerView2 = lVar.f87584n.get();
                player2 = styledPlayerView2 != null ? styledPlayerView2.getPlayer() : null;
                if (player2 == null) {
                    return;
                }
                player2.setPlayWhenReady(true);
                return;
            }
            StyledPlayerView styledPlayerView3 = lVar.f87584n.get();
            if (styledPlayerView3 == null || (player = styledPlayerView3.getPlayer()) == null || !player.getPlayWhenReady()) {
                return;
            }
            StyledPlayerView styledPlayerView4 = lVar.f87584n.get();
            player2 = styledPlayerView4 != null ? styledPlayerView4.getPlayer() : null;
            if (player2 == null) {
                return;
            }
            player2.setPlayWhenReady(false);
        }
    }

    @Inject
    public l(@Y61.k h31.e<InterfaceC44739c> eVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @v @Y61.l Kundle kundle, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advertising.ui.i iVar, @Y61.k com.avito.android.video_snippets.g gVar, @Y61.k com.avito.android.advertising.loaders.j jVar, @Y61.k g gVar2, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar2, @Y61.k InterfaceC13381a interfaceC13381a, @s @Y61.k h31.e<y.a> eVar2, @Y61.k InterfaceC22983P interfaceC22983P) {
        CommercialVideoStates commercialVideoStates;
        this.f87572b = eVar;
        this.f87573c = cVar;
        this.f87574d = aVar;
        this.f87575e = iVar;
        this.f87576f = gVar;
        this.f87577g = jVar;
        this.f87578h = gVar2;
        this.f87579i = cVar2;
        this.f87580j = interfaceC13381a;
        this.f87581k = eVar2;
        this.f87583m = (kundle == null || (commercialVideoStates = (CommercialVideoStates) kundle.d("buzzoola_video_state")) == null) ? new CommercialVideoStates(null, 1, null) : commercialVideoStates;
        this.f87584n = new WeakReference<>(null);
        interfaceC22983P.getLifecycle().a(new a());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v6 ??, still in use, count: 1, list:
          (r7v6 ?? I:java.lang.Object) from 0x0069: INVOKE (r6v5 ?? I:java.util.Map), (r5v11 ?? I:java.lang.Object), (r7v6 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:106)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // TV0.d
    public final void O5(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v6 ??, still in use, count: 1, list:
          (r7v6 ?? I:java.lang.Object) from 0x0069: INVOKE (r6v5 ?? I:java.util.Map), (r5v11 ?? I:java.lang.Object), (r7v6 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:106)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    @Override // com.avito.android.advertising.adapter.items.buzzoola.premium.q
    public final void P6(@Y61.k Kundle kundle) {
        kundle.j(this.f87583m, "buzzoola_video_state");
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.video.j
    @Y61.k
    /* renamed from: e7, reason: from getter */
    public final CommercialVideoStates getF87583m() {
        return this.f87583m;
    }
}
