package androidx.credentials.exceptions;

import X41.j;
import Y61.k;
import Y61.l;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClearCredentialException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ClearCredentialException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f45203b;

    public /* synthetic */ ClearCredentialException(String str, CharSequence charSequence, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : charSequence);
    }

    @k
    @RestrictTo
    /* renamed from: a, reason: from getter */
    public String getF45203b() {
        return this.f45203b;
    }

    @j
    public ClearCredentialException(@k String str, @l CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        this.f45203b = str;
    }
}
