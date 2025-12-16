package lp0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screen_flow.link.ScreenFlowLinkDeclaration;
import com.avito.android.screen_flow.link.ScreenFlowV2Link;
import kotlin.Metadata;

/* compiled from: ScreenFlowLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llp0/c;", "Llp0/a;", "Lcom/avito/android/screen_flow/link/ScreenFlowV2Link;", "<init>", "()V", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lp0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43815c extends AbstractC43813a<ScreenFlowV2Link> {
    @Override // lp0.AbstractC43813a
    public final ScreenFlowLinkDeclaration s(DeepLink deepLink, DeepLink deepLink2) {
        return new ScreenFlowV2Link(deepLink, deepLink2);
    }
}
