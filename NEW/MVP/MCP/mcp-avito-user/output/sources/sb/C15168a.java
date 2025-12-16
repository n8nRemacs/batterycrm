package Sb;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.ai_assistant.AiAssistantActivity;
import com.avito.android.ai_assistant.AiAssistantFragmentData;
import com.avito.android.ai_assistant.AssistantChatArguments;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AiAssistantIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSb/a;", "LIb/c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15168a implements Ib.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f15090a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final L f15091b;

    @Inject
    public C15168a(@k Application application, @k L l12) {
        this.f15090a = application;
        this.f15091b = l12;
    }

    @Override // Ib.c
    @k
    public final Intent a(@l NavigationTabSetItem navigationTabSetItem, @k String str) {
        if (navigationTabSetItem != null) {
            return this.f15091b.d(new AiAssistantFragmentData(navigationTabSetItem, null, new AssistantChatArguments(str, null, false, 6, null), 2, null));
        }
        new AiAssistantActivity.a();
        Intent intent = new Intent(this.f15090a, (Class<?>) AiAssistantActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("assistant_context", str);
        return intent;
    }
}
