package ru.tinkoff.core.tinkoffId;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.tinkoff.core.tinkoffId.ui.webView.TinkoffWebViewAuthActivity;

/* compiled from: TinkoffIdAuth.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "codeChallenge", "", "codeChallengeMethod", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
final class f extends N implements Y41.p<String, String, Intent> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f437033l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f437034m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Uri uri) {
        super(2);
        this.f437033l = gVar;
        this.f437034m = uri;
    }

    @Override // Y41.p
    public final Intent invoke(String str, String str2) {
        g gVar = this.f437033l;
        a aVar = gVar.f437040f;
        String string = this.f437034m.toString();
        aVar.getClass();
        return new Intent(gVar.f437037c, (Class<?>) TinkoffWebViewAuthActivity.class).putExtra("clientId", gVar.f437035a).putExtra("code_challenge", str).putExtra("code_challenge_method", str2).putExtra("redirect_uri", gVar.f437036b).putExtra("callback_url", string);
    }
}
