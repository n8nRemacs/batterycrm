package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;

/* compiled from: GetPasswordOption.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/N;", "Landroidx/credentials/x;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N extends AbstractC22874x {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f45182i = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Set<String> f45183h;

    /* compiled from: GetPasswordOption.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/N$a;", "", "<init>", "()V", "", "BUNDLE_KEY_ALLOWED_USER_IDS", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @X41.j
    public N() {
        this(null, false, null, 7, null);
    }

    public /* synthetic */ N(Set set, boolean z12, Set set2, Bundle bundle, Bundle bundle2, int i12, C42822w c42822w) {
        this(set, z12, set2, bundle, bundle2, i12);
    }

    public /* synthetic */ N(Set set, boolean z12, Set set2, Bundle bundle, Bundle bundle2, int i12, int i13, C42822w c42822w) {
        this(set, z12, set2, bundle, bundle2, (i13 & 32) != 0 ? 1000 : i12);
    }

    public N(Set set, boolean z12, Set set2, int i12, C42822w c42822w) {
        Set set3 = (i12 & 1) != 0 ? B0.f406639b : set;
        boolean z13 = (i12 & 2) != 0 ? false : z12;
        set2 = (i12 & 4) != 0 ? B0.f406639b : set2;
        f45182i.getClass();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(set3));
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(set3));
        this(set3, z13, set2, bundle, bundle2, 0, 32, null);
    }

    public N(Set<String> set, boolean z12, Set<ComponentName> set2, Bundle bundle, Bundle bundle2, int i12) {
        super(i12, bundle, bundle2, "android.credentials.TYPE_PASSWORD_CREDENTIAL", set2, false, z12);
        this.f45183h = set;
    }
}
