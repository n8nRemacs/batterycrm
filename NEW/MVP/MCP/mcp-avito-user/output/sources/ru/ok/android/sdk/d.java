package ru.ok.android.sdk;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: ContextOkListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/sdk/d;", "Lru/ok/android/sdk/n;", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f436684a;

    /* renamed from: b, reason: collision with root package name */
    public final Y41.p<Context, JSONObject, G0> f436685b;

    /* renamed from: c, reason: collision with root package name */
    public final Y41.p<Context, String, G0> f436686c;

    /* renamed from: d, reason: collision with root package name */
    public final Y41.p<Context, String, G0> f436687d;

    public d() {
        throw null;
    }

    public d(Context context, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, int i12, C42822w c42822w) {
        pVar = (i12 & 2) != 0 ? null : pVar;
        pVar2 = (i12 & 4) != 0 ? null : pVar2;
        pVar3 = (i12 & 8) != 0 ? null : pVar3;
        this.f436685b = pVar;
        this.f436686c = pVar2;
        this.f436687d = pVar3;
        this.f436684a = new WeakReference<>(context);
    }

    @Override // ru.ok.android.sdk.n
    public final void q(@Y61.l String str) {
        Y41.p<Context, String, G0> pVar;
        Context context = this.f436684a.get();
        if (context == null || (pVar = this.f436686c) == null) {
            return;
        }
        pVar.invoke(context, str);
    }
}
