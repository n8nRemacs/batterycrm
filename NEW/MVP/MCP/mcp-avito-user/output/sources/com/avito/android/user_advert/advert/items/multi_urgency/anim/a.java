package com.avito.android.user_advert.advert.items.multi_urgency.anim;

import Y41.l;
import Y61.k;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiUrgencyAnimationDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/anim/a;", "Lcom/avito/android/user_advert/advert/items/multi_urgency/anim/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a implements com.avito.android.user_advert.advert.items.multi_urgency.anim.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View[] f309626a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<View, G0> f309627b = new C9494a();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AnimatorSet f309628c;

    /* compiled from: MultiUrgencyAnimationDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.items.multi_urgency.anim.a$a, reason: collision with other inner class name */
    public static final class C9494a extends N implements l<View, G0> {
        public C9494a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            AnimatorSet animatorSet = a.this.f309628c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            return G0.f406611a;
        }
    }

    public a(@k View... viewArr) {
        this.f309626a = viewArr;
    }

    @k
    public abstract ObjectAnimator b(@k View view);

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.anim.b
    public void start() {
        AnimatorSet animatorSet = this.f309628c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        View[] viewArr = this.f309626a;
        ArrayList arrayList = new ArrayList(viewArr.length);
        for (View view : viewArr) {
            arrayList.add(b(view));
        }
        animatorSet2.playTogether(arrayList);
        animatorSet2.start();
        this.f309628c = animatorSet2;
        View view2 = viewArr[0];
        l<View, G0> lVar = this.f309627b;
        if (view2.isAttachedToWindow()) {
            view2.addOnAttachStateChangeListener(new b(view2, lVar));
        } else {
            ((C9494a) lVar).invoke(view2);
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/s0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f309630b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f309631c;

        public b(View view, l lVar) {
            this.f309630b = view;
            this.f309631c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.f309630b.removeOnAttachStateChangeListener(this);
            this.f309631c.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
