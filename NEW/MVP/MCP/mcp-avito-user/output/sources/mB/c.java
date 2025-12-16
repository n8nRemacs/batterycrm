package Mb;

import Y61.k;
import com.avito.android.ai_assistant.AiAssistantFragmentData;
import com.avito.android.ai_assistant.AssistantChatArguments;
import com.avito.android.ai_assistant.screens.AiAssistantHostFragment;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final Class<?> a() {
        return AiAssistantFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final TabBaseFragment b(@k TabFragmentFactory.Data data) {
        AssistantChatArguments assistantChatArguments = ((AiAssistantFragmentData) data).f88713d;
        AiAssistantHostFragment.f89138w0.getClass();
        return AiAssistantHostFragment.a.a(assistantChatArguments);
    }
}
