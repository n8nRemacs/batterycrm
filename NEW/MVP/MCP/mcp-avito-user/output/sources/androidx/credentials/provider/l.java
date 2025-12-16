package androidx.credentials.provider;

import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeginGetPasswordOption.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/l;", "Landroidx/credentials/provider/h;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l extends h {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f45265f = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<String> f45266e;

    /* compiled from: BeginGetPasswordOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/l$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k Set<String> set, @Y61.k Bundle bundle, @Y61.k String str) {
        super(str, "android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.f45266e = set;
    }
}
