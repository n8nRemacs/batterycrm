package com.avito.android.lib.compose.design.shared.animation_view;

import Y41.l;
import android.content.Context;
import android.widget.ImageView;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AnimationView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/animation/AnimationView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class d extends N implements l<Context, AnimationView> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ImageView.ScaleType f177601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177602m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177603n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177604o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ImageView.ScaleType scaleType, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, InterfaceC22204y1 interfaceC22204y13) {
        super(1);
        this.f177601l = scaleType;
        this.f177602m = interfaceC22204y1;
        this.f177603n = interfaceC22204y12;
        this.f177604o = interfaceC22204y13;
    }

    @Override // Y41.l
    public final AnimationView invoke(Context context) {
        AnimationView animationView = new AnimationView(context, null, 0, 0, 14, null);
        animationView.setAutoPlay(false);
        animationView.setRepeatCount(-1);
        animationView.setSpeed(1.0f);
        animationView.setScaleType(this.f177601l);
        animationView.setAnimationStateListener(new a(this.f177602m));
        animationView.setAnimationProgressListener(new b(this.f177603n));
        animationView.setLoadingStateListener(new c(this.f177604o));
        return animationView;
    }
}
