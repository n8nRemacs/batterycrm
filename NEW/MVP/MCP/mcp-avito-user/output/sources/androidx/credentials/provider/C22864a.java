package androidx.credentials.provider;

import android.app.PendingIntent;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Action.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/a;", "", "a", "b", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.credentials.provider.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22864a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final c f45241d = new c(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f45242a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PendingIntent f45243b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final CharSequence f45244c;

    /* compiled from: Action.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/a$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.credentials.provider.a$a, reason: collision with other inner class name */
    public static final class C1764a {
        static {
            new C1764a();
        }
    }

    /* compiled from: Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/a$b;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.a$b */
    public static final class b {
    }

    /* compiled from: Action.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/credentials/provider/a$c;", "", "<init>", "()V", "", "SLICE_HINT_PENDING_INTENT", "Ljava/lang/String;", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "", "SLICE_SPEC_REVISION", "I", "SLICE_SPEC_TYPE", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.a$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public C22864a(@Y61.k CharSequence charSequence, @Y61.k PendingIntent pendingIntent, @Y61.l CharSequence charSequence2) {
        this.f45242a = charSequence;
        this.f45243b = pendingIntent;
        this.f45244c = charSequence2;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    public /* synthetic */ C22864a(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, int i12, C42822w c42822w) {
        this(charSequence, pendingIntent, (i12 & 4) != 0 ? null : charSequence2);
    }
}
