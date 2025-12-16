package r60;

import AK0.l;
import Y61.k;
import com.avito.android.account.E;
import com.avito.android.util.J;
import com.squareup.anvil.annotations.ContributesBinding;
import java.security.MessageDigest;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;

/* compiled from: MergeKeyStorage.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr60/e;", "Lr60/d;", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f429624a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f429625b;

    @Inject
    public e(@k l lVar, @k E e12) {
        this.f429624a = lVar;
        this.f429625b = e12;
    }

    @Override // r60.d
    public final void a(@k String str) {
        this.f429624a.putString("passport_merge_key", str);
    }

    @Override // r60.d
    public final void delete() {
        this.f429624a.remove("passport_merge_key");
    }

    @Override // r60.d
    @Y61.l
    public final String get() {
        if (!this.f429625b.b()) {
            return this.f429624a.getString("passport_merge_key");
        }
        delete();
        return null;
    }

    @Override // r60.d
    @Y61.l
    public final String getHash() {
        String str = get();
        if (str != null) {
            return J.a(MessageDigest.getInstance("SHA-256").digest(str.getBytes(C43047d.f410589b)));
        }
        return null;
    }
}
