package r31;

import Y41.l;
import android.content.Intent;
import android.net.Uri;
import kotlin.G0;
import kotlin.jvm.internal.N;
import sberid.sdk.auth.view.activity.WebViewActivity;

/* loaded from: classes8.dex */
public final class d extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f429571l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WebViewActivity webViewActivity) {
        super(1);
        this.f429571l = webViewActivity;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        this.f429571l.startActivity(new Intent("android.intent.action.VIEW", (Uri) obj));
        return G0.f406611a;
    }
}
