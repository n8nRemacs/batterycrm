package androidx.credentials;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GetCredentialRequest.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/K;", "", "a", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f45175f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<AbstractC22874x> f45176a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f45177b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45178c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ComponentName f45179d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45180e;

    /* compiled from: GetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/K$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public a() {
            new ArrayList();
        }
    }

    /* compiled from: GetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/credentials/K$b;", "", "<init>", "()V", "", "BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", "Ljava/lang/String;", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @X41.j
    public K() {
        throw null;
    }

    public K(List list, String str, boolean z12, ComponentName componentName, boolean z13, int i12, C42822w c42822w) {
        str = (i12 & 2) != 0 ? null : str;
        z12 = (i12 & 4) != 0 ? false : z12;
        componentName = (i12 & 8) != 0 ? null : componentName;
        z13 = (i12 & 16) != 0 ? false : z13;
        this.f45176a = list;
        this.f45177b = str;
        this.f45178c = z12;
        this.f45179d = componentName;
        this.f45180e = z13;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
    }
}
