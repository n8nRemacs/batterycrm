package androidx.credentials.provider;

import android.app.PendingIntent;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AuthenticationAction.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/b;", "", "a", "b", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.provider.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22865b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f45245c = new c(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f45246a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PendingIntent f45247b;

    /* compiled from: AuthenticationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/b$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.credentials.provider.b$a */
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: AuthenticationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/b$b;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.b$b, reason: collision with other inner class name */
    public static final class C1765b {
    }

    /* compiled from: AuthenticationAction.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/b$c;", "", "<init>", "()V", "", "SLICE_HINT_PENDING_INTENT", "Ljava/lang/String;", "SLICE_HINT_TITLE", "", "SLICE_SPEC_REVISION", "I", "SLICE_SPEC_TYPE", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.b$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public C22865b(@Y61.k CharSequence charSequence, @Y61.k PendingIntent pendingIntent) {
        this.f45246a = charSequence;
        this.f45247b = pendingIntent;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }
}
