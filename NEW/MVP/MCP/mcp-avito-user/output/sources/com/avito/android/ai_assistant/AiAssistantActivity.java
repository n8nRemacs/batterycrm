package com.avito.android.ai_assistant;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.ai_assistant.screens.AiAssistantHostFragment;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/AiAssistantActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AiAssistantActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: AiAssistantActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/AiAssistantActivity$a;", "", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.ai_assistant_overlay_fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @SuppressLint({"CommitTransaction", "HardcodeStringDetector"})
    public final void a2() {
        String stringExtra = getIntent().getStringExtra("assistant_context");
        if (stringExtra == null) {
            throw new IllegalArgumentException("context should be provided");
        }
        AiAssistantHostFragment.a aVar = AiAssistantHostFragment.f89138w0;
        AssistantChatArguments assistantChatArguments = new AssistantChatArguments(stringExtra, null, false, 6, null);
        aVar.getClass();
        AiAssistantHostFragment aiAssistantHostFragmentA = AiAssistantHostFragment.a.a(assistantChatArguments);
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, aiAssistantHostFragmentA, null);
        hE2.h();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a2();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a2();
    }
}
