package IV0;

import Y61.k;
import android.app.Application;
import android.content.ClipboardManager;
import kotlin.Metadata;

/* compiled from: DefaultClipboardClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIV0/a;", "Lcom/avito/beduin/v2/interaction/copy/flow/a;", "copy-client_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.beduin.v2.interaction.copy.flow.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ClipboardManager f8183a;

    public a(@k Application application) {
        this.f8183a = (ClipboardManager) application.getSystemService("clipboard");
    }
}
