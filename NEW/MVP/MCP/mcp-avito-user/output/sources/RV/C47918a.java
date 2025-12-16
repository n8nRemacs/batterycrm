package rv;

import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActivityResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrv/a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47918a {

    /* renamed from: a, reason: collision with root package name */
    public final int f437155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f437156b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Intent f437157c;

    public C47918a(int i12, int i13, @l Intent intent) {
        this.f437155a = i12;
        this.f437156b = i13;
        this.f437157c = intent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47918a)) {
            return false;
        }
        C47918a c47918a = (C47918a) obj;
        return this.f437155a == c47918a.f437155a && this.f437156b == c47918a.f437156b && L.f(this.f437157c, c47918a.f437157c);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f437156b, Integer.hashCode(this.f437155a) * 31, 31);
        Intent intent = this.f437157c;
        return iE2 + (intent == null ? 0 : intent.hashCode());
    }

    @k
    public final String toString() {
        return "ActivityResult(requestCode=" + this.f437155a + ", resultCode=" + this.f437156b + ", data=" + this.f437157c + ')';
    }
}
