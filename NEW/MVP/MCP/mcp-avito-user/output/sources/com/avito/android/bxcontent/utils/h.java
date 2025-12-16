package com.avito.android.bxcontent.utils;

import Y61.k;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentViewClipper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/utils/h;", "Lcom/avito/android/bxcontent/utils/g;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FrameLayout f113039b;

    /* compiled from: BxContentViewClipper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/utils/h$a;", "Landroid/view/ViewOutlineProvider;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {

        /* renamed from: c, reason: collision with root package name */
        public static final int f113040c;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f113041a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f113042b = true;

        /* compiled from: BxContentViewClipper.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/utils/h$a$a;", "", "<init>", "()V", "", "CORNER_RADIUS", "I", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.bxcontent.utils.h$a$a, reason: collision with other inner class name */
        public static final class C3316a {
            public /* synthetic */ C3316a(C42822w c42822w) {
                this();
            }

            public C3316a() {
            }
        }

        static {
            new C3316a(null);
            f113040c = y6.b(20);
        }

        public a(@k View view) {
            this.f113041a = view;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@k View view, @k Outline outline) {
            if (view.getTop() <= 0) {
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            }
            boolean z12 = this.f113042b;
            View view2 = this.f113041a;
            if (!z12) {
                outline.setRect(0, view.getPaddingTop() + view2.getPaddingTop(), view.getWidth(), view.getHeight());
                return;
            }
            int paddingTop = view.getPaddingTop() + view2.getPaddingTop();
            int width = view.getWidth();
            int height = view.getHeight();
            int i12 = f113040c;
            outline.setRoundRect(0, paddingTop, width, height + i12, i12);
        }
    }

    public h(@k FrameLayout frameLayout) {
        this.f113039b = frameLayout;
    }

    public final void a(@k View view) {
        FrameLayout frameLayout = this.f113039b;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new a(view));
    }

    public final void b() {
        this.f113039b.invalidateOutline();
    }

    public final void c(boolean z12) {
        ViewOutlineProvider outlineProvider = this.f113039b.getOutlineProvider();
        a aVar = outlineProvider instanceof a ? (a) outlineProvider : null;
        if (aVar == null) {
            return;
        }
        aVar.f113042b = z12;
    }
}
