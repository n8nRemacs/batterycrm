package ru.ok.android.sdk;

import com.avito.android.social.C35031x;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Odnoklassniki.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes9.dex */
final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35031x f436700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f436701c;

    public i(C35031x c35031x, JSONObject jSONObject) {
        this.f436700b = c35031x;
        this.f436701c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        this.f436700b.a(this.f436701c);
    }
}
