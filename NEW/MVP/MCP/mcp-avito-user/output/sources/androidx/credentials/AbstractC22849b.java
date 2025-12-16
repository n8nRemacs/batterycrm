package androidx.credentials;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CreateCredentialRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/b;", "", "a", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22849b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f45193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bundle f45194b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Bundle f45195c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45196d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C1761b f45197e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f45198f;

    /* compiled from: CreateCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/credentials/b$a;", "", "<init>", "()V", "", "BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", "Ljava/lang/String;", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public AbstractC22849b(@Y61.k String str, @Y61.k Bundle bundle, @Y61.k Bundle bundle2, boolean z12, boolean z13, @Y61.k C1761b c1761b, @Y61.l String str2, boolean z14) {
        this.f45193a = str;
        this.f45194b = bundle;
        this.f45195c = bundle2;
        this.f45196d = z12;
        this.f45197e = c1761b;
        this.f45198f = str2;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z13);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z14);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z13);
    }

    /* compiled from: CreateCredentialRequest.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/b$b;", "", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.b$b, reason: collision with other inner class name */
    public static final class C1761b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CharSequence f45199a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final CharSequence f45200b;

        /* compiled from: CreateCredentialRequest.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/credentials/b$b$a;", "", "<init>", "()V", "", "BUNDLE_KEY_CREDENTIAL_TYPE_ICON", "Ljava/lang/String;", "BUNDLE_KEY_DEFAULT_PROVIDER", "BUNDLE_KEY_REQUEST_DISPLAY_INFO", "BUNDLE_KEY_USER_DISPLAY_NAME", "BUNDLE_KEY_USER_ID", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.credentials.b$b$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public C1761b(@Y61.k CharSequence charSequence, @Y61.l CharSequence charSequence2) {
            this.f45199a = charSequence;
            this.f45200b = charSequence2;
            if (charSequence.length() <= 0) {
                throw new IllegalArgumentException("userId should not be empty");
            }
        }

        public C1761b(CharSequence charSequence, CharSequence charSequence2, int i12, C42822w c42822w) {
            this(charSequence, (i12 & 2) != 0 ? null : charSequence2);
        }
    }
}
