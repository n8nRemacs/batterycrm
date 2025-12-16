package ru.ok.android.sdk;

import android.content.Intent;
import com.avito.android.social.C35031x;
import com.avito.android.social.SocialActivity;
import kotlin.Metadata;
import ru.ok.android.sdk.util.OkAuthType;

/* compiled from: Odnoklassniki.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes9.dex */
final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35031x f436699b;

    public h(C35031x c35031x, String str) {
        this.f436699b = c35031x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35031x c35031x = this.f436699b;
        f fVar = c35031x.f284427a.f284430a;
        OkAuthType okAuthType = OkAuthType.f436708d;
        fVar.getClass();
        SocialActivity socialActivity = c35031x.f284429c;
        Intent intent = new Intent(socialActivity, (Class<?>) OkAuthActivity.class);
        intent.putExtra("client_id", fVar.f436694e);
        intent.putExtra("application_key", fVar.f436695f);
        intent.putExtra("redirect_uri", "okauth://auth");
        intent.putExtra("auth_type", okAuthType);
        intent.putExtra("scopes", new String[]{"GET_EMAIL"});
        socialActivity.startActivityForResult(intent, 22890);
    }
}
