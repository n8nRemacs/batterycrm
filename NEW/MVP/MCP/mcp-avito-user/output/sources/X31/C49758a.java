package x31;

import android.net.Uri;
import androidx.fragment.app.ActivityC22955m;
import d31.C39498d;
import java.net.SocketException;
import kotlin.G0;
import kotlin.jvm.internal.N;
import sberid.sdk.init.a;

/* renamed from: x31.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49758a extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0.h f442145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f442146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uri f442147n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49758a(g0.h hVar, String str, Uri uri) {
        super(0);
        this.f442145l = hVar;
        this.f442146m = str;
        this.f442147n = uri;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final Object invoke() throws SocketException {
        g0.h hVar = this.f442145l;
        ((C39498d) hVar.f396208f0.getValue()).a(this.f442146m);
        a.d dVar = a.d.f437775a;
        ActivityC22955m activityC22955mRequireActivity = hVar.requireActivity();
        Uri uri = this.f442147n;
        dVar.getClass();
        a.d.a(activityC22955mRequireActivity, uri);
        hVar.dismiss();
        return G0.f406611a;
    }
}
