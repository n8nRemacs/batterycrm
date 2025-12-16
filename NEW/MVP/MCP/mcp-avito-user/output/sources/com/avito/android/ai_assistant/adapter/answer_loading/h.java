package com.avito.android.ai_assistant.adapter.answer_loading;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AnswerLoadingItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/answer_loading/h;", "Lcom/avito/android/ai_assistant/adapter/answer_loading/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final AnimationView f88726b;

    public h(@k View view) {
        super(view);
        this.f88726b = (AnimationView) view.findViewById(R.id.loading_animation_view);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f88726b.c();
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        AnimationView animationView = this.f88726b;
        AnimationView.a.d dVar = com.avito.android.lib.util.darkTheme.c.a(animationView.getContext()) ? new AnimationView.a.d(R.raw.avi_write_black_anim, null, 2, null) : new AnimationView.a.d(R.raw.avi_write_white_anim, null, 2, null);
        D6.w(animationView);
        animationView.c();
        animationView.setRepeatMode(AnimationView.RepeatMode.f178282c);
        animationView.setRepeatCount(-1);
        animationView.setAnimationData(dVar);
        animationView.postDelayed(new g(this), 300L);
    }
}
