package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CredentialOption.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/x;", "", "a", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22874x {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f45331g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f45332a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bundle f45333b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Bundle f45334c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45335d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45336e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Set<ComponentName> f45337f;

    /* compiled from: CredentialOption.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/credentials/x$a;", "", "<init>", "()V", "", "BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", "Ljava/lang/String;", "BUNDLE_KEY_TYPE_PRIORITY_VALUE", "", "PRIORITY_DEFAULT", "I", "PRIORITY_OIDC_OR_SIMILAR", "PRIORITY_PASSKEY_OR_SIMILAR", "PRIORITY_PASSWORD_OR_SIMILAR", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.x$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CredentialOption.kt */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/x$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @P41.d
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    @RestrictTo
    /* renamed from: androidx.credentials.x$b */
    public @interface b {
    }

    public AbstractC22874x(int i12, @Y61.k Bundle bundle, @Y61.k Bundle bundle2, @Y61.k String str, @Y61.k Set set, boolean z12, boolean z13) {
        this.f45332a = str;
        this.f45333b = bundle;
        this.f45334c = bundle2;
        this.f45335d = z12;
        this.f45336e = z13;
        this.f45337f = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z13);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z13);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i12);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i12);
    }
}
