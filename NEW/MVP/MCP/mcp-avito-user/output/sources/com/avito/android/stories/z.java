package com.avito.android.stories;

import Fx0.InterfaceC13851a;
import android.graphics.Outline;
import android.graphics.Rect;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceResponse;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.os.C22777e;
import com.avito.android.R;
import com.avito.android.deeplink_handler.NavigationSource;
import com.avito.android.remote.error.ApiError;
import com.avito.android.stories.mvi.entity.LoadState;
import com.avito.android.stories.mvi.entity.StoriesState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: StoriesView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/stories/z;", "Lcom/avito/android/stories/x;", "a", "b", "c", "d", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z implements x {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f285360b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f285361c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f285362d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PowerWebView f285363e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f285364f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.view.d f285365g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f285366h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final e2 f285367i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final c f285368j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final FrameLayout.LayoutParams f285369k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final e2 f285370l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m f285371m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public LoadState f285372n;

    /* compiled from: StoriesView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/z$a;", "Lcom/yatatsu/powerwebview/b;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements com.yatatsu.powerwebview.b {
        public a() {
        }

        @Override // com.yatatsu.powerwebview.b
        public final void a(@Y61.k WebResourceResponse webResourceResponse) {
            z.this.f285370l.K5(new P2.a(new ApiError.NetworkIOError(String.valueOf(webResourceResponse.getStatusCode()))));
        }

        @Override // com.yatatsu.powerwebview.b
        public final void b(@Y61.k String str) {
            z.this.f285370l.K5(new P2.a(new ApiError.NetworkIOError(str)));
        }
    }

    /* compiled from: StoriesView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/stories/z$b;", "Lcom/avito/android/stories/o;", "", "id", "Lkotlin/G0;", "storyViewed", "(I)V", "", "arg", "viewReady", "(Z)V", "closeView", "selectedPage", "triggerUxFeedback", "fullStoryViewed", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b implements o {
        public b() {
        }

        @Override // com.avito.android.stories.o
        @JavascriptInterface
        public void closeView(boolean arg) {
            z.this.f285367i.K5(InterfaceC13851a.e.f6071a);
        }

        @Override // com.avito.android.stories.o
        @JavascriptInterface
        public void fullStoryViewed(int id2) {
            z.this.f285367i.K5(new InterfaceC13851a.b(String.valueOf(id2)));
        }

        @Override // com.avito.android.stories.o
        @JavascriptInterface
        public void selectedPage(int id2) {
            z.this.f285367i.K5(new InterfaceC13851a.j(String.valueOf(id2)));
        }

        @Override // com.avito.android.stories.o
        @JavascriptInterface
        public void storyViewed(int id2) {
            z.this.f285367i.K5(new InterfaceC13851a.k(String.valueOf(id2)));
        }

        @Override // com.avito.android.stories.o
        @JavascriptInterface
        public void triggerUxFeedback(boolean arg) {
            z.this.f285367i.K5(new InterfaceC13851a.l(arg));
        }

        @Override // com.avito.android.stories.o
        @JavascriptInterface
        public void viewReady(boolean arg) {
            z.this.f285367i.K5(InterfaceC13851a.m.f6079a);
        }
    }

    /* compiled from: StoriesView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/z$c;", "Lcom/yatatsu/powerwebview/d;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c implements com.yatatsu.powerwebview.d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public String f285375a;

        public c() {
        }

        @Override // com.yatatsu.powerwebview.d
        public final boolean b(boolean z12, @Y61.k Uri uri) {
            if (L.f(uri.toString(), this.f285375a)) {
                return false;
            }
            e2 e2Var = z.this.f285367i;
            NavigationSource[] navigationSourceArr = NavigationSource.f134362b;
            e2Var.K5(new InterfaceC13851a.d(uri, C22777e.b(new Q("DeepLinkNavigationSource", "Stories"))));
            return true;
        }
    }

    /* compiled from: StoriesView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/z$d;", "Landroid/view/ViewOutlineProvider;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public int f285377a;

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@Y61.k View view, @Y61.k Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f285377a);
        }
    }

    /* compiled from: StoriesView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e {
        static {
            int[] iArr = new int[LoadState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LoadState loadState = LoadState.f285239b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr2[3] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public z(@Y61.k View view) {
        this.f285360b = view;
        View viewFindViewById = view.findViewById(R.id.stories_screen_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f285361c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f285362d = viewFindViewById2;
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.web_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yatatsu.powerwebview.PowerWebView");
        }
        PowerWebView powerWebView = (PowerWebView) viewFindViewById3;
        this.f285363e = powerWebView;
        View viewFindViewById4 = view.findViewById(R.id.close);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f285364f = imageView;
        com.avito.android.ui.view.d dVar = new com.avito.android.ui.view.d(powerWebView);
        this.f285365g = dVar;
        View viewFindViewById5 = view.findViewById(R.id.loading);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f285366h = viewFindViewById5;
        this.f285367i = f2.b(0, 1, BufferOverflow.f410778c, 1);
        c cVar = new c();
        this.f285368j = cVar;
        b bVar = new b();
        this.f285369k = (FrameLayout.LayoutParams) viewFindViewById2.getLayoutParams();
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f285370l = e2VarB;
        this.f285371m = C43175k.N(new B(new A(kotlinx.coroutines.rx3.y.a(dVar.f304688b))), e2VarB);
        powerWebView.getSettings().setTextZoom(100);
        powerWebView.setBackgroundColor(C35835l0.d(R.attr.transparentBlack, view.getContext()));
        powerWebView.setLayerType(2, null);
        powerWebView.setHorizontalScrollBarEnabled(false);
        powerWebView.setVerticalScrollBarEnabled(false);
        viewFindViewById2.setClipToOutline(true);
        d dVar2 = new d();
        dVar2.f285377a = D6.j(view, 15);
        viewFindViewById2.setOutlineProvider(dVar2);
        powerWebView.setHttpErrorHandlerDelegate(new a());
        dVar.a(cVar);
        dVar.b(bVar, "StoriesInterface");
        final l0.f fVar = new l0.f();
        final l0.f fVar2 = new l0.f();
        final l0.a aVar = new l0.a();
        powerWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.avito.android.stories.y
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                Rect rect = new Rect();
                z zVar = this.f285356b;
                View view3 = zVar.f285360b;
                view3.getWindowVisibleDisplayFrame(rect);
                if (view3.getContext().getResources().getDisplayMetrics().heightPixels - rect.bottom > 0) {
                    return false;
                }
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int action = motionEvent.getAction();
                l0.f fVar3 = fVar;
                l0.f fVar4 = fVar2;
                FrameLayout.LayoutParams layoutParams = zVar.f285369k;
                if (action == 0) {
                    fVar3.f406840b = rawY - layoutParams.topMargin;
                    fVar4.f406840b = rawX - layoutParams.leftMargin;
                    return false;
                }
                l0.a aVar2 = aVar;
                if (action == 1) {
                    if (!aVar2.f406838b) {
                        return false;
                    }
                    zVar.f285367i.K5(InterfaceC13851a.i.f6075a);
                    return false;
                }
                if (action != 2) {
                    return false;
                }
                int iAbs = Math.abs(rawX - fVar4.f406840b);
                int i12 = rawY - fVar3.f406840b;
                if (iAbs >= 100 || i12 >= zVar.f285363e.getHeight() / 3 || i12 <= 100) {
                    return false;
                }
                layoutParams.topMargin = i12;
                layoutParams.bottomMargin = -i12;
                zVar.f285362d.setLayoutParams(layoutParams);
                aVar2.f406838b = true;
                return false;
            }
        });
        imageView.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 7));
    }

    @Override // com.avito.android.stories.x
    @Y61.k
    public final InterfaceC43160i<InterfaceC13851a> U5() {
        return this.f285367i;
    }

    @Override // com.avito.android.stories.x
    public final void c7(int i12) {
        this.f285361c.setBackgroundColor(i12);
    }

    @Override // qK0.d
    public final void destroy() {
        com.avito.android.ui.view.d dVar = this.f285365g;
        dVar.e("StoriesInterface");
        dVar.f304687a.f392926d.remove(this.f285368j);
        this.f285363e.destroy();
    }

    @Override // com.avito.android.stories.x
    public final void g(@Y61.k StoriesState storiesState) {
        LoadState loadState = this.f285372n;
        LoadState loadState2 = storiesState.f285270i;
        if (new com.avito.android.lib.util.c(loadState2, loadState).f181333c || loadState2 == null) {
            return;
        }
        this.f285372n = loadState2;
        int iOrdinal = loadState2.ordinal();
        ImageView imageView = this.f285364f;
        View view = this.f285366h;
        PowerWebView powerWebView = this.f285363e;
        if (iOrdinal == 0) {
            D6.g(powerWebView);
            D6.H(view);
            D6.H(imageView);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            D6.w(view);
            D6.w(imageView);
            D6.H(powerWebView);
            powerWebView.setAlpha(0.0f);
            powerWebView.animate().setDuration(250L).alpha(1.0f).start();
        }
    }

    @Override // com.avito.android.stories.x
    public final void m(@Y61.k String str, @Y61.k Map<String, String> map) {
        this.f285368j.f285375a = str;
        this.f285365g.f304687a.loadUrl(str, map);
    }

    @Override // com.avito.android.stories.x
    public final void onPause() {
        this.f285363e.onPause();
    }

    @Override // com.avito.android.stories.x
    public final void onResume() {
        this.f285363e.onResume();
    }

    @Override // com.avito.android.stories.x
    public final void p() {
        View view = this.f285362d;
        view.setTranslationY(view.getResources().getDisplayMetrics().heightPixels);
        view.animate().translationY(0.0f).setInterpolator(new DecelerateInterpolator()).setDuration(350L).start();
    }

    @Override // com.avito.android.stories.x
    @Y61.k
    /* renamed from: q, reason: from getter */
    public final kotlinx.coroutines.flow.internal.m getF285371m() {
        return this.f285371m;
    }
}
